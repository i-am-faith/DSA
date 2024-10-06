import java.util.*;
class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> arrl = new ArrayList<>(n);
        for(int i=1;i<=n;i++)
        {
            if(i%15 == 0)
            {
                arrl.add("FizzBuzz");
            }
            else if(i%3 == 0)
            {
                arrl.add("Fizz");
            }
            else if(i%5 == 0)
            {
                arrl.add("Buzz");
            }
            
            else
            {
                arrl.add(Integer.toString(i));
            }
        }
        return arrl;
    }
}