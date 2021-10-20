package com.akd.microservice.patientrecord.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.akd.microservice.patientrecord.models.patient;

@RestController
@RequestMapping("/patient")
public class PatientController {

	@GetMapping
	public patient getPatient() throws ParseException {
		return new patient(1, "Abir Das", new SimpleDateFormat("dd/MM/yyyy").parse("11/12/1987"));
	}
}
