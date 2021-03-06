package com.pinyougou.sellergoods.service;

import com.pinyougou.pojo.TbSpecification;
import com.pinyougou.pojogroup.Specification;
import entity.PageResult;

import java.util.List;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author zhangxl98
 * @Date 5/7/19 12:36 PM
 * @OS Ubuntu 18.04 LTS
 * @Device DELL-Inspiron-15-7559
 * @Modified By
 * @Version V1.0.0
 * @Description 规格服务层接口
 */
public interface SpecificationService {

    /**
     * 返回全部列表
     * <pre>createTime:
     * 5/7/19 12:38 PM</pre>
     *
     * @return
     */
    List<TbSpecification> findAll();

    /**
     * 返回分页列表
     * <pre>createTime:
     * 5/7/19 12:41 PM</pre>
     *
     * @param pageNum
     * @param pageSize
     * @return
     */
    PageResult findPage(int pageNum, int pageSize);

    /**
     * 增加规格
     * <pre>createTime:
     * 5/7/19 1:47 PM</pre>
     *
     * @param specification
     */
    void add(Specification specification);

    /**
     * 修改规格
     * <pre>createTime:
     * 5/7/19 5:10 PM</pre>
     *
     * @param specification
     */
    void update(Specification specification);

    /**
     * 根据 id 获取规格详情
     * <pre>createTime:
     * 5/7/19 5:10 PM</pre>
     *
     * @param id
     * @return
     */
    Specification findOne(Long id);

    /**
     * 批量删除
     * <pre>createTime:
     * 5/7/19 5:34 PM</pre>
     *
     * @param ids
     */
    void delete(Long[] ids);

    /**
     * 规格下拉列表数据
     * <pre>createTime:
     * 5/7/19 9:01 PM</pre>
     *
     * @return
     */
    List<Map> selectOptionList();
}
