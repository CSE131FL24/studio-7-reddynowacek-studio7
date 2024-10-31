package studio7;

public class Die {
	
	private int n;

	public Die(int initn){
		n = initn;
	}
	
	public int getThrow() {
		return (int)(Math.random()*n)+1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Die a = new Die(5);
		System.out.print(a.getThrow());
	}

}
