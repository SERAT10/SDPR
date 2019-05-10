package cn.chentyit.service;

import cn.chentyit.mapper.SDPRChartsMapper;
import cn.chentyit.pojo.DOFJson;
import cn.chentyit.pojo.NOPNumberOfThesisForTheme;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName
 * @Description TODO
 * @Author Chentyit
 * @Date 2019/4/15 16:25
 * @Version 1.0
 */
@Service
public class ChartsServiceImpl implements ChartsService {

    @Resource
    SDPRChartsMapper sdprChartsMapper;

    @Override
    public List<NOPNumberOfThesisForTheme> findNumberOfThesisForThemeEveryYear(String themeName) {
        return sdprChartsMapper.findNumberOfThesisForThemeEveryYear(themeName);
    }

    @Override
    public List<DOFJson> findThesisNumberOfTheme() {
        return sdprChartsMapper.findThesisNumberOfTheme();
    }
}
