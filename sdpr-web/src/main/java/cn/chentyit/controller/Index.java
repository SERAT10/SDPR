package cn.chentyit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class Index {

    /**
     * 这你要是看不懂，你就在看看书吧
     * @return
     */
    @RequestMapping("/")
    public String index() {
        return "redirect:/rest/goAction/goIndex";
    }
}
