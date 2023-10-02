package org.example;

public class DocumentFactory{
    public Document createDocument(String documentType){
        switch(documentType) {
            case "AsciiDocument":
                System.out.println("Je cree un document Ascii");
                return new AsciiDocument();
            case "WordDocument":
                System.out.println("Je cree un document Word");
                return new WordDocument();
            default:
                return null;
        }
    }
}
