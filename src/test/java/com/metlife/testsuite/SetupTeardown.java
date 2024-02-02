package com.metlife.testsuite;

import com.metlife.utilities.WebDriverUtils;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class SetupTeardown {
    @Parameters({"browser"})
    @BeforeMethod
    public void setup(String browser){
        WebDriverUtils.initialize(browser);
    }

    @AfterMethod
    public void teardown(){
        WebDriverUtils.quit();
    }
}
