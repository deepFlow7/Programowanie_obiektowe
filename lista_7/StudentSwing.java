import javax.swing.*;
import java.awt.*;
import java.io.ObjectOutputStream;

public class StudentSwing extends PersonSwing
{
    Student s;
    JTextField subject, year, schoolarship;

    public StudentSwing(Student s, String file)
    {
        super(s, file);
        this.s=s;
        frame = new JFrame("Student");
        container = frame.getContentPane();
        GridLayout layout = new GridLayout(8, 2);
        container.setLayout(layout);
    }

    void Info()
    {
        super.Info();

        JLabel subject_label = new JLabel("Subject");
        container.add(subject_label);
        subject = new JTextField(s.subject, 40);
        container.add(subject);

        JLabel year_label = new JLabel("Year of study");
        container.add(year_label);
        year = new JTextField(s.year_of_study.toString(), 40);
        container.add(year);

        JLabel schoolarship_label = new JLabel("Schoolarship");
        container.add(schoolarship_label);
        schoolarship = new JTextField(s.schoolarship.toString(), 40);
        container.add(schoolarship);
    }

    void update()
    {
        super.update();

        s.subject=subject.getText();
        if(Integer.parseInt(year.getText())<=0)
            System.out.println("Incorrect year of study. Change won't be saved.");
        else
            s.year_of_study=Integer.parseInt(year.getText());
        if(!schoolarship.getText().equals("true") && !schoolarship.getText().equals("false"))
            System.out.println("Incorrect value of the field 'schoolarship'. Change won't be saved.");
        else
            s.schoolarship=Boolean.parseBoolean(schoolarship.getText());
        
        System.out.println(s.toString());
    }

    void write(ObjectOutputStream objectOutputStream) throws Exception
    {
        objectOutputStream.writeObject(s);
    }
}
