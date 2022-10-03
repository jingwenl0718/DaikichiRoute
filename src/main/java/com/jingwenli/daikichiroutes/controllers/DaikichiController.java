package com.jingwenli.daikichiroutes.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/daikichi")
public class DaikichiController {

	@RequestMapping("")
	public String root() {
		return "Welcome";
	}
	
	@RequestMapping(value="/today", method = RequestMethod.GET)
	public String today() {
		return "Today you will find luck in all your endeavors!";
	}
	
	@GetMapping("/tomorrow")
	public String tomorrow() {
		return "Tomorrow, an opportunity will arise, so be sure to be open to new ideas!";
	}
	
	@GetMapping("/travel/{place}")
	public String travel(@PathVariable("place") String place) {
		return "Congrats! You will soon travel to " + place;
	}
	
	@GetMapping("/lotto/{number}")
	public String numberPath(@PathVariable("number") Integer number) {
		if (number % 2 == 0) {
			return "You will take a grand journey in the near future, but be wary of temping offers.";
		} else {
			return "You have enjoyed the fruits of your labor but now is a great time to spend time with family and friends.";
		}	
	}
	
	@GetMapping("/omikuji") 
	public String showForm() {
		return "omikuji.jsp";
	}
	
	@RequestMapping(value="/omikuji/submit", method=RequestMethod.POST)
	public String submitForm(
		@RequestParam(value="number") Integer number,
		@RequestParam(value="city") String city,
		@RequestParam(value="person") String person,
		@RequestParam(value="hobby") String hobby,
		@RequestParam(value="livingThing") String livingThing,
		@RequestParam(value="compliment") String compliment,
		HttpSession session) {
			
		session.setAttribute("number", number);	
		session.setAttribute("city", city);	
		session.setAttribute("person", person);	
		session.setAttribute("hobby", hobby);	
		session.setAttribute("livingThing", livingThing);
		session.setAttribute("compliment", compliment);	
		
		return "redirect:/daikichi/omikuji/show";
	}
	
	@RequestMapping(value="/omikuji/show")
	public String showOmikuji(HttpSession session, Model model) {
		System.out.println("this is linked");
		Integer number = (Integer) session.getAttribute("number");
		String city = (String) session.getAttribute("city");
		String person = (String) session.getAttribute("person");
		String hobby = (String) session.getAttribute("hobby");
		String livingThing = (String) session.getAttribute("livingThing");
		String compliment = (String) session.getAttribute("compliment");
		
		model.addAttribute("number", number);
		model.addAttribute("city", city);
		model.addAttribute("person", person);
		model.addAttribute("hobby", hobby);
		model.addAttribute("livingThing", livingThing);
		model.addAttribute("compliment", compliment);
		
		return "show.jsp";
	}
	
}
