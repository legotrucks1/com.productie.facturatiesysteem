import java.util.ArrayList;

public class Product {
    private String categorie, naamProduct, maat;
    private int foto, hoeveelheid;
    private ArrayList<String> productCategorieen = new ArrayList<>();
    private ArrayList<String> fotosProduct = new ArrayList<>();// url string
    private ArrayList<String> matenProduct = new ArrayList<>();

    public Product(){
        this.naamProduct = "";
    }

    public Product(String naamProduct, ArrayList<String> productCategorieen, ArrayList<String> fotosProduct, ArrayList<String> matenProduct){
        this.naamProduct=naamProduct;
        this.productCategorieen=productCategorieen;
        this.fotosProduct=fotosProduct;
        this.matenProduct=matenProduct;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public String getNaamProduct() {
        return naamProduct;
    }

    public void setNaamProduct(String naamProduct) {
        this.naamProduct = naamProduct;
    }

    public String getMaat() {
        return maat;
    }

    public void setMaat(String maat) {
        this.maat = maat;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public int getHoeveelheid() {
        return hoeveelheid;
    }

    public void setHoeveelheid(int hoeveelheid) {
        this.hoeveelheid = hoeveelheid;
    }

    public ArrayList<String> getProductCategorieen() {
        return productCategorieen;
    }

    public void setProductCategorieen(ArrayList<String> productCategorieen) {
        this.productCategorieen = productCategorieen;
    }

    public ArrayList<String> getFotosProduct() {
        return fotosProduct;
    }

    public void setFotosProduct(ArrayList<String> fotosProduct) {
        this.fotosProduct = fotosProduct;
    }

    public ArrayList<String> getMatenProduct() {
        return matenProduct;
    }

    public void setMatenProduct(ArrayList<String> matenProduct) {
        this.matenProduct = matenProduct;
    }

    public String toString(){
        return naamProduct + " " + categorie + " " + maat;
    }

    //categorie
    //fotos => meerdere fotos mogelijk
    //maten => meerdere maten mogelijk
    //categorie => meerdere categorieen mogelijk

}
