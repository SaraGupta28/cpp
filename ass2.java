import java.util.*;

import javax.lang.model.util.ElementScanner14;

class student{
    String rollnum;
    String name;
    String com1;
    String com2;
    String op1;
    String op2;
    String op3;
    double markcom1;
    double markcom2;
    double markop1;
    double markop2;
    double markop3;
    double com1pra;
    double pract1,pract2,pract3;
    double percent;

}

class list extends student{
    
    public static student insertele(int ind,student arr[])
    {
        String phy="PHYSICS";
        String chem="CHEMISTRY";
        String bio="BIOLOGY";
        Scanner sc=new Scanner(System.in);
        student detail=new student();
        enter:
        {
            System.out.print("Enter roll number of student::");
            detail.rollnum=sc.next();
            detail.rollnum=detail.rollnum.toUpperCase();
            for(int i=0;i<ind;i++)
            {
                if(detail.rollnum.equals(arr[i].rollnum))
                {
                    System.out.println("Roll number already present please re-enter ");
                    break enter;
                }
            }
        }
        detail.pract1=0;
        detail.pract2=0;
        detail.pract3=0;
        System.out.print("Enter First optional subject (Physics, Chemistry, Math or Biology)::");
        detail.op1=sc.next();
        System.out.println();
            detail.op1=detail.op1.toUpperCase();
            optional2:
            {
                System.out.print("Enter second optional subject (Physics, Chemistry, Math or Biology)::");
                detail.op2=sc.next();
                System.out.println();
                detail.op2=detail.op2.toUpperCase();
                // if(detail.op2==detail.op1)
                // {
                //     System.out.println(detail.op2+" is entered before !");
                //     break optional2;
                // }
            }
            optional3:
            {
                System.out.print("Enter third optional subject (Physics, Chemistry, Math or Biology)::");
                detail.op3=sc.next();
                System.out.println();
                detail.op3=detail.op3.toUpperCase();
                // if(detail.op3==detail.op1||detail.op3==detail.op2)
                // {
                //     System.out.println(detail.op3+" is entered before !");
                //     break optional3;
                // }
            
            }
            System.out.print("Enter First compulsory subject (Physical Education or Computer)::");
            detail.com1=sc.next();
            System.out.println();
            detail.com1=detail.com1.toUpperCase();
            System.out.println("Second compulsory subject is English");
            detail.com2="ENGLISH";
            System.out.println();
            
            if(detail.op1.equals("PHYSICS")||detail.op1.equals(chem)||detail.op1.equals(bio))
            {
                opti1:
                {
                System.out.print("Enter marks of "+detail.op1+"::");
                detail.markop1=sc.nextDouble();
                System.out.println();
                // if(detail.markop1<0||detail.markop1>70)
                //     {
                //         System.out.println("Marks are in out of range please re-enter");
                //         break opti1;
                //     }
                }
                prac1:
                {
                    System.out.print("Enter marks of "+detail.op1+" practical::");
                    detail.pract1=sc.nextDouble();
                    // if(detail.pract1<0||detail.pract1>30)
                    // {
                    //     System.out.println("Marks are in out of range please re-enter");
                    //         break prac1;
                    // }
                }

            }
            else
            {
                opti1:
                {
                    System.out.print("Enter marks of "+detail.op1+"::");
                    detail.markop1=sc.nextDouble();
                    System.out.println();
                //    if(detail.markop1<0||detail.markop1>100)
                //         {
                //             System.out.println("Marks out of range!");
                //             break opti1;
                //         }
                }
                System.out.print("Enter marks of "+detail.op1+" practical::");
                detail.pract2=sc.nextDouble();

            }
            if(detail.op2.equals("PHYSICS")||detail.op2.equals("CHEMISTRY")||detail.op2.equals("BIOLOGY"))
            {
                option2:
                {
                    System.out.print("Enter marks of "+detail.op2+"::");
                    detail.markop2=sc.nextDouble();
                    System.out.println();
                    // if(detail.markop2<0||detail.markop2>70)
                    // {
                    //     System.out.println("Marks are in out of range please re-enter");
                    //     break option2;
                    // }
                }
                prac2:
                {
                    System.out.print("Enter marks of "+detail.op2+" practical::");
                    detail.pract2=sc.nextDouble();
                    // if(detail.pract2<0||detail.pract2>30)
                    // {
                    //     System.out.println("Marks are in out of range please re-enter");
                    //         break prac2;
                    // }
                }
            }
            else
            {
                opti1:
                {
                System.out.print("Enter marks of "+detail.op2+"::");
                    detail.markop2=sc.nextDouble();
                    System.out.println();
                    // if(detail.markop2<0||detail.markop2>100)
                    //     {
                    //         System.out.println("Marks are in out of range please re-enter");
                    //         break opti1;
                    //     }
                }
            }
            
            if(detail.op3.equals("PHYSICS")||detail.op3.equals("CHEMISTRY")||detail.op3.equals("BIOLOGY"))
            {
                    option3:
                    {
                        System.out.print("Enter marks of "+detail.op3+"::");
                        detail.markop3=sc.nextDouble();
                        System.out.println();
                        // if(detail.markop3<0||detail.markop3>70)
                        //     {
                        //         System.out.println("Out of range please re-enter");
                        //         break option3;
                        //     }
                    }
                    prac3:
                    {
                        System.out.print("Enter marks of "+detail.op3+" practical::");
                        detail.pract3=sc.nextDouble();
                        // if(detail.pract3<0||detail.pract3>30)
                        // {
                        //     System.out.println("Marks are in out of range please re-enter");
                        //         break prac3;
                        // }
                    }
            }
                
            else
            {
                    opti3:
                    {
                        System.out.print("Enter marks of "+detail.op3+"::");
                        detail.markop3=sc.nextDouble();
                        System.out.println();
                        // if(detail.markop3<0||detail.markop3>100)
                        // {
                        //     System.out.println("Marks are in out of range please re-enter");
                        //     break opti3;
                        // }
                    }
            }
            com:
            {
                System.out.print("Enter marks of "+detail.com1+"::");
                detail.markcom1=sc.nextDouble();
                System.out.println();
                // if(detail.markcom1<0||detail.markcom1>60)
                // {
                //     System.out.println("Marks are in out of range please re-enter");
                //                 break com;
                // }
            }
            compr:
            {
                System.out.print("Enter marks of "+detail.com1+" practicle ::");
                detail.com1pra=sc.nextDouble();
                System.out.println();
                // if(detail.com1pra<0||detail.com1pra>40)
                // {
                //     System.out.println("Marks are in out of range please re-enter");
                //                 break compr;
                // }
            }
            eng:
            {
                System.out.println("Enter marks of "+detail.com2+"::");
                detail.markcom2=sc.nextDouble();
                /*if(detail.markcom2<0||detail.markcom2>100)
                {
                    System.out.println("Marks are in out of range please re-enter");
                                break eng;
                }*/
            }
            double sum=detail.com1pra+detail.markcom1+detail.markcom2+detail.markop1+detail.markop2+detail.markop3+detail.pract1+detail.pract2+detail.pract3;
            detail.percent=sum/5;
            
            return detail;
    }

}
class show extends list
{
    public static void disper(int ind,student arr[])
    {
        student dis=new student();
        double ma=-1;
        for(int i=0;i<=ind;i++)
        {
            if(arr[i].percent>ma)
            {
                dis=arr[i];
            }
        }
        System.out.println("ROLL_NO::"+dis.rollnum);
        System.out.println("Percentage::"+dis.percent);
        System.out.println("Marks in "+dis.op1+"::"+dis.markop1+dis.pract1);
        System.out.println("Marks in "+dis.op2+"::"+dis.markop2+dis.pract2);
        System.out.println("Marks in "+dis.op3+"::"+dis.markop3+dis.pract3);
        System.out.println("Marks in "+dis.com1+"::"+dis.markcom1+dis.com1pra);
        System.out.println("Marks in "+dis.com2+"::"+dis.markcom2);
        System.out.print("Grade is::");
        if(dis.percent>=80.00)
        {
            System.out.println("Honours");
        }
        else if(dis.percent>=60)
        {
            System.out.println("First Div");
        }
        else if(dis.percent>=48)
        {
            System.out.println("Second Div");
        }
        else if(dis.percent>=40)
        {
            System.out.println("Third Div");
        }
        else
        {
            System.out.println("Fail");
        }
    }
    public static void disrol(int ind,student arr[])
    {
        student dis=arr[ind];
        double ma=-1;
        for(int i=0;i<=ind;i++)
        {
            System.out.println("ROLL_NO::"+dis.rollnum);
            System.out.println("Percentage::"+dis.percent);
            System.out.println("Marks in "+dis.op1+"::"+dis.markop1+dis.pract1);
            System.out.println("Marks in "+dis.op2+"::"+dis.markop2+dis.pract2);
            System.out.println("Marks in "+dis.op3+"::"+dis.markop3+dis.pract3);
            System.out.println("Marks in "+dis.com1+"::"+dis.markcom1+dis.com1pra);
            System.out.println("Marks in "+dis.com2+"::"+dis.markcom2);
            System.out.print("Grade is::");
            if(dis.percent>=80.00)
            {
                System.out.println("Honours");
            }
            else if(dis.percent>=60)
            {
                System.out.println("First Div");
            }
            else if(dis.percent>=48)
            {
                System.out.println("Second Div");
            }
            else if(dis.percent>=40)
            {
                System.out.println("Third Div");
            }
            else
            {
                System.out.println("Fail");
            }
        }
    }
}
public class ass2 extends student {
    public static void main(String args[])
    {
        student arr[];
        arr=new student[100];
        int ind;
        ind=-1;
        int choice;
        Scanner sc=new Scanner(System.in);
        do
        {
            System.out.println("\n\t\tMENU\n");
            System.out.println("Press 1 to enter student record");
            System.out.println("Press 2 to display details of student with highest percentage");
            System.out.println("Press 3 to display a record of student on the basis of Roll number");
            System.out.println("Press 4 to exit");
            choice=sc.nextInt();
            switch(choice)
            {
                case 1:
                {
                    arr[++ind]=list.insertele(ind,arr);
                    break;
                    
                }
                case 2:
                {
                    show.disper(ind,arr);
                    break;
                }
                case 3:
                {
                    System.out.print("Enter roll number ::");
                    String roll=sc.next();
                    System.out.println();
                    boolean flag=false;
                    for(int i=0;i<=ind;i++)
                    {
                        if(roll.equals(arr[i].rollnum))
                        {

                            show.disrol(i,arr);

                            flag=true;
                            break;
                        }
                    }
                    if(!flag)
                    {
                        System.out.println("No such roll number present in data");
                    }
                    break;
                }
                case 4:
                {
                    System.out.println("Exiting...");
                    break;

                }
                default:
                {
                    System.out.println("Wrong value entered!");
                    
                }
            }
        }while(choice!=4);
    }
}
