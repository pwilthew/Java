//****************************************************************************************
//  DogVer2.java       Author: Patricia Wilthew
//
// This class contains data and methods related to the
// names and ages of dogs.
//
// “I pledge my Honor that I have not cheated, and will not cheat, on this assignment.” Patricia Wilthew
//****************************************************************************************
public class DogVer2
{
	private String name;
	private int age;
	private int ageInPersonYears;
	
	private static int count = 0; //static variable
	
	//------------------------------------------------------
	// Dog constructor
	//------------------------------------------------------
	public DogVer2(String name, int age)
	{
		this.name = name;
		this.age = age;
		this.ageInPersonYears = personYears();
		count++;
	} 

	//------------------------------------------------------
	// Dog constructor with no parameters
	//------------------------------------------------------
	public DogVer2()
	{
		this.name = "";
		this.age = 0;
		count++;
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
	// update
	// Updates the ageInPersonYears of a dog. 
	// Useful when the dog was created with 0 parameters
	//------------------------------------------------------
	public void update()
	{
		this.ageInPersonYears = personYears();
	}
	//------------------------------------------------------
	// toString
	// Returns a string representation of the dog
	//------------------------------------------------------
	public String toString()
	{
		return "Dog: " + name + "\t" + "Age: " + age + "\t" + "Person-Years: " + ageInPersonYears;
	}
	
	//------------------------------------------------------
	// getNumberOfInstances
	// Returns the number of instances created so far
	//------------------------------------------------------	
	public static int getNumberOfInstances()
	{
		return count;
	}
	
}

