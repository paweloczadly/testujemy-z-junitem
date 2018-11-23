package pl.gazeta;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GazetaplTest {


    @Test
    public void wejdzNaStroneGlowna() {
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("http://gazeta.pl");
        webDriver.close();
    }

}
