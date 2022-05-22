package stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddToCartButton {

	@Given("user can visit homedepot homepage")
	public void user_can_visit_homedepot_homepage() {
	   System.out.println("homepage");
	}

	@Given("user navigate to lawn and garden saving page")
	public void user_navigate_to_lawn_and_garden_saving_page() {
		System.out.println("laws page");
	}

	@When("an item is out of stock or non-deliverable")
	public void an_item_is_out_of_stock_or_non_deliverable() {
		System.out.println("locate cart");
	}

	@Then("the add to cart button should be disabled")
	public void the_add_to_cart_button_should_be_disabled() {
		System.out.println("Check for disabled addToCart button");
	}

}
