
public class Main {

	public static void main(String[] args) {
		// Testing the algorithm
		int [] data = {150,20,90,100,160};
		System.out.println("========Testing==========");
		System.out.println(numPairsDivisibleBy60(data));
		
	}

	public static int numPairsDivisibleBy60(int[] time) {
        // Satisfying the first constraint
        int pairs = 0;
        if(time.length < 1 || time.length > 1000){
            System.out.println("Length of "+time.length+" violates the constraints");
            return 0;
        }
        for(int i = 0; i< time.length-1;i++){
            // Satisfying the second constraint
            if(time[i] < 1 || time[i] > 500){
                System.out.println("Time of "+time[i]+" seconds Violates the constraints");
                return 0;
            }
            for(int j = i+1;j < time.length;j++) {
            	if((time[i] + time[j]) %60 == 0){
            		pairs++;
            	}
            }
            
        }
        // Return this placeholder return statement with your code
        return pairs;
    }
}
