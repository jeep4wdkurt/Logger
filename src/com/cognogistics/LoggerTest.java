package com.cognogistics;

import com.cognogistics.Logger;

public class LoggerTest {

	public static void main(String[] args) {

		System.out.println("Testing Logger class.");

		// Test sysout only
		Logger log1 = new Logger();
		log1.enableSysout(true);
		log1.barf("Test1: Sysout only");
		log1 = null;
		
		//test file and sysout via (specified via constructor)
		Logger log2 = new Logger("output.txt",true);
		log2.barf("Test2: Sysout and a file...");
		log2.barf("       called 'output.txt'.");
		log2 = null;
		
		//test file only.
		Logger log3 = new Logger();
		log3.setFile("output2.txt");
		log3.barf("Test3: Output just to a file...");
		log3.barf("       called 'output2.txt'.");
		log3 = null;
		
		System.out.println("All tests complete.");
		
	}

}
