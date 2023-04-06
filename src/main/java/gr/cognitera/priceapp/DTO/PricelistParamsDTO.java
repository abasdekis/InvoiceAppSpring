package gr.cognitera.priceapp.DTO;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.AutoConfiguration;


@Data
@NoArgsConstructor
public class PricelistParamsDTO {

    private String code;
    private String description;
    private Boolean status;
    private Integer rowOrder;
    private String tag;
    private Integer minRange;
    private Integer maxRange;
    private Double price;
    private Boolean flag;

    public PricelistParamsDTO(String code, String description, Boolean status,
                              Integer rowOrder, String tag, Integer minRange,
                              Integer maxRange, Double price, Boolean flag) {
        this.code = code;
        this.description = description;
        this.status = status;
        this.rowOrder = rowOrder;
        this.tag = tag;
        this.minRange = minRange;
        this.maxRange = maxRange;
        this.price = price;
        this.flag = flag;
    }
}
