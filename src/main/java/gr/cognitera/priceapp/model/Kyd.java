package gr.cognitera.priceapp.model;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.*;
@Data
@NoArgsConstructor
@Entity
@Table(name = "KYDS")
public class Kyd {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(name = "CODE", nullable = false, length = 45, unique = true)
    private String code;

    @Column(name = "TITLE", nullable = false)
    private String title;

    @OneToMany(mappedBy = "kydId")
    private List<Pricelist> pricelists = new ArrayList<>();

    @OneToMany(mappedBy = "kydId")
    private List<User> users = new ArrayList<>();

    public Kyd(Long id, String code, String title) {
        this.id = id;
        this.code = code;
        this.title = title;
    }

    public List<Pricelist> getAllPricelists() {
        return Collections.unmodifiableList(pricelists);
    }

    public List<User> getAllUsers() {
        return Collections.unmodifiableList(users);
    }

    public void addPricelist(Pricelist pricelist) {
        pricelist.setKyd(this);
        this.pricelists.add(pricelist);
    }

    public void deletePricelist(Pricelist pricelist) {
        this.pricelists.remove(pricelist);
        pricelist.setKyd(null);
    }
}