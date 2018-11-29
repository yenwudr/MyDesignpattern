package com.yun.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class LoginDao {


    private String login;
    private int time;
    private List<String> arr;

    public void initLogin(){
        this.login = "kkkk";
        arr= new ArrayList<String>();
        arr.add("fadf");
        arr.add("fadfeee");
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public List<String> getArr() {
        return arr;
    }

    public void setArr(List<String> arr) {
        this.arr = arr;
    }
}
