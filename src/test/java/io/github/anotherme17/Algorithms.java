package io.github.anotherme17;

import io.github.anotherme17.algorithms.eazy.A1两数之和;
import io.github.anotherme17.algorithms.middle.A2两数相加;
import org.junit.Test;

/**
 * @author lirenhao
 * date: 2019-08-15 16:16
 */
public class Algorithms {

    @Test
    public void a1两数之和() {
        int[] nums = new int[]{0, 4, 3, 0};
        int target = 0;
        int[] result = A1两数之和.solution2(nums, target);
        if (result != null) {
            System.out.println(result[0] + ": " + nums[result[0]]);
            System.out.println(result[1] + ": " + nums[result[1]]);
        }
    }

    @Test
    public void a2两数相加(){
        A2两数相加 a2两数相加 = new A2两数相加();
    }
}
