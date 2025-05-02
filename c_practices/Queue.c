#include <stdio.h>
#include <stdlib.h>

int i, num, size, front = -1, rear = -1;
int *Q;

void enqueue() {
    if (rear == size - 1) {
        printf("Queue Overflow...\nCannot Enqueue Any More Data...\n");
        return;
    }

    printf("Enter Number to Enqueue: ");
    scanf("%d", &num);

    if (front == -1)
        front = 0;
    
    rear++;
    Q[rear] = num;
    printf("%d - Successfully Enqueued...\n", num);
}

void dequeue() {
    if (front == -1 || front > rear) {
        printf("Queue Underflow...\nCannot Dequeue Any Data...\n");
        return;
    }

    num = Q[front];
    front++;
    printf("%d - Successfully Dequeued...\n", num);
}

void display() {
    if (front == -1 || front > rear) {
        printf("Queue is Empty...\n");
        return;
    }

    printf("Queue Elements: ");
    for (i = front; i <= rear; i++) {
        printf("|%d ", Q[i]);
    }
    printf("\n");
}

int main() {
    printf("Enter Queue Size: ");
    scanf("%d", &size);

    Q = (int *)calloc(size, sizeof(int));

    do {
        printf("\nChoose: | 1.Enqueue | 2.Dequeue | 3.Display | 4.Exit : ");
        scanf("%d", &num);

        if (num == 1) enqueue();
        else if (num == 2) dequeue();
        else if (num == 3) display();
        else if (num == 4) break;
        else printf("Invalid choice\n");

    } while (num != 4);

    free(Q);
    return 0;
}

