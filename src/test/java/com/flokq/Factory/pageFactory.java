package com.flokq.Factory;

import com.microsoft.playwright.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class pageFactory {
    public Properties init_prop = new Properties();
    private Playwright playwright;
    private Browser browser;
    private BrowserContext browserContext;
    private Page page;
    Properties prop;

    public Page intBrowser(Properties prop) {
        String browserName = prop.getProperty("browser").trim();
        System.out.println("Browser Name is: " + browserName);
        playwright = Playwright.create();
        switch (browserName) {
            case "chrome":
                browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
                break;
            case "firefox":
                browser = playwright.firefox().launch(new BrowserType.LaunchOptions().setHeadless(false));
                break;
            case "chromium":
                browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setChannel("chrome").setHeadless(false));
                break;
            default:
                System.out.println("Please pass the right browser");
                break;
        }
        browserContext = browser.newContext();
        page = browserContext.newPage();
        page.navigate(prop.getProperty("url").trim());
        return page;
    }

    public Properties init_prop() {
        try {
            FileInputStream ip = new FileInputStream("src/test/resources/configuration/configfile");
            init_prop.load(ip);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return init_prop;
    }
}
