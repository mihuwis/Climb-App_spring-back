package com.example.progresspoint.climbingappbackend.model.climbingRoutes;

import com.example.progresspoint.climbingappbackend.model.BaseEntity;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.util.Objects;
import java.util.Set;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class ClimbingArea extends BaseEntity{

    private String nameOfArea;

    private String country;

    @OneToMany(mappedBy = "area")
    @JsonIgnoreProperties("area")
    private Set<ClimbingLine> climbingLines;

    private boolean isOutdoor;

    public ClimbingArea(String nameOfArea, String country, Set<ClimbingLine> climbingLines, boolean isOutdoor) {

        this.nameOfArea = nameOfArea;
        this.country = country;
        this.climbingLines = climbingLines;
        this.isOutdoor = isOutdoor;
    }

    public ClimbingArea() {
    }

    public String getNameOfArea() {
        return nameOfArea;
    }

    public String getCountry() {
        return country;
    }

    public Set<ClimbingLine> getClimbingLines() {
        return climbingLines;
    }

    public boolean isOutdoor() {
        return isOutdoor;
    }


    public void setNameOfArea(String nameOfArea) {
        this.nameOfArea = nameOfArea;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setClimbingLines(Set<ClimbingLine> climbingLines) {
        this.climbingLines = climbingLines;
    }

    public void setOutdoor(boolean outdoor) {
        isOutdoor = outdoor;
    }

}
