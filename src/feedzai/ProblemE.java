package feedzai;

public class ProblemE {

	// https://puu.sh/rWGvf/cb2e3a1ccf.png
	
	/*
	 * Since the threads use 25% of their time doing computation, that leaves the CPU (the four of them) free for the remainder 75%.
	 * So if every thread aligned in the time they are using CPU and on the time they are doing I/O (since it has no bounds), we would need four times more threads to make sure the CPU would always be working at 100%.
	 * On this diagram (https://puu.sh/rWGGW/0cd18369a8.png) the red represents the I/O process and the green the computation.
	 */
	
	public static void main(String[] args) {
		
	}
}
