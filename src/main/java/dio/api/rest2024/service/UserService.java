package dio.api.rest2024.service;

import dio.api.rest2024.domain.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);
}
