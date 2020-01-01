public class GTStudent implements Comparable<GTStudent> {

    private String name;
    private double gpa;

    public GTStudent(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    public int compareTo(GTStudent other) {
        if (this.gpa > other.gpa) {
            return 1;
        } else if (this.gpa < other.gpa) {
            return -1;
        }

        return 0;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return name + ": " + gpa;
    }

}
