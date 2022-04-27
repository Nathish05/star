public class Fibonaccinumbers{
public static void main(String[] args){
int elementposition=1,count=10,
firstFibonacciNum=0,NextFibonacciNum=1;
System.out.print(firstFibonacciNum+" "+NextFibonacciNum);
for(elementposition=2;elementposition<count;++elementposition)
{
int sumofPrev2=firstFibonacciNum+NextFibonacciNum;
firstFibonacciNum=NextFibonacciNum;
System.out.print(" "+sumofPrev2);
NextFibonacciNum=sumofPrev2;
elementposition++;
}
}
}



















































































