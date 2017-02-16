package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.stqa.pft.addressbook.model.EditData;

/**
 * Created by igor on 15.02.2017.
 */
public class EditHelper extends HelperBase{

  public EditHelper(FirefoxDriver wd) {
    super(wd);
  }

  public void reternHomePage() {
      click(By.linkText("home page"));
  }

  public void addEditForm() {
      click(By.xpath("//div[@id='content']/form/input[21]"));
  }

  public void editForm(EditData editData) {
      click(By.name("firstname"));
      type(By.name("firstname"), editData.getFirstname());
      click(By.name("middlename"));
      type(By.name("middlename"), editData.getMiddlename());
      click(By.name("lastname"));
      type(By.name("lastname"), editData.getLastname());
      click(By.name("nickname"));
      type(By.name("nickname"), editData.getNickname());
      click(By.name("title"));
      type(By.name("title"), editData.getTitle());
      click(By.name("company"));
      type(By.name("company"), editData.getCompany());
      click(By.name("address"));
      type(By.name("address"), editData.getAddress());
      click(By.name("home"));
      type(By.name("home"), editData.getHome());
      click(By.name("mobile"));
      type(By.name("mobile"), editData.getMobile());
      click(By.name("work"));
      type(By.name("work"), editData.getWork());
      click(By.name("fax"));
      type(By.name("fax"), editData.getFax());
      click(By.name("email"));
      type(By.name("email"), editData.getEmail());
  }

  public void goToAddNewEdit() {
    click(By.linkText("add new"));
  }

  public void reternHome() {
    click(By.linkText("home"));
  }

  public void selectEdit() {
    click(By.xpath("//input[@id='10']"));
  }

  public void editEdit() {
    click(By.xpath("//table[@id='maintable']/tbody/tr[3]/td[8]/a/img"));
  }

  public void addUpdateEdit() {
    click(By.name("update"));
  }

  public void deleteSelectEdit() {
    click(By.xpath("//div[@id='content']/form[2]/div[2]/input"));
  }

  public void conformEditDeletion() {
    wd.switchTo().alert().accept();
  }
  //public void editEdit() {
  //  click(By.xpath("//table[@id='maintable']/tbody/tr[3]/td[8]/a/img"));
  //}

}
