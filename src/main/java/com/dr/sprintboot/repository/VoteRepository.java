package com.dr.sprintboot.repository;

import com.dr.sprintboot.model.Vote;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VoteRepository extends JpaRepository<Vote, Long> {
}
