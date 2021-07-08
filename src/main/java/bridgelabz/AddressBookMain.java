/**
 * ****************************************************************************
 * Purpose: The purpose of this class to create Address Book System and add
 * multiple persons details in database.
 *
 * @author Dhiraj
 * @version 1.0
 * @since 07-07-2021
 * ****************************************************************************
 */
package bridgelabz;

import bridgelabz.exception.AddressBookException;
import bridgelabz.model.Person;
import bridgelabz.services.AddressBookDBService;
import java.util.*;

public class AddressBookMain {
    private static final Scanner scanner = new Scanner(System.in);
    AddressBookDBService addressBookDBService;
    public AddressBookMain(){
        addressBookDBService = AddressBookDBService.getInstance();
    }

    /**
     * Method for retrieving data from database.
     * @return : List of persons details
     * @throws AddressBookException
     */
    public List<Person> retrieveData() throws AddressBookException {
        List<Person> list = addressBookDBService.readData();
        return list;
    }
}
