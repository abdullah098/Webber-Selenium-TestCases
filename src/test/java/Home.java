import io.github.bonigarcia.wdm.config.DriverManagerType;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.sql.Time;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class Home {

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

    //Nev bar pricing Buttone Test
    @Test
    public void HomeTestDesktopPricingButton(){
        StartWebBro();
        driver.get("file:///C:/Users/s_abd/Downloads/Webber/home.html");

        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.findElement(By.xpath("/html/body/div/section/div[1]/div[1]/div/div[2]/ul/li[3]/a")).click();
        if (driver.getCurrentUrl().equals("file:///C:/Users/s_abd/Downloads/Webber/caseStudies.html")){
            this.passed = +1;
        }
        else{
           this.failed = +1;
        }
//        driver.findElement(By.xpath("/html/body/div/section/div[1]/div[4]/div[2]/div[1]/button")).click();
        

    }

    //Nev Bar faq Button Test
    @Test
    public void HomeTestDesktopFAQbutton(){

        StartWebBro();
        driver.get("file:///C:/Users/s_abd/Downloads/Webber/home.html");
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.xpath("/html/body/div/section/div[1]/div/div[2]/ul/li[4]/a")).click();

    }

    //Nev Bar sign in button test
    @Test
    public void SignInButton(){
        StartWebBro();
        driver.get("file:///C:/Users/s_abd/Downloads/Webber/home.html");
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.xpath("/html/body/div/section/div[1]/div[1]/div/div[3]/button")).click();
    }

    //Front end below get started Button test
    @Test
    public void GetStartedbutton(){
        StartWebBro();
        driver.get(webUrl);
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.xpath("/html/body/div/section/div[1]/div[4]/div[2]/div[1]/button")).click();

    }

    //front end below Learn More button test
    @Test
    public void LearnMoreButton(){
        StartWebBro();
        driver.get(webUrl);
        driver.manage().window().maximize();
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.xpath("/html/body/div/section/div[1]/div[4]/div[2]/div[2]/button")).click();
    }

    //below signup back arrow button test
    @Test
    public void SignupBackArrow(){
        StartWebBro();
        driver.get(webUrl);
        driver.manage().window().maximize();
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.xpath("/html/body/section[2]/div/div[2]/div[1]/div/div[3]/div[2]/button[1]")).click();
    }

    //below sign up farword arrow test
    @Test
    public void SignupFarworArrow(){
        StartWebBro();
        driver.get(webUrl);
        try{
            TimeUnit.SECONDS.sleep(3);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        driver.findElement(By.xpath("/html/body/section[2]/div/div[2]/div[1]/div/div[3]/div[2]/button[2]")).click();
    }

    //built the next big thing below download button test
    @Test
    public void DownloadNow(){
        StartWebBro();
        driver.get(webUrl);
        try{
            TimeUnit.SECONDS.sleep(3);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        driver.findElement(By.xpath("/html/body/section[6]/div/div[2]/button")).click();
    }

    //fotter twitter button test
    @Test
    public void TwitterButton(){
        StartWebBro();
        driver.get(webUrl);
        timeOut3Sec();
        driver.findElement(By.xpath("/html/body/section[7]/footer/div/div[1]/div[2]/button[1]")).click();
    }

    //footer youtube buttin test
    @Test
    public void YoutubeButton(){
        StartWebBro();
        driver.get(webUrl);
        timeOut3Sec();
        driver.findElement(By.xpath("/html/body/section[7]/footer/div/div[1]/div[2]/button[2]")).click();
    }

    //footer About us button test
    @Test
    public void AboutUsbutton(){
        StartWebBro();
        driver.get(webUrl);
        timeOut3Sec();
        driver.findElement(By.xpath("/html/body/section[7]/footer/div/div[2]/div/div[1]/div/div[1]/a")).click();
    }

    //footer blog button test
    @Test
    public void BlogButton(){
        StartWebBro();
        driver.get(webUrl);
        timeOut3Sec();
        driver.findElement(By.xpath("/html/body/section[7]/footer/div/div[2]/div/div[1]/div/div[2]/a")).click();
    }

    //fotter contact us button test
    @Test
    public void ContactUs(){
        StartWebBro();
        driver.get(webUrl);
        timeOut3Sec();
        driver.findElement(By.xpath("/html/body/section[7]/footer/div/div[2]/div/div[1]/div/div[3]/a")).click();
    }

    //footer pricing button test
    @Test
    public void FooterPricing(){
        StartWebBro();
        driver.get(webUrl);
        timeOut3Sec();
        driver.findElement(By.xpath("/html/body/section[7]/footer/div/div[2]/div/div[1]/div/div[4]/a")).click();
    }

    //footer testimonials button test
    @Test
    public void TestomoniolButton(){
        StartWebBro();
        driver.get(webUrl);
        timeOut3Sec();
        driver.findElement(By.xpath("/html/body/section[7]/footer/div/div[2]/div/div[1]/div/div[5]/a")).click();
    }

    //footer help center button test
    @Test
    public void HelpCenter(){
        StartWebBro();
        driver.get(webUrl);
        timeOut3Sec();
        driver.findElement(By.xpath("/html/body/section[7]/footer/div/div[2]/div/div[2]/div/div[1]/a")).click();
    }

    //footer terms of service button test
    @Test
    public void TermsOfServuce(){
        StartWebBro();
        driver.get(webUrl);
        timeOut3Sec();
        driver.findElement(By.xpath("/html/body/section[7]/footer/div/div[2]/div/div[2]/div/div[2]/a")).click();
    }

    //footer legal button test
    @Test
    public void Legal(){
        StartWebBro();
        driver.get(webUrl);
        timeOut3Sec();
        driver.findElement(By.xpath("/html/body/section[7]/footer/div/div[2]/div/div[2]/div/div[3]/a")).click();
    }

    //footer privacy policy button test
    @Test
    public void PrivacyPolicy(){
        StartWebBro();
        driver.get(webUrl);
        timeOut3Sec();
        driver.findElement(By.xpath("/html/body/section[7]/footer/div/div[2]/div/div[2]/div/div[4]/a")).click();
    }

    //footer status button test
    @Test
    public void StatusButton(){
        StartWebBro();
        driver.get(webUrl);
        timeOut3Sec();
        driver.findElement(By.xpath("/html/body/section[7]/footer/div/div[2]/div/div[2]/div/div[5]/a")).click();
    }

    //footer your email address enter test
    @Test
    public void EnterEmailAddress(){
        StartWebBro();
        driver.get(webUrl);
        timeOut3Sec();
        driver.findElement(By.xpath("/html/body/section[7]/footer/div/div[2]/div/div[3]/div/div/div/input")).sendKeys("abc@gmail.com");
    }

    //footer email front arrow button test
    @Test
    public void EmailFrontArrowButton(){
        StartWebBro();
        driver.get(webUrl);
        timeOut3Sec();
        driver.findElement(By.xpath("/html/body/section[7]/footer/div/div[2]/div/div[3]/div/div/button")).click();
    }









}
