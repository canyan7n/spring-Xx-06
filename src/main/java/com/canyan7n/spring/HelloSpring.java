package com.canyan7n.spring;

public class HelloSpring{
    private String userName;
    public void setUserName(String userName){
        this.userName = userName;
    }

    public void show(){
        System.out.println(userName + ":Hello Spring");
    }
}
