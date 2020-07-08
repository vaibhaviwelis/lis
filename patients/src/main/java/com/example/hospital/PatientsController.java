package com.example.hospital;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class PatientsController {
       @GetMapping("/patients-json")
       @ResponseBody
	public Patients displayPatients(@RequestParam(name="name",required=false, defaultValue="Stranger") String name) {
    	   
    	
		{   Patients p = new Patients ("Nairobi Flores ",       21,"F","Nausea,Body Ache,Loss of appetite","12 May 2020",     37);
        Patients p1 = new Patients ("Ram Joshi ",               62,"M", "Dry cough","                                         22 May 2020",     65);
        Patients p2 = new Patients ("Lily Singh",                43,"F","Nasal congestion","                                  1 June 2020",     43);
        Patients p3 = new Patients ("Denver Grover",          31,"M","Sore throat","                                       29 May 2020",    89);
        Patients p4 = new Patients("Naitik Suryawanshi ",18,"M","swollen lymph nodes","                             9 June 2020",     45);
        Patients p5= new Patients ("Jessy Shah ",               15,"F","Diarrhea, runny nose","                           29 June 2020",    86);
       System.out.println(p);
       System.out.println(p1);
       System.out.println(p2);
       System.out.println(p3);
       System.out.println(p4);
       System.out.println(p5);
       p.setPatientName(name);
       p.setPatientAge(21);
       p.setPatientGender("F");
       p.setSymptoms("Nausea,Body Ache,Loss of appetite");
       p.setDate("12th May 2020");
       p.setTemperature(37);
       return p;
     } 
	
	
      

}
        
        
		
		
	
		@GetMapping("/patients-html")
		public ModelAndView htmlView(Model model)
		{
			  
			 Patients p = new Patients ("Nairobi Flores ",21,"F","Nausea,Body Ache,Loss of appetite","12 May 2020", 37);
	        Patients p1 = new Patients ("Ram Joshi ",62,"M", "Dry cough","22 May 2020",65);
	        Patients p2 = new Patients ("Lily Singh",43,"F","Nasal congestion","1 June 2020",43);
	        Patients p3 = new Patients ("Denver Grover",31,"M","Sore throat","29 May 2020",89);
	        Patients p5 = new Patients ("Naitik Suryawanshi ",18,"M","swollen lymph nodes","9 June 2020",45);
	        Patients p4= new Patients ("Jessy Shah ",15,"F","Diarrhea,runny nose","29 June 2020",86);
	        System.out.println(p);
	        System.out.println(p1);
	        System.out.println(p2);
	        System.out.println(p3);
	        System.out.println(p4);
	        System.out.println(p5);
             ModelAndView mav = new ModelAndView();
	         mav.addObject("p" ,p);
	         mav.addObject("p1" ,p1);
	         mav.addObject("p2" ,p2);
	         mav.addObject("p3" ,p3);
	         mav.addObject("p4" ,p4);
	         mav.addObject("p5" ,p5);
	         mav.setViewName("clinic.html");
	         return mav;
    }	
		}
			  
		
			
	       
			
	       
		 
	        
				