package com.example.demo.repository;

import com.example.demo.modelo.Doctor;

public interface IDoctorRepository {

	public void insertar(Doctor d);
	
	public Doctor buscar(Integer id); 
	
	public void actualizar(Doctor d);
	
	public void eliminar(Integer id);
}
