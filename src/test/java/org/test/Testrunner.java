package org.test;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources",glue="org.test",tags={"@smoke"},
        plugin= {"pretty",
        "json:src\\test\\resources\\report\\JsonReport\\jsonreport.json",
        "html:src\\test\\resources\\report",
        "junit:src\\test\\resources\\report\\JunitReport\\report.xml"})
public class Testrunner {
	@AfterClass
        public static void report() {
			JVMReport.genarateJVMReport("src\\test\\resources\\report\\JsonReport\\jsonreport.json");
             System.out.println("----done----");
		}
}
