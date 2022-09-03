package StepDefinition;

import Pages.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class Select {
    TodayPage todayPage;
    TodayAfterSelectPage3 page3;
    TodayAfterSelectPage4 page4;
    ItemPage itemPage1;
    CartPage cartPage1;
    @Given("Open today's deals")
    public void Open_Today_page(){
        todayPage =Hook.homePage.click_Today_tab();
    }
    @When("Select \"Headphones\" and \"grocery\"")
    public void Check_items_Headphones_grocery(){
        todayPage.Select_headphone_grocery_checkBox();
    }
    @And("Select  discount part choose \"10% off or more \"")
    public void Discount_10(){
        todayPage.Select_10_off_more();
    }
    @And("Go to the fourth page")
    public void Go_To_page4() throws InterruptedException {
      page3=  todayPage.go_to_3_page();
      page4=  page3.go_to_page4();
        Thread.sleep(5000);
    }
    @Then("Select any item")
    public void SelectRandomItem() throws InterruptedException {
      itemPage1= page4.select_item_from_page4();
      //  Thread.sleep(5000);
    }
    @And("Add item to the cart1")
    public void Add_item_To_cart1(){

        cartPage1= itemPage1 .Add_To_cart(); }
    @And("Check item add successful1")
    public void Check_massage1(){
        Assert.assertTrue(cartPage1.Check_item_added_successful().
                contains("Added to Cart") , "item not add to cart");
    }
}
