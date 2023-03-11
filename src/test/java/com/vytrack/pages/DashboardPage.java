package com.vytrack.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPage extends BasePage {

    @FindBy(xpath = "//span[@class='title title-level-1']")
    public WebElement fleetButton;

    @FindBy(xpath = "//span[text()='Vehicle Costs']")
    public WebElement vehicleCostsButton;
}
