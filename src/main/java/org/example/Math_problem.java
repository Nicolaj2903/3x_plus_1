package org.example;

public class Math_problem {

    private int n;
    private Output output; // Interface

    public Math_problem() {
    }

    public Math_problem(int n) {
        this.n = n;
    }

    public static void main(String[] args) {

        Math_problem math = new Math_problem();

        math.setOutput(new Output() {
            @Override
            public void append(String message) {
                System.out.println(message);
            }
        });

        math.calculate();
    }

    public void setOutput(Output output) {
        this.output = output;
    }

    public void calculate() {
        int i = 0;

        // End result (n) should be 1
        while (n != 1) {
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = n * 3 + 1;
            }
            i++;
        }
        if (output != null) {
            output.append("Iterations: " + i);
        }
    }
}
