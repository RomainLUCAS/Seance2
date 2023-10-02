package org.example;


public class App 
{
    public static void main( String[] args){
        DocumentFactory documentFactory = new DocumentFactory();
        Document d = documentFactory.createDocument("WordDocument");
        d.open();
        Document p = documentFactory.createDocument("AsciiDocument");
        p.open();
    }
}
