package com.metlife.pageobjects;

import org.openqa.selenium.By;

public class HomePage {
    public static By src_ip = By.id("src");
    public static By first_list_item = By.className("sc-iwsKbI");
    public static By dest_ip = By.id("dest");
    public static By calendar_container = By.className("dPBSOp");
    public static By month_txt = By.xpath("(//div[@class='DayNavigator__IconBlock-qj8jdz-2 iZpveD'])[2]");
    public static By next_btn = By.xpath("(//div[@class='DayNavigator__IconBlock-qj8jdz-2 iZpveD'])[3]");
    public static By date_4 = By.xpath("//div[starts-with(@class,'DatePicker__CalendarContainer')]//span[text()='4']");
    public static By search_btn = By.id("search_button");
}
