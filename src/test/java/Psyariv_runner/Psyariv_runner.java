package Psyariv_runner;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\Lohith\\eclipse-workspace\\IPT_Psyariv\\src\\test\\java\\Psyariv_feature\\Psyariv.feature",
glue = "Psyariv_stepdef",
monochrome = true,
plugin = {"pretty","html:Reports/HTML_reports.html",
		"json:Reports/reports.json",
		"junit:Reports/Junit_report.xml",
"com.cucumber.listener.ExtentCucumberFormatter:Reports/Extent_report.html"})



public class Psyariv_runner {
	
	@BeforeClass
	public static void setUp()   {
		
	}

}
