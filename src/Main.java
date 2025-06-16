class CPU {
    public int register = 0;
    public int[] memory = { 5, 10, 0};

    private static final int LOAD = 1;
    private static final int SAVE = 2;
    private static final int ADD  = 3;
    private static final int SUB  = 4;
    private static final int HALT = 5;

    private int[][] program ={
            { LOAD, 0 }, // register = memory[0]
            { ADD,  1 }, // register += memory[1]
            { SAVE, 2 }, // memory[2] = register
            { HALT, 0 }
    };

    public void executeProgram() {
        int pc = 0;

        while(true) {
           int opcode  = program[pc][0];  //명령어
           int operand = program[pc][1];

           switch (opcode) {
               case LOAD:
                   register = memory[operand];
                   System.out.println("MOV: Loading Memory[" + opcode + " (" + memory[0] + ") into register.]");
                   break;
               case SAVE:
                   register = memory[operand];
                   System.out.println("MOV: Loading Memory[" + opcode + " (" + memory[0] + ") into register.]");
                   break;
               case ADD:
                   register = memory[operand];
                   System.out.println("ADD: Adding memory[" + operand + "] (" + memory[operand] + ") to register. New register value: " + register);
                   break;
               case SUB:
                   register = memory[operand];
                   System.out.println("SUB: Subtracting memory[" + operand + "] (" + memory[operand] + ") from register. New register value: " + register);
                   break;
               case HALT:
                   System.out.println("HALT : Stopping program executeion.");
                   return;
               default:
                   System.out.println("Unknown instruction. Halting.");
                   return;
           }

           pc++;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        CPU cpu = new CPU();

        cpu.executeProgram();
        System.out.println("Final memory state : memory[2] = " + cpu.memory[2]);
    }
}