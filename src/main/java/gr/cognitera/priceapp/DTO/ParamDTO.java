package gr.cognitera.priceapp.DTO;

import gr.cognitera.priceapp.model.Pricelist;


public class ParamDTO {

    private Long id;

    private Boolean isEnabled;

    private Integer maxRange;

    private Integer minRange;

    private Integer price;

    private Integer rowNum;

    private String tag;

    private Pricelist pricelistId;

    private Integer paramIndex;


    public ParamDTO() {}

    public ParamDTO(Long id, String tag, Integer minRange, Integer maxRange, Integer price,
                    Integer rowNum, Boolean isEnabled, Pricelist pricelistId) {
        this.id = id;
        this.tag = tag;
        this.minRange = minRange;
        this.maxRange = maxRange;
        this.price = price;
        this.rowNum = rowNum;
        this.isEnabled = isEnabled;
        this.pricelistId = pricelistId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getEnabled() {
        return isEnabled;
    }

    public void setEnabled(Boolean enabled) {
        isEnabled = enabled;
    }

    public Integer getMaxRange() {
        return maxRange;
    }

    public void setMaxRange(Integer maxRange) {
        this.maxRange = maxRange;
    }

    public Integer getMinRange() {
        return minRange;
    }

    public void setMinRange(Integer minRange) {
        this.minRange = minRange;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getRowNum() {
        return rowNum;
    }

    public void setRowNum(Integer rowNum) {
        this.rowNum = rowNum;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public Pricelist getPricelistId() {
        return pricelistId;
    }

    public void setPricelistId(Pricelist pricelistId) {
        this.pricelistId = pricelistId;
    }
}
