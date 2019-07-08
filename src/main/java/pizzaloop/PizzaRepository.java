package pizzaloop;

import org.springframework.data.repository.CrudRepository;
import javax.transaction.Transactional;
import java.util.List;
@Transactional
public interface PizzaRepository extends CrudRepository<pizzaDetails,Integer> {

    //List<pizzaDetails> findByPizzaId(Integer id);

   // List<pizzaDetails> deleteByPizzaId(Integer id);
}

