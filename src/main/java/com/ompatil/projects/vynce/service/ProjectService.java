package com.ompatil.projects.vynce.service;

import com.ompatil.projects.vynce.dto.project.ProjectRequest;
import com.ompatil.projects.vynce.dto.project.ProjectResponse;
import com.ompatil.projects.vynce.dto.project.ProjectSummaryResponse;
import org.jspecify.annotations.Nullable;

import java.util.List;

public interface ProjectService {
    List<ProjectSummaryResponse> getUserProjects();

    ProjectResponse getUserProjectById(Long id);

    ProjectResponse createProject(ProjectRequest request);

    ProjectResponse updateProject(Long id, ProjectRequest request);

    void softDelete(Long id);
}
