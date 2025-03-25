package com.spgtesting.selenium_Basics;

import io.qameta.allure.Description;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium03 {

    @Test
    @Description
    public void testGoogle(){
        //open URL
        EdgeDriver driver=new EdgeDriver();
        //new Edgedriver(); --> Post request (Browser Driver)

        // navigate the URL --> get the URL
        driver.get("https://google.com");

        driver.quit();
    }
}
