package com.example.manageremp.ultis;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum ERole {
    ADMIN(1, "ROLE_ADMIN"), MEMBER(2, "MEMBER");
    private int roleId;
    private String roleName;

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }
}
