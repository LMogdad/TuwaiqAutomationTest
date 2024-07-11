package Pages;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import static ObjectsPath.TestHome.*; // Import all static fields (locators) from TestHome class

// Define the TestPages class
public class TestPages {
    WebDriver driver = null; // Declare WebDriver instance variable

    // Constructor to initialize WebDriver instance
    public TestPages(WebDriver driver) {
        this.driver = driver; // Assign WebDriver instance from parameter to local driver variable
    }

    // Method to open GitHub homepage
    public void OpenUrl() {
        driver.get("https://tuwaiq.edu.sa/"); // Navigate to GitHub URL
    }

    public void ChangeLanguage() {
        WebElement english = driver.findElement(language); // Find login button element
        english.click(); // Click on the login button
    }

    public void EnterCourses() {
        WebElement course = driver.findElement(courses); // Find login button element
        course.click(); // Click on the login button
    }

    public void FilterButton() {
        WebElement filter = driver.findElement(filterBtn); // Find login button element
        filter.click(); // Click on the login button
    }

    public void SearchIcon() {
        WebElement searchIcon = driver.findElement(search); // Find login button element
        searchIcon.click(); // Click on the login button
        searchIcon.sendKeys("cloud");
    }

    public void RegionField() {
        WebElement regionField = driver.findElement(region); // Find login button element
        regionField.click(); // Click on the login button

    }

    public void SelectFromRegion() {
        WebElement selectedRegion = driver.findElement(regionRiyadh); // Find login button element
        selectedRegion.click(); // Click on the login button
    }

    public void SelectCategory() {
        WebElement selectedProgram = driver.findElement(category); // Find login button element
        selectedProgram.click(); // Click on the login button

    }


    public void ScrollToPosition(int x, int y){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(arguments[0], arguments[1]);", x, y);
    }


}


