package org.TeamS.sugar.entity;

public class Dict {
    private int id;

    private String dictType;

    private String dictName;

    private String dictCode;

    private int order;

    @Override
    public String toString() {
        return "Dict{" +
                "id=" + id +
                ", dictType='" + dictType + '\'' +
                ", dictName='" + dictName + '\'' +
                ", dictCode='" + dictCode + '\'' +
                ", order=" + order +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDictType() {
        return dictType;
    }

    public void setDictType(String dictType) {
        this.dictType = dictType;
    }

    public String getDictName() {
        return dictName;
    }

    public void setDictName(String dictName) {
        this.dictName = dictName;
    }

    public String getDictCode() {
        return dictCode;
    }

    public void setDictCode(String dictCode) {
        this.dictCode = dictCode;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }
}
