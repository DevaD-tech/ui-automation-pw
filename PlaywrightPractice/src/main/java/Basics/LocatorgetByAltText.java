package Basics;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class LocatorgetByAltText {

    public static void main (String[] agrs) {

        Playwright playwright = Playwright.create();
        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        Page page = browser.newPage();
        page.navigate("https://ecommerce-playground.lambdatest.io/index.php?route=product/product&product_id=28&search=");
        page.getByAltText("Poco Electro").click();

    }

    }
