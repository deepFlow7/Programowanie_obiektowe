class IncorrectYearOfStudyException extends Exception
{
    public IncorrectYearOfStudyException()
    {
        super();
    }
}

public class Student extends Person
{
    String subject="";
    Integer year_of_study=1;
    Boolean schoolarship=false;

    public Student(){}

    public Student(String name, String surname, String sex, Integer age, String subject, Integer year_of_study, Boolean schoolarship) 
        throws IncorrectSexException, IncorrectAgeException, IncorrectYearOfStudyException
    {
        super(name, surname, sex, age);
        if(year_of_study<1)
            throw new IncorrectYearOfStudyException();
        this.subject=subject;
        this.year_of_study=year_of_study;
        this.schoolarship=schoolarship;
    }

    public String toString()
    {
        String res = super.toString();
        res+=", subject : " + subject + ", year of study : " + year_of_study.toString();
        if(schoolarship)
            res+=", schoolarship";
        return res;
    }
};