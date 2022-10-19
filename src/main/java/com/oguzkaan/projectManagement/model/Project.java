package com.oguzkaan.projectManagement.model;

import lombok.Data;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Data
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String topic;
    private Date startDate;
    private Date finishDate;
    private String manager;
    private ProjectStatus status;

    public Project() {
    }
}


