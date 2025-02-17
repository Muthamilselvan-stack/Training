class consecutive_number
{
	public static void main(String[] args)
	{
	    int arr[]={1,1,0,1,1,0,0,1,0,1,1,1,0};
	    int count=0;
	    int prev=0;
	    for(int i=0;i<arr.length;i++)
	    {
	        if(arr[i]==1)
	        {
	            count++;
	        }
	        else{
	            if(prev<count)
	            {
	                prev=count;
	                count=0;
	            }
	            else{
	                count=0;
	            }
	        }
	    }
	    System.out.println("Consecutive number of 1's are " + prev);
	    prev=0;
	    for(int i=0;i<arr.length;i++)
	    {
	        if(arr[i]==0)
	        {
	            count++;
	        }
	        else{
	            if(prev<count)
	            {
	                prev=count;
	                count=0;
	            }
	            else{
	                count=0;
	            }
	        }
	    }
	    System.out.println("Consecutive number of 0's are " + prev);
	    
		
	}
}