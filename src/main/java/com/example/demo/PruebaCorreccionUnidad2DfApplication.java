package com.example.demo;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.modelo.Doctor;
import com.example.demo.modelo.Paciente;
import com.example.demo.service.IDoctorService;
import com.example.demo.service.IPacienteService;

@SpringBootApplication
public class PruebaCorreccionUnidad2DfApplication implements CommandLineRunner {

	@Autowired
	private IDoctorService doctorService;

	@Autowired
	private IPacienteService iPacienteService;

	public static void main(String[] args) {
		SpringApplication.run(PruebaCorreccionUnidad2DfApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		// 1
		Doctor doc1 = new Doctor();
		doc1.setCedula("05034543");
		doc1.setNombre("Anibal");
		doc1.setApellido("Carvajal");
		doc1.setFechaNacimiento(LocalDateTime.of(2001, 04, 3, 0, 0));
		doc1.setNumeroConsultorio("30A");
		doc1.setCodigoSenescyt("A567");
		doc1.setGenero("M");

		Doctor doc2 = new Doctor();
		doc2.setCedula("0439935");
		doc2.setNombre("Cristian");
		doc2.setApellido("Aguilera");
		doc2.setFechaNacimiento(LocalDateTime.of(1998, 3, 2, 0, 0));
		doc2.setNumeroConsultorio("12F");
		doc2.setCodigoSenescyt("F896");
		doc2.setGenero("M");

//		this.doctorService.insertar(doc1);
//		this.doctorService.insertar(doc2);

		// 2

		Paciente paci1 = new Paciente();
		paci1.setCedula("953834245");
		paci1.setNombre("Ana");
		paci1.setApellido("Castillo");
		paci1.setFechaNacimiento(LocalDateTime.of(1999, 3, 1, 0, 0));
		paci1.setCodigoSeguro("23");
		paci1.setEstatura(1.57);
		paci1.setPeso(50.3);
		paci1.setGenero("F");

		Paciente paci2 = new Paciente();
		paci2.setCedula("65475758");
		paci2.setNombre("Jerson");
		paci2.setApellido("Narvaez");
		paci2.setFechaNacimiento(LocalDateTime.of(1999, 8, 1, 0, 0));
		paci2.setCodigoSeguro("567");
		paci2.setEstatura(1.77);
		paci2.setPeso(70.3);
		paci2.setGenero("M");

//		this.iPacienteService.insertar(paci1);
//		this.iPacienteService.insertar(paci2);

	}

}
