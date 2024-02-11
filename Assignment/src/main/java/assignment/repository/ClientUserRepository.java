package assignment.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import assignment.entity.ClientUser;

public interface ClientUserRepository extends JpaRepository<ClientUser, Long> {

}
