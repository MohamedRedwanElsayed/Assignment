
package assignment.pkg1.pkg1;
import java.util.Scanner;
public class Assignment11 {
    static int count1 = 0,count2=0;
    static String flatten[]=new String[6];
    static String a[][]={{"Ahmed","Moahmed"},{"Sara","Slem"},{"SDAD","KKKKK"}};
    static char order;
    public static void main(String[] args) {
        //Order Of The Array
        Type(order);
    }
    public static void Type(char order)
    {
        Scanner ss = new Scanner(System.in);
        System.out.println("Enter R To Order By Row\n"
                + "Enter C To Order By Column");
        order=ss.next().charAt(0);
        //Show The 2D array
        Original(a);
        switch(order)
        {
            case 'C':
                flatten_column(a);
                break;
            case 'R':
                flatten_row(a);
                break;
            default:
                    main(null);           
        }
    }
    public static void Original(String a[][])
    {
        System.out.print("The 2D Array Is :\n");
        for(int i=0; i<2; i++)
        {
            for(int j=0; j<2; j++)
            {
                System.out.print(a[i][j]+ "  ");
            }
            System.out.println();
        }
    }
    public static void flatten_row(String a[][])
    {
        for(int i = 0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                flatten[count1++]=a[i][j];
            }
        }
        System.out.println("The 1D arry Is:" );
        for(int i =0;i<4;i++)
        {
            System.out.println(flatten[i]);
        }
    }
    public static void flatten_column(String a[][])
    {
        for(int i = 0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                flatten[count2++]=a[j][i];
            }
        }
        System.out.println("The 1D arry Is:  ");
        for(int i =0;i<4;i++)
        {
            System.out.println(flatten[i]);
        }
    }
}
