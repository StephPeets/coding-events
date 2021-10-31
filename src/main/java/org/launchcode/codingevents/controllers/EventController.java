package org.launchcode.codingevents.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


import java.util.*;

@Controller
public class EventController {

	private static HashMap<String, String > events = new HashMap<>();

	@GetMapping("/")
	public String displayAllEvents(Model model){
		events.put("Menteaship","A fun meetup for connecting with mentors");
		events.put("Code With Pride","A fun meetup sponsored by LaunchCode");
		events.put("Javascripty", "An imaginary meetup for Javascript developers");

		model.addAttribute("title", "Events");
		model.addAttribute("events", events);;
		return "index";
	}

}
