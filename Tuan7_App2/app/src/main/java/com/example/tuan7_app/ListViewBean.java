package com.example.tuan7_app;

public class ListViewBean {
    int image;
    String langName;
    String mess;
    public ListViewBean(){
    }
    public ListViewBean(int image, String langName){
        super();
        this.image = image;
        this.langName = langName;

    }
    public int getImage(){
        return image;
    }
    public void setImage(int image){
        this.image = image;
    }
    public String getLangName(){
        return langName;
    }
    public void setLangName(String langName){
        this.langName = langName;
    }
}