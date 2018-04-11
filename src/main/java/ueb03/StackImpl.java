package ueb03;

import java.util.NoSuchElementException;

public class StackImpl implements Stack {
	class Element {
		char value;
		Element next;
		Element(char value, Element next) {
			this.value = value;
			this.next = next;
		}
	}

	private Element top;
	private int s = 0;

	@Override
	public void push(char c) {
		top = new Element(c, top);
		s++;
	}

	@Override
	public char pop() {
		if (top == null)
			throw new NoSuchElementException();
		char v = top.value;
		top = top.next;
		s--;
		return v;
	}

	@Override
	public int size() {
		return s;
	}
}
