
public class patten5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++) {
			for(int j=5;j>=i;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print("* ");
			
			}
			System.out.println();
			
			
			
		}
		for(int q=1;q<=5;q++) {
			for (int r=1;r<=q;r++) {
			System.out.print(" ");
			
				
			}
			for(int s=5;s>=q;s--) {
				System.out.print("* ");
				
			}
			System.out.println();
			
			
		}

	}

}
