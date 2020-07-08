package com.example.hospital;

import java.text.DateFormat;
import java.util.Locale;

public class Patients {
	
	    private String patientName;
	    private int patientAge;
	    private String  patientGender;
	    private String symptoms;
	    private String date;
	    private int temperature;
	    Patients (String patientName, int patientAge,String patientGender, String symptoms, String date, int temperature)
	    {
	        this.patientName= patientName;
	        this.patientGender= patientGender;
	        this.patientAge=patientAge;
	        this.symptoms=symptoms;
	        this.date=date;
	        this.temperature=temperature;
	    }
		public String getPatientName() {
			return patientName;
		}
		public void setPatientName(String patientName) {
			this.patientName = patientName;
		}
		public int getPatientAge() {
			return patientAge;
		}
		public void setPatientAge(int patientAge) {
			this.patientAge = patientAge;
		}
		public String getPatientGender() {
			return patientGender;
		}
		public void setPatientGender(String patientGender) {
			this.patientGender = patientGender;
		}
		public String getSymptoms() {
			return symptoms;
		}
		public void setSymptoms(String symptoms) {
			this.symptoms = symptoms;
		}
		public String getDate() {
			return date;
		}
		public void setDate(String date) {
			Locale locale = new Locale("fr", "FR");
			DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.DEFAULT, locale);
			String date1 = dateFormat.format(new date());
			this.date = date1;
		}
		public int getTemperature() {
			return temperature;
		}
		public void setTemperature(int temperature) {
			this.temperature = temperature;
		}   
		 public String toString()
		    {
		        return (patientName+"  "+patientAge+"  "+patientGender +"   "+symptoms+"   "+date+ ""+temperature);
		    }

}
	   

