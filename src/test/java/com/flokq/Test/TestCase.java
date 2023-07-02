package com.flokq.Test;

//import com.flokq.Base.pageFactory;
import com.flokq.Base.baseClass;
import com.flokq.pages.menuPage;
import com.microsoft.playwright.Page;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase extends baseClass {
//    private pageFactory pf;
    private Page page;
//   private apartmentpage ApartmentPage;
//     private  menuPage MenuPage;
//    private Properties prop;

    @Test
    public void ApartmentpageURLTest() throws InterruptedException {
        String actualURL = ApartmentPage.getApartmentPageURL();
        Assert.assertEquals(actualURL, "https://www.flokq.com/apartment-south-jakarta/en");
        Thread.sleep(3000);
    }


    @Test
    public void ApartmentPageHeaderTest() throws InterruptedException {
        String actualTitle = ApartmentPage.getApartmentTitle();
        Assert.assertEquals(actualTitle, "Rent Apartment in South Jakarta, Pay Monthly | Flokq");
        System.out.println(actualTitle);
        Thread.sleep(3000);
    }

    @Test
    public void ApartmentPageLogoTest() throws InterruptedException {
//        String expectedLogo = "https://www.flokq.com/_next/image?url=https%3A%2F%2Fprod-cdn.flokq.com%2Fprod-22%2F_next%2Fstatic%2Fmedia%2Flogo-main.c9f35947.png&w=128&q=75";
//        String actualLogo = ApartmentPage.getApartmentLogo();
//        Assert.assertEquals(actualLogo, expectedLogo);
//        page.click(actualLogo);
//        page.navigate("https://www.flokq.com/en");
//        Thread.sleep(3000);
        // Navigate to the apartment page
//        page.navigate("https://www.flokq.com/apartment-south-jakarta/en");

        page.navigate("https://www.flokq.com/apartment-south-jakarta/en");

        // Get the apartment logo
        String logoAltText = ApartmentPage.getApartmentLogo();

        // Assert that the logo alt text is not empty
        Assert.assertNotNull(logoAltText, "Apartment logo alt text is not displayed.");

        // Assert that the logo alt text matches the expected value
        String expectedLogoAltText = "Flokq Logo";
        Assert.assertEquals(logoAltText, expectedLogoAltText, "Apartment logo alt text is incorrect.");
    }

//    MenuPage
@Test
    public void ApartmentMenuNavigation(){
    menuPage MenuPage = new menuPage(page);
    MenuPage.clickApartmentLink();
    MenuPage.clickPropertyLink();
    MenuPage.clickLivingLink();
    MenuPage.clickMembershipLink();
    MenuPage.clickCommunityLink();
    MenuPage.clickBusinessLink();
    MenuPage.clickHaveaSpaceLink();
    MenuPage.clickAgentsLink();
    MenuPage.clickLandlordLink();
}
//2083+ apartments to rent from 123+ apartment buildings in South Jakarta


}

