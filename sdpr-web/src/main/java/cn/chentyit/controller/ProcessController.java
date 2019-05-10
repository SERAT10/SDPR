package cn.chentyit.controller;

import cn.chentyit.common.SDPRValue;
import cn.chentyit.pojo.Scholar;
import cn.chentyit.pojo.Thesis;
import cn.chentyit.service.ScholarService;
import cn.chentyit.service.ThesisService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName
 * @Description 该类用于处理数据
 * @Author Chentyit
 * @Date 2019/4/10 14:36
 * @Version 1.0
 */
@Controller
@RequestMapping("/process")
public class ProcessController {

    @Resource
    private ThesisService thesisService;

    @Resource
    ScholarService scholarService;

    /**
     * @Description 根据标题查询论文
     * @param pageNum
     * @param search
     * @param model
     * @return
     */
    @RequestMapping("/select")
    public String selectTitleOfThesis(
            @RequestParam("pageNum") Integer pageNum,
            @RequestParam("search") String search,
            Model model
    ) {
        if (pageNum == null || pageNum <= 0) {
            pageNum = 1;
        }

        // 分页查询处理 (pageNum 当前页, pageSize 每页显示几条数据)
        PageHelper.startPage(pageNum, 3);

        PageInfo<Thesis> pageInfo = new PageInfo<>(thesisService.findThesisByTitle(search));
        model.addAttribute("thesisList", pageInfo.getList());
        model.addAttribute("count", pageInfo.getTotal());
        model.addAttribute("pageInfo", pageInfo);
        model.addAttribute("search", search);
        return "allThesisList";
    }

    /**
     * @Description 根据主题查询论文
     * @param pageNum
     * @param themeId
     * @param model
     * @return
     */
    @RequestMapping("/selectTheme")
    public String selectThemeOfThesis(
            @RequestParam("pageNum") Integer pageNum,
            @RequestParam("themeId") Integer themeId,
            Model model
    ) {
        if (pageNum == null || pageNum <= 0) {
            pageNum = 1;
        }

        // 分页查询处理 (pageNum 当前页, pageSize 每页显示几条数据)
        PageHelper.startPage(pageNum, 3);

        PageInfo<Thesis> pageInfo = new PageInfo<>(thesisService.findThesisByThemeId(themeId));
        model.addAttribute("thesisList", pageInfo.getList());
        model.addAttribute("count", pageInfo.getTotal());
        model.addAttribute("pageInfo", pageInfo);
        model.addAttribute("themeId", themeId);
        return "allThesisList";
    }

    /**
     * 查询某个期刊的所有论文
     * @param pageNum
     * @param journalName
     * @param model
     * @return
     */
    @RequestMapping("/selectJournal")
    public String selectThesisOfJournal(
            @RequestParam("pageNum") Integer pageNum,
            @RequestParam("journalName") String journalName,
            Model model
    ) {
        if (pageNum == null || pageNum <= 0) {
            pageNum = 1;
        }

        // 分页查询处理 (pageNum 当前页, pageSize 每页显示几条数据)
        PageHelper.startPage(pageNum, 3);

        PageInfo<Thesis> pageInfo = new PageInfo<>(thesisService.findThesisByJournal(journalName));
        model.addAttribute("thesisList", pageInfo.getList());
        model.addAttribute("count", pageInfo.getTotal());
        model.addAttribute("pageInfo", pageInfo);
        model.addAttribute("journalName", journalName);
        return "allThesisList";
    }

    /**
     * 查询某个会议的所有论文
     * @param pageNum
     * @param bookTitleName
     * @param model
     * @return
     */
    @RequestMapping("/selectBookTitle")
    public String selectThesisOfBookTitle(
            @RequestParam("pageNum") Integer pageNum,
            @RequestParam("bookTitleName") String bookTitleName,
            Model model
    ) {
        if (pageNum == null || pageNum <= 0) {
            pageNum = 1;
        }

        // 分页查询处理 (pageNum 当前页, pageSize 每页显示几条数据)
        PageHelper.startPage(pageNum, 3);

        PageInfo<Thesis> pageInfo = new PageInfo<>(thesisService.findThesisByBookTitle(bookTitleName));
        model.addAttribute("thesisList", pageInfo.getList());
        model.addAttribute("count", pageInfo.getTotal());
        model.addAttribute("pageInfo", pageInfo);
        model.addAttribute("bookTitleName", bookTitleName);
        return "allThesisList";
    }

    @RequestMapping("/calculateRank")
    public String calculateRank(Model model) {
        List<Scholar> scholars = scholarService.findAllScholar();
        Map<String, List<Thesis>> listMap = new HashMap<>(16);
        for (Scholar scholar : scholars) {
            List<Thesis> thesisList = new ArrayList<>(thesisService.findArticleByAuthorId(scholar.getScholarId()));
            listMap.put(scholar.getScholarName(), thesisList);
        }
        List<List<String>> datas = SDPRValue.findArticleCountOFPublisher(listMap);
        System.out.println(datas);
        model.addAttribute("datas", datas);
        return "scholarRank";
    }

    /**
     * 这里是用来处理作者姓氏的排序情况
     * @param model
     * @return
     */
    @RequestMapping("/sortLastName")
    public String sortLastName(Model model) {
        // 将查询出来的作者姓氏按字母存入 List 列表中（将所有复杂的数据处理全部交给 SDPRValue 处理后返回结果）
        Map<String, List<String>> lastNameMap = SDPRValue.lastNameSortByAlphabet(scholarService.findAllLastName());
        model.addAttribute("lastNameMap", lastNameMap);
        return "scholarInstitution";
    }

    /**
     * 用于处理期刊 会议 其他的分类
     * @param model
     * @return
     */
    @RequestMapping("/classifyPublication")
    public String classifyPublication(Model model) {
        // 获取期刊的集合
        List<String> journalList = new ArrayList<>(thesisService.findJournal());
        // 获取会议的集合
        List<String> conferenceList = new ArrayList<>(thesisService.findBookTitle());

        model.addAttribute("journalList", journalList);
        model.addAttribute("conferenceList", conferenceList);
        return "publicationVenue";
    }
}
