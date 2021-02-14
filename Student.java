public class Student {
    String name;
    String major;
    int age;
    int yearOfGraduation;
    double GPA;
    int currentSemeseter;

    // Builder Pattern
    public static class Builder {
        // Required Parameters
        String name;
        String major;

        // Optional Parameters -- Initialized with zero
        int age = 0;
        int yearOfGraduation = 0;
        double GPA = 0;
        int currentSemeseter = 0;

        public Builder(String name, String major) {
            this.name = name;
            this.major = major;
        }

        public Builder age(int val) {
            this.age = val;
            return this;
        }

        public Builder yearOfGraduation(int val) {
            this.yearOfGraduation = val;
            return this;
        }

        public Builder GPA(double val) {
            this.GPA = val;
            return this;
        }

        public Builder currentSemester(int val) {
            this.currentSemeseter = val;
            return this;
        }

        public Student build() {
            return (new Student(this));
        }

    }

    private Student(Builder builder) {
        this.name = builder.name;
        this.major = builder.major;
        this.age = builder.age;
        this.yearOfGraduation = builder.yearOfGraduation;
        this.GPA = builder.GPA;
        this.currentSemeseter = builder.currentSemeseter;
    }

    public int semesterIncrement() {
        return this.currentSemeseter++;
    }

    public void displayStudentInfo() {
        System.out.printf(" Name: %s\n Major: %s\n Age: %d\n Year Of Graduation: %d\n GPA: %f\n Current Semester: %d\n",
                this.name, this.major, this.age, this.yearOfGraduation, this.GPA, this.currentSemeseter);
    }
}
