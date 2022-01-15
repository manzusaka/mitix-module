package userfuncsimp.binaryfuncs;

import userfuncs.binaryfuncs.BinaryFunc;

/**
 * @author oldflame-jm
 * @date 2022/1/15
 * mitix-module
 * @since 1.0.0
 */
public class AbsPlus implements BinaryFunc {
    @Override
    public String getName() {
        return "absPlus";
    }

    @Override
    public int func(int a, int b) {
        return Math.abs(a) + Math.abs(b);
    }
}
