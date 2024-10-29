package Basics;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

import java.util.List;

public class VisibleElement {

    public static void main (String[] agrs)

    {
        // print the count of all the visible links on the amazon website
        // print the all link text also
        // print the count of all the visible images

        Playwright playwright =Playwright.create();
        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        Page page = browser.newPage();
        page.navigate("https://www.amazon.in/");

        int count = page.locator("a:visible").count();
        System.out.println("Count of links"+count);

        List<String> allInnerTexts = page.locator("a:visible").allInnerTexts();
        for (int i=0; i<allInnerTexts.size();i++)
        {
            System.out.println(allInnerTexts.get(i));
        }

        int imageCount= page.locator("xpath=//img >> visible=true").count();
        System.out.println("Count of all the visible element is "+imageCount);

        browser.close();
        playwright.close();

    }

}
