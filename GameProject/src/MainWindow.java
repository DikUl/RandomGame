import java.awt.Canvas;

/**
 * 
 */

/**
 * @author Dik
 *
 */
public class MainWindow extends Canvas implements Runnable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	boolean running = false;

	/* (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		long lastTime = System.currentTimeMillis();
		long delta;
		
		init();

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public void start() {
		Thread mainThread = new Thread(this);
		mainThread.start();
		running = true;
	}
	
	public void init() {
		// TODO Replace with real code
	}

}
