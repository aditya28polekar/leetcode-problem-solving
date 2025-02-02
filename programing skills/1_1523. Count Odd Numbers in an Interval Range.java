// approach 1 - O(N) TC
class Solution {
    public int countOdds(int low, int high) {
        int count = 0;
        for(int i = low ; i <= high ; i++){
            if(i%2 == 1) count++;            
        }        
        return count;
    }
}

// approach 2 - O(1) TC
class Solution {
    public int countOdds(int low, int high) {
        int count = 0;
        if (low % 2 == 1)
            count++;
        if (high != low && high % 2 == 1)
            count++;

        // no of digits between 2 numbers (excluding both numbers)
        int diff = high - low - 1;

        if (count == 0) {
            // both are even
            count+= diff > 0 ? diff/2+1 : 0; //ciel value
        } else if (count == 1) {
            // one is odd - then its observed that the value of diff will be a even no
            count+= diff > 0 ? diff/2 : 0;   // this div will be perfectly divisble by 2  

        } else {
            // both are odd
            count+= diff > 0 ? diff/2 : 0; //floor value
        }

        return count;
    }
}
