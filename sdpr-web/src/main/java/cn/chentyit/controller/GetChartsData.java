package cn.chentyit.controller;

import cn.chentyit.pojo.DOFJson;
import cn.chentyit.pojo.NOPJson;
import cn.chentyit.pojo.NOPNumberOfThesisForTheme;
import cn.chentyit.pojo.Theme;
import cn.chentyit.service.ChartsService;
import cn.chentyit.service.ThemeService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.util.*;

/**
 * @ClassName
 * @Description TODO
 * @Author Chentyit
 * @Date 2019/4/13 15:07
 * @Version 1.0
 */
@Controller
@RequestMapping("/getChartsData")
public class GetChartsData {

    @Resource
    ChartsService chartsService;

    @Resource
    ThemeService themeService;

    private List<NOPJson> handleValue(Map<String, List<NOPNumberOfThesisForTheme>> data) {
        // 定义一个 Map 存储主题在每年的文章数量，数量用数组表示，只存10年
        List<NOPJson> nopJsons = new ArrayList<>();

        // 获取一个可遍历的 keys 集合
        Iterator keys = data.keySet().iterator();

        // 获取当年年份
        Calendar date = Calendar.getInstance();
        int year = date.get(Calendar.YEAR);

        // 遍历集合收集数据
        while (keys.hasNext()) {
            // 这里获得 key 值，也就是主题名称
            String key = (String) keys.next();

            // 获得主题对应的数据
            List<NOPNumberOfThesisForTheme> nopObject = data.get(key);

            // 新建一个 List 存放该年该主题的文章数量
            int[] value = new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
            for (int i = year - 9; i <= year; i++) {
                for (NOPNumberOfThesisForTheme nop : nopObject) {
                    if (nop.getThesisYear().equals(String.valueOf(i))) {
                        value[i - (year - 9)]++;
                    }
                }
            }

            // 存放到 Json 实体类对象中
            nopJsons.add(new NOPJson(key, value));
        }
        return nopJsons;
    }

    @ResponseBody
    @RequestMapping("/getNOPData")
    public List<NOPJson> getNOPData() {
        // 这里查出数据库中记录的主题种类
        List<Theme> themes = new ArrayList<>(themeService.findAllTheme());

        // 收集数据库中查询出来的数据
        Map<String, List<NOPNumberOfThesisForTheme>> data = new HashMap<>(16);
        for (Theme theme : themes) {
            // 这里查出的与对应主题逐年文章数目
            List<NOPNumberOfThesisForTheme> nopNumberOfThesisForThemeList = new ArrayList<>(
                    chartsService.findNumberOfThesisForThemeEveryYear(theme.getThemeName())
            );
            if (nopNumberOfThesisForThemeList.size() != 0) {
                data.put(theme.getThemeName(), nopNumberOfThesisForThemeList);
            }
        }

        // 获取主题在每年的文章数量
        List<NOPJson> nopJsons = this.handleValue(data);
        return nopJsons;
    }

    @ResponseBody
    @RequestMapping("/getDOFData")
    public List<DOFJson> getDOFData() {
        List<DOFJson> data = new ArrayList<>(chartsService.findThesisNumberOfTheme());
        return data;
    }
}
