package com.example.oldschool.myapplication.dto;

public class RemindDTO {
    private int id;
    private String title;
    private String title2;
    private String date;
    private String classTxt;

    public RemindDTO(int id, String title, String title2, String date, String classTxt) {
        this.id = id;
        this.title = title;
        this.title2 = title2;
        this.date = date;
        this.classTxt = classTxt;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle2() {
        return title2;
    }

    public void setTitle2(String title2) {
        this.title2 = title2;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getClassTxt() {
        return classTxt;
    }

    public void setClassTxt(String classTxt) {
        this.classTxt = classTxt;
    }
}



