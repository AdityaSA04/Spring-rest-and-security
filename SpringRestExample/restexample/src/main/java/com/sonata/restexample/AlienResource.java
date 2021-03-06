package com.sonata.restexample;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;

@RestController
public class AlienResource {
	@RequestMapping(value = "/aliens", method=RequestMethod.GET,produces = {"application/xml"})
	public List<Alien> getAliens(){
		List<Alien>aliens = new ArrayList<>();
		Alien a1 = new Alien();
		a1.setId(3);
		a1.setName("Alien");
		a1.setPoints(6);
		
		Alien a2 = new Alien();
		a2.setId(5);
		a2.setName("Raja");
		a2.setPoints(5);
		
		aliens.add(a1);
		aliens.add(a2);
		return aliens;
	}
}