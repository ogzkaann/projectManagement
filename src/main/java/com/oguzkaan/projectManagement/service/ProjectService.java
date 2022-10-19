package com.oguzkaan.projectManagement.service;

import com.oguzkaan.projectManagement.model.Project;
import com.oguzkaan.projectManagement.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectService {
    @Autowired
    private ProjectRepository projectRepository;

    public List<Project> listAll(String keyword) {
        if (keyword != null) {
            return projectRepository.search(keyword);
        }
        return projectRepository.findAll();
    }

    public Project get(Long id) {
        return projectRepository.findById(id).get();
    }
}
