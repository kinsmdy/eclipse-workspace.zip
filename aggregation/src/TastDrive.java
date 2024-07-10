import th.ac.npru.sc.se.se6638.Address;
import th.ac.npru.sc.se.se6638.Person;

public class TastDrive {
	public static void main(String[] args) {
        Address address = new Address("123 Main St", "Springfield", "IL", "62701");
        Person person = new Person("John Doe", 30, address);
        System.out.println(person);
    }
}
