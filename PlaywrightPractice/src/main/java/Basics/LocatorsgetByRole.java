package Basics;

import com.microsoft.playwright.*;
import com.microsoft.playwright.options.AriaRole;

public class LocatorsgetByRole {

    public static void main (String[] agrs) {

        Playwright playwright = Playwright.create();
        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        Page page = browser.newPage();
        page.navigate("https://ecommerce-playground.lambdatest.io/");
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Search")).click();
        browser.close();

    }

}
