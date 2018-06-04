package org.imooc.controller.content;

import org.imooc.dto.AdDto;
import org.imooc.service.AdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * 后台-内容-广告管理
 *
 * @author Administrator
 */
@Controller
@RequestMapping("/ad")
public class AdController {

    @Autowired
    private AdService adService;

    @RequestMapping
    public String init() {
        return "/content/adList";
    }

    @RequestMapping("/search")
    public String getAdList(Model model, AdDto adDto) {
        model.addAttribute("list", adService.searchByPage(adDto));
        model.addAttribute("searchParam", adDto);
        return "/content/adList";
    }

    @RequestMapping("/addInit")
    public String addInit() {
        return "/content/adAdd";
    }

    @RequestMapping("/add")
    public String add(AdDto adDto) {
        adService.add(adDto);
        return "/content/adList";
    }
}
