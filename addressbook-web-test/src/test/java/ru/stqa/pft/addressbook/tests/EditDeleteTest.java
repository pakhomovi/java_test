package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;

/**
 * Created by igor on 17.02.2017.
 */
public class EditDeleteTest extends TestBase {

  @Test
  public void testEditDelete() {
    app.getEditHelper().reternHome();
    app.getEditHelper().selectEdit();
    app.getEditHelper().deleteSelectEdit();
    app.getEditHelper().conformEditDeletion();
   }
}
