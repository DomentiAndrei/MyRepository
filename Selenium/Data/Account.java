package Generics;

public class Account<T> {

	private T id;
	private T sum;
	
	Account (T id, T sum){
		this.id = id;
		this.sum = sum;
	}
	public Object getId() {
		return id;
		}
	public Object getSum() {
		return sum;
	}
	public void setSum(T sum) {
		this.sum = sum;
	}
	
}
