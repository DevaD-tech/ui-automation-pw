package Basics;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class TextSelectors {


    public static void main (String [] args)

    {
        Playwright playwright= Playwright.create();
        Browser browser=  playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));


      BrowserContext browserContext1= browser.newContext();
        Page page1=browserContext1.newPage();
        page1.navigate("https://parabank.parasoft.com/parabank/index.htm");

        // Text Locator

        page1.locator("text=Admin Page").click();
        System.out.println(page1.url());


        BrowserContext browserContext2= browser.newContext();
        Page page2=browserContext1.newPage();
        page2.navigate("https://parabank.parasoft.com/parabank/index.htm");

       String text= page2.locator("ul.services a:has-text('Withdraw Funds')").textContent();
       System.out.println("text is.."+ text);
       browser.close();


    }
}
