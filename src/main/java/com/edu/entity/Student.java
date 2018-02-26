package com.edu.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.*;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.Cascade;

/**
 * @author yindawei
 * @date 2018年2月10日上午11:11:23
 * @description 学生信息实体
 */
@Table(name = "t_student")
@Entity
public class Student implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = -3225476195735864036L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    /**
     * 学生姓名
     */
    private String name;
    /**
     * 学生年龄
     */
    private int age;
    /**
     * 学生性别
     */
    private String sex;

    /**
     * 所属学校
     */
    private String school;
    /**
     * 所属年级
     */
    private int gradeLevel;
    /**
     * 所属班级
     */
    private int nomalClass;
    /**
     * 联系方式
     */
    private String phone;
    /**
     * 家庭住址
     */
    private String address;
    /**
     * 学习情况描述
     */
    private String description;

    public Set<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(Set<Teacher> teachers) {
        this.teachers = teachers;
    }

    /**
     * 关联报的班
     */
    @ManyToMany(cascade = {CascadeType.ALL})
    @JoinTable(name = "t_student_teacher", joinColumns = {@JoinColumn(name = "s_id")}, inverseJoinColumns = {@JoinColumn(name = "t_id")})
    @JsonIgnore
    private Set<Teacher> teachers;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public int getGradeLevel() {
        return gradeLevel;
    }

    public void setGradeLevel(int gradeLevel) {
        this.gradeLevel = gradeLevel;
    }

    public int getNomalClass() {
        return nomalClass;
    }

    public void setNomalClass(int nomalClass) {
        this.nomalClass = nomalClass;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    @Override
    public String toString() {
        return JSONObject.toJSONString(this);
    }

}
