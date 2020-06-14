import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class MainFormBean
{
	private final String titleText = "CRUD Demo";
	private final String addNewButtonText = "Add New";
	
	MainFormBean()
	{
	}

	public String getTitleText()
	{
		return this.titleText;
	}


	public String getAddNewButtonText() 
	{
		return this.addNewButtonText;
	}

}
