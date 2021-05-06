package AbstractClassesandInterfaces;

abstract class Employee {
    protected String name;// field for the objects
    protected String department;//
    protected int id;//

    public Employee(String name, String department, int id){
        this.name = name;
        this.department = department;
        this.id = id;
    };

    public abstract String work();//Setting up a blank method- fill in the details

}
