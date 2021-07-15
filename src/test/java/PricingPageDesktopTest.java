import io.github.bonigarcia.wdm.config.DriverManagerType;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class PricingPageDesktopTest {

    WebDriver driver;
    int failed, passed;
    String webUrl = "C:/Users/s_abd/Downloads/Webber/pricing.html";




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

    //monthly button below simple pricing test
    @Test
    public void MonthelyButton(){
        StartWebBro();
        driver.get(webUrl);
        timeOut3Sec();
        driver.findElement(By.xpath("/html/body/div/section/div[4]/div[3]/div[1]/button")).click();
    }

    //yearly button below siple pricing test
    @Test
    public void YearlyButton(){
        StartWebBro();
        driver.get(webUrl);
        timeOut3Sec();
        driver.findElement(By.xpath("/html/body/div/section/div[4]/div[3]/div[2]/button")).click();
    }

    //starter chose plan button test
    @Test
    public void StarterChosePlanButton(){
        StartWebBro();
        driver.get(webUrl);
        timeOut3Sec();
        driver.findElement(By.xpath("/html/body/div/section/div[5]/div[2]/div[1]/div[3]/div[9]/button")).click();
    }

    //pro chose plan button test
    @Test
    public void ProChosePlanButton(){
        StartWebBro();
        driver.get(webUrl);
        timeOut3Sec();
        driver.findElement(By.xpath("/html/body/div/section/div[5]/div[2]/div[2]/div[3]/div[9]/button")).click();
    }

    //enterprise chose plan button test
    @Test
    public void EnterpriseChosePlanButton(){
        StartWebBro();
        driver.get(webUrl);
        timeOut3Sec();
        driver.findElement(By.xpath("/html/body/div/section/div[5]/div[2]/div[3]/div[3]/div[9]/button")).click();
    }

    //start free trail button test
    @Test
    public void StartTrile(){
        StartWebBro();
        driver.get(webUrl);
        timeOut3Sec();
        driver.findElement(By.xpath("/html/body/section[2]/div/div[3]/button")).click();
    }




}
