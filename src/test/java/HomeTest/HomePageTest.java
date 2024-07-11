package HomeTest;

import Base.BaseClass;
import Pages.TestPages;
import org.testng.annotations.Test;

public class HomePageTest extends BaseClass {

    @Test
    public void TuwaiqTestMethod() throws InterruptedException {
        TestPages homepage = new TestPages(driver);
        homepage.OpenUrl();
        homepage.ChangeLanguage();
        Thread.sleep(1000);
        homepage.EnterCourses();
        Thread.sleep(1000);
        homepage.FilterButton();
        Thread.sleep(1000);
        homepage.SearchIcon();
        Thread.sleep(1000);
        homepage.RegionField();
        Thread.sleep(1000);
        homepage.SelectFromRegion();
        Thread.sleep(1000);
        homepage.SelectCategory();
        Thread.sleep(1000);
    }

    @Test
    public void TuwaiqBootcamp() throws InterruptedException {
        TestPages homepage = new TestPages(driver);
        homepage.OpenUrl();
        homepage.ChangeLanguage();
        Thread.sleep(1000);
        homepage.EnterCourses();
        Thread.sleep(1000);
        homepage.ScrollToPosition(0, 600);
        Thread.sleep(1000);
    }

}
