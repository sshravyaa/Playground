#include<stdio.h>
int main()
{
  //Type your code here
  int a,d;
  scanf("%d", &a);
  d = (a/100) + (a%10);
  printf("%d", d);
  return 0;
}