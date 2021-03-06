package de.uulm.llam.repository;

import de.uulm.llam.domain.User;
import org.joda.time.DateTime;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

/**
 * Spring Data JPA repository for the User entity.
 */
public interface UserRepository extends JpaRepository<User, Long> {
  Optional<User> findOneByActivationKey(String activationKey);

  List<User> findAllByActivatedIsFalseAndCreatedDateBefore(DateTime dateTime);

  Optional<User> findOneByEmail(String email);

  Optional<User> findOneByLogin(String login);

  Optional<User> findOneById(Long id);

  void delete(User t);

}
