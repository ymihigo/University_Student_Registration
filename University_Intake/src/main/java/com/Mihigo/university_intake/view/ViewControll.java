package com.Mihigo.university_intake.view;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
public class ViewControll {
	
	public String root(Model model) {
		return "index";
	}
	
}
