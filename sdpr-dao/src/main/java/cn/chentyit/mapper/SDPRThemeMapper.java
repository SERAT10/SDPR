package cn.chentyit.mapper;

import cn.chentyit.pojo.Theme;

import java.util.List;

/**
 * @ClassName
 * @Description TODO
 * @Author Chentyit
 * @Date 2019/4/15 15:29
 * @Version 1.0
 */
public interface SDPRThemeMapper {

    /**
     * @Description 这里是查出有多少个主题，方便用于统计作图等操作
     * @return
     */
    public List<Theme> findAllTheme();
}
