package main.java.behavioral.interpreter;

public class Main {
    public static void main(String[] args) {
        AbstractExpression isCat = getCat();
        AbstractExpression isCatLop_eared = isCatLop_eared();

        System.out.println("Abyssinian is cat " + isCat.interpret("Abyssinian cat"));

        System.out.println("Highland fold is cat " + isCatLop_eared.interpret("Highland fold"));
    }


    private static AbstractExpression getCat(){
        AbstractExpression expression1 = new TerminalExpression("Abyssinian");
        AbstractExpression expression2 = new TerminalExpression("American shorthair");

        return new OrExpression(expression1,expression2);
    }

    private static AbstractExpression isCatLop_eared(){
        AbstractExpression expression1 = new TerminalExpression("Scottish");
        AbstractExpression expression2 = new TerminalExpression("Highland");

        return new AndExpression(expression1,expression2);
    }
}
