package Basics;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class PlaywrightBasics {

    public static void main(String[] args)
    {
        Playwright playwright= Playwright.create();

        Browser browser= playwright.chromium().launch();

        Page page=browser.newPage();

        page.navigate("https://www.google.com");

        String url=page.url();

        System.out.println("URL is .."+ url);

        browser.close();
        playwright.close();
    }


}
