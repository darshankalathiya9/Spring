package com.Controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.Dao.UserDao;
import com.Model.User;

@Controller
public class UserController {
	
	@Autowired
	private UserDao dao;
	
	@RequestMapping("/")
	public String index(Model m) {
		m.addAttribute("name", "Darshan Kalathiya (DK)");
		
		/*
		 * List<String> list = new ArrayList<String>(); list.add("DK");
		 * list.add("Bhano"); list.add("Tirthu"); m.addAttribute("list", list);
		 */
		
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
	
	@RequestMapping("/home")
	public String home(Model m) {
		List<User> list = dao.getAllUser();
		m.addAttribute("list",list);
		return "home";
	}
	
	@RequestMapping(value="/insertUser",method=RequestMethod.POST)
	public String insertUser(@ModelAttribute User u, Model m) {
		dao.insertOrUpdateUser(u);
		List<User> list = dao.getAllUser();
		m.addAttribute("list",list);
		return "home";
	}
	
	@RequestMapping(value="/update/{id}")
	public ModelAndView editUser(@PathVariable("id") int id) {
		User u = dao.getUserByID(id);
		
		ModelAndView m = new ModelAndView();
		m.addObject("u", u);
		
		m.setViewName("update");
		return m;
	}

	@RequestMapping(value="/delete/{id}")
	public RedirectView deleteUser(@PathVariable("id") int id, Model m, HttpServletRequest request) {
		User u = dao.getUserByID(id);
		dao.deleteUser(u);
		
		List<User> list = dao.getAllUser();
		m.addAttribute("list",list);
		
		RedirectView r = new RedirectView();
		r.setUrl(request.getContextPath()+"/home");
		
		return r;		
	}
}
