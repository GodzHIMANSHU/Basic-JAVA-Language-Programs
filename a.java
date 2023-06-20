
public class a {
    
/**
 * @param a
 * @param b
 * @return
 */
public static int  linear( int a[] , int b) {
for (int i=0;i<a.length;i++){
    if (a[i]==b){
        return i;
    }
} 
return -1;
}
public static int  largest(int a[]) {
    int b=a[0];
    for (int i=0;i<a.length;i++){
        if (a[i]>b){
            b=a[i];
        }
    }
    return b;
}
/**
 * @param number
 * @param key
 * @return
 */
 public static int binarysearch(int number[] , int key){
    int start =0,end=number.length-1;
    while (start <=end)
    {
    int mid = (start + end)/2;
    if (number[mid]==key){
        return mid;
    }
    if (number[mid]<key)
    {
        start=mid +1;
    }
    if (number[mid]>key){
        start=mid-1;
    }


    }
    return -1;
}
public static void reverse(int a[] ) {
    int first=a[0];
 int last=number.length-1;
 
}
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,7,8};
    
//int index=largest(a);
        //if (index==-1){
          //  System.out.println("NOt Found");
        //}
        //else 
   // int b=9;
    
        // System.out.println(" no. is at index: "+index);
   //System.out.println("index for key is:"+binarysearch(a, b));
        }
  
}
