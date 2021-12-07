package projeto.projetoSimplesAPI.repository;

import org.springframework.data.repository.CrudRepository;
import projeto.projetoSimplesAPI.model.UserModel;

public interface UserRepository extends CrudRepository<UserModel, Integer> {
}
