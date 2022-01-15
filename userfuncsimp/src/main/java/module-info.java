/**
 * @author oldflame-jm
 * @date 2022/1/15
 * mitix-module
 * @since 1.0.0
 */
module userfuncsimp {
    requires transitive userfuncs;
    provides userfuncs.binaryfuncs.BinFuncProvider with userfuncsimp.binaryfuncs.AbsPlusProvider, userfuncsimp.binaryfuncs.AbsMinusProvider;
    exports userfuncsimp.binaryfuncs;
}