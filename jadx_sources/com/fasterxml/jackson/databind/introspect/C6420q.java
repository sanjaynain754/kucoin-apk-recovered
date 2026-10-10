package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.annotation.JacksonInject;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.util.C6490g;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* JADX INFO: renamed from: com.fasterxml.jackson.databind.introspect.q */
/* JADX INFO: compiled from: POJOPropertiesCollector.java */
/* JADX INFO: loaded from: classes45.dex */
public class C6420q {

    /* JADX INFO: renamed from: a */
    public final MapperConfig<?> f10463a;

    /* JADX INFO: renamed from: b */
    public final AccessorNamingStrategy f10464b;

    /* JADX INFO: renamed from: c */
    public final boolean f10465c;

    /* JADX INFO: renamed from: d */
    public final JavaType f10466d;

    /* JADX INFO: renamed from: e */
    public final C6406c f10467e;

    /* JADX INFO: renamed from: f */
    public final VisibilityChecker<?> f10468f;

    /* JADX INFO: renamed from: g */
    public final AnnotationIntrospector f10469g;

    /* JADX INFO: renamed from: h */
    public final boolean f10470h;

    /* JADX INFO: renamed from: i */
    public boolean f10471i;

    /* JADX INFO: renamed from: j */
    public LinkedHashMap<String, C6422s> f10472j;

    /* JADX INFO: renamed from: k */
    public LinkedList<C6422s> f10473k;

    /* JADX INFO: renamed from: l */
    public Map<PropertyName, PropertyName> f10474l;

    /* JADX INFO: renamed from: m */
    public LinkedList<AnnotatedMember> f10475m;

    /* JADX INFO: renamed from: n */
    public LinkedList<AnnotatedMember> f10476n;

    /* JADX INFO: renamed from: o */
    public LinkedList<AnnotatedMethod> f10477o;

    /* JADX INFO: renamed from: p */
    public LinkedList<AnnotatedMember> f10478p;

    /* JADX INFO: renamed from: q */
    public LinkedList<AnnotatedMember> f10479q;

    /* JADX INFO: renamed from: r */
    public LinkedList<AnnotatedMember> f10480r;

    /* JADX INFO: renamed from: s */
    public HashSet<String> f10481s;

    /* JADX INFO: renamed from: t */
    public LinkedHashMap<Object, AnnotatedMember> f10482t;

    /* JADX INFO: renamed from: u */
    @Deprecated
    public final boolean f10483u;

    /* JADX INFO: renamed from: v */
    @Deprecated
    public String f10484v;

    public C6420q(MapperConfig<?> mapperConfig, boolean z11, JavaType javaType, C6406c c6406c, AccessorNamingStrategy accessorNamingStrategy) {
        this.f10484v = "set";
        this.f10463a = mapperConfig;
        this.f10465c = z11;
        this.f10466d = javaType;
        this.f10467e = c6406c;
        if (mapperConfig.isAnnotationProcessingEnabled()) {
            this.f10470h = true;
            this.f10469g = mapperConfig.getAnnotationIntrospector();
        } else {
            this.f10470h = false;
            this.f10469g = AnnotationIntrospector.nopInstance();
        }
        this.f10468f = mapperConfig.getDefaultVisibilityChecker(javaType.getRawClass(), c6406c);
        this.f10464b = accessorNamingStrategy;
        this.f10483u = mapperConfig.isEnabled(MapperFeature.USE_STD_BEAN_NAMING);
    }

    /* JADX INFO: renamed from: N */
    public void m11591N(String str, Object... objArr) {
        if (objArr.length > 0) {
            str = String.format(str, objArr);
        }
        throw new IllegalArgumentException("Problem with definition of " + this.f10467e + ": " + str);
    }

    /* JADX INFO: renamed from: n */
    public final PropertyName m11604n(String str) {
        return PropertyName.construct(str, null);
    }

    /* JADX INFO: renamed from: v */
    public boolean m11612v(C6422s c6422s, List<C6422s> list) {
        if (list != null) {
            String strM11650h0 = c6422s.m11650h0();
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                if (list.get(i11).m11650h0().equals(strM11650h0)) {
                    list.set(i11, c6422s);
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    public static AccessorNamingStrategy m11577a(MapperConfig<?> mapperConfig, C6406c c6406c, String str) {
        if (str == null) {
            str = "set";
        }
        return new DefaultAccessorNamingStrategy.Provider().withSetterPrefix(str).forPOJO(mapperConfig, c6406c);
    }

    /* JADX INFO: renamed from: A */
    public AnnotatedMember m11578A() {
        if (!this.f10471i) {
            m11614x();
        }
        LinkedList<AnnotatedMember> linkedList = this.f10478p;
        if (linkedList == null) {
            return null;
        }
        if (linkedList.size() > 1) {
            m11591N("Multiple 'any-setter' fields defined (%s vs %s)", this.f10478p.get(0), this.f10478p.get(1));
        }
        return this.f10478p.getFirst();
    }

    /* JADX INFO: renamed from: B */
    public AnnotatedMethod m11579B() {
        if (!this.f10471i) {
            m11614x();
        }
        LinkedList<AnnotatedMethod> linkedList = this.f10477o;
        if (linkedList == null) {
            return null;
        }
        if (linkedList.size() > 1) {
            m11591N("Multiple 'any-setter' methods defined (%s vs %s)", this.f10477o.get(0), this.f10477o.get(1));
        }
        return this.f10477o.getFirst();
    }

    /* JADX INFO: renamed from: C */
    public C6406c m11580C() {
        return this.f10467e;
    }

    /* JADX INFO: renamed from: D */
    public MapperConfig<?> m11581D() {
        return this.f10463a;
    }

    /* JADX INFO: renamed from: E */
    public Set<String> m11582E() {
        return this.f10481s;
    }

    /* JADX INFO: renamed from: F */
    public Map<Object, AnnotatedMember> m11583F() {
        if (!this.f10471i) {
            m11614x();
        }
        return this.f10482t;
    }

    /* JADX INFO: renamed from: G */
    public AnnotatedMember m11584G() {
        if (!this.f10471i) {
            m11614x();
        }
        LinkedList<AnnotatedMember> linkedList = this.f10479q;
        if (linkedList == null) {
            return null;
        }
        if (linkedList.size() > 1) {
            m11591N("Multiple 'as-key' properties defined (%s vs %s)", this.f10479q.get(0), this.f10479q.get(1));
        }
        return this.f10479q.get(0);
    }

    /* JADX INFO: renamed from: H */
    public AnnotatedMember m11585H() {
        if (!this.f10471i) {
            m11614x();
        }
        LinkedList<AnnotatedMember> linkedList = this.f10480r;
        if (linkedList == null) {
            return null;
        }
        if (linkedList.size() > 1) {
            m11591N("Multiple 'as-value' properties defined (%s vs %s)", this.f10480r.get(0), this.f10480r.get(1));
        }
        return this.f10480r.get(0);
    }

    /* JADX INFO: renamed from: J */
    public C6419p m11587J() {
        C6419p c6419pFindObjectIdInfo = this.f10469g.findObjectIdInfo(this.f10467e);
        return c6419pFindObjectIdInfo != null ? this.f10469g.findObjectReferenceInfo(this.f10467e, c6419pFindObjectIdInfo) : c6419pFindObjectIdInfo;
    }

    /* JADX INFO: renamed from: L */
    public Map<String, C6422s> m11589L() {
        if (!this.f10471i) {
            m11614x();
        }
        return this.f10472j;
    }

    /* JADX INFO: renamed from: M */
    public JavaType m11590M() {
        return this.f10466d;
    }

    /* JADX INFO: renamed from: b */
    public void m11592b(Map<String, C6422s> map, AnnotatedParameter annotatedParameter) {
        JsonCreator.Mode modeFindCreatorAnnotation;
        String strFindImplicitPropertyName = this.f10469g.findImplicitPropertyName(annotatedParameter);
        if (strFindImplicitPropertyName == null) {
            strFindImplicitPropertyName = "";
        }
        PropertyName propertyNameFindNameForDeserialization = this.f10469g.findNameForDeserialization(annotatedParameter);
        boolean z11 = (propertyNameFindNameForDeserialization == null || propertyNameFindNameForDeserialization.isEmpty()) ? false : true;
        if (!z11) {
            if (strFindImplicitPropertyName.isEmpty() || (modeFindCreatorAnnotation = this.f10469g.findCreatorAnnotation(this.f10463a, annotatedParameter.getOwner())) == null || modeFindCreatorAnnotation == JsonCreator.Mode.DISABLED) {
                return;
            } else {
                propertyNameFindNameForDeserialization = PropertyName.construct(strFindImplicitPropertyName);
            }
        }
        PropertyName propertyName = propertyNameFindNameForDeserialization;
        String strM11600j = m11600j(strFindImplicitPropertyName);
        C6422s c6422sM11605o = (z11 && strM11600j.isEmpty()) ? m11605o(map, propertyName) : m11606p(map, strM11600j);
        c6422sM11605o.m11636T(annotatedParameter, propertyName, z11, true, false);
        this.f10473k.add(c6422sM11605o);
    }

    /* JADX INFO: renamed from: c */
    public void m11593c(Map<String, C6422s> map) {
        if (this.f10470h) {
            Iterator<AnnotatedConstructor> it = this.f10467e.m11465i().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                AnnotatedConstructor next = it.next();
                if (this.f10473k == null) {
                    this.f10473k = new LinkedList<>();
                }
                int parameterCount = next.getParameterCount();
                for (int i11 = 0; i11 < parameterCount; i11++) {
                    m11592b(map, next.getParameter(i11));
                }
            }
            for (AnnotatedMethod annotatedMethod : this.f10467e.m11467k()) {
                if (this.f10473k == null) {
                    this.f10473k = new LinkedList<>();
                }
                int parameterCount2 = annotatedMethod.getParameterCount();
                for (int i12 = 0; i12 < parameterCount2; i12++) {
                    m11592b(map, annotatedMethod.getParameter(i12));
                }
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public void m11594d(Map<String, C6422s> map) {
        boolean z11;
        AnnotationIntrospector annotationIntrospector = this.f10469g;
        boolean z12 = (this.f10465c || this.f10463a.isEnabled(MapperFeature.ALLOW_FINAL_FIELDS_AS_MUTATORS)) ? false : true;
        boolean zIsEnabled = this.f10463a.isEnabled(MapperFeature.PROPAGATE_TRANSIENT_MARKER);
        for (AnnotatedField annotatedField : this.f10467e.m11461e()) {
            Boolean bool = Boolean.TRUE;
            if (bool.equals(annotationIntrospector.hasAsKey(this.f10463a, annotatedField))) {
                if (this.f10479q == null) {
                    this.f10479q = new LinkedList<>();
                }
                this.f10479q.add(annotatedField);
            }
            if (bool.equals(annotationIntrospector.hasAsValue(annotatedField))) {
                if (this.f10480r == null) {
                    this.f10480r = new LinkedList<>();
                }
                this.f10480r.add(annotatedField);
            } else {
                boolean zEquals = bool.equals(annotationIntrospector.hasAnyGetter(annotatedField));
                boolean zEquals2 = bool.equals(annotationIntrospector.hasAnySetter(annotatedField));
                if (zEquals || zEquals2) {
                    if (zEquals) {
                        if (this.f10476n == null) {
                            this.f10476n = new LinkedList<>();
                        }
                        this.f10476n.add(annotatedField);
                    }
                    if (zEquals2) {
                        if (this.f10478p == null) {
                            this.f10478p = new LinkedList<>();
                        }
                        this.f10478p.add(annotatedField);
                    }
                } else {
                    String strFindImplicitPropertyName = annotationIntrospector.findImplicitPropertyName(annotatedField);
                    if (strFindImplicitPropertyName == null) {
                        strFindImplicitPropertyName = annotatedField.getName();
                    }
                    String strMo11436d = this.f10464b.mo11436d(annotatedField, strFindImplicitPropertyName);
                    if (strMo11436d != null) {
                        PropertyName propertyNameM11604n = m11604n(strMo11436d);
                        PropertyName propertyNameFindRenameByField = annotationIntrospector.findRenameByField(this.f10463a, annotatedField, propertyNameM11604n);
                        if (propertyNameFindRenameByField != null && !propertyNameFindRenameByField.equals(propertyNameM11604n)) {
                            if (this.f10474l == null) {
                                this.f10474l = new HashMap();
                            }
                            this.f10474l.put(propertyNameFindRenameByField, propertyNameM11604n);
                        }
                        PropertyName propertyNameFindNameForSerialization = this.f10465c ? annotationIntrospector.findNameForSerialization(annotatedField) : annotationIntrospector.findNameForDeserialization(annotatedField);
                        boolean z13 = propertyNameFindNameForSerialization != null;
                        if (z13 && propertyNameFindNameForSerialization.isEmpty()) {
                            propertyNameFindNameForSerialization = m11604n(strMo11436d);
                            z11 = false;
                        } else {
                            z11 = z13;
                        }
                        boolean zIsFieldVisible = propertyNameFindNameForSerialization != null;
                        if (!zIsFieldVisible) {
                            zIsFieldVisible = this.f10468f.isFieldVisible(annotatedField);
                        }
                        boolean zHasIgnoreMarker = annotationIntrospector.hasIgnoreMarker(annotatedField);
                        if (annotatedField.isTransient() && !z13) {
                            if (zIsEnabled) {
                                zHasIgnoreMarker = true;
                            }
                            zIsFieldVisible = false;
                        }
                        if (!z12 || propertyNameFindNameForSerialization != null || zHasIgnoreMarker || !Modifier.isFinal(annotatedField.getModifiers())) {
                            m11606p(map, strMo11436d).m11637U(annotatedField, propertyNameFindNameForSerialization, z11, zIsFieldVisible, zHasIgnoreMarker);
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public void m11596f(Map<String, C6422s> map) {
        for (AnnotatedMember annotatedMember : this.f10467e.m11461e()) {
            m11602l(this.f10469g.findInjectableValue(annotatedMember), annotatedMember);
        }
        for (AnnotatedMethod annotatedMethod : this.f10467e.m11470n()) {
            if (annotatedMethod.getParameterCount() == 1) {
                m11602l(this.f10469g.findInjectableValue(annotatedMethod), annotatedMethod);
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public void m11597g(Map<String, C6422s> map) {
        for (AnnotatedMethod annotatedMethod : this.f10467e.m11470n()) {
            int parameterCount = annotatedMethod.getParameterCount();
            if (parameterCount == 0) {
                m11595e(map, annotatedMethod, this.f10469g);
            } else if (parameterCount == 1) {
                m11598h(map, annotatedMethod, this.f10469g);
            } else if (parameterCount == 2 && Boolean.TRUE.equals(this.f10469g.hasAnySetter(annotatedMethod))) {
                if (this.f10477o == null) {
                    this.f10477o = new LinkedList<>();
                }
                this.f10477o.add(annotatedMethod);
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public final String m11600j(String str) {
        PropertyName propertyName;
        Map<PropertyName, PropertyName> map = this.f10474l;
        return (map == null || (propertyName = map.get(m11604n(str))) == null) ? str : propertyName.getSimpleName();
    }

    /* JADX INFO: renamed from: k */
    public void m11601k(String str) {
        if (this.f10465c || str == null) {
            return;
        }
        if (this.f10481s == null) {
            this.f10481s = new HashSet<>();
        }
        this.f10481s.add(str);
    }

    /* JADX INFO: renamed from: l */
    public void m11602l(JacksonInject.Value value, AnnotatedMember annotatedMember) {
        if (value == null) {
            return;
        }
        Object id2 = value.getId();
        if (this.f10482t == null) {
            this.f10482t = new LinkedHashMap<>();
        }
        AnnotatedMember annotatedMemberPut = this.f10482t.put(id2, annotatedMember);
        if (annotatedMemberPut == null || annotatedMemberPut.getClass() != annotatedMember.getClass()) {
            return;
        }
        throw new IllegalArgumentException("Duplicate injectable value with id '" + id2 + "' (of type " + id2.getClass().getName() + ")");
    }

    /* JADX INFO: renamed from: m */
    public final PropertyNamingStrategy m11603m() {
        Object objFindNamingStrategy = this.f10469g.findNamingStrategy(this.f10467e);
        if (objFindNamingStrategy == null) {
            return this.f10463a.getPropertyNamingStrategy();
        }
        if (objFindNamingStrategy instanceof PropertyNamingStrategy) {
            return (PropertyNamingStrategy) objFindNamingStrategy;
        }
        if (!(objFindNamingStrategy instanceof Class)) {
            throw new IllegalStateException("AnnotationIntrospector returned PropertyNamingStrategy definition of type " + objFindNamingStrategy.getClass().getName() + "; expected type PropertyNamingStrategy or Class<PropertyNamingStrategy> instead");
        }
        Class cls = (Class) objFindNamingStrategy;
        if (cls == PropertyNamingStrategy.class) {
            return null;
        }
        if (PropertyNamingStrategy.class.isAssignableFrom(cls)) {
            this.f10463a.getHandlerInstantiator();
            return (PropertyNamingStrategy) C6490g.m11946l(cls, this.f10463a.canOverrideAccessModifiers());
        }
        throw new IllegalStateException("AnnotationIntrospector returned Class " + cls.getName() + "; expected Class<PropertyNamingStrategy>");
    }

    /* JADX INFO: renamed from: q */
    public void m11607q(Map<String, C6422s> map) {
        boolean zIsEnabled = this.f10463a.isEnabled(MapperFeature.INFER_PROPERTY_MUTATORS);
        Iterator<C6422s> it = map.values().iterator();
        while (it.hasNext()) {
            it.next().m11657p0(zIsEnabled, this.f10465c ? null : this);
        }
    }

    /* JADX INFO: renamed from: w */
    public void m11613w(Map<String, C6422s> map) {
        Collection<C6422s> collectionValues;
        AnnotationIntrospector annotationIntrospector = this.f10469g;
        Boolean boolFindSerializationSortAlphabetically = annotationIntrospector.findSerializationSortAlphabetically(this.f10467e);
        boolean zShouldSortPropertiesAlphabetically = boolFindSerializationSortAlphabetically == null ? this.f10463a.shouldSortPropertiesAlphabetically() : boolFindSerializationSortAlphabetically.booleanValue();
        boolean zM11599i = m11599i(map.values());
        String[] strArrFindSerializationPropertyOrder = annotationIntrospector.findSerializationPropertyOrder(this.f10467e);
        if (zShouldSortPropertiesAlphabetically || zM11599i || this.f10473k != null || strArrFindSerializationPropertyOrder != null) {
            int size = map.size();
            Map<? extends Object, ? extends Object> treeMap = zShouldSortPropertiesAlphabetically ? new TreeMap<>() : new LinkedHashMap<>(size + size);
            for (C6422s c6422s : map.values()) {
                treeMap.put(c6422s.getName(), c6422s);
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(size + size);
            if (strArrFindSerializationPropertyOrder != null) {
                for (String name : strArrFindSerializationPropertyOrder) {
                    C6422s c6422s2 = (C6422s) treeMap.remove(name);
                    if (c6422s2 == null) {
                        for (C6422s c6422s3 : map.values()) {
                            if (name.equals(c6422s3.m11650h0())) {
                                name = c6422s3.getName();
                                c6422s2 = c6422s3;
                                break;
                            }
                        }
                    }
                    if (c6422s2 != null) {
                        linkedHashMap.put(name, c6422s2);
                    }
                }
            }
            if (zM11599i) {
                TreeMap treeMap2 = new TreeMap();
                Iterator<Map.Entry<? extends Object, ? extends Object>> it = treeMap.entrySet().iterator();
                while (it.hasNext()) {
                    C6422s c6422s4 = (C6422s) it.next().getValue();
                    Integer index = c6422s4.getMetadata().getIndex();
                    if (index != null) {
                        treeMap2.put(index, c6422s4);
                        it.remove();
                    }
                }
                for (C6422s c6422s5 : treeMap2.values()) {
                    linkedHashMap.put(c6422s5.getName(), c6422s5);
                }
            }
            if (this.f10473k != null && (!zShouldSortPropertiesAlphabetically || this.f10463a.isEnabled(MapperFeature.SORT_CREATOR_PROPERTIES_FIRST))) {
                if (zShouldSortPropertiesAlphabetically) {
                    TreeMap treeMap3 = new TreeMap();
                    for (C6422s c6422s6 : this.f10473k) {
                        treeMap3.put(c6422s6.getName(), c6422s6);
                    }
                    collectionValues = treeMap3.values();
                } else {
                    collectionValues = this.f10473k;
                }
                for (C6422s c6422s7 : collectionValues) {
                    String name2 = c6422s7.getName();
                    if (treeMap.containsKey(name2)) {
                        linkedHashMap.put(name2, c6422s7);
                    }
                }
            }
            linkedHashMap.putAll(treeMap);
            map.clear();
            map.putAll(linkedHashMap);
        }
    }

    /* JADX INFO: renamed from: x */
    public void m11614x() {
        LinkedHashMap<String, C6422s> linkedHashMap = new LinkedHashMap<>();
        m11594d(linkedHashMap);
        m11597g(linkedHashMap);
        if (!this.f10467e.m11469m()) {
            m11593c(linkedHashMap);
        }
        m11608r(linkedHashMap);
        m11607q(linkedHashMap);
        m11609s(linkedHashMap);
        m11596f(linkedHashMap);
        Iterator<C6422s> it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            it.next().m11654m0(this.f10465c);
        }
        PropertyNamingStrategy propertyNamingStrategyM11603m = m11603m();
        if (propertyNamingStrategyM11603m != null) {
            m11610t(linkedHashMap, propertyNamingStrategyM11603m);
        }
        Iterator<C6422s> it2 = linkedHashMap.values().iterator();
        while (it2.hasNext()) {
            it2.next().m11658q0();
        }
        if (this.f10463a.isEnabled(MapperFeature.USE_WRAPPER_NAME_AS_PROPERTY_NAME)) {
            m11611u(linkedHashMap);
        }
        m11613w(linkedHashMap);
        this.f10472j = linkedHashMap;
        this.f10471i = true;
    }

    /* JADX INFO: renamed from: y */
    public AnnotatedMember m11615y() {
        if (!this.f10471i) {
            m11614x();
        }
        LinkedList<AnnotatedMember> linkedList = this.f10476n;
        if (linkedList == null) {
            return null;
        }
        if (linkedList.size() > 1) {
            m11591N("Multiple 'any-getter' fields defined (%s vs %s)", this.f10476n.get(0), this.f10476n.get(1));
        }
        return this.f10476n.getFirst();
    }

    /* JADX INFO: renamed from: z */
    public AnnotatedMember m11616z() {
        if (!this.f10471i) {
            m11614x();
        }
        LinkedList<AnnotatedMember> linkedList = this.f10475m;
        if (linkedList == null) {
            return null;
        }
        if (linkedList.size() > 1) {
            m11591N("Multiple 'any-getter' methods defined (%s vs %s)", this.f10475m.get(0), this.f10475m.get(1));
        }
        return this.f10475m.getFirst();
    }

    @Deprecated
    /* JADX INFO: renamed from: I */
    public AnnotatedMethod m11586I() {
        AnnotatedMember annotatedMemberM11585H = m11585H();
        if (annotatedMemberM11585H instanceof AnnotatedMethod) {
            return (AnnotatedMethod) annotatedMemberM11585H;
        }
        return null;
    }

    /* JADX INFO: renamed from: K */
    public List<AbstractC6414k> m11588K() {
        return new ArrayList(m11589L().values());
    }

    /* JADX INFO: renamed from: e */
    public void m11595e(Map<String, C6422s> map, AnnotatedMethod annotatedMethod, AnnotationIntrospector annotationIntrospector) {
        boolean z11;
        PropertyName propertyName;
        boolean z12;
        boolean z13;
        String strFindImplicitPropertyName;
        boolean zIsGetterVisible;
        Class<?> rawReturnType = annotatedMethod.getRawReturnType();
        if (rawReturnType != Void.TYPE) {
            if (rawReturnType != Void.class || this.f10463a.isEnabled(MapperFeature.ALLOW_VOID_VALUED_PROPERTIES)) {
                Boolean bool = Boolean.TRUE;
                if (bool.equals(annotationIntrospector.hasAnyGetter(annotatedMethod))) {
                    if (this.f10475m == null) {
                        this.f10475m = new LinkedList<>();
                    }
                    this.f10475m.add(annotatedMethod);
                    return;
                }
                if (bool.equals(annotationIntrospector.hasAsKey(this.f10463a, annotatedMethod))) {
                    if (this.f10479q == null) {
                        this.f10479q = new LinkedList<>();
                    }
                    this.f10479q.add(annotatedMethod);
                    return;
                }
                if (bool.equals(annotationIntrospector.hasAsValue(annotatedMethod))) {
                    if (this.f10480r == null) {
                        this.f10480r = new LinkedList<>();
                    }
                    this.f10480r.add(annotatedMethod);
                    return;
                }
                PropertyName propertyNameFindNameForSerialization = annotationIntrospector.findNameForSerialization(annotatedMethod);
                boolean z14 = false;
                if (propertyNameFindNameForSerialization != null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!z11) {
                    strFindImplicitPropertyName = annotationIntrospector.findImplicitPropertyName(annotatedMethod);
                    if (strFindImplicitPropertyName == null) {
                        strFindImplicitPropertyName = this.f10464b.mo11435c(annotatedMethod, annotatedMethod.getName());
                    }
                    if (strFindImplicitPropertyName == null) {
                        strFindImplicitPropertyName = this.f10464b.mo11433a(annotatedMethod, annotatedMethod.getName());
                        if (strFindImplicitPropertyName != null) {
                            zIsGetterVisible = this.f10468f.isIsGetterVisible(annotatedMethod);
                        } else {
                            return;
                        }
                    } else {
                        zIsGetterVisible = this.f10468f.isGetterVisible(annotatedMethod);
                    }
                    propertyName = propertyNameFindNameForSerialization;
                    z13 = zIsGetterVisible;
                    z12 = z11;
                } else {
                    String strFindImplicitPropertyName2 = annotationIntrospector.findImplicitPropertyName(annotatedMethod);
                    if (strFindImplicitPropertyName2 == null && (strFindImplicitPropertyName2 = this.f10464b.mo11435c(annotatedMethod, annotatedMethod.getName())) == null) {
                        strFindImplicitPropertyName2 = this.f10464b.mo11433a(annotatedMethod, annotatedMethod.getName());
                    }
                    if (strFindImplicitPropertyName2 == null) {
                        strFindImplicitPropertyName2 = annotatedMethod.getName();
                    }
                    if (propertyNameFindNameForSerialization.isEmpty()) {
                        propertyNameFindNameForSerialization = m11604n(strFindImplicitPropertyName2);
                    } else {
                        z14 = z11;
                    }
                    propertyName = propertyNameFindNameForSerialization;
                    z12 = z14;
                    z13 = true;
                    strFindImplicitPropertyName = strFindImplicitPropertyName2;
                }
                m11606p(map, m11600j(strFindImplicitPropertyName)).m11638V(annotatedMethod, propertyName, z12, z13, annotationIntrospector.hasIgnoreMarker(annotatedMethod));
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public void m11598h(Map<String, C6422s> map, AnnotatedMethod annotatedMethod, AnnotationIntrospector annotationIntrospector) {
        boolean z11;
        boolean z12;
        String strFindImplicitPropertyName;
        PropertyName propertyNameFindNameForDeserialization = annotationIntrospector.findNameForDeserialization(annotatedMethod);
        boolean z13 = false;
        boolean zIsSetterVisible = true;
        if (propertyNameFindNameForDeserialization != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11) {
            strFindImplicitPropertyName = annotationIntrospector.findImplicitPropertyName(annotatedMethod);
            if (strFindImplicitPropertyName == null) {
                strFindImplicitPropertyName = this.f10464b.mo11434b(annotatedMethod, annotatedMethod.getName());
            }
            if (strFindImplicitPropertyName == null) {
                return;
            }
            zIsSetterVisible = this.f10468f.isSetterVisible(annotatedMethod);
            z12 = z11;
        } else {
            String strFindImplicitPropertyName2 = annotationIntrospector.findImplicitPropertyName(annotatedMethod);
            if (strFindImplicitPropertyName2 == null) {
                strFindImplicitPropertyName2 = this.f10464b.mo11434b(annotatedMethod, annotatedMethod.getName());
            }
            if (strFindImplicitPropertyName2 == null) {
                strFindImplicitPropertyName2 = annotatedMethod.getName();
            }
            if (propertyNameFindNameForDeserialization.isEmpty()) {
                propertyNameFindNameForDeserialization = m11604n(strFindImplicitPropertyName2);
            } else {
                z13 = z11;
            }
            z12 = z13;
            strFindImplicitPropertyName = strFindImplicitPropertyName2;
        }
        PropertyName propertyName = propertyNameFindNameForDeserialization;
        boolean z14 = zIsSetterVisible;
        m11606p(map, m11600j(strFindImplicitPropertyName)).m11639W(annotatedMethod, propertyName, z12, z14, annotationIntrospector.hasIgnoreMarker(annotatedMethod));
    }

    /* JADX INFO: renamed from: i */
    public final boolean m11599i(Collection<C6422s> collection) {
        Iterator<C6422s> it = collection.iterator();
        while (it.hasNext()) {
            if (it.next().getMetadata().hasIndex()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: o */
    public C6422s m11605o(Map<String, C6422s> map, PropertyName propertyName) {
        String simpleName = propertyName.getSimpleName();
        C6422s c6422s = map.get(simpleName);
        if (c6422s == null) {
            C6422s c6422s2 = new C6422s(this.f10463a, this.f10469g, this.f10465c, propertyName);
            map.put(simpleName, c6422s2);
            return c6422s2;
        }
        return c6422s;
    }

    /* JADX INFO: renamed from: p */
    public C6422s m11606p(Map<String, C6422s> map, String str) {
        C6422s c6422s = map.get(str);
        if (c6422s == null) {
            C6422s c6422s2 = new C6422s(this.f10463a, this.f10469g, this.f10465c, PropertyName.construct(str));
            map.put(str, c6422s2);
            return c6422s2;
        }
        return c6422s;
    }

    /* JADX INFO: renamed from: r */
    public void m11608r(Map<String, C6422s> map) {
        Iterator<C6422s> it = map.values().iterator();
        while (it.hasNext()) {
            C6422s next = it.next();
            if (!next.m11641Y()) {
                it.remove();
            } else if (next.m11640X()) {
                if (!next.mo11550w()) {
                    it.remove();
                    m11601k(next.getName());
                } else {
                    next.m11656o0();
                    if (!next.mo11528a()) {
                        m11601k(next.getName());
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public void m11609s(Map<String, C6422s> map) {
        HashSet<String> hashSet;
        Iterator<Map.Entry<String, C6422s>> it = map.entrySet().iterator();
        LinkedList<C6422s> linkedList = null;
        while (it.hasNext()) {
            C6422s value = it.next().getValue();
            Set<PropertyName> setM11645c0 = value.m11645c0();
            if (!setM11645c0.isEmpty()) {
                it.remove();
                if (linkedList == null) {
                    linkedList = new LinkedList();
                }
                if (setM11645c0.size() == 1) {
                    linkedList.add(value.m11659r0(setM11645c0.iterator().next()));
                } else {
                    linkedList.addAll(value.m11643a0(setM11645c0));
                }
            }
        }
        if (linkedList != null) {
            for (C6422s c6422s : linkedList) {
                String name = c6422s.getName();
                C6422s c6422s2 = map.get(name);
                if (c6422s2 == null) {
                    map.put(name, c6422s);
                } else {
                    c6422s2.m11635S(c6422s);
                }
                if (m11612v(c6422s, this.f10473k) && (hashSet = this.f10481s) != null) {
                    hashSet.remove(name);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00af  */
    /* JADX INFO: renamed from: t */
    public void m11610t(Map<String, C6422s> map, PropertyNamingStrategy propertyNamingStrategy) {
        String strNameForGetterMethod;
        C6422s[] c6422sArr = (C6422s[]) map.values().toArray(new C6422s[map.size()]);
        map.clear();
        for (C6422s c6422sM11660s0 : c6422sArr) {
            PropertyName fullName = c6422sM11660s0.getFullName();
            if (!c6422sM11660s0.mo11551x() || this.f10463a.isEnabled(MapperFeature.ALLOW_EXPLICIT_PROPERTY_RENAMING)) {
                if (this.f10465c) {
                    if (c6422sM11660s0.m11653k0()) {
                        strNameForGetterMethod = propertyNamingStrategy.nameForGetterMethod(this.f10463a, c6422sM11660s0.mo11539l(), fullName.getSimpleName());
                    } else if (c6422sM11660s0.mo11547t()) {
                        strNameForGetterMethod = propertyNamingStrategy.nameForField(this.f10463a, c6422sM11660s0.mo11538k(), fullName.getSimpleName());
                    } else {
                        strNameForGetterMethod = null;
                    }
                } else if (c6422sM11660s0.mo11549v()) {
                    strNameForGetterMethod = propertyNamingStrategy.nameForSetterMethod(this.f10463a, c6422sM11660s0.m11652j0(), fullName.getSimpleName());
                } else if (c6422sM11660s0.mo11546s()) {
                    strNameForGetterMethod = propertyNamingStrategy.nameForConstructorParameter(this.f10463a, c6422sM11660s0.mo11536i(), fullName.getSimpleName());
                } else if (c6422sM11660s0.mo11547t()) {
                    strNameForGetterMethod = propertyNamingStrategy.nameForField(this.f10463a, c6422sM11660s0.m11648f0(), fullName.getSimpleName());
                } else if (c6422sM11660s0.m11653k0()) {
                    strNameForGetterMethod = propertyNamingStrategy.nameForGetterMethod(this.f10463a, c6422sM11660s0.m11649g0(), fullName.getSimpleName());
                } else {
                    strNameForGetterMethod = null;
                }
            } else {
                strNameForGetterMethod = null;
            }
            if (strNameForGetterMethod != null && !fullName.hasSimpleName(strNameForGetterMethod)) {
                c6422sM11660s0 = c6422sM11660s0.m11660s0(strNameForGetterMethod);
            } else {
                strNameForGetterMethod = fullName.getSimpleName();
            }
            C6422s c6422s = map.get(strNameForGetterMethod);
            if (c6422s == null) {
                map.put(strNameForGetterMethod, c6422sM11660s0);
            } else {
                c6422s.m11635S(c6422sM11660s0);
            }
            m11612v(c6422sM11660s0, this.f10473k);
        }
    }

    /* JADX INFO: renamed from: u */
    public void m11611u(Map<String, C6422s> map) {
        PropertyName propertyNameFindWrapperName;
        Iterator<Map.Entry<String, C6422s>> it = map.entrySet().iterator();
        LinkedList<C6422s> linkedList = null;
        while (it.hasNext()) {
            C6422s value = it.next().getValue();
            AnnotatedMember annotatedMemberMo11542o = value.mo11542o();
            if (annotatedMemberMo11542o != null && (propertyNameFindWrapperName = this.f10469g.findWrapperName(annotatedMemberMo11542o)) != null && propertyNameFindWrapperName.hasSimpleName() && !propertyNameFindWrapperName.equals(value.getFullName())) {
                if (linkedList == null) {
                    linkedList = new LinkedList();
                }
                linkedList.add(value.m11659r0(propertyNameFindWrapperName));
                it.remove();
            }
        }
        if (linkedList != null) {
            for (C6422s c6422s : linkedList) {
                String name = c6422s.getName();
                C6422s c6422s2 = map.get(name);
                if (c6422s2 == null) {
                    map.put(name, c6422s);
                } else {
                    c6422s2.m11635S(c6422s);
                }
            }
        }
    }

    @Deprecated
    public C6420q(MapperConfig<?> mapperConfig, boolean z11, JavaType javaType, C6406c c6406c, String str) {
        this(mapperConfig, z11, javaType, c6406c, m11577a(mapperConfig, c6406c, str));
        this.f10484v = str;
    }
}
