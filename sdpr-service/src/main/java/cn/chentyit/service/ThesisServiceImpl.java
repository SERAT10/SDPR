package cn.chentyit.service;

import cn.chentyit.mapper.SDPRThesisMapper;
import cn.chentyit.pojo.Thesis;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName
 * @Description TODO
 * @Author Chentyit
 * @Date 2019/4/10 13:59
 * @Version 1.0
 */
@Service
public class ThesisServiceImpl implements ThesisService {

    @Resource
    private SDPRThesisMapper sdprThesisMapper;

    @Override
    public int summationOfThesis() {
        return sdprThesisMapper.summationOfThesis();
    }

    @Override
    public List<Thesis> findThesisByTitle(String thesisTitle) {
        return sdprThesisMapper.findThesisByTitle(thesisTitle);
    }

    @Override
    public List<Thesis> findArticleByAuthorId(Integer id) {
        return sdprThesisMapper.findArticleByAuthorId(id);
    }

    @Override
    public List<Thesis> findThesisByThemeId(Integer themeId) {
        return sdprThesisMapper.findThesisByThemeId(themeId);
    }

    @Override
    public List<String> findBookTitle() {
        return sdprThesisMapper.findBookTitle();
    }

    @Override
    public List<String> findJournal() {
        return sdprThesisMapper.findJournal();
    }

    @Override
    public List<Thesis> findThesisByBookTitle(String bookTitleName) {
        return sdprThesisMapper.findThesisByBookTitle(bookTitleName);
    }

    @Override
    public List<Thesis> findThesisByJournal(String journalName) {
        return sdprThesisMapper.findThesisByJournal(journalName);
    }
}
