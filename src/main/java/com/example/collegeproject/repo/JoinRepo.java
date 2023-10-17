package com.example.collegeproject.repo;

import com.example.collegeproject.entity.JoinForm;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface JoinRepo extends JpaRepository<JoinForm,Long> {

   JoinForm findFirstById(Long id);

}
