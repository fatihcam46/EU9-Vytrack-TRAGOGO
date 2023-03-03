package com.vytrack.step_definitions;

import com.vytrack.pages.CreateVehicleCostPage;
import com.vytrack.utilities.Driver;
import io.cucumber.java.en.And;
import org.openqa.selenium.interactions.Actions;
import com.vytrack.utilities.BrowserUtils;
import io.cucumber.java.en.Given;

public class CreateVehicleCostStepDef {
    Actions actions = new Actions(Driver.get());
    CreateVehicleCostPage fleet = new CreateVehicleCostPage();
    @Given("the driver hovers over fleet button")
    public void the_driver_clicks_fleet_button() {
        BrowserUtils.waitFor(30);
        System.out.println("logged in");
        actions.moveToElement(fleet.fleetButton).perform();
        BrowserUtils.waitFor(4);
        System.out.println("hover done ");

    }

    @And("the driver clicks vehicle costs button")
    public void the_driver_clicks_vehicle_costs_button() {
        fleet.vehicleCostsButton.click();
        System.out.println("hover done ");
    }


    @And("the driver clicks vehicle costs button on the page")
    public void the_driver_clicks_vehicle_costs_button_on_the_page() {
        fleet.createVehicleCostsButton.click();
    }


}
