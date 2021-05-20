class Solution
{
    void merge(int arr[], int l, int m, int r)
    {
         // Your code here
         int a1 = m-l+1;
         int a2 = r-m;
         
         int la1[] = new int[a1];
         int la2[] = new int[a2];
         for(int i=0;i<a1;++i){
             la1[i] = arr[l+i];
         }
         for(int i=0;i<a2;++i){
             la2[i] = arr[m+1+i];
         }
         
         int i=0,j=0,k=l;
         //int c [] = new int[r];
         while(i<a1 && j<a2){
             if(la1[i]<=la2[j]){
                 arr[k] = la1[i];
                 i++;
                 k++;
             }
             else{
                 arr[k] = la2[j];
                 j++;
                 k++;
             }
         }
         while(i<a1){
             arr[k] = la1[i];
                 i++;
                 k++;
         }
         while(j<a2){
             arr[k] = la2[j];
                 j++;
                 k++;
         }
    }
    void mergeSort(int arr[], int l, int r)
    {
        //code here
        if(l<r){
            int m = l+(r-l)/2;
            mergeSort(arr, l,m);
            mergeSort(arr, m+1,r);
            merge(arr,l,m,r);
        }
    }
}
