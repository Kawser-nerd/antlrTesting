package com.company;

import JavaParser.JavaLexer;
import JavaParser.JavaParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.IOException;

public class APIFullyQualifiedMain {

    public static void main(String[] args) throws IOException {
        CharStream input = CharStreams.fromFileName("C:\\Users\\kwnaf\\IdeaProjects\\antlrTesting\\src\\test.java");
        JavaLexer lexer = new JavaLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        JavaParser parser = new JavaParser(tokens); // Parser Created
        ParseTree tree = parser.compilationUnit();

        ParseTreeWalker walker = new ParseTreeWalker();
        APIFullyQualifiedListner listener = new APIFullyQualifiedListner(parser);
        walker.walk(listener, tree);

    }
}
