package appstart.mymodappdemo;

import appfuncs.simplefuncs.SimpleMathFuncs;
import appsupport.supportfuncs.SupportFuncs;
import userfuncs.binaryfuncs.BinFuncProvider;

import java.util.Optional;
import java.util.ServiceLoader;

/**
 * @author oldflame-jm
 * @date 2022/1/15
 * mitix-module
 * @since 1.0.0
 */
public class MyModAppDemo {
    public static void main(String[] args) {
        if (SupportFuncs.isFactor(2, 10)) {
            System.out.println("2 is a factor of 10");
        }

        int lcf = SimpleMathFuncs.lcf(35, 105);
        System.out.println("smallest factor common to both 35 and 105 is " + lcf);

        int gcf = SimpleMathFuncs.gcf(35, 105);
        System.out.println("great of factor common to both 35 and 105 is " + gcf);

        ServiceLoader<BinFuncProvider> loader = ServiceLoader.load(BinFuncProvider.class);
        Optional<ServiceLoader.Provider<BinFuncProvider>> optionalAbsProvider = loader.stream().filter(p -> p.get().get().getName().equals("absPlus")).findFirst();
        Optional<ServiceLoader.Provider<BinFuncProvider>> optionalMinusProvider = loader.stream().filter(p -> p.get().get().getName().equals("absMinus")).findFirst();

        if (optionalAbsProvider.isPresent()) {
            System.out.printf("Result of Plus is = %d \n", optionalAbsProvider.get().get().get().func(12, -4));
        }
        if (optionalMinusProvider.isPresent()) {
            System.out.printf("Result of Minus is = %d \n", optionalMinusProvider.get().get().get().func(12, -4));
        }

    }
}
