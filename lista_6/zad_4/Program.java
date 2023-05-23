public class Program 
{
    public static void main(String[] args) throws Exception 
    {
        Integer[] t={7, 1, 8, 9, -13, 0, 18, -99, 2, 4, 5};
        MergeSort<Integer> m=new MergeSort<>(t);
        m.mergeSort();
        for(int i=0;i<t.length;i++)
        {
            if(i!=0)
                System.out.print(", ");
            System.out.print(m.e(i));
        }
        System.out.print("\n");
    }
}
