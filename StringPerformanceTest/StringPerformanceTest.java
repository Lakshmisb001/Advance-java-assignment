/*Develop a Java program to make a Performance Test on StringBuffer and StringBuilder for
appending the string ‘AIET’ for 10000 times both in the StringBuffer and StringBuilder. Justify
your answer which one is better.*/
package ADV_JAVA;
public class StringPerformanceTest {
	    public static void main(String[] args) {
	        // The string to append
	        String text = "AIET";

	        // ======= Test StringBuffer (Thread-Safe, Synchronized) ========
	        StringBuffer stringBuffer = new StringBuffer();

	        // Get start time
	        long startTimeBuffer = System.nanoTime();

	        // Append the string 10,000 times
	        for (int i = 0; i < 10000; i++) {
	            stringBuffer.append(text);
	        }

	        // Get end time
	        long endTimeBuffer = System.nanoTime();

	        // Calculate duration in milliseconds
	        long durationBuffer = (endTimeBuffer - startTimeBuffer) / 1000000;
	        System.out.println("Time taken by StringBuffer: " + durationBuffer + " ms");

	        // ======= Test StringBuilder (Non-synchronized, Faster) ========
	        StringBuilder stringBuilder = new StringBuilder();

	        // Get start time
	        long startTimeBuilder = System.nanoTime();

	        // Append the string 10,000 times
	        for (int i = 0; i < 10000; i++) {
	            stringBuilder.append(text);
	        }

	        // Get end time
	        long endTimeBuilder = System.nanoTime();

	        // Calculate duration in milliseconds
	        long durationBuilder = (endTimeBuilder - startTimeBuilder) / 1000000;
	        System.out.println("Time taken by StringBuilder: " + durationBuilder + " ms");

	        // ======= Justification ========
	        if (durationBuilder < durationBuffer) {
	            System.out.println(" StringBuilder is faster than StringBuffer for single-threaded operations.");
	        } else {
	            System.out.println("StringBuffer is thread-safe but slower. Use it in multithreaded environments.");
	        }
	    }
	}

