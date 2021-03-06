package KMIPTypes;

public class KMIPInteger extends KMIPType{
	
	int value;

	public KMIPInteger() {
		super(4);
		// TODO Auto-generated constructor stub
	}

	public KMIPInteger(String value)
	{
		super(value);
		toInteger(value);
	}

	public void toInteger(String value)
	{
		if(value.length()>1&& value.substring(0,2)=="0x")
		{
			this.value=Integer.parseInt(value.substring(2), 16 );
		}
		else
			this.value=Integer.parseInt(value);

	}

	public String toString()
	{
		return Integer.toString(value);
	}

	public String getValue()
	{
		return String.valueOf(this.value);
	} 
	
	public void setValue(int value)
	{
		this.value=value;
	}
	
	
}
