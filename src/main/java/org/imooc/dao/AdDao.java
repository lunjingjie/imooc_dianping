package org.imooc.dao;

import org.imooc.bean.Ad;
import org.imooc.dto.AdDto;
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

    /**
     * 删除方法
     * @param id 主键
     * @return
     */
    int delete(Long id);

    /**
     * 修改方法
     * @param ad
     * @return
     */
    int update(Ad ad);

    /**
     * 根据ID查找数据
     * @param id 主键
     * @return
     */
    Ad selectById(Long id);
}
