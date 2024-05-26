class Solution {
public:
    int res=0;
    int empty=1;
    
    void helper(vector<vector<int>>&grid,int i,int j,int n,int m,int count){
        
        if(i<0 || i>=n || j<0 || j>=m || grid[i][j]==-1) return ;
        
        if(grid[i][j]==2){
            if(count==empty) res++;
            return;
        }
        
        grid[i][j]=-1;
        
        helper(grid,i+1,j,n,m,count+1);
        helper(grid,i-1,j,n,m,count+1);
        helper(grid,i,j+1,n,m,count+1);
        helper(grid,i,j-1,n,m,count+1);
        
        grid[i][j]=0;
        
    }
    
    int uniquePathsIII(vector<vector<int>>& grid) {
        int start_i;
        int start_j;
        int n=grid.size();
        int m=grid[0].size();
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1){
                    start_i=i;
                    start_j=j;
                }
                else if(grid[i][j]==0) empty++;
            }
        }
        helper(grid,start_i,start_j,n,m,0);
        
        return res;
        
    }
};
