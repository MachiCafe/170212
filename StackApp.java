class StackX{
	private int maxSize;
	private long[] stackArray;
	private int top;

	//contructor
	public StackX(int s){
		maxSize = s;
		stackArray = new long[maxSize];
		top = -1;
	}

	public void push(long j){
		stackArray[++top] = j;
	}

	public long pop(){
		return stackArray[top--];
	}

	public long peck(){
		return stackArray[top];
	}

	public boolean isEmpty(){
		return (top == -1);
	}

	public boolean isFull(){
		return (top == maxSize-1);
	}
}

class StackApp{
	public static void main(String[] args){
		StackX theStack = new StackX(10);
		theStack.push(10);
		theStack.push(20);
		theStack.push(30);

		while(!theStack.isEmpty()){
			System.out.println(theStack.pop());
		}
	}
}

