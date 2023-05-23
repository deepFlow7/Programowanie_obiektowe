import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class PersonSwing extends JComponent 
{
    Person p;
    JFrame frame;
    Container container;
    JTextField name, surname, sex, age;
    String file;

    public PersonSwing(Person p, String file)
    {
        this.p=p;
        frame = new JFrame("Person");
        container = frame.getContentPane();
        GridLayout layout = new GridLayout(5, 2);
        container.setLayout(layout);
        this.file=file;
    }

    void Info()
    {
        JLabel name_label = new JLabel("Name");
        container.add(name_label);
        name = new JTextField(p.name, 40);
        container.add(name);

        JLabel surname_label = new JLabel("Surname");
        container.add(surname_label);
        surname = new JTextField(p.surname, 40);
        container.add(surname);

        JLabel sex_label = new JLabel("Sex");
        container.add(sex_label);
        sex = new JTextField(p.sex, 40);
        container.add(sex);

        JLabel age_label = new JLabel("Age");
        container.add(age_label);
        age = new JTextField(p.age.toString(), 40);
        container.add(age);
    }

    void update()
    {
        p.name=name.getText();
        p.surname=surname.getText();
        String s=sex.getText();
        if(!s.equals("Male") && !s.equals("Female"))
            System.out.println("Incorrect sex. Change won't be saved.");
        else
            p.sex=sex.getText();
        if(Integer.parseInt(age.getText())<0)
            System.out.println("Incorrect age. Change won't be saved.");
        else
            p.age=Integer.parseInt(age.getText());

        System.out.println(p.toString());
    }

    void write(ObjectOutputStream objectOutputStream) throws Exception
    {
        objectOutputStream.writeObject(p);
    }

    public void save(String file) 
    {
        try
        {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            write(objectOutputStream);
            objectOutputStream.close();
            fileOutputStream.close();
        }
        catch(Exception e){}
    }

    public void Edit() 
    {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Info();
       
        JButton b = new JButton("Save");
        b.addActionListener
        (
            new ActionListener() 
            {
                public void actionPerformed(ActionEvent evt) 
                {
                    update();
                    save(file);
                }
            }
        );
        container.add(b);
        frame.pack();
        frame.setVisible(true);
    }
}
