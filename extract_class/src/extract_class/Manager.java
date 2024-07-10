package extract_class;

public class Manager extends StaffMember {
    private double bonus;

    public Manager(String name, String email, double salary, double bonus) {
    	super(name, email, salary);
        this.bonus = bonus;
    }

	public String showEmailAndSalary() {
		getFullName();
		return "";
	}
	// getters and setters
}
