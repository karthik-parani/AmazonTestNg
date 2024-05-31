import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class AmazonTestNg {

    @Test
    public void Twittertest(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\paran\\Downloads\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.amazon.in/");

        String Expectedurl = "https://www.amazon.in/";
        String Actualurl = driver.getCurrentUrl();

        Assert.assertEquals(Expectedurl,Actualurl,"URL do not match");
    }
}
