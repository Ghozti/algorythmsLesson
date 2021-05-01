package ghozti.mousesquad;

public class BigO {

    /**
     * Big o is used to describe the performance of al algorithm.
     *
     *
     * public void log(int[] nums){
     *     System.out.println(nums[0]);
     * }
     *
     * ^ above is a method which takes an array of numbers. The method will always print out the first index no matter what size the array is.
     * The method always runs in constant time which is presented using O(1)
     *******************************************************************************************************************************************************************************************
     * public void log(int[] nums){
     *      System.out.println(nums[0]);
     *      System.out.println(nums[0]);
     * }
     *
     * ^ duplicating the same lin twice would make the method run in constant time (O(2))
     * How ever since it is running in constant time complexity this can be reduced from --> O(2) to --> O(1)
     *
     *    public void log(int[] nums){
     *         for (int i = 0; i < nums.length; i++) {
     *             System.out.println(nums[i]);
     *         }
     *     }
     *
     *     ^ taking a look at this method, it will print out every item in the given array. Meaning that unlike the other method where it only prints out a single time, it will print out as many times as it takes
     *     to print every element.
     *     This means that this algorithm's cost will grow linearly with it's input size.
     *     This makes it's runtime complexity O(n) (where n represents the size of the input)
     *******************************************************************************************************************************************************************************************
     *  public void log(int[] nums){
     *      System.out.println();
     *      for (int i = 0; i < nums.length; i++) {
     *          System.out.println(nums[i]);
     *      }
     *      System.out.println();
     *  }
     *
     *  ^ taking the same method but adding 2 more print statements before and after the for loop will change the runtime complexity.
     *    public void log(int[] nums){
     *        System.out.println();//O(1)
     *           for (int i = 0; i < nums.length; i++) {// O(n)
     *              System.out.println(nums[i]);
     *           }
     *        System.out.println();//O(1)
     *    }
     *
     *    making the final runtime complexity : O(1 + n + 1)
     *
     *    however. We drop the constant (2) since it does not matter. Because the cost grows linearly adding 2 to O will not have a significant impact in the cost of the algorithm
     *    making O(2 + n) simply --> O(n)
     *******************************************************************************************************************************************************************************************
     *     public void log(int[] nums){
     *         for (int i = 0; i < nums.length; i++) {
     *             System.out.println(nums[i]);
     *         }
     *
     *         for (int i = 0; i < nums.length; i++) {
     *             System.out.println(nums[i]);
     *         }
     *     }
     *  ^ duplicating the for loop in this algorithm will simply make the runtime complexity O(2n) since O(n) is repeated twice
     *  however we can still drop the constant (2) and just leave it at O(n) since the algorithm cost will still be linear
     *
     *      public void log(int[] nums, String[] names){
     *         for (int i = 0; i < nums.length; i++) {
     *             System.out.println(nums[i]);
     *         }
     *
     *         for (int i = 0; i < names.length; i++) {
     *             System.out.println(nums[i]);
     *         }
     *     }
     *
     *     ^ the same runtime complexity is applied to this method which takes 2 parameters. Because they still run linearly the runtime complexity remains as O(n)
     *******************************************************************************************************************************************************************************************
     *
     *    public void log(int[] nums, String[] names){
     *         for (int i = 0; i < nums.length; i++) {
     *             for (int o = 0; o < names.length; o++) {
     *                 System.out.println(nums[o]);
     *             }
     *         }
     *     }
     *
     *     ^in the method above, the nested for loop will run as many times as the first one does. Meaning that it's runtime complexity is O(n^2).
     *     This algorithm runs in quadratic time, which runs slower than a linear algorithm as the input grows larger
     *
     *     adding another nested loop will cause the algorithm to run in o(n^3) (cubed) which will run far slower than o(n^2)
     *******************************************************************************************************************************************************************************************
     *
     *  Growth Rates:
     *
     *  - O(log n) (logarithmic) - this growth rate will grow at the same rate as O(n) (linear) but will slow down at some point. This makes this growth rate more efficient and scalable than a linear algorithm
     *   ex: say you have an array of sorted numbers from 1 to 10. and you wish to find the number 10. Using a for loop to iterate through every element will be using O(n) or a linear algorithm
     *   however you can use binary search  which runs in O(log n) (logarithmic) which is much faster. Binary search will start off by looking at the middle value. then it will see if the value is smaller or greater
     *   than the one we are looking for. Since 5 is smaller than 10, 10 must be on the right side of the array. This leaves out the values 1-5 automatically without having to iterate though them.
     *   This algorithm will repeatively narrow down the search until the value is found without having to iterate through every element. This matters because in an array with a large input ex: 1M, this algorithm will only need to compare 19 times.
     *
     * - O(2^n) (exponential) this algorithm is the opposite of O(log n). As the input size grows the logarithmic algorithm's curve slows down. However as the input grows an exponential algorithm's curve grows faster.
     *  This algorithm is not scalable at all resulting in it being very slow.
     */

    public void log(int[] nums, String[] names){
        for (int i = 0; i < nums.length; i++) {
            for (int o = 0; o < names.length; o++) {
                System.out.println(nums[o]);
            }
        }
    }
}
