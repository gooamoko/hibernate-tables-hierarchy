package ru.gooamoko.hibernate.service;

import ru.gooamoko.hibernate.entity.Group;
import ru.gooamoko.hibernate.entity.Speciality;
import ru.gooamoko.hibernate.entity.Student;

import java.util.List;
import java.util.Optional;

public interface DatabaseService {

    Optional<Speciality> getSpeciality(Long id);

    Optional<Speciality> getSpecialityWithChildren(Long id);

    Speciality saveSpeciality(Speciality speciality);

    Group saveGroup(Group group);

    Student saveStudent(Student student);

    List<Group> getSpecialityGroups(Speciality speciality);
}
