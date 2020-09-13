package mypack;

public class CareerExpert {
	public String getadvice(String qualification) {
		if(qualification.equalsIgnoreCase("be"))
			return "DAC course";
		else
			return "Wrong Course selected";
}
}