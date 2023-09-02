package Java;

import java.util.Scanner;
class MathT
{
    public static void main(String[] args)
    {
        System.out.println("\f");
        System.out.println("WELCOME TO MATHEMATICA!!");
        
        System.out.println();
        Scanner scr= new Scanner(System.in);
        int a; 
        do
          { 
            System.out.println("Please choose a game:");
            System.out.println("Enter 1 for: Guess the Number Game... ");
            System.out.println("Enter 2 for: Magic Sqaures...");
            a=scr.nextInt();
            if(a>=3 ||a<=0)
            {
                System.out.println();
                System.out.println("Oops! You have entered an invalid number.");
            }
            else break;
          }while(a!=1 || a!=2);
          
            int num=0;
            switch(a)
            {
                case 1: System.out.println("\f");
                        System.out.println();
                        System.out.println("You have chosen the Guess the Number Trick!");
                        System.out.println();
                        System.out.println("*RULES*: Choose a number from 1-31. I will try and guess the"); 
                        System.out.println("         number you have chosen.You will be given a set of");
                        System.out.println("         5 cards. If your number is present,enter Y or else enter N.");
                        System.out.println();
                        System.out.println("Enter Y to continue.");
                        System.out.println("Enter E to exit.");
                        String s1= scr.next();
                if(s1.equalsIgnoreCase("y") || s1.equalsIgnoreCase("yes"))
                    {
                    System.out.println();
                    System.out.println("Card 1:");
                    System.out.println("1  3  5  7  9");
                    System.out.println("11 13 15 17 19");
                    System.out.println("21 23 25 27 29 31");
                    System.out.println("Enter Y or N.");
                    String c1 = scr.next();
                    if(c1.equalsIgnoreCase("Y") || c1.equalsIgnoreCase("yes"))
                    {
                        num+=1;
                    }
                    else if(c1.equalsIgnoreCase("n"))
                    {
                        num=num;
                    }
                    else
                    {
                        System.out.println("Oh no...you did not follow the rules.");
                        break;
                    }
                    System.out.println();
                    System.out.println("Card 2:");
                    System.out.println("2  3  6  7  10");
                    System.out.println("11 14 15 18 19");
                    System.out.println("22 23 26 27 30 31");
                    System.out.println("Enter Y or N.");
                    String c2 = scr.next();
                    if(c2.equalsIgnoreCase("Y") || c2.equalsIgnoreCase("yes"))
                    {
                        num+=2;
                    }
                    else if(c2.equalsIgnoreCase("n"))
                    {
                        num=num;
                    }
                    else
                    {
                        System.out.println("Oh no...you did not follow the rules.");
                        break;
                    }
                    System.out.println();
                    System.out.println("Card 3:");
                    System.out.println("4  5  6  7  12");
                    System.out.println("13 14 15 20 21");
                    System.out.println("22 23 28 29 30 31");
                    System.out.println("Enter Y or N.");
                    String c3 = scr.next();
                    if(c3.equalsIgnoreCase("Y") || c3.equalsIgnoreCase("yes"))
                    {
                        num+=4;
                    }
                    else if(c3.equalsIgnoreCase("n"))
                    {
                        num=num;
                    }
                    else
                    {
                        System.out.println("Oh no...you did not follow the rules.");
                        break;
                    }
                    
                    System.out.println();
                    System.out.println("Card 4:");
                    System.out.println("8  9  10 11 12");
                    System.out.println("13 14 15 24 25");
                    System.out.println("26 27 28 29 30 31");
                    System.out.println("Enter Y or N.");
                    String c4 = scr.next();
                    if(c4.equalsIgnoreCase("Y") || c4.equalsIgnoreCase("yes"))
                    {
                        num+=8;
                    }
                    else if(c4.equalsIgnoreCase("n"))
                    {
                        num=num;
                    }
                    else
                    {
                        System.out.println("Oh no...you did not follow the rules.");
                        break;
                    }
                    
                    System.out.println();
                    System.out.println("Card 5:");
                    System.out.println("16 17 18 19 20");
                    System.out.println("21 22 23 24 25");
                    System.out.println("26 27 28 29 30 31");
                    System.out.println("Enter Y or N.");
                    String c5 = scr.next();
                    if(c5.equalsIgnoreCase("Y") || c5.equalsIgnoreCase("yes"))
                    {
                        num+=16;
                    }
                    else if(c5.equalsIgnoreCase("n"))
                    {
                        num=num;
                    }
                    else
                    {
                        System.out.println("Oh no...you did not follow the rules.");
                        break;
                    }
                    System.out.println();
                    if(num==0 || num>31)
                    {
                        System.out.println("You have chosen a number out of the range 1-31.");
                        break;
                    }
                    
                    else
                    {
                        System.out.println("The number you have chosen is..."+num+".");
                        System.out.println("Hope you had fun!!");
                    }
                }
                else
                {
                    System.out.println();
                    System.out.println("Thank You.");
                    System.out.println("Exited..."); 
                }
                    break;
                    
                case 2: 
                            int a2;        
                            do
                            {
                                System.out.println("You have chosen the Magic Square!");
                                System.out.println();
                                System.out.println("Enter 1 for: Magic Sqaure Sum...");
                                System.out.println("Enter 2 for: Birthday Magic Square...");
                                a2=scr.nextInt();
                                if(a2>=3 || a2<=0)
                                {
                                    System.out.println();
                                    System.out.println("Oops! You have entered an invalid number.");
                                }
                                else break;
                            }while(a2!=1 || a2!=2);
                            switch(a2)
                            {
                                
                                case 1: System.out.println("\f");
                                        System.out.println("You have chosen Magic Sqaure Sum.");
                                        
                                        int T;
                                        do
                                        {
                                            System.out.println("Enter a number from 22-99");
                                            T=scr.nextInt();
                                            if(T>=0 && T<22 || T>99)
                                            {
                                                System.out.println();
                                                System.out.println("Oops! You have entered an invalid number.");
                                            }
                                            else 
                                            
                                                break;
                                        }while(T>=0 && T<22 || T>99);
                               
                                          System.out.println();
                                          System.out.println("*THE MAGIC*: Using your number, i will make a grid,");
                                          System.out.println("             where all the rows, columns and diagonals");
                                          System.out.println("             will add up to the number you have chosen.");
                                          System.out.println();
                                          System.out.println("Enter Y to continue.");
                                          System.out.println("Enter E to exit.");
                                          String s2=scr.next();
                                  if(s2.equalsIgnoreCase("y"))
                                  {
                                    
                                    int n1[]={8,11,T-20,1,T-21,2,7,12,3,T-18,9,6,10,5,4,T-19};
                                    
                                    int i=0;
                                    while(i<n1.length)
                                    {
                                        System.out.print(n1[i]+"   ");
                                        if(i==3||i==7||i==11||i==15)
                                        {
                                            System.out.println();
                                        }
                                        i++;
                                    }
                                    
                                  }
                                  else
                                  {
                                      System.out.println();
                                      System.out.println("Thank you.");
                                      System.out.println("Exited...");
                                    }
                                
                                break;
                                case 2: System.out.println("\f");
                                        System.out.println();
                                        System.out.println("You have chosen Birthday Magic Square.");
                                        System.out.println("Please enter your birth date.");
                                        int bd=scr.nextInt();//a
                                if(bd>=1 && bd<=31)
                                   {
                                        System.out.println("Please enter you birth month.");
                                        int bm=scr.nextInt();//b
                                   if(bm>=1 && bm<=12)
                                        {
                                        System.out.println("Please enter the last two digits of your birth year.");
                                        int by=scr.nextInt();
                                      if(by>=00 && by<=99)
                                        {
                                        int by1=by/10;//c
                                        int by2=by%10;//d
                                        int sum= bd+bm+by1+by2;
                                        System.out.println();
                                        System.out.println("*THE MAGIC*: Using your birth date, I will make a grid");
                                        System.out.println("             where all the rows, columns and diagonals");
                                        System.out.println("             add up to "+sum+".");
                                        System.out.println();
                                        System.out.println("Enter Y to continue.");
                                        System.out.println("Enter E to exit.");
                                        String s3=scr.next();
                                        int A=bd, B=bm, C=by1, D=by2;
                                        if(s3.equalsIgnoreCase("y"))
                                        {
                                            int n2[]= {bd,bm,by1,by2};
                                            int n3[]= {C+3,D-3,A+3,B-3};
                                            int n4[]= {D-2,C-2,B+2,A+2};
                                            int n5[]= {B-1,A+5,D-5,C+1};
                                            System.out.println();
                                            System.out.println("The first row of numbers is your birth date.");
                                            System.out.println();
                                            for(int i=0; i<n2.length; i++)
                                            {
                                                System.out.print(n2[i]+"   ");
                                            }
                                            System.out.println();
                                            for(int i=0; i<n2.length; i++)
                                            {
                                                System.out.print(n3[i]+"   ");
                                            }
                                            System.out.println();
                                            for(int i=0; i<n2.length; i++)
                                            {
                                                System.out.print(n4[i]+"   ");
                                            }
                                            System.out.println();
                                            for(int i=0; i<n2.length; i++)
                                            {
                                                System.out.print(n5[i]+"   ");
                                            }
                                            System.out.println();
                                            
                                            
                                        }
                                        else
                                        {
                                            System.out.println();
                                            System.out.println("Thank you.");
                                            System.out.println("Exited...");
                                            break;
                                        }
                                    }
                                    else
                                    {
                                        System.out.println("Oops! You have entered an invalid number.");
                                    }
                                }
                                else
                                {
                                    System.out.println("Oops! You have entered an invalid number.");
                                }
                            }
                            else
                            {
                                System.out.println("Oops! You have entered an invalid number.");
                            }
                            break;
                            default: System.out.println("Oops! You have entered an invalid number.");
                            }
            }
    }
}
// IN TERMINAL
// to compile: javac math.java
// to run: java math.java           
                         
                             
        
