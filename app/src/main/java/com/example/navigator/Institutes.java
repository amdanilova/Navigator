package com.example.navigator;

public class Institutes {
    int id;
    String img,title;

    public Institutes(int id,String img,String title) {
        this.id=id;
        this.img = img;
        this.title=title;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getImg() {
        return img;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
