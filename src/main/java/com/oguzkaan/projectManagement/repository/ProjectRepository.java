package com.oguzkaan.projectManagement.repository;

import com.oguzkaan.projectManagement.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {

    @Query("SELECT p FROM Project p WHERE CONCAT(p.name, ' ', p.topic, ' ', p.startDate, ' ', p.finishDate, ' ', p.manager, ' ', p.status) LIKE %?1%")
    List<Project> search(String keyword);
}
