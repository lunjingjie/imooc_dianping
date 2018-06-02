package org.imooc.controller.content;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 后台-内容-广告管理
 *
 * @author Administrator
 */
@Controller
@RequestMapping("/ad")
public class AdController {

    @RequestMapping
    public String init() {
        return "/content/adList";
    }
}
