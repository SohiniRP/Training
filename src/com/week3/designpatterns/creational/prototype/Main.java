package com.week3.designpatterns.creational.prototype;

public class Main {
    public static void main(String[] args) {
        Document template = new Document(
                "Offer Letter",
                "Welcome to the company",
                new Metadata("HR Team", 1)
        );

        Document doc1 = template.clone();
        doc1.setTitle("Offer Letter - Sohini");
        doc1.setAuthor("HR Manager");

        System.out.println("Template  : " + template);
        System.out.println("Cloned Doc: " + doc1);
    }
}
