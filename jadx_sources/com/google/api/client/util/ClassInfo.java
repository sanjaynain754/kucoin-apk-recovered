package com.google.api.client.util;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes56.dex */
public final class ClassInfo {
    private static final ConcurrentMap<Class<?>, ClassInfo> CACHE = new ConcurrentHashMap();
    private static final ConcurrentMap<Class<?>, ClassInfo> CACHE_IGNORE_CASE = new ConcurrentHashMap();
    private final Class<?> clazz;
    private final boolean ignoreCase;
    private final IdentityHashMap<String, FieldInfo> nameToFieldInfoMap = new IdentityHashMap<>();
    final List<String> names;

    /* JADX INFO: renamed from: of */
    public static ClassInfo m13331of(Class<?> cls) {
        return m13332of(cls, false);
    }

    /* JADX INFO: renamed from: of */
    public static ClassInfo m13332of(Class<?> cls, boolean z11) {
        if (cls == null) {
            return null;
        }
        ConcurrentMap<Class<?>, ClassInfo> concurrentMap = z11 ? CACHE_IGNORE_CASE : CACHE;
        ClassInfo classInfo = concurrentMap.get(cls);
        if (classInfo != null) {
            return classInfo;
        }
        ClassInfo classInfo2 = new ClassInfo(cls, z11);
        ClassInfo classInfoPutIfAbsent = concurrentMap.putIfAbsent(cls, classInfo2);
        return classInfoPutIfAbsent == null ? classInfo2 : classInfoPutIfAbsent;
    }

    public FieldInfo getFieldInfo(String str) {
        if (str != null) {
            if (this.ignoreCase) {
                str = str.toLowerCase(Locale.US);
            }
            str = str.intern();
        }
        return this.nameToFieldInfoMap.get(str);
    }

    public Collection<FieldInfo> getFieldInfos() {
        return Collections.unmodifiableCollection(this.nameToFieldInfoMap.values());
    }

    public final boolean getIgnoreCase() {
        return this.ignoreCase;
    }

    public Collection<String> getNames() {
        return this.names;
    }

    public Class<?> getUnderlyingClass() {
        return this.clazz;
    }

    public boolean isEnum() {
        return this.clazz.isEnum();
    }

    private ClassInfo(Class<?> cls, boolean z11) {
        boolean z12;
        List<String> listUnmodifiableList;
        boolean z13;
        String str;
        Field field;
        this.clazz = cls;
        this.ignoreCase = z11;
        if (z11 && cls.isEnum()) {
            z12 = false;
        } else {
            z12 = true;
        }
        Preconditions.checkArgument(z12, "cannot ignore case on an enum: " + cls);
        TreeSet treeSet = new TreeSet(new Comparator<String>() { // from class: com.google.api.client.util.ClassInfo.1
            @Override // java.util.Comparator
            public int compare(String str2, String str3) {
                if (Objects.equal(str2, str3)) {
                    return 0;
                }
                if (str2 == null) {
                    return -1;
                }
                if (str3 == null) {
                    return 1;
                }
                return str2.compareTo(str3);
            }
        });
        for (Field field2 : cls.getDeclaredFields()) {
            FieldInfo fieldInfoM13334of = FieldInfo.m13334of(field2);
            if (fieldInfoM13334of != null) {
                String name = fieldInfoM13334of.getName();
                name = z11 ? name.toLowerCase(Locale.US).intern() : name;
                FieldInfo fieldInfo = this.nameToFieldInfoMap.get(name);
                if (fieldInfo == null) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (z11) {
                    str = "case-insensitive ";
                } else {
                    str = "";
                }
                if (fieldInfo == null) {
                    field = null;
                } else {
                    field = fieldInfo.getField();
                }
                Preconditions.checkArgument(z13, "two fields have the same %sname <%s>: %s and %s", str, name, field2, field);
                this.nameToFieldInfoMap.put(name, fieldInfoM13334of);
                treeSet.add(name);
            }
        }
        Class<? super Object> superclass = cls.getSuperclass();
        if (superclass != null) {
            ClassInfo classInfoM13332of = m13332of(superclass, z11);
            treeSet.addAll(classInfoM13332of.names);
            for (Map.Entry<String, FieldInfo> entry : classInfoM13332of.nameToFieldInfoMap.entrySet()) {
                String key = entry.getKey();
                if (!this.nameToFieldInfoMap.containsKey(key)) {
                    this.nameToFieldInfoMap.put(key, entry.getValue());
                }
            }
        }
        if (treeSet.isEmpty()) {
            listUnmodifiableList = Collections.EMPTY_LIST;
        } else {
            listUnmodifiableList = Collections.unmodifiableList(new ArrayList(treeSet));
        }
        this.names = listUnmodifiableList;
    }

    public Field getField(String str) {
        FieldInfo fieldInfo = getFieldInfo(str);
        if (fieldInfo == null) {
            return null;
        }
        return fieldInfo.getField();
    }
}
