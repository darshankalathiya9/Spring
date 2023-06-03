package com.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.Dao.UserDao;
import com.Model.User;

@Controller
public class UserController {
	
	@Autowired
	private UserDao dao;
	
	@RequestMapping("/")
	public String index(Model m) {
		m.addAttribute("name", "Darshan Kalathiya (DK)");
		
		List<String> list = new ArrayList<String>();
		list.add("DK");
		list.add("Bhano");
		list.add("Tirthu");
		m.addAttribute("list", list);
		
		return "index";
	}
	
	@RequestMapping("/register")
	public String register() {
		return "register";
	}
	
	@RequestMapping("/about")
	public String about() {
		return "about";
	}
	
	@RequestMapping("/contact")
	public String contact() {
		return "contact";
	}
	
	@RequestMapping(value="/insertUser",method=RequestMethod.POST)
	public String insertUser(@ModelAttribute User u, Model m) {
		dao.insertOrUpdateUser(u);
		List<User> list = dao.getAllUser();
		m.addAttribute("list",list);
		return "home";
	}

}
