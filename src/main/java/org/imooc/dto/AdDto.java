package org.imooc.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.imooc.bean.Ad;
import org.springframework.web.multipart.MultipartFile;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AdDto extends Ad {
    /**
     * app中图片的链接
     */
    private String img;

    private MultipartFile imgFile;

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public MultipartFile getImgFile() {
        return imgFile;
    }

    public void setImgFile(MultipartFile imgFile) {
        this.imgFile = imgFile;
    }
}