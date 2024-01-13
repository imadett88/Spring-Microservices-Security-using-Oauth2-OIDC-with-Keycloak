package ma.imdet.customerfrontthymeleafapp.repository;

import ma.imdet.customerfrontthymeleafapp.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Long> {
}
