package ru.stqa.pft.addressbook;

import org.testng.annotations.Test;

public class EditCreatingTest extends TestBase {

    @Test
    public void testEditCreating() {
        goToAddNewEdit();
        editForm(new EditData("firstname", "middlename", "lastname", "nickname", "title", "company", "address", "tel_hom", "tel_mob", "tel_work", "tel_fax", "email"));
        addEditForm();
        reternHomePage();
    }

}
