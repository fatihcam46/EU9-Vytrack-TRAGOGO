package com.vytrack.pages;

import com.vytrack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateVehicleCostPage {
    public CreateVehicleCostPage(){
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "//span[.=\"Vehicle Costs\"]")
    public WebElement fleetButton;

    @FindBy(xpath = "//*[@id=\"main-menu\"]/ul/li[1]/div/div/ul/li[5]/a")
    public WebElement vehicleCostsButton;

    @FindBy(xpath = "//*[@id=\"container\"]/div[2]/div/div/div[2]/a")
    public WebElement createVehicleCostsButton;


}
