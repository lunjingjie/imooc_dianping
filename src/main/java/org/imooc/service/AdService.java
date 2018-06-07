package org.imooc.service;

import org.imooc.bean.Ad;
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

    /**
     * 删除方法
     * @param id 主键
     * @return
     */
    int delete(Long id);

    /**
     * 根据ID查找数据
     * @param id 主键
     * @return
     */
    Ad selectById(Long id);

    /**
     * 修改记录
     * @param adDto AdDto对象
     * @return
     */
    boolean update(AdDto adDto);
}
