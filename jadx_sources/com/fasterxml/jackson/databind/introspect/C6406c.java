package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.TypeBindings;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.C6490g;
import com.fasterxml.jackson.databind.util.InterfaceC6484a;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.fasterxml.jackson.databind.introspect.c */
/* JADX INFO: compiled from: AnnotatedClass.java */
/* JADX INFO: loaded from: classes45.dex */
public final class C6406c extends AbstractC6404a implements InterfaceC6423t {

    /* JADX INFO: renamed from: p */
    public static final a f10394p;

    /* JADX INFO: renamed from: b */
    public final JavaType f10395b;

    /* JADX INFO: renamed from: c */
    public final Class<?> f10396c;

    /* JADX INFO: renamed from: d */
    public final TypeBindings f10397d;

    /* JADX INFO: renamed from: e */
    public final List<JavaType> f10398e;

    /* JADX INFO: renamed from: f */
    public final AnnotationIntrospector f10399f;

    /* JADX INFO: renamed from: g */
    public final TypeFactory f10400g;

    /* JADX INFO: renamed from: h */
    public final AbstractC6415l.a f10401h;

    /* JADX INFO: renamed from: i */
    public final Class<?> f10402i;

    /* JADX INFO: renamed from: j */
    public final boolean f10403j;

    /* JADX INFO: renamed from: k */
    public final InterfaceC6484a f10404k;

    /* JADX INFO: renamed from: l */
    public a f10405l;

    /* JADX INFO: renamed from: m */
    public C6411h f10406m;

    /* JADX INFO: renamed from: n */
    public List<AnnotatedField> f10407n;

    /* JADX INFO: renamed from: o */
    public transient Boolean f10408o;

    public C6406c(JavaType javaType, Class<?> cls, List<JavaType> list, Class<?> cls2, InterfaceC6484a interfaceC6484a, TypeBindings typeBindings, AnnotationIntrospector annotationIntrospector, AbstractC6415l.a aVar, TypeFactory typeFactory, boolean z11) {
        this.f10395b = javaType;
        this.f10396c = cls;
        this.f10398e = list;
        this.f10402i = cls2;
        this.f10404k = interfaceC6484a;
        this.f10397d = typeBindings;
        this.f10399f = annotationIntrospector;
        this.f10401h = aVar;
        this.f10400g = typeFactory;
        this.f10403j = z11;
    }

    @Override // com.fasterxml.jackson.databind.introspect.AbstractC6404a
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return C6490g.m11905H(obj, C6406c.class) && ((C6406c) obj).f10396c == this.f10396c;
    }

    /* JADX INFO: renamed from: com.fasterxml.jackson.databind.introspect.c$a */
    /* JADX INFO: compiled from: AnnotatedClass.java */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final AnnotatedConstructor f10409a;

        /* JADX INFO: renamed from: b */
        public final List<AnnotatedConstructor> f10410b;

        /* JADX INFO: renamed from: c */
        public final List<AnnotatedMethod> f10411c;

        public a(AnnotatedConstructor annotatedConstructor, List<AnnotatedConstructor> list, List<AnnotatedMethod> list2) {
            this.f10409a = annotatedConstructor;
            this.f10410b = list;
            this.f10411c = list2;
        }
    }

    static {
        List list = Collections.EMPTY_LIST;
        f10394p = new a(null, list, list);
    }

    @Override // com.fasterxml.jackson.databind.introspect.InterfaceC6423t
    /* JADX INFO: renamed from: a */
    public JavaType mo11457a(Type type) {
        return this.f10400g.resolveMemberType(type, this.f10397d);
    }

    @Override // com.fasterxml.jackson.databind.introspect.AbstractC6404a
    @Deprecated
    public Iterable<Annotation> annotations() {
        InterfaceC6484a interfaceC6484a = this.f10404k;
        if (interfaceC6484a instanceof C6412i) {
            return ((C6412i) interfaceC6484a).m11516c();
        }
        if ((interfaceC6484a instanceof AnnotationCollector.OneAnnotation) || (interfaceC6484a instanceof AnnotationCollector.TwoAnnotations)) {
            throw new UnsupportedOperationException("please use getAnnotations/ hasAnnotation to check for Annotations");
        }
        return Collections.EMPTY_LIST;
    }

    /* JADX INFO: renamed from: b */
    public final a m11458b() {
        C6406c c6406c;
        a aVarM11488p;
        a aVar = this.f10405l;
        if (aVar != null) {
            return aVar;
        }
        JavaType javaType = this.f10395b;
        if (javaType == null) {
            aVarM11488p = f10394p;
            c6406c = this;
        } else {
            c6406c = this;
            aVarM11488p = C6408e.m11488p(this.f10399f, this.f10400g, c6406c, javaType, this.f10402i, this.f10403j);
        }
        c6406c.f10405l = aVarM11488p;
        return aVarM11488p;
    }

    /* JADX INFO: renamed from: c */
    public final List<AnnotatedField> m11459c() {
        C6406c c6406c;
        List<AnnotatedField> listM11499m;
        List<AnnotatedField> list = this.f10407n;
        if (list != null) {
            return list;
        }
        JavaType javaType = this.f10395b;
        if (javaType == null) {
            listM11499m = Collections.EMPTY_LIST;
            c6406c = this;
        } else {
            c6406c = this;
            listM11499m = C6409f.m11499m(this.f10399f, c6406c, this.f10401h, this.f10400g, javaType, this.f10403j);
        }
        c6406c.f10407n = listM11499m;
        return listM11499m;
    }

    /* JADX INFO: renamed from: d */
    public final C6411h m11460d() {
        C6406c c6406c;
        C6411h c6411hM11506m;
        C6411h c6411h = this.f10406m;
        if (c6411h != null) {
            return c6411h;
        }
        JavaType javaType = this.f10395b;
        if (javaType == null) {
            c6411hM11506m = new C6411h();
            c6406c = this;
        } else {
            c6406c = this;
            c6411hM11506m = C6410g.m11506m(this.f10399f, c6406c, this.f10401h, this.f10400g, javaType, this.f10398e, this.f10402i, this.f10403j);
        }
        c6406c.f10406m = c6411hM11506m;
        return c6411hM11506m;
    }

    @Override // com.fasterxml.jackson.databind.introspect.AbstractC6404a
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public Class<?> getAnnotated() {
        return this.f10396c;
    }

    @Override // com.fasterxml.jackson.databind.introspect.AbstractC6404a
    public <A extends Annotation> A getAnnotation(Class<A> cls) {
        return (A) this.f10404k.get(cls);
    }

    @Override // com.fasterxml.jackson.databind.introspect.AbstractC6404a
    public int getModifiers() {
        return this.f10396c.getModifiers();
    }

    @Override // com.fasterxml.jackson.databind.introspect.AbstractC6404a
    public String getName() {
        return this.f10396c.getName();
    }

    @Override // com.fasterxml.jackson.databind.introspect.AbstractC6404a
    public Class<?> getRawType() {
        return this.f10396c;
    }

    @Override // com.fasterxml.jackson.databind.introspect.AbstractC6404a
    public JavaType getType() {
        return this.f10395b;
    }

    /* JADX INFO: renamed from: h */
    public InterfaceC6484a m11464h() {
        return this.f10404k;
    }

    @Override // com.fasterxml.jackson.databind.introspect.AbstractC6404a
    public boolean hasAnnotation(Class<?> cls) {
        return this.f10404k.has(cls);
    }

    @Override // com.fasterxml.jackson.databind.introspect.AbstractC6404a
    public boolean hasOneOf(Class<? extends Annotation>[] clsArr) {
        return this.f10404k.hasOneOf(clsArr);
    }

    @Override // com.fasterxml.jackson.databind.introspect.AbstractC6404a
    public int hashCode() {
        return this.f10396c.getName().hashCode();
    }

    /* JADX INFO: renamed from: l */
    public boolean m11468l() {
        return this.f10404k.size() > 0;
    }

    /* JADX INFO: renamed from: m */
    public boolean m11469m() {
        Boolean boolValueOf = this.f10408o;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(C6490g.m11914Q(this.f10396c));
            this.f10408o = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    @Override // com.fasterxml.jackson.databind.introspect.AbstractC6404a
    public String toString() {
        return "[AnnotedClass " + this.f10396c.getName() + "]";
    }

    /* JADX INFO: renamed from: e */
    public Iterable<AnnotatedField> m11461e() {
        return m11459c();
    }

    /* JADX INFO: renamed from: f */
    public AnnotatedMethod m11462f(String str, Class<?>[] clsArr) {
        return m11460d().m11511a(str, clsArr);
    }

    /* JADX INFO: renamed from: i */
    public List<AnnotatedConstructor> m11465i() {
        return m11458b().f10410b;
    }

    /* JADX INFO: renamed from: j */
    public AnnotatedConstructor m11466j() {
        return m11458b().f10409a;
    }

    /* JADX INFO: renamed from: k */
    public List<AnnotatedMethod> m11467k() {
        return m11458b().f10411c;
    }

    /* JADX INFO: renamed from: n */
    public Iterable<AnnotatedMethod> m11470n() {
        return m11460d();
    }

    public C6406c(Class<?> cls) {
        this.f10395b = null;
        this.f10396c = cls;
        this.f10398e = Collections.EMPTY_LIST;
        this.f10402i = null;
        this.f10404k = AnnotationCollector.m11437d();
        this.f10397d = TypeBindings.emptyBindings();
        this.f10399f = null;
        this.f10401h = null;
        this.f10400g = null;
        this.f10403j = false;
    }
}
