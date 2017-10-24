package com.cognogistics;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
//import java.time.temporal.ChronoUnit;

/*******************************************************************************************************
 * Stamp Object 
 * 
 * Provides a time stamp of form 'YYYY-MM-DD-hh.mm.ss.sss' in local time.
 * 
 * @author Kurt Schulte
 * @target Java 1.9
 * 
 * v1.0.0	2017.10.23 Initial Version
 * 
 * Copyright (c) 2017 Kurt Schulte
 *
 */

public final class Stamp {
	
	public Stamp() {
				
	}
	
	public static String toText() {
		
		String retval = "";
		Instant this_instant = Instant.now();
		LocalDateTime ldt = LocalDateTime.ofInstant(this_instant, ZoneId.systemDefault());
		retval = ldt.toString().replace("T", "-");
		
	return (retval);
	}

}

