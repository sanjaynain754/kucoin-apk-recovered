package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.type.TypeBindings;
import com.fasterxml.jackson.databind.util.C6490g;
import com.fasterxml.jackson.databind.util.InterfaceC6484a;
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.fasterxml.jackson.databind.introspect.d */
/* JADX INFO: compiled from: AnnotatedClassResolver.java */
/* JADX INFO: loaded from: classes45.dex */
public class C6407d {

    /* JADX INFO: renamed from: i */
    public static final InterfaceC6484a f10412i = AnnotationCollector.m11437d();

    /* JADX INFO: renamed from: j */
    public static final Class<?> f10413j = Object.class;

    /* JADX INFO: renamed from: k */
    public static final Class<?> f10414k = Enum.class;

    /* JADX INFO: renamed from: l */
    public static final Class<?> f10415l = List.class;

    /* JADX INFO: renamed from: m */
    public static final Class<?> f10416m = Map.class;

    /* JADX INFO: renamed from: a */
    public final MapperConfig<?> f10417a;

    /* JADX INFO: renamed from: b */
    public final AnnotationIntrospector f10418b;

    /* JADX INFO: renamed from: c */
    public final AbstractC6415l.a f10419c;

    /* JADX INFO: renamed from: d */
    public final TypeBindings f10420d;

    /* JADX INFO: renamed from: e */
    public final JavaType f10421e;

    /* JADX INFO: renamed from: f */
    public final Class<?> f10422f;

    /* JADX INFO: renamed from: g */
    public final Class<?> f10423g;

    /* JADX INFO: renamed from: h */
    public final boolean f10424h;

    public C6407d(MapperConfig<?> mapperConfig, JavaType javaType, AbstractC6415l.a aVar) {
        this.f10417a = mapperConfig;
        this.f10421e = javaType;
        Class<?> rawClass = javaType.getRawClass();
        this.f10422f = rawClass;
        this.f10419c = aVar;
        this.f10420d = javaType.getBindings();
        AnnotationIntrospector annotationIntrospector = mapperConfig.isAnnotationProcessingEnabled() ? mapperConfig.getAnnotationIntrospector() : null;
        this.f10418b = annotationIntrospector;
        this.f10423g = aVar != null ? aVar.findMixInClassFor(rawClass) : null;
        this.f10424h = (annotationIntrospector == null || (C6490g.m11910M(rawClass) && javaType.isContainerType())) ? false : true;
    }

    /* JADX INFO: renamed from: g */
    public static C6406c m11474g(MapperConfig<?> mapperConfig, Class<?> cls) {
        return new C6406c(cls);
    }

    /* JADX INFO: renamed from: h */
    public static C6406c m11475h(Class<?> cls) {
        return new C6406c(cls);
    }

    /* JADX INFO: renamed from: p */
    public static boolean m11480p(MapperConfig<?> mapperConfig, Class<?> cls) {
        return mapperConfig == null || mapperConfig.findMixInClassFor(cls) == null;
    }

    /* JADX INFO: renamed from: a */
    public final AnnotationCollector m11481a(AnnotationCollector annotationCollector, Annotation[] annotationArr) {
        if (annotationArr != null) {
            for (Annotation annotation : annotationArr) {
                if (!annotationCollector.mo11442f(annotation)) {
                    annotationCollector = annotationCollector.mo11439a(annotation);
                    if (this.f10418b.isAnnotationBundle(annotation)) {
                        annotationCollector = m11483c(annotationCollector, annotation);
                    }
                }
            }
        }
        return annotationCollector;
    }

    /* JADX INFO: renamed from: b */
    public final AnnotationCollector m11482b(AnnotationCollector annotationCollector, Class<?> cls, Class<?> cls2) {
        if (cls2 != null) {
            annotationCollector = m11481a(annotationCollector, C6490g.m11954p(cls2));
            Iterator<Class<?>> it = C6490g.m11962x(cls2, cls, false).iterator();
            while (it.hasNext()) {
                annotationCollector = m11481a(annotationCollector, C6490g.m11954p(it.next()));
            }
        }
        return annotationCollector;
    }

    /* JADX INFO: renamed from: j */
    public final InterfaceC6484a m11484j(List<JavaType> list) {
        if (this.f10418b == null) {
            return f10412i;
        }
        AbstractC6415l.a aVar = this.f10419c;
        boolean z11 = aVar != null && (!(aVar instanceof SimpleMixInResolver) || ((SimpleMixInResolver) aVar).hasMixIns());
        if (!z11 && !this.f10424h) {
            return f10412i;
        }
        AnnotationCollector annotationCollectorM11438e = AnnotationCollector.m11438e();
        Class<?> cls = this.f10423g;
        if (cls != null) {
            annotationCollectorM11438e = m11482b(annotationCollectorM11438e, this.f10422f, cls);
        }
        if (this.f10424h) {
            annotationCollectorM11438e = m11481a(annotationCollectorM11438e, C6490g.m11954p(this.f10422f));
        }
        for (JavaType javaType : list) {
            if (z11) {
                Class<?> rawClass = javaType.getRawClass();
                annotationCollectorM11438e = m11482b(annotationCollectorM11438e, rawClass, this.f10419c.findMixInClassFor(rawClass));
            }
            if (this.f10424h) {
                annotationCollectorM11438e = m11481a(annotationCollectorM11438e, C6490g.m11954p(javaType.getRawClass()));
            }
        }
        if (z11) {
            annotationCollectorM11438e = m11482b(annotationCollectorM11438e, Object.class, this.f10419c.findMixInClassFor(Object.class));
        }
        return annotationCollectorM11438e.mo11441c();
    }

    /* JADX INFO: renamed from: k */
    public C6406c m11485k() {
        ArrayList arrayList = new ArrayList(8);
        if (!this.f10421e.hasRawClass(Object.class)) {
            if (this.f10421e.isInterface()) {
                m11471d(this.f10421e, arrayList, false);
            } else {
                m11472e(this.f10421e, arrayList, false);
            }
        }
        return new C6406c(this.f10421e, this.f10422f, arrayList, this.f10423g, m11484j(arrayList), this.f10420d, this.f10418b, this.f10419c, this.f10417a.getTypeFactory(), this.f10424h);
    }

    /* JADX INFO: renamed from: l */
    public C6406c m11486l() {
        List<JavaType> list = Collections.EMPTY_LIST;
        return new C6406c(null, this.f10422f, list, this.f10423g, m11484j(list), this.f10420d, this.f10418b, this.f10419c, this.f10417a.getTypeFactory(), this.f10424h);
    }

    /* JADX INFO: renamed from: d */
    public static void m11471d(JavaType javaType, List<JavaType> list, boolean z11) {
        Class<?> rawClass = javaType.getRawClass();
        if (z11) {
            if (!m11473f(list, rawClass)) {
                list.add(javaType);
                if (rawClass == f10415l || rawClass == f10416m) {
                    return;
                }
            } else {
                return;
            }
        }
        Iterator<JavaType> it = javaType.getInterfaces().iterator();
        while (it.hasNext()) {
            m11471d(it.next(), list, true);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m11472e(JavaType javaType, List<JavaType> list, boolean z11) {
        Class<?> rawClass = javaType.getRawClass();
        if (rawClass != f10413j && rawClass != f10414k) {
            if (z11) {
                if (!m11473f(list, rawClass)) {
                    list.add(javaType);
                } else {
                    return;
                }
            }
            Iterator<JavaType> it = javaType.getInterfaces().iterator();
            while (it.hasNext()) {
                m11471d(it.next(), list, true);
            }
            JavaType superClass = javaType.getSuperClass();
            if (superClass != null) {
                m11472e(superClass, list, true);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public static boolean m11473f(List<JavaType> list, Class<?> cls) {
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (list.get(i11).getRawClass() == cls) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: i */
    public static C6406c m11476i(MapperConfig<?> mapperConfig, JavaType javaType, AbstractC6415l.a aVar) {
        if (javaType.isArrayType() && m11480p(mapperConfig, javaType.getRawClass())) {
            return m11474g(mapperConfig, javaType.getRawClass());
        }
        return new C6407d(mapperConfig, javaType, aVar).m11485k();
    }

    /* JADX INFO: renamed from: m */
    public static C6406c m11477m(MapperConfig<?> mapperConfig, JavaType javaType, AbstractC6415l.a aVar) {
        if (javaType.isArrayType() && m11480p(mapperConfig, javaType.getRawClass())) {
            return m11474g(mapperConfig, javaType.getRawClass());
        }
        return new C6407d(mapperConfig, javaType, aVar).m11486l();
    }

    /* JADX INFO: renamed from: n */
    public static C6406c m11478n(MapperConfig<?> mapperConfig, Class<?> cls) {
        return m11479o(mapperConfig, cls, mapperConfig);
    }

    /* JADX INFO: renamed from: o */
    public static C6406c m11479o(MapperConfig<?> mapperConfig, Class<?> cls, AbstractC6415l.a aVar) {
        if (cls.isArray() && m11480p(mapperConfig, cls)) {
            return m11474g(mapperConfig, cls);
        }
        return new C6407d(mapperConfig, cls, aVar).m11486l();
    }

    /* JADX INFO: renamed from: c */
    public final AnnotationCollector m11483c(AnnotationCollector annotationCollector, Annotation annotation) {
        for (Annotation annotation2 : C6490g.m11954p(annotation.annotationType())) {
            if (!(annotation2 instanceof Target) && !(annotation2 instanceof Retention) && !annotationCollector.mo11442f(annotation2)) {
                annotationCollector = annotationCollector.mo11439a(annotation2);
                if (this.f10418b.isAnnotationBundle(annotation2)) {
                    annotationCollector = m11483c(annotationCollector, annotation2);
                }
            }
        }
        return annotationCollector;
    }

    public C6407d(MapperConfig<?> mapperConfig, Class<?> cls, AbstractC6415l.a aVar) {
        this.f10417a = mapperConfig;
        this.f10421e = null;
        this.f10422f = cls;
        this.f10419c = aVar;
        this.f10420d = TypeBindings.emptyBindings();
        if (mapperConfig == null) {
            this.f10418b = null;
            this.f10423g = null;
        } else {
            this.f10418b = mapperConfig.isAnnotationProcessingEnabled() ? mapperConfig.getAnnotationIntrospector() : null;
            this.f10423g = aVar != null ? aVar.findMixInClassFor(cls) : null;
        }
        this.f10424h = this.f10418b != null;
    }
}
