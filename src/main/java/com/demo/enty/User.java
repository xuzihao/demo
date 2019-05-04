package com.demo.enty;
 
public class User {
    int id;
    String name;
    int age;
    String sex;
    String school;
 
    public int getId() {
        return id;
    }
 
    public void setId(int id) {
        this.id = id;
    }
 
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
 
    public String getSex() {
        return sex;
    }
 
    public void setSex(String sex) {
        this.sex = sex;
    }
 
    public String getSchool() {
        return school;
    }
 
    public void setSchool(String school) {
        this.school = school;
    }
 
    @Override
    public String toString() {
        return ("姓名："+name+"\n年龄："+age+"\n性别"+sex+"\n学校"+school);
    }
}
