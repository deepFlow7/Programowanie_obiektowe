public class Program 
{
    public static void main(String[] args) 
    {
        OrderedList<Type> university_base=new OrderedList<>(null);
       
        university_base.add_element(new Master("M. Elizabeth Taylor"));
        university_base.add_element(new Student("Student  Jane Williams"));
        university_base.add_element(new Doctor("Dr. John Smith"));
        university_base.add_element(new Professor("Prof. Jack Johnson"));
        university_base.add_element(new Dean("Dean"));
        
        try
        {
            System.out.println("First : " + university_base.get_first());
        }
        catch (EmptyListException e){};

        System.out.println("List : " + university_base.toString());
    }
}
