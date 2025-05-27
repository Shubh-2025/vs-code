public class Exeptions {
    public static void divide(int num ,int div){
            try{
                System.out.println("res = " + num/div);
                
            }catch(ArithmeticException e){
                System.out.println(e.getMessage());
            }
    }

    public static void main(String[] args) {
        int nums[] = {1,3,5,6,10,9};
        int divs[] = {1,1,5,2,0,3};
        for(int i = 0 ; i<nums.length ; i++)
        {
                divide(nums[i],divs[i]);
        }
    }
}
