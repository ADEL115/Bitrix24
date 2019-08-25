package com.nextbasecrm.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/default-cucumber-reports",
                  "json:target/cucumber.json",
                  "rerun:target/rerun.txt"
        },
        features = "src/test/resources/com/nextbasecrm/features",
        glue = "com/nextbasecrm/step_definitions",
        tags = "@wip",
        dryRun = false)
public class CukesRunner {
}
