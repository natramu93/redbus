package com.metlife.testsuite;

import com.metlife.utilities.WebDriverUtils;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class SetupTeardown {
    @BeforeMethod
    public void setup(){
        WebDriverUtils.initialize();
    }

    @AfterMethod
    public void teardown(){
        WebDriverUtils.quit();
    }
}
