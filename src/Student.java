
public class Student implements Person {

	private String name;
	private String cnic;
	private String address;
	
	public Student(String name, String cnic, String address) {
		super();
		this.name = name;
		this.cnic = cnic;
		this.address = address;
	}
	
	@Override
	public void name(String name) {
		this.name = name;
	}

	@Override
	public void cnic(String cnic) {
		this.cnic = cnic;
	}

	@Override
	public void address(String address) {
		this.address = address;
	}
	
	
}
