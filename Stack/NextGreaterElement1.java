import java.util.Stack;
class NextGreaterElement1 {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n = nums2.length;
        int[] nge = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && st.peek()<=nums2[i]){
                st.pop();
            }
            if(st.isEmpty()){
                nge[i] = -1;
            }
            else{
                nge[i] = st.peek();
            }
            st.push(nums2[i]);
        }
        int m = nums1.length;
        int[] ans = new int[m];
        for(int i=0;i<nums1.length;i++){
            int val = nums1[i];
            for(int j=0;j<nums2.length;j++){
                if(nums2[j]==val){
                    ans[i] = nge[j];
                    break;
                }
            }
        }
        return ans;

    }
}