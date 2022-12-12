package task_2;

public class Worker {
    private String fullName;
    private String position;
    private String hireYear;

    Worker(String fullName, String position, String hireYear) {
        this.fullName = fullName;
        this.position = position;
        this.hireYear = hireYear;
    }

    public String getFullName() {
        return fullName;
    }

    public String getPosition() {
        return position;
    }

    public String getHireYear() {
        return hireYear;
    }

    @Override
    public String toString() {
        return " {full name: " + this.fullName + ", position: " + this.position + ", hire year: " + this.hireYear + "} ";
    }
}
