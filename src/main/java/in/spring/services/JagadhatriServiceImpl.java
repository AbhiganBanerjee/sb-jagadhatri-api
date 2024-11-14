package in.spring.services;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.spring.document.Jagadhatri;
import in.spring.repo.JagadhatriRepository;

@Service
public class JagadhatriServiceImpl implements JagadhatriService {

	//Inject the repository reference
	@Autowired
	private JagadhatriRepository repo;
	
	@Override
	public Jagadhatri addPic(Jagadhatri j) {
		//Call the repository save method and return inserted document
		return repo.save(j);
	}

	@Override
	public List<Jagadhatri> getAllPics() {
		//Call the repository findAll method to get all docs
		return repo.findAll();
	}

	@Override
	public List<String> getAllYears() {
		//Create a String array containing all years
		String[] years = {"2016","2017","2018","2019","2020","2021","2022","2023","2024"};
	
		//Make this String[] as a list and return it
		return Arrays.asList(years);
	}

	@Override
	public List<Jagadhatri> getPicsByYear(String year) {	
		if(year.equals("All")) {
			return repo.findAll();
		}
		else {
			//Call the findBy method of repository, to get doc by year
			return repo.findByYear(year);
		}
	}
}
