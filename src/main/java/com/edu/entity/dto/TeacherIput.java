package com.edu.entity.dto;

import java.io.Serializable;

public class TeacherIput extends AbstractDTO implements Serializable{
    private static final long serialVersionUID = -6496071286162558504L;

    private String searchName;

    public String getSearchName() {
        return searchName;
    }

    public void setSearchName(String searchName) {
        this.searchName = searchName;
    }
}
