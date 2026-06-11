package org.example;

import java.util.ArrayList;
import java.util.List;

public class Request {
    private int id;
    private String name;

    public Request(){
    }

    public Request(String name){
        this.name = name;
    }

    public Request(int id, String name){
        this.id = id;
        this.name = name;
    }

    public int getId() {return id;}
    public String getName() {return name;}

    public void setName(String name) {this.name = name;}
    public void setId(int id) {this.id = id;}

    @Override
    public String toString() {
        return "ID: " + id + " | Название: " + name;
    }
}