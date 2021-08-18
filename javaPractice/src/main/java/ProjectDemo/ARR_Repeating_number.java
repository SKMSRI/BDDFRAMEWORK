package ProjectDemo;

public class ARR_Repeating_number {

	public static void main(String args[]) {

        int[] arr = new int[]{1,2,3,4,5,7,4,9};
        firstRepeating(arr);
    }

    public static void firstRepeating(int[] arr) {

        int minimum = -1;
        HashSet set = new HashSet();
        for (int i = arr.length-1 ;i >=0 ;i--) {
            if(set.contains(arr[i]))
                minimum = i;
            else
                set.add(arr[i]);
        }
        if(minimum != -1){
            System.out.println("first repeating element is  : "+ arr[minimum]);
        }
    }

}
