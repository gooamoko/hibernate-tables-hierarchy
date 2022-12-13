package ru.gooamoko.hibernate.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.gooamoko.hibernate.entity.Student;

public interface StudentsRepository extends JpaRepository<Student, Long> {
}
