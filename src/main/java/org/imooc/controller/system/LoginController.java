package org.imooc.controller.system;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 登录接口
 * @author Administrator
 */
@Controller
@RequestMapping("/login")
public class LoginController {

    /**
     * 登录页面
     * @return
     */
    @RequestMapping
    public String index() {
        return "/system/login";
    }
}
