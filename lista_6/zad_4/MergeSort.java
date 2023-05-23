import java.util.Arrays;

class IndexOutOfRangeException extends Exception
{
    public IndexOutOfRangeException()
    {
        super();
    }
}

public class MergeSort<T extends Comparable<T>> extends Thread
{
    T[] array;
    public MergeSort(T[] array)
    {
        this.array= array;
    }

    public T e(int index) throws IndexOutOfRangeException
    {
        if(index>=array.length)
            throw new IndexOutOfRangeException();
        return array[index];
    }

    public void Merge(T[] a1, T[] a2)
    {
        int i=0, j=0, k=0;
        while(i<a1.length && j<a2.length)
        {
            if(a1[i].compareTo(a2[j])==-1)
            {
                array[k]=a1[i];
                i++;
            }
            else
            {
                array[k]=a2[j];
                j++;
            }
            k++;
        }
        while(i<a1.length)
        {
            array[k]=a1[i];
            i++;
            k++;
        }
        while(j<a2.length)
        {
            array[k]=a2[j];
            j++;
            k++;
        }
    }

    public void run()
    {
        mergeSort();
    }

    public void mergeSort()
    {
        if(array.length<=1)
            return;
        int l=array.length;
        T[] part1 = Arrays.copyOfRange(array, 0,l/2);
        T[] part2 = Arrays.copyOfRange(array, l/2,l);
        for(int i=0;i<part1.length;i++)
            part1[i]=array[i];
        for(int i=0;i<part2.length;i++)
            part2[i]=array[i+part1.length];
        MergeSort<T> m1=new MergeSort<>(part1);
        MergeSort<T> m2=new MergeSort<>(part2);
        m1.start();
        m2.start();
        while(m1.isAlive() || m2.isAlive()){};
        Merge(m1.array, m2.array);
    }
}
