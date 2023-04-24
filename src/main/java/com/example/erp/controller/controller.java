package com.example.erp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/erp")
/**
 * 메인 페이지
 * 
 * @author a
 *
 */
public class controller {
	@GetMapping("/dashboard")
	public String mainTest() {
		return "main";
	}

	/**
	 * 본인 프로필
	 * 
	 * @return
	 */
	@GetMapping("/pages-profile")
	public String pagesProfile() {

		return "pages-profile";
	}

	@GetMapping("/pages-sign-in")
	public String pagesSignIn() {

		return "pages-sign-in";
	}

	@GetMapping("/pages-sign-up")
	public String pagesSignUp() {

		return "pages-sign-up";
	}

	@GetMapping("/ui-forms")
	public String uiForms() {

		return "ui-forms";
	}

	@GetMapping("/upgrade-to-pro")
	public String upgradeToPro() {

		return "upgrade-to-pro";
	}
}
