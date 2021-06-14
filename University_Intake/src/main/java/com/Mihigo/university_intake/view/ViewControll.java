package com.Mihigo.university_intake.view;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

import com.Mihigo.university_intake.Services.FacultyService;
import com.Mihigo.university_intake.models.Faculty;
import com.Mihigo.university_intake.repository.FacultyRepository;

import net.bytebuddy.asm.Advice.Return;

@Controller
public class ViewControll {
	
	@Autowired
	private FacultyService facServ;
	
	@RequestMapping("/")
	public String root(Model model) {
//		List<Faculty> facList=new ArrayList<>();
//		facList=facRepo.findAll();
//		model.addAttribute("facultylist",facList);
		model.addAttribute("facultylist",facServ.allFaculty());
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
	
	
	@PostMapping("/saveFaculty")
	public RedirectView saveFaculty(Model model,@RequestParam("facultyname") String facname) {
		try {
		facServ.newFaculty(facname);
		return new RedirectView("/");
		}catch (Exception e) {
			// TODO: handle exception
			return new RedirectView("/newFaculty");
		}
	}
	
}
