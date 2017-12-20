import java.util.List;
import java.util.Properties;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import com.lexicon.employeemanagement.EmployeeMangementService;
import com.lexicon.employeemanagement.domain.Employee;


public class Main {

	public static void main(String[] args) throws NamingException {
		Properties jndiProperties=new Properties();
		jndiProperties.put(Context.INITIAL_CONTEXT_FACTORY, "org.jboss.naming.remote.client.InitialContextFactory");
		jndiProperties.put(Context.PROVIDER_URL, "http-remoting://localhost:8080");
		jndiProperties.put("jboss.naming.client.ejb.context",true);
		
		Context jndi=new InitialContext(jndiProperties);
		
		EmployeeMangementService service= (EmployeeMangementService) jndi.lookup("EmployeeManagementServerApplication/EmployeeManagementImplimentation!com.lexicon.employeemanagement.EmployeeMangementService");
		List<Employee> employees=service.getAllEmployees();
		
		for(Employee employee: employees){
			
			System.out.println(employee);	
			
			
		}
	}

}
