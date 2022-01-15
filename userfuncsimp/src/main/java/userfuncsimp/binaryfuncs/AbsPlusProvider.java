package userfuncsimp.binaryfuncs;

import userfuncs.binaryfuncs.BinFuncProvider;
import userfuncs.binaryfuncs.BinaryFunc;

/**
 * @author oldflame-jm
 * @date 2022/1/15
 * mitix-module
 * @since 1.0.0
 */
public class AbsPlusProvider implements BinFuncProvider {
    @Override
    public BinaryFunc get() {
        return new AbsPlus();
    }
}
