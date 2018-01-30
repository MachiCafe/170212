class ThreadDemo extends Thread{
	private Thread thr;
	private String threadName;

	ThreadDemo(String name){
		threadName = name;
		System.out.println("Creating "+ threadName);

	}

	public void run(){
		System.out.println("Running " + threadName);
		try{
			for(int i = 4; i > 0; i--){
				System.out.println("Thread: "+threadName+ ", "+ i);
				Thread.sleep(1000);
			}
		}catch(InterruptedException e){
			System.out.println("Thread "+threadName+ " interrupted.");
		}
		System.out.println("Thread "+ threadName+ " exitting.");
	}

	public void start(){
		System.out.println("Starting " + threadName);
		if(thr==null){
			thr = new Thread(this, threadName);
			thr.start();
		}
	}
}

public class TestThread{
	public static void main(String[] args) {
		ThreadDemo thr1 = new ThreadDemo("Thread - 1");
		ThreadDemo thr2 = new ThreadDemo("Thread - 2");

		thr1.start();
		thr2.start();
	}
}