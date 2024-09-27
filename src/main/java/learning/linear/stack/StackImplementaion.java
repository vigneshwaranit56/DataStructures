package learning.linear.stack;

public class StackImplementaion<T> implements StackI<T> {
	
	private T[] arr;
	private Integer peek;
	private Integer size;

	public StackImplementaion(Integer size) {
		super();
		this.size = size;
		this.peek = -1;
		arr = (T[]) new Object[size];
	}

	@Override
	public void push(T data) throws Exception {
		if(isFull())
			throw new Exception("stack is full");
		arr[++peek] = data;
	}

	@Override
	public T pop() throws Exception {
		if(isEmpty())
			throw new Exception("stack is empty");
	
		return arr[peek--];
	}

	@Override
	public T peek() {
		System.out.println(peek);
		return arr[peek];
	}

	@Override
	public Boolean isEmpty() {
		// TODO Auto-generated method stub
		return peek == 0;
	}

	@Override
	public Boolean isFull() {
		// TODO Auto-generated method stub
		return peek == size-1;
	}

	@Override
	public void print() {
for(int i = 0 ; i<= peek; i++) {
	System.out.print(arr[i]+" ");
}
System.out.println();
}
	@Override
	public Integer size() {
		// TODO Auto-generated method stub
		return null;
	}

}
