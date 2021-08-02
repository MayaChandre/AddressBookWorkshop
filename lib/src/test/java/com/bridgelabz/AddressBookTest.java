package com.bridgelabz;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

public class AddressBookTest {

	AddressBook addressBook;

    @Test
    public void whenGivenAddressbook_whenAdded_shouldReturnContactList(){
        addressBook=new AddressBook();
        addressBook.message();
        Contacts contact= new Contacts("Maya","Chandre","Hyderabad","Telangana",560076
                ,966339366,"maya@gmail.com");
        Contacts contact1=new Contacts("Supriya","Kv","Hyderabad","Telangana",560076
                ,526157122,"supriya@gmail.com");
        addressBook.addNewContact(contact);
        addressBook.addNewContact(contact1);
        ArrayList<Contacts> contactList= addressBook.getContactlist();
        Assert.assertEquals(2,contactList.size());
    }
}
