package in.spring.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import in.spring.document.Jagadhatri;
import java.util.List;


public interface JagadhatriRepository extends MongoRepository<Jagadhatri, String> {
	List<Jagadhatri> findByYear(String year);
	
	//Define another Method to findAll pics based on ASC order of Year
	List<Jagadhatri> findAllByOrderByYearAsc();
}
