package stepDefinition;

import cucumber.api.PendingException;
import cucumber.api.java.en.*;
import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
public class stepDefinition {

    @Given("^User is on NetBanking landing page$")
    public void user_is_on_netbanking_landing_page() throws Throwable {
        System.out.println("Navigated to login url");
    }

//    @When("^User login into application with \"([^\"]*)\" and password \"([^\"]*)\"$")
//    public void user_login_into_application_with_something_and_password_something(String userName, String password) throws Throwable {
//       System.out.println(userName);
//       System.out.println(password);
//    }

    @When("^User login into application with (.+) and password (.+)$")
    public void user_login_into_application_with_and_password(String username, String password) throws Throwable {
        System.out.println(username);
        System.out.println(password);
    }

    @Then("^Home page is populated$")
    public void home_page_is_populated() throws Throwable {
    	System.out.println("Validated Home Page");
    }

    @And("^Cards displayed are (.+) $")
    public void cards_displayed_are(String display) throws Throwable {
       System.out.println(display);
    }
    
    @Then("^Cards displayed are false$")
    public void cards_displayed_are_false() throws Throwable {
        System.out.println("Displaying false");
    }

    @Then("^Cards displayed are true$")
    public void cards_displayed_are_true() throws Throwable {
    	 System.out.println("Displaying True");
    }
    
    
    
}