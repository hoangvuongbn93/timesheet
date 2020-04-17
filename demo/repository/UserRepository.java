package com.example.demo.repository;
import org.springframework.stereotype.Repository;
import com.example.demo.model.User;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
@Query("SELECT u FROM User u WHERE u.username = :username AND u.password = :password")
 List<User> checkLogin(@Param("username") String username, @Param("password") String password);

}
