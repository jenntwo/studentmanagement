package net.guides.springboot2.studentmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.guides.springboot2.studentmanagement.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{

}
