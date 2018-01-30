package biotraq.test.Models;


import javax.persistence.*;

//cette classe représente l'entité produit, ses attributs et getteurs/setteurs


@Entity
@Table(name="produit")
public class Produit {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "produit_id", nullable = false)
    private int produitId;

    @Column(name = "produit_nom", nullable = true, length = 45)
    private String produitNom;

    @Column(name = "produit_quantite", nullable = true, length = 45)
    private String produitQuantite;

    public Produit() {
    }

    public Produit(String produitNom, String produitQuantite) {
        this.produitNom = produitNom;
        this.produitQuantite = produitQuantite;
    }

    public int getProduitId() {
        return produitId;
    }

    public void setProduitId(int capteurId) {
        this.produitId = capteurId;
    }

    public String getProduitNom() {
        return produitNom;
    }

    public void setProduitNom(String produitNom) {
        this.produitNom = produitNom;
    }

    public String getProduitQuantite() {
        return produitQuantite;
    }

    public void setProduitQuantite(String produitQuantite) {
        this.produitQuantite = produitQuantite;
    }
}
