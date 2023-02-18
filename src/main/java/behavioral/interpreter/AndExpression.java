package main.java.behavioral.interpreter;

public class AndExpression implements AbstractExpression{
    private AbstractExpression terminalExpression1;
    private AbstractExpression terminalExpression2;

    public AndExpression(AbstractExpression terminalExpression1, AbstractExpression terminalExpression2) {
        this.terminalExpression1 = terminalExpression1;
        this.terminalExpression2 = terminalExpression2;
    }

    @Override
    public boolean interpret(String context) {
        return terminalExpression1.interpret(context) && terminalExpression2.interpret(context);
    }
}
