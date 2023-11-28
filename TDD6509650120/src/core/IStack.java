package core;

public interface IStack {
	int getSize();
    boolean isEmpty();
    boolean isFull();
    void push(Object element) throws Exception;
    Object pop() throws Exception;
    Object top();
}
