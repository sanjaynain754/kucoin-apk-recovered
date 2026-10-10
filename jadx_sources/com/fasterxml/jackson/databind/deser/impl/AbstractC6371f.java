package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.databind.deser.SettableAnyProperty;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: renamed from: com.fasterxml.jackson.databind.deser.impl.f */
/* JADX INFO: compiled from: PropertyValue.java */
/* JADX INFO: loaded from: classes45.dex */
public abstract class AbstractC6371f {

    /* JADX INFO: renamed from: a */
    public final AbstractC6371f f10311a;

    /* JADX INFO: renamed from: b */
    public final Object f10312b;

    /* JADX INFO: renamed from: com.fasterxml.jackson.databind.deser.impl.f$a */
    /* JADX INFO: compiled from: PropertyValue.java */
    public static final class a extends AbstractC6371f {

        /* JADX INFO: renamed from: c */
        public final SettableAnyProperty f10313c;

        /* JADX INFO: renamed from: d */
        public final String f10314d;

        @Override // com.fasterxml.jackson.databind.deser.impl.AbstractC6371f
        /* JADX INFO: renamed from: a */
        public void mo11363a(Object obj) throws IOException {
            this.f10313c.set(obj, this.f10314d, this.f10312b);
        }

        public a(AbstractC6371f abstractC6371f, Object obj, SettableAnyProperty settableAnyProperty, String str) {
            super(abstractC6371f, obj);
            this.f10313c = settableAnyProperty;
            this.f10314d = str;
        }
    }

    /* JADX INFO: renamed from: com.fasterxml.jackson.databind.deser.impl.f$b */
    /* JADX INFO: compiled from: PropertyValue.java */
    public static final class b extends AbstractC6371f {

        /* JADX INFO: renamed from: c */
        public final Object f10315c;

        @Override // com.fasterxml.jackson.databind.deser.impl.AbstractC6371f
        /* JADX INFO: renamed from: a */
        public void mo11363a(Object obj) throws IOException {
            ((Map) obj).put(this.f10315c, this.f10312b);
        }

        public b(AbstractC6371f abstractC6371f, Object obj, Object obj2) {
            super(abstractC6371f, obj);
            this.f10315c = obj2;
        }
    }

    /* JADX INFO: renamed from: com.fasterxml.jackson.databind.deser.impl.f$c */
    /* JADX INFO: compiled from: PropertyValue.java */
    public static final class c extends AbstractC6371f {

        /* JADX INFO: renamed from: c */
        public final SettableBeanProperty f10316c;

        @Override // com.fasterxml.jackson.databind.deser.impl.AbstractC6371f
        /* JADX INFO: renamed from: a */
        public void mo11363a(Object obj) throws IOException {
            this.f10316c.set(obj, this.f10312b);
        }

        public c(AbstractC6371f abstractC6371f, Object obj, SettableBeanProperty settableBeanProperty) {
            super(abstractC6371f, obj);
            this.f10316c = settableBeanProperty;
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo11363a(Object obj) throws IOException;

    public AbstractC6371f(AbstractC6371f abstractC6371f, Object obj) {
        this.f10311a = abstractC6371f;
        this.f10312b = obj;
    }
}
