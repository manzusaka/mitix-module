package appsupport.supportfuncs;

/**
 * @author oldflame-jm
 * @date 2022/1/15
 * mitix-module
 * @since 1.0.0
 */
public class SupportFuncs {
    public static boolean isFactor(int a, int b) {
        if ((b % a) == 0) {
            return true;
        }
        return false;
    }
}
