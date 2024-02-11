package assignment.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import assignment.entity.Client;
import assignment.entity.Company;

public interface ClientRepository extends JpaRepository<Client, Long> {
    
    boolean existsByCompany(Company company);
}
