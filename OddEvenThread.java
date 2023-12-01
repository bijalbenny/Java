import java.util.Random;

class NumberManager{
	private int generatedNumber;
	private boolean numberGenerated = false;
	public synchronized void generateNumber(){
		generatedNumber = new Random().nextInt(99)+2;
		System.out.println("Generated Random Number : "+generatedNumber);
		numberGenerated = true;
		notifyAll();
	}
	public synchronized void printEvenSquare() throws InterruptedException {
		while(!numberGenerated||generatedNumber%2!=0) {
			wait();
		}
		
		System.out.println("The square is :"+(generatedNumber*generatedNumber));
		
		numberGenerated = false;
		System.out.println(" ");
	}
	public synchronized void printOddCube() throws InterruptedException {
		while(!numberGenerated||generatedNumber%2==0) {
			wait();
		}
		System.out.println("The cube is :"+(generatedNumber*generatedNumber*generatedNumber));
		numberGenerated = false;
		System.out.println(" ");
	}
}
class NumberGenerator extends Thread{
	NumberManager manager;
	public NumberGenerator(NumberManager manager) {
		this.manager = manager;
	}
	public void run() {
		while(true) {
			manager.generateNumber();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}

class EvenPrinterThread extends Thread{
	NumberManager numberManager;
	public EvenPrinterThread(NumberManager numberManager) {
		this.numberManager = numberManager;
	}
	public void run() {
		while(true) {  //infinite loop to access and print even numbers...
			try {
				numberManager.printEvenSquare();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class OddPrinterThread extends Thread{
	NumberManager numberManager;
	public OddPrinterThread(NumberManager numberManager) {
		this.numberManager = numberManager;
	}
	public void run() {
		while(true) {  //infinite loop to access and print even numbers...
			try {
				numberManager.printOddCube();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}



public class OddEvenThread {

	public static void main(String[] args) {
		NumberManager manager = new NumberManager();
		NumberGenerator numberGenerator = new NumberGenerator(manager);
		EvenPrinterThread evenPrinterThread = new EvenPrinterThread(manager);
		OddPrinterThread oddPrinterThread = new OddPrinterThread(manager);
		numberGenerator.start();
		evenPrinterThread.start();
		oddPrinterThread.start();
	}

}
