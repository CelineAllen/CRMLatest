package net.CRMLatest.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = {"@target/rerun.txt"},
        glue = {"net/CRMLatest/step_definitions"}
)
public class FailedTestRunner {}
