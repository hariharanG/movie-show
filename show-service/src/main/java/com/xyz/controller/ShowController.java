package com.xyz.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/api/v1")
@Slf4j
public class ShowController {
	private static Logger log = (Logger) LoggerFactory.getLogger(ShowController.class);
	public ShowController() {
		log.info("Show controller is on ....");
		// demo exception check point
		// throw new HandleExceptionController();
	}

	@GetMapping("/")
	public ResponseEntity<String> welcome() {
		return ResponseEntity.status(HttpStatus.OK).body("Book your favourite show here..");
	}
}
