package com.fasterxml.jackson.databind.util;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.introspect.AbstractC6414k;
import com.fasterxml.jackson.databind.introspect.AnnotatedField;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;
import com.fasterxml.jackson.databind.type.TypeFactory;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: renamed from: com.fasterxml.jackson.databind.util.o */
/* JADX INFO: compiled from: SimpleBeanPropertyDefinition.java */
/* JADX INFO: loaded from: classes45.dex */
public class C6498o extends AbstractC6414k {

    /* JADX INFO: renamed from: c */
    public final AnnotationIntrospector f10751c;

    /* JADX INFO: renamed from: d */
    public final AnnotatedMember f10752d;

    /* JADX INFO: renamed from: e */
    public final PropertyMetadata f10753e;

    /* JADX INFO: renamed from: f */
    public final PropertyName f10754f;

    /* JADX INFO: renamed from: g */
    public final JsonInclude.Value f10755g;

    /* JADX INFO: renamed from: z */
    public static C6498o m12001z(MapperConfig<?> mapperConfig, AnnotatedMember annotatedMember, PropertyName propertyName) {
        return m12000C(mapperConfig, annotatedMember, propertyName, null, AbstractC6414k.f10450b);
    }

    @Override // com.fasterxml.jackson.databind.introspect.AbstractC6414k
    /* JADX INFO: renamed from: w */
    public boolean mo11550w() {
        return false;
    }

    @Override // com.fasterxml.jackson.databind.introspect.AbstractC6414k
    /* JADX INFO: renamed from: x */
    public boolean mo11551x() {
        return false;
    }

    /* JADX INFO: renamed from: A */
    public static C6498o m11999A(MapperConfig<?> mapperConfig, AnnotatedMember annotatedMember, PropertyName propertyName, PropertyMetadata propertyMetadata, JsonInclude.Include include) {
        return new C6498o(mapperConfig.getAnnotationIntrospector(), annotatedMember, propertyName, propertyMetadata, (include == null || include == JsonInclude.Include.USE_DEFAULTS) ? AbstractC6414k.f10450b : JsonInclude.Value.construct(include, null));
    }

    /* JADX INFO: renamed from: C */
    public static C6498o m12000C(MapperConfig<?> mapperConfig, AnnotatedMember annotatedMember, PropertyName propertyName, PropertyMetadata propertyMetadata, JsonInclude.Value value) {
        return new C6498o(mapperConfig.getAnnotationIntrospector(), annotatedMember, propertyName, propertyMetadata, value);
    }

    @Override // com.fasterxml.jackson.databind.introspect.AbstractC6414k
    /* JADX INFO: renamed from: c */
    public JsonInclude.Value mo11530c() {
        return this.f10755g;
    }

    @Override // com.fasterxml.jackson.databind.introspect.AbstractC6414k
    public PropertyName getFullName() {
        return this.f10754f;
    }

    @Override // com.fasterxml.jackson.databind.introspect.AbstractC6414k
    public PropertyMetadata getMetadata() {
        return this.f10753e;
    }

    @Override // com.fasterxml.jackson.databind.introspect.AbstractC6414k, com.fasterxml.jackson.databind.util.InterfaceC6494k
    public String getName() {
        return this.f10754f.getSimpleName();
    }

    @Override // com.fasterxml.jackson.databind.introspect.AbstractC6414k
    public PropertyName getWrapperName() {
        AnnotatedMember annotatedMember;
        AnnotationIntrospector annotationIntrospector = this.f10751c;
        if (annotationIntrospector == null || (annotatedMember = this.f10752d) == null) {
            return null;
        }
        return annotationIntrospector.findWrapperName(annotatedMember);
    }

    @Override // com.fasterxml.jackson.databind.introspect.AbstractC6414k
    /* JADX INFO: renamed from: i */
    public AnnotatedParameter mo11536i() {
        AnnotatedMember annotatedMember = this.f10752d;
        if (annotatedMember instanceof AnnotatedParameter) {
            return (AnnotatedParameter) annotatedMember;
        }
        return null;
    }

    @Override // com.fasterxml.jackson.databind.introspect.AbstractC6414k
    /* JADX INFO: renamed from: k */
    public AnnotatedField mo11538k() {
        AnnotatedMember annotatedMember = this.f10752d;
        if (annotatedMember instanceof AnnotatedField) {
            return (AnnotatedField) annotatedMember;
        }
        return null;
    }

    @Override // com.fasterxml.jackson.databind.introspect.AbstractC6414k
    /* JADX INFO: renamed from: l */
    public AnnotatedMethod mo11539l() {
        AnnotatedMember annotatedMember = this.f10752d;
        if ((annotatedMember instanceof AnnotatedMethod) && ((AnnotatedMethod) annotatedMember).getParameterCount() == 0) {
            return (AnnotatedMethod) this.f10752d;
        }
        return null;
    }

    @Override // com.fasterxml.jackson.databind.introspect.AbstractC6414k
    /* JADX INFO: renamed from: o */
    public AnnotatedMember mo11542o() {
        return this.f10752d;
    }

    @Override // com.fasterxml.jackson.databind.introspect.AbstractC6414k
    /* JADX INFO: renamed from: p */
    public JavaType mo11543p() {
        AnnotatedMember annotatedMember = this.f10752d;
        return annotatedMember == null ? TypeFactory.unknownType() : annotatedMember.getType();
    }

    @Override // com.fasterxml.jackson.databind.introspect.AbstractC6414k
    /* JADX INFO: renamed from: q */
    public Class<?> mo11544q() {
        AnnotatedMember annotatedMember = this.f10752d;
        return annotatedMember == null ? Object.class : annotatedMember.getRawType();
    }

    @Override // com.fasterxml.jackson.databind.introspect.AbstractC6414k
    /* JADX INFO: renamed from: r */
    public AnnotatedMethod mo11545r() {
        AnnotatedMember annotatedMember = this.f10752d;
        if ((annotatedMember instanceof AnnotatedMethod) && ((AnnotatedMethod) annotatedMember).getParameterCount() == 1) {
            return (AnnotatedMethod) this.f10752d;
        }
        return null;
    }

    @Override // com.fasterxml.jackson.databind.introspect.AbstractC6414k
    /* JADX INFO: renamed from: s */
    public boolean mo11546s() {
        return this.f10752d instanceof AnnotatedParameter;
    }

    @Override // com.fasterxml.jackson.databind.introspect.AbstractC6414k
    /* JADX INFO: renamed from: t */
    public boolean mo11547t() {
        return this.f10752d instanceof AnnotatedField;
    }

    @Override // com.fasterxml.jackson.databind.introspect.AbstractC6414k
    /* JADX INFO: renamed from: u */
    public boolean mo11548u(PropertyName propertyName) {
        return this.f10754f.equals(propertyName);
    }

    public C6498o(AnnotationIntrospector annotationIntrospector, AnnotatedMember annotatedMember, PropertyName propertyName, PropertyMetadata propertyMetadata, JsonInclude.Value value) {
        this.f10751c = annotationIntrospector;
        this.f10752d = annotatedMember;
        this.f10754f = propertyName;
        this.f10753e = propertyMetadata == null ? PropertyMetadata.STD_OPTIONAL : propertyMetadata;
        this.f10755g = value;
    }

    @Override // com.fasterxml.jackson.databind.introspect.AbstractC6414k
    /* JADX INFO: renamed from: j */
    public Iterator<AnnotatedParameter> mo11537j() {
        AnnotatedParameter annotatedParameterMo11536i = mo11536i();
        if (annotatedParameterMo11536i == null) {
            return C6490g.m11950n();
        }
        return Collections.singleton(annotatedParameterMo11536i).iterator();
    }

    @Override // com.fasterxml.jackson.databind.introspect.AbstractC6414k
    /* JADX INFO: renamed from: v */
    public boolean mo11549v() {
        if (mo11545r() != null) {
            return true;
        }
        return false;
    }
}
