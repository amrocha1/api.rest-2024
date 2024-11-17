package dio.api.rest2024.domain.repository;

import dio.api.rest2024.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRespository extends JpaRepository<User, Long> {

}
