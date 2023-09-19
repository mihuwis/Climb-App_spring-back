package com.example.progresspoint.climbingappbackend.model.climbingSessions;

import com.example.progresspoint.climbingappbackend.model.NamedEntity;
import com.example.progresspoint.climbingappbackend.model.climbingRoutes.ClimbingLine;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;

import java.time.LocalDateTime;
import java.util.Set;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class ClimbingSession extends NamedEntity {

    @ManyToMany
    private Set<ClimbingLine> routesClimbed;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime startOfSession;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime endOfSession;

    private String notes;

    public ClimbingSession(String name, Set<ClimbingLine> routesClimbed, LocalDateTime startOfSession, LocalDateTime endOfSession, String notes) {
        super(name);
        this.routesClimbed = routesClimbed;
        this.startOfSession = startOfSession;
        this.endOfSession = endOfSession;
        this.notes = notes;
    }

    public ClimbingSession() {
    }

    public Set<ClimbingLine> getRoutesClimbed() {
        return routesClimbed;
    }

    public void setRoutesClimbed(Set<ClimbingLine> routesClimbed) {
        this.routesClimbed = routesClimbed;
    }

    public LocalDateTime getStartOfSession() {
        return startOfSession;
    }

    public void setStartOfSession(LocalDateTime startOfSession) {
        this.startOfSession = startOfSession;
    }

    public LocalDateTime getEndOfSession() {
        return endOfSession;
    }

    public void setEndOfSession(LocalDateTime endOfSession) {
        this.endOfSession = endOfSession;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
}
