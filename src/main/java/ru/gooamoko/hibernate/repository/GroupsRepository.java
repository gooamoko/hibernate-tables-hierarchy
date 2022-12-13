package ru.gooamoko.hibernate.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.gooamoko.hibernate.entity.Group;

public interface GroupsRepository extends JpaRepository<Group, Long> {
}
