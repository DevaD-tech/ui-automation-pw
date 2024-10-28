package Basics;
import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Frames {

    public static void main (String [] args)

    {
        Playwright playwright=Playwright.create();
        Browser browser=playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        Page page=browser.newPage();
        page.navigate("https://demo.automationtesting.in/Frames.html");
        String textContent=page.frameLocator("iframe[name='SingleFrame']").locator("h5")
                .textContent();
        System.out.println(textContent);
        browser.close();
    }

}
