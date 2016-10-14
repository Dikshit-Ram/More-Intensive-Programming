
public class TestFindPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a [] = {3,5,7,9,10};
		int tar = 11;
		int left = 0;
		int right = a.length-1;
		System.out.println(FindPosition.positionFind(a,left,right, tar));
	}
	
}
