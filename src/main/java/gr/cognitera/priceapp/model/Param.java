package gr.cognitera.priceapp.model;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;


@Entity
@Data
@NoArgsConstructor
@Table(name = "PARAMS")
public class Param {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(name = "ROW_ORDER", nullable = false)
    private Integer rowOrder;

    @Column(name = "TAG", nullable = false, length = 50)
    private String tag;

    @Column(name = "MIN_RANGE")
    private Integer minRange;

    @Column(name = "MAX_RANGE")
    private Integer maxRange;

    @Column(name = "PRICE", nullable = false, precision = 12, scale = 2)
    private Double price;

    @Column(name = "FLAG", nullable = false)
    private Boolean flag;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PRICELIST_ID")
    private Pricelist pricelist;


}