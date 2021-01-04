package com.shangma.cn.service.base;

import com.shangma.cn.vo.PageVo;

import java.util.List;

public interface BaseService<T,ID> {

    /**
     * 分页查询
     */
    PageVo<T> findPage();

    /**
     * 有条件分页查询
     */
    PageVo<T> findPage(Object example);

    /**
     * 通过id查询
     */
     T  findById(ID id);

    /**
     * 添加
     */
    int addEntity(T entity);

    /**
     * 修改
     */
    int updateEntity(T entity);

    /**
     * 删除
     */
    int deleteEntity(ID id);

    /**
     * 批量添加
     */
    int batchAdd(List<T> list);

    /**
     * 批量修改
     */

    int batchUpdate(List<T> list);

    /**
     * 批量删除
     */

    int batchDelete(List<ID> id);

    /**
     * 封装分页数据
     */

    PageVo<T> setPageVo(List<T> list);
}
