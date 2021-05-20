class Solution
{
	int  select(int arr[], int i)
	{
        // code here such that selectionSort() sorts arr[]
        for(int j=i-1; j>=0 ; j--){
            if(arr[j]> arr[i])
                i = j;     
        }
        return i;
	}
	
	void selectionSort(int arr[], int n)
	{
	    //code here
	    for(int i=n-1; i>=1;i--){
	        int max = select(arr, i);
	        int temp = arr[i];
	        arr[i] = arr[max];
	        arr[max] = temp;   
	    }
  }	
}
