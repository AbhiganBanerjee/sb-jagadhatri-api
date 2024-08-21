package in.spring.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.spring.document.Jagadhatri;
import in.spring.services.JagadhatriService;

@RestController
public class JagadhatriRestController {
	
	//Inject the Service interface ref
	@Autowired
	private JagadhatriService service;
	
	//Create a POST Mapped method to add new Pic
	@PostMapping("/addPic")
	public ResponseEntity<String> addPic(@RequestBody Jagadhatri j){
		//Call the service interface method
		Jagadhatri inserted = service.addPic(j);
		
		//Validate if it is inserted or not and then return response
		if(inserted.get_id()!=null) {
			return new ResponseEntity<String>("Inserted :)",HttpStatus.CREATED);
		}else {
			return new ResponseEntity<String>("Failded :(", HttpStatus.UNAUTHORIZED);
		}
	}
	
	//Create a GET Mapped method to get all Pics
	@GetMapping("/getPics")
	public List<Jagadhatri> getPics(){
		//Call the service getall method
		return service.getAllPics();
	}
	
	//Create a GET Mapped method to get all the years
	@GetMapping("/getYears")
	public List<String> getYears(){
		//call the service class get years method
		return service.getAllYears();
	}
	
	//Create a GET Mapped method that takes PathParam year
	//And return pics based on year passed as Path Parameter
	@GetMapping("/getPicByYear/{year}")
	public List<Jagadhatri> getPicByYear(@PathVariable("year") String year){
		//call the service method
		return service.getPicsByYear(year);
	}
}
