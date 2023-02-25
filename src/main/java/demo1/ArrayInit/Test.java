package demo1.ArrayInit;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class Test {

    public static void main(String[] args) {


        ArrayInitLexer lexer = new ArrayInitLexer(CharStreams.fromString("{99,3,451}"));

        CommonTokenStream stream = new CommonTokenStream((lexer));
        ArrayInitParser parser = new ArrayInitParser(stream);

        ArrayInitParser.InitContext tree = parser.init();

        ParseTreeWalker walker = new ParseTreeWalker();

        walker.walk(new ShortToUnicodeString(), tree);

        System.out.println();

    }
}
