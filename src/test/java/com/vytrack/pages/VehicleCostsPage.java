package com.vytrack.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class VehicleCostsPage extends BasePage {

    @FindBy(xpath = "//span[text()='Vehicle Costs']")  //      //a[@title='Create Vehicle Costs']
    public WebElement createVehicleCostsButton;

}
