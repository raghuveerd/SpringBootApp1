package com.dr.sprintboot.repository;

import com.dr.sprintboot.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Long> {
}
