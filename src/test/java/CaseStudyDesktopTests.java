import io.github.bonigarcia.wdm.config.DriverManagerType;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class CaseStudyDesktopTests {


    WebDriver driver;
    int failed, passed;
    String webUrl = "file:///C:/Users/s_abd/Downloads/Webber/caseStudies.html";




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


    //region drop down test
    @Test
    public void RegionDropDown(){
        StartWebBro();
        driver.get(webUrl);
        timeOut3Sec();
        driver.findElement(By.xpath("/html/body/div/section/div[4]/div[3]/div[1]")).click();
        timeOut3Sec();
        driver.findElement(By.xpath("//*[@id=\"#\"]/option[3]")).click();
    }

    //industery drop down button test
    @Test
    public void IndusteryDropDown(){
        StartWebBro();
        driver.get(webUrl);
        timeOut3Sec();
        driver.findElement(By.xpath("/html/body/div/section/div[4]/div[3]/div[2]")).click();
        timeOut3Sec();
        driver.findElement(By.xpath("//*[@id=\"#\"]/option[2]")).click();
    }

    //type drop down test case
    @Test
    public void TypeDropDown(){
        StartWebBro();
        driver.get(webUrl);
        timeOut3Sec();
        driver.findElement(By.xpath("/html/body/div/section/div[4]/div[3]/div[3]")).click();
        timeOut3Sec();
        driver.findElement(By.xpath("//*[@id=\"#\"]/option[4]")).click();
    }

    //adobe read more test
    @Test
    public void AdobeReadMore(){
        StartWebBro();
        driver.get(webUrl);
        timeOut3Sec();
        driver.findElement(By.xpath("//*[@id=\"read-story\"]")).click();

        if (driver.getCurrentUrl().equals("file:///C:/Users/s_abd/Downloads/Webber/CaseStudiesDetail.html")){
            System.out.println("pass adobe read more");
        }
        else{
            System.out.println("failed adobe read more");
        }
    }

}
