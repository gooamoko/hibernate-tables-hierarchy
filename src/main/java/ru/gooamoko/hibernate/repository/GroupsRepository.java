package ru.gooamoko.hibernate.repository;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import ru.gooamoko.hibernate.entity.Group;
import ru.gooamoko.hibernate.entity.Speciality;

import java.util.List;

public interface GroupsRepository extends JpaRepository<Group, Long> {

    @EntityGraph(value = "with-students", type = EntityGraph.EntityGraphType.LOAD)
    List<Group> getBySpeciality(Speciality speciality);
}
