package com.fmd.exceptionhandler.utility;

public class BaseDtoModel<T> {
    T obj;

    BaseDtoModel(T obj) {
        this.obj = obj;
    }

    public T getObj() {
        return this.obj;
    }
}
