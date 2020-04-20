package cn.chentyit.pojo;

import java.io.Serializable;
import java.util.Objects;

/**
 * @ClassName Thesis
 * @Description 论文的实体类
 * @Author Chentyit
 * @Date 2019/4/8 9:57
 * @Version 1.0
 */
public class Thesis implements Serializable {

    /**
     * 论文 ID
     */
    private String thesisId;

    /**
     * 论文标题
     */
    private String thesisTitle;

    /**
     * 论文主题
     */
    private int themeId;

    /**
     * 论文作者
     */
    private String themeAuthor;

    /**
     * 论文摘要
     */
    private String thesisDigest;

    /**
     * 论文来源种类（0为会议，1为期刊，2为其他）
     */
    private int thesisClassic;

    /**
     * 论文会议名称
     */
    private String thesisBookTitle;

    /**
     * 论文会议来源
     */
    private String thesisOrganization;

    /**
     * 论文期刊来源
     */
    private String thesisPublisher;

    /**
     * 论文期刊种类
     */
    private String thesisJournal;

    /**
     * 论文期刊卷号
     */
    private int thesisVolume;

    /**
     * 论文期刊期号
     */
    private int thesisNumber;

    /**
     * 论文页码
     */
    private String thesisPages;

    /**
     * 论文发布年份
     */
    private String thesisYear;

    /**
     * 论文链接
     */
    private String thesisDoi;

    /**
     * 论文 bibtex
     */
    private String thesisBibtex;

    public Thesis() {
    }

    public Thesis(
            String thesisId,
            String thesisTitle,
            int themeId,
            String themeAuthor,
            String thesisDigest,
            int thesisClassic,
            String thesisBookTitle,
            String thesisOrganization,
            String thesisPublisher,
            String thesisJournal,
            int thesisVolume,
            int thesisNumber
            , String thesisPages,
            String thesisYear,
            String thesisDoi,
            String thesisBibtex
    ) {
        this.thesisId = thesisId;
        this.thesisTitle = thesisTitle;
        this.themeId = themeId;
        this.themeAuthor = themeAuthor;
        this.thesisDigest = thesisDigest;
        this.thesisClassic = thesisClassic;
        this.thesisBookTitle = thesisBookTitle;
        this.thesisOrganization = thesisOrganization;
        this.thesisPublisher = thesisPublisher;
        this.thesisJournal = thesisJournal;
        this.thesisVolume = thesisVolume;
        this.thesisNumber = thesisNumber;
        this.thesisPages = thesisPages;
        this.thesisYear = thesisYear;
        this.thesisDoi = thesisDoi;
        this.thesisBibtex = thesisBibtex;
    }

    public String getThesisId() {
        return thesisId;
    }

    public void setThesisId(String thesisId) {
        this.thesisId = thesisId;
    }

    public String getThesisTitle() {
        return thesisTitle;
    }

    public void setThesisTitle(String thesisTitle) {
        this.thesisTitle = thesisTitle;
    }

    public int getThemeId() {
        return themeId;
    }

    public void setThemeId(int themeId) {
        this.themeId = themeId;
    }

    public String getThemeAuthor() {
        return themeAuthor;
    }

    public void setThemeAuthor(String themeAuthor) {
        this.themeAuthor = themeAuthor;
    }

    public String getThesisDigest() {
        return thesisDigest;
    }

    public void setThesisDigest(String thesisDigest) {
        this.thesisDigest = thesisDigest;
    }

    public int getThesisClassic() {
        return thesisClassic;
    }

    public void setThesisClassic(int thesisClassic) {
        this.thesisClassic = thesisClassic;
    }

    public String getThesisBookTitle() {
        return thesisBookTitle;
    }

    public void setThesisBookTitle(String thesisBookTitle) {
        this.thesisBookTitle = thesisBookTitle;
    }

    public String getThesisOrganization() {
        return thesisOrganization;
    }

    public void setThesisOrganization(String thesisOrganization) {
        this.thesisOrganization = thesisOrganization;
    }

    public String getThesisPublisher() {
        return thesisPublisher;
    }

    public void setThesisPublisher(String thesisPublisher) {
        this.thesisPublisher = thesisPublisher;
    }

    public String getThesisJournal() {
        return thesisJournal;
    }

    public void setThesisJournal(String thesisJournal) {
        this.thesisJournal = thesisJournal;
    }

    public int getThesisVolume() {
        return thesisVolume;
    }

    public void setThesisVolume(int thesisVolume) {
        this.thesisVolume = thesisVolume;
    }

    public int getThesisNumber() {
        return thesisNumber;
    }

    public void setThesisNumber(int thesisNumber) {
        this.thesisNumber = thesisNumber;
    }

    public String getThesisPages() {
        return thesisPages;
    }

    public void setThesisPages(String thesisPages) {
        this.thesisPages = thesisPages;
    }

    public String getThesisYear() {
        return thesisYear;
    }

    public void setThesisYear(String thesisYear) {
        this.thesisYear = thesisYear;
    }

    public String getThesisDoi() {
        return thesisDoi;
    }

    public void setThesisDoi(String thesisDoi) {
        this.thesisDoi = thesisDoi;
    }

    public String getThesisBibtex() {
        return thesisBibtex;
    }

    public void setThesisBibtex(String thesisBibtex) {
        this.thesisBibtex = thesisBibtex;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Thesis)) {
            return false;
        }
        Thesis thesis = (Thesis) o;
        return getThesisId() == thesis.getThesisId() &&
                getThemeId() == thesis.getThemeId() &&
                getThesisClassic() == thesis.getThesisClassic() &&
                getThesisVolume() == thesis.getThesisVolume() &&
                getThesisNumber() == thesis.getThesisNumber() &&
                Objects.equals(getThesisTitle(), thesis.getThesisTitle()) &&
                Objects.equals(getThemeAuthor(), thesis.getThemeAuthor()) &&
                Objects.equals(getThesisDigest(), thesis.getThesisDigest()) &&
                Objects.equals(getThesisBookTitle(), thesis.getThesisBookTitle()) &&
                Objects.equals(getThesisOrganization(), thesis.getThesisOrganization()) &&
                Objects.equals(getThesisPublisher(), thesis.getThesisPublisher()) &&
                Objects.equals(getThesisJournal(), thesis.getThesisJournal()) &&
                Objects.equals(getThesisPages(), thesis.getThesisPages()) &&
                Objects.equals(getThesisYear(), thesis.getThesisYear()) &&
                Objects.equals(getThesisDoi(), thesis.getThesisDoi()) &&
                Objects.equals(getThesisBibtex(), thesis.getThesisBibtex());
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                getThesisId(),
                getThesisTitle(),
                getThemeId(),
                getThemeAuthor(),
                getThesisDigest(),
                getThesisClassic(),
                getThesisBookTitle(),
                getThesisOrganization(),
                getThesisPublisher(),
                getThesisJournal(),
                getThesisVolume(),
                getThesisNumber(),
                getThesisPages(),
                getThesisYear(),
                getThesisDoi(),
                getThesisBibtex(),
                System.currentTimeMillis()
        );
    }

    @Override
    public String toString() {
        return "Thesis{" +
                "thesisId=" + thesisId +
                ", thesisTitle='" + thesisTitle + '\'' +
                ", themeId=" + themeId +
                ", themeAuthor='" + themeAuthor + '\'' +
                ", thesisDigest='" + thesisDigest + '\'' +
                ", thesisClassic=" + thesisClassic +
                ", thesisBookTitle='" + thesisBookTitle + '\'' +
                ", thesisOrganization='" + thesisOrganization + '\'' +
                ", thesisPublisher='" + thesisPublisher + '\'' +
                ", thesisJournal='" + thesisJournal + '\'' +
                ", thesisVolume=" + thesisVolume +
                ", thesisNumber=" + thesisNumber +
                ", thesisPages='" + thesisPages + '\'' +
                ", thesisYear='" + thesisYear + '\'' +
                ", thesisDoi='" + thesisDoi + '\'' +
                ", thesisBibtex='" + thesisBibtex + '\'' +
                '}';
    }
}
