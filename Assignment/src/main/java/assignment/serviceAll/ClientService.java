package assignment.serviceAll;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import assignment.entity.Client;
import assignment.repository.ClientRepository;
import assignment.repository.CompanyRepository;

@Service
public class ClientService {

    private final ClientRepository clientRepository;
    private final CompanyRepository companyRepository;

    @Autowired
    public ClientService(ClientRepository clientRepository, CompanyRepository companyRepository) {
        this.clientRepository = clientRepository;
        this.companyRepository = companyRepository;
    }

    public void createClient(Client client) {
        // Implement logic to create client
    }

    
}

