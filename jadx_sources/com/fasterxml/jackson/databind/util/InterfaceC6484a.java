package com.fasterxml.jackson.databind.util;

import java.lang.annotation.Annotation;

/* JADX INFO: renamed from: com.fasterxml.jackson.databind.util.a */
/* JADX INFO: compiled from: Annotations.java */
/* JADX INFO: loaded from: classes45.dex */
public interface InterfaceC6484a {
    <A extends Annotation> A get(Class<A> cls);

    boolean has(Class<?> cls);

    boolean hasOneOf(Class<? extends Annotation>[] clsArr);

    int size();
}
