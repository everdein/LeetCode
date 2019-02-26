// Matthew Clark
// LeetCode 67. Add Binary (Easy)
// Runtime 97.10%

class Solution
{
    public static void main(String[] args)
    {
        String a = "1010";
        String b = "1011";
        String result = addBinary(a, b);
        System.out.println(result);
    }

    public static String addBinary(String a, String b) 
    {
        StringBuilder sb = new StringBuilder();
 
        int i = a.length() - 1;
        int j = b.length() - 1;
     
        int carry = 0;
     
        while(i >= 0 || j >= 0)
        {
            int sum = 0;
     
            if(i >= 0 && a.charAt(i) == '1')
            {
                sum++;
            }
     
            if(j >= 0 && b.charAt(j) == '1')
            {
                sum++;
            }
     
            sum += carry;
     
            if(sum >= 2){
                carry = 1;
            }
            
            else
            {
                carry = 0;
            }
            
            // The insert method adds the characters at a specified point.
            sb.insert(0,  (char) ((sum % 2) + '0'));
     
            i--;
            j--;
        }
     
        if(carry == 1)
        {
            sb.insert(0, '1');
        }

        return sb.toString();
    }
}