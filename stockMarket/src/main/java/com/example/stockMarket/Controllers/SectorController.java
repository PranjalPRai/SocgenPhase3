package com.example.stockMarket.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.stockMarket.model.CompanyEntity;
import com.example.stockMarket.model.SectorEntity;
import com.example.stockMarket.service.SectorService;

@RestController
@RequestMapping("/sector")
public class SectorController {
	@Autowired  
	SectorService sectorservice;
	  
	  
	  @GetMapping("/all")
		public ResponseEntity<List<SectorEntity>> sectorlist()
		{
			return new ResponseEntity<List<SectorEntity>>(sectorservice.getAllSector(),HttpStatus.OK);
			
		}
	  
	  
	  @GetMapping("/{sectorid}")
		public ResponseEntity<SectorEntity> sectorbyId(@PathVariable("sectorid") Integer sectorid)
		{
			return new ResponseEntity<SectorEntity>(sectorservice.getSectorById(sectorid),HttpStatus.OK);

	   }
    


       @PostMapping("/addSector/{sectorname}")
       public ResponseEntity<String> addSector(@PathVariable("sectorname")String sectorname,
		@RequestBody SectorEntity sectorentity)
       {      
       //SectorEntity secentity= new SectorEntity();
       //secentity.setSectorName(sectorname);
       sectorservice.addsector(sectorentity);


       return  new ResponseEntity<String>("Sector is added", HttpStatus.OK); 


       }
       
       
}
