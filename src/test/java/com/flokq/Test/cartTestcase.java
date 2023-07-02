package com.flokq.Test;

import com.flokq.Base.baseClass;
import com.flokq.pages.apartmentBuildingsInSouthJakarta;
import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class cartTestcase extends baseClass {
    private Page page;

        private Browser browser;
        private BrowserContext context;

    @BeforeClass
    public void ApartmentsetUp() {
        Playwright playwright = Playwright.create();
        browser = playwright.chromium().launch();
        context = browser.newContext();
        page = context.newPage();
    }


        @Test
        public void testRentPrivateApartmentSection() {
            page = browser.newPage(); // Initialize the page object
            apartmentBuildingsInSouthJakarta ApartmentCartPage = new apartmentBuildingsInSouthJakarta(page);
            String apartmentCartHeader = ApartmentCartPage.getApartmentBuildingsPageHeader();
            assertEquals(apartmentCartHeader, "2083+ apartments to rent from 123+ apartment buildings in South Jakarta", "Incorrect section title");
        }

    }