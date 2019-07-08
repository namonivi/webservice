package pizzaloop;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping(path="/demo")
public class MainController {
    @Autowired
    private PizzaRepository pizzaRepository;

  //  private static final String SUCCESS= "Saved";

  //  @GetMapping(path="/all")
   // public @ResponseBody Iterable<pizzaDetails> getPizzaDetails(){
    //    return pizzaRepository.findAll();

    //}

    @GetMapping("/all")
   public List<pizzaDetails> getPizza(){
       return (List<pizzaDetails>) pizzaRepository.findAll();
   }
}
