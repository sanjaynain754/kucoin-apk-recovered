package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.util.InterfaceC6484a;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes45.dex */
public abstract class AnnotationCollector {

    /* JADX INFO: renamed from: b */
    public static final InterfaceC6484a f10368b = new NoAnnotations();

    /* JADX INFO: renamed from: a */
    public final Object f10369a;

    public static class NoAnnotations implements InterfaceC6484a, Serializable {
        private static final long serialVersionUID = 1;

        @Override // com.fasterxml.jackson.databind.util.InterfaceC6484a
        public <A extends Annotation> A get(Class<A> cls) {
            return null;
        }

        @Override // com.fasterxml.jackson.databind.util.InterfaceC6484a
        public boolean has(Class<?> cls) {
            return false;
        }

        @Override // com.fasterxml.jackson.databind.util.InterfaceC6484a
        public boolean hasOneOf(Class<? extends Annotation>[] clsArr) {
            return false;
        }

        @Override // com.fasterxml.jackson.databind.util.InterfaceC6484a
        public int size() {
            return 0;
        }
    }

    public static class OneAnnotation implements InterfaceC6484a, Serializable {
        private static final long serialVersionUID = 1;
        private final Class<?> _type;
        private final Annotation _value;

        @Override // com.fasterxml.jackson.databind.util.InterfaceC6484a
        public boolean hasOneOf(Class<? extends Annotation>[] clsArr) {
            for (Class<? extends Annotation> cls : clsArr) {
                if (cls == this._type) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.fasterxml.jackson.databind.util.InterfaceC6484a
        public int size() {
            return 1;
        }

        @Override // com.fasterxml.jackson.databind.util.InterfaceC6484a
        public <A extends Annotation> A get(Class<A> cls) {
            if (this._type == cls) {
                return (A) this._value;
            }
            return null;
        }

        @Override // com.fasterxml.jackson.databind.util.InterfaceC6484a
        public boolean has(Class<?> cls) {
            return this._type == cls;
        }

        public OneAnnotation(Class<?> cls, Annotation annotation) {
            this._type = cls;
            this._value = annotation;
        }
    }

    public static class TwoAnnotations implements InterfaceC6484a, Serializable {
        private static final long serialVersionUID = 1;
        private final Class<?> _type1;
        private final Class<?> _type2;
        private final Annotation _value1;
        private final Annotation _value2;

        @Override // com.fasterxml.jackson.databind.util.InterfaceC6484a
        public boolean hasOneOf(Class<? extends Annotation>[] clsArr) {
            for (Class<? extends Annotation> cls : clsArr) {
                if (cls == this._type1 || cls == this._type2) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.fasterxml.jackson.databind.util.InterfaceC6484a
        public int size() {
            return 2;
        }

        @Override // com.fasterxml.jackson.databind.util.InterfaceC6484a
        public <A extends Annotation> A get(Class<A> cls) {
            if (this._type1 == cls) {
                return (A) this._value1;
            }
            if (this._type2 == cls) {
                return (A) this._value2;
            }
            return null;
        }

        @Override // com.fasterxml.jackson.databind.util.InterfaceC6484a
        public boolean has(Class<?> cls) {
            return this._type1 == cls || this._type2 == cls;
        }

        public TwoAnnotations(Class<?> cls, Annotation annotation, Class<?> cls2, Annotation annotation2) {
            this._type1 = cls;
            this._value1 = annotation;
            this._type2 = cls2;
            this._value2 = annotation2;
        }
    }

    /* JADX INFO: renamed from: com.fasterxml.jackson.databind.introspect.AnnotationCollector$a */
    public static class C6395a extends AnnotationCollector {

        /* JADX INFO: renamed from: c */
        public static final C6395a f10370c = new C6395a(null);

        @Override // com.fasterxml.jackson.databind.introspect.AnnotationCollector
        /* JADX INFO: renamed from: f */
        public boolean mo11442f(Annotation annotation) {
            return false;
        }

        @Override // com.fasterxml.jackson.databind.introspect.AnnotationCollector
        /* JADX INFO: renamed from: a */
        public AnnotationCollector mo11439a(Annotation annotation) {
            return new C6397c(this.f10369a, annotation.annotationType(), annotation);
        }

        @Override // com.fasterxml.jackson.databind.introspect.AnnotationCollector
        /* JADX INFO: renamed from: b */
        public C6412i mo11440b() {
            return new C6412i();
        }

        @Override // com.fasterxml.jackson.databind.introspect.AnnotationCollector
        /* JADX INFO: renamed from: c */
        public InterfaceC6484a mo11441c() {
            return AnnotationCollector.f10368b;
        }

        public C6395a(Object obj) {
            super(obj);
        }
    }

    /* JADX INFO: renamed from: com.fasterxml.jackson.databind.introspect.AnnotationCollector$b */
    public static class C6396b extends AnnotationCollector {

        /* JADX INFO: renamed from: c */
        public final HashMap<Class<?>, Annotation> f10371c;

        @Override // com.fasterxml.jackson.databind.introspect.AnnotationCollector
        /* JADX INFO: renamed from: a */
        public AnnotationCollector mo11439a(Annotation annotation) {
            this.f10371c.put(annotation.annotationType(), annotation);
            return this;
        }

        @Override // com.fasterxml.jackson.databind.introspect.AnnotationCollector
        /* JADX INFO: renamed from: b */
        public C6412i mo11440b() {
            C6412i c6412i = new C6412i();
            Iterator<Annotation> it = this.f10371c.values().iterator();
            while (it.hasNext()) {
                c6412i.m11515b(it.next());
            }
            return c6412i;
        }

        @Override // com.fasterxml.jackson.databind.introspect.AnnotationCollector
        /* JADX INFO: renamed from: c */
        public InterfaceC6484a mo11441c() {
            if (this.f10371c.size() != 2) {
                return new C6412i(this.f10371c);
            }
            Iterator<Map.Entry<Class<?>, Annotation>> it = this.f10371c.entrySet().iterator();
            Map.Entry<Class<?>, Annotation> next = it.next();
            Map.Entry<Class<?>, Annotation> next2 = it.next();
            return new TwoAnnotations(next.getKey(), next.getValue(), next2.getKey(), next2.getValue());
        }

        @Override // com.fasterxml.jackson.databind.introspect.AnnotationCollector
        /* JADX INFO: renamed from: f */
        public boolean mo11442f(Annotation annotation) {
            return this.f10371c.containsKey(annotation.annotationType());
        }

        public C6396b(Object obj, Class<?> cls, Annotation annotation, Class<?> cls2, Annotation annotation2) {
            super(obj);
            HashMap<Class<?>, Annotation> map = new HashMap<>();
            this.f10371c = map;
            map.put(cls, annotation);
            map.put(cls2, annotation2);
        }
    }

    /* JADX INFO: renamed from: com.fasterxml.jackson.databind.introspect.AnnotationCollector$c */
    public static class C6397c extends AnnotationCollector {

        /* JADX INFO: renamed from: c */
        public Class<?> f10372c;

        /* JADX INFO: renamed from: d */
        public Annotation f10373d;

        @Override // com.fasterxml.jackson.databind.introspect.AnnotationCollector
        /* JADX INFO: renamed from: b */
        public C6412i mo11440b() {
            return C6412i.m11513e(this.f10372c, this.f10373d);
        }

        @Override // com.fasterxml.jackson.databind.introspect.AnnotationCollector
        /* JADX INFO: renamed from: c */
        public InterfaceC6484a mo11441c() {
            return new OneAnnotation(this.f10372c, this.f10373d);
        }

        public C6397c(Object obj, Class<?> cls, Annotation annotation) {
            super(obj);
            this.f10372c = cls;
            this.f10373d = annotation;
        }

        @Override // com.fasterxml.jackson.databind.introspect.AnnotationCollector
        /* JADX INFO: renamed from: a */
        public AnnotationCollector mo11439a(Annotation annotation) {
            Class<? extends Annotation> clsAnnotationType = annotation.annotationType();
            Class<?> cls = this.f10372c;
            if (cls == clsAnnotationType) {
                this.f10373d = annotation;
                return this;
            }
            return new C6396b(this.f10369a, cls, this.f10373d, clsAnnotationType, annotation);
        }

        @Override // com.fasterxml.jackson.databind.introspect.AnnotationCollector
        /* JADX INFO: renamed from: f */
        public boolean mo11442f(Annotation annotation) {
            if (annotation.annotationType() == this.f10372c) {
                return true;
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract AnnotationCollector mo11439a(Annotation annotation);

    /* JADX INFO: renamed from: b */
    public abstract C6412i mo11440b();

    /* JADX INFO: renamed from: c */
    public abstract InterfaceC6484a mo11441c();

    /* JADX INFO: renamed from: f */
    public abstract boolean mo11442f(Annotation annotation);

    /* JADX INFO: renamed from: d */
    public static InterfaceC6484a m11437d() {
        return f10368b;
    }

    /* JADX INFO: renamed from: e */
    public static AnnotationCollector m11438e() {
        return C6395a.f10370c;
    }

    public AnnotationCollector(Object obj) {
        this.f10369a = obj;
    }
}
