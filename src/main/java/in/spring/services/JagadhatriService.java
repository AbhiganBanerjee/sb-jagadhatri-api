package in.spring.services;

import java.util.List;

import org.springframework.stereotype.Service;

import in.spring.document.Jagadhatri;

@Service
public interface JagadhatriService {
	
	//Create a method to add the Jagadhatri image
	Jagadhatri addPic(Jagadhatri j);
	
	//Create a method to get all the Pics
	List<Jagadhatri> getAllPics();
	
	//Create a method to get all years
	List<String> getAllYears();
	
	//Create a method to get images based on year
	List<Jagadhatri> getPicsByYear(String year);
	
	//Create  a method to Get Pics By ASC order of Year
	List<Jagadhatri> getPicsByYearAsc();
}
