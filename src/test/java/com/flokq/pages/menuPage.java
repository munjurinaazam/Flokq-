package com.flokq.pages;

import com.microsoft.playwright.Page;

public class menuPage {
    private Page page;
    private String apartmentLink="a[title='APARTMENTS']";
    private String propertiesLink="a[title='PROPERTIES']";
    private String livingLink="a[title='FLOKQ LIVING']";
    private String membershipLink="a[title='MEMBERSHIP']";
    private String communityLink="a[title='COMMUNITY']";
    private String businessLink ="a[title='BUSINESSES']";
    private String haveASpaceLink="span[class='nav-link dropdown-toggle']";
    private String agentsLink="a[title='AGENTS']";
    private String landlordLink="a[title='LANDLORDS']";

    public menuPage(Page page){
        this.page=page;
    }

    public void clickApartmentLink(){
        page.click(apartmentLink);
        page.navigate("https://www.flokq.com/rent-apartment-jakarta/en");
    }
    public void clickPropertyLink(){
        page.click(propertiesLink);
        page.navigate("https://www.flokq.com/apartment-jakarta/en");
    }
    public void clickLivingLink(){
        page.click(livingLink);
        page.navigate("https://www.flokq.com/flokq-living/en");
    }
    public void clickMembershipLink(){
        page.click(membershipLink);
        page.navigate("https://www.flokq.com/membership/en");
    }
    public void clickCommunityLink(){
        page.click(communityLink);
        page.navigate("https://www.flokq.com/community/en");
    }
    public void clickBusinessLink(){
        page.click(businessLink);
        page.navigate("https://www.flokq.com/business/en");
    }
    public menuPage clickHaveaSpaceLink(){
        page.click(haveASpaceLink);
        return this;
    }
//    //Submenu
//    public void clickSubmenuItem1(String AGENTS) {
//        String submenuLocator1 = String.format(agentsLink, AGENTS);
//        page.click(submenuLocator1);
//    }
//    public void clickSubmenuItem2(String LANDLORDS) {
//        String submenuLocator2 = String.format(landlordLink, LANDLORDS);
//        page.click(submenuLocator2);
//    }
    public menuPage clickAgentsLink(){
        page.click(agentsLink);
        page.navigate("https://www.flokq.com/agents/en");
        return this;
    }
    public menuPage clickLandlordLink(){
        page.click(landlordLink);
        page.navigate("https://www.flokq.com/landlords/en");
        return this;
    }

}
