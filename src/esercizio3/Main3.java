package esercizio3;

public class Main3 {

	public static void main(String[] args) {
		Contacts.addContacts("Vittorio", "+393200313338");
		Contacts.addContacts("Aldo", "+39333333333");
		Contacts.addContacts("Giovanni", "+39333666666");
		Contacts.addContacts("Giacomo", "+39346555555");

		Contacts.findContactFromNumber("+393200313338");

		Contacts.findContactFromName("Vittorio");

		Contacts.printContact();

		Contacts.removeContacts("Vittorio");
	}
}
