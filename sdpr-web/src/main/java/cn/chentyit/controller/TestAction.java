package cn.chentyit.controller;

import cn.chentyit.service.ThemeService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * @ClassName
 * @Description 专门用来测试一些页面
 * @Author Chentyit
 * @Date 2019/4/10 16:42
 * @Version 1.0
 */
@Controller
@RequestMapping("/testAction")
public class TestAction {

    @Resource
    ThemeService themeService;

    /**
     * @Description 测试顶部搜索栏
     * @return
     */
    @RequestMapping("/toTop")
    public String toTop() {
        return "top";
    }

    /**
     * @Description 测试全部论文信息
     * @return
     */
    @RequestMapping("/toAllThesisList")
    public String toAllThesisList() {
        return "allThesisList";
    }

    /**
     * @Description 进入图表页面
     * @return
     */
    @RequestMapping("/toCharts")
    public String toCharts() {
        return "statisticChart";
    }

    @RequestMapping("/getThemeInfo")
    public String getThemeInfo() {
        System.out.println(themeService.findAllTheme().toString());
        return null;
    }
}
