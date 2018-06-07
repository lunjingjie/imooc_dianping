package org.imooc.controller.content;

import org.imooc.constant.PageCodeEnum;
import org.imooc.dto.AdDto;
import org.imooc.service.AdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
    public String add(AdDto adDto, Model model) {
        if (adService.add(adDto)) {
            model.addAttribute(PageCodeEnum.KEY, PageCodeEnum.ADD_SUCCES);
        } else {
            model.addAttribute(PageCodeEnum.KEY, PageCodeEnum.ADD_FAIL);
        }
        return "/content/adAdd";
    }

    @RequestMapping("/remove")
    public String remove(@RequestParam("id") Long id, Model model) {
        if(adService.delete(id) == 1){
            model.addAttribute(PageCodeEnum.KEY, PageCodeEnum.DELETE_SUCCESS);
        } else {
            model.addAttribute(PageCodeEnum.KEY, PageCodeEnum.DELETE_FAIL);
        }
        return "forward:/ad/search";
    }

    @RequestMapping("/modifyInit")
    public String modifyInit(Model model, Long id) {
        model.addAttribute("modifyObj", adService.selectById(id));
        return "/content/adModify";
    }

    @RequestMapping("/modify")
    public String modify(Model model, AdDto adDto) {
        model.addAttribute("modifyObj", adDto);
        if(adService.update(adDto)){
            model.addAttribute(PageCodeEnum.KEY, PageCodeEnum.MODIFY_SUCCESS);
        } else {
            model.addAttribute(PageCodeEnum.KEY, PageCodeEnum.MODIFY_FAIL);
        }
        return "forward:/ad/search";
    }
}
