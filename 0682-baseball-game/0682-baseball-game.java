class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        int n = operations.length;

        for (int i = 0; i < n; i++) {
            if (operations[i].equals("+")) {
                int v1 = stack.pop();
                int v2 = stack.pop();
                stack.push(v2);
                stack.push(v1);
                stack.push(v1 + v2);
            } else if (operations[i].equals("D")) {
                int v3 = stack.peek() * 2;
                stack.push(v3);
            } else if (operations[i].equals("C")) {
                stack.pop();
            } else {
                int v4 = stack.push(Integer.parseInt(operations[i]));
            }
        }
        int sum = 0;
        while (!stack.isEmpty()) {
            sum = sum + stack.pop();
        }
        return sum;
    }
}