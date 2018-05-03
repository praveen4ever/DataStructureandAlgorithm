package unionFind;

public class QucikUnionUF {

	private int[] id;

	public QucikUnionUF(int size) {
		id = new int[size];
		for (int i = 0; i < size; i++)
			id[i] = i;
	}

	public int rootNode(int value) {
		while (value != id[value])
			value = id[value];
		return value;
	}

	public boolean connected(int p, int q) {
		return rootNode(p) == rootNode(q);
	}

	public void union(int p, int q) {
		int i = rootNode(p);
		int j = rootNode(q);
		id[i] = j;

	}

	public int[] getId() {
		return id;
	}

	public void setId(int[] id) {
		this.id = id;
	}

}
