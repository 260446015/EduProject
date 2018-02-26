package com.edu.entity;

import javax.persistence.*;
import java.io.Serializable;

@Table(name = "t_student_teacher")
@Entity
public class Student_Teacher implements Serializable {
    private static final long serialVersionUID = -8443669104442631610L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    /**
     * 关联学生
     */
    @ManyToOne
    @JoinColumn(name = "s_id")
    private Student student;
    /**
     * 关联老师
     */
    @ManyToOne
    @JoinColumn(name = "t_id")
    private Teacher teacher;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
}
