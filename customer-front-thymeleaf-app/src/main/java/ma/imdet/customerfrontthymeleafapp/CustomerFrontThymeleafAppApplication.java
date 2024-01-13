package ma.imdet.customerfrontthymeleafapp;

import ma.imdet.customerfrontthymeleafapp.entities.Customer;
import ma.imdet.customerfrontthymeleafapp.repository.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CustomerFrontThymeleafAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomerFrontThymeleafAppApplication.class, args);
    }


    @Bean
    CommandLineRunner commandLineRunner(CustomerRepository customerRepository){
        return args -> {
            customerRepository.save(Customer.builder().name("Imad").email("imad@gmail.com").build());
            customerRepository.save(Customer.builder().name("Aya").email("aya@gmail.com").build());
            customerRepository.save(Customer.builder().name("Abdo").email("abdo@gmail.com").build());
        };
    }

}
