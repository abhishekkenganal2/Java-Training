#include <stdio.h>
void main()
{
    char s1[30], s2[30], ch, temp;
    int i, j = 0, l = 0;
    scanf("%s", &s1);
    while (s1[l] != '\0')
    {
        l++;
    }
    printf("%d\n", l);

//Reverseing a string....
    scanf("%c", &ch);
    i = 0;
    j = l - 1;
    for (i = 0; i < j; i++)
    {
        temp = s1[i];
        s1[i] = s1[j];
        s1[j] = temp;
        j--;
    }
    printf("Reverse:%s\n", s1); 
}