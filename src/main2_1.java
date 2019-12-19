import java.util.*;

public class main2_1 {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in).useDelimiter(",");

        ArrayList<Integer> opcodeNew = new ArrayList<Integer>();
        try {
            while (s1.hasNext()) {
                //System.out.println(s1.nextInt());
                opcodeNew.add(s1.nextInt());
            }
        } catch (Exception e) {}

        System.out.println(opcodeNew);

        int output = 0;

        for(int j = 0; j < 100; j++) {
            for(int k = 0; k < 100; k++) {
                ArrayList<Integer> opcode = (ArrayList<Integer>) opcodeNew.clone();
                System.out.println("1: " + j + "\t2: " + k);
                opcode.set(1, j);
                opcode.set(2, k);

                for(int i = 0; i < opcode.size(); i+=4) {
                    if(opcode.get(i) == 1) {
                        System.out.println("Add");
                        int index = opcode.get(i+3);
                        //System.out.println("Setting pos " + index + " to " + opcode.get(i+1) + " + " + opcode.get(i+2) + " = " + (opcode.get(i+1) + opcode.get(i+2)));
                        opcode.set(index, opcode.get(opcode.get(i+1)) + opcode.get(opcode.get(i+2)));
                    } else if (opcode.get(i) == 2) {
                        System.out.println("Mult");
                        int index = opcode.get(i+3);
                        //System.out.println("Setting pos " + index + " to " + opcode.get(i+1) + " * " + opcode.get(i+2) + " = " + opcode.get(i+1) * opcode.get(i+2));
                        opcode.set(index, opcode.get(opcode.get(i+1)) * opcode.get(opcode.get(i+2)));
                    } else if (opcode.get(i) == 99) {
                        System.out.println("Break");
                        break;
                    } else {
                        System.out.println("ERROR");
                    }
                }

                output = opcode.get(0);

                if(output == 19690720)
                    break;
            }
            if(output == 19690720)
                break;
        }


        System.out.println(output);
    }
}
