package com.flokq.pages;

import com.microsoft.playwright.Page;
import org.testng.annotations.Test;

public class apartmentpage {
    private Page page;
    //String Locators
    private String businesslogo = "//div[@class='img-fluid flokq-logo']//img[@alt='Flokq Logo']";
    private String language = "//span[@class='d-none d-md-inline-block']";
    private String menu = "//button[@class='btn btn-default btn-lg']";
    private String assistanceform = "//a[@class='alert-link']";
    private String pageHeader = "div[id='main-hero-banner'] h1[class='page-section--title']";
    private String searchPageLocation = "//div[contains(@class,'css-19bb58m')]";

    public apartmentpage(Page page) {
        this.page = page;
    }
    public String getApartmentPageURL(){
        String url=page.url();
        System.out.println("URL is:"+url);
        return url ;
    }

    public String getApartmentLogo() {
//        String logo= page.getAttribute("//div[@class='img-fluid flokq-logo']//img[@alt='Flokq Logo']",businesslogo);
//        System.out.println("logo:"+ businesslogo);
//        return  logo;
        return page.getAttribute(businesslogo, "Flokq Logo");
    }

    public String getApartmentTitle() {
        String title = page.title();
        System.out.println("Page Title is: " + pageHeader);
        return title;
    }

    public String getAssistanceform() {
//        String title = page();
        System.out.println("Page Title is: " + assistanceform);
        return assistanceform;
    }

    public String chooseLanguage() {
        System.out.println("Page Title is: " + chooseLanguage());
        return chooseLanguage().trim();
    }

    public apartmentpage doSearch(String productName) {
        page.click(businesslogo);
        page.navigate("https://www.flokq.com/en");
        return this;
    }
}

//        String header=page.textContent(searchPageHeader);
//        System.out.println("Search Header is:"+header);
//        return header;






