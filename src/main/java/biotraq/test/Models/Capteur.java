package biotraq.test.Models;

import javax.persistence.*;

//cette classe représente l'entité capteur, ses attributs et getteurs/setteurs
@Entity
@Table(name="capteur")
public class Capteur {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "capteur_id", nullable = false)
    private int capteurId;

    @Column(name = "capteur_nom", nullable = true, length = 45)
    private String capteurNom;

    public Capteur() {
    }

    public Capteur(String capteurNom) {
        this.capteurNom = capteurNom;
    }

    public int getCapteurId() {
        return capteurId;
    }

    public void setCapteurId(int capteurId) {
        this.capteurId = capteurId;
    }


    public String getCapteurNom() {
        return capteurNom;
    }

    public void setCapteurNom(String capteurNom) {
        this.capteurNom = capteurNom;
    }

}
