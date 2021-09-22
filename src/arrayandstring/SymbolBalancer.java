package arrayandstring;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class SymbolBalancer {
    String ODD_DELIMITER = ""+(char)0;
    String filename;
    //text stores the content of the file
    String text;
    Stack<Character> stack;
    List<Character> openSymbol= new ArrayList<>();
    List<Character>closedSymbol=new ArrayList<>();;
    public SymbolBalancer(String filename) {
        this.filename = filename;
        readFile();
        stack= new Stack<Character>();
    }
    public String getText() {
        return text;
    }
    boolean symbolsBalanced(String delimiters){

//		When an open symbol is read, push it
//		ï‚— When a closed symbol is read, pop the Stack â€“
//		i. if the stack is empty (so it can't be popped) return false.
//		ii. if the popped symbol doesn't match the symbol just read,
//		return false.
//		ï‚— After scanning is complete, if the Stack is not empty, return false

        String openSymbbolchar="[{<(\"";
        String ClosedSymbolChar="]}>)\"";
        for(int i=0;i<openSymbbolchar.length()-1;i++) {
            openSymbol.add(openSymbbolchar.charAt(i));
            closedSymbol.add(ClosedSymbolChar.charAt(i));

        }

        for(int i=0;i<text.length()-1;i++) {
            Character ch=text.charAt(i);

            if(openSymbol.contains(ch)) {
                stack.push(ch);

            }
            if(closedSymbol.contains(ch)) {
                if(stack.empty()) {
                    return false;
                }

                if(closedSymbol.indexOf(ch)!=openSymbol.indexOf(stack.peek())) {

                    return false;

                }
                stack.pop();

            }

        }

        return (stack.empty());


    }


    public static void main(String[] args) {
        SymbolBalancer sb = new SymbolBalancer("Employee.java");

        System.out.println(sb.symbolsBalanced(sb.getText()));

    }
    void readFile() {
        try {
            Scanner sc = new Scanner(new File(filename));
            sc.useDelimiter(ODD_DELIMITER);
            text = sc.next();
            System.out.println(text);
            sc.close();
        }
        catch(FileNotFoundException ex) {
            System.err.println("File Not Found Exception "+ex.getMessage());
        }
    }

}



