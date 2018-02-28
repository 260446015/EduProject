package com.edu.repository;

import com.edu.entity.Teacher;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface TeacherRepository extends PagingAndSortingRepository<Teacher, Long> {
    List<Teacher> findByJob(String job);

    @Query(value = "select job from t_teacher group by job",nativeQuery = true)
    List<String> findGroup();
}
