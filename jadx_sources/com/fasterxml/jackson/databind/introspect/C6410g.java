package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.C6490g;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.fasterxml.jackson.databind.introspect.g */
/* JADX INFO: compiled from: AnnotatedMethodCollector.java */
/* JADX INFO: loaded from: classes45.dex */
public class C6410g extends C6416m {

    /* JADX INFO: renamed from: d */
    public final AbstractC6415l.a f10434d;

    /* JADX INFO: renamed from: e */
    public final boolean f10435e;

    /* JADX INFO: renamed from: com.fasterxml.jackson.databind.introspect.g$a */
    /* JADX INFO: compiled from: AnnotatedMethodCollector.java */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public InterfaceC6423t f10436a;

        /* JADX INFO: renamed from: b */
        public Method f10437b;

        /* JADX INFO: renamed from: c */
        public AnnotationCollector f10438c;

        /* JADX INFO: renamed from: a */
        public AnnotatedMethod m11510a() {
            Method method = this.f10437b;
            if (method == null) {
                return null;
            }
            return new AnnotatedMethod(this.f10436a, method, this.f10438c.mo11440b(), null);
        }

        public a(InterfaceC6423t interfaceC6423t, Method method, AnnotationCollector annotationCollector) {
            this.f10436a = interfaceC6423t;
            this.f10437b = method;
            this.f10438c = annotationCollector;
        }
    }

    /* JADX INFO: renamed from: m */
    public static C6411h m11506m(AnnotationIntrospector annotationIntrospector, InterfaceC6423t interfaceC6423t, AbstractC6415l.a aVar, TypeFactory typeFactory, JavaType javaType, List<JavaType> list, Class<?> cls, boolean z11) {
        return new C6410g(annotationIntrospector, aVar, z11).m11509l(typeFactory, interfaceC6423t, javaType, list, cls);
    }

    /* JADX INFO: renamed from: i */
    public final void m11507i(InterfaceC6423t interfaceC6423t, Class<?> cls, Map<C6417n, a> map, Class<?> cls2) {
        if (cls2 != null) {
            m11508j(interfaceC6423t, cls, map, cls2);
        }
        if (cls == null) {
            return;
        }
        for (Method method : C6490g.m11964z(cls)) {
            if (m11505k(method)) {
                C6417n c6417n = new C6417n(method);
                a aVar = map.get(c6417n);
                if (aVar == null) {
                    map.put(c6417n, new a(interfaceC6423t, method, this.f10453a == null ? AnnotationCollector.m11438e() : m11557e(method.getDeclaredAnnotations())));
                } else {
                    if (this.f10435e) {
                        aVar.f10438c = m11558f(aVar.f10438c, method.getDeclaredAnnotations());
                    }
                    Method method2 = aVar.f10437b;
                    if (method2 == null) {
                        aVar.f10437b = method;
                    } else if (Modifier.isAbstract(method2.getModifiers()) && !Modifier.isAbstract(method.getModifiers())) {
                        aVar.f10437b = method;
                        aVar.f10436a = interfaceC6423t;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public void m11508j(InterfaceC6423t interfaceC6423t, Class<?> cls, Map<C6417n, a> map, Class<?> cls2) {
        if (this.f10453a == null) {
            return;
        }
        Iterator<Class<?>> it = C6490g.m11961w(cls2, cls, true).iterator();
        while (it.hasNext()) {
            for (Method method : it.next().getDeclaredMethods()) {
                if (m11505k(method)) {
                    C6417n c6417n = new C6417n(method);
                    a aVar = map.get(c6417n);
                    Annotation[] declaredAnnotations = method.getDeclaredAnnotations();
                    if (aVar == null) {
                        map.put(c6417n, new a(interfaceC6423t, null, m11557e(declaredAnnotations)));
                    } else {
                        aVar.f10438c = m11558f(aVar.f10438c, declaredAnnotations);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public C6411h m11509l(TypeFactory typeFactory, InterfaceC6423t interfaceC6423t, JavaType javaType, List<JavaType> list, Class<?> cls) {
        Class<?> clsFindMixInClassFor;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        m11507i(interfaceC6423t, javaType.getRawClass(), linkedHashMap, cls);
        for (JavaType javaType2 : list) {
            AbstractC6415l.a aVar = this.f10434d;
            m11507i(new InterfaceC6423t.a(typeFactory, javaType2.getBindings()), javaType2.getRawClass(), linkedHashMap, aVar == null ? null : aVar.findMixInClassFor(javaType2.getRawClass()));
        }
        AbstractC6415l.a aVar2 = this.f10434d;
        if (aVar2 != null && (clsFindMixInClassFor = aVar2.findMixInClassFor(Object.class)) != null) {
            m11508j(interfaceC6423t, javaType.getRawClass(), linkedHashMap, clsFindMixInClassFor);
            if (this.f10453a != null && !linkedHashMap.isEmpty()) {
                for (Map.Entry<C6417n, a> entry : linkedHashMap.entrySet()) {
                    C6417n key = entry.getKey();
                    if ("hashCode".equals(key.m11562b()) && key.m11561a() == 0) {
                        try {
                            Method declaredMethod = Object.class.getDeclaredMethod(key.m11562b(), new Class[0]);
                            if (declaredMethod != null) {
                                a value = entry.getValue();
                                value.f10438c = m11558f(value.f10438c, declaredMethod.getDeclaredAnnotations());
                                value.f10437b = declaredMethod;
                            }
                        } catch (Exception unused) {
                        }
                    }
                }
            }
        }
        if (linkedHashMap.isEmpty()) {
            return new C6411h();
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap.size());
        for (Map.Entry<C6417n, a> entry2 : linkedHashMap.entrySet()) {
            AnnotatedMethod annotatedMethodM11510a = entry2.getValue().m11510a();
            if (annotatedMethodM11510a != null) {
                linkedHashMap2.put(entry2.getKey(), annotatedMethodM11510a);
            }
        }
        return new C6411h(linkedHashMap2);
    }

    public C6410g(AnnotationIntrospector annotationIntrospector, AbstractC6415l.a aVar, boolean z11) {
        super(annotationIntrospector);
        this.f10434d = annotationIntrospector == null ? null : aVar;
        this.f10435e = z11;
    }

    /* JADX INFO: renamed from: k */
    public static boolean m11505k(Method method) {
        if (Modifier.isStatic(method.getModifiers()) || method.isSynthetic() || method.isBridge() || method.getParameterTypes().length > 2) {
            return false;
        }
        return true;
    }
}
