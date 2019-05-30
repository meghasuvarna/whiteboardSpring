package com.example.myapp.models;

enum Type {
    Heading, List, Paragraph, Image, YouTube, HTML;
}

enum DataType {
    Integer, String, Date, Boolean;
}
public class Widget {
    public Widget() {
    }

    public Widget(int id, Type type, String name, int order, String text, String url, int size, int width, int height,
                  String cssClass, String style, String value, DataType dataType) {
        super();
        this.id = id;
        this.name = name;
        this.order = order;
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

    int id;
    String name;
    int order;
    String text;
    String url;
    int size;
    int width;
    int height;
    String cssClass;
    String style;
    String value;
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

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
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