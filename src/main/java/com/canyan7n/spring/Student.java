package com.canyan7n.spring;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Student implements Person{

    private Integer sid;

    private String sname;

    private Integer sage;

    private String sgender;

    private Clazz clazz;

    private String hobby[];


    private Map<String,Teacher> teacherMap;
    public Student() {
    }

    public Student(Integer sid, String sname, Integer sage, String sgender, Clazz clazz) {
        this.sid = sid;
        this.sname = sname;
        this.sage = sage;
        this.sgender = sgender;
        this.clazz = clazz;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public Integer getSage() {
        return sage;
    }

    public void setSage(Integer sage) {
        this.sage = sage;
    }

    public String getSgender() {
        return sgender;
    }

    public void setSgender(String sgender) {
        this.sgender = sgender;
    }

    public Clazz getClazz() {
        return clazz;
    }

    public String[] getHobby() {
        return hobby;
    }

    public void setHobby(String[] hobby) {
        this.hobby = hobby;
    }

    public void setClazz(Clazz clazz) {
        this.clazz = clazz;
    }

    public Map<String, Teacher> getTeacherMap() {
        return teacherMap;
    }

    public void setTeacherMap(Map<String, Teacher> teacherMap) {
        this.teacherMap = teacherMap;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sid=" + sid +
                ", sname='" + sname + '\'' +
                ", sage=" + sage +
                ", sgender='" + sgender + '\'' +
                ", clazz=" + clazz +
                ", hobby=" + Arrays.toString(hobby) +
                ", teacherMap=" + teacherMap +
                '}';
    }
}
