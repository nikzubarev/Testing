

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.support.ui.Select;

public class Untlited {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
	  driver = new FirefoxDriver(new FirefoxBinary(), new FirefoxProfile());
    baseUrl = "http://webmasters.leadia.ru/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testUntlited() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.linkText("Вход")).click();
    driver.findElement(By.id("inputEmail")).clear();
    driver.findElement(By.id("inputEmail")).sendKeys("nikzubarev95@rambler.ru");
    driver.findElement(By.id("inputPassword")).clear();
    driver.findElement(By.id("inputPassword")).sendKeys("panasonic");
    driver.findElement(By.id("login_but")).click();
    driver.findElement(By.linkText("Настройки")).click();
    driver.findElement(By.cssSelector("legend")).click();
    driver.findElement(By.linkText("Изменить номер телефона")).click();
    driver.findElement(By.linkText("Общие настройки")).click();
    driver.findElement(By.linkText("Написать менеджеру")).click();
    driver.findElement(By.linkText("Ремонт квартир")).click();
    driver.findElement(By.xpath("//div[@id='sidebar-margin-div']/div[2]/div/div/div/div/dl[2]/dd/div/table/tbody/tr[24]/th")).click();
    driver.findElement(By.linkText("Лендинги")).click();
    driver.findElement(By.cssSelector("td")).click();
    driver.findElement(By.linkText("Суммарный")).click();
    new Select(driver.findElement(By.id("lead_type"))).selectByVisibleText("Текстовый");
    new Select(driver.findElement(By.id("product"))).selectByVisibleText("Ремонт квартир");
    driver.findElement(By.cssSelector("a.chzn-single.chzn-single-with-drop > span")).click();
    driver.findElement(By.cssSelector("button.btn")).click();
    driver.findElement(By.linkText("Настройки")).click();
    driver.findElement(By.cssSelector("option[value=\"Аландские острова\"]")).click();
    driver.findElement(By.id("aa1")).click();
    driver.findElement(By.id("aa2")).click();
    driver.findElement(By.id("aa3")).click();
    driver.findElement(By.id("traffic_other_checkbox")).click();
    driver.findElement(By.xpath("//form[@id='settings_form']/fieldset[4]/div/div/label[4]")).click();
    driver.findElement(By.id("traffic_other_checkbox")).click();
    driver.findElement(By.cssSelector("button.btn.btn-large")).click();
    driver.findElement(By.cssSelector("body.init.")).click();
    driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
    driver.findElement(By.cssSelector("fieldset")).click();
    driver.findElement(By.linkText("Выход")).click();
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
