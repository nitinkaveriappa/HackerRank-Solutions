/* Hidden stub code will pass a root argument to the function below. Complete the function to solve the challenge. Hint: you may want to write one or more helper functions.

The Node class is defined as follows:
    class Node {
        int data;
        Node left;
        Node right;
     }
*/
    boolean checkBST(Node root) {
        ArrayList<Integer> arr=new ArrayList<Integer>();
        inorder(root,arr);
        int flag=0;
        for(int i=1;i<arr.size();i++)
			if(arr.get(i)>arr.get(i-1))
				continue;
			else
			    return false;
        return true;
    }

    void inorder(Node root,ArrayList<Integer> ar)
    {
        if(root==null)return;
        inorder(root.left,ar);
        ar.add(root.data);
        inorder(root.right,ar);
    }
