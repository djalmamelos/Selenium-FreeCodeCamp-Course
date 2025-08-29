package Part2.com.saucedemo.tests.products;

import Part2.com.saucedemo.base.BaseTest;
import com.saucedemo.pages.ProductsPage;
import org.junit.Assert;
import org.junit.Test;

public class ProductsTest extends BaseTest {

    @Test
    public void testProductsHeaderIsDisplayed() {
        ProductsPage productsPage = loginPage.
                logIntoApplication("standard_user", "secret_sauce");

        Assert.assertTrue("\n  Products Header Is Not Displayed \n", productsPage.isProductHeaderDisplayed());
    }














}
