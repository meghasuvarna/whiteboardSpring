package com.example.myapp.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
public class Widget {

    @ManyToOne()
    @JsonIgnore
    private Topic topic;

    public Widget() {
    }

    public enum Type {
        Heading, List, Paragraph, Image, YouTube, HTML;
    }

    public enum DataType {
        Integer, String, Date, Boolean;
    }

    public Widget(int id, Type type, String name, int order, String text, String url, int size, int width, int height,
                  String cssClass, String style, String value, DataType dataType) {
        super();
        this.id = id;
        this.name = name;
        this.sequenceNum = order;
        this.text = text;
        this.url = url;
        this.size = size;
        this.width = width;
        this.height = height;
        this.cssClass = cssClass;
        this.style = style;
        this.value = value;
        this.type = type;
        this.dataType = dataType;

    }

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private int sequenceNum;
    private String text;
    private String url;
    private int size;
    private int width;
    private int height;
    private String cssClass;
    private String style;
    private String value;

    public Topic getTopic() {
        return topic;
    }

    public void setTopic(Topic topic) {
        this.topic = topic;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public DataType getDataType() {
        return dataType;
    }

    public void setDataType(DataType dataType) {
        this.dataType = dataType;
    }

    Type type;
    DataType dataType;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return this.text;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUrl() {
        return this.url;
    }

    public void setCssClass(String cssClass) {
        this.cssClass = cssClass;
    }

    public String getCssClass() {
        return this.cssClass;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public String getStyle() {
        return this.style;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }

    public void setId (int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public int getSequenceNum() {
        return sequenceNum;
    }

    public void setSequenceNum(int sequenceNum) {
        this.sequenceNum = sequenceNum;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

}