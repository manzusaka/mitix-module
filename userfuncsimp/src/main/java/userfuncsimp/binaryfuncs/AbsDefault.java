package userfuncsimp.binaryfuncs;

import userfuncs.binaryfuncs.BinaryFunc;

/**
 * @author oldflame-jm
 * @date 2022/1/15
 * mitix-module
 * @since 1.0.0
 */
public class AbsDefault implements BinaryFunc {
    @Override
    public String getName() {
        return "absDefault";
    }

    @Override
    public int func(int a, int b) {
        return Integer.MIN_VALUE;
    }
}
