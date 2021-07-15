package iPhoneX;

import io.github.bonigarcia.wdm.config.DriverManagerType;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class iphoneHome {

    WebDriver driver;
    int failed, passed;
    String webUrl = "file:///C:/Users/s_abd/Downloads/Webber/home.html";




    //Starts the web brouser Chrome
    public void StartWebBro(){

        ChromeDriverManager.getInstance(DriverManagerType.CHROME).setup();
        this.driver = new ChromeDriver();

    }

    public void timeOut3Sec(){
        try{
            TimeUnit.SECONDS.sleep(3);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }


    //iPhone Screen Test Responsiveness
    @Test
    public void HomeTestIphoneX(){
        StartWebBro();

        Map<String,String> deviceEmulator = new HashMap<>();
        deviceEmulator.put("deviceName", "iPhone X");
        ChromeOptions chromeOpt = new ChromeOptions();
        chromeOpt.setExperimentalOption("mobileEmulation", deviceEmulator);
        this.driver = new ChromeDriver(chromeOpt);
        driver.get(webUrl);

    }

    //nev button
    @Test
    public void NevButton(){
        StartWebBro();

        Map<String,String> deviceEmulator = new HashMap<>();
        deviceEmulator.put("deviceName", "iPhone X");
        ChromeOptions chromeOpt = new ChromeOptions();
        chromeOpt.setExperimentalOption("mobileEmulation", deviceEmulator);
        this.driver = new ChromeDriver(chromeOpt);
        driver.get(webUrl);
        timeOut3Sec();
        driver.findElement(By.xpath("//*[@id=\"menu\"]")).click();

    }

    //get started button
    



    //fold iPhone Screen Test Responsiveness
    @Test
    public void HomeTestGFold(){
        StartWebBro();

        Map<String,String> deviceEmulator = new HashMap<>();
        deviceEmulator.put("deviceName", "Galaxy Fold");
        ChromeOptions chromeOpt = new ChromeOptions();
        chromeOpt.setExperimentalOption("mobileEmulation", deviceEmulator);
        this.driver = new ChromeDriver(chromeOpt);
        driver.get("file:///C:/Users/s_abd/Downloads/Webber/home.html");

    }

}
