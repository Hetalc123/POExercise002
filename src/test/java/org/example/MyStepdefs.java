package org.example;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepdefs {
    HomePage homePage = new HomePage();
    RegistrationResultPage registrationResultPage = new RegistrationResultPage();
    RegistrationFormPage registrationFormPage = new RegistrationFormPage();
    @Given("I am on registration page")
    public void i_am_on_registration_page() {
       homePage.clickOnRegisterButton();
    }
    @When("I enter required registration details")
    public void i_enter_required_registration_details() {
       registrationFormPage.enterRegistrationDetails();
    }
    @Then("I should able to register successfully")
    public void i_should_able_to_register_successfully() {
       registrationResultPage.verifyUserRegisteredSuccesfullyOrNot();
    }

}
