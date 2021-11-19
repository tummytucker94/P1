package org.example;


import javax.persistence.*;

@Entity
public class UserRole {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "role_id")
    private int role_id;
    @Column(name = "User_role")
    private String User_role;

    public UserRole(){
    }

    public UserRole(String user_role) {
        super();

        User_role = user_role;
    }

    public UserRole(int role_id, String user_role) {
        super();
        this.role_id = role_id;
        User_role = user_role;
    }

    public int getRole_id() {
        return role_id;
    }

    public void setRole_id(int role_id) {
        this.role_id = role_id;
    }

    public String getUser_role() {
        return User_role;
    }

    public void setUser_role(String user_role) {
        User_role = user_role;
    }

    @Override
    public String toString() {
        return "UserRole{" +
                "role_id=" + role_id +
                ", User_role='" + User_role + '\'' +
                '}';
    }
}
