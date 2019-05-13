package hello;

import java.util.HashSet;
import java.util.Set;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
	
	@Autowired
	public EmployeeDao employeeDao;
	
	@Autowired
	public DepartmentDao departmentDao;
	
	@PostConstruct
	public void add() {

		//Department dept1 =new Department("java","4");
		//Department dept2 =new Department("java","4");
		
		Set<Employee> dset1 =new HashSet<Employee>();
		
		Employee emp1=new Employee("ajendra","25");
		Employee emp2=new Employee("manish","75");

		//employeeDao.save(emp1);
		//employeeDao.save(emp2);
		
		dset1.add(emp1);dset1.add(emp2);

		//dept1.setSemp(dset1);
		//dept2.setSemp(dset1);
		
		//departmentDao.save(dept1);
		//departmentDao.save(dept2);
		
		departmentDao.save(new Department("java","4",dset1));
		   
	}
	
	
}
