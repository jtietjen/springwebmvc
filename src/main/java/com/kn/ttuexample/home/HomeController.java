package com.kn.ttuexample.home;

import java.security.Principal;

import com.kn.ttuexample.container.ContainerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {
	@Autowired
	private ContainerService containerService;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index(Principal principal) {
		containerService.listContainers();

		return principal != null ? "home/homeSignedIn" : "home/homeNotSignedIn";
	}
}
