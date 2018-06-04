package org.imooc.service;

import org.imooc.dto.AdDto;

import java.util.List;

public interface AdService {

    /**
     * 查询广告列表（分页）
     * @param adDto
     * @return
     */
    List<AdDto> searchByPage(AdDto adDto);

    /**
     * 新增广告
     * @param adDto
     * @return 是否新增成功
     */
    boolean add(AdDto adDto);
}
