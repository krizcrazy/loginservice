package com.exhuberant.loginservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.exhuberant.loginservice.SchoolHandle;



@Controller
@RequestMapping("login")
public class LoginController {
	@Autowired
	private SchoolHandle schoolController;
	/*
	private DistanceTime distance;

	@Autowired
	public void setDistance(DistanceTime distance) {
		this.distance = distance;
	}

	*/
	
	 @GetMapping("/name")
    public String getControllerName()
    {
		System.out.println("Hello  LoginSSSS");
        return "StudentController - www.SpringBootDev.com";
    }
	@GetMapping("sample")
	@CrossOrigin
	public void getLogin() {
		System.out.println("Hello  Login");
		schoolController.getAllSchool();
	}

	/*@PostMapping("distances")	
	public ResponseEntity<DistanceResponse> getAllDistances(@RequestBody List<GeographicalAdress> destinations) {
		
		System.out.println("REceived requ:Krishna");
		ObjectMapper mapper = new ObjectMapper();
		DistanceResponse distanceResponse = new DistanceResponse();

		try {
			
			System.out.println(destinations.toString());
			GeographicalAdress origin = new GeographicalAdress("11.22.33","44.55.66");
			String response = distance.calculate(origin, destinations);
			distanceResponse = mapper.readValue(response, DistanceResponse.class);
			
		} catch (IOException e) {

			e.printStackTrace();
		}
	
		return new ResponseEntity<DistanceResponse>(distanceResponse, HttpStatus.OK);
	}
	
	
	public static void main(String args[])
	{
		
		
		
		ObjectMapper mapper = new ObjectMapper();
		DistanceResponse distanceResponse = new DistanceResponse();

		try {
			
			List<GeographicalAdress> list = new ArrayList<GeographicalAdress>();
			GeographicalAdress ga= new GeographicalAdress("11.22.33", "44.55.66");
			mapper.writeValue(new File("D:/ADDRESS2.json"),ga );
			
		} catch (IOException e) {

			e.printStackTrace();
		}
	
		
	}*/
}