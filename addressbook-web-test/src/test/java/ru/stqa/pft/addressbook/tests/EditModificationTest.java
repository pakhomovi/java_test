package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.EditData;

/**
 * Created by igor on 16.02.2017.
 */
public class EditModificationTest extends TestBase {

  @Test
  public void testEditModification() {
    app.getEditHelper().reternHome();
    app.getEditHelper().selectEdit();
    app.getEditHelper().editEdit();
    app.getEditHelper().editForm(new EditData("firstname", "middlename", "lastname", "nickname", "title", "company", "address", "tel_hom", "tel_mob", "tel_work", "tel_fax", "email"));
    app.getEditHelper().addUpdateEdit();
    app.getEditHelper().reternHomePage();

  }
}
