package self.ankit.spring.demo;

import org.bson.types.ObjectId;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	
	@Bean
    CommandLineRunner init(DomainRepository domainRepository) {

        return args -> {

            Domain obj = domainRepository.findOne(new ObjectId("591225363ee2961ff0d6254c"));
            System.out.println(obj.getVyakhay());

            Domain obj2 = domainRepository.findFirstByPankti("hindustan meri jaan, meri jaan hindustan");
            System.out.println(obj2.getVyakhay());

           
        };

    }
	
}
