class Solution {
    public double average(int[] salary) {
        int minIndex = 0;
        int maxIndex = 0;

        double avg = 0;
        double largestAndSmallestSum =  salary[0] + salary[0];
        double total_sum = salary[0];

        for(int i = 1 ; i < salary.length ; i++){
            if(salary[i] < salary[minIndex]){
                largestAndSmallestSum -= salary[minIndex];
                minIndex = i;
                largestAndSmallestSum += salary[minIndex];                
            }
            else if(salary[i] > salary[maxIndex]){
                largestAndSmallestSum -= salary[maxIndex];
                maxIndex = i;
                largestAndSmallestSum += salary[maxIndex];
            }
            total_sum += salary[i];
        }

        double ans = (total_sum - largestAndSmallestSum) / (salary.length - 2);
        return ans;
    }
}