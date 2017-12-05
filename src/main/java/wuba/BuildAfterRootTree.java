package wuba;

import java.util.ArrayList;
import java.util.List;
import java.util.function.LongToDoubleFunction;

public class BuildAfterRootTree {
	private static List<Integer> afterRootTree = new ArrayList<Integer>(10);

	public static void main(String[] args) {

		int[] a = { 3, 4, 7, 2, 1, 5, 0, 8 };
		int[] b = { 2, 7, 4, 1, 3, 0, 5, 8 };
		buildAfterRootTree(a, 0, 7, b, 0, 7);
		for (int i : afterRootTree) {
			System.out.print(i + " ");
		}
	}

	/**
	 * 递归完成后跟序列的输出，方法返回为空，但后续序列保存在static 列表ArrayList中
	 * 
	 * @param firstRoot
	 *            先根数组
	 * @param head1
	 *            先根起始位置
	 * @param tail1
	 *            先根结束位置
	 * @param centerRoot
	 *            中序数组
	 * @param head2
	 *            中序起始位置
	 * @param tail2
	 *            中序结束位置
	 */
	public static void buildAfterRootTree(int[] firstRoot, int head1, int tail1, int[] centerRoot, int head2,
			int tail2) {
		// 递归跳出条件，只有一个节点，一个元素时
		if (head1 > tail1) {
			return;
		}
		// 每次，先从先根序列中获得根节点，然后将中序序列以根节点为界限分为左右两侧
		int root = firstRoot[head1];
		int root_in_center = getIndex(centerRoot, root);

		// 核心是确定，左右两侧下标-左右根
		buildAfterRootTree(firstRoot, head1 + 1, head1 + root_in_center - head2, centerRoot, head2, root_in_center - 1);
		buildAfterRootTree(firstRoot, head1 + root_in_center - head2 + 1, tail1, centerRoot, root_in_center + 1, tail2);

		afterRootTree.add(root);
		// System.out.println(root);

	}

	public static List<Integer> buildAfterRootTreeWithLoop(int[] firstRoot, int head1, int tail1, int[] centerRoot,
			int head2, int tail2) {
		
		// 每次，先从先根序列中获得根节点，然后将中序序列以根节点为界限分为左右两侧
		int root = firstRoot[head1];
		int root_in_center = getIndex(centerRoot, root);

		// 核心是确定，左右两侧下标-左右根
		buildAfterRootTree(firstRoot, head1 + 1, head1 + root_in_center - head2, centerRoot, head2, root_in_center - 1);
		buildAfterRootTree(firstRoot, head1 + root_in_center - head2 + 1, tail1, centerRoot, root_in_center + 1, tail2);

		

		while (head1 < tail1) {
			
			
			
		}
		return null;

	}

	/**
	 * 从无序数组获得元素下标
	 * 
	 * @param arr
	 * @param key
	 * @return
	 */
	public static int getIndex(int[] arr, int key) {
		for (int i = 0; i < arr.length; i++) {
			if (key == arr[i]) {
				return i;
			}
		}
		return -1;
	}
}
