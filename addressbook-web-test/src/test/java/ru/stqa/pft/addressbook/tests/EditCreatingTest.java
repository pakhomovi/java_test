package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.EditData;

public class EditCreatingTest extends TestBase {

    @Test
    public void testEditCreating() {
        app.goToAddNewEdit();
        app.getEditHelper().editForm(new EditData("firstname", "middlename", "lastname", "nickname", "title", "company", "address", "tel_hom", "tel_mob", "tel_work", "tel_fax", "email"));
        app.getEditHelper().addEditForm();
        app.getEditHelper().reternHomePage();
    }

}
