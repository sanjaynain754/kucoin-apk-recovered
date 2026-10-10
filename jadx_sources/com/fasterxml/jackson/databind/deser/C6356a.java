package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.AbstractC6340b;
import com.fasterxml.jackson.databind.AbstractC6390e;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdReader;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty;
import com.fasterxml.jackson.databind.deser.impl.ValueInjector;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.util.C6490g;
import com.fasterxml.jackson.databind.util.IgnorePropertiesUtil;
import com.fasterxml.jackson.databind.util.InterfaceC6484a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p450m7.InterfaceC42439e;

/* JADX INFO: renamed from: com.fasterxml.jackson.databind.deser.a */
/* JADX INFO: compiled from: BeanDeserializerBuilder.java */
/* JADX INFO: loaded from: classes45.dex */
public class C6356a {

    /* JADX INFO: renamed from: a */
    public final DeserializationConfig f10246a;

    /* JADX INFO: renamed from: b */
    public final DeserializationContext f10247b;

    /* JADX INFO: renamed from: c */
    public final AbstractC6340b f10248c;

    /* JADX INFO: renamed from: d */
    public final Map<String, SettableBeanProperty> f10249d = new LinkedHashMap();

    /* JADX INFO: renamed from: e */
    public List<ValueInjector> f10250e;

    /* JADX INFO: renamed from: f */
    public HashMap<String, SettableBeanProperty> f10251f;

    /* JADX INFO: renamed from: g */
    public HashSet<String> f10252g;

    /* JADX INFO: renamed from: h */
    public HashSet<String> f10253h;

    /* JADX INFO: renamed from: i */
    public ValueInstantiator f10254i;

    /* JADX INFO: renamed from: j */
    public ObjectIdReader f10255j;

    /* JADX INFO: renamed from: k */
    public SettableAnyProperty f10256k;

    /* JADX INFO: renamed from: l */
    public boolean f10257l;

    /* JADX INFO: renamed from: m */
    public AnnotatedMethod f10258m;

    /* JADX INFO: renamed from: n */
    public InterfaceC42439e.a f10259n;

    /* JADX INFO: renamed from: A */
    public void m11217A(AnnotatedMethod annotatedMethod, InterfaceC42439e.a aVar) {
        this.f10258m = annotatedMethod;
        this.f10259n = aVar;
    }

    /* JADX INFO: renamed from: B */
    public void m11218B(ValueInstantiator valueInstantiator) {
        this.f10254i = valueInstantiator;
    }

    /* JADX INFO: renamed from: a */
    public Map<String, List<PropertyName>> m11219a(Collection<SettableBeanProperty> collection) {
        AnnotationIntrospector annotationIntrospector = this.f10246a.getAnnotationIntrospector();
        HashMap map = null;
        if (annotationIntrospector != null) {
            for (SettableBeanProperty settableBeanProperty : collection) {
                List<PropertyName> listFindPropertyAliases = annotationIntrospector.findPropertyAliases(settableBeanProperty.getMember());
                if (listFindPropertyAliases != null && !listFindPropertyAliases.isEmpty()) {
                    if (map == null) {
                        map = new HashMap();
                    }
                    map.put(settableBeanProperty.getName(), listFindPropertyAliases);
                }
            }
        }
        return map == null ? Collections.EMPTY_MAP : map;
    }

    /* JADX INFO: renamed from: b */
    public boolean m11220b() {
        Boolean feature = this.f10248c.mo11161g(null).getFeature(JsonFormat.Feature.ACCEPT_CASE_INSENSITIVE_PROPERTIES);
        return feature == null ? this.f10246a.isEnabled(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES) : feature.booleanValue();
    }

    /* JADX INFO: renamed from: c */
    public void m11221c(Collection<SettableBeanProperty> collection) throws DatabindException {
        if (this.f10246a.canOverrideAccessModifiers()) {
            Iterator<SettableBeanProperty> it = collection.iterator();
            while (it.hasNext()) {
                try {
                    it.next().fixAccess(this.f10246a);
                } catch (IllegalArgumentException e11) {
                    m11222d(e11);
                }
            }
        }
        SettableAnyProperty settableAnyProperty = this.f10256k;
        if (settableAnyProperty != null) {
            try {
                settableAnyProperty.fixAccess(this.f10246a);
            } catch (IllegalArgumentException e12) {
                m11222d(e12);
            }
        }
        AnnotatedMethod annotatedMethod = this.f10258m;
        if (annotatedMethod != null) {
            try {
                annotatedMethod.fixAccess(this.f10246a.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
            } catch (IllegalArgumentException e13) {
                m11222d(e13);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public void m11222d(IllegalArgumentException illegalArgumentException) throws DatabindException {
        try {
            this.f10247b.reportBadTypeDefinition(this.f10248c, illegalArgumentException.getMessage(), new Object[0]);
        } catch (DatabindException e11) {
            if (e11.getCause() == null) {
                e11.initCause(illegalArgumentException);
            }
            throw e11;
        }
    }

    /* JADX INFO: renamed from: e */
    public void m11223e(String str, SettableBeanProperty settableBeanProperty) throws DatabindException {
        if (this.f10251f == null) {
            this.f10251f = new HashMap<>(4);
        }
        if (this.f10246a.canOverrideAccessModifiers()) {
            try {
                settableBeanProperty.fixAccess(this.f10246a);
            } catch (IllegalArgumentException e11) {
                m11222d(e11);
            }
        }
        this.f10251f.put(str, settableBeanProperty);
    }

    /* JADX INFO: renamed from: g */
    public void m11225g(String str) {
        if (this.f10252g == null) {
            this.f10252g = new HashSet<>();
        }
        this.f10252g.add(str);
    }

    /* JADX INFO: renamed from: h */
    public void m11226h(String str) {
        if (this.f10253h == null) {
            this.f10253h = new HashSet<>();
        }
        this.f10253h.add(str);
    }

    /* JADX INFO: renamed from: i */
    public void m11227i(PropertyName propertyName, JavaType javaType, InterfaceC6484a interfaceC6484a, AnnotatedMember annotatedMember, Object obj) throws DatabindException {
        if (this.f10250e == null) {
            this.f10250e = new ArrayList();
        }
        if (this.f10246a.canOverrideAccessModifiers()) {
            try {
                annotatedMember.fixAccess(this.f10246a.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
            } catch (IllegalArgumentException e11) {
                m11222d(e11);
            }
        }
        this.f10250e.add(new ValueInjector(propertyName, javaType, annotatedMember, obj));
    }

    /* JADX INFO: renamed from: j */
    public void m11228j(SettableBeanProperty settableBeanProperty, boolean z11) {
        this.f10249d.put(settableBeanProperty.getName(), settableBeanProperty);
    }

    /* JADX INFO: renamed from: k */
    public void m11229k(SettableBeanProperty settableBeanProperty) {
        SettableBeanProperty settableBeanPropertyPut = this.f10249d.put(settableBeanProperty.getName(), settableBeanProperty);
        if (settableBeanPropertyPut == null || settableBeanPropertyPut == settableBeanProperty) {
            return;
        }
        throw new IllegalArgumentException("Duplicate property '" + settableBeanProperty.getName() + "' for " + this.f10248c.m11151A());
    }

    /* JADX INFO: renamed from: l */
    public AbstractC6390e<?> m11230l() throws DatabindException {
        Collection<SettableBeanProperty> collectionValues = this.f10249d.values();
        m11221c(collectionValues);
        BeanPropertyMap beanPropertyMapConstruct = BeanPropertyMap.construct(this.f10246a, collectionValues, m11219a(collectionValues), m11220b());
        beanPropertyMapConstruct.assignIndexes();
        boolean zIsEnabled = this.f10246a.isEnabled(MapperFeature.DEFAULT_VIEW_INCLUSION);
        boolean z11 = !zIsEnabled;
        if (zIsEnabled) {
            Iterator<SettableBeanProperty> it = collectionValues.iterator();
            while (it.hasNext()) {
                if (it.next().hasViews()) {
                    z11 = true;
                    break;
                }
            }
        }
        boolean z12 = z11;
        if (this.f10255j != null) {
            beanPropertyMapConstruct = beanPropertyMapConstruct.withProperty(new ObjectIdValueProperty(this.f10255j, PropertyMetadata.STD_REQUIRED));
        }
        return new BeanDeserializer(this, this.f10248c, beanPropertyMapConstruct, this.f10251f, this.f10252g, this.f10257l, this.f10253h, z12);
    }

    /* JADX INFO: renamed from: m */
    public AbstractDeserializer m11231m() {
        return new AbstractDeserializer(this, this.f10248c, this.f10251f, this.f10249d);
    }

    /* JADX INFO: renamed from: n */
    public AbstractC6390e<?> m11232n(JavaType javaType, String str) throws DatabindException {
        AnnotatedMethod annotatedMethod = this.f10258m;
        if (annotatedMethod != null) {
            Class<?> rawReturnType = annotatedMethod.getRawReturnType();
            Class<?> rawClass = javaType.getRawClass();
            if (rawReturnType != rawClass && !rawReturnType.isAssignableFrom(rawClass) && !rawClass.isAssignableFrom(rawReturnType)) {
                this.f10247b.reportBadDefinition(this.f10248c.m11151A(), String.format("Build method `%s` has wrong return type (%s), not compatible with POJO type (%s)", this.f10258m.getFullName(), C6490g.m11963y(rawReturnType), C6490g.m11904G(javaType)));
            }
        } else if (!str.isEmpty()) {
            this.f10247b.reportBadDefinition(this.f10248c.m11151A(), String.format("Builder class %s does not have build method (name: '%s')", C6490g.m11904G(this.f10248c.m11151A()), str));
        }
        Collection<SettableBeanProperty> collectionValues = this.f10249d.values();
        m11221c(collectionValues);
        BeanPropertyMap beanPropertyMapConstruct = BeanPropertyMap.construct(this.f10246a, collectionValues, m11219a(collectionValues), m11220b());
        beanPropertyMapConstruct.assignIndexes();
        boolean zIsEnabled = this.f10246a.isEnabled(MapperFeature.DEFAULT_VIEW_INCLUSION);
        boolean z11 = !zIsEnabled;
        if (zIsEnabled) {
            Iterator<SettableBeanProperty> it = collectionValues.iterator();
            while (it.hasNext()) {
                if (it.next().hasViews()) {
                    z11 = true;
                    break;
                }
            }
        }
        if (this.f10255j != null) {
            beanPropertyMapConstruct = beanPropertyMapConstruct.withProperty(new ObjectIdValueProperty(this.f10255j, PropertyMetadata.STD_REQUIRED));
        }
        return m11233o(javaType, beanPropertyMapConstruct, z11);
    }

    /* JADX INFO: renamed from: o */
    public AbstractC6390e<?> m11233o(JavaType javaType, BeanPropertyMap beanPropertyMap, boolean z11) {
        return new BuilderBasedDeserializer(this, this.f10248c, javaType, beanPropertyMap, this.f10251f, this.f10252g, this.f10257l, this.f10253h, z11);
    }

    /* JADX INFO: renamed from: p */
    public SettableBeanProperty m11234p(PropertyName propertyName) {
        return this.f10249d.get(propertyName.getSimpleName());
    }

    /* JADX INFO: renamed from: q */
    public SettableAnyProperty m11235q() {
        return this.f10256k;
    }

    /* JADX INFO: renamed from: r */
    public AnnotatedMethod m11236r() {
        return this.f10258m;
    }

    /* JADX INFO: renamed from: s */
    public List<ValueInjector> m11237s() {
        return this.f10250e;
    }

    /* JADX INFO: renamed from: t */
    public ObjectIdReader m11238t() {
        return this.f10255j;
    }

    /* JADX INFO: renamed from: u */
    public Iterator<SettableBeanProperty> m11239u() {
        return this.f10249d.values().iterator();
    }

    /* JADX INFO: renamed from: v */
    public ValueInstantiator m11240v() {
        return this.f10254i;
    }

    /* JADX INFO: renamed from: w */
    public boolean m11241w(String str) {
        return IgnorePropertiesUtil.m11868c(str, this.f10252g, this.f10253h);
    }

    /* JADX INFO: renamed from: x */
    public void m11242x(SettableAnyProperty settableAnyProperty) {
        if (this.f10256k != null && settableAnyProperty != null) {
            throw new IllegalStateException("_anySetter already set to non-null");
        }
        this.f10256k = settableAnyProperty;
    }

    /* JADX INFO: renamed from: y */
    public void m11243y(boolean z11) {
        this.f10257l = z11;
    }

    /* JADX INFO: renamed from: z */
    public void m11244z(ObjectIdReader objectIdReader) {
        this.f10255j = objectIdReader;
    }

    public C6356a(AbstractC6340b abstractC6340b, DeserializationContext deserializationContext) {
        this.f10248c = abstractC6340b;
        this.f10247b = deserializationContext;
        this.f10246a = deserializationContext.getConfig();
    }

    /* JADX INFO: renamed from: f */
    public void m11224f(SettableBeanProperty settableBeanProperty) {
        m11229k(settableBeanProperty);
    }
}
