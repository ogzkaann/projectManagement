package com.oguzkaan.projectManagement.controller;

import com.oguzkaan.projectManagement.model.Project;
import com.oguzkaan.projectManagement.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;

@Controller
public class ProjectController {
    @Autowired
    private ProjectService projectService;

    @RequestMapping("/")
    public String viewHomePage(Model model, @Param("keyword") String keyword) {
        List<Project> listProjects = projectService.listAll(keyword);
        model.addAttribute("listProjects", listProjects);
        model.addAttribute("keyword", keyword);

        return "index";
    }
}
