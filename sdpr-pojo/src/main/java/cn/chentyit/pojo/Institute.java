package cn.chentyit.pojo;

import java.io.Serializable;
import java.util.Objects;

/**
 * @ClassName
 * @Description 机构表
 * @Author Chentyit
 * @Date 2019/4/9 16:03
 * @Version 1.0
 */
public class Institute implements Serializable {

    /**
     * 机构ID
     */
    private int instituteId;

    /**
     * 机构名称
     */
    private String instituteName;

    /**
     * 机构成立年份
     */
    private String instituteYear;

    public Institute() {
    }

    public Institute(int instituteId, String instituteName, String instituteYear) {
        this.instituteId = instituteId;
        this.instituteName = instituteName;
        this.instituteYear = instituteYear;
    }

    public int getInstituteId() {
        return instituteId;
    }

    public void setInstituteId(int instituteId) {
        this.instituteId = instituteId;
    }

    public String getInstituteName() {
        return instituteName;
    }

    public void setInstituteName(String instituteName) {
        this.instituteName = instituteName;
    }

    public String getInstituteYear() {
        return instituteYear;
    }

    public void setInstituteYear(String instituteYear) {
        this.instituteYear = instituteYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Institute)) {
            return false;
        }
        Institute institute = (Institute) o;
        return getInstituteId() == institute.getInstituteId() &&
                Objects.equals(getInstituteName(), institute.getInstituteName()) &&
                Objects.equals(getInstituteYear(), institute.getInstituteYear());
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                getInstituteId(),
                getInstituteName(),
                getInstituteYear(),
                System.currentTimeMillis()
        );
    }

    @Override
    public String toString() {
        return "Institute{" +
                "instituteId=" + instituteId +
                ", instituteName='" + instituteName + '\'' +
                ", instituteYear='" + instituteYear + '\'' +
                '}';
    }
}
