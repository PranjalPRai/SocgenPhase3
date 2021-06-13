package com.example.stockMarket.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.stockMarket.model.*;

import com.example.stockMarket.Dao.*;
import com.example.stockMarket.exceptions.NotFoundException;

//import com.example.stockMarket.exceptions.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
//import com.example.stockMarket.service.*;
@Service
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CompanyServiceImpl implements CompanyService {
   
	@Autowired
	private CompanyDao companyDao;
  
	@Override
	public CompanyEntity findCompanyById(Integer Companyid) {
		
		Optional<CompanyEntity> companycheck = companyDao.findById(Companyid);
		if(companycheck.isPresent())return companycheck.get();
		else  //return new CompanyEntity();
			throw new NotFoundException("Company not found" + Companyid);
	
		
		
	}

	@Override
	public List<CompanyEntity> findAllCompany() {
		//TODO Auto-generated method stub
		return companyDao.findAll();
	
	}

	@Override
	public void deleteById(Integer companyId) {
		companyDao.deleteById(companyId);
		
	}

	

	@Override
	public void addCompany(CompanyEntity companyentity) {
		CompanyEntity ent= companyDao.save(companyentity);
	}
	

}