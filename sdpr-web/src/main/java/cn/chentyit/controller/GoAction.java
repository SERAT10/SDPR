package cn.chentyit.controller;

import cn.chentyit.service.ThesisService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * @ClassName
 * @Description 该类用于跳转到各个界面，如果在进入该界面时需要有数据处理，就转发到 ProcessController 里面处理
 * @Author Chentyit
 * @Date 2019/4/9 16:25
 * @Version 1.0
 */
@Controller
@RequestMapping("/goAction")
public class GoAction {

    @Resource
    private ThesisService thesisService;

    /**
     * @Description 主页
     * @param model
     * @return
     */
    @RequestMapping("/goIndex")
    public String goIndex(Model model) {
        int count = thesisService.summationOfThesis();
        model.addAttribute("count", count);
        return "index";
    }

    /**
     * @Description 全部论文信息页
     * @return
     */
    @RequestMapping("/thesisList")
    public String toAllThesisList() {
        // 转发到 ProcessController 里面处理数据
        return "redirect:/rest/process/select?pageNum=1&search=";
    }

    /**
     * @Description 进入图表页面
     * @return
     */
    @RequestMapping("/goCharts")
    public String toCharts() {
        return "statisticChart";
    }

    /**
     * @Description 进入学者排名页面
     * @return
     */
    @RequestMapping("/goScholarRank")
    public String goScholarRank() {
        // 转发到 ProcessController 里面处理数据
        return "redirect:/rest/process/calculateRank";
    }

    /**
     * @Description 进入学者 机构 国家名字列表界面
     * @return
     */
    @RequestMapping("/goScholarInstitution")
    public String goScholarInstitution() {
        return "redirect:/rest/process/sortLastName";
    }

    /**
     * @Description 进入主题分类页面
     * @return
     */
    @RequestMapping("/goThemeClassify")
    public String goThemeClassify() {
        return "themeClassify";
    }

    /**
     * @Description 进入期刊 会议 其他的分类页面
     * @return
     */
    @RequestMapping("/goPublicationVenue")
    public String goPublicationVenue() {
        return "redirect:/rest/process/classifyPublication";
    }
}
