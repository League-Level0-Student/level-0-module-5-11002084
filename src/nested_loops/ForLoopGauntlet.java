package nested_loops;

public class ForLoopGauntlet {
public static void main(String[] args) {
	for( int i=0; i<=100; i++) {
		System.out.println(i);
	}
	for (int j=100; j>=0; j--) {
		System.out.println(j);
	}
	for( int k=2; k<=100; k++) {
		System.out.println(k);
	}
	for( int l=1; l<=99; l++) {
		System.out.println(l);
	}
	for(int a=1; a<=500; a++) {
		if(a%2==0) {
			System.out.println(a+ " is even");
		}
		else {
			System.out.println(a+ " is odd");
		}
	}
	for( int s=0; s<=777; s++) {
		if (s%7==0) {
			System.out.println(s);
		}
	}
		for(int f=2005; f<=2018; f++) {
			System.out.println("In "+f+", I was "+(f-2005)+ " years old.");
		
		}
		for(int h=0; h<3; h++) {
		for(int g=0; g<=2; g++) {
			System.out.println(h+ " " + g);
		}
		}
		for (int q=1; q<=9; q++) {
			for(int w=0; w<3; w++) {
			System.out.println(q+q+q);
			}
		}
}
}
