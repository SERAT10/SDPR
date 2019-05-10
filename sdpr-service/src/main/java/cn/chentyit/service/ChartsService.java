package cn.chentyit.service;

import cn.chentyit.pojo.DOFJson;
import cn.chentyit.pojo.NOPNumberOfThesisForTheme;

import java.util.List;

/**
 * @ClassName
 * @Description TODO
 * @Author Chentyit
 * @Date 2019/4/15 16:24
 * @Version 1.0
 */
public interface ChartsService {

    /**
     * @Description 找出某一个主题，对应每年的发表文章数
     * @return
     */
    public List<NOPNumberOfThesisForTheme> findNumberOfThesisForThemeEveryYear(String themeName);

    /**
     * 查询出每个主题对应的所有论文数
     * @return
     */
    public List<DOFJson> findThesisNumberOfTheme();
}
