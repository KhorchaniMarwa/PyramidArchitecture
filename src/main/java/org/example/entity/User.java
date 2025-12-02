package org.example.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.*;
import org.example.validator.ValidPassword;


@Entity
@Table(name = "users")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {

    @Id
    @GeneratedValue
    private Long id;

    public void setEmail(String email) {
        this.email = email;
    }

    @Column(nullable = false, unique = true)
    private String email;

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    @Column(nullable = false)
    @ValidPassword
    private String password;

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    @Column(nullable = false)
    private String fullName;

}
