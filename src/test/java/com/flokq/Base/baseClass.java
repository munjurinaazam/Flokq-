package com.flokq.Base;

import com.flokq.Factory.pageFactory;
import com.flokq.pages.apartmentBuildingsInSouthJakarta;
import com.flokq.pages.apartmentpage;
import com.flokq.pages.menuPage;
import com.microsoft.playwright.*;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Factory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class baseClass {

    private pageFactory pf;
    private Page page;
    protected apartmentpage ApartmentPage;
    protected menuPage MenuPage;
    protected apartmentBuildingsInSouthJakarta ApartmentCartPage;
    //    protected loginPage LoginPage;
    private Properties prop;

    @BeforeTest
    public void setUp() {
        pf = new pageFactory();
        prop = pf.init_prop();
        page = pf.intBrowser(prop);
        ApartmentPage = new apartmentpage(page);

//        HomePage.navigateToLoginPage();
    }

    @AfterTest
    public void tearDown() {
        page.context().browser().close();
    }

}





