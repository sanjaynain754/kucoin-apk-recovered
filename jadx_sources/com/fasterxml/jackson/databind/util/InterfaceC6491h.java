package com.fasterxml.jackson.databind.util;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.TypeFactory;

/* JADX INFO: renamed from: com.fasterxml.jackson.databind.util.h */
/* JADX INFO: compiled from: Converter.java */
/* JADX INFO: loaded from: classes45.dex */
public interface InterfaceC6491h<IN, OUT> {

    /* JADX INFO: renamed from: com.fasterxml.jackson.databind.util.h$a */
    /* JADX INFO: compiled from: Converter.java */
    public static abstract class a implements InterfaceC6491h<Object, Object> {
    }

    /* JADX INFO: renamed from: a */
    JavaType mo11360a(TypeFactory typeFactory);

    /* JADX INFO: renamed from: b */
    JavaType mo11361b(TypeFactory typeFactory);

    OUT convert(IN in2);
}
