public class Main {

        public static void main(String[] args) {
            int nums[] = new int[]{28, 29, 30, 29, 31};
            int len;
            len = nums.length;
            int sum = 0;
             for ( int i = 0; i<nums.length; i++) {
                sum += nums[i] ;
             }
            int middle = sum/len;
            System.out.println(middle);

        }
    }

