package au.com.edimoto.repository;

import au.com.edimoto.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by edicson on 12/3/17.
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long>, UserRepositoryOperations {
    User findByUserName(String userName);
}
