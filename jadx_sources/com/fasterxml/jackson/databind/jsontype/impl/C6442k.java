package com.fasterxml.jackson.databind.jsontype.impl;

import com.fasterxml.jackson.databind.AbstractC6341c;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.fasterxml.jackson.databind.jsontype.impl.k */
/* JADX INFO: compiled from: TypeNameIdResolver.java */
/* JADX INFO: loaded from: classes45.dex */
public class C6442k extends AbstractC6441j {

    /* JADX INFO: renamed from: c */
    public final MapperConfig<?> f10542c;

    /* JADX INFO: renamed from: d */
    public final ConcurrentHashMap<String, String> f10543d;

    /* JADX INFO: renamed from: e */
    public final Map<String, JavaType> f10544e;

    /* JADX INFO: renamed from: f */
    public final boolean f10545f;

    /* JADX INFO: renamed from: i */
    public static C6442k m11710i(MapperConfig<?> mapperConfig, JavaType javaType, Collection<NamedType> collection, boolean z11, boolean z12) {
        HashMap map;
        ConcurrentHashMap concurrentHashMap;
        if (z11 == z12) {
            throw new IllegalArgumentException();
        }
        if (z11) {
            concurrentHashMap = new ConcurrentHashMap();
            map = null;
        } else {
            map = new HashMap();
            concurrentHashMap = new ConcurrentHashMap(4);
        }
        boolean zIsEnabled = mapperConfig.isEnabled(MapperFeature.ACCEPT_CASE_INSENSITIVE_VALUES);
        if (collection != null) {
            for (NamedType namedType : collection) {
                Class<?> type = namedType.getType();
                String name = namedType.hasName() ? namedType.getName() : m11709g(type);
                if (z11) {
                    concurrentHashMap.put(type.getName(), name);
                }
                if (z12) {
                    if (zIsEnabled) {
                        name = name.toLowerCase();
                    }
                    JavaType javaType2 = (JavaType) map.get(name);
                    if (javaType2 == null || !type.isAssignableFrom(javaType2.getRawClass())) {
                        map.put(name, mapperConfig.constructType(type));
                    }
                }
            }
        }
        return new C6442k(mapperConfig, javaType, concurrentHashMap, map);
    }

    @Override // com.fasterxml.jackson.databind.jsontype.InterfaceC6429c
    /* JADX INFO: renamed from: b */
    public String mo11684b() {
        TreeSet treeSet = new TreeSet();
        for (Map.Entry<String, JavaType> entry : this.f10544e.entrySet()) {
            if (entry.getValue().isConcrete()) {
                treeSet.add(entry.getKey());
            }
        }
        return treeSet.toString();
    }

    @Override // com.fasterxml.jackson.databind.jsontype.InterfaceC6429c
    /* JADX INFO: renamed from: e */
    public String mo11687e(Object obj, Class<?> cls) {
        return obj == null ? m11712j(cls) : mo11683a(obj);
    }

    /* JADX INFO: renamed from: h */
    public JavaType m11711h(String str) {
        if (this.f10545f) {
            str = str.toLowerCase();
        }
        return this.f10544e.get(str);
    }

    /* JADX INFO: renamed from: j */
    public String m11712j(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        String name = cls.getName();
        String strM11709g = this.f10543d.get(name);
        if (strM11709g == null) {
            Class<?> rawClass = this.f10540a.constructType(cls).getRawClass();
            if (this.f10542c.isAnnotationProcessingEnabled()) {
                strM11709g = this.f10542c.getAnnotationIntrospector().findTypeName(this.f10542c.introspectClassAnnotations(rawClass).mo11174t());
            }
            if (strM11709g == null) {
                strM11709g = m11709g(rawClass);
            }
            this.f10543d.put(name, strM11709g);
        }
        return strM11709g;
    }

    public C6442k(MapperConfig<?> mapperConfig, JavaType javaType, ConcurrentHashMap<String, String> concurrentHashMap, HashMap<String, JavaType> map) {
        super(javaType, mapperConfig.getTypeFactory());
        this.f10542c = mapperConfig;
        this.f10543d = concurrentHashMap;
        this.f10544e = map;
        this.f10545f = mapperConfig.isEnabled(MapperFeature.ACCEPT_CASE_INSENSITIVE_VALUES);
    }

    /* JADX INFO: renamed from: g */
    public static String m11709g(Class<?> cls) {
        String name = cls.getName();
        int iLastIndexOf = name.lastIndexOf(46);
        if (iLastIndexOf < 0) {
            return name;
        }
        return name.substring(iLastIndexOf + 1);
    }

    @Override // com.fasterxml.jackson.databind.jsontype.InterfaceC6429c
    /* JADX INFO: renamed from: a */
    public String mo11683a(Object obj) {
        return m11712j(obj.getClass());
    }

    @Override // com.fasterxml.jackson.databind.jsontype.InterfaceC6429c
    /* JADX INFO: renamed from: c */
    public JavaType mo11685c(AbstractC6341c abstractC6341c, String str) {
        return m11711h(str);
    }

    public String toString() {
        return String.format("[%s; id-to-type=%s]", getClass().getName(), this.f10544e);
    }
}
