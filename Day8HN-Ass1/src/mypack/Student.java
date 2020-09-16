package mypack;

// Generated Jun 11, 2013 10:42:01 AM by Hibernate Tools 3.2.2.GA

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "Student")
public class Student  {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "rollno", nullable = false)
	public int getRollno() {
		return this.rollno;
	}	
	
	public Student() {
		super();
	}
	@Column(name="empname")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	@Column(name="desig")
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	@Column(name="salary")
	public String getAdd() {
		return add;
	}

	public void setAdd(String add) {
		this.add = add;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	private int rollno;
	private String name,add;
	private int age;
	
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", add=" + add + ", age=" + age + "]";
	}
	 

	

	
		 
	

	
	
	

	

	

	
}
