package com.xyz.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.xyz.controller.ShowController;

public class CustomException extends Throwable{
	
	private static Logger log = (Logger) LoggerFactory.getLogger(ShowController.class);

	public CustomException() {
		log.error(getLocalizedMessage());
		log.error("Handling Exceptions .... on the way!");
	}
	
	public CustomException(String messge, String sttusCode) {
		log.error("Please address the issue .... first ! ..");
	}

}
