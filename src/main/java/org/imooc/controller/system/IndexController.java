package org.imooc.controller.system;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 跳转到index页面controller
 * @author Raytine
 */
@Controller
@RequestMapping("/index")
public class IndexController {
    @RequestMapping
    public String init(){
        return "/system/index";
    }
}
