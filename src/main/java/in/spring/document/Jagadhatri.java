package in.spring.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "jagadhatri")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Jagadhatri {
	@Id
	private String _id;
	
	private String title;
	private String year;
	private String desc;
	private String image;
}
