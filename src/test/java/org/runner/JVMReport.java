package org.runner;
import java.io.File;
import java.util.LinkedList;
import java.util.List;

import org.apache.poi.openxml4j.opc.Configuration;

import net.masterthought.cucumber.ReportBuilder;



public  class JVMReport{
	public static void genarateJVMReport(String json) {
		File loc = new File(System.getProperty("user.dir")+"src\\test\\resources\\report\\JVMReport");
        net.masterthought.cucumber.Configuration con = new net.masterthought.cucumber.Configuration(loc,"skytrans");
        List<String> jsonFiles=new LinkedList<>();
        jsonFiles.add(json);
        ReportBuilder r = new ReportBuilder(jsonFiles, con);
        r.generateReports();
	}

}
 
