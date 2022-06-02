package com.company;

import JavaParser.JavaParser;
import JavaParser.JavaParserBaseListener;

public class APIFullyQualifiedListner extends JavaParserBaseListener {

    JavaParser parser;

    public APIFullyQualifiedListner(JavaParser parser){this.parser = parser; }

    @Override
    public void enterQualifiedName(JavaParser.QualifiedNameContext ctx) {
        //System.out.println(ctx.getText());
    }

    @Override
    public void enterMethodCall(JavaParser.MethodCallContext ctx) {
        //System.out.println(ctx);
    }

    @Override
    public void enterVariableInitializer(JavaParser.VariableInitializerContext ctx) {
        //System.out.println(ctx.getText());
    }
    @Override
    public void enterClassOrInterfaceType(JavaParser.ClassOrInterfaceTypeContext ctx) {
        //System.out.println(ctx.getText());
    }

    @Override
    public void enterVariableDeclarator(JavaParser.VariableDeclaratorContext ctx) {
        //System.out.println(ctx.variableDeclaratorId());
    }

    @Override
    public void enterTypeDeclaration(JavaParser.TypeDeclarationContext ctx) {
        System.out.println(ctx.annotationTypeDeclaration());
    }

    @Override
    public void enterTypeType(JavaParser.TypeTypeContext ctx) {

    }
}
