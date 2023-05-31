public class Array5 {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] nums3=new int[m];
        for(int i=0;i<m;i++)
        {
            nums3[i]=nums1[i];
        }
        int p1=0;
        int p2=0;
        for(int p=0;p<m+n;p++){
            if(p2>=n||(p1<m && nums3[p1] <=nums2[p2])){
                nums1[p]=nums3[p1];
                p1++;
            }
            else{
                nums1[p]=nums2[p2];
                p2++;
            }
        }
    }

    
    public static void main(String[] args){
        int[] nums1={1,2,3,0,0,0};
        int m=3;
        int[] nums2={2,5,6};
        int n=3;
     merge(nums1, m, nums2, n);
     for(int i=0;i<m+n;i++){
    
        System.out.print(nums1[i]+" "); 
     }
    System.out.println();

    
    }
}
