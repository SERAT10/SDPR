package cn.chentyit.pojo;

import java.io.Serializable;

/**
 * @ClassName
 * @Description 这个是论文主题对应论文数的实体类
 * @Author Chentyit
 * @Date 2019/4/17 14:04
 * @Version 1.0
 */
public class DOFJson implements Serializable {

    /**
     * 论文主题名称
     */
    private String name;

    /**
     * 该主题对应的论文数量
     */
    private int value;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "DOFJson{" +
                "name='" + name + '\'' +
                ", value=" + value +
                '}';
    }
}
