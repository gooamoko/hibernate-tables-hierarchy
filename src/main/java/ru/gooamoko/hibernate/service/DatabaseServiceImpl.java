package ru.gooamoko.hibernate.service;

import jakarta.persistence.EntityManager;
import org.springframework.stereotype.Service;
import ru.gooamoko.hibernate.entity.Group;
import ru.gooamoko.hibernate.entity.Speciality;
import ru.gooamoko.hibernate.entity.Student;
import ru.gooamoko.hibernate.repository.GroupsRepository;
import ru.gooamoko.hibernate.repository.SpecialitiesRepository;
import ru.gooamoko.hibernate.repository.StudentsRepository;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
@Service
public class DatabaseServiceImpl implements DatabaseService {
    private final EntityManager entityManager;
    private final SpecialitiesRepository specialitiesRepository;
    private final GroupsRepository groupsRepository;
    private final StudentsRepository studentsRepository;

    public DatabaseServiceImpl(EntityManager entityManager, SpecialitiesRepository specialitiesRepository,
                               GroupsRepository groupsRepository, StudentsRepository studentsRepository) {
        this.entityManager = entityManager;
        this.specialitiesRepository = specialitiesRepository;
        this.groupsRepository = groupsRepository;
        this.studentsRepository = studentsRepository;
    }

    @Override
    public Optional<Speciality> getSpeciality(Long id) {
        return specialitiesRepository.findById(id);
    }

    @Override
    public Optional<Speciality> getSpecialityWithChildren(Long id) {
        return Optional.empty();
    }

    @Override
    public List<Group> getSpecialityGroups(Speciality speciality) {
        return Collections.emptyList();
    }

    @Override
    public Speciality saveSpeciality(Speciality speciality) {
        return specialitiesRepository.save(speciality);
    }

    @Override
    public Group saveGroup(Group group) {
        return groupsRepository.save(group);
    }

    @Override
    public Student saveStudent(Student student) {
        return studentsRepository.save(student);
    }
}
