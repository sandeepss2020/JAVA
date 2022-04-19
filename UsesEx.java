package hotel_manage;

//Code explaining deep copy
public class Ex {
	
	private int[] data;

	// altered to make a deep copy of values
	public Ex(int[] values) {
		data = new int[values.length];
		for (int i = 0; i < data.length; i++) {
			data[i] = values[i];
		}
	}

	public void showData() {
		System.out.println(Arrays.toString(data));
	}
}


public class UsesEx {

}
