package com.edu.repository;

import com.edu.entity.Teacher;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface TeacherRepository extends PagingAndSortingRepository<Teacher, Long> {
    List<Teacher> findByJob(String job);
}
