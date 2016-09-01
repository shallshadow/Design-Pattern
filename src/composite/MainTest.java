package composite;

import java.util.List;
/**
 * @author shadow
 * @Date 2016年8月4日下午8:06:20
 * @Fun  组合(Composite)模式，又叫做部分--整体模式<br/>
 * 		 它使我们层级、树形结构的问题中，模糊了简单元素和复杂元素的概念，客户程序可以像处理简单元素一样来处理复杂元素，<br/>
 * 		从而使得客户程序与复杂元素的内部结构解耦。<br/>
 * 
 * 		以下情况下适用Composite模式：<br/ >
 * 			1.你想表示对象的部分--整体层次结构。<br/>
 * 			2.你希望用户忽略组合对象与单个对象的不同，用户将统一地使用组合结构中的所有对象。
 **/
public class MainTest {
	public static void main(String[] args) {
		//Tree对象的使用
//		Tree treeA = new Tree("A");
//		treeA.getRoot().add(new TreeNode("B"));
//		treeA.getRoot().add(new TreeNode("C"));
//		treeA.getRoot().add(new TreeNode("D"));
//		
//		TreeNode treeNodeE = new TreeNode("E");
//		treeNodeE.add(new TreeNode("E01"));
//		treeNodeE.add(new TreeNode("E02"));
//		treeA.getRoot().add(treeNodeE);
//		
//		treeA.getRoot().add(new TreeNode("F"));
//		
//		
//		print(treeA.getRoot());
		
		TreeNode treeA = new TreeNode("A");
		treeA.add(new TreeNode("B"));
		treeA.add(new TreeNode("C"));
		TreeNode treeNodeD = new TreeNode("D");
		treeNodeD.add(new TreeNode("D01"));
		treeNodeD.add(new TreeNode("D02"));
		treeA.add(treeNodeD);
		
		print(treeA);
		
		/**
		 * 其他示例：文件系统（目录、文件），类似这种可用递归遍历的结构，用一个对象就能表示部分与整体，都可以用组合模式。
		 */
	}
	
	public static void print(TreeNode root){
		if(root == null){
			return;
		}
		System.err.println(root.getName());
		print(root.getChildren());
		
	}
	
	public static void print(List<TreeNode> children){
		if(children == null || children.size() <= 0){
			return;
		}
		
		for(int i = 0; i < children.size(); i++){
			System.out.println(children.get(i).getName());
			print(children.get(i).getChildren());
		}		
	}
}
/**
 * 推荐博客：http://blog.csdn.net/hguisu/article/details/7530783
 * */
