package com.cydeo.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "html:target/cucumber_report.html"
                , "me.jvt.cucumber.report.PrettyReports:target/cucumber"
                , "rerun:target/rerun.txt"
                , "pretty"
        }
        , features = "src/test/resources/features"
        , glue = "com/cydeo/step_definition"
       //, dryRun = true
        , tags = "@wip"
)
public class CukesRunner {

}