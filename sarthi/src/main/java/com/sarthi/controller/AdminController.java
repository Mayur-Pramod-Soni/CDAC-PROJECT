package com.sarthi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.ui.Model;
import com.sarthi.services.AdminService;
@Controller
public class AdminController {

	@Autowired
	private AdminService adminService;
	
	@GetMapping("/Alogin")
	public String Admin()
	{
		return "Adminlogin";
	}
	
	 @GetMapping("/Admingo")
	    public String listdetails(Model model) {
		 
		 model.addAttribute("user",adminService.getAllDetails());
	        return "Admin";
	    }
	 
	 @PostMapping("/Acheck")
		public String check(@ModelAttribute com.sarthi.model.Admin admin)
		{
			if((admin.getUserName().equals("Admin"))&&(admin.getPassword().equals("Admin")))
					{
				            return "redirect:Admingo";
					}
			
				return "redirect:Alogin";
		}
	 
	 @GetMapping("/delete/{id}")
	 public String deleteUser(@PathVariable long id)
	 {
		 System.out.print("Hello");
		 adminService.deleteUserById(id);
		 
		 return "redirect:/Admin";
	 }
}
