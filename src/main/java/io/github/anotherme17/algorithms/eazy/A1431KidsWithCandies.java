package io.github.anotherme17.algorithms.eazy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lirenhao
 * date: 2020/6/1 8:04 下午
 */
public class A1431KidsWithCandies {

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        for (int candy : candies) {
            if (candy > max) {
                max = candy;
            }
        }

        List<Boolean> list = new ArrayList<>();
        for (int candy : candies) {
            list.add((candy + extraCandies) >= max);
        }
        return list;
    }
}
