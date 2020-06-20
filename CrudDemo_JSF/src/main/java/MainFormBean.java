import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;

import com.example.CrudServiceLocal;
import com.example.Person;
import javax.inject.Named;


@Named
@RequestScoped
public class MainFormBean implements Serializable
{
	private final String titleText = "CRUD Demo";
	private final String addNewButtonText = "Add New";
	private Person person = new Person();
	private List<Person> personList = new ArrayList<Person>();
	

	@EJB
	private CrudServiceLocal crudService;
		
	public void init()
	{
		this.personList = crudService.getPersonList();
	}

	public String getTitleText()
	{
		return this.titleText;
	}

	public String getAddNewButtonText() 
	{
		return this.addNewButtonText;
	}
	
	public List<Person> getPersonList()
	{
		return this.personList;
	}
	
	public String addPerson()
	{
		person.setFirstName("Alice");
		person.setLastName("Kedzierski");
		this.crudService.addPerson(new Person(this.person.getFirstName(),
				this.person.getLastName()));
		return "MainForm?faces-redirect=true";
	}
	
	
	public void setPerson(Person person)
	{
		this.person = person;
	}
	
	public Person getPerson()
	{
		return this.person;
	}
}
