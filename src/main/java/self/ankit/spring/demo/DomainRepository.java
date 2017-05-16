package self.ankit.spring.demo;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DomainRepository extends MongoRepository<Domain, ObjectId> {

    Domain findFirstByPankti(String pankti);

}
