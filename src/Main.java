public class Main {

    public static void main(String[] args) {
	    // Problem 1
        System.out.println("Problem #1:");
        int[] problem1 = {11,12,13,14,15,16,17,18,19,20};
        for (int i=0; i<problem1.length; i++) {
            if (i % 2 == 0) {
                problem1[i] = 0;
            }
        }
        for (int i=0; i< problem1.length; i++) {
            System.out.print(problem1[i] + " ");
        }

        // Problem 2
        System.out.println("\n\nProblem #2:");
        String[] problem2 = {"first", "second", "third", "fourth", "fifth", "sixth"};

        String temp2 = problem2[problem2.length-1];
        for(int i = problem2.length-1; i > 0; i--) {
            problem2[i] = problem2[i-1];
        }
        problem2[0] = temp2;

        for (int i=0; i< problem2.length; i++) {
            System.out.print(problem2[i] + " ");
        }

        // Problem 3
        System.out.println("\n\nProblem #3:");
        int[] problem3 = {11,-12,-13,14,-15,16,17,-18,19,-20};
        int prob3sum = 0;
        for (int i=0; i<problem3.length; i++) {
            if (problem3[i] < 0) {
                prob3sum += problem3[i];
            }
        }
        for (int i=0; i< problem3.length; i++) {
            System.out.print(problem3[i] + " ");
        }
        System.out.println("\nSum: "+ prob3sum);

        // Problem 4
        System.out.println("\nProblem #4:");
        int temp = 0;
        int[] problem4 = {34,-56,78,2,-5,-89,54,23};

        for (int i = 0; i < problem4.length; i++) {
            for (int j = i + 1; j < problem4.length; j++) {
                if (problem4[i] > problem4[j]) {
                    temp = problem4[i];
                    problem4[i] = problem4[j];
                    problem4[j] = temp;
                }
            }
        }

        for (int i=0; i< problem4.length; i++) {
            System.out.print(problem4[i] + ", ");
        }

    }
}
