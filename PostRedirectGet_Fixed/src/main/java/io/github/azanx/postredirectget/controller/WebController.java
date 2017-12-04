/**
 * 
 */
package io.github.azanx.postredirectget.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import io.github.azanx.postredirectget.model.Guest;
import io.github.azanx.postredirectget.repository.GuestRepository;

/**
 * @author Kamil Piwowarski
 *
 */
@Controller
public class WebController {
	
	@Autowired
	GuestRepository guestRepo;

	@GetMapping("/")
	public ModelAndView guestGet() {
		ModelAndView mav = new ModelAndView("guests");
		addGuestList(mav);
		return mav;
	}
	
	@PostMapping("/")
	public String guestPost(@ModelAttribute Guest guest) {
		guestRepo.save(guest);
		return "redirect:/";
	}
	
	void addGuestList(ModelAndView mav) {
		List<Guest> guests = guestRepo.findAll();
		mav.addObject("guests", guests);
		mav.addObject("newGuest", new Guest());
	}
}
