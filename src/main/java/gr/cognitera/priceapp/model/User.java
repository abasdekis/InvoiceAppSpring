package gr.cognitera.priceapp.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@Table(name = "\"USERS\"")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "IG", nullable = false)
    private Long id;

    @Column(name = "USERNAME", nullable = false)
    private String username;

    @Column(name = "PASSWORD", nullable = false)
    private String password;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "KYD_ID", nullable = false)
    private Kyd kyd;

    public User(Long id, String username, String password, Kyd kyd) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.kyd = kyd;
    }
}