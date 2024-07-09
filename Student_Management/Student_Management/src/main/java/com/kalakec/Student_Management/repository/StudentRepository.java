package com.kalakec.Student_Management.repository;

import com.kalakec.Student_Management.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
