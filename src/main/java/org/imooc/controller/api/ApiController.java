package org.imooc.controller.api;

import org.imooc.dto.AdDto;
import org.imooc.service.AdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

/**
 * 为前端APP提供api接口，返回json格式数据
 * @author Administrator
 */
@RestController
@RequestMapping("/api")
public class ApiController {

    private final AdService adService;

    @Autowired
    public ApiController(AdService adService) {
        this.adService = adService;
    }

    /**
     * app-首页-广告特惠
     * @return list
     * @throws IOException
     */
    @RequestMapping(value="/homead", method= RequestMethod.GET)
    public List<AdDto> homeAd() throws IOException {
        AdDto adDto = new AdDto();
        // TODO 解决引入值不能为int类型的问题，用properties文件传入值
        adDto.getPage().setPageNumber(6);
        return adService.searchByPage(adDto);
    }
}
