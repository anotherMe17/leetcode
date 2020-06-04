package io.github.anotherme17.algorithms.middle;

/**
 * @author lirenhao
 * date: 2020/6/4 1:48 下午
 * <p>
 * https://leetcode-cn.com/problems/product-of-array-except-self/
 */
public class A238ProductExceptSelf {

    public static int[] productExceptSelf(int[] nums) {
        int left = 1, right = 1;
        int n = nums.length;
        int[] product = new int[n];

        for (int i = 0; i < n; i++) {
            product[i] = 1;
        }

        for (int i = 0; i < n; i++) {
            product[i] *= left;
            left *= nums[i];

            product[n - i - 1] *= right;
            right *= nums[n - i - 1];
        }

        return product;
    }

    public static void main(String[] args) {
        int[] res = productExceptSelf(new int[]{1, 2, 3, 4});
        System.out.println(res);
    }
}
