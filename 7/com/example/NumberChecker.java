package com.example;

// Enum to define NumberChecker
public enum NumberChecker {
    INSTANCE;

    // Method to check if a number is even or odd
    public String checkEvenOdd(int number) {
        return (number % 2 == 0) ? "Even" : "Odd";
    }
}
