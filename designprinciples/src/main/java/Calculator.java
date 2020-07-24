public class Calculator {
	String operateType;
    public int computeCalculation(int numberOne,int numberTwo,String operateType) throws Exception
    {
    	Computation compute=new Computation();
		this.operateType=operateType;
    	Class<?> cls=Class.forName(operateType);
		Object obj=cls.newInstance();
		Operate computeOperation=(Operate)obj;
		compute.setOperation(computeOperation);
		return compute.computeValue(numberOne,numberTwo);
    }
}