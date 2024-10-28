package Basics;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class HandleShadowDOM {

    public static void main (String [] args)

    {
        Playwright playwright =Playwright.create();
        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        Page page= browser.newPage();
        page.navigate("https://books-pwakit.appspot.com/");

        page.locator("book-app[apptitle='BOOKS'] #input").fill("test books in shadow dom element");
        String textContent=  page.locator("book-app[apptitle='BOOKS'] .books-desc").textContent();
        System.out.println(textContent);

    }

}
