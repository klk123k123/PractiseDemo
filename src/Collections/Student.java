package Collections;

import java.util.Objects;

public class Student
//implements Comparable<Student> 
{
	private String FirstName;
	private String LastName;
	private int BatchNumber;
	public Student(String firstName, String lastName, int batchNumber) {
		super();
		FirstName = firstName;
		LastName = lastName;
		BatchNumber = batchNumber;
		
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public int getBatchNumber() {
		return BatchNumber;
	}
	public void setBatchNumber(int batchNumber) {
		BatchNumber = batchNumber;
	}
	@Override
	public String toString() {
		return "Student [FirstName=" + FirstName + ", LastName=" + LastName + ", BatchNumber=" + BatchNumber + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(BatchNumber, FirstName, LastName);
	}
	@Override//need to doesn't allow duplicates
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return BatchNumber == other.BatchNumber && Objects.equals(FirstName, other.FirstName)
				&& Objects.equals(LastName, other.LastName);
	}
	/*@Override
	public int compareTo(Student s) {
		// TODO Auto-generated method stub
		
	//	return this.BatchNumber-s.BatchNumber;
		return this.FirstName.compareTo(s.FirstName);
	}
*/
}
