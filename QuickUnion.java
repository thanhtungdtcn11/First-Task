public class QuickUnion {
    public int[] id;
    public QuickUnion()
    {
        id = new int[10];
        id[0] = 0;
        id[1] = 1;
        id[2] = 2;
        id[3] = 3;
        id[4] = 4;
        id[5] = 5;
        id[6] = 6;
        id[7] = 7;
        id[8] = 8;        
        id[9] = 9;                  

    }
    
    public int root(int p) {
        while (id[p] != p) p = id[p];
        return p;
    }
    
    public boolean connected(int id1, int id2) {
        return root(id1) == root(id2);
    }
    
    public void union(int p, int q) {
        id[root(p)] = root(q);
    }
    
    public static void main(String[] args) {
        int N = 10;
        QuickUnion q = new QuickUnion();
        q.union(3, 3);
       // q.union(5, 2);
       // q.union(2, 3);
       // q.union(9, 1);
        //q.union(7, 4);
        ///union(3, 9);
        for (int i = 0; i < N; i++) 
            System.out.print(q.id[i] + " ");
    }
}