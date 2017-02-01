
public class PrintErr {
public synchronized static void print(int count){
	for (int g=1;g<=count; g++){

		System.err.println("Hello World!");
	}
}
}
