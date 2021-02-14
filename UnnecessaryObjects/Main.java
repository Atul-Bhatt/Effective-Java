package UnnecessaryObjects;

public class Main {
    public static void main(String args[]) {
        // String s = "XII";

        // System.out.println(RomanNumerals.isRomanNumeral(s));

        /**
         * The variable sum is declared as a Long instead of a long, which means that
         * the program constructs about 231 unnecessary Long instances (roughly one for
         * each time the long i is added to the Long sum). Changing the declaration of
         * sum from Long to long reduces the runtime from 6.3 seconds to 0.59 seconds on
         * my machine. The lesson is clear: prefer primitives to boxed primitives, and
         * watch out for unintentional autoboxing.
         */

        long start = System.currentTimeMillis();

        Long sum = 0L;

        for (long i = 0; i <= Integer.MAX_VALUE; i++)
            sum += i;

        System.out.printf("Sum is %o", sum);

        long end = System.currentTimeMillis();

        System.out.printf("\nLong autoboxing took %f seconds\n", (float) (end - start) / 1000);

        long start1 = System.currentTimeMillis();

        long sum1 = 0L;

        for (long i = 0; i <= Integer.MAX_VALUE; i++)
            sum1 += i;

        System.out.printf("Sum is %o", sum1);

        long end1 = System.currentTimeMillis();

        System.out.printf("\nLong autoboxing took %f seconds\n", (float) (end1 - start1) / 1000);
    }

}
