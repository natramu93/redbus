package com.metlife.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WebDriverUtils {
    static WebDriver driver;
    static WebDriverWait wait;
    public static void initialize(String browser){
        switch(browser) {
            case "firefox":
                driver = new FirefoxDriver();
                break;
            case "edge":
                driver = new EdgeDriver();
                break;
            default:
                ChromeOptions opt = new ChromeOptions();
                opt.addArguments("--disable-notifications");
                driver = new ChromeDriver(opt);
                break;
        }
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }

    public static void quit(){
        driver.quit();
    }

    public static void navigate(String url){
        driver.get(url);
    }

    public static void type(By locator, String value){
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        driver.findElement(locator).clear();
        driver.findElement(locator).sendKeys(value);
    }

    public static String getText(By locator){
        return driver.findElement(locator).getText();
    }

    public static void click(By locator){
        wait.until(ExpectedConditions.elementToBeClickable(locator));
        driver.findElement(locator).click();
    }

}
