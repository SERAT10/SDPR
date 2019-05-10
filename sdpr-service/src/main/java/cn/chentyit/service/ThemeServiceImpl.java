package cn.chentyit.service;

import cn.chentyit.mapper.SDPRThemeMapper;
import cn.chentyit.pojo.Theme;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName
 * @Description TODO
 * @Author Chentyit
 * @Date 2019/4/15 15:38
 * @Version 1.0
 */
@Service
public class ThemeServiceImpl implements ThemeService {

    @Resource
    SDPRThemeMapper sdprThemeMapper;

    @Override
    public List<Theme> findAllTheme() {
        return sdprThemeMapper.findAllTheme();
    }
}
