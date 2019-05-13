package hello;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Employee {
	
	@Id
	@GeneratedValue
	public int id;
	public String name;
	public String age;
	@ManyToOne
    @JoinColumn
	public Department department;
	public Employee(String name, String age) {
		super();
		this.name = name;
		this.age = age;
	}
	public Employee(int id, String name, String age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	public Employee(String name, String age, Department department) {
		super();
		this.name = name;
		this.age = age;
		this.department = department;
	}
	
	

}
