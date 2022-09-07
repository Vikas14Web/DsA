class Solution {
    public static int isStackPermutation(int n, int[] ip, int[] op) {
        // code here
        Stack<Integer> stack = new Stack<>();
        int i=0,j=0;
        while(i<n){
            // Add the element from the ip array ====
            stack.push(ip[i]);
            // Check if the stack top contains op element =====
            if(stack.peek() == op[j]){
                stack.pop(); // Remove element and increment op pointer ====
                j++;
                // Check remaining elemtns in stack for current op element =======
                while(!stack.isEmpty() && stack.peek() == op[j]){
                    stack.pop();
                    j++;
                }
            }
            i++;
        }
        // Return true if stack is empty ========
        return stack.isEmpty()?1:0;
    }
}
