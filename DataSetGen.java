
public class DataSetGen<E extends Measurable> {
	   private double sum;
	   private Measurable maximum;
	   private int count;
	public DataSetGen()
	{
		sum = 0;
		count = 0; 
		maximum = null;
	}
	public void add(E e) {
		// TODO Auto-generated method stub
		sum = sum + e.getMeasure();
	    if (count == 0 || maximum.getMeasure() < e.getMeasure())
	    	maximum = e;
	    count++;
		
	}

	public E getMaximum() {
		// TODO Auto-generated method stub
		return (E) maximum;
	}

	public double getAverage() {
		// TODO Auto-generated method stub
		if (sum == 0) return 0;
		else return sum/count;
	}

}
