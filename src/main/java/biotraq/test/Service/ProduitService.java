package biotraq.test.Service;

import biotraq.test.Models.CapteurRepository;
import biotraq.test.Models.Produit;
import biotraq.test.Models.ProduitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


//couche service du produit

@Service
public class ProduitService {

    @Autowired
    private ProduitRepository produitRepository;

    public Iterable<Produit> getAllProducts()
    {
        return (produitRepository.findAll());

    }

    public Produit add(String nom,String quantite){

        Produit cap= new Produit(nom,quantite);
        produitRepository.save(cap);

        return(cap);

    }
    public void delete(Integer id){


        produitRepository.delete(id);


    }
}
