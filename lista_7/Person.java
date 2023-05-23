import java.io.Serializable;

public class Person implements Serializable
{
    protected String name="";
    protected String surname="";
    protected String sex="";
    protected Integer age=0; 
 
    public Person(){}

    public Person(String name,String surname, String sex,Integer age) throws IncorrectSexException, IncorrectAgeException
    {
        if(sex!="Male" && sex!="Female")
            throw new IncorrectSexException();
        if(age<0)
            throw new IncorrectAgeException();
        this.name=name;
        this.surname=surname;
        this.sex=sex;
        this.age=age;
    }

    public String toString()
    {
        return name+" "+surname+" ("+sex+"), age : "+age.toString();
    }    
}
