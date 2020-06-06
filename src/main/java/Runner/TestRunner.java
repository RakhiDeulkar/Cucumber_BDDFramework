package Runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"C:\\Eclipse\\eclipse-java-oxygen-3a-win32-x86_64\\eclipse workspace\\FreeCrmBDDframework\\src\\main\\java\\Features\\taggedhooks.feature"},//the path of feature files
        glue= {"stepDefinition"},  //the path of stepdefinition file
        format= {"pretty","html:test-output","json:json_output/cucumber.json","junit:junit_xml/cucumber.xml"},//to generate different types of reporting
        dryRun=false,     //to check the mapping is proper between feature file and step  def file
        monochrome=true,  //display the console ouput in properreadable format(False-bad output will show)It removes 32 m etc
        strict=true       //it will check if any step is not defined  in step def file
		//tags = {"~@RegressionTest","~@SmokeTest","~@End2End"}
		)
 

public class TestRunner{

}
//tags ="@RegressionTest" --execute only tests tagged as @RegressionTest
//OR: tags = {"@RegressionTest , @SmokeTest"} --execute all tests tagged as @SmokeTest OR @RegressionTest
//AND: tags = {"@RegressionTest" , "@SmokeTest"} --execute all tests tagged as @SmokeTest AND  @RegressionTest
//ignore:tags = {"@RegressionTest","~@SmokeTest"}----execute only tests tagged as  @RegressionTest
