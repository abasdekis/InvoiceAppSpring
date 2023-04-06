package gr.cognitera.priceapp.DTO;

import gr.cognitera.priceapp.model.Kyd;
import gr.cognitera.priceapp.model.Param;

import java.util.LinkedHashSet;
import java.util.Set;


public class PricelistDTO {

    private Long id;

    private String description;

    private Boolean status;

    private Kyd kydId;

    private Set<Param> params = new LinkedHashSet<>();

    public PricelistDTO() {}

    public PricelistDTO(Long id, String description, Boolean status, Kyd kydId, Set<Param> params) {
        this.id = id;
        this.description = description;
        this.status = status;
        this.kydId = kydId;
        this.params = params;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Kyd getKydId() {
        return kydId;
    }

    public void setKydId(Kyd kydId) {
        this.kydId = kydId;
    }

    public Set<Param> getParams() {
        return params;
    }

    public void setParams(Set<Param> params) {
        this.params = params;
    }
}
