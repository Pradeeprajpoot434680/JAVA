/*
    It is a mechanism used in concurrent programming to update 
    a variable atomically without using traditional locks like synchronized or ReentrantLock.


    CAS performs three operations:

    Read: Read the current value of a variable.
    Compare: Compare the current value with the expected value.
    Swap: If both values match, update the current value with the new value.


    for every thread
    Current value = 10
    Expected value = 10
    New value = 20

    If current == expected:
        Update current to new value.
    Else:
        Do not update.

        

*/
public class CAS {
    
}
