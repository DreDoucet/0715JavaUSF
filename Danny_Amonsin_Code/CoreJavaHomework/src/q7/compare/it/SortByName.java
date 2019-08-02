package q7.compare.it;

import java.util.Comparator; //importing Comparator for using its methods

public class SortByName implements Comparator<Employee> //SortByDepartment class implementing the Comparator interface and taking in an Employee object
{
	public int compare(Employee a, Employee b) //compare method with integer return type, taking in two different Employee objects to compare
	{
		return a.name.compareTo(b.name); //returns integer value
	}
}