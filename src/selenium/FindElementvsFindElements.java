package selenium;

import java.util.List;

public class FindElementvsFindElements {
    public static void main(String[] args) {
        /*
        Find Element       vs                          Find Elements
        -this is used only for one element              -this is used for list
        -gives NoSuchElementException                   -gives empty result, doesn't give any exception


         */
        System.setProperty("webdriver.chrome.driver", "/Users/yavuzaydin/Desktop/selenium/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formsmarts.com/form/yu?mode=h5");
        driver.manage().window().maximize();
        //Example of WebElement
        WebElement businessButton = driver.findElement(By.cssSelector("#u_4uF_4586 > label:nth-child(2) > span"));
        businessButton.click();

        //Example of List

        List<WebElement> radioButtons = driver.findElements(By.cssSelector("#u_4uF_89585 > label"));
        System.out.println(radioButtons.size());

        for (int i = 0; i < radioButtons.size(); i++) {
            System.out.println(radioButtons.get(i).getText());

        }

        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());


    }

    @Test
    public void Test() {
        System.setProperty("webdriver.chrome.driver", "/Users/yavuzaydin/Desktop/selenium/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formsmarts.com/form/yu?mode=h5");

        Assert.assertEquals(driver.getCurrentUrl(), "https://formsmarts.com/form/yu?mode=h5");

        driver.quit();
    }
}
