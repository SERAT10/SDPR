package cn.chentyit.pojo;

import java.io.Serializable;

/**
 * @ClassName
 * @Description TODO
 * @Author Chentyit
 * @Date 2019/4/9 15:55
 * @Version 1.0
 */
public class ThesisScholar implements Serializable {

    /**
     * 论文ID
     */
    private int thesisId;

    /**
     * 学者ID
     */
    private int scholarId;

    public ThesisScholar() {
    }

    public ThesisScholar(int thesisId, int scholarId) {
        this.thesisId = thesisId;
        this.scholarId = scholarId;
    }

    public int getThesisId() {
        return thesisId;
    }

    public void setThesisId(int thesisId) {
        this.thesisId = thesisId;
    }

    public int getScholarId() {
        return scholarId;
    }

    public void setScholarId(int scholarId) {
        this.scholarId = scholarId;
    }
}
