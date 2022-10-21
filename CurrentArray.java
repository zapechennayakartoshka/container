public class CurrentArray
{
    private
    int length=0;
    static int capacity=10;
    int[]NewArray;
    //constructor for an empty array
    public CurrentArray()
    {
        NewArray=new int[capacity];
        length=capacity;
    }
    //constructor for an empty array with a given size value
    CurrentArray(int size)
    {
        NewArray=new int[size];
        length=size;
    }
    //constructor for an empty array with a given size value and data
    CurrentArray(int size,int value)
    {
        NewArray=new int[size];
        length=size;
        for (int i=0;i<length;i++)
        {
            NewArray[i]=value;
        }
    }
    public void setValue(int value,int index)
    {
        NewArray[index]=value;
    }
    public int getLength() {return length;}
    //array element output
    public void printArray()
    {
        for (int i=0;i<getLength();i++)
            System.out.println(NewArray[i]);
    }
    //add an element to an array
    public void valueArray(int value,int index)
    {
        int size=getLength()+1;
        int[]EditedArray=new int[size];
        boolean b=false;
        if ((getLength() > 1 && getLength() >= index) || (getLength()==1&&index==0)) {
            for (int i = 0; i < size; i++) {
                if (i == index) {
                    EditedArray[i] = value;
                    b = true;
                } else if (b) {
                    EditedArray[i] = NewArray[i - 1];
                } else {
                    EditedArray[i] = NewArray[i];
                }
            }
            length=size;
            NewArray=EditedArray;
        }
        else  if (index>getLength()) {
            System.arraycopy(NewArray, 0, EditedArray, 0, getLength());
            EditedArray[size]=value;
            length=size;
            NewArray=EditedArray;
        }
    }
    //remove an element from an array
    public void deleteValue(int index)
    {
        int size=getLength()-1;
        int[]EditedArray=new int[size];
        boolean b=false;
        if (getLength()>=1&&getLength()>index)
        {
            for (int i=0;i<size;i++)
            {
                if (i==index||b)
                {
                    EditedArray[i]=NewArray[i+1];
                    b=true;
                } else {
                    EditedArray[i]=NewArray[i];
                }
            }
        } else System.out.println("Ошибка!");
        length=size;
        NewArray=EditedArray;
    }
    //Return an element from an array
    public int getValue(int index)
    {
        int result=-1;
        if (index<0||index>=getLength()) return result;
        for (int i=0;i<getLength();i++)
            if (i==index)
            {
                result=NewArray[i];
                return result;
            }
        return result;
    }

}
