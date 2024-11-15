package Basics;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class LocatorgetByText {
    public static void main (String[] agrs) {

        Playwright playwright = Playwright.create();
        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(true));
        Page page = browser.newPage();
        page.navigate("https://ecommerce-playground.lambdatest.io/index.php?route=product/product&product_id=28&search=");
        assertThat(page.getByText("Brand")).isVisible();
        //assertThat(page.getByText("Viewed",new Page.GetByTextOptions().setExact(true))).isVisible();
        assertThat(page.getByText("Reward Points")).isVisible();
        //assertThat(page.getByText("Availability")).isVisible();

        browser.close();
    }

}
