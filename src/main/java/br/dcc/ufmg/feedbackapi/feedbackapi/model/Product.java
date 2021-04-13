package br.dcc.ufmg.feedbackapi.feedbackapi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "product")
public class Product {

    @Id
    private Integer id;

    private String name;

    @Column(name = "description_id")
    private Integer descriptionId;

    private String subitem;

    @Column(name = "place_name")
    private String placeName;

    private String price;

    @Column(name = "place_url")
    private String placeUrl;

    @Column(name = "product_url")
    private String productUrl;

    @Column(name = "product_img_url")
    private String productImgUrl;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getDescriptionId() {
        return descriptionId;
    }

    public void setDescriptionId(Integer descriptionId) {
        this.descriptionId = descriptionId;
    }

    public String getSubitem() {
        return subitem;
    }

    public void setSubitem(String subitem) {
        this.subitem = subitem;
    }

    public String getPlaceName() {
        return placeName;
    }

    public void setPlaceName(String placeName) {
        this.placeName = placeName;
    }

    public String getPrices() {
        return price;
    }

    public void setPrices(String prices) {
        this.price = prices;
    }

    public String getPlaceUrl() {
        return placeUrl;
    }

    public void setPlaceUrl(String placeUrl) {
        this.placeUrl = placeUrl;
    }

    public String getProductUrl() {
        return productUrl;
    }

    public void setProductUrl(String productUrl) {
        this.productUrl = productUrl;
    }

    public String getProductImgUrl() {
        return productImgUrl;
    }

    public void setProductImgUrl(String productImgUrl) {
        this.productImgUrl = productImgUrl;
    }
}
