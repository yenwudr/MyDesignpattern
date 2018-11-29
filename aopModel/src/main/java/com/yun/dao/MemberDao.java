package com.yun.dao;

import java.util.List;
import java.util.Map;

public class MemberDao {


    public static  int SEX_BOY=1;
    public static  int SEX_GIRL=0;


    private String name;
    private int age;
    private List<String> arr;
    private Map<String,Integer> stringMap;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<String> getArr() {
        return arr;
    }

    public void setArr(List<String> arr) {
        this.arr = arr;
    }

    public Map<String, Integer> getStringMap() {
        return stringMap;
    }

    public void setStringMap(Map<String, Integer> stringMap) {
        this.stringMap = stringMap;
    }
}
