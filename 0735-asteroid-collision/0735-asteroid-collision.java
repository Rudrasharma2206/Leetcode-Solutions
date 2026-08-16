import java.util.Stack;

class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        int n = asteroids.length;

        for (int i = 0; i < n; i++) {
            int ast = asteroids[i];
            boolean exploded = false;

            // Collision check: stack top moving right (> 0) and current asteroid moving left (< 0)
            while (!stack.isEmpty() && stack.peek() > 0 && ast < 0) {
                if (stack.peek() < -ast) {
                    stack.pop(); // Top asteroid explodes, loop continues to check previous ones
                    continue;
                } else if (stack.peek() == -ast) {
                    stack.pop(); // Both asteroids destroy each other
                }
                exploded = true; // Current asteroid explodes
                break;
            }

            if (!exploded) {
                stack.push(ast);
            }
        }

        // Copy elements from stack into the output array
        int[] result = new int[stack.size()];
        for (int i = result.length - 1; i >= 0; i--) {
            result[i] = stack.pop();
        }

        return result;
    }
}