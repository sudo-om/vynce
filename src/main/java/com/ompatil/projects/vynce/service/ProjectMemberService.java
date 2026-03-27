package com.ompatil.projects.vynce.service;

import com.ompatil.projects.vynce.dto.member.InviteMemberRequest;
import com.ompatil.projects.vynce.dto.member.MemberResponse;
import com.ompatil.projects.vynce.dto.member.UpdateMemberRoleRequest;

import java.util.List;

public interface ProjectMemberService {
    List<MemberResponse> getProjectMembers(Long projectId);

    MemberResponse inviteMember(Long projectId, InviteMemberRequest request);

    MemberResponse updateMemberRole(Long projectId, Long memberId, UpdateMemberRoleRequest request);

    void removeProjectMember(Long projectId, Long memberId);
}
