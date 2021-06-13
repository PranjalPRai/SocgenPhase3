package com.example.stockMarket.Controllers;
import com.example.stockMarket.exceptions.NotFoundException;
import com.example.stockMarket.model.*;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.example.stockMarket.service.*;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@RestController
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@RequestMapping("/company")
public class CompanyController {

	@Autowired
	private CompanyService companyservice;
	
//	@RequestMapping(value = "/test", method=RequestMethod.GET)
//	public String test(){
//		return "Success";
//	}
	
	@GetMapping("/all")
	public ResponseEntity<List<CompanyEntity>> companylist()
	{
		return new ResponseEntity<List<CompanyEntity>>(companyservice.findAllCompany(),HttpStatus.OK);
	}
	
	@GetMapping("/{companyId}")
	public ResponseEntity<CompanyEntity> companybyId(@PathVariable("companyId") Integer companyId)
	{
		return new ResponseEntity<CompanyEntity>(companyservice.findCompanyById(companyId),HttpStatus.OK);
//		CompanyEntity use=companyservice.findCompanyById(companyId);
//		return ResponseEntity.of(Optional.of(use));
   }
	@GetMapping("/delete/{comapnyId}")
	public ResponseEntity<String> deleteCompanyById(@PathVariable("comapnyId")Integer companyId)
	{
		try{companyservice.deleteById(companyId);
		return new ResponseEntity<String>("Company with id = "+companyId +" deleted", HttpStatus.OK);
		
		}
		//throw new NotFoundException("Company with id = "+companyId +" not found");
		//"Company with id = "+companyId +" not found";
		
		catch(IllegalArgumentException e)
		{
			return new ResponseEntity<String>("Company with id = "+companyId +" not found", HttpStatus.OK);
		
		}
		
	}
   

//	@PostMapping("/{companyId}/addDirector")
//	public ResponseEntity<Director> addDirectors(@PathVariable("companyId") Integer companyId,
//												@RequestBody Director director){
//		return new ResponseEntity<>(companyService.addDirector(companyId, director), HttpStatus.OK);
//    }
    @PostMapping("/all/addCompany")
	public ResponseEntity<String> addCompany(@RequestBody CompanyEntity comapanyentity)
	{
		try {
			companyservice.addCompany(comapanyentity);
			return  new ResponseEntity<String>("Comapny is added", HttpStatus.OK); 
		}
		catch(Exception e)
		{return new ResponseEntity<String>("Comapny is already present",HttpStatus.OK);}
		finally {int i=6;} 
		
		
	}
}
