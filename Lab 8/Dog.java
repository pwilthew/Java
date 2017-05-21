//****************************************************************************************
//  Dog.java       Author: Patricia Wilthew
//
// This class contains data and methods related to the
// names and ages of dogs.
//
// “I pledge my Honor that I have not cheated, and will not cheat, on this assignment.” Patricia Wilthew
//****************************************************************************************
public class Dog
{
	private String name;
	private int age;
	private int ageInPersonYears;
	
	//------------------------------------------------------
	// Dog constructor
	//------------------------------------------------------
	public Dog(String dogsName, int dogsAge)
	{
		name = dogsName;
		age = dogsAge;
		ageInPersonYears = personYears();
	} 
	
	//------------------------------------------------------
	// getName
	//------------------------------------------------------
	public String getName()
	{
		return name;
	}
	
	//------------------------------------------------------
	// setName
	//------------------------------------------------------
	public void setName(String dogsName)
	{
		name = dogsName;
	}
	
	//------------------------------------------------------
	// getAge
	//------------------------------------------------------
	public int getAge()
	{
		return age;
	}
	
	//------------------------------------------------------
	// setAge
	//------------------------------------------------------
	public void setAge(int dogsAge)
	{
		age = dogsAge;
	}
	
	//------------------------------------------------------
	// personYears
	// Computes and returns the dog's age in "person-years"
	//------------------------------------------------------
	public int personYears()
	{
		return age * 7;
	}
	
	//------------------------------------------------------
	// toString
	// Returns a string representation of the dog
	//------------------------------------------------------
	public String toString()
	{
		return "Dog: " + name + "\t" + "Age: " + age + "\t" + "Person-Years: " + ageInPersonYears;
	}
	
}

