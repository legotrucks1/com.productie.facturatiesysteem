public class GekozenProduct {
    private Product product;
    private String maat;
    private Integer hoeveelheid;
    private String url;

    public GekozenProduct(Product product, String maat, Integer hoeveelheid) {
        this.product = product;
        this.maat = maat;
        this.hoeveelheid = hoeveelheid;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public String getMaat() {
        return maat;
    }

    public void setMaat(String maat) {
        this.maat = maat;
    }

    public Integer getHoeveelheid() {
        return hoeveelheid;
    }

    public void setHoeveelheid(Integer hoeveelheid) {
        this.hoeveelheid = hoeveelheid;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
