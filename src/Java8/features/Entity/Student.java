package Java8.features.Entity;

public class Student {
	private int Id;
	private String Name;
	private String emailId;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public Student(int id, String name, String emailId) {
		super();
		Id = id;
		Name = name;
		this.emailId = emailId;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [Id=" + Id + ", Name=" + Name + ", emailId=" + emailId + "]";
	}
	
	
	
	
	
	
	
	
	
	

}
