package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.util.C6490g;
import com.fasterxml.jackson.databind.util.InterfaceC6494k;
import java.util.Iterator;

/* JADX INFO: renamed from: com.fasterxml.jackson.databind.introspect.k */
/* JADX INFO: compiled from: BeanPropertyDefinition.java */
/* JADX INFO: loaded from: classes45.dex */
public abstract class AbstractC6414k implements InterfaceC6494k {

    /* JADX INFO: renamed from: b */
    public static final JsonInclude.Value f10450b = JsonInclude.Value.empty();

    /* JADX INFO: renamed from: c */
    public abstract JsonInclude.Value mo11530c();

    /* JADX INFO: renamed from: d */
    public C6419p mo11531d() {
        return null;
    }

    /* JADX INFO: renamed from: f */
    public AnnotationIntrospector.ReferenceProperty mo11533f() {
        return null;
    }

    /* JADX INFO: renamed from: g */
    public Class<?>[] mo11534g() {
        return null;
    }

    public abstract PropertyName getFullName();

    public abstract PropertyMetadata getMetadata();

    @Override // com.fasterxml.jackson.databind.util.InterfaceC6494k
    public abstract String getName();

    public abstract PropertyName getWrapperName();

    /* JADX INFO: renamed from: i */
    public abstract AnnotatedParameter mo11536i();

    /* JADX INFO: renamed from: k */
    public abstract AnnotatedField mo11538k();

    /* JADX INFO: renamed from: l */
    public abstract AnnotatedMethod mo11539l();

    /* JADX INFO: renamed from: o */
    public abstract AnnotatedMember mo11542o();

    /* JADX INFO: renamed from: p */
    public abstract JavaType mo11543p();

    /* JADX INFO: renamed from: q */
    public abstract Class<?> mo11544q();

    /* JADX INFO: renamed from: r */
    public abstract AnnotatedMethod mo11545r();

    /* JADX INFO: renamed from: s */
    public abstract boolean mo11546s();

    /* JADX INFO: renamed from: t */
    public abstract boolean mo11547t();

    /* JADX INFO: renamed from: v */
    public abstract boolean mo11549v();

    /* JADX INFO: renamed from: w */
    public abstract boolean mo11550w();

    /* JADX INFO: renamed from: y */
    public boolean mo11552y() {
        return false;
    }

    /* JADX INFO: renamed from: a */
    public boolean mo11528a() {
        if (m11540m() != null) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public boolean mo11529b() {
        if (m11535h() != null) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    public String m11532e() {
        AnnotationIntrospector.ReferenceProperty referencePropertyMo11533f = mo11533f();
        if (referencePropertyMo11533f == null) {
            return null;
        }
        return referencePropertyMo11533f.m11128b();
    }

    /* JADX INFO: renamed from: h */
    public AnnotatedMember m11535h() {
        AnnotatedMethod annotatedMethodMo11539l = mo11539l();
        if (annotatedMethodMo11539l == null) {
            return mo11538k();
        }
        return annotatedMethodMo11539l;
    }

    /* JADX INFO: renamed from: j */
    public Iterator<AnnotatedParameter> mo11537j() {
        return C6490g.m11950n();
    }

    /* JADX INFO: renamed from: m */
    public AnnotatedMember m11540m() {
        AnnotatedParameter annotatedParameterMo11536i = mo11536i();
        if (annotatedParameterMo11536i == null) {
            AnnotatedMethod annotatedMethodMo11545r = mo11545r();
            if (annotatedMethodMo11545r == null) {
                return mo11538k();
            }
            return annotatedMethodMo11545r;
        }
        return annotatedParameterMo11536i;
    }

    /* JADX INFO: renamed from: n */
    public AnnotatedMember m11541n() {
        AnnotatedMethod annotatedMethodMo11545r = mo11545r();
        if (annotatedMethodMo11545r == null) {
            return mo11538k();
        }
        return annotatedMethodMo11545r;
    }

    /* JADX INFO: renamed from: u */
    public boolean mo11548u(PropertyName propertyName) {
        return getFullName().equals(propertyName);
    }

    /* JADX INFO: renamed from: x */
    public boolean mo11551x() {
        return mo11550w();
    }
}
