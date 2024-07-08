package Collections;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Employee
{
	private int id;
	private String name;
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Employee()
	{
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	public int hashcode()
	{
		return id;
	}
	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return id == other.id && Objects.equals(name, other.name);
	}
	
	
}
public class HashcodeEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Employee emp1=new Employee(101,"Lakshmi");
Employee emp2=new Employee(101,"Lenin");
System.out.println("Hashcode Value : "+(emp1.hashcode()==emp2.hashcode()));
System.out.println("Equals Value : "+emp1.equals(emp2));
Set<Employee> value=new HashSet<>();
value.add(emp1);
value.add(emp2);
System.out.println(value);

	}

}
