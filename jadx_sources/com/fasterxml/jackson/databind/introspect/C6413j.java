package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.AbstractC6340b;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.util.C6490g;
import com.fasterxml.jackson.databind.util.InterfaceC6484a;
import com.fasterxml.jackson.databind.util.InterfaceC6491h;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p450m7.InterfaceC42439e;

/* JADX INFO: renamed from: com.fasterxml.jackson.databind.introspect.j */
/* JADX INFO: compiled from: BasicBeanDescription.java */
/* JADX INFO: loaded from: classes45.dex */
public class C6413j extends AbstractC6340b {

    /* JADX INFO: renamed from: j */
    public static final Class<?>[] f10441j = new Class[0];

    /* JADX INFO: renamed from: b */
    public final C6420q f10442b;

    /* JADX INFO: renamed from: c */
    public final MapperConfig<?> f10443c;

    /* JADX INFO: renamed from: d */
    public final AnnotationIntrospector f10444d;

    /* JADX INFO: renamed from: e */
    public final C6406c f10445e;

    /* JADX INFO: renamed from: f */
    public Class<?>[] f10446f;

    /* JADX INFO: renamed from: g */
    public boolean f10447g;

    /* JADX INFO: renamed from: h */
    public List<AbstractC6414k> f10448h;

    /* JADX INFO: renamed from: i */
    public C6419p f10449i;

    public C6413j(C6420q c6420q, JavaType javaType, C6406c c6406c) {
        super(javaType);
        this.f10442b = c6420q;
        MapperConfig<?> mapperConfigM11581D = c6420q.m11581D();
        this.f10443c = mapperConfigM11581D;
        if (mapperConfigM11581D == null) {
            this.f10444d = null;
        } else {
            this.f10444d = mapperConfigM11581D.getAnnotationIntrospector();
        }
        this.f10445e = c6406c;
    }

    /* JADX INFO: renamed from: E */
    public InterfaceC6491h<Object, Object> m11520E(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof InterfaceC6491h) {
            return (InterfaceC6491h) obj;
        }
        if (!(obj instanceof Class)) {
            throw new IllegalStateException("AnnotationIntrospector returned Converter definition of type " + obj.getClass().getName() + "; expected type Converter or Class<Converter> instead");
        }
        Class cls = (Class) obj;
        if (cls == InterfaceC6491h.a.class || C6490g.m11907J(cls)) {
            return null;
        }
        if (InterfaceC6491h.class.isAssignableFrom(cls)) {
            this.f10443c.getHandlerInstantiator();
            return (InterfaceC6491h) C6490g.m11946l(cls, this.f10443c.canOverrideAccessModifiers());
        }
        throw new IllegalStateException("AnnotationIntrospector returned Class " + cls.getName() + "; expected Class<Converter>");
    }

    /* JADX INFO: renamed from: J */
    public static C6413j m11517J(C6420q c6420q) {
        return new C6413j(c6420q);
    }

    /* JADX INFO: renamed from: K */
    public static C6413j m11518K(MapperConfig<?> mapperConfig, JavaType javaType, C6406c c6406c) {
        return new C6413j(mapperConfig, javaType, c6406c, Collections.EMPTY_LIST);
    }

    /* JADX INFO: renamed from: L */
    public static C6413j m11519L(C6420q c6420q) {
        return new C6413j(c6420q);
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6340b
    /* JADX INFO: renamed from: B */
    public boolean mo11152B() {
        return this.f10445e.m11468l();
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6340b
    /* JADX INFO: renamed from: C */
    public Object mo11153C(boolean z11) {
        AnnotatedConstructor annotatedConstructorM11466j = this.f10445e.m11466j();
        if (annotatedConstructorM11466j == null) {
            return null;
        }
        if (z11) {
            annotatedConstructorM11466j.fixAccess(this.f10443c.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
        }
        try {
            return annotatedConstructorM11466j.call();
        } catch (Exception e11) {
            e = e11;
            while (e.getCause() != null) {
                e = e.getCause();
            }
            C6490g.m11939h0(e);
            C6490g.m11943j0(e);
            throw new IllegalArgumentException("Failed to instantiate bean of type " + this.f10445e.getAnnotated().getName() + ": (" + e.getClass().getName() + ") " + C6490g.m11952o(e), e);
        }
    }

    /* JADX INFO: renamed from: F */
    public List<AbstractC6414k> m11521F() {
        if (this.f10448h == null) {
            this.f10448h = this.f10442b.m11588K();
        }
        return this.f10448h;
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6340b
    /* JADX INFO: renamed from: a */
    public AnnotatedMember mo11155a() throws IllegalArgumentException {
        C6420q c6420q = this.f10442b;
        if (c6420q == null) {
            return null;
        }
        AnnotatedMember annotatedMemberM11616z = c6420q.m11616z();
        if (annotatedMemberM11616z != null) {
            if (Map.class.isAssignableFrom(annotatedMemberM11616z.getRawType())) {
                return annotatedMemberM11616z;
            }
            throw new IllegalArgumentException(String.format("Invalid 'any-getter' annotation on method %s(): return type is not instance of java.util.Map", annotatedMemberM11616z.getName()));
        }
        AnnotatedMember annotatedMemberM11615y = this.f10442b.m11615y();
        if (annotatedMemberM11615y == null) {
            return null;
        }
        if (Map.class.isAssignableFrom(annotatedMemberM11615y.getRawType())) {
            return annotatedMemberM11615y;
        }
        throw new IllegalArgumentException(String.format("Invalid 'any-getter' annotation on field '%s': type is not instance of java.util.Map", annotatedMemberM11615y.getName()));
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6340b
    /* JADX INFO: renamed from: b */
    public AnnotatedMember mo11156b() throws IllegalArgumentException {
        C6420q c6420q = this.f10442b;
        if (c6420q == null) {
            return null;
        }
        AnnotatedMethod annotatedMethodM11579B = c6420q.m11579B();
        if (annotatedMethodM11579B != null) {
            Class<?> rawParameterType = annotatedMethodM11579B.getRawParameterType(0);
            if (rawParameterType == String.class || rawParameterType == Object.class) {
                return annotatedMethodM11579B;
            }
            throw new IllegalArgumentException(String.format("Invalid 'any-setter' annotation on method '%s()': first argument not of type String or Object, but %s", annotatedMethodM11579B.getName(), rawParameterType.getName()));
        }
        AnnotatedMember annotatedMemberM11578A = this.f10442b.m11578A();
        if (annotatedMemberM11578A == null) {
            return null;
        }
        if (Map.class.isAssignableFrom(annotatedMemberM11578A.getRawType())) {
            return annotatedMemberM11578A;
        }
        throw new IllegalArgumentException(String.format("Invalid 'any-setter' annotation on field '%s': type is not instance of java.util.Map", annotatedMemberM11578A.getName()));
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6340b
    /* JADX INFO: renamed from: d */
    public AnnotatedConstructor mo11158d() {
        return this.f10445e.m11466j();
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6340b
    /* JADX INFO: renamed from: e */
    public Class<?>[] mo11159e() {
        if (!this.f10447g) {
            this.f10447g = true;
            AnnotationIntrospector annotationIntrospector = this.f10444d;
            Class<?>[] clsArrFindViews = annotationIntrospector == null ? null : annotationIntrospector.findViews(this.f10445e);
            if (clsArrFindViews == null && !this.f10443c.isEnabled(MapperFeature.DEFAULT_VIEW_INCLUSION)) {
                clsArrFindViews = f10441j;
            }
            this.f10446f = clsArrFindViews;
        }
        return this.f10446f;
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6340b
    /* JADX INFO: renamed from: f */
    public InterfaceC6491h<Object, Object> mo11160f() {
        AnnotationIntrospector annotationIntrospector = this.f10444d;
        if (annotationIntrospector == null) {
            return null;
        }
        return m11520E(annotationIntrospector.findDeserializationConverter(this.f10445e));
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6340b
    /* JADX INFO: renamed from: g */
    public JsonFormat.Value mo11161g(JsonFormat.Value value) {
        JsonFormat.Value valueFindFormat;
        AnnotationIntrospector annotationIntrospector = this.f10444d;
        if (annotationIntrospector != null && (valueFindFormat = annotationIntrospector.findFormat(this.f10445e)) != null) {
            value = value == null ? valueFindFormat : value.withOverrides(valueFindFormat);
        }
        JsonFormat.Value defaultPropertyFormat = this.f10443c.getDefaultPropertyFormat(this.f10445e.getRawType());
        if (defaultPropertyFormat != null) {
            return value == null ? defaultPropertyFormat : value.withOverrides(defaultPropertyFormat);
        }
        return value;
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6340b
    /* JADX INFO: renamed from: h */
    public Map<Object, AnnotatedMember> mo11162h() {
        C6420q c6420q = this.f10442b;
        return c6420q != null ? c6420q.m11583F() : Collections.EMPTY_MAP;
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6340b
    /* JADX INFO: renamed from: i */
    public AnnotatedMember mo11163i() {
        C6420q c6420q = this.f10442b;
        if (c6420q == null) {
            return null;
        }
        return c6420q.m11584G();
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6340b
    /* JADX INFO: renamed from: j */
    public AnnotatedMember mo11164j() {
        C6420q c6420q = this.f10442b;
        if (c6420q == null) {
            return null;
        }
        return c6420q.m11585H();
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6340b
    @Deprecated
    /* JADX INFO: renamed from: k */
    public AnnotatedMethod mo11165k() {
        C6420q c6420q = this.f10442b;
        if (c6420q == null) {
            return null;
        }
        return c6420q.m11586I();
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6340b
    /* JADX INFO: renamed from: l */
    public AnnotatedMethod mo11166l(String str, Class<?>[] clsArr) {
        return this.f10445e.m11462f(str, clsArr);
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6340b
    /* JADX INFO: renamed from: m */
    public Class<?> mo11167m() {
        AnnotationIntrospector annotationIntrospector = this.f10444d;
        if (annotationIntrospector == null) {
            return null;
        }
        return annotationIntrospector.findPOJOBuilder(this.f10445e);
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6340b
    /* JADX INFO: renamed from: n */
    public InterfaceC42439e.a mo11168n() {
        AnnotationIntrospector annotationIntrospector = this.f10444d;
        if (annotationIntrospector == null) {
            return null;
        }
        return annotationIntrospector.findPOJOBuilderConfig(this.f10445e);
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6340b
    /* JADX INFO: renamed from: p */
    public JsonInclude.Value mo11170p(JsonInclude.Value value) {
        JsonInclude.Value valueFindPropertyInclusion;
        AnnotationIntrospector annotationIntrospector = this.f10444d;
        if (annotationIntrospector == null || (valueFindPropertyInclusion = annotationIntrospector.findPropertyInclusion(this.f10445e)) == null) {
            return value;
        }
        return value == null ? valueFindPropertyInclusion : value.withOverrides(valueFindPropertyInclusion);
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6340b
    /* JADX INFO: renamed from: q */
    public InterfaceC6491h<Object, Object> mo11171q() {
        AnnotationIntrospector annotationIntrospector = this.f10444d;
        if (annotationIntrospector == null) {
            return null;
        }
        return m11520E(annotationIntrospector.findSerializationConverter(this.f10445e));
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6340b
    /* JADX INFO: renamed from: s */
    public InterfaceC6484a mo11173s() {
        return this.f10445e.m11464h();
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6340b
    /* JADX INFO: renamed from: t */
    public C6406c mo11174t() {
        return this.f10445e;
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6340b
    /* JADX INFO: renamed from: u */
    public List<AnnotatedConstructor> mo11175u() {
        return this.f10445e.m11465i();
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6340b
    /* JADX INFO: renamed from: v */
    public List<C6405b<AnnotatedConstructor, JsonCreator.Mode>> mo11176v() {
        List<AnnotatedConstructor> listM11465i = this.f10445e.m11465i();
        if (listM11465i.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        for (AnnotatedConstructor annotatedConstructor : listM11465i) {
            JsonCreator.Mode modeFindCreatorAnnotation = this.f10444d.findCreatorAnnotation(this.f10443c, annotatedConstructor);
            if (modeFindCreatorAnnotation != JsonCreator.Mode.DISABLED) {
                arrayList.add(C6405b.m11456a(annotatedConstructor, modeFindCreatorAnnotation));
            }
        }
        return arrayList;
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6340b
    /* JADX INFO: renamed from: w */
    public List<AnnotatedMethod> mo11177w() {
        List<AnnotatedMethod> listM11467k = this.f10445e.m11467k();
        if (listM11467k.isEmpty()) {
            return listM11467k;
        }
        ArrayList arrayList = null;
        for (AnnotatedMethod annotatedMethod : listM11467k) {
            if (m11526N(annotatedMethod)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(annotatedMethod);
            }
        }
        return arrayList == null ? Collections.EMPTY_LIST : arrayList;
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6340b
    /* JADX INFO: renamed from: x */
    public List<C6405b<AnnotatedMethod, JsonCreator.Mode>> mo11178x() {
        List<AnnotatedMethod> listM11467k = this.f10445e.m11467k();
        if (listM11467k.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        Iterator<AnnotatedMethod> it = listM11467k.iterator();
        ArrayList arrayList = null;
        while (it.hasNext()) {
            C6405b<AnnotatedMethod, JsonCreator.Mode> c6405bM11523H = m11523H(it.next());
            if (c6405bM11523H != null) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(c6405bM11523H);
            }
        }
        return arrayList == null ? Collections.EMPTY_LIST : arrayList;
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6340b
    /* JADX INFO: renamed from: y */
    public Set<String> mo11179y() {
        C6420q c6420q = this.f10442b;
        Set<String> setM11582E = c6420q == null ? null : c6420q.m11582E();
        return setM11582E == null ? Collections.EMPTY_SET : setM11582E;
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6340b
    /* JADX INFO: renamed from: z */
    public C6419p mo11180z() {
        return this.f10449i;
    }

    /* JADX INFO: renamed from: G */
    public boolean m11522G(AbstractC6414k abstractC6414k) {
        if (m11525M(abstractC6414k.getFullName())) {
            return false;
        }
        m11521F().add(abstractC6414k);
        return true;
    }

    /* JADX INFO: renamed from: H */
    public C6405b<AnnotatedMethod, JsonCreator.Mode> m11523H(AnnotatedMethod annotatedMethod) {
        Class<?> rawParameterType;
        if (!m11172r().isAssignableFrom(annotatedMethod.getRawReturnType())) {
            return null;
        }
        JsonCreator.Mode modeFindCreatorAnnotation = this.f10444d.findCreatorAnnotation(this.f10443c, annotatedMethod);
        if (modeFindCreatorAnnotation != null) {
            if (modeFindCreatorAnnotation == JsonCreator.Mode.DISABLED) {
                return null;
            }
            return C6405b.m11456a(annotatedMethod, modeFindCreatorAnnotation);
        }
        String name = annotatedMethod.getName();
        if ("valueOf".equals(name) && annotatedMethod.getParameterCount() == 1) {
            return C6405b.m11456a(annotatedMethod, modeFindCreatorAnnotation);
        }
        if (!"fromString".equals(name) || annotatedMethod.getParameterCount() != 1 || ((rawParameterType = annotatedMethod.getRawParameterType(0)) != String.class && !CharSequence.class.isAssignableFrom(rawParameterType))) {
            return null;
        }
        return C6405b.m11456a(annotatedMethod, modeFindCreatorAnnotation);
    }

    /* JADX INFO: renamed from: I */
    public AbstractC6414k m11524I(PropertyName propertyName) {
        for (AbstractC6414k abstractC6414k : m11521F()) {
            if (abstractC6414k.mo11548u(propertyName)) {
                return abstractC6414k;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: M */
    public boolean m11525M(PropertyName propertyName) {
        if (m11524I(propertyName) != null) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: N */
    public boolean m11526N(AnnotatedMethod annotatedMethod) {
        Class<?> rawParameterType;
        if (!m11172r().isAssignableFrom(annotatedMethod.getRawReturnType())) {
            return false;
        }
        JsonCreator.Mode modeFindCreatorAnnotation = this.f10444d.findCreatorAnnotation(this.f10443c, annotatedMethod);
        if (modeFindCreatorAnnotation != null && modeFindCreatorAnnotation != JsonCreator.Mode.DISABLED) {
            return true;
        }
        String name = annotatedMethod.getName();
        if ("valueOf".equals(name) && annotatedMethod.getParameterCount() == 1) {
            return true;
        }
        if (!"fromString".equals(name) || annotatedMethod.getParameterCount() != 1 || ((rawParameterType = annotatedMethod.getRawParameterType(0)) != String.class && !CharSequence.class.isAssignableFrom(rawParameterType))) {
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: O */
    public boolean m11527O(String str) {
        Iterator<AbstractC6414k> it = m11521F().iterator();
        while (it.hasNext()) {
            if (it.next().getName().equals(str)) {
                it.remove();
                return true;
            }
        }
        return false;
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6340b
    /* JADX INFO: renamed from: c */
    public List<AbstractC6414k> mo11157c() {
        ArrayList arrayList = null;
        HashSet hashSet = null;
        for (AbstractC6414k abstractC6414k : m11521F()) {
            AnnotationIntrospector.ReferenceProperty referencePropertyMo11533f = abstractC6414k.mo11533f();
            if (referencePropertyMo11533f != null && referencePropertyMo11533f.m11129c()) {
                String strM11128b = referencePropertyMo11533f.m11128b();
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    hashSet = new HashSet();
                    hashSet.add(strM11128b);
                } else if (!hashSet.add(strM11128b)) {
                    throw new IllegalArgumentException("Multiple back-reference properties with name " + C6490g.m11919V(strM11128b));
                }
                arrayList.add(abstractC6414k);
            }
        }
        return arrayList;
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6340b
    /* JADX INFO: renamed from: o */
    public List<AbstractC6414k> mo11169o() {
        return m11521F();
    }

    public C6413j(MapperConfig<?> mapperConfig, JavaType javaType, C6406c c6406c, List<AbstractC6414k> list) {
        super(javaType);
        this.f10442b = null;
        this.f10443c = mapperConfig;
        if (mapperConfig == null) {
            this.f10444d = null;
        } else {
            this.f10444d = mapperConfig.getAnnotationIntrospector();
        }
        this.f10445e = c6406c;
        this.f10448h = list;
    }

    public C6413j(C6420q c6420q) {
        this(c6420q, c6420q.m11590M(), c6420q.m11580C());
        this.f10449i = c6420q.m11587J();
    }
}
