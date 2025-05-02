#include <stdio.h>
#include <math.h>
#include <stdlib.h>

int main() {
    int n, i;
    float *arr,sum = 0, mean, variance = 0, std_dev;
    printf("Enter the number of elements: ");
    scanf("%d", &n);

    arr = (float *)calloc(n,sizeof(float));

    printf("Enter %d elements:\n", n);
    for(i = 0; i < n; i++) {
        scanf("%f", &arr[i]);
        sum += arr[i];
    }

    mean = sum / n;

    for(i = 0; i < n; i++) {
        variance += pow(arr[i] - mean, 2);
    }

    variance /= n;
    std_dev = sqrt(variance);

    printf("Standard Deviation = %.2f\n", std_dev);
    return 0;
}

