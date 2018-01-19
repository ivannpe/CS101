
public class PhoneBook {

	public static void main(String[] args) {
		PhoneBookEntry John = new PhoneBookEntry(5,"John", "Smith", "jsmith@gmail.edu", 20037,2023334444);
		PhoneBookEntry James = new PhoneBookEntry("James", 2023443444);
		PhoneBookEntry Sarah = new PhoneBookEntry("Sarah");
//		PhoneBookEntry Print = new PhoneBookEntry();
		John.setphoneNumber(2025555555);
		John.printBookEntry();
		James.setzipcode(John.getzipcode());
	}

}
