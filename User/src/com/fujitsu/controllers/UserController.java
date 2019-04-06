package com.fujitsu.controllers;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import com.fujitsu.exceptions.ServiceException;
import com.fujitsu.project.user.User;
import com.fujitsu.services.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/users")
	public String viewAllUsers(HttpSession session)
	{
		try {
			List<User> users=userService.findAllUsers();
			session.setAttribute("userList", users);
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "userview";
	}
	
	@GetMapping("/add")
	public String addUserctForm()
	{
		return "useraddform";
	}
	
	@PostMapping("/addUser")
	public String addUser(User user,ModelMap map)
	{
		try {
			userService.add(user);
			map.addAttribute("message","User "+user.getUserId()+" is added successfully");
			return "success";

		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			map.addAttribute("useradderror","Sorry! User could not be added ");
			return "useraddform";

		}
		
	}
	
	//Request Mapping
	@GetMapping("/edit")
	public String editUserForm() {
		return "usereditform";
	}
	
	@PostMapping("/editUser")
	public String editUser(User user,ModelMap map)
	{
		try {
			userService.update(user);
			map.addAttribute("message","User "+user.getUserId()+" is updated successfully");
			return "success";

		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			map.addAttribute("userediterror","Sorry! Product could not be saved ");
			return "usereditform";

		}
		
	}
	
	@GetMapping("/delete")
	public String deleteUserForm() {
		return "userdeleteform";
	}
	
	@PostMapping("/deleteUser")
	public String deleteUser(User user,ModelMap map)
	{
		try {
			userService.remove(user);
			map.addAttribute("message","User "+user.getUserId()+" is deleted successfully");
			return "success";

		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			map.addAttribute("userdeleteerror","Sorry! user could not be deleted ");
			return "userdeleteform";

		}
		
	}
}
