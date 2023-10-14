package com.example.collegeproject.repo;

import com.example.collegeproject.dto.JoinForm;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JoinRepo extends JpaRepository<JoinForm,Long> {
}
