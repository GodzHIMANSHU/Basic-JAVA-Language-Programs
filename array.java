/**
 * array
 */
public class array {

    public static void twice(int a[]){
        int b=0;
        for (int i=0;i<a.length;i++){
            for (int j=i+1;j<a.length;j++){
                if (a[i]==a[j]){
                    b=b+1;
                }
            }
        }
        if (b==0){
            System.out.println("FALSE");
        }
        else {
            System.out.println("TRUE");
        }
    } 
    public static int stocks(int a[]){
        int maxprofit=0;
        int buyprice=Integer.MAX_VALUE;
        for (int i=0;i<a.length;i++){
            if (buyprice<a[i]){
                int profit=a[i]-buyprice;
                maxprofit=Math.max(maxprofit,profit);
            }
            else {
                buyprice=a[i];
            }
    }
    return maxprofit;

}
public static int trappedwater(int a[]){
    int n=a.length;
    int leftmax[]=new int [n];
    leftmax[0]=a[0];
    for (int i=1;i<n;i++){
        leftmax[i]=Math.max(a[i],leftmax[i-1]);
    }
    int rightmax[]=new int [n];
    rightmax[n-1]=a[n-1];
    for (int i=(n-2);i>=0;i--){
        rightmax[i]=Math.max(a[i],rightmax[i+1]);

    }
    int watertrapped=0;
    for (int i=0;i<n;i++){
        int waterlevel=Math.min(leftmax[i],rightmax[i]);
            watertrapped=watertrapped+(waterlevel-a[i]);

    }
     return watertrapped;
}
public static void main(String[] args) {
    int a[]={0,2,0,1,3,1,2,1};
   // twice(a);
   //int d=stocks(a);
   int d=trappedwater(a);
   System.out.println(d);

}
    
}