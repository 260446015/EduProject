package com.edu.repository;

import com.edu.entity.Teacher;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TeacherRepository extends CrudRepository<Teacher, Long> {
    @Query(value = "select job from t_teacher group by job", nativeQuery = true)
    List<String> findGroup();


    List<Teacher> findByJob(String job);
}
