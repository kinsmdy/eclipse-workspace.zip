package extract_class;

public abstract class StaffMember {
	private String name;
	private String email;
	private double salary;

	public StaffMember(String name, String email, double salary) {
        this.setName(name);
        this.setEmail(email);
        this.setSalary(salary);
    }

	protected String getFullName() {
		return name;
	}

	protected void setName(String name) {
		this.name = name;
	}

	protected String getEmail() {
		return email;
	}

	protected void setEmail(String email) {
		this.email = email;
	}

	protected double getSalary() {
		return salary;
	}

	protected void setSalary(double salary) {
		this.salary = salary;
	}

	public String getAll() {
		return "";
	}
}