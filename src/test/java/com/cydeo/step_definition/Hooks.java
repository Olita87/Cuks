package com.cydeo.step_definition;

import com.cydeo.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import java.io.IOException;

public class Hooks {

    @Before
    public void setup() {
        System.out.println("---> coming before each scenario <-> from Hooks <---");
    }

    @After
    public void teardown(Scenario scenario) throws IOException {
        System.out.println("---> coming after each scenario <-> from Hooks <---");

        if (scenario.isFailed()) {
            byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());

        }
        Driver.closeDriver();
    }

}