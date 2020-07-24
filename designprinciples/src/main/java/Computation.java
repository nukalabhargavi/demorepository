public class Computation {
	Operate operate;
	public void setOperation(Operate operate)
	{
		this.operate=operate;
	}
	public int computeValue(int numberOne,int numberTwo)
	{
	    return operate.calculateValue(numberOne,numberTwo);
	}
}