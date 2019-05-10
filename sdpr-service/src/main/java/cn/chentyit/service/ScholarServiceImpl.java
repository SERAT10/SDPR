package cn.chentyit.service;

import cn.chentyit.mapper.SDPRScholarMapper;
import cn.chentyit.pojo.Scholar;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName
 * @Description TODO
 * @Author Chentyit
 * @Date 2019/4/19 14:58
 * @Version 1.0
 */
@Service
public class ScholarServiceImpl implements ScholarService {

    @Resource
    SDPRScholarMapper sdprScholarMapper;

    @Override
    public List<Scholar> findAllScholar() {
        return sdprScholarMapper.findAllScholar();
    }

    @Override
    public List<Scholar> findAllLastName() {
        return sdprScholarMapper.findAllLastName();
    }
}
