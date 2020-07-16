package com.techtorial.appiumIntro;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class AppiumIntro1 {
    @Test
    public void intro1(){
        File apkFile= new File("src\\test\\resources\\AppiumPractice.apk");
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();

        desiredCapabilities.setCapability("deviceName","scriptedpvpAppium");
        desiredCapabilities.setCapability("platformName","android");
        desiredCapabilities.setCapability("automationName","uiautomator2");
        desiredCapabilities.setCapability("app",apkFile.getAbsolutePath());

        URL url;
        try {


            url = new URL("http://localhost:4723/wd/hub");
        }catch (MalformedURLException ex){
            throw new RuntimeException(ex);
        }
        AndroidDriver<AndroidElement> androidDriver = new AndroidDriver(url,desiredCapabilities);
        AndroidElement element = androidDriver.findElement(By.xpath("//android.widget.TextView[@text='Accessibility']"));
        element.click();
        androidDriver.navigate().back();
        AndroidElement element1 = androidDriver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Animation\"]"));
        element1.click();
        androidDriver.navigate().back();
        AndroidElement element2 = androidDriver.findElement(By.xpath("//android.widget.TextView[@index='2']"));
        element2.click();
        androidDriver.navigate().back();
        AndroidElement element3 = androidDriver.findElement(By.xpath("//android.widget.TextView[@index='3']"));
        element3.click();
        androidDriver.navigate().back();
        AndroidElement element4 = androidDriver.findElement(By.xpath("//android.widget.TextView[@index='4']"));
        element4.click();
        androidDriver.navigate().back();
        AndroidElement element5 = androidDriver.findElement(By.xpath("//android.widget.TextView[@index='5']"));
        element5.click();
        androidDriver.navigate().back();
        AndroidElement element6 = androidDriver.findElement(By.xpath("//android.widget.TextView[@index='6']"));
        element6.click();
        androidDriver.navigate().back();
        AndroidElement element7 = androidDriver.findElement(By.xpath("//android.widget.TextView[@index='7']"));
        element7.click();
        androidDriver.navigate().back();
        AndroidElement element8 = androidDriver.findElement(By.xpath("//android.widget.TextView[@index='8']"));
        element8.click();
        androidDriver.navigate().back();
        AndroidElement element9 = androidDriver.findElement(By.xpath("//android.widget.TextView[@index='9']"));
        element9.click();
        androidDriver.navigate().back();
        AndroidElement element10 = androidDriver.findElement(By.xpath("//android.widget.TextView[@index='10']"));
        element10.click();
        androidDriver.navigate().back();


    }


}
