#include<stdio.h>
int main()
{
  //Type your code here
  int n, digit;
  scanf("%d", &n);
  digit = (n/10) % 10;
  printf("%d", digit);
  return 0;
}