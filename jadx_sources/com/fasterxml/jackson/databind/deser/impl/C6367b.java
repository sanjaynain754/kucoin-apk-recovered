package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.databind.AbstractC6340b;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.deser.std.StdValueInstantiator;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;
import com.fasterxml.jackson.databind.introspect.AnnotatedWithParams;
import com.fasterxml.jackson.databind.util.C6490g;
import java.lang.reflect.Member;
import java.util.HashMap;

/* JADX INFO: renamed from: com.fasterxml.jackson.databind.deser.impl.b */
/* JADX INFO: compiled from: CreatorCollector.java */
/* JADX INFO: loaded from: classes45.dex */
public class C6367b {

    /* JADX INFO: renamed from: j */
    public static final String[] f10286j = {"default", "from-String", "from-int", "from-long", "from-big-integer", "from-double", "from-big-decimal", "from-boolean", "delegate", "property-based", "array-delegate"};

    /* JADX INFO: renamed from: a */
    public final AbstractC6340b f10287a;

    /* JADX INFO: renamed from: b */
    public final boolean f10288b;

    /* JADX INFO: renamed from: c */
    public final boolean f10289c;

    /* JADX INFO: renamed from: d */
    public final AnnotatedWithParams[] f10290d = new AnnotatedWithParams[11];

    /* JADX INFO: renamed from: e */
    public int f10291e = 0;

    /* JADX INFO: renamed from: f */
    public boolean f10292f = false;

    /* JADX INFO: renamed from: g */
    public SettableBeanProperty[] f10293g;

    /* JADX INFO: renamed from: h */
    public SettableBeanProperty[] f10294h;

    /* JADX INFO: renamed from: i */
    public SettableBeanProperty[] f10295i;

    /* JADX INFO: renamed from: e */
    public void m11317e(AnnotatedWithParams annotatedWithParams, boolean z11) {
        m11331s(annotatedWithParams, 6, z11);
    }

    /* JADX INFO: renamed from: f */
    public void m11318f(AnnotatedWithParams annotatedWithParams, boolean z11) {
        m11331s(annotatedWithParams, 4, z11);
    }

    /* JADX INFO: renamed from: g */
    public void m11319g(AnnotatedWithParams annotatedWithParams, boolean z11) {
        m11331s(annotatedWithParams, 7, z11);
    }

    /* JADX INFO: renamed from: i */
    public void m11321i(AnnotatedWithParams annotatedWithParams, boolean z11) {
        m11331s(annotatedWithParams, 5, z11);
    }

    /* JADX INFO: renamed from: j */
    public void m11322j(AnnotatedWithParams annotatedWithParams, boolean z11) {
        m11331s(annotatedWithParams, 2, z11);
    }

    /* JADX INFO: renamed from: k */
    public void m11323k(AnnotatedWithParams annotatedWithParams, boolean z11) {
        m11331s(annotatedWithParams, 3, z11);
    }

    /* JADX INFO: renamed from: m */
    public void m11325m(AnnotatedWithParams annotatedWithParams, boolean z11) {
        m11331s(annotatedWithParams, 1, z11);
    }

    /* JADX INFO: renamed from: s */
    public boolean m11331s(AnnotatedWithParams annotatedWithParams, int i11, boolean z11) {
        boolean z12;
        int i12 = 1 << i11;
        this.f10292f = true;
        AnnotatedWithParams annotatedWithParams2 = this.f10290d[i11];
        if (annotatedWithParams2 != null) {
            if ((this.f10291e & i12) == 0) {
                z12 = !z11;
            } else {
                if (!z11) {
                    return false;
                }
                z12 = true;
            }
            if (z12 && annotatedWithParams2.getClass() == annotatedWithParams.getClass()) {
                Class<?> rawParameterType = annotatedWithParams2.getRawParameterType(0);
                Class<?> rawParameterType2 = annotatedWithParams.getRawParameterType(0);
                if (rawParameterType == rawParameterType2) {
                    if (m11315c(annotatedWithParams)) {
                        return false;
                    }
                    if (!m11315c(annotatedWithParams2)) {
                        m11316d(i11, z11, annotatedWithParams2, annotatedWithParams);
                    }
                } else {
                    if (rawParameterType2.isAssignableFrom(rawParameterType)) {
                        return false;
                    }
                    if (!rawParameterType.isAssignableFrom(rawParameterType2)) {
                        if (rawParameterType.isPrimitive() == rawParameterType2.isPrimitive()) {
                            m11316d(i11, z11, annotatedWithParams2, annotatedWithParams);
                        } else if (rawParameterType.isPrimitive()) {
                            return false;
                        }
                    }
                }
            }
        }
        if (z11) {
            this.f10291e |= i12;
        }
        this.f10290d[i11] = (AnnotatedWithParams) m11314b(annotatedWithParams);
        return true;
    }

    /* JADX INFO: renamed from: a */
    public final JavaType m11313a(DeserializationContext deserializationContext, AnnotatedWithParams annotatedWithParams, SettableBeanProperty[] settableBeanPropertyArr) throws JsonMappingException {
        if (!this.f10292f || annotatedWithParams == null) {
            return null;
        }
        int i11 = 0;
        if (settableBeanPropertyArr != null) {
            int length = settableBeanPropertyArr.length;
            for (int i12 = 0; i12 < length; i12++) {
                if (settableBeanPropertyArr[i12] == null) {
                    i11 = i12;
                    break;
                }
            }
        }
        DeserializationConfig config = deserializationContext.getConfig();
        JavaType parameterType = annotatedWithParams.getParameterType(i11);
        AnnotationIntrospector annotationIntrospector = config.getAnnotationIntrospector();
        if (annotationIntrospector == null) {
            return parameterType;
        }
        AnnotatedParameter parameter = annotatedWithParams.getParameter(i11);
        Object objFindDeserializer = annotationIntrospector.findDeserializer(parameter);
        return objFindDeserializer != null ? parameterType.withValueHandler(deserializationContext.deserializerInstance(parameter, objFindDeserializer)) : annotationIntrospector.refineDeserializationType(config, parameter, parameterType);
    }

    /* JADX INFO: renamed from: b */
    public final <T extends AnnotatedMember> T m11314b(T t11) {
        if (t11 != null && this.f10288b) {
            C6490g.m11936g((Member) t11.getAnnotated(), this.f10289c);
        }
        return t11;
    }

    /* JADX INFO: renamed from: d */
    public void m11316d(int i11, boolean z11, AnnotatedWithParams annotatedWithParams, AnnotatedWithParams annotatedWithParams2) {
        throw new IllegalArgumentException(String.format("Conflicting %s creators: already had %s creator %s, encountered another: %s", f10286j[i11], z11 ? "explicitly marked" : "implicitly discovered", annotatedWithParams, annotatedWithParams2));
    }

    /* JADX INFO: renamed from: l */
    public void m11324l(AnnotatedWithParams annotatedWithParams, boolean z11, SettableBeanProperty[] settableBeanPropertyArr) {
        Integer num;
        if (m11331s(annotatedWithParams, 9, z11)) {
            if (settableBeanPropertyArr.length > 1) {
                HashMap map = new HashMap();
                int length = settableBeanPropertyArr.length;
                for (int i11 = 0; i11 < length; i11++) {
                    String name = settableBeanPropertyArr[i11].getName();
                    if ((!name.isEmpty() || settableBeanPropertyArr[i11].getInjectableValueId() == null) && (num = (Integer) map.put(name, Integer.valueOf(i11))) != null) {
                        throw new IllegalArgumentException(String.format("Duplicate creator property \"%s\" (index %s vs %d) for type %s ", name, num, Integer.valueOf(i11), C6490g.m11921X(this.f10287a.m11172r())));
                    }
                }
            }
            this.f10295i = settableBeanPropertyArr;
        }
    }

    /* JADX INFO: renamed from: o */
    public boolean m11327o() {
        return this.f10290d[0] != null;
    }

    /* JADX INFO: renamed from: p */
    public boolean m11328p() {
        return this.f10290d[8] != null;
    }

    /* JADX INFO: renamed from: q */
    public boolean m11329q() {
        return this.f10290d[9] != null;
    }

    /* JADX INFO: renamed from: r */
    public void m11330r(AnnotatedWithParams annotatedWithParams) {
        this.f10290d[0] = (AnnotatedWithParams) m11314b(annotatedWithParams);
    }

    public C6367b(AbstractC6340b abstractC6340b, MapperConfig<?> mapperConfig) {
        this.f10287a = abstractC6340b;
        this.f10288b = mapperConfig.canOverrideAccessModifiers();
        this.f10289c = mapperConfig.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS);
    }

    /* JADX INFO: renamed from: c */
    public boolean m11315c(AnnotatedWithParams annotatedWithParams) {
        if (C6490g.m11909L(annotatedWithParams.getDeclaringClass()) && "valueOf".equals(annotatedWithParams.getName())) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: h */
    public void m11320h(AnnotatedWithParams annotatedWithParams, boolean z11, SettableBeanProperty[] settableBeanPropertyArr, int i11) {
        if (annotatedWithParams.getParameterType(i11).isCollectionLikeType()) {
            if (m11331s(annotatedWithParams, 10, z11)) {
                this.f10294h = settableBeanPropertyArr;
            }
        } else if (m11331s(annotatedWithParams, 8, z11)) {
            this.f10293g = settableBeanPropertyArr;
        }
    }

    /* JADX INFO: renamed from: n */
    public ValueInstantiator m11326n(DeserializationContext deserializationContext) throws JsonMappingException {
        DeserializationConfig config = deserializationContext.getConfig();
        JavaType javaTypeM11313a = m11313a(deserializationContext, this.f10290d[8], this.f10293g);
        JavaType javaTypeM11313a2 = m11313a(deserializationContext, this.f10290d[10], this.f10294h);
        StdValueInstantiator stdValueInstantiator = new StdValueInstantiator(config, this.f10287a.m11151A());
        AnnotatedWithParams[] annotatedWithParamsArr = this.f10290d;
        stdValueInstantiator.configureFromObjectSettings(annotatedWithParamsArr[0], annotatedWithParamsArr[8], javaTypeM11313a, this.f10293g, annotatedWithParamsArr[9], this.f10295i);
        stdValueInstantiator.configureFromArraySettings(this.f10290d[10], javaTypeM11313a2, this.f10294h);
        stdValueInstantiator.configureFromStringCreator(this.f10290d[1]);
        stdValueInstantiator.configureFromIntCreator(this.f10290d[2]);
        stdValueInstantiator.configureFromLongCreator(this.f10290d[3]);
        stdValueInstantiator.configureFromBigIntegerCreator(this.f10290d[4]);
        stdValueInstantiator.configureFromDoubleCreator(this.f10290d[5]);
        stdValueInstantiator.configureFromBigDecimalCreator(this.f10290d[6]);
        stdValueInstantiator.configureFromBooleanCreator(this.f10290d[7]);
        return stdValueInstantiator;
    }
}
