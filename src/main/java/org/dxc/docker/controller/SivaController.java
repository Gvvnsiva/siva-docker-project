package org.dxc.docker.controller;

import org.dxc.docker.model.Siva;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class SivaController {
	@RequestMapping("/display")
public Siva DisplayDetails() {
	Siva siva=new Siva("siva","mech");
	return siva;
	
}
}
