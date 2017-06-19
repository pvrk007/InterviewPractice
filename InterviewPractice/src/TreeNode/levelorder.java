package TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class levelorder {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list=new ArrayList<>();
         Queue<TreeNode> q=new LinkedList<TreeNode>();
         if(root==null) return list;
         q.offer(root);
         while(!q.isEmpty()){
             List<Integer> sublist=new ArrayList<Integer>();
             int size=q.size();
             for(int i=0;i<size;i++){
                 TreeNode temp=q.poll();
                 sublist.add(temp.val);
                 if(temp.left!=null){
                     q.offer(temp.left);
                 }
                 if(temp.right!=null){
                     q.offer(temp.right);
                 }
                 
             }
             list.add(sublist);
         }
         return list;
    }
}
