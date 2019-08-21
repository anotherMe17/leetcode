package io.github.anotherme17.algorithms.eazy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lirenhao
 * date: 2019-08-15 16:19
 * <p>
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 * <p>
 * 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/two-sum
 */
public class A1两数之和 {

    /**
     * O(n^2)
     *
     * @param nums
     * @param target
     * @return
     */
    public static int[] solution(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i == j)
                    continue;
                if ((nums[i] + nums[j]) == target)
                    return new int[]{i, j};
            }
        }
        return null;
    }

    public static int[] solution2(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                return new int[]{map.get(nums[i]), i};
            }
            map.put(target - nums[i], i);
        }
        return null;
    }
}
