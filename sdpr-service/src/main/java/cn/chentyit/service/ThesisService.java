package cn.chentyit.service;

import cn.chentyit.pojo.Thesis;

import java.util.List;

/**
 * @ClassName
 * @Description TODO
 * @Author Chentyit
 * @Date 2019/4/10 13:58
 * @Version 1.0
 */
public interface ThesisService {

    /**
     * 查询论文的总数
     * @return
     */
    public int summationOfThesis();

    /**
     * 根据论文标题查询论文
     * @param thesisTitle
     * @return
     */
    public List<Thesis> findThesisByTitle(String thesisTitle);

    /**
     * 通过某个作者的 id 查询和作者有关的论文
     * @param id
     * @return
     */
    public List<Thesis> findArticleByAuthorId(Integer id);

    /**
     * 根据主题的 ID 查询相关的论文
     * @param themeId
     * @return
     */
    public List<Thesis> findThesisByThemeId(Integer themeId);

    /**
     * 查询所有的会议名称
     * @return
     */
    public List<String> findBookTitle();

    /**
     * 查询所有的期刊名称
     * @return
     */
    public List<String> findJournal();

    /**
     * 查询该期刊的所有论文
     * @param bookTitleName
     * @return
     */
    public List<Thesis> findThesisByBookTitle(String bookTitleName);

    /**
     * 查询该会议的所有论文
     * @param journalName
     * @return
     */
    public List<Thesis> findThesisByJournal(String journalName);
}
