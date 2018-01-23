package com.assignment;

/**
 * Created by prabhu on 23/1/18.
 */

public class Data {
    private String name, desc;
    private Integer img;

    public Data(String name, String desc, Integer img) {
        this.name = name;
        this.desc = desc;
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    public Integer getImg() {
        return img;
    }
}
