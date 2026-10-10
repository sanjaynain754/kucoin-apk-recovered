package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.annotation.JacksonInject;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.introspect.AbstractC6414k;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;
import com.fasterxml.jackson.databind.introspect.AnnotatedWithParams;

/* JADX INFO: renamed from: com.fasterxml.jackson.databind.deser.impl.a */
/* JADX INFO: compiled from: CreatorCandidate.java */
/* JADX INFO: loaded from: classes45.dex */
public final class C6366a {

    /* JADX INFO: renamed from: a */
    public final AnnotationIntrospector f10279a;

    /* JADX INFO: renamed from: b */
    public final AnnotatedWithParams f10280b;

    /* JADX INFO: renamed from: c */
    public final int f10281c;

    /* JADX INFO: renamed from: d */
    public final a[] f10282d;

    /* JADX INFO: renamed from: e */
    public int m11307e() {
        int i11 = -1;
        for (int i12 = 0; i12 < this.f10281c; i12++) {
            if (this.f10282d[i12].f10285c == null) {
                if (i11 >= 0) {
                    return -1;
                }
                i11 = i12;
            }
        }
        return i11;
    }

    /* JADX INFO: renamed from: com.fasterxml.jackson.databind.deser.impl.a$a */
    /* JADX INFO: compiled from: CreatorCandidate.java */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final AnnotatedParameter f10283a;

        /* JADX INFO: renamed from: b */
        public final AbstractC6414k f10284b;

        /* JADX INFO: renamed from: c */
        public final JacksonInject.Value f10285c;

        public a(AnnotatedParameter annotatedParameter, AbstractC6414k abstractC6414k, JacksonInject.Value value) {
            this.f10283a = annotatedParameter;
            this.f10284b = abstractC6414k;
            this.f10285c = value;
        }
    }

    /* JADX INFO: renamed from: b */
    public AnnotatedWithParams m11304b() {
        return this.f10280b;
    }

    /* JADX INFO: renamed from: c */
    public PropertyName m11305c(int i11) {
        AbstractC6414k abstractC6414k = this.f10282d[i11].f10284b;
        if (abstractC6414k == null || !abstractC6414k.mo11551x()) {
            return null;
        }
        return abstractC6414k.getFullName();
    }

    /* JADX INFO: renamed from: d */
    public PropertyName m11306d(int i11) {
        String strFindImplicitPropertyName = this.f10279a.findImplicitPropertyName(this.f10282d[i11].f10283a);
        if (strFindImplicitPropertyName == null || strFindImplicitPropertyName.isEmpty()) {
            return null;
        }
        return PropertyName.construct(strFindImplicitPropertyName);
    }

    /* JADX INFO: renamed from: f */
    public JacksonInject.Value m11308f(int i11) {
        return this.f10282d[i11].f10285c;
    }

    /* JADX INFO: renamed from: g */
    public int m11309g() {
        return this.f10281c;
    }

    /* JADX INFO: renamed from: h */
    public PropertyName m11310h(int i11) {
        AbstractC6414k abstractC6414k = this.f10282d[i11].f10284b;
        if (abstractC6414k != null) {
            return abstractC6414k.getFullName();
        }
        return null;
    }

    /* JADX INFO: renamed from: i */
    public AnnotatedParameter m11311i(int i11) {
        return this.f10282d[i11].f10283a;
    }

    /* JADX INFO: renamed from: j */
    public AbstractC6414k m11312j(int i11) {
        return this.f10282d[i11].f10284b;
    }

    public String toString() {
        return this.f10280b.toString();
    }

    public C6366a(AnnotationIntrospector annotationIntrospector, AnnotatedWithParams annotatedWithParams, a[] aVarArr, int i11) {
        this.f10279a = annotationIntrospector;
        this.f10280b = annotatedWithParams;
        this.f10282d = aVarArr;
        this.f10281c = i11;
    }

    /* JADX INFO: renamed from: a */
    public static C6366a m11303a(AnnotationIntrospector annotationIntrospector, AnnotatedWithParams annotatedWithParams, AbstractC6414k[] abstractC6414kArr) {
        AbstractC6414k abstractC6414k;
        int parameterCount = annotatedWithParams.getParameterCount();
        a[] aVarArr = new a[parameterCount];
        for (int i11 = 0; i11 < parameterCount; i11++) {
            AnnotatedParameter parameter = annotatedWithParams.getParameter(i11);
            JacksonInject.Value valueFindInjectableValue = annotationIntrospector.findInjectableValue(parameter);
            if (abstractC6414kArr == null) {
                abstractC6414k = null;
            } else {
                abstractC6414k = abstractC6414kArr[i11];
            }
            aVarArr[i11] = new a(parameter, abstractC6414k, valueFindInjectableValue);
        }
        return new C6366a(annotationIntrospector, annotatedWithParams, aVarArr, parameterCount);
    }
}
