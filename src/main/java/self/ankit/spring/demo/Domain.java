package self.ankit.spring.demo;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "mongoEx")
public class Domain {

    @Id
    private ObjectId id;

    @Indexed(unique = true)
    private String pankti;

    private String vyakhay;

	public ObjectId getId() {
		return id;
	}

	public void setId(ObjectId id) {
		this.id = id;
	}

	public String getPankti() {
		return pankti;
	}

	public void setPankti(String pankti) {
		this.pankti = pankti;
	}

	public String getVyakhay() {
		return vyakhay;
	}

	public void setVyakhay(String vyakhay) {
		this.vyakhay = vyakhay;
	}

    //getters and setters
    
    
}
