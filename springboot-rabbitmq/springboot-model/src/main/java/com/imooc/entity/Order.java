package com.imooc.entity;

import java.io.Serializable;

public class Order implements Serializable {
    private static final long serialVersionUID = -5587049302945755413L;
    private int id;
    private String name;
    private String messageId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

}
