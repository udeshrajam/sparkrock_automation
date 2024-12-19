package steps_definitions;

import io.cucumber.java.en.And;
import org.example.pages.productListPage;

public class product_list_steps {

    productListPage productListPage = new productListPage();


    @And("select {string} as sorting option")
    public void selectAsSortingOption(String sortBy) throws InterruptedException {
        productListPage.dropdownSortOption(sortBy);
    }

    @And("verify the product list")
    public void verify_product_list() {
        productListPage.verifySortedProductList();
    }

    @And("click add to cart button for {string}")
    public void add_selected_products_to_cart(String products) throws InterruptedException {
        productListPage.addItemsToCard(products);
    }


    @And("click your cart button")
    public void click_your_cart_button() {
        productListPage.shoppingCartButton();
    }
}
