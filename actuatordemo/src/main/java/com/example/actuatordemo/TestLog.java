package com.example.actuatordemo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestLog {

	private static final Logger logger = LogManager.getLogger(TestLog.class);
	
//	public static void main(String[] args) {	
	
	@GetMapping("/testlog")
	public void testlog() {
		
		logger.trace("Trace Message!");
		logger.debug("Debug Message!");
		logger.info("Info Message!");
		logger.warn("Warn Message!");
		logger.error("Error Message!");
		logger.fatal("Fatal Message!");

	}

}
