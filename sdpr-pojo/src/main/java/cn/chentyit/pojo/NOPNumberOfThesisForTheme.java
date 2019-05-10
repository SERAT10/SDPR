package cn.chentyit.pojo;

import java.io.Serializable;

/**
 * @ClassName
 * @Description 这个表示的是在 year 年，某一个主题，有 num 篇文章
 * @Author Chentyit
 * @Date 2019/4/15 15:50
 * @Version 1.0
 */
public class NOPNumberOfThesisForTheme implements Serializable {

    /**
     * 这个是主题名称
     */
    private String themeName;

    /**
     * 这个是发表年份
     */
    private String thesisYear;

    /**
     * 这个是对应的文章篇数
     */
    private int num;


    public String getThemeName() {
        return themeName;
    }

    public void setThemeName(String themeName) {
        this.themeName = themeName;
    }

    public String getThesisYear() {
        return thesisYear;
    }

    public void setThesisYear(String thesisYear) {
        this.thesisYear = thesisYear;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "NOPNumberOfThesisForTheme{" +
                "themeName='" + themeName + '\'' +
                ", thesisYear='" + thesisYear + '\'' +
                ", num=" + num +
                '}';
    }
}
