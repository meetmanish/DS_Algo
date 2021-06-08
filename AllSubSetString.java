class LexSort
{
    //Function to return the lexicographically sorted power-set of the string.
    
    static ArrayList<String> powerSet(String s)
    {
        // add your code here
        ArrayList<String> arr = new ArrayList<String>();
        String op = "";
        solve(s,op,arr);
        Collections.sort(arr);
        return arr;
        
    }
    
    static void solve(String s,String op, ArrayList<String> arr ){
        if(s.length() == 0){
            arr.add(op);
            return;
        }
        String op1=op;
        String op2=op;
        op1+=s.charAt(0);
        s = s.substring(1);
        solve(s,op1, arr);
        solve(s,op2, arr);
        return;
    }
}
