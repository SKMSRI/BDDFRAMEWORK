Step #1

Configure where you want to store failed scenario details in Runner class

Syntax: "rerun:rerun/failed_scenarios.txt",

Step #2

Create a new Runner class to run the failed scenarios.
Syntax: @CucumberOptions(
        features = {"@rerun/failed_scenarios.txt"}, 
        monochrome = true, 
        plugin = {
        "pretty", "html:target/cucumber-report/single",
        "json:target/cucumber-report/single/rerun_cucumber.json"},
        glue = {"common","sample"}
        )
 
public class FailureRerun extends AbstractTestNGCucumberTests {}