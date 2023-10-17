class Solution {
    public boolean validateBinaryTreeNodes(int n, int[] leftChild, int[] rightChild) {
        int count[] = new int[n];
        for(int i=0;i<n;i++){
            if(leftChild[i] != -1){
                if(++count[leftChild[i]] > 1){
                    return false;
                }
            }
            if(rightChild[i] != -1 ){
                if(++count[rightChild[i]] > 1){
                    return false;
                } 
            }

        }
        int rootcount =0;
        for(int i=0;i<n;i++){
            if(count[i] ==0){
                rootcount++;
                if(rootcount >1){
                    return false;
                }
                if (dfs(i,leftChild,rightChild,count) != n){
                    return false;
                }
            }
        }
        return rootcount == 1;

    }
    private int dfs(int node,int leftChild[],int rightChild[],int count[]){
        if(node == -1) return 0;
        int left = dfs(leftChild[node] , leftChild,rightChild,count);
        int right = dfs(rightChild[node],leftChild,rightChild,count);
        return 1 + left + right;
    }
}