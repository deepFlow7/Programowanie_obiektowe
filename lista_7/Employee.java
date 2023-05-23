class IncorrectSalaryException extends Exception
{
    public IncorrectSalaryException()
    {
        super();
    }
}

public class Employee extends Person
{
    String profession="";
    Integer salary=0;
    Boolean home_office=false;

    public Employee(){}

    public Employee(String name, String surname, String sex, Integer age, String profession, Integer salary, Boolean home_office) 
        throws IncorrectSexException, IncorrectAgeException, IncorrectSalaryException
    {
        super(name, surname, sex, age);
        if(salary<0)
            throw new IncorrectSalaryException();
        this.profession=profession;
        this.salary=salary;
        this.home_office=home_office;
    }

    public String toString()
    {
       String res = super.toString()+", profession : "+profession+", salary per month : "+salary.toString()+" [euro]";
       if(home_office)
        res+=", home office";
       return res;
    }
}
