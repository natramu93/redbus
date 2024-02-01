package com.metlife.testsuite;

import com.metlife.data.BookingData;
import com.metlife.pageobjects.HomePage;
import com.metlife.pageobjects.ResultsPage;
import com.metlife.utilities.WebDriverUtils;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.time.Duration;

public class TicketBooking extends SetupTeardown{
    @Test(dataProviderClass = BookingData.class, dataProvider = "bookingData")
    public void no_busses_ticket(String src, String dest, String mnth){

        WebDriverUtils.navigate("http://redbus.in");
        WebDriverUtils.type(HomePage.src_ip,src);
        WebDriverUtils.click(HomePage.first_list_item);
        WebDriverUtils.type(HomePage.dest_ip,dest);
        WebDriverUtils.click(HomePage.first_list_item);
        String month = WebDriverUtils.getText(HomePage.month_txt) ;
        while(!month.contains(mnth)){
            WebDriverUtils.click(HomePage.next_btn);
            month = WebDriverUtils.getText(HomePage.month_txt);
        }
        WebDriverUtils.click(HomePage.date_4);
        WebDriverUtils.click(HomePage.search_btn);
        String msg = WebDriverUtils.getText(ResultsPage.noBusses_txt);
        Assert.assertEquals(msg,"Oops! No buses found.");
    }

}
