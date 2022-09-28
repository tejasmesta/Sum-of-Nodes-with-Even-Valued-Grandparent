class Solution {
    int sum;
    
    public int sumEvenGrandparent(TreeNode root) 
    {
        sum = 0; 
        
        dfs(root,null,null);
        
        return sum;
    }
    
    void dfs(TreeNode node,TreeNode par,TreeNode gPar)
    {
        if(node==null)
        {
            return;
        }
        if(gPar!=null && gPar.val%2==0)
        {
            sum+=node.val;
        }
        dfs(node.left,node,par);
        dfs(node.right,node,par);
    }
}
