package Basics;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class BrowserContext {


    public static void main (String[] args)

    {
//  from the same browser instance (object) we can create multiple browser context independent to each other

        Playwright playwright = Playwright.create();
       Browser browser= playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));

       com.microsoft.playwright.BrowserContext brcx1 = browser.newContext();
       Page page1=  brcx1.newPage();
       page1.navigate("https://www.google.com");

       String page1URL= page1.url();
       System.out.println("Page 1 url is.."+page1URL);


        com.microsoft.playwright.BrowserContext brcx2 = browser.newContext();
        Page page2=  brcx1.newPage();
        page2.navigate("https://www.facebook.com");

        String page1URL2= page2.url();
        System.out.println("Page 2 url is.."+page1URL2);

        page1.close();
        page2.close();
        brcx1.close();
        brcx2.close();
        playwright.close();

    }
}
