package com.cognogistics;

import com.cognogistics.Stamp;
import java.io.FileWriter;
import java.io.IOException;

/*******************************************************************************************************
 * Logger Object 
 * 
 *  A general purpose quick and dirty logging object
 * 
 * @author Kurt Schulte
 * @target Java 1.9
 * 
 * v1.0.0	2017.10.22 Initial Version
 * 
 * Copyright (c) 2017 Kurt Schulte
 *
 */

public class Logger {
	
	private String fileName 	= "";
	private boolean useFile 	= false;
	private boolean useSysout	= false;
	
	// constructor
	public Logger() {
		
	}
	
	public Logger(String aFile, boolean SysoutEnable ) {
		setFile( aFile );
		enableSysout( SysoutEnable );
	}
	
	public void setFile(String aFile) {
		fileName = aFile;
		useFile = true;
	}
	
	public void enableSysout( boolean EnableFlag ) {
		useSysout = EnableFlag;
	}

	public void barf( String text ) {
		
		String outText = Stamp.toText() + " " + text;
		
		if ( !useFile && ! useSysout ) {
			System.out.println("Logger-Error. No log output specified.");
		}

		if ( useFile ) {
			try {
			
				FileWriter fOut = new FileWriter(fileName,true);
				String newLine = System.getProperty("line.separator");
				fOut.write(outText + newLine);
				fOut.close();
				
			}
			catch (IOException ex) {
				System.out.println(ex.getMessage());
			}
		}
		
		if ( useSysout ) {
			System.out.println(outText);
		}

	}
}
