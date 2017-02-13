package ru.stqa.pft.addressbook;

import org.testng.annotations.Test;
import org.openqa.selenium.*;

public class EditCreatingTest extends TestBase {

    @Test
    public void testEditCreating() {
        goToAddNewEdit();
        editForm("firstname", "middlename", "lastname", "nickname", "title", "company", "address", "tel_hom", "tel_mob", "tel_work", "tel_fax", "email");
        addEditForm();
        reternHomePage();
    }

    private void reternHomePage() {
        wd.findElement(By.linkText("home page")).click();
    }

    private void addEditForm() {
        wd.findElement(By.xpath("//div[@id='content']/form/input[21]")).click();
    }

    private void editForm(String firstname, String middlename, String lastname, String nickname, String title, String company, String address, String home, String mobile, String work, String fax, String email) {
        wd.findElement(By.name("firstname")).click();
        wd.findElement(By.name("firstname")).clear();
        wd.findElement(By.name("firstname")).sendKeys(firstname);
        wd.findElement(By.name("middlename")).click();
        wd.findElement(By.name("middlename")).clear();
        wd.findElement(By.name("middlename")).sendKeys(middlename);
        wd.findElement(By.name("lastname")).click();
        wd.findElement(By.name("lastname")).clear();
        wd.findElement(By.name("lastname")).sendKeys(lastname);
        wd.findElement(By.name("nickname")).click();
        wd.findElement(By.name("nickname")).clear();
        wd.findElement(By.name("nickname")).sendKeys(nickname);
        wd.findElement(By.name("title")).click();
        wd.findElement(By.name("title")).clear();
        wd.findElement(By.name("title")).sendKeys(title);
        wd.findElement(By.name("company")).click();
        wd.findElement(By.name("company")).clear();
        wd.findElement(By.name("company")).sendKeys(company);
        wd.findElement(By.name("address")).click();
        wd.findElement(By.name("address")).clear();
        wd.findElement(By.name("address")).sendKeys(address);
        wd.findElement(By.name("home")).click();
        wd.findElement(By.name("home")).clear();
        wd.findElement(By.name("home")).sendKeys(home);
        wd.findElement(By.name("mobile")).click();
        wd.findElement(By.name("mobile")).clear();
        wd.findElement(By.name("mobile")).sendKeys(mobile);
        wd.findElement(By.name("work")).click();
        wd.findElement(By.name("work")).clear();
        wd.findElement(By.name("work")).sendKeys(work);
        wd.findElement(By.name("fax")).click();
        wd.findElement(By.name("fax")).clear();
        wd.findElement(By.name("fax")).sendKeys(fax);
        wd.findElement(By.name("email")).click();
        wd.findElement(By.name("email")).clear();
        wd.findElement(By.name("email")).sendKeys(email);
    }

    private void goToAddNewEdit() {
        wd.findElement(By.linkText("add new")).click();
    }
}
