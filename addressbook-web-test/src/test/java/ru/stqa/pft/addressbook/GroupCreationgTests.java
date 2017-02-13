package ru.stqa.pft.addressbook;

import org.testng.annotations.Test;

public class GroupCreationgTests extends TestBase {

  @Test
  public void testGroupCreationg() {

    gotoGroupPage();
    initGroupCreation();
    fillGroupForm(new GroupData("test1", "test2", "test3"));
    submitGroupCreation();
    reternToGroupName();
  }

}
