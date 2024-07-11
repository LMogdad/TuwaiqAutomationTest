package ObjectsPath;

// Import necessary classes from Selenium
import org.openqa.selenium.By;


// Define the TestHome class
public class TestHome {

    // Locator for the login button in the home page
    public static final By language = By.xpath("/html/body/main/div/nav[2]/div[2]/button[1]");
    public static final By courses = By.xpath("//*[@id='intro']/div/div[4]/div/div[3]/a");
    public static final By filterBtn = By.xpath("/html/body/main/section[1]/div/section[1]/div/div[1]/div[1]/button");
    public static final By search = By.xpath("/html/body/main/section[1]/div/section[1]/div/div[2]/div/div/div[3]/input");
    public static final By region = By.xpath("//*[@id='regionSelect']");
    public static final By regionRiyadh = By.xpath("//*[@id='regionSelect']/option[2]");
    public static final By category = By.xpath("/html/body/main/section[1]/div/section[1]/div/div[1]/div[2]/button[2]");
    public static final By cardSelect = By.xpath("/html/body/main/section[1]/div/section[1]/div/div[3]/div[2]/div");


}