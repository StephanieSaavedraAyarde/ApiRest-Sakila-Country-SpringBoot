package bo.edu.ucb.ingsoft.country;

import java.util.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.MediaType;

@RestController
public class Countryy {

    List<Country> countryList = new ArrayList<>();

    @PostMapping(path="/country", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE )
    public Country listAll(@RequestBody Country country) {
        countryList.add(country);
        return country;
    }
    
}