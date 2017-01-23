package rmuti.arraylist;

public class ArrayList {
	private Object[] elementData = new Object[1];
	private int size = 0;

	public void add(int i, Object e) {
		ensureCapacity(size + 1);
		for (int j = size; j >= i; j--) {
			elementData[j + 1] = elementData[j];
		}
		elementData[i] = e;
		size++;

	}

	public void add(Object e) {
		// elementData[size++]=e;
		add(size++, e);
	}

	public void ensureCapacity(int capacity) {
		int x = 2 * elementData.length;
		Object[] arr = new Object[x];
		for (int i = 0; i < size; i++) {
			arr[i] = elementData[i];
		}
		elementData = arr;
	}

}
