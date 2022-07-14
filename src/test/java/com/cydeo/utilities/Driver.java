package com.cydeo.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;


    public class Driver {

        private static WebDriver driver;

        public static WebDriver getDriver() {
            if (driver == null) {
                String browserType = ConfigReader.getProperties("browser");
                switch (browserType) {
                    case "c":
                    case "chrome":
                        WebDriverManager.chromedriver().setup();
                        driver = new ChromeDriver();
                        driver.manage().window().maximize();
                        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                        break;
                    case "f":
                    case "firefox":
                    case "fox":
                    case "fire":
                        WebDriverManager.firefoxdriver().setup();
                        driver = new FirefoxDriver();
                        driver.manage().window().maximize();
                        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                        break;
                }
            }
            return driver;
        }

        public static void closeDriver() {
            if (driver != null) {
                driver.quit();
                driver = null;
            }
        }
    }


