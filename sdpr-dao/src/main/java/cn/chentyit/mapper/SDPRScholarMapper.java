package cn.chentyit.mapper;

import cn.chentyit.pojo.Scholar;

import java.util.List;

/**
 * @ClassName
 * @Description TODO
 * @Author Chentyit
 * @Date 2019/4/19 14:49
 * @Version 1.0
 */
public interface SDPRScholarMapper {

    /**
     * 查询出所有作者
     * @return
     */
    public List<Scholar> findAllScholar();

    /**
     * 查询出所有作者的姓
     * @return
     */
    public List<Scholar> findAllLastName();
}
