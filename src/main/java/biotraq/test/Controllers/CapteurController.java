package biotraq.test.Controllers;

import biotraq.test.Models.Capteur;
import biotraq.test.Service.CapteurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


//Controlleur de requetes du capteur

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class CapteurController {

    @Autowired
    private CapteurService capteurService;

    @RequestMapping("/getAllCapteurs")
    public Iterable<Capteur> getAllCapteurs()
    {
        return capteurService.getAllCapteurs();

    }

    @RequestMapping("/AddCapteur")
    public Capteur AddCapteur(@RequestBody Capteur cap)
    {
        return(capteurService.add(cap.getCapteurNom()));

    }

    @RequestMapping(value="/DeleteCapteur" , method= RequestMethod.DELETE)
    public void DeleteCapteur(@RequestParam(value="capteurId")Integer id)
    {
        capteurService.delete(id);

    }
}
