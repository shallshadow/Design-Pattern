package composite;
/**
 * @author shadow
 * @Date 2016年8月4日下午7:58:19
 * @Fun  树 整体
 **/
public class Tree {
	private TreeNode root;
	
	public Tree(String name){
		this.root = new TreeNode(name);
	}
	
	public TreeNode getRoot(){
		return root;
	}
}
