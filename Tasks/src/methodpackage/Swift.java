package methodpackage;

public class Swift  extends Car
{

    int seat;
	int airbag;
	String model;
	String color;
	public void setSeat(int newSeat)
	{
		seat=newSeat;
	}
	public int getSeat()
	{
		return seat;
	}
	public void setAirbag(int newAirbags)
	{
		airbag=newAirbags;
	}
	public int getAirbag()
	{
		return airbag;
	}
	public void setModel(String newModel)
	{
		model=newModel;
	}
	public String getModel()
	{
		return model;
	}
	public void setColor(String newColor)
	{
		color=newColor;
	}
	public String getColor()
	{
		return color;
	}
}
