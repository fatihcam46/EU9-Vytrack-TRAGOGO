package com.vytrack.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class VehicleCostsPage extends BasePage {

    @FindBy(xpath = "/html/body/div[2]/div[2]/div[1]/div[2]/div[3]/div[2]/div/div/div[2]/a")  //      //a[@title='Create Vehicle Costs']
    public WebElement createVehicleCostsButton;

}
