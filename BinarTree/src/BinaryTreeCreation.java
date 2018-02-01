import java.util.Stack;

public class BinaryTreeCreation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = createBinaryTree();
		//Recursion preOrder(root);
		//preOrder1(root);
		inOrder(root);
		

	}

	private static void inOrder(Node root) {
		// TODO Auto-generated method stub
		if(root !=  null) {
			
			inOrder(root.Left);
			System.out.println(root.data);
			inOrder(root.right);
			}
		
	}

	private static void preOrder1(Node root) {
		// TODO Auto-generated method stub
		Stack<Node> stack = new Stack<Node>();
		stack.push(root);
		while(!stack.isEmpty()){
			Node n = stack.pop();
			System.out.println(n.data);
			if(n.right!=null)
				stack.push(n.right);
			if(n.Left!=null)
				stack.push(n.Left);
		}
		
	}

	private static void preOrder(Node root) {
		// TODO Auto-generated method stub
		if(root !=  null) {
		System.out.println(root.data);
		preOrder(root.Left);
		preOrder(root.right);
		}
		
	}

	private static Node createBinaryTree() {
		// TODO Auto-generated method stub
		Node rootNode =new Node(40);
		Node node20=new Node(20);
		Node node10=new Node(10);
		Node node30=new Node(30);
		Node node60=new Node(60);
		Node node50=new Node(50);
		Node node70=new Node(70);
 
		rootNode.Left=node20;
		rootNode.right=node60;
 
		node20.Left=node10;
		node20.right=node30;
 
		node60.Left=node50;
		node60.right=node70;
 
		return rootNode;
	}

}
