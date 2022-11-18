package com.xyz.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class HandleExceptionController {
	
	private static Logger log = (Logger) LoggerFactory.getLogger(ShowController.class);

	public HandleExceptionController() {
		log.info("Handling.. exception in handy .. ");
	}
	
	@ExceptionHandler(value = NullPointerException.class)
	public ResponseEntity<Object> handleException(){
		return new ResponseEntity("Handling custom exceptions ", HttpStatus.EXPECTATION_FAILED);
	}
}
