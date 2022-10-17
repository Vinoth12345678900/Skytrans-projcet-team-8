package org.test;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

import net.masterthought.cucumber.*;
public  class JVMReport{
	public static void genarateJVMReport(String json) {
		File loc = new File(System.getProperty("user.dir")+"\\src\\test\\resources\\report\\JVMReport");
        Configuration con = new  Configuration(loc,"skytrans");
        
        List<String> jsonFiles=new LinkedList<>();
        jsonFiles.add(json);
        ReportBuilder r = new ReportBuilder(jsonFiles, con);
        r.generateReports();
	}
}