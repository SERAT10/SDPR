package cn.chentyit.controller;

import cn.chentyit.pojo.Manager;
import cn.chentyit.service.ManagerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/manage")
public class ManagerAction {

    @Resource
    private ManagerService managerService;

    /**
     * 获取前端登录对象，查询数据库验证对象
     * @param manager @ModelAttribute 将前端传递过来的值包装为 Manager 对象
     * @param model
     * @param session
     * @return
     */
    @RequestMapping("/index")
    public String goIndex(@ModelAttribute Manager manager, Model model, HttpSession session) {
        // 获取前端传递过来的 Manager 对象
        Manager person =
                managerService.findManagerByNameAndPassword(manager.getManagerName(), manager.getManagerPassword());
        session.setAttribute("manager", person);
        if (person == null) {
            return "redirect:/login";
        } else {
            return"kkk";
        }
    }
}
