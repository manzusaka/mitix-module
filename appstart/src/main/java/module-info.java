/**
 * @author oldflame-jm
 * @date 2022/1/15
 * mitix-module
 * @since 1.0.0
 */
module appstart {
    requires appfuncs;
    requires userfuncsimp;
    exports appstart.mymodappdemo;

    uses userfuncs.binaryfuncs.BinFuncProvider;
}