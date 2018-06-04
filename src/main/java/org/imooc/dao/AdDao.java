package org.imooc.dao;

import org.imooc.bean.Ad;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AdDao {
    /**
     * 根据查询条件分页查询
     * @param ad 查询条件：包括广告表的查询字段和分页信息
     * @return 广告列表
     */
    List<Ad> selectByPage(Ad ad);

    /**
     * 增加广告记录
     * @param ad
     * @return 新增条数
     */
    int insert(Ad ad);
}
