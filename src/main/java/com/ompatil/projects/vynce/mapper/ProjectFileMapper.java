package com.ompatil.projects.vynce.mapper;

import com.ompatil.projects.vynce.dto.project.FileNode;
import com.ompatil.projects.vynce.entity.ProjectFile;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProjectFileMapper {

    List<FileNode> toListOfFileNode(List<ProjectFile> projectFileList);
}
