package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.modelo.Doctor;
import com.example.demo.repository.IDoctorRepository;

public class DoctorServiceImpl implements IDoctorService{
	
	@Autowired
	private IDoctorRepository doctorRepository;
	
	@Override
	public void insertar(Doctor d) {
		this.doctorRepository.insertar(d);
		
	}

	@Override
	public Doctor buscar(Integer id) {
		return this.doctorRepository.buscar(id);
	}

	@Override
	public void actualizar(Doctor d) {
		this.doctorRepository.actualizar(d);
		
		
	}

	@Override
	public void eliminar(Integer id) {
		this.doctorRepository.eliminar(id);
		
		
	}

}
