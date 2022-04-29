package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.SchoolEntity;
import com.example.demo.repo.SchoolRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class SchoolServiceImpl implements SchoolService{
	
	private final SchoolRepository schoolRepository;

	@Override
	public SchoolEntity findSchoolByName(String schoolName) {
		
		return schoolRepository.findBySchoolName(schoolName);
	}

	@Override
	public List<SchoolEntity> getAll() {
		
		return schoolRepository.findAll();
	}

}
