import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;

/**
 * 
 */

/**
 * @author Dik
 *
 */
public class RandomGame extends Canvas implements Runnable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	boolean running = false;
	
	public static int WIDTH = 640;
	public static int HEIGHT = 480;
	public static String name = "RandomGame";

	/* (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		long lastTime = System.currentTimeMillis();
		long delta;
		
		init();
		
		while (running) {
			delta = System.currentTimeMillis() - lastTime;
			lastTime = System.currentTimeMillis();
			update(delta);
			render();
		}

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
	}
	
	public void start() {
		Thread mainThread = new Thread(this);
		mainThread.start();
		running = true;
	}
	
	public void init() {
		// TODO Replace with real code
	}

	private void update(long delta) {
		// TODO Auto-generated method stub
		
	}

	private void render() {
		BufferStrategy bs = getBufferStrategy();
		if (bs == null) {
			createBufferStrategy(2);
			requestFocus();
			return;
		}
		Graphics g = bs.getDrawGraphics();
		g.setColor(Color.black);
		g.fillRect(0, 0, getWidth(), getHeight());
		g.dispose();
		bs.show();
	}
	
}
