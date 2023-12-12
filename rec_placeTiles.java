public class rec_placeTiles {
    public static int placeTiles(int n,int m){
        if(n==m){
            return 2;
        }
        if(n<m){
            return 1;
        }
        int verticalTiles=placeTiles(n-m,m);
        int horizontalTiles=placeTiles(n-1,m);
        return verticalTiles +horizontalTiles;
    }
    public static void main(String args[]){
        int m=3;
        int n=5;
        System.out.println(placeTiles(n,m));

    }
    
}
