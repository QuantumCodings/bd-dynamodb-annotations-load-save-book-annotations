package com.amazon.dynamodbannotationsloadsave.annotations;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

@DynamoDBTable(tableName = "DynamoDbAnnotationsLoadSave-Books")
public class Book {

    private String Asin;
    private String Author;
    private String Title;
    private Integer Year;

    public Book(String asin, String author, String title, Integer Year) {
        this.Asin = asin;
        this.Author = author;
        this.Title = title;
        this.Year = Year;
    }

    @DynamoDBHashKey(attributeName = "asin")
    public String getAsin() {
        return Asin;
    }

    public void setAsin(String asin) {
        this.Asin = asin;
    }

    @DynamoDBAttribute(attributeName = "author")
    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        this.Author = author;
    }

    @DynamoDBAttribute(attributeName = "title")
    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        this.Title = title;
    }

    @DynamoDBAttribute(attributeName = "year_published")
    public Integer getYearPublished() {
        return Year;
    }

    public void setYearPublished(Integer Year) {
        this.Year = Year;
    }
}
