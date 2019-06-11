#include<stdio.h>
int main()
{
  //Type your code here
  float a = 3.14, b = 7, c;
  scanf("%f%f", &a, &b);
  c = 2 * a * b;
  printf("The circumference is %.2f", c);
  printf(" cm.");
  return 0;
}