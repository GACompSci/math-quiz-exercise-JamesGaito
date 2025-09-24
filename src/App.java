public class App {
    public static void main(String[] args) throws Exception {
        Reader john = new Reader();
        int correct = 0;
        int a = Methods.randInt(1,10);
        int b = Methods.randInt(1,10);
        int c = john.getInt("What is " + a + "+" + b + ":");
        int d = a + b;
        System.out.println(d);
        if (c==d){
            correct += 1;
            System.out.println("correct");
            System.out.println("number correct:" + correct);
        } else {
            System.out.println("incorrect");
            System.out.println("number correct:" + correct);
        }

        int a2 = Methods.randInt(1,10);
        int b2 = Methods.randInt(1,10);
        int c2 = john.getInt("What is " + a2 + "-" + b2 + ":");
        int d2 = a2 - b2;
        System.out.println(d2);
        if (c2==d2){
            correct += 1;
            System.out.println("correct");
            System.out.println("number correct:" + correct);
        } else {
            System.out.println("incorrect");
            System.out.println("number correct:" + correct);
        }

        int a3 = Methods.randInt(1,10);
        int b3 = Methods.randInt(1,10);
        int c3 = john.getInt("What is " + a3 + "*" + b3 + ":");
        int d3 = a3 * b3;
        System.out.println(d3);
        if (c3==d3){
            correct += 1;
            System.out.println("correct");
            System.out.println("number correct:" + correct);
        } else {
            System.out.println("incorrect");
            System.out.println("number correct:" + correct);
        }

        int a4 = Methods.randInt(1,5);
        double ra4 = (double)a4;
        int b4 = Methods.randInt(1,5);
        double rb4 = (double)b4;
        double c4 = john.getDouble("What is " + ra4 + "/" + rb4 + ":");
        double d4 = ra4 / rb4;
        d4 = Methods.roundDouble(3, d4);
        System.out.println(d4);
        if (c4==d4){
            correct += 1;
            System.out.println("correct");
            System.out.println("number correct:" + correct);
        } else {
            System.out.println("incorrect");
            System.out.println("number correct:" + correct);
        }

        int a5 = Methods.randInt(1,5);
        int b5 = Methods.randInt(1,5);
        int c5 = john.getInt("What is " + a5 + "%" + b5 + ":");
        int d5 = a5 % b5;
        System.out.println(d5);
        if (c5==d5){
            correct += 1;
            System.out.println("correct");
            System.out.println("number correct:" + correct);
        } else {
            System.out.println("incorrect");
            System.out.println("number correct:" + correct);
        }

    }
}
