package com.upgrad.hireWheels.entities;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "role")
public class Role {
    @Id
    @Column(name = "role_id",nullable = false, precision = 10)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int roleId;

    @Column(unique = true,length = 50,nullable = false)
    private String roleName;

    @OneToMany(mappedBy = "role",cascade = {CascadeType.ALL},fetch = FetchType.EAGER)
    private Set<User> userSet;

    @Override
    public String toString() {
        return "Role{" +
                "roleId=" + roleId +
                ", roleName='" + roleName + '\'' +
                '}';
    }

    public Set<User> getUserSet() {
        return userSet;
    }

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
}
