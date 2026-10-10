package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.C6490g;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.fasterxml.jackson.databind.introspect.e */
/* JADX INFO: compiled from: AnnotatedCreatorCollector.java */
/* JADX INFO: loaded from: classes45.dex */
public final class C6408e extends C6416m {

    /* JADX INFO: renamed from: d */
    public final InterfaceC6423t f10425d;

    /* JADX INFO: renamed from: e */
    public final boolean f10426e;

    /* JADX INFO: renamed from: f */
    public AnnotatedConstructor f10427f;

    /* JADX INFO: renamed from: p */
    public static C6406c.a m11488p(AnnotationIntrospector annotationIntrospector, TypeFactory typeFactory, InterfaceC6423t interfaceC6423t, JavaType javaType, Class<?> cls, boolean z11) {
        return new C6408e(annotationIntrospector, interfaceC6423t, z11 | (cls != null)).m11492l(typeFactory, javaType, cls);
    }

    /* JADX INFO: renamed from: m */
    public final C6412i m11493m(C6490g.a aVar, C6490g.a aVar2) {
        if (!this.f10426e) {
            return C6416m.m11553a();
        }
        AnnotationCollector annotationCollectorM11557e = m11557e(aVar.m11966b());
        if (aVar2 != null) {
            annotationCollectorM11557e = m11556d(annotationCollectorM11557e, aVar2.m11966b());
        }
        return annotationCollectorM11557e.mo11440b();
    }

    /* JADX INFO: renamed from: o */
    public final C6412i[] m11495o(Annotation[][] annotationArr, Annotation[][] annotationArr2) {
        if (!this.f10426e) {
            return C6416m.f10451b;
        }
        int length = annotationArr.length;
        C6412i[] c6412iArr = new C6412i[length];
        for (int i11 = 0; i11 < length; i11++) {
            AnnotationCollector annotationCollectorM11556d = m11556d(AnnotationCollector.m11438e(), annotationArr[i11]);
            if (annotationArr2 != null) {
                annotationCollectorM11556d = m11556d(annotationCollectorM11556d, annotationArr2[i11]);
            }
            c6412iArr[i11] = annotationCollectorM11556d.mo11440b();
        }
        return c6412iArr;
    }

    /* JADX INFO: renamed from: q */
    public AnnotatedConstructor m11496q(C6490g.a aVar, C6490g.a aVar2) {
        return new AnnotatedConstructor(this.f10425d, aVar.m11965a(), m11493m(aVar, aVar2), C6416m.f10451b);
    }

    public C6408e(AnnotationIntrospector annotationIntrospector, InterfaceC6423t interfaceC6423t, boolean z11) {
        super(annotationIntrospector);
        this.f10425d = interfaceC6423t;
        this.f10426e = z11;
    }

    /* JADX INFO: renamed from: k */
    public static boolean m11487k(Method method) {
        if (Modifier.isStatic(method.getModifiers()) && !method.isSynthetic()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: t */
    public static boolean m11489t(Constructor<?> constructor) {
        return !constructor.isSynthetic();
    }

    /* JADX INFO: renamed from: i */
    public final List<AnnotatedConstructor> m11490i(JavaType javaType, Class<?> cls) {
        C6490g.a aVar;
        ArrayList arrayList;
        int i11;
        List<AnnotatedConstructor> list;
        if (!javaType.isEnumType()) {
            aVar = null;
            arrayList = null;
            for (C6490g.a aVar2 : C6490g.m11898A(javaType.getRawClass())) {
                if (m11489t(aVar2.m11965a())) {
                    if (aVar2.m11968d() == 0) {
                        aVar = aVar2;
                    } else {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(aVar2);
                    }
                }
            }
        } else {
            aVar = null;
            arrayList = null;
        }
        if (arrayList == null) {
            list = Collections.EMPTY_LIST;
            if (aVar == null) {
                return list;
            }
            i11 = 0;
        } else {
            int size = arrayList.size();
            ArrayList arrayList2 = new ArrayList(size);
            for (int i12 = 0; i12 < size; i12++) {
                arrayList2.add(null);
            }
            i11 = size;
            list = arrayList2;
        }
        if (cls != null) {
            C6417n[] c6417nArr = null;
            for (C6490g.a aVar3 : C6490g.m11898A(cls)) {
                if (aVar3.m11968d() == 0) {
                    if (aVar != null) {
                        this.f10427f = m11496q(aVar, aVar3);
                        aVar = null;
                    }
                } else if (arrayList != null) {
                    if (c6417nArr == null) {
                        c6417nArr = new C6417n[i11];
                        for (int i13 = 0; i13 < i11; i13++) {
                            c6417nArr[i13] = new C6417n(((C6490g.a) arrayList.get(i13)).m11965a());
                        }
                    }
                    C6417n c6417n = new C6417n(aVar3.m11965a());
                    for (int i14 = 0; i14 < i11; i14++) {
                        if (c6417n.equals(c6417nArr[i14])) {
                            list.set(i14, m11498s((C6490g.a) arrayList.get(i14), aVar3));
                            break;
                        }
                    }
                }
            }
        }
        if (aVar != null) {
            this.f10427f = m11496q(aVar, null);
        }
        for (int i15 = 0; i15 < i11; i15++) {
            if (list.get(i15) == null) {
                list.set(i15, m11498s((C6490g.a) arrayList.get(i15), null));
            }
        }
        return list;
    }

    /* JADX INFO: renamed from: j */
    public final List<AnnotatedMethod> m11491j(TypeFactory typeFactory, JavaType javaType, Class<?> cls) {
        ArrayList arrayList = null;
        for (Method method : C6490g.m11964z(javaType.getRawClass())) {
            if (m11487k(method)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(method);
            }
        }
        if (arrayList == null) {
            return Collections.EMPTY_LIST;
        }
        InterfaceC6423t interfaceC6423t = this.f10425d;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i11 = 0; i11 < size; i11++) {
            arrayList2.add(null);
        }
        if (cls != null) {
            C6417n[] c6417nArr = null;
            for (Method method2 : cls.getDeclaredMethods()) {
                if (m11487k(method2)) {
                    if (c6417nArr == null) {
                        c6417nArr = new C6417n[size];
                        for (int i12 = 0; i12 < size; i12++) {
                            c6417nArr[i12] = new C6417n((Method) arrayList.get(i12));
                        }
                    }
                    C6417n c6417n = new C6417n(method2);
                    for (int i13 = 0; i13 < size; i13++) {
                        if (c6417n.equals(c6417nArr[i13])) {
                            arrayList2.set(i13, m11497r((Method) arrayList.get(i13), interfaceC6423t, method2));
                            break;
                        }
                    }
                }
            }
        }
        for (int i14 = 0; i14 < size; i14++) {
            if (((AnnotatedMethod) arrayList2.get(i14)) == null) {
                Method method3 = (Method) arrayList.get(i14);
                arrayList2.set(i14, m11497r(method3, C6418o.m11567e(method3, javaType, typeFactory, interfaceC6423t), null));
            }
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: l */
    public C6406c.a m11492l(TypeFactory typeFactory, JavaType javaType, Class<?> cls) {
        List<AnnotatedConstructor> listM11490i = m11490i(javaType, cls);
        List<AnnotatedMethod> listM11491j = m11491j(typeFactory, javaType, cls);
        if (this.f10426e) {
            AnnotatedConstructor annotatedConstructor = this.f10427f;
            if (annotatedConstructor != null && this.f10453a.hasIgnoreMarker(annotatedConstructor)) {
                this.f10427f = null;
            }
            int size = listM11490i.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                if (this.f10453a.hasIgnoreMarker(listM11490i.get(size))) {
                    listM11490i.remove(size);
                }
            }
            int size2 = listM11491j.size();
            while (true) {
                size2--;
                if (size2 < 0) {
                    break;
                }
                if (this.f10453a.hasIgnoreMarker(listM11491j.get(size2))) {
                    listM11491j.remove(size2);
                }
            }
        }
        return new C6406c.a(this.f10427f, listM11490i, listM11491j);
    }

    /* JADX INFO: renamed from: n */
    public final C6412i m11494n(AnnotatedElement annotatedElement, AnnotatedElement annotatedElement2) {
        AnnotationCollector annotationCollectorM11557e = m11557e(annotatedElement.getDeclaredAnnotations());
        if (annotatedElement2 != null) {
            annotationCollectorM11557e = m11556d(annotationCollectorM11557e, annotatedElement2.getDeclaredAnnotations());
        }
        return annotationCollectorM11557e.mo11440b();
    }

    /* JADX INFO: renamed from: r */
    public AnnotatedMethod m11497r(Method method, InterfaceC6423t interfaceC6423t, Method method2) {
        Annotation[][] parameterAnnotations;
        int length = method.getParameterTypes().length;
        if (this.f10453a == null) {
            return new AnnotatedMethod(interfaceC6423t, method, C6416m.m11553a(), C6416m.m11554b(length));
        }
        if (length == 0) {
            return new AnnotatedMethod(interfaceC6423t, method, m11494n(method, method2), C6416m.f10451b);
        }
        C6412i c6412iM11494n = m11494n(method, method2);
        Annotation[][] parameterAnnotations2 = method.getParameterAnnotations();
        if (method2 == null) {
            parameterAnnotations = null;
        } else {
            parameterAnnotations = method2.getParameterAnnotations();
        }
        return new AnnotatedMethod(interfaceC6423t, method, c6412iM11494n, m11495o(parameterAnnotations2, parameterAnnotations));
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0075  */
    /* JADX INFO: renamed from: s */
    public AnnotatedConstructor m11498s(C6490g.a aVar, C6490g.a aVar2) {
        Annotation[][] annotationArr;
        int iM11968d = aVar.m11968d();
        if (this.f10453a == null) {
            return new AnnotatedConstructor(this.f10425d, aVar.m11965a(), C6416m.m11553a(), C6416m.m11554b(iM11968d));
        }
        if (iM11968d == 0) {
            return new AnnotatedConstructor(this.f10425d, aVar.m11965a(), m11493m(aVar, aVar2), C6416m.f10451b);
        }
        Annotation[][] annotationArrM11969e = aVar.m11969e();
        Annotation[][] annotationArrM11969e2 = null;
        c6412iArrM11495o = null;
        C6412i[] c6412iArrM11495o = null;
        if (iM11968d != annotationArrM11969e.length) {
            Class<?> clsM11967c = aVar.m11967c();
            if (C6490g.m11909L(clsM11967c) && iM11968d == annotationArrM11969e.length + 2) {
                annotationArr = new Annotation[annotationArrM11969e.length + 2][];
                System.arraycopy(annotationArrM11969e, 0, annotationArr, 2, annotationArrM11969e.length);
                c6412iArrM11495o = m11495o(annotationArr, null);
            } else {
                if (clsM11967c.isMemberClass() && iM11968d == annotationArrM11969e.length + 1) {
                    annotationArr = new Annotation[annotationArrM11969e.length + 1][];
                    System.arraycopy(annotationArrM11969e, 0, annotationArr, 1, annotationArrM11969e.length);
                    annotationArr[0] = C6416m.f10452c;
                    c6412iArrM11495o = m11495o(annotationArr, null);
                }
                if (c6412iArrM11495o == null) {
                    throw new IllegalStateException(String.format("Internal error: constructor for %s has mismatch: %d parameters; %d sets of annotations", aVar.m11967c().getName(), Integer.valueOf(iM11968d), Integer.valueOf(annotationArrM11969e.length)));
                }
            }
            annotationArrM11969e = annotationArr;
            if (c6412iArrM11495o == null) {
                throw new IllegalStateException(String.format("Internal error: constructor for %s has mismatch: %d parameters; %d sets of annotations", aVar.m11967c().getName(), Integer.valueOf(iM11968d), Integer.valueOf(annotationArrM11969e.length)));
            }
        } else {
            if (aVar2 != null) {
                annotationArrM11969e2 = aVar2.m11969e();
            }
            c6412iArrM11495o = m11495o(annotationArrM11969e, annotationArrM11969e2);
        }
        return new AnnotatedConstructor(this.f10425d, aVar.m11965a(), m11493m(aVar, aVar2), c6412iArrM11495o);
    }
}
