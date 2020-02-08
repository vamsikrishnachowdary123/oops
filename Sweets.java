public class Sweets 
{
	private int wt;
	private String name;
	public Sweets(){
	}

 // Parameterized Constructor
	public Sweets(int wt,String name) 
	{
 		this.wt = wt;
		this.name = name;
 		//this.cost = cost;
  	}

// Getter  methods
	public int getWeight()
	{
		return wt; 
	}

 
 	public String getName()
 	{
 		return name;
 	}
 	
	/*public int getCost()
	{
		return cost;
	}
 		
	public void setWeight(int wt)
	{
		this.wt = wt;
	}
	public void setName(String name)
	{
		this.name = name;
	}*/

}







