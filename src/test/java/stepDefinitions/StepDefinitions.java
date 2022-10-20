package stepDefinitions;

import common.*;
import decathlon.*;
import static org.junit.Assert.*;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions {
    DecaLongJump decaLongJump = new DecaLongJump();
    int score;

    @Given("I have selected {string}")
    public void i_have_selected(String discipline) {
        System.out.println("Selected discipline is: " + discipline);

    }

    @And("I enter the {int}")
    public void i_enter_a(int resultInput) {
        System.out.println("Selected result: " + resultInput);
    }

    @When("I press calculate")
    public void i_verify_the(int scoreInput) {
        System.out.println("The score is " + score);
        System.out.println("");
        assertEquals(score, scoreInput);

    }
    @Then("I verify the {int}")
    public void verifyScore(int result){
        System.out.println(result);
    }

}