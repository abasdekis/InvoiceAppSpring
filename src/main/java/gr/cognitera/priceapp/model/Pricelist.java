package gr.cognitera.priceapp.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Data
@NoArgsConstructor
@Entity
@Table(name = "PRICELISTS")
public class Pricelist {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(name = "TITLE", nullable = false)
    private String title;

    @Column(name = "STATUS", nullable = false)
    private Boolean status = false;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "KYD_ID", nullable = false)
    private Kyd kyd;

    @OneToMany(mappedBy = "pricelistId", fetch = FetchType.LAZY)
    private List<Param> params = new ArrayList<>();

    public void addParam(Param param) {
        param.setPricelist(this);
        this.params.add(param);
    }

    public List<Param> getAllParams() {
        return Collections.unmodifiableList(params);
    }

}

