package Stack;
import java.util.Stack;

class DailyTemperatures {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> st = new Stack<>();
        int n = temperatures.length;
        int[] res = new int[n];
        for(int i=0;i<temperatures.length;i++){
            while(!st.isEmpty() && temperatures[i]>temperatures[st.peek()]){
                int idx = st.pop();
                res[idx] = i-idx;
            }
            st.push(i);
        }
        return res;
    }
}