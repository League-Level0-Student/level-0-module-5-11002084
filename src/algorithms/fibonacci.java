package algorithms;

public class fibonacci {
public static void main(String[] args) {
	int x=0;
	int y=1;
	for(int i=0; i<6; i++) {
		
		System.out.println(x);
		x=x+y;
		System.out.println(y);
		y=x+y;
	}
}
}
