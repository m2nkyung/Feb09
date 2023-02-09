import java.util.*;
public class Average {
	private int n1, n2;
	
	public void setN1() {
		n1 = (int) (Math.random() * 10);
	}	
	public void setN2() {
		n2 = (int) (Math.random() * 10);
	}
	
	public double getAv() {
		return (n1 + n2) / 2;
	}
	
	public String toString() {
		return (n1 + "\t" + n2);
	}
}