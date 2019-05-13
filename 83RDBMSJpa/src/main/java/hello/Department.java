package hello;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
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
/*@Data
@EqualsAndHashCode(exclude = "emps")*/
public class Department {
	
	@Id
	@GeneratedValue
	public int did;
	public String dname;
	public String length;
	//mappedBy = "emps", 
	@OneToMany(cascade = CascadeType.ALL)
    private Set<Employee> semp;
	
	public Department(String dname, String length, Set<Employee> semp) {
		super();
		this.dname = dname;
		this.length = length;
		this.semp = semp;
	}

	public Department(String dname, String length) {
		super();
		this.dname = dname;
		this.length = length;
	}

	
	
	/*public Department(String dname, String length,Employee... emps) {
		super();
		this.dname = dname;
		this.length = length;
		this.emps = Stream.of(emps).collect(Collectors.toSet());
        this.emps.forEach(x -> x.setDepartment(this));
	}*/
	
	
	

	

	
	
}
