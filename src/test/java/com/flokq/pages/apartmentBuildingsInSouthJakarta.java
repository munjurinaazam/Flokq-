package com.flokq.pages;

import com.microsoft.playwright.ElementHandle;
import com.microsoft.playwright.Page;

public class apartmentBuildingsInSouthJakarta {
    private  Page page;
    private String apartmentBuildingspageHeader="div[class='page-section--content flokq-slim-bar__desktop'] div[class='page-section--slim-bar']";
    private String cartImage=".fl-apartment-card__image[src='/_next/image?url=https%3A%2F%2Fstorage.googleapis.com%2Fwebsite-prod-storage%2Fdc3dce1ea37c4b8e86cf3da734a73c38.jpg&w=3840&q=75']";
    private String cartTitle="//h3[normalize-space()='Casa Grande']";
    private String cartcity="//div[@id='__next']//div[1]//article[1]//div[2]//div[1]//div[1]//address[1]//a[1]";
    private String cartLocation="South Jakarta";


    public apartmentBuildingsInSouthJakarta(Page page) {
        this.page = page;
    }

    public String getApartmentBuildingsPageHeader() {
        return page.innerText(apartmentBuildingspageHeader);
    }

    public int getApartmentBuildingsPageHeaderCount() {
        return page.querySelectorAll(apartmentBuildingspageHeader).size();
    }

    public String getApartmentBuildingsCartImage() {
        return page.getAttribute(cartImage, "https://www.flokq.com/_next/image?url=https%3A%2F%2Fstorage.googleapis.com%2Fwebsite-prod-storage%2F68ac2f294b5a471199823edd103765c4.jpg&w=1920&q=75");
    }

    public String getApartmentBuildingspageTitle(int index) {
        ElementHandle apartmentCard = page.querySelectorAll(cartTitle).get(index);
        return apartmentCard.innerText();
    }

    public String getApartmentBuildingspageCity(int index) {
        ElementHandle apartmentCity = page.querySelectorAll(cartcity).get(index);
        return apartmentCity.innerText();
    }

    public String getApartmentBuildingspageLocation(int index) {
        ElementHandle apartmentLocation = page.querySelectorAll(cartLocation).get(index);
        return apartmentLocation.innerText();
    }

}
