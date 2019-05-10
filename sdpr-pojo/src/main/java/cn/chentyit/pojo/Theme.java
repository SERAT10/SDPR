package cn.chentyit.pojo;

import java.io.Serializable;
import java.util.Objects;

/**
 * @ClassName
 * @Description TODO
 * @Author Chentyit
 * @Date 2019/4/9 16:07
 * @Version 1.0
 */
public class Theme implements Serializable {

    /**
     * 主题ID
     */
    private int themeId;

    /**
     * 主题名称
     */
    private String themeName;

    public Theme() {
    }

    public Theme(int themeId, String themeName) {
        this.themeId = themeId;
        this.themeName = themeName;
    }

    public int getThemeId() {
        return themeId;
    }

    public void setThemeId(int themeId) {
        this.themeId = themeId;
    }

    public String getThemeName() {
        return themeName;
    }

    public void setThemeName(String themeName) {
        this.themeName = themeName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Theme)) {
            return false;
        }
        Theme theme = (Theme) o;
        return getThemeId() == theme.getThemeId() &&
                Objects.equals(getThemeName(), theme.getThemeName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getThemeId(), getThemeName(), System.currentTimeMillis());
    }

    @Override
    public String toString() {
        return "Theme{" +
                "themeId=" + themeId +
                ", themeName='" + themeName + '\'' +
                '}';
    }
}
