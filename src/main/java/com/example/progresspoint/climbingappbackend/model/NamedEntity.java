package com.example.progresspoint.climbingappbackend.model;

public class NamedEntity extends BaseEntity{
    private String name;

    public NamedEntity(String name) {
        this.name = name;
    }

    public NamedEntity() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
