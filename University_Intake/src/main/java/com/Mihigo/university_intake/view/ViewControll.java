package com.Mihigo.university_intake.view;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.view.RedirectView;

import com.Mihigo.university_intake.Services.FacultyService;
import com.Mihigo.university_intake.Services.StudentServices;


@Controller
public class ViewControll {
	
	@Autowired
	private FacultyService facServ;
	
	@Autowired
	private StudentServices stuServ;
	
	@RequestMapping("/")
	public String root(Model model) {
		model.addAttribute("facultylist",facServ.allFaculty());
		model.addAttribute("allStudent",this.stuServ.allStudent());
		return "index";
	}
	
	@RequestMapping("/newStudent")
	public String newStudent(Model model) {
		model.addAttribute("facultylist",this.facServ.allFaculty());
		return "NewStudent";
	}
	
	
	@PostMapping("/saveNewStudent")
	public RedirectView saveNewStudent(@RequestParam("stname") String names,@RequestParam("stphone") String phone,@RequestParam("faculty") String facultyid,
			@RequestParam("gender") String gender, @RequestParam("stemail") String email, @RequestParam("filez") MultipartFile file) {
		try {
		stuServ.newStudent(names, phone, email, gender, file, facultyid);
		return new RedirectView("/");
		}catch (Exception e) {
			return new RedirectView("/newStudent");
			// TODO: handle exception
		}
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
	
	@RequestMapping("/deleteStudent/{id}")
	public String deleteStudent(@PathVariable(value = "id") long id,Model model) {
		try {
			this.stuServ.deleteStudent(id);
			return "/";
		}catch (Exception e) {
			return "/newStudent";
		}
		
	}
	
}
