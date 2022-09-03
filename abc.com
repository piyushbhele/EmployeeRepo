terate over every element
    for (int i = 0; i < ar_size; i++) {
 
        // Initialize count to 0
        int count = 0;
 
        for (int j = 0; j < ar_size; j++) {
 
            // Count the frequency
            // of the element
            if (A[i] == A[j]) 
