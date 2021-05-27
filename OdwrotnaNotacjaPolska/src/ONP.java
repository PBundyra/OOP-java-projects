import java.util.*;

public class ONP() extends Exception implements Stack {
    private ArrayList<Integer> stack;
    private String ONPExpression;
    private final List<String> corrChars = Arrays.asList("0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "+", "-", "*", "/");
    private final List<String> operators = Arrays.asList("+", "-", "*", "/");

    class DzieleniePrzezZero extends Exception {
    }

    ;

    class ZaMaloOperatorow extends Exception {
    }

    ;

    class incorrChar extends Exception()

    {
        private final Character c;

            public incorrChar(Character c) {
        this.c = c;
    }

            public oddajBlednyZnak() {
        System.out.println("Błąd: niedozwolony znak ('" + c + "') w wyrażeniu!");
    }
    }


    public ONP(String ONPExpression) {
        this.ONPExpression = ONPExpression;
        this.stack = new ArrayList<Integer>();
    }

    public void push(Integer num) {
        stack.add(num);
    }

    public String top() {
        return stack.get(stack.size - 1);
    }

    public void isCorrStack() extends

    Exception {
        try {
            for (Character c : String) {
                if (!corrChars.contains(c)) throw new incorrChar(c);
            }
            catch(incorrChar e){
                e.oddajBlednyZnak();
            }
        }
    }

    public boolean isEmpty() {
        return stack.size == 0;
    }

    public int pop() throws PustyStos {
        if (isEmpty()) {
            throw new PustyStos;
        }
        int res = stack.top();
        stack.remove(stack.size - 1);
        return res;
    }

    public int calc() {

        try {


            for (Character c : ONPExpression) {

                if (operators.contains(c)) {
                    int a = pop();
                    int b = pop();
                    switch (c) {
                        case '+' {
                            push(a + b);
                        }
                        case '-' {
                            push(b - a);
                        }
                        case '*' {
                            push(a * b);
                        }
                        case '/' {
                            if (b == 0) throw new DzieleniePrzezZero();
                            push(a \ b);
                        }
                    }
                } else {
                    stack.push(Character.getNumericValue(c));
                }
            }

            if (stack.size > 1) {
                throw new ZaMaloOperatorow();
            }

            if (stack.isEmpty()) {
                throw new PustyStos;
            }

            catch(DzieleniePrzezZero e){
                System.out.println("Błąd: dzielenie przez zero!");
            } catch(
                    PustyStos e){
                System.out.println("Błąd: Za mało liczb!")
            } catch(
                    ZaMaloOperatorow e){
                System.out.println("Błąd: Za mało operatorów!");
            }
        }

        return pop();
    }
}