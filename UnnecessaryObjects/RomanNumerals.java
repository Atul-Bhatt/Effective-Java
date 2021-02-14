package UnnecessaryObjects;

import java.util.regex.Pattern;

// static boolean isRomanNumeral(String s) {
//     return s.matches("^(?=.)M*(C[MD]|D?C{0,3})"
//             + "(X[CL]|L?X{0,3})(I[XV]|V?I{0,3})$");
// }

/**
 * While String.matches is the easiest way to check if a string matches a
 * regular expression, it’s not suitable for repeated use in
 * performance-critical situations. The problem is that it internally creates a
 * Pattern instance for the regular expression and uses it only once, after
 * which it becomes eligible for garbage collection. Creating a Pattern instance
 * is expensive because it requires compiling the regular expression into a
 * finite state machine.
 */

public class RomanNumerals {
    private static final Pattern ROMAN = Pattern
            .compile("^(?=.)M*(C[MD]|D?C{0,3})" + "(X[CL]|L?X{0,3})(I[XV]|V?I{0,3})$");

    static boolean isRomanNumeral(String s) {
        return ROMAN.matcher(s).matches();
    }
}
