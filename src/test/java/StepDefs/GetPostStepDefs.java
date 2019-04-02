package StepDefs;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import static org.hamcrest.CoreMatchers.is;

public class GetPostStepDefs {

    @Given("^I perform GET operation for \"([^\"]*)\"$")
    public void iPerformGETOperationFor(String postNumber) {
//        given().contentType(ContentType.JSON);
//        when().get(String.format("http://localhost:3000/posts/%s", postNumber)).
//                then().body("author", is("Mark Tester"));
    }

    @And("^I perform GET operation for post number \"([^\"]*)\"$")
    public void  iPerformGETOperationForPostNumber(String postNumber) {
        BDDStyleMethod.SimpleGetPost(postNumber);
    }

    @Then("^I should be able to see the author name \"([^\"]*)\"$")
    public void iShouldBeAbleToSeeTheAutorName(String arg0) {
    }

    @Then("^I should be able to see the author names$")
    public void iShouldBeAbleToSeeTheAuthorNames()  {
        BDDStyleMethod.PerformContainsCollections();
    }

    @Then("^I should be able to see the path parameter$")
    public void iShouldBeAbleToSeeThePathParameter()  {
    }
}

