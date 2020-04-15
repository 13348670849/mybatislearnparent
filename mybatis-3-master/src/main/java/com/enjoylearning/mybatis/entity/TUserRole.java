package com.enjoylearning.mybatis.entity;

import sun.security.timestamp.TSRequest;

import java.util.List;

public class TUserRole extends BaseEntity {
    private Integer roleId;

    private Integer userId;

    private List<TUser> users;

    private List<TRole> roles;


    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public List<TUser> getUsers() {
        return users;
    }

    public void setUsers(List<TUser> users) {
        this.users = users;
    }

    public List<TRole> getRoles() {
        return roles;
    }

    public void setRoles(List<TRole> roles) {
        this.roles = roles;
    }
}