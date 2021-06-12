package com.Mihigo.university_intake.view;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class ViewControll {
	
	
	@RequestMapping("/")
	public String root(Model model) {
		return "index";
	}
	
	@RequestMapping("/newStudent")
	public String newStudent(Model model) {
		return "NewStudent";
	}
	
	
	@RequestMapping("/newFaculty")
	public String newFaculty(Model model) {
		return "FacultyForm";
	}
	
}
