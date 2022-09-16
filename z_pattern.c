#include<stdio.h>
void pattern(int n)
{
    int i,j,size;
    int top=1,bottom =1,diagnal = n-1;

    for(i=0;i<n;i++)
        printf("%d ",top++);
    printf("\n");

    for(i =1;i<n-1;i++)
    {
        for(j=0;j<2*(n-i-1);j++)
            printf(" ");
        printf("%d",diagnal--);
        printf("\n");
    }

    for(i=0;i<n;i++)
        printf("%d ",bottom++);
    
}
int main()
{
    int n;
    printf("Enter no's:");
    scanf("%d",&n);
    pattern(n);
    return 0;
}

// #include<stdio.h>
// #include<string.h>
// void main()
// {
//     char str[100],temp;
//     int i,left,right,len;
//     printf("enter the string");
//     scanf("%s",&str);
//     len=strlen(str);
//     left=0;
//     right=len-1;
//     for(i=left;i<right;i++)
//     {
//         temp=str[i];
//         str[i]=str[right];
//         str[right]=temp;
//         right--;
//     }
//     printf("%s",str);
//     getch();
// }