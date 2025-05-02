#include <stdio.h>
#include <stdlib.h>

int i,num,size,top=-1,temp;
int *Q;

void push()
{
	if(top == size-1)
	{
		printf("Stack OverFlow...\n Cannot Push Any Data...\n");
		return ; 
	}
	
	printf("Enter Number To Push : ");
	scanf("%d",&num);
	
	if(top == -1)
	{
		top++;
		Q[top] = num;
		printf("%d - Successfully Pushed ...\n",num);
		return ;
	}
	top++;
	Q[top] = num;
	printf("%d - Successfully Pushed ...\n",num);
	return ; 
}

void pop()
{
	if(top<0)
	{
		printf("StackUnderflow...\nCan't Pop Any Data...\n");
		return ;
	}
	
	temp=Q[top];
	top--;
	printf("%d - Successfully Popped...\n",temp);
	return ;
}

void display()
{
	if(top<0)
	{
		printf("Stack Is Empty...\n");
		return ;
	}
	printf("Stack Elements : ");
	for(i=0;i<=top;i++)
	{
		printf("|%d ",Q[i]);
	}
	printf("\n");
	return ;
}

int main()
{
	printf("Enter Stack Size : ");
	scanf("%d",&size);
	
	Q = (int *)calloc(size,sizeof(int));
	
	do{
		printf("\nChoose : | 1.Push  |2.Pop  |3.Display  |4.Exit : ");
		scanf("%d",&num);
		
		if(num == 1) push();
		else if(num == 2) pop();
		else if(num == 3) display();
		else if(num == 4) return ;
		else printf("Invalid choice\n");
	}while(num!=4);
	free(Q);
	return 0;
}


