package com.vytrack.step_definitions;


import com.vytrack.pages.DashboardPage;
import com.vytrack.pages.VehicleCostsPage;
import com.vytrack.utilities.Driver;
import io.cucumber.java.en.And;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import com.vytrack.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreateVehicleCostStepDef {
    DashboardPage dashboardPage = new DashboardPage();
    VehicleCostsPage vehicleCostsPage = new VehicleCostsPage();
    WebDriver driver = Driver.get();
    Actions action = new Actions(driver);

    @Given("the driver hovers over fleet button")
    public void the_driver_clicks_fleet_button() {
        BrowserUtils.waitForPageToLoad(30);
        System.out.println("dashboard page loaded");
        action.moveToElement(dashboardPage.fleetButton).perform();
        System.out.println("hover done ");


    }

    @And("the driver clicks vehicle costs button")
    public void the_driver_clicks_vehicle_costs_button() {
        dashboardPage.vehicleCostsButton.click();
        System.out.println("hoovered button clicked");
    }

    @Given("the driver clicks create vehicle costs button on the page")
    public void the_driver_clicks_create_vehicle_costs_button_on_the_page() throws InterruptedException {
        BrowserUtils.waitForPageToLoad(5);
        System.out.println("loader waited");
        driver.findElement(By.xpath("//*")).click();
        System.out.println("loader mask");
        wait(2);
        BrowserUtils.waitForClickablility(vehicleCostsPage.createVehicleCostsButton, 15);
        System.out.println("15 secs waited");
        vehicleCostsPage.createVehicleCostsButton.click();
        System.out.println("create vehicle button clicked");
    }

}
