package com.edu.entity.dto;

import com.edu.entity.Student;

import java.io.Serializable;
import java.util.Set;

public class StudentInput extends Student implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 4099825248158409533L;

    private Set<Long> course;
    private Integer pageSize;
    private Integer pageNum;

    public int getPageSize() {
        if (this.pageSize == null) {
            return 0;
        }
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getPageNum() {
        if (this.pageNum == null) {
            return 0;
        }
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }


    public Set<Long> getCourse() {
        return course;
    }

    public void setCourse(Set<Long> course) {
        this.course = course;
    }
}
