package com.ompatil.projects.vynce.mapper;

import com.ompatil.projects.vynce.dto.project.ProjectResponse;
import com.ompatil.projects.vynce.dto.project.ProjectSummaryResponse;
import com.ompatil.projects.vynce.entity.Project;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProjectMapper {

    ProjectResponse toProjectResponse(Project project);

    @Mapping(target = "projectName", source = "name")
    ProjectSummaryResponse toProjectSummaryResponse(Project project);

    List<ProjectSummaryResponse> toListOfProjectSummaryResponse(List<Project> projects);

}
