package com.example.stockMarket.Controllers;
import com.example.stockMarket.exceptions.NotFoundException;
import com.example.stockMarket.model.*;
import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
@CrossOrigin(origins = "http://localhost:3000")
public class CompanyController {

	@Autowired
	private CompanyService companyservice;
	@Autowired
	private SectorService sectorservice;
	
	@Autowired
  private EntityManager entitymanager;
//	@RequestMapping(value = "/test", method=RequestMethod.GET)
//	public String test(){
//		return "Success";
//	}
	
	@GetMapping("/all")
	public ResponseEntity<List<CompanyEntity>> companylist()
	{ 
		return new ResponseEntity<List<CompanyEntity>>(companyservice.findAllCompany(),HttpStatus.OK);

	}
	
	@GetMapping("/find/{companyId}")
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
    @PostMapping("/addCompany/{sector}")
	public ResponseEntity<String> addCompany(@PathVariable("sector")String sector,
			@RequestBody CompanyEntity companyentity)
	{      
	      
	      
	      
	      TypedQuery<SectorEntity> q1 =   entitymanager.createQuery(" select c from SectorEntity c where c.SectorName =: name",SectorEntity.class);
	        ((javax.persistence.Query) q1).setParameter("name", sector); 
	 
	        
	 
	     SectorEntity c =  (SectorEntity) ((javax.persistence.Query) q1).getSingleResult();//returns 
	       // System.out.println("Look here array" +c.getId());
	       CompanyEntity csmap = new CompanyEntity();
	     companyentity.setSector(c);
	       
	 companyservice.addCompany(companyentity);
	
	
	
	return  new ResponseEntity<String>("Comapny is added"+companyentity.getCompany_Name(), HttpStatus.OK); 
	

	}
		
		
		
    @PutMapping("/companies/{companyId}")
	public ResponseEntity<String> updateCompany(@RequestBody CompanyEntity companyentity,@PathVariable("companyId") Integer companyId){
	    companyservice.updateCompany(companyentity, companyId);
    	
    	return  new ResponseEntity<String>("Comapny is updated" ,HttpStatus.OK); 
		
	}	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

