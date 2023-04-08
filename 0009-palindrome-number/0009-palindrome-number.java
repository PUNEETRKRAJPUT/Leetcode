class Solution {
    public boolean isPalindrome(int x) {
              if(x<0 || (x%10==0 && x!=0)){
        return false;
        }
        int reversednum=0;
        while(x>reversednum){
            int pop=x%10;
            reversednum=reversednum*10+pop;
            x/=10;
           
        }
         return (x==reversednum || x==reversednum/10);
        
      
    }
}