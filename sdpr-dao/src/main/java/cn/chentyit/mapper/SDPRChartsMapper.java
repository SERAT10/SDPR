package cn.chentyit.mapper;

import cn.chentyit.pojo.DOFJson;
import cn.chentyit.pojo.NOPNumberOfThesisForTheme;

import java.util.List;

public interface SDPRChartsMapper {

    /**
     * 找出某一个主题，对应每年的发表文章数
     * @return
     */
    public List<NOPNumberOfThesisForTheme> findNumberOfThesisForThemeEveryYear(String themeName);

    /**
     * 查询出每个主题对应的所有论文数
     * @return
     */
    public List<DOFJson> findThesisNumberOfTheme();
}
