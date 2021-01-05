package selenium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/yavuzaydin/Desktop/selenium/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/inventory.html");

        WebElement product_sort_container = driver.findElement(By.className("product_sort_container"));

        product_sort_container.click();

        List<WebElement> inventory_list = driver.findElements(By.className("inventory_item_name"));
        // product_sort_container.getSize();

        ArrayList<String> itemTitles=new ArrayList<>();

        ArrayList<String > itemTitles2= new ArrayList<>();

        for (int i = 0; i < inventory_list.size(); i++) {
            //System.out.println(inventory_list.get(i).getText());
            itemTitles.add(inventory_list.get(i).getText());
            itemTitles2.add(inventory_list.get(i).getText());
        }
        Collections.sort(itemTitles);
        System.out.println(itemTitles.equals(itemTitles2));
    }
}
