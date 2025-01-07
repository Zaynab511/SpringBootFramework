package demo;
import org.springframework.stereotype.Component;

@Component
public class Doctor implements Staff{
	//we have to create loose coupling between the objects that we are using Spring helps us to do that
	//loose coupling will help in unit testing
	
	//Qualification qualification;
	//to do loose coupling spring use dependency injection
	
	private String qualification;
	private Nurse nurse;
	
	public void assist() {
		System.out.println("Doctor ");
	}
	
	public Doctor(String qualification) {
		this.qualification = qualification;
	}

	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification= qualification;
	}

	public Nurse getNurse() {
		return nurse;
	}

	public void setNurse(Nurse nurse) {
		this.nurse = nurse;
	}
}
