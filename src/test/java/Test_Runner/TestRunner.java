package Test_Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
    
    features= {"Scenario_outline.feature"},
			
    glue= {"Scanario_outline_exmpale.java"},
		 
	dryRun=false,
	
    monochrome=true			


	   )
	public class TestRunner {
	
	
	
	
	 

	}

