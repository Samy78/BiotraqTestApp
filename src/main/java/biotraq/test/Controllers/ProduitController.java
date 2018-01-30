package biotraq.test.Controllers;

import biotraq.test.Models.Capteur;
import biotraq.test.Models.Produit;
import biotraq.test.Service.CapteurService;
import biotraq.test.Service.ProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


//Controlleur de requetes du produit


@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class ProduitController {

    @Autowired
    private ProduitService produitService;

    @RequestMapping("/getAllProducts")
    public Iterable<Produit> getAllCapteurs()
    {
        return produitService.getAllProducts();

    }

    @RequestMapping("/AddProduit")
    public Produit AddProduit(@RequestBody Produit prod)
    {
        return(produitService.add(prod.getProduitNom(),prod.getProduitQuantite()));

    }

    @RequestMapping(value="/DeleteProduit", method= RequestMethod.DELETE)
    public void DeleteProduit(@RequestParam(value="produitId")Integer id)
    {
        produitService.delete(id);

    }
}
