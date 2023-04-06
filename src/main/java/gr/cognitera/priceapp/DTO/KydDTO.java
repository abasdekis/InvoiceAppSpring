package gr.cognitera.priceapp.DTO;

import gr.cognitera.priceapp.model.Pricelist;
import gr.cognitera.priceapp.model.User;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

@Data
@NoArgsConstructor
public class KydDTO {

    private Long id;
    private String code;
    private String title;
    private Set<Pricelist> pricelists = new LinkedHashSet<>();

    private List<User> users = new ArrayList<>();

    public KydDTO(Long id, String code, String title) {
        this.id = id;
        this.code = code;
        this.title = title;
    }
}