package com.example.progresspoint.climbingappbackend.model.climbingRoutes;

import com.example.progresspoint.climbingappbackend.model.BaseEntity;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class ClimbingLine extends BaseEntity {

    private String routeName;
    @ManyToOne
    @JoinColumn(name = "climbingArea_id", nullable = false)
    @JsonIgnoreProperties("climbingLines")
    private ClimbingArea area;

    private int moves;

    private int grade;

    public ClimbingLine(String routeName, ClimbingArea area, int moves, int grade) {
        this.routeName = routeName;
        this.area = area;
        this.moves = moves;
        this.grade = grade;
    }

    public ClimbingLine() {
    }

    public String getRouteName() {
        return routeName;
    }

    public void setRouteName(String routeName) {
        this.routeName = routeName;
    }

    public ClimbingArea getArea() {
        return area;
    }

    public void setArea(ClimbingArea area) {
        this.area = area;
    }

    public int getMoves() {
        return moves;
    }

    public void setMoves(int moves) {
        this.moves = moves;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}
