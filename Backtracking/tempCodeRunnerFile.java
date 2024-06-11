public static int grid(int i,int j,int n,int m){
        //base
        if(i==n-1 && j==m-1){ // cond to last cell
            return 1;
        }
        else if(i==n || j==m){ // boundary cross cond
            return 0;
        }
        int w1=grid(i+1, j, n, m);
        int w2=grid(i, j+1, n, m);
        return w1+w2;

    }