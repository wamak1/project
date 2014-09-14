package ca.ulaval.glo4003.projet_de_session.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController 
{
	@RequestMapping("/")
	public String index() {
		return "index";
	}
}
