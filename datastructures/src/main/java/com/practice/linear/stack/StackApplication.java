package com.practice.linear.stack;

public class StackApplication {
	public static void main(String args[]) {

		StackImplementaion<Integer> stackImplementaion = new StackImplementaion<>(5);
		try {
			stackImplementaion.push(5);
			System.out.println(stackImplementaion.peek());
			stackImplementaion.push(4);
			System.out.println(stackImplementaion.peek());

			stackImplementaion.push(3);
			System.out.println(stackImplementaion.peek());

			stackImplementaion.push(2);
			System.out.println(stackImplementaion.peek());

			stackImplementaion.push(1);
			System.out.println(stackImplementaion.peek());
			stackImplementaion.print();

			stackImplementaion.pop();
			stackImplementaion.pop();
			stackImplementaion.pop();
			stackImplementaion.pop();
			stackImplementaion.pop();
			stackImplementaion.pop();


			stackImplementaion.print();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
