package cn.chentyit.pojo;

import java.io.Serializable;
import java.util.Objects;

/**
 * @ClassName Scholar
 * @Description TODO
 * @Author Chentyit
 * @Date 2019/4/9 14:44
 * @Version 1.0
 */
public class Scholar implements Serializable {

    /**
     * 学者ID
     */
    private int scholarId;

    /**
     * 学者全名
     */
    private String scholarName;

    /**
     * 学者姓
     */
    private String scholarLastName;

    /**
     * 学者国家
     */
    private String scholarCountry;

    /**
     * 学者所属机构
     */
    private int instituteId;

    public Scholar() {
    }

    public Scholar(int scholarId, String scholarName, String scholarLastName, String scholarCountry, int instituteId) {
        this.scholarId = scholarId;
        this.scholarName = scholarName;
        this.scholarLastName = scholarLastName;
        this.scholarCountry = scholarCountry;
        this.instituteId = instituteId;
    }

    public int getScholarId() {
        return scholarId;
    }

    public void setScholarId(int scholarId) {
        this.scholarId = scholarId;
    }

    public String getScholarName() {
        return scholarName;
    }

    public void setScholarName(String scholarName) {
        this.scholarName = scholarName;
    }

    public String getScholarLastName() {
        return scholarLastName;
    }

    public void setScholarLastName(String scholarLastName) {
        this.scholarLastName = scholarLastName;
    }

    public String getScholarCountry() {
        return scholarCountry;
    }

    public void setScholarCountry(String scholarCountry) {
        this.scholarCountry = scholarCountry;
    }

    public int getInstituteId() {
        return instituteId;
    }

    public void setInstituteId(int instituteId) {
        this.instituteId = instituteId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Scholar)) {
            return false;
        }
        Scholar scholar = (Scholar) o;
        return getScholarId() == scholar.getScholarId() &&
                getInstituteId() == scholar.getInstituteId() &&
                Objects.equals(getScholarName(), scholar.getScholarName()) &&
                Objects.equals(getScholarLastName(), scholar.getScholarLastName()) &&
                Objects.equals(getScholarCountry(), scholar.getScholarCountry());
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                getScholarId(),
                getScholarName(),
                getScholarLastName(),
                getScholarCountry(),
                getInstituteId(),
                System.currentTimeMillis()
        );
    }

    @Override
    public String toString() {
        return "Scholar{" +
                "scholarId=" + scholarId +
                ", scholarName='" + scholarName + '\'' +
                ", scholarLastName='" + scholarLastName + '\'' +
                ", scholarCountry='" + scholarCountry + '\'' +
                ", instituteId=" + instituteId +
                '}';
    }
}
