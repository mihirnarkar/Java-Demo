import java.awt.*;

class MovingCircles extends Frame implements Runnable{
	
	private int x1,x2,x3;
	private Thread t1,t2,t3;
	
	public MovingCircles() {
		x1=x2=x3=100;
		
		t1 = new Thread(this,"red");
		t2 = new Thread(this,"blue");
		t3 = new Thread(this,"green");
		t1.start();
		t2.start();
		t3.start();
	}
	
	public MovingCircles(int x1,int x2,int x3) {
		this.x1 = x1;
		this.x2 = x2;
		this.x3 = x3;
		
		t1 = new Thread(this,"red");
		t2 = new Thread(this,"blue");
		t3 = new Thread(this,"green");
		t1.start();
		t2.start();
		t3.start();
	}
	
	public void paint(Graphics g) {
		g.setColor(Color.RED);
		g.fillOval(x1, 100, 100, 100);
		g.setColor(Color.BLUE);
		g.fillOval(x2, 250, 100, 100);
		g.setColor(Color.GREEN);
		g.fillOval(x3, 400, 100, 100);
		
	}
	
	public void run() {
		while(true) {
			if(Thread.currentThread()==t1) {
				synchronized (this) {
					x1++;
					if(x1==this.getWidth()-100) {
						try {
							wait();
						}catch(InterruptedException e) {
							e.printStackTrace();
						}
					}
				}
				try {
					Thread.sleep(30);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			else if(Thread.currentThread()==t2) {
				synchronized (this) {
					x2++;
					if(x2==this.getWidth()-100) {
						try {
							wait();
						}catch(InterruptedException e) {
							e.printStackTrace();
						}
					}
				}
				try {
					Thread.sleep(60);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			else if(Thread.currentThread()==t3) {
				synchronized (this) {
					x3++;
					if(x3==this.getWidth()-100) {
						x1=x2=x3=0;
						notifyAll();
					}
				}
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			repaint();
		}
	}
	
	
}

public class Ass23 {
	public static void main(String[] args) {
		MovingCircles mc = new MovingCircles();
		mc.setSize(600,600);
		mc.setVisible(true);
	}
}
