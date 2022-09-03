package StepDefinition;

import Pages.CartPage;
import Pages.ItemPage;
import Pages.SearchPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class Search {
 SearchPage searchPage;
 ItemPage itemPage;
 CartPage cartPage;

    @Given("^Open amazon link (.*)$")
    public void Open_Amazon_url(String url){
     Hook.driver.navigate().to(url);
    }
    @When("^Write in SearchBar (.*)$")
    public void Write_in_search(String keyWord){
       searchPage= Hook.homePage.SendKeyWordToSearchBar(keyWord);
    }
    @Then( "^Select the first Item,index (.*)$")
    public void Select_First_item(int index){
     itemPage=   searchPage.click_item(index);
    }
    @And("Add item to the car")
    public void Add_item_To_cart(){
    cartPage= itemPage .Add_To_cart(); }
    @And("Check item add successful")
    public void Check_massage(){
        Assert.assertTrue(cartPage.Check_item_added_successful().
        contains("Added to Cart") , "item not add to cart");
    }
}
