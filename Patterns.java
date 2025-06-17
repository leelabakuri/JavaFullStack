/*1
 class Patterns
{
public static void main(String [] args)
{
int rows=6;
for(int i=1;i<=rows;i++)
{
for(int j=1;j<=rows;j++)
{
System.out.print("*");
}
System.out.println();
}
}
}
output:
******
******
******
******
******
*/

/*2
 class Patterns
{
public static void main(String [] args)
{
int rows=5;
for(int i=1;i<=rows;i++)
{
for(int j=1;j<=rows;j++)
{
System.out.print(i  +" ");
}
System.out.println();
}
}
}
output:
1 1 1 1 1
2 2 2 2 2
3 3 3 3 3
4 4 4 4 4
5 5 5 5 5
*/

/*3
 class Patterns
{
public static void main(String [] args)
{
int rows=5;
for(int i=1;i<=rows;i++)
{
for(int j=1;j<=5;j++)
{
System.out.print(j +" ");
}
System.out.println();
}
}
}
output:
1 2 3 4 5
1 2 3 4 5
1 2 3 4 5
1 2 3 4 5
1 2 3 4 5
*/

/*4
 class Patterns
{
public static void main(String [] args)
{
int n=5;
int count=1;
for(int i=1;i<=n;i++)
{
for(int j=1;j<=n;j++)
{
System.out.print(count +" ");
count++;
}
System.out.println();
}
}
}
output:
1   2    3   4  5
6   7    8   9  10
11 12 13 14 15
16 17 18 19 20
21 22 23 24 25
*/

/*5
 class Patterns
{
public static void main(String [] args)
{
int n=1;
for(int i=0;i<5;i++)
{
for(int j=0;j<5;j++)
{
System.out.print(n +"  ");
n++;
if(n>9)
{
n=1;
}
}
System.out.println();
}
} 
}
output:
1  2  3  4  5
6  7  8  9  1
2  3  4  5  6
7  8  9  1  2
3  4  5  6  7
*/

/*6
class Patterns
{
public static void main(String [] args)
{
int n=1;
for(int i=0;i<5;i++)
{
for(int j=0;j<5;j++)
{
System.out.print(n +"  ");
n+=2;
}
System.out.println();
}
} 
}
output:
1  3  5  7  9
11  13  15  17  19
21  23  25  27  29
31  33  35  37  39
41  43  45  47  49
*/

/*7
class Patterns
{
public static void main(String [] args)
{
int n=1;
for(int i=1;i<=5;i++)
{
for(int j=1;j<=5;j++)
{
if(j%2==1)
{
System.out.print("1");
}
else
{
System.out.print("0");
}
}
System.out.println();
}
}
}
output:
10101
10101
10101
10101
10101
*/








