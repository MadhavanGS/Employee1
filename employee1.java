import java.util.Scanner;
class Detail
{
	String name,designation;
	int id,salary;
	Scanner in=new Scanner(System.in);
	void input()
	{
		System.out.print("enter id name salary designation in this order");
		id=in.nextInt();
		name=in.next();
		salary=in.nextInt();
		designation=in.next();
	}
	void display()
	{
	System.out.println(id+"\t"+name+"\t"+salary+"\t"+designation);
	}
	
}
class employee1
{
static int ins=0;
public static void main(String[] args)
{ 
	int size,i,count=0,ch,ins=0;
	Scanner in=new Scanner(System.in);
	//System.out.println("Enter the count of employee");
	//size=in.nextInt();
	Detail dt[]=new Detail[100];
	

while(count!=1)
{
	
	System.out.print(" 1-Insert detail\n 2-Sorting\n 3-Maximum and minimum salary\n 4-specific amount details\n 5-Display\n 6-Stop");
	ch=in.nextInt();
switch(ch)
{
case 1:
	dt[ins]=new Detail();
	dt[ins].input();
	ins++;
break;
case 2:
	//SALARAY SORTING
	int c=0;
	while(c<ins-1)
	{
		if(dt[c].salary>dt[c+1].salary)
		{
		Detail d=dt[c];
		dt[c]=dt[c+1];
		dt[c+1]=d;
		c=0;
		}
		else
		{
		c++;
		}
	}
	System.out.print("\n");
	for(i=0;i<ins;i++)
	dt[i].display();
break;
case 2:
	//FINDING HIGHEST SALARY AND LOWEST SALARY
	int max=0,min=99999;
	for(i=0;i<ins;i++)
	{
		if(max<dt[i].salary)
			max=dt[i].salary;
		if(min>dt[i].salary)
			min=dt[i].salary;
	}
	System.out.print("\n");
	//DISPLAYING MAXIMUM SALARY DETAILS AND MINIMUM SALARY DETAILS
	for(i=0;i<ins;i++)
	{
		if(max==dt[i].salary)
		{
		dt[i].display();
		}
	}	
	for(i=0;i<ins;i++)
	{
		if(min==dt[i].salary)
		{
		dt[i].display();
		}
	}
break;
case 3:
	System.out.print("\n");
	//PRINTING EMPLOYEE DETAIL IF AMOUNT IS  SALARY IS GREATER THAN OR EQUAL TO SPECIFIED AMOUNT
	int amount;
	amount=in.nextInt();
	for(i=0;i<ins;i++)
	{
	if(dt[i].salary>=amount)
	{
		dt[i].display();
	}
	}
break;
case 4:
System.out.println(ins);
System.out.println("Id\tName\tSalary\tDesignation");
	for(i=0;i<ins;i++)
	{
	dt[i].display();
	}
break;
case 5:
	count=1;
break;
	}
}
	
}
}
