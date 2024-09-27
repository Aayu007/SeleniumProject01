package Intro;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//Hardcode

public class openBrowser {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= new ChromeDriver();
//driver.get("https://syntaxprojects.com/index.php");

//driver.get("https://ebay.com");

driver.get("https://facebook.com");
driver.manage().window().maximize();
//driver.manage().window().fullscreen();
// with full screen you need to use esc with maximize you have optons - [] X
        //minimize maximize close
        String title=driver.getTitle();
        System.out.println("The Title of the page is "+ title);

        Thread.sleep(1000);

        driver.quit();

    }
}
