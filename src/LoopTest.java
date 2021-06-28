
public class LoopTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int MAX = 1000;
		int subMaxCount = 1;
		int compareIndex = 0;
		
		for(int index = 0; index <= MAX; index++) {
			if(index >= (int)Math.pow(10, subMaxCount)) {
				subMaxCount++; 
			}
			for(int subIndex = 0; subIndex < subMaxCount; subIndex++) {
				compareIndex = index / (int)Math.pow(10, subIndex);
				if( (compareIndex % 10 == 3) || (compareIndex % 10 == 6) || (compareIndex % 10 == 9) ) {
					System.out.print("¦! ");
				}				
			}
			System.out.printf("%d\n", index);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
