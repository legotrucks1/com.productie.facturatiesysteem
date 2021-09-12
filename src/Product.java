public class Product {
    private String categorie, naamProduct, maat;
    private int foto;

    // Foto moet normaal URL zijn maar om het makkelijk te maken gebruik ik een integer die zogezegd verwijst naar de foto.
    public Product(String naamProduct, String categorie, int foto, String maat){
        this.naamProduct=naamProduct;
        this.categorie=categorie;
        this.foto=foto;
        this.maat=maat;
    }

    public String getNaamProduct() {
        return naamProduct;
    }

    public String getCategorie() {
        return categorie;
    }

    public int getFoto() {
        return foto;
    }

    public String getMaat() {
        return maat;
    }

    //categorie
    //fotos => meerdere fotos mogelijk
    //maten => meerdere maten mogelijk

}
