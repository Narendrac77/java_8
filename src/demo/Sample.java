package src.demo;

public class Sample {
    private  String name;
    private  String schoolName;
    private String className;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public Sample(String name, String schoolName, String className) {
        this.name = name;
        this.schoolName = schoolName;
        this.className = className;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", schoolName='" + schoolName + '\'' +
                ", className='" + className + '\'' +
                '}';
    }
}
