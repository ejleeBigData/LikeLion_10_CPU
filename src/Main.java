class CPU {
    public int regist = 0;
    public int[] memory = { 5, 10, 0};

    private static final int MOV = 1;
    private static final int ADD = 2;
    private static final int SUB = 3;
    private static final int HALT = 4;

    private int[][] program ={
            { MOV, 0 }, // register = memory[0]
            { ADD, 1 }, // register += memory[1]
            { MOV, 2 }, // memory[2] = register
            { HALT, 0 }
    };

    public void executeProgram() {
        int pc = 0;

        while(true) {
           int opcode = program[pc][0];

        }
    }
}

public class Main {
    public static void main(String[] args) {


    }
}