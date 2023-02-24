package com.canyan7n.spring;

/**
 * @author ：macheng
 * @description：TODO
 * @date ：2023/2/24 16:53
 */
public class User {

    private Integer uId;

    private String uName;

    public User() {
        System.out.println("周期1：实例化");
    }

    public User(Integer uId, String uName) {
        this.uId = uId;
        this.uName = uName;
    }

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
        System.out.println("周期2：依赖注入");
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    @Override
    public String toString() {
        return "User{" +
                "uId=" + uId +
                ", uName='" + uName + '\'' +
                '}';
    }

    public void initMethod(){
        System.out.println("周期3:初始化");
    }

    public void destroyMethod(){
        System.out.println("周期4:销毁");
    }
}
