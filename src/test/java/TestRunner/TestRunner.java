package TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class) //JUNit  multiple file---
@CucumberOptions(features="src\\test\\java\\Features\\scenarioOutline.feature",
				 glue= {"StepDefintion"},
				 dryRun=false, // if true, it will just mapping
				 monochrome=true, //For pretty format
				 //for report generation
				 plugin = { "pretty", "json:target/cucumber-json-reports/Cucumber.json",
						    "junit:target/cucumber-xml-reports/XMLCucumber.xml",
						    "html:target/cucumber-html-reports"}
				// tags= {"@Smoke","@Regression"}//Groups


				)
public class TestRunner {

}


//OR- {"@Smoke,@Sanity"}
//NOt- {"~@Smoke"}
//AND- {"","",""}

/*
plugin- parameter{"pretty"----for proper file format
json (file type):folderpath/name /filename.extension
}
*/


/*
 * 
 * */

 
