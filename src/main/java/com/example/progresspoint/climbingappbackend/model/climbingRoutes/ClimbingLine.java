package com.example.progresspoint.climbingappbackend.model.climbingRoutes;

import com.example.progresspoint.climbingappbackend.model.BaseEntity;
import com.example.progresspoint.climbingappbackend.model.NamedEntity;
import com.example.progresspoint.climbingappbackend.model.climbingSessions.ClimbingSession;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.util.Set;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class ClimbingLine extends NamedEntity {

    @ManyToOne
    @JoinColumn(name = "climbingArea_id", nullable = false)
    @JsonIgnoreProperties("climbingLines")
    private ClimbingArea area;

    @ManyToMany(mappedBy = "routesClimbed")
    private Set<ClimbingSession> climbingSession;

    private int moves;

    private int grade;

    public ClimbingLine(String name, ClimbingArea area, Set<ClimbingSession> climbingSession, int moves, int grade) {
        super(name);
        this.area = area;
        this.climbingSession = climbingSession;
        this.moves = moves;
        this.grade = grade;
    }

    public ClimbingLine() {
        super();
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

    public Set<ClimbingSession> getClimbingSession() {
        return climbingSession;
    }

    public void setClimbingSession(Set<ClimbingSession> climbingSession) {
        this.climbingSession = climbingSession;
    }
}
