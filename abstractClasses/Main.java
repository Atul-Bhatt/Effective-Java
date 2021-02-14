package abstractClasses;

import java.util.Scanner;

import abstractClasses.EnumClass.Language;

public class Main {
    public static void main(String args[]) {
        // Shape circle = new Circle(2, "Blue");

        // circle.draw();
        // circle.finalMethod();

        Scanner in = new Scanner(System.in);
        System.out.print("Input Language: ");
        String language = in.next();

        if (contains(language)) {
            EnumClass CLanguage = new EnumClass(Language.valueOf(language));
            CLanguage.languageFeature();
        } else {
            System.out.println("Language does not exit in our repository.");
        }
        in.close();
    }

    public static boolean contains(String language) {
        for (Language lang : Language.values()) {
            if (lang.name().equals(language)) {
                return true;
            }
        }
        return false;
    }
}
