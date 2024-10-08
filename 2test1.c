#include <stdio.h>

int is_palindrome(int num) {
    int reversed = 0, original = num, remainder;
    
    while (num != 0) {
        remainder = num % 10;
        reversed = reversed * 10 + remainder;
        num /= 10;
    }
    
    return original == reversed;
}

int main() {
    int num;
    printf("Enter a number: ");
    scanf("%d", &num);
    
    if (is_palindrome(num))
        printf("%d is a palindrome.\n", num);
    else
        printf("%d is not a palindrome.\n", num);
    
    return 0;
}
