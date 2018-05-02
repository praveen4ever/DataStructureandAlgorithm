/**
 * 
 */
package unionFind;

/**
 * @author PRD
 *
 */
public class QuickFindUF {

	private int[] id;

	public QuickFindUF(int size) {
		id = new int[size];
		for (int i = 0; i < size; i++) {
			id[i] = i;

		}
	}

	public boolean connected(int p, int q) {
		return id[p] == id[q];
	}

	public void union(int p, int q) {
		int pid = id[p];
		int qid = id[q];
		for (int i = 0; i < id.length; i++) {
			if (id[i] == pid)
				id[i] = qid;

		}
	}

	public int[] getId() {
		return id;
	}

	public void setId(int[] id) {
		this.id = id;
	}

}
