package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.AbstractC6340b;
import com.fasterxml.jackson.databind.AbstractC6393h;
import com.fasterxml.jackson.databind.AbstractC6446m;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.introspect.AbstractC6404a;
import com.fasterxml.jackson.databind.introspect.AbstractC6414k;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.jsontype.AbstractC6431e;
import com.fasterxml.jackson.databind.util.C6485b;
import com.fasterxml.jackson.databind.util.C6487d;
import com.fasterxml.jackson.databind.util.C6490g;
import com.fasterxml.jackson.databind.util.InterfaceC6484a;
import com.fasterxml.jackson.databind.util.NameTransformer;

/* JADX INFO: renamed from: com.fasterxml.jackson.databind.ser.f */
/* JADX INFO: compiled from: PropertyBuilder.java */
/* JADX INFO: loaded from: classes45.dex */
public class C6457f {

    /* JADX INFO: renamed from: g */
    public static final Object f10605g = Boolean.FALSE;

    /* JADX INFO: renamed from: a */
    public final SerializationConfig f10606a;

    /* JADX INFO: renamed from: b */
    public final AbstractC6340b f10607b;

    /* JADX INFO: renamed from: c */
    public final AnnotationIntrospector f10608c;

    /* JADX INFO: renamed from: d */
    public Object f10609d;

    /* JADX INFO: renamed from: e */
    public final JsonInclude.Value f10610e;

    /* JADX INFO: renamed from: f */
    public final boolean f10611f;

    /* JADX INFO: renamed from: com.fasterxml.jackson.databind.ser.f$a */
    /* JADX INFO: compiled from: PropertyBuilder.java */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f10612a;

        static {
            int[] iArr = new int[JsonInclude.Include.values().length];
            f10612a = iArr;
            try {
                iArr[JsonInclude.Include.NON_DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10612a[JsonInclude.Include.NON_ABSENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f10612a[JsonInclude.Include.NON_EMPTY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f10612a[JsonInclude.Include.CUSTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f10612a[JsonInclude.Include.NON_NULL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f10612a[JsonInclude.Include.ALWAYS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public BeanPropertyWriter m11770a(AbstractC6414k abstractC6414k, AnnotatedMember annotatedMember, InterfaceC6484a interfaceC6484a, JavaType javaType, AbstractC6393h<?> abstractC6393h, AbstractC6431e abstractC6431e, JavaType javaType2, boolean z11, Object obj, Class<?>[] clsArr) throws JsonMappingException {
        return new BeanPropertyWriter(abstractC6414k, annotatedMember, interfaceC6484a, javaType, abstractC6393h, abstractC6431e, javaType2, z11, obj, clsArr);
    }

    /* JADX INFO: renamed from: c */
    public BeanPropertyWriter m11772c(AbstractC6446m abstractC6446m, AbstractC6414k abstractC6414k, JavaType javaType, AbstractC6393h<?> abstractC6393h, AbstractC6431e abstractC6431e, AbstractC6431e abstractC6431e2, AnnotatedMember annotatedMember, boolean z11) throws JsonMappingException {
        Object objM11774e;
        boolean z12;
        boolean z13 = false;
        try {
            JavaType javaTypeM11773d = m11773d(annotatedMember, z11, javaType);
            if (abstractC6431e2 != null) {
                if (javaTypeM11773d == null) {
                    javaTypeM11773d = javaType;
                }
                if (javaTypeM11773d.getContentType() == null) {
                    abstractC6446m.reportBadPropertyDefinition(this.f10607b, abstractC6414k, "serialization type " + javaTypeM11773d + " has no content", new Object[0]);
                }
                javaTypeM11773d = javaTypeM11773d.withContentTypeHandler(abstractC6431e2);
                javaTypeM11773d.getContentType();
            }
            JavaType javaType2 = javaTypeM11773d;
            JavaType javaType3 = javaType2 == null ? javaType : javaType2;
            AnnotatedMember annotatedMemberM11535h = abstractC6414k.m11535h();
            if (annotatedMemberM11535h == null) {
                return (BeanPropertyWriter) abstractC6446m.reportBadPropertyDefinition(this.f10607b, abstractC6414k, "could not determine property type", new Object[0]);
            }
            JsonInclude.Value valueWithOverrides = this.f10606a.getDefaultInclusion(javaType3.getRawClass(), annotatedMemberM11535h.getRawType(), this.f10610e).withOverrides(abstractC6414k.mo11530c());
            JsonInclude.Include valueInclusion = valueWithOverrides.getValueInclusion();
            if (valueInclusion == JsonInclude.Include.USE_DEFAULTS) {
                valueInclusion = JsonInclude.Include.ALWAYS;
            }
            int i11 = a.f10612a[valueInclusion.ordinal()];
            boolean zIncludeFilterSuppressNulls = true;
            Object objM11895b = null;
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 3) {
                        objM11895b = BeanPropertyWriter.MARKER_FOR_EMPTY;
                    } else if (i11 != 4) {
                        z13 = i11 == 5;
                        SerializationFeature serializationFeature = SerializationFeature.WRITE_EMPTY_JSON_ARRAYS;
                        if (javaType3.isContainerType() && !this.f10606a.isEnabled(serializationFeature)) {
                            objM11895b = BeanPropertyWriter.MARKER_FOR_EMPTY;
                        }
                        z12 = z13;
                    } else {
                        objM11895b = abstractC6446m.includeFilterInstance(abstractC6414k, valueWithOverrides.getValueFilter());
                        if (objM11895b != null) {
                            zIncludeFilterSuppressNulls = abstractC6446m.includeFilterSuppressNulls(objM11895b);
                        }
                    }
                } else if (javaType3.isReferenceType()) {
                    objM11895b = BeanPropertyWriter.MARKER_FOR_EMPTY;
                }
                z12 = zIncludeFilterSuppressNulls;
            } else {
                if (!this.f10611f || (objM11774e = m11774e()) == null) {
                    objM11895b = C6487d.m11895b(javaType3);
                    z13 = true;
                } else {
                    if (abstractC6446m.isEnabled(MapperFeature.CAN_OVERRIDE_ACCESS_MODIFIERS)) {
                        annotatedMember.fixAccess(this.f10606a.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
                    }
                    try {
                        objM11895b = annotatedMember.getValue(objM11774e);
                    } catch (Exception e11) {
                        m11771b(e11, abstractC6414k.getName(), objM11774e);
                    }
                }
                if (objM11895b == null) {
                    z12 = zIncludeFilterSuppressNulls;
                } else {
                    if (objM11895b.getClass().isArray()) {
                        objM11895b = C6485b.m11877b(objM11895b);
                    }
                    z12 = z13;
                }
            }
            Object obj = objM11895b;
            Class<?>[] clsArrMo11534g = abstractC6414k.mo11534g();
            if (clsArrMo11534g == null) {
                clsArrMo11534g = this.f10607b.mo11159e();
            }
            BeanPropertyWriter beanPropertyWriterM11770a = m11770a(abstractC6414k, annotatedMember, this.f10607b.mo11173s(), javaType, abstractC6393h, abstractC6431e, javaType2, z12, obj, clsArrMo11534g);
            Object objFindNullSerializer = this.f10608c.findNullSerializer(annotatedMember);
            if (objFindNullSerializer != null) {
                beanPropertyWriterM11770a.assignNullSerializer(abstractC6446m.serializerInstance(annotatedMember, objFindNullSerializer));
            }
            NameTransformer nameTransformerFindUnwrappingNameTransformer = this.f10608c.findUnwrappingNameTransformer(annotatedMember);
            return nameTransformerFindUnwrappingNameTransformer != null ? beanPropertyWriterM11770a.unwrappingWriter(nameTransformerFindUnwrappingNameTransformer) : beanPropertyWriterM11770a;
        } catch (JsonMappingException e12) {
            return abstractC6414k == null ? (BeanPropertyWriter) abstractC6446m.reportBadDefinition(javaType, C6490g.m11952o(e12)) : (BeanPropertyWriter) abstractC6446m.reportBadPropertyDefinition(this.f10607b, abstractC6414k, C6490g.m11952o(e12), new Object[0]);
        }
    }

    /* JADX INFO: renamed from: d */
    public JavaType m11773d(AbstractC6404a abstractC6404a, boolean z11, JavaType javaType) throws JsonMappingException {
        JavaType javaTypeRefineSerializationType = this.f10608c.refineSerializationType(this.f10606a, abstractC6404a, javaType);
        if (javaTypeRefineSerializationType != javaType) {
            Class<?> rawClass = javaTypeRefineSerializationType.getRawClass();
            Class<?> rawClass2 = javaType.getRawClass();
            if (!rawClass.isAssignableFrom(rawClass2) && !rawClass2.isAssignableFrom(rawClass)) {
                throw new IllegalArgumentException("Illegal concrete-type annotation for method '" + abstractC6404a.getName() + "': class " + rawClass.getName() + " not a super-type of (declared) class " + rawClass2.getName());
            }
            javaType = javaTypeRefineSerializationType;
            z11 = true;
        }
        JsonSerialize.Typing typingFindSerializationTyping = this.f10608c.findSerializationTyping(abstractC6404a);
        if (typingFindSerializationTyping != null && typingFindSerializationTyping != JsonSerialize.Typing.DEFAULT_TYPING) {
            z11 = typingFindSerializationTyping == JsonSerialize.Typing.STATIC;
        }
        if (z11) {
            return javaType.withStaticTyping();
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public Object m11774e() {
        Object objMo11153C = this.f10609d;
        if (objMo11153C == null) {
            objMo11153C = this.f10607b.mo11153C(this.f10606a.canOverrideAccessModifiers());
            if (objMo11153C == null) {
                objMo11153C = f10605g;
            }
            this.f10609d = objMo11153C;
        }
        if (objMo11153C == f10605g) {
            return null;
        }
        return this.f10609d;
    }

    public C6457f(SerializationConfig serializationConfig, AbstractC6340b abstractC6340b) {
        boolean z11;
        this.f10606a = serializationConfig;
        this.f10607b = abstractC6340b;
        JsonInclude.Value valueMerge = JsonInclude.Value.merge(abstractC6340b.mo11170p(JsonInclude.Value.empty()), serializationConfig.getDefaultPropertyInclusion(abstractC6340b.m11172r(), JsonInclude.Value.empty()));
        this.f10610e = JsonInclude.Value.merge(serializationConfig.getDefaultPropertyInclusion(), valueMerge);
        if (valueMerge.getValueInclusion() == JsonInclude.Include.NON_DEFAULT) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f10611f = z11;
        this.f10608c = serializationConfig.getAnnotationIntrospector();
    }

    /* JADX INFO: renamed from: b */
    public Object m11771b(Exception exc, String str, Object obj) {
        Throwable cause = exc;
        while (cause.getCause() != null) {
            cause = cause.getCause();
        }
        C6490g.m11939h0(cause);
        C6490g.m11943j0(cause);
        throw new IllegalArgumentException("Failed to get property '" + str + "' of default " + obj.getClass().getName() + " instance");
    }
}
