public class QuickFind {
    private int[] id;
    public QuickFind()
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
    
    public boolean connected(int id1, int id2) {
	        return id[id1] == id[id2];
    }
    
    public void union(int id1, int id2) {
        int id_1 = id[id1];
        int id_2 = id[id2];
        for (int i = 0; i < id.length; i++) {
            if (id[i] == id_1) id[i] = id_2; 
        }
    }
    
    public static void main(String[] args) {
        QuickFind q = new QuickFind();
        q.connected(3, 7);
        System.out.println(q.connected(3, 7));
        q.union(3, 7);
        for (int i = 0; i < 10; i++) 
            System.out.print(q.id[i] + " ");
    }
}
