import java.util.*;
public class A25
{
        public static void main(String[] args)
        {
                System.out.println("Input a year");
                Scanner sc = new Scanner(System.in);
                int year = sc.nextInt();
                System.out.println("Input a month");
                int mo = sc.nextInt();
                int sum = 0;
                for(int i = 1900; i<year;i++)
                {
                        if(i%4 == 0 && i%100 != 0 || i%400 == 0)
                        {
                                sum+=366;
                        }
                        else
                        {
                                sum+=365;
                        }
                }
                for(int i = 1;i < mo;i++)
                {
                        if(i == 2)
                        {
                                if(year%4 ==0 &&year%100!= 0 || year%400 == 0)
                                {
                                        sum+=29;
                                }
                                else
                                {
                                        sum+=28;
                                }
                        }
                        else if(i ==4 || i == 6|| i == 9 || i ==11)
                        {
                                sum+=30;
                        }
                        else
                        {
                                sum+=31;
                        }
                }
                sum+=1;
                int wekday = sum%7;
                System.out.println("Sun\tMon\tTes\tWed\tThu\tFri\tSat");
                for(int i = 1;i<=wekday; i++)
                {
                        System.out.print("\t");
                }
                int days=0;
                 for(int i = 1;i <= mo;i++)
                {
                        if(i == 2)
                        {
                                if(year%4 ==0 &&year%100!= 0 || year%400 == 0)
                                {
                                        days=29;
                                }
                                else
                                {
                                        days=28;
                                }
                        }
                        else if(i ==4 || i == 6|| i == 9 || i ==11)
                        {
                                days=30;
                        }
                        else
                        {
                                days=31;
                        }
                }
                for(int i = 1;i <= days;i++)
                {
                        if(sum%7 == 6)
                        {
                        System.out.println(i);
                        }
                else
                        {
                        System.out.print(i + "\t");
                        }
                }
                sum++;
        }
}