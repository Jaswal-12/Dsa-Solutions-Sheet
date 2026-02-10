class Solution {
    public static void reverseStack(Stack<Integer> st) {
        // Base case
        if (st.isEmpty()) return;

        int top = st.pop();          // 1️⃣ top nikala
        reverseStack(st);           // 2️⃣ baaki stack reverse karwa diya
        insertAtBottom(st, top);    // 3️⃣ nikale hue element ko neeche daal diya
    }

    private static void insertAtBottom(Stack<Integer> st, int val) {
        // Base case
        if (st.isEmpty()) {
            st.push(val);
            return;
        }
// https://media.geeksforgeeks.org/img-practice/chatIcon-1653561581.svg
        int top = st.pop();
        insertAtBottom(st, val);
        st.push(top);
    }
}
