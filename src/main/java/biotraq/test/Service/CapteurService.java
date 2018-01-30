package biotraq.test.Service;

import biotraq.test.Models.Capteur;
import biotraq.test.Models.CapteurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//couche service du capteur


@Service
public class CapteurService {

    @Autowired
    private CapteurRepository capteurRepository;

    public Iterable<Capteur> getAllCapteurs()
    {
        return (capteurRepository.findAll());

    }

    public Capteur add(String nom){

        Capteur cap= new Capteur(nom);
        capteurRepository.save(cap);

        return(cap);

    }
    public void delete(Integer id){


        capteurRepository.delete(id);


    }
}
