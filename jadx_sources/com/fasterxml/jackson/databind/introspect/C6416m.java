package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.util.C6490g;
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/* JADX INFO: renamed from: com.fasterxml.jackson.databind.introspect.m */
/* JADX INFO: compiled from: CollectorBase.java */
/* JADX INFO: loaded from: classes45.dex */
public class C6416m {

    /* JADX INFO: renamed from: b */
    public static final C6412i[] f10451b = new C6412i[0];

    /* JADX INFO: renamed from: c */
    public static final Annotation[] f10452c = new Annotation[0];

    /* JADX INFO: renamed from: a */
    public final AnnotationIntrospector f10453a;

    /* JADX INFO: renamed from: d */
    public final AnnotationCollector m11556d(AnnotationCollector annotationCollector, Annotation[] annotationArr) {
        for (Annotation annotation : annotationArr) {
            annotationCollector = annotationCollector.mo11439a(annotation);
            if (this.f10453a.isAnnotationBundle(annotation)) {
                annotationCollector = m11560h(annotationCollector, annotation);
            }
        }
        return annotationCollector;
    }

    /* JADX INFO: renamed from: f */
    public final AnnotationCollector m11558f(AnnotationCollector annotationCollector, Annotation[] annotationArr) {
        for (Annotation annotation : annotationArr) {
            if (!annotationCollector.mo11442f(annotation)) {
                annotationCollector = annotationCollector.mo11439a(annotation);
                if (this.f10453a.isAnnotationBundle(annotation)) {
                    annotationCollector = m11559g(annotationCollector, annotation);
                }
            }
        }
        return annotationCollector;
    }

    /* JADX INFO: renamed from: a */
    public static C6412i m11553a() {
        return new C6412i();
    }

    /* JADX INFO: renamed from: b */
    public static C6412i[] m11554b(int i11) {
        if (i11 == 0) {
            return f10451b;
        }
        C6412i[] c6412iArr = new C6412i[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            c6412iArr[i12] = m11553a();
        }
        return c6412iArr;
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m11555c(Annotation annotation) {
        return (annotation instanceof Target) || (annotation instanceof Retention);
    }

    public C6416m(AnnotationIntrospector annotationIntrospector) {
        this.f10453a = annotationIntrospector;
    }

    /* JADX INFO: renamed from: e */
    public final AnnotationCollector m11557e(Annotation[] annotationArr) {
        AnnotationCollector annotationCollectorM11438e = AnnotationCollector.m11438e();
        for (Annotation annotation : annotationArr) {
            annotationCollectorM11438e = annotationCollectorM11438e.mo11439a(annotation);
            if (this.f10453a.isAnnotationBundle(annotation)) {
                annotationCollectorM11438e = m11560h(annotationCollectorM11438e, annotation);
            }
        }
        return annotationCollectorM11438e;
    }

    /* JADX INFO: renamed from: g */
    public final AnnotationCollector m11559g(AnnotationCollector annotationCollector, Annotation annotation) {
        for (Annotation annotation2 : C6490g.m11954p(annotation.annotationType())) {
            if (!m11555c(annotation2) && !annotationCollector.mo11442f(annotation2)) {
                annotationCollector = annotationCollector.mo11439a(annotation2);
                if (this.f10453a.isAnnotationBundle(annotation2)) {
                    annotationCollector = m11560h(annotationCollector, annotation2);
                }
            }
        }
        return annotationCollector;
    }

    /* JADX INFO: renamed from: h */
    public final AnnotationCollector m11560h(AnnotationCollector annotationCollector, Annotation annotation) {
        for (Annotation annotation2 : C6490g.m11954p(annotation.annotationType())) {
            if (!m11555c(annotation2)) {
                if (this.f10453a.isAnnotationBundle(annotation2)) {
                    if (!annotationCollector.mo11442f(annotation2)) {
                        annotationCollector = m11560h(annotationCollector.mo11439a(annotation2), annotation2);
                    }
                } else {
                    annotationCollector = annotationCollector.mo11439a(annotation2);
                }
            }
        }
        return annotationCollector;
    }
}
