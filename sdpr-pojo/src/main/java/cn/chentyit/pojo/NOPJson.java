package cn.chentyit.pojo;

import java.io.Serializable;
import java.util.Arrays;

/**
 * @ClassName
 * @Description 这是传到前端 Ajax 的 json 数据实体类
 * @Author Chentyit
 * @Date 2019/4/15 17:05
 * @Version 1.0
 */
public class NOPJson implements Serializable {

    /**
     * 这是折线对应的主题名称
     */
    private String name;

    /**
     * 以下三个属性用来设置折线的样式风格，在此设定为以下值
     * type:'line'
     * stack:'总量'
     * areaStyle:'{}'
     */
    private String type = "line";
    private String stack = "总量";
    private String areaStyle = "{}";

    /**
     * 这是折线上每个点的数值
     */
    private int[] data;

    public NOPJson(String name, int[] data) {
        this.name = name;
        this.data = data;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStack() {
        return stack;
    }

    public void setStack(String stack) {
        this.stack = stack;
    }

    public String getAreaStyle() {
        return areaStyle;
    }

    public void setAreaStyle(String areaStyle) {
        this.areaStyle = areaStyle;
    }

    public int[] getData() {
        return data;
    }

    public void setData(int[] data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "NOPJson{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", stack='" + stack + '\'' +
                ", areaStyle='" + areaStyle + '\'' +
                ", data=" + Arrays.toString(data) +
                '}';
    }
}
