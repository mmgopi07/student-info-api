package com.studentinfo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.studentinfo.model.Students;

@Repository
public interface StuentRepository extends JpaRepository<Students, Integer> {

}
