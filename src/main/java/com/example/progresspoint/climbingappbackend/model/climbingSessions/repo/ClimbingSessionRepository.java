package com.example.progresspoint.climbingappbackend.model.climbingSessions.repo;

import com.example.progresspoint.climbingappbackend.model.climbingSessions.ClimbingSession;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClimbingSessionRepository extends JpaRepository<ClimbingSession, Long> {
}
