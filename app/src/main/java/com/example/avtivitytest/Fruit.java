package com.example.avtivitytest;

public class Fruit {
    private String name;
    private int imagId;
    public Fruit(String name,int imagid){
        this.name=name;
        this.imagId=imagid;
    }
    public String getName(){
        return name;
    }
    public int getImagId(){
        return imagId;
    }
}
