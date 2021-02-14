package abstractClasses;

public class EnumClass {
    enum Language {
        PYTHON, JAVA, C, JAVASCRIPT, R, ABAP;
    }

    Language language;

    public EnumClass(Language language) {
        this.language = language;
    }

    public void languageFeature() {
        switch (language) {
            case PYTHON:
            case R:
                System.out.println("It is good for Machine Learning.");
                break;
            case JAVA:
                System.out.println("Java is good for building Enterprise Software.");
                break;
            case C:
                System.out.println("C is really fast.");
                break;
            case ABAP:
                System.out.println("ABAP is used by SAP");
                break;
            case JAVASCRIPT:
                System.out.println("God isn't everywhere, JavaScript is.");
        }
    }
}
