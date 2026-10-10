package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.C6490g;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.fasterxml.jackson.databind.introspect.f */
/* JADX INFO: compiled from: AnnotatedFieldCollector.java */
/* JADX INFO: loaded from: classes45.dex */
public class C6409f extends C6416m {

    /* JADX INFO: renamed from: d */
    public final TypeFactory f10428d;

    /* JADX INFO: renamed from: e */
    public final AbstractC6415l.a f10429e;

    /* JADX INFO: renamed from: f */
    public final boolean f10430f;

    /* JADX INFO: renamed from: com.fasterxml.jackson.databind.introspect.f$a */
    /* JADX INFO: compiled from: AnnotatedFieldCollector.java */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final InterfaceC6423t f10431a;

        /* JADX INFO: renamed from: b */
        public final Field f10432b;

        /* JADX INFO: renamed from: c */
        public AnnotationCollector f10433c = AnnotationCollector.m11438e();

        /* JADX INFO: renamed from: a */
        public AnnotatedField m11504a() {
            return new AnnotatedField(this.f10431a, this.f10432b, this.f10433c.mo11440b());
        }

        public a(InterfaceC6423t interfaceC6423t, Field field) {
            this.f10431a = interfaceC6423t;
            this.f10432b = field;
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m11500i(Class<?> cls, Class<?> cls2, Map<String, a> map) {
        a aVar;
        Iterator<Class<?>> it = C6490g.m11962x(cls, cls2, true).iterator();
        while (it.hasNext()) {
            for (Field field : it.next().getDeclaredFields()) {
                if (m11502k(field) && (aVar = map.get(field.getName())) != null) {
                    aVar.f10433c = m11556d(aVar.f10433c, field.getDeclaredAnnotations());
                }
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public List<AnnotatedField> m11503l(InterfaceC6423t interfaceC6423t, JavaType javaType) {
        Map<String, a> mapM11501j = m11501j(interfaceC6423t, javaType, null);
        if (mapM11501j == null) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(mapM11501j.size());
        Iterator<a> it = mapM11501j.values().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().m11504a());
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: m */
    public static List<AnnotatedField> m11499m(AnnotationIntrospector annotationIntrospector, InterfaceC6423t interfaceC6423t, AbstractC6415l.a aVar, TypeFactory typeFactory, JavaType javaType, boolean z11) {
        return new C6409f(annotationIntrospector, typeFactory, aVar, z11).m11503l(interfaceC6423t, javaType);
    }

    public C6409f(AnnotationIntrospector annotationIntrospector, TypeFactory typeFactory, AbstractC6415l.a aVar, boolean z11) {
        super(annotationIntrospector);
        this.f10428d = typeFactory;
        this.f10429e = annotationIntrospector == null ? null : aVar;
        this.f10430f = z11;
    }

    /* JADX INFO: renamed from: j */
    public final Map<String, a> m11501j(InterfaceC6423t interfaceC6423t, JavaType javaType, Map<String, a> map) {
        AbstractC6415l.a aVar;
        Class<?> clsFindMixInClassFor;
        JavaType superClass = javaType.getSuperClass();
        if (superClass == null) {
            return map;
        }
        Class<?> rawClass = javaType.getRawClass();
        Map<String, a> mapM11501j = m11501j(new InterfaceC6423t.a(this.f10428d, superClass.getBindings()), superClass, map);
        for (Field field : rawClass.getDeclaredFields()) {
            if (m11502k(field)) {
                if (mapM11501j == null) {
                    mapM11501j = new LinkedHashMap<>();
                }
                a aVar2 = new a(interfaceC6423t, field);
                if (this.f10430f) {
                    aVar2.f10433c = m11556d(aVar2.f10433c, field.getDeclaredAnnotations());
                }
                mapM11501j.put(field.getName(), aVar2);
            }
        }
        if (mapM11501j != null && (aVar = this.f10429e) != null && (clsFindMixInClassFor = aVar.findMixInClassFor(rawClass)) != null) {
            m11500i(clsFindMixInClassFor, rawClass, mapM11501j);
        }
        return mapM11501j;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m11502k(Field field) {
        if (field.isSynthetic() || Modifier.isStatic(field.getModifiers())) {
            return false;
        }
        return true;
    }
}
