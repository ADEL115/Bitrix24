package com.nextbasecrm.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions (
        plugin = {"html:target/default-cucumber-reports2",
                "json:target/cucumber2.json"},
        features = "@target/rerun.txt",
        glue = "com/nextbasecrm/step_definitions",
        dryRun = false
)
public class FailedScenarios { }
