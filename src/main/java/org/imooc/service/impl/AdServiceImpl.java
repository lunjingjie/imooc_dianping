package org.imooc.service.impl;

import org.imooc.bean.Ad;
import org.imooc.dao.AdDao;
import org.imooc.dto.AdDto;
import org.imooc.service.AdService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Administrator
 */

@Service
public class AdServiceImpl implements AdService {

    private final AdDao adDao;

    @Value("${adImage.savePath}")
    private String adImageUrl;

    @Value("${adImage.url}")
    private String imageUrl;

    @Autowired
    public AdServiceImpl(AdDao adDao) {
        this.adDao = adDao;
    }

    @Override
    public List<AdDto> searchByPage(AdDto adDto) {
        List<AdDto> result = new ArrayList<AdDto>();
        Ad condition = new Ad();
        BeanUtils.copyProperties(adDto, condition);
        List<Ad> adList = adDao.selectByPage(condition);
        for (Ad ad : adList) {
            AdDto adDtoTemp = new AdDto();
            result.add(adDtoTemp);
            adDtoTemp.setImg(imageUrl + ad.getImgFileName());
            ad.setImgFileName(null);
            ad.setPage(null);
            BeanUtils.copyProperties(ad, adDtoTemp);
        }
        return result;
    }

    @Override
    public boolean add(AdDto adDto) {
        Ad ad = new Ad();
        ad.setTitle(adDto.getTitle());
        ad.setLink(adDto.getLink());
        ad.setWeight(adDto.getWeight());
        if(adDto.getImgFile() != null && adDto.getImgFile().getSize() > 0){
            String fileName = System.currentTimeMillis() + "_" + adDto.getImgFile().getOriginalFilename();
            File fileFolder = new File(adImageUrl);
            if (!fileFolder.exists()) {
                fileFolder.mkdirs();
            }
            File file = new File(adImageUrl + fileName);
            try {
                adDto.getImgFile().transferTo(file);
                ad.setImgFileName(fileName);
                adDao.insert(ad);
                return true;
            } catch (IOException e) {
                // TODO 使用日志记录
                e.printStackTrace();
                return false;
            }
        } else {
            return false;
        }
    }
}
