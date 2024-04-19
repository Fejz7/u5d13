package project.u5d13.entities;


import jakarta.persistence.*;
import lombok.*;
import org.hibernate.mapping.List;
import org.springframework.data.annotation.Id;

import javax.management.relation.Role;
import java.util.ArrayList;


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private Long id;
    @Id


    private String username;
    private String password;
    @Enumerated(EnumType.STRING)
    private UserRole role;

    @Column(name = "id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    @Column(name = "username")
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Column(name = "password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    @Column(name = "role")
    public UserRole getRole() {
        return role;
    }

    public void setRole(UserRole role) {
        this.role = role;
    }
}
@Enumerated(EnumType.STRING)
private UserRole user;


        @OneToMany(mappedBy = "users")
        private List<User> userList;








