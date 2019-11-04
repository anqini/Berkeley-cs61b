public class MaxInt {
    /** Returns the maximum value from m. */
    public static int max(int[] m) {
    	int max = Integer.MIN_VALUE;
    	for (int i = 0; i < m.length; i ++) {
    		max = m[i] > max ? m[i] : max;
    	}
        return max;
    }
    public static void main(String[] args) {
       // int[] numbers = new int[]{9, 2, 15, 2, 22, 10, 6};      
       // System.out.println(max(numbers));
    	String s1 = new String("123");
    	String s2 = s1;
    	System.out.println(s1.charAt(0));
    	System.out.println(s2);
    }
}
