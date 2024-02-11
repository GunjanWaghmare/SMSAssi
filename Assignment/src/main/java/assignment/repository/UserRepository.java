package assignment.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import assignment.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>{

    @Transactional
    @Modifying
    @Query("UPDATE User u SET u.username = :username WHERE u.id = :id")
    void updateUser(@Param("id") Long id, @Param("username") String username);

    List<User> findByUsername(String username);
}
