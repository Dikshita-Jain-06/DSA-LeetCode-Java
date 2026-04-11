import java.util.Stack;

class NextGreaterElement2 {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i=2*n-1;i>=0;i--){
            int index = i%n;
            while(!st.isEmpty() && st.peek()<=nums[index]){
                st.pop();
            }
            if(i<n){
                if(st.isEmpty()){
                    ans[index] = -1;
                }
                else{
                    ans[index] = st.peek();
                }
            }
            st.push(nums[index]);

        }
        return ans;
    }
}





//METHOD 2   FORWARD LOOP
// class Solution {
//     public int[] nextGreaterElements(int[] nums) {
//         int n = nums.length;
//         int[] res = new int[n];
//         Stack<Integer> st = new Stack<>();
//         for(int i=0;i<2*n-1;i++){
//             int index = i%n;
//             while(!st.isEmpty() && st.peek()<=nums[i]){
//                 st.pop();
//             }
//             if(i<n) st.push(index);
//         }
//         return res;
        

//     }
// }