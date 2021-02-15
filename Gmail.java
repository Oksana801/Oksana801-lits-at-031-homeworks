package com;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

public class Gmail {
    WebDriver driver;

    @BeforeClass
    @Parameters("browser")
    public void verifypageTitle(String browserName) {
        if (browserName.equalsIgnoreCase("microsoft edge")) {
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
        } else if (browserName.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }
    }


    @Test
    public void login() {
        driver.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");

        WebElement loginInput = driver.findElement(By.xpath("//*[@id=\"identifierId\"]"));
        loginInput.sendKeys("sf7290210@gmail.com");
        WebElement button = driver.findElement(By.xpath("//*[@id=\"identifierNext\"]"));
        button.click();
        WebDriverWait wait = new WebDriverWait(driver, 60);// 1 minute
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
        driver.findElement(By.name("password"));
        WebElement passwordInput = driver.findElement(By.name("password"));
        passwordInput.sendKeys("treeS161933");
        WebElement buttonComfirm = driver.findElement(By.xpath("//*[@id=\"passwordNext\"]"));
        buttonComfirm.click();


    }
        @Test
        public void checkSubject() {
            WebDriverWait wait1 = new WebDriverWait(driver, 60);// 1 minute

            wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\":2l\"]/div/div/span")));
            WebElement message = driver.findElement(By.xpath("//*[@id=\":2l\"]/div/div/span"));
            message.click();

            WebElement subject = driver.findElement(By.className("hP"));
        if (driver.getPageSource().contains("test subject")) {
            System.out.println("test subject present");
        } else {
            System.out.println("test subject is not here");
        }
    }
}

