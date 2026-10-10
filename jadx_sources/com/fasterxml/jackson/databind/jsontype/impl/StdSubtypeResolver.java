package com.fasterxml.jackson.databind.jsontype.impl;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.C6406c;
import com.fasterxml.jackson.databind.introspect.C6407d;
import com.fasterxml.jackson.databind.jsontype.AbstractC6427a;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import java.io.Serializable;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes45.dex */
public class StdSubtypeResolver extends AbstractC6427a implements Serializable {
    private static final long serialVersionUID = 1;
    protected LinkedHashSet<NamedType> _registeredSubtypes;

    public StdSubtypeResolver() {
    }

    @Override // com.fasterxml.jackson.databind.jsontype.AbstractC6427a
    public Collection<NamedType> collectAndResolveSubtypesByClass(MapperConfig<?> mapperConfig, AnnotatedMember annotatedMember, JavaType javaType) {
        Class<?> rawType;
        List<NamedType> listFindSubtypes;
        MapperConfig<?> mapperConfig2;
        AnnotationIntrospector annotationIntrospector = mapperConfig.getAnnotationIntrospector();
        if (javaType != null) {
            rawType = javaType.getRawClass();
        } else {
            if (annotatedMember == null) {
                throw new IllegalArgumentException("Both property and base type are nulls");
            }
            rawType = annotatedMember.getRawType();
        }
        HashMap<NamedType, NamedType> map = new HashMap<>();
        LinkedHashSet<NamedType> linkedHashSet = this._registeredSubtypes;
        if (linkedHashSet != null) {
            for (NamedType namedType : linkedHashSet) {
                if (rawType.isAssignableFrom(namedType.getType())) {
                    mapperConfig2 = mapperConfig;
                    _collectAndResolve(C6407d.m11478n(mapperConfig, namedType.getType()), namedType, mapperConfig2, annotationIntrospector, map);
                } else {
                    mapperConfig2 = mapperConfig;
                }
                mapperConfig = mapperConfig2;
            }
        }
        MapperConfig<?> mapperConfig3 = mapperConfig;
        if (annotatedMember != null && (listFindSubtypes = annotationIntrospector.findSubtypes(annotatedMember)) != null) {
            for (NamedType namedType2 : listFindSubtypes) {
                _collectAndResolve(C6407d.m11478n(mapperConfig3, namedType2.getType()), namedType2, mapperConfig3, annotationIntrospector, map);
            }
        }
        _collectAndResolve(C6407d.m11478n(mapperConfig3, rawType), new NamedType(rawType, null), mapperConfig3, annotationIntrospector, map);
        return new ArrayList(map.values());
    }

    @Override // com.fasterxml.jackson.databind.jsontype.AbstractC6427a
    public Collection<NamedType> collectAndResolveSubtypesByTypeId(MapperConfig<?> mapperConfig, AnnotatedMember annotatedMember, JavaType javaType) {
        List<NamedType> listFindSubtypes;
        AnnotationIntrospector annotationIntrospector = mapperConfig.getAnnotationIntrospector();
        Class<?> rawClass = javaType.getRawClass();
        HashSet hashSet = new HashSet();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        _collectAndResolveByTypeId(C6407d.m11478n(mapperConfig, rawClass), new NamedType(rawClass, null), mapperConfig, hashSet, linkedHashMap);
        if (annotatedMember != null && (listFindSubtypes = annotationIntrospector.findSubtypes(annotatedMember)) != null) {
            for (NamedType namedType : listFindSubtypes) {
                _collectAndResolveByTypeId(C6407d.m11478n(mapperConfig, namedType.getType()), namedType, mapperConfig, hashSet, linkedHashMap);
            }
        }
        LinkedHashSet<NamedType> linkedHashSet = this._registeredSubtypes;
        if (linkedHashSet != null) {
            for (NamedType namedType2 : linkedHashSet) {
                if (rawClass.isAssignableFrom(namedType2.getType())) {
                    _collectAndResolveByTypeId(C6407d.m11478n(mapperConfig, namedType2.getType()), namedType2, mapperConfig, hashSet, linkedHashMap);
                }
            }
        }
        return _combineNamedAndUnnamed(rawClass, hashSet, linkedHashMap);
    }

    @Override // com.fasterxml.jackson.databind.jsontype.AbstractC6427a
    public void registerSubtypes(NamedType... namedTypeArr) {
        if (this._registeredSubtypes == null) {
            this._registeredSubtypes = new LinkedHashSet<>();
        }
        for (NamedType namedType : namedTypeArr) {
            this._registeredSubtypes.add(namedType);
        }
    }

    public StdSubtypeResolver(StdSubtypeResolver stdSubtypeResolver) {
        LinkedHashSet<NamedType> linkedHashSet = stdSubtypeResolver._registeredSubtypes;
        this._registeredSubtypes = linkedHashSet == null ? null : new LinkedHashSet<>(linkedHashSet);
    }

    public Collection<NamedType> _combineNamedAndUnnamed(Class<?> cls, Set<Class<?>> set, Map<String, NamedType> map) {
        ArrayList arrayList = new ArrayList(map.values());
        Iterator<NamedType> it = map.values().iterator();
        while (it.hasNext()) {
            set.remove(it.next().getType());
        }
        for (Class<?> cls2 : set) {
            if (cls2 != cls || !Modifier.isAbstract(cls2.getModifiers())) {
                arrayList.add(new NamedType(cls2));
            }
        }
        return arrayList;
    }

    @Override // com.fasterxml.jackson.databind.jsontype.AbstractC6427a
    public AbstractC6427a copy() {
        return new StdSubtypeResolver(this);
    }

    public void _collectAndResolve(C6406c c6406c, NamedType namedType, MapperConfig<?> mapperConfig, AnnotationIntrospector annotationIntrospector, HashMap<NamedType, NamedType> map) {
        String strFindTypeName;
        if (!namedType.hasName() && (strFindTypeName = annotationIntrospector.findTypeName(c6406c)) != null) {
            namedType = new NamedType(namedType.getType(), strFindTypeName);
        }
        NamedType namedType2 = new NamedType(namedType.getType());
        if (map.containsKey(namedType2)) {
            if (namedType.hasName() && !map.get(namedType2).hasName()) {
                map.put(namedType2, namedType);
                return;
            }
            return;
        }
        map.put(namedType2, namedType);
        List<NamedType> listFindSubtypes = annotationIntrospector.findSubtypes(c6406c);
        if (listFindSubtypes != null && !listFindSubtypes.isEmpty()) {
            for (NamedType namedType3 : listFindSubtypes) {
                _collectAndResolve(C6407d.m11478n(mapperConfig, namedType3.getType()), namedType3, mapperConfig, annotationIntrospector, map);
            }
        }
    }

    public void _collectAndResolveByTypeId(C6406c c6406c, NamedType namedType, MapperConfig<?> mapperConfig, Set<Class<?>> set, Map<String, NamedType> map) {
        List<NamedType> listFindSubtypes;
        String strFindTypeName;
        AnnotationIntrospector annotationIntrospector = mapperConfig.getAnnotationIntrospector();
        if (!namedType.hasName() && (strFindTypeName = annotationIntrospector.findTypeName(c6406c)) != null) {
            namedType = new NamedType(namedType.getType(), strFindTypeName);
        }
        if (namedType.hasName()) {
            map.put(namedType.getName(), namedType);
        }
        if (set.add(namedType.getType()) && (listFindSubtypes = annotationIntrospector.findSubtypes(c6406c)) != null && !listFindSubtypes.isEmpty()) {
            for (NamedType namedType2 : listFindSubtypes) {
                _collectAndResolveByTypeId(C6407d.m11478n(mapperConfig, namedType2.getType()), namedType2, mapperConfig, set, map);
            }
        }
    }

    @Override // com.fasterxml.jackson.databind.jsontype.AbstractC6427a
    public void registerSubtypes(Class<?>... clsArr) {
        NamedType[] namedTypeArr = new NamedType[clsArr.length];
        int length = clsArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            namedTypeArr[i11] = new NamedType(clsArr[i11]);
        }
        registerSubtypes(namedTypeArr);
    }

    @Override // com.fasterxml.jackson.databind.jsontype.AbstractC6427a
    public void registerSubtypes(Collection<Class<?>> collection) {
        NamedType[] namedTypeArr = new NamedType[collection.size()];
        Iterator<Class<?>> it = collection.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            namedTypeArr[i11] = new NamedType(it.next());
            i11++;
        }
        registerSubtypes(namedTypeArr);
    }

    @Override // com.fasterxml.jackson.databind.jsontype.AbstractC6427a
    public Collection<NamedType> collectAndResolveSubtypesByTypeId(MapperConfig<?> mapperConfig, C6406c c6406c) {
        Class<?> rawType = c6406c.getRawType();
        HashSet hashSet = new HashSet();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        _collectAndResolveByTypeId(c6406c, new NamedType(rawType, null), mapperConfig, hashSet, linkedHashMap);
        LinkedHashSet<NamedType> linkedHashSet = this._registeredSubtypes;
        if (linkedHashSet != null) {
            for (NamedType namedType : linkedHashSet) {
                if (rawType.isAssignableFrom(namedType.getType())) {
                    _collectAndResolveByTypeId(C6407d.m11478n(mapperConfig, namedType.getType()), namedType, mapperConfig, hashSet, linkedHashMap);
                }
            }
        }
        return _combineNamedAndUnnamed(rawType, hashSet, linkedHashMap);
    }

    @Override // com.fasterxml.jackson.databind.jsontype.AbstractC6427a
    public Collection<NamedType> collectAndResolveSubtypesByClass(MapperConfig<?> mapperConfig, C6406c c6406c) {
        MapperConfig<?> mapperConfig2;
        AnnotationIntrospector annotationIntrospector = mapperConfig.getAnnotationIntrospector();
        HashMap<NamedType, NamedType> map = new HashMap<>();
        if (this._registeredSubtypes != null) {
            Class<?> rawType = c6406c.getRawType();
            for (NamedType namedType : this._registeredSubtypes) {
                if (rawType.isAssignableFrom(namedType.getType())) {
                    mapperConfig2 = mapperConfig;
                    _collectAndResolve(C6407d.m11478n(mapperConfig, namedType.getType()), namedType, mapperConfig2, annotationIntrospector, map);
                } else {
                    mapperConfig2 = mapperConfig;
                }
                mapperConfig = mapperConfig2;
            }
        }
        _collectAndResolve(c6406c, new NamedType(c6406c.getRawType(), null), mapperConfig, annotationIntrospector, map);
        return new ArrayList(map.values());
    }
}
