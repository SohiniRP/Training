package com.week3.designpatterns.creational.prototype;

class Document implements Prototype<Document> {

    private String title;
    private String content;
    private Metadata metadata;

    public Document(String title, String content, Metadata metadata) {
        this.title = title;
        this.content = content;
        this.metadata = metadata;
    }

    @Override
    public Document clone() {
        Metadata clonedMetadata =
                new Metadata(this.metadata.author, this.metadata.version);

        return new Document(
                this.title,
                this.content,
                clonedMetadata
        );
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.metadata.author = author;
    }

    @Override
    public String toString() {
        return "Title: " + title +
                ", Content: " + content +
                ", Author: " + metadata.author +
                ", Version: " + metadata.version;
    }
}
