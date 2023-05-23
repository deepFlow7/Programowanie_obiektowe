import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;

public class Program 
{
    static void edit(String file, String class_name) throws Exception
    {
        Person p;
        PersonSwing ps;

        try
        {
            FileInputStream fileInputStream = new FileInputStream(file);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            if(class_name.equals("Person"))
                p = (Person) objectInputStream.readObject();
            else
                if(class_name.equals("Student"))
                    p =  (Student)objectInputStream.readObject();
                else
                    p = (Employee) objectInputStream.readObject();
            objectInputStream.close();
            fileInputStream.close();
        }
        catch(FileNotFoundException e)
        {
            if(class_name.equals("Person"))
                p=new Person();
            else
                if(class_name.equals("Student"))
                    p = new Student();
                else
                    p = new Employee();
        }

        if(class_name.equals("Person"))
                ps=new PersonSwing(p,file);
            else
                if(class_name.equals("Student"))
                    ps = new StudentSwing((Student)p,file);
                else
                    ps = new EmployeeSwing((Employee)p,file);
        ps.Edit();
    }

    public static void main(String[] args) throws Exception 
    {
        if(args.length==2)
            edit(args[0],args[1]);
    }
}
