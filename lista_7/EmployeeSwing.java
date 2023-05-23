import javax.swing.*;
import java.awt.*;
import java.io.ObjectOutputStream;

public class EmployeeSwing extends PersonSwing
{
    Employee e;
    JTextField profession, salary, home_office;

    public EmployeeSwing(Employee e, String file)
    {
        super(e, file);
        this.e=e;
        frame = new JFrame("Employee");
        container = frame.getContentPane();
        GridLayout layout = new GridLayout(8, 2);
        container.setLayout(layout);
    }

    void Info()
    {
        super.Info();

        JLabel professiom_label = new JLabel("Profession");
        container.add(professiom_label);
        profession = new JTextField(e.profession, 40);
        container.add(profession);

        JLabel salary_label = new JLabel("Salary per month [euros]");
        container.add(salary_label);
        salary = new JTextField(e.salary.toString(), 40);
        container.add(salary);

        JLabel home_office_label = new JLabel("Home office");
        container.add(home_office_label);
        home_office = new JTextField(e.home_office.toString(), 40);
        container.add(home_office);
    }

    void update()
    {
        super.update();

        e.profession=profession.getText();
        if(Integer.parseInt(salary.getText())<0)
            System.out.println("Incorrect salary. Change won't be saved.");
        else
            e.salary=Integer.parseInt(salary.getText());
        if(!home_office.getText().equals("true") && !home_office.getText().equals("false"))
            System.out.println("Incorrect value of the field 'home office'. Change won't be saved.");
        else
            e.home_office=Boolean.parseBoolean(home_office.getText());
        
        System.out.println(e.toString());
    }

    void write(ObjectOutputStream objectOutputStream) throws Exception
    {
        objectOutputStream.writeObject(e);
    }
}
