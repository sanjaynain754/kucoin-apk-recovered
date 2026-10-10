package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.AbstractC6390e;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.util.C6490g;
import com.fasterxml.jackson.databind.util.IgnorePropertiesUtil;
import com.fasterxml.jackson.databind.util.NameTransformer;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes45.dex */
public class BeanPropertyMap implements Iterable<SettableBeanProperty>, Serializable {
    private static final long serialVersionUID = 2;
    private final Map<String, List<PropertyName>> _aliasDefs;
    private final Map<String, String> _aliasMapping;
    protected final boolean _caseInsensitive;
    private Object[] _hashArea;
    private int _hashMask;
    private final Locale _locale;
    private final SettableBeanProperty[] _propsInOrder;
    private int _size;
    private int _spillCount;

    public BeanPropertyMap(boolean z11, Collection<SettableBeanProperty> collection, Map<String, List<PropertyName>> map, Locale locale) {
        this._caseInsensitive = z11;
        this._propsInOrder = (SettableBeanProperty[]) collection.toArray(new SettableBeanProperty[collection.size()]);
        this._aliasDefs = map;
        this._locale = locale;
        this._aliasMapping = m11288a(map, z11, locale);
        init(collection);
    }

    public static BeanPropertyMap construct(MapperConfig<?> mapperConfig, Collection<SettableBeanProperty> collection, Map<String, List<PropertyName>> map, boolean z11) {
        return new BeanPropertyMap(z11, collection, map, mapperConfig.getLocale());
    }

    /* JADX INFO: renamed from: h */
    public static final int m11287h(int i11) {
        if (i11 <= 5) {
            return 8;
        }
        if (i11 <= 12) {
            return 16;
        }
        int i12 = 32;
        while (i12 < i11 + (i11 >> 2)) {
            i12 += i12;
        }
        return i12;
    }

    /* JADX INFO: renamed from: e */
    public final SettableBeanProperty m11292e(String str) {
        if (str == null) {
            return null;
        }
        int iM11293f = m11293f(str);
        int i11 = iM11293f << 1;
        Object obj = this._hashArea[i11];
        if (str.equals(obj)) {
            return (SettableBeanProperty) this._hashArea[i11 + 1];
        }
        if (obj == null) {
            return null;
        }
        return m11290c(str, iM11293f, obj);
    }

    public SettableBeanProperty find(int i11) {
        int length = this._hashArea.length;
        for (int i12 = 1; i12 < length; i12 += 2) {
            SettableBeanProperty settableBeanProperty = (SettableBeanProperty) this._hashArea[i12];
            if (settableBeanProperty != null && i11 == settableBeanProperty.getPropertyIndex()) {
                return settableBeanProperty;
            }
        }
        return null;
    }

    public BeanPropertyMap withoutProperties(Collection<String> collection) {
        return withoutProperties(collection, null);
    }

    public SettableBeanProperty _rename(SettableBeanProperty settableBeanProperty, NameTransformer nameTransformer) {
        AbstractC6390e<Object> abstractC6390eUnwrappingDeserializer;
        if (settableBeanProperty == null) {
            return settableBeanProperty;
        }
        SettableBeanProperty settableBeanPropertyWithSimpleName = settableBeanProperty.withSimpleName(nameTransformer.transform(settableBeanProperty.getName()));
        AbstractC6390e<Object> valueDeserializer = settableBeanPropertyWithSimpleName.getValueDeserializer();
        return (valueDeserializer == null || (abstractC6390eUnwrappingDeserializer = valueDeserializer.unwrappingDeserializer(nameTransformer)) == valueDeserializer) ? settableBeanPropertyWithSimpleName : settableBeanPropertyWithSimpleName.withValueDeserializer(abstractC6390eUnwrappingDeserializer);
    }

    /* JADX INFO: renamed from: a */
    public final Map<String, String> m11288a(Map<String, List<PropertyName>> map, boolean z11, Locale locale) {
        if (map == null || map.isEmpty()) {
            return Collections.EMPTY_MAP;
        }
        HashMap map2 = new HashMap();
        for (Map.Entry<String, List<PropertyName>> entry : map.entrySet()) {
            String key = entry.getKey();
            if (z11) {
                key = key.toLowerCase(locale);
            }
            Iterator<PropertyName> it = entry.getValue().iterator();
            while (it.hasNext()) {
                String simpleName = it.next().getSimpleName();
                if (z11) {
                    simpleName = simpleName.toLowerCase(locale);
                }
                map2.put(simpleName, key);
            }
        }
        return map2;
    }

    public BeanPropertyMap assignIndexes() {
        int length = this._hashArea.length;
        int i11 = 0;
        for (int i12 = 1; i12 < length; i12 += 2) {
            SettableBeanProperty settableBeanProperty = (SettableBeanProperty) this._hashArea[i12];
            if (settableBeanProperty != null) {
                settableBeanProperty.assignIndex(i11);
                i11++;
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: b */
    public final SettableBeanProperty m11289b(String str, int i11, Object obj) {
        if (obj == null) {
            return m11292e(this._aliasMapping.get(str));
        }
        int i12 = this._hashMask + 1;
        int i13 = ((i11 >> 1) + i12) << 1;
        Object obj2 = this._hashArea[i13];
        if (str.equals(obj2)) {
            return (SettableBeanProperty) this._hashArea[i13 + 1];
        }
        if (obj2 != null) {
            int i14 = (i12 + (i12 >> 1)) << 1;
            int i15 = this._spillCount + i14;
            while (i14 < i15) {
                Object obj3 = this._hashArea[i14];
                if (obj3 == str || str.equals(obj3)) {
                    return (SettableBeanProperty) this._hashArea[i14 + 1];
                }
                i14 += 2;
            }
        }
        return m11292e(this._aliasMapping.get(str));
    }

    /* JADX INFO: renamed from: c */
    public final SettableBeanProperty m11290c(String str, int i11, Object obj) {
        int i12 = this._hashMask + 1;
        int i13 = ((i11 >> 1) + i12) << 1;
        Object obj2 = this._hashArea[i13];
        if (str.equals(obj2)) {
            return (SettableBeanProperty) this._hashArea[i13 + 1];
        }
        if (obj2 == null) {
            return null;
        }
        int i14 = (i12 + (i12 >> 1)) << 1;
        int i15 = this._spillCount + i14;
        while (i14 < i15) {
            Object obj3 = this._hashArea[i14];
            if (obj3 == str || str.equals(obj3)) {
                return (SettableBeanProperty) this._hashArea[i14 + 1];
            }
            i14 += 2;
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public final int m11291d(SettableBeanProperty settableBeanProperty) {
        int length = this._propsInOrder.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (this._propsInOrder[i11] == settableBeanProperty) {
                return i11;
            }
        }
        throw new IllegalStateException("Illegal state: property '" + settableBeanProperty.getName() + "' missing from _propsInOrder");
    }

    /* JADX INFO: renamed from: g */
    public final List<SettableBeanProperty> m11294g() {
        ArrayList arrayList = new ArrayList(this._size);
        int length = this._hashArea.length;
        for (int i11 = 1; i11 < length; i11 += 2) {
            SettableBeanProperty settableBeanProperty = (SettableBeanProperty) this._hashArea[i11];
            if (settableBeanProperty != null) {
                arrayList.add(settableBeanProperty);
            }
        }
        return arrayList;
    }

    public SettableBeanProperty[] getPropertiesInInsertionOrder() {
        return this._propsInOrder;
    }

    public final String getPropertyName(SettableBeanProperty settableBeanProperty) {
        boolean z11 = this._caseInsensitive;
        String name = settableBeanProperty.getName();
        return z11 ? name.toLowerCase(this._locale) : name;
    }

    public boolean hasAliases() {
        return !this._aliasDefs.isEmpty();
    }

    public boolean isCaseInsensitive() {
        return this._caseInsensitive;
    }

    public void remove(SettableBeanProperty settableBeanProperty) {
        ArrayList arrayList = new ArrayList(this._size);
        String propertyName = getPropertyName(settableBeanProperty);
        int length = this._hashArea.length;
        boolean zEquals = false;
        for (int i11 = 1; i11 < length; i11 += 2) {
            Object[] objArr = this._hashArea;
            SettableBeanProperty settableBeanProperty2 = (SettableBeanProperty) objArr[i11];
            if (settableBeanProperty2 != null) {
                if (zEquals || !(zEquals = propertyName.equals(objArr[i11 - 1]))) {
                    arrayList.add(settableBeanProperty2);
                } else {
                    this._propsInOrder[m11291d(settableBeanProperty2)] = null;
                }
            }
        }
        if (zEquals) {
            init(arrayList);
            return;
        }
        throw new NoSuchElementException("No entry '" + settableBeanProperty.getName() + "' found, can't remove");
    }

    public BeanPropertyMap renameAll(NameTransformer nameTransformer) {
        if (nameTransformer == null || nameTransformer == NameTransformer.NOP) {
            return this;
        }
        int length = this._propsInOrder.length;
        ArrayList arrayList = new ArrayList(length);
        for (int i11 = 0; i11 < length; i11++) {
            SettableBeanProperty settableBeanProperty = this._propsInOrder[i11];
            if (settableBeanProperty == null) {
                arrayList.add(settableBeanProperty);
            } else {
                arrayList.add(_rename(settableBeanProperty, nameTransformer));
            }
        }
        return new BeanPropertyMap(this._caseInsensitive, arrayList, this._aliasDefs, this._locale);
    }

    public void replace(SettableBeanProperty settableBeanProperty, SettableBeanProperty settableBeanProperty2) {
        int length = this._hashArea.length;
        for (int i11 = 1; i11 < length; i11 += 2) {
            Object[] objArr = this._hashArea;
            if (objArr[i11] == settableBeanProperty) {
                objArr[i11] = settableBeanProperty2;
                this._propsInOrder[m11291d(settableBeanProperty)] = settableBeanProperty2;
                return;
            }
        }
        throw new NoSuchElementException("No entry '" + settableBeanProperty.getName() + "' found, can't replace");
    }

    public int size() {
        return this._size;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Properties=[");
        int i11 = 0;
        for (SettableBeanProperty settableBeanProperty : this) {
            int i12 = i11 + 1;
            if (i11 > 0) {
                sb2.append(", ");
            }
            sb2.append(settableBeanProperty.getName());
            sb2.append('(');
            sb2.append(settableBeanProperty.getType());
            sb2.append(')');
            i11 = i12;
        }
        sb2.append(']');
        if (!this._aliasDefs.isEmpty()) {
            sb2.append("(aliases: ");
            sb2.append(this._aliasDefs);
            sb2.append(")");
        }
        return sb2.toString();
    }

    public BeanPropertyMap withCaseInsensitivity(boolean z11) {
        return this._caseInsensitive == z11 ? this : new BeanPropertyMap(this, z11);
    }

    public BeanPropertyMap withoutProperties(Collection<String> collection, Collection<String> collection2) {
        if ((collection == null || collection.isEmpty()) && collection2 == null) {
            return this;
        }
        int length = this._propsInOrder.length;
        ArrayList arrayList = new ArrayList(length);
        for (int i11 = 0; i11 < length; i11++) {
            SettableBeanProperty settableBeanProperty = this._propsInOrder[i11];
            if (settableBeanProperty != null && !IgnorePropertiesUtil.m11868c(settableBeanProperty.getName(), collection, collection2)) {
                arrayList.add(settableBeanProperty);
            }
        }
        return new BeanPropertyMap(this._caseInsensitive, arrayList, this._aliasDefs, this._locale);
    }

    public void wrapAndThrow(Throwable th2, Object obj, String str, DeserializationContext deserializationContext) throws IOException {
        while ((th2 instanceof InvocationTargetException) && th2.getCause() != null) {
            th2 = th2.getCause();
        }
        C6490g.m11939h0(th2);
        boolean z11 = deserializationContext == null || deserializationContext.isEnabled(DeserializationFeature.WRAP_EXCEPTIONS);
        if (th2 instanceof IOException) {
            if (!z11 || !(th2 instanceof JacksonException)) {
                throw ((IOException) th2);
            }
        } else if (!z11) {
            C6490g.m11943j0(th2);
        }
        throw JsonMappingException.wrapWithPath(th2, obj, str);
    }

    @Deprecated
    public static BeanPropertyMap construct(MapperConfig<?> mapperConfig, Collection<SettableBeanProperty> collection, Map<String, List<PropertyName>> map) {
        return new BeanPropertyMap(mapperConfig.isEnabled(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES), collection, map, mapperConfig.getLocale());
    }

    /* JADX INFO: renamed from: f */
    public final int m11293f(String str) {
        return str.hashCode() & this._hashMask;
    }

    public boolean findDeserializeAndSet(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj, String str) throws IOException {
        SettableBeanProperty settableBeanPropertyFind = find(str);
        if (settableBeanPropertyFind == null) {
            return false;
        }
        try {
            settableBeanPropertyFind.deserializeAndSet(jsonParser, deserializationContext, obj);
            return true;
        } catch (Exception e11) {
            wrapAndThrow(e11, obj, str, deserializationContext);
            return true;
        }
    }

    public void init(Collection<SettableBeanProperty> collection) {
        int size = collection.size();
        this._size = size;
        int iM11287h = m11287h(size);
        this._hashMask = iM11287h - 1;
        int i11 = (iM11287h >> 1) + iM11287h;
        Object[] objArrCopyOf = new Object[i11 * 2];
        int i12 = 0;
        for (SettableBeanProperty settableBeanProperty : collection) {
            if (settableBeanProperty != null) {
                String propertyName = getPropertyName(settableBeanProperty);
                int iM11293f = m11293f(propertyName);
                int i13 = iM11293f << 1;
                if (objArrCopyOf[i13] != null) {
                    i13 = ((iM11293f >> 1) + iM11287h) << 1;
                    if (objArrCopyOf[i13] != null) {
                        i13 = (i11 << 1) + i12;
                        i12 += 2;
                        if (i13 >= objArrCopyOf.length) {
                            objArrCopyOf = Arrays.copyOf(objArrCopyOf, objArrCopyOf.length + 4);
                        }
                    }
                }
                objArrCopyOf[i13] = propertyName;
                objArrCopyOf[i13 + 1] = settableBeanProperty;
            }
        }
        this._hashArea = objArrCopyOf;
        this._spillCount = i12;
    }

    @Override // java.lang.Iterable
    public Iterator<SettableBeanProperty> iterator() {
        return m11294g().iterator();
    }

    public BeanPropertyMap withProperty(SettableBeanProperty settableBeanProperty) {
        String propertyName = getPropertyName(settableBeanProperty);
        int length = this._hashArea.length;
        for (int i11 = 1; i11 < length; i11 += 2) {
            SettableBeanProperty settableBeanProperty2 = (SettableBeanProperty) this._hashArea[i11];
            if (settableBeanProperty2 != null && settableBeanProperty2.getName().equals(propertyName)) {
                return new BeanPropertyMap(this, settableBeanProperty, i11, m11291d(settableBeanProperty2));
            }
        }
        return new BeanPropertyMap(this, settableBeanProperty, propertyName, m11293f(propertyName));
    }

    public SettableBeanProperty find(String str) {
        if (str != null) {
            if (this._caseInsensitive) {
                str = str.toLowerCase(this._locale);
            }
            int iHashCode = str.hashCode() & this._hashMask;
            int i11 = iHashCode << 1;
            Object obj = this._hashArea[i11];
            if (obj != str && !str.equals(obj)) {
                return m11289b(str, iHashCode, obj);
            }
            return (SettableBeanProperty) this._hashArea[i11 + 1];
        }
        throw new IllegalArgumentException("Cannot pass null property name");
    }

    @Deprecated
    public static BeanPropertyMap construct(Collection<SettableBeanProperty> collection, boolean z11, Map<String, List<PropertyName>> map) {
        return new BeanPropertyMap(z11, collection, map);
    }

    @Deprecated
    public BeanPropertyMap(boolean z11, Collection<SettableBeanProperty> collection, Map<String, List<PropertyName>> map) {
        this(z11, collection, map, Locale.getDefault());
    }

    public BeanPropertyMap(BeanPropertyMap beanPropertyMap, SettableBeanProperty settableBeanProperty, int i11, int i12) {
        this._caseInsensitive = beanPropertyMap._caseInsensitive;
        this._locale = beanPropertyMap._locale;
        this._hashMask = beanPropertyMap._hashMask;
        this._size = beanPropertyMap._size;
        this._spillCount = beanPropertyMap._spillCount;
        this._aliasDefs = beanPropertyMap._aliasDefs;
        this._aliasMapping = beanPropertyMap._aliasMapping;
        Object[] objArr = beanPropertyMap._hashArea;
        this._hashArea = Arrays.copyOf(objArr, objArr.length);
        SettableBeanProperty[] settableBeanPropertyArr = beanPropertyMap._propsInOrder;
        SettableBeanProperty[] settableBeanPropertyArr2 = (SettableBeanProperty[]) Arrays.copyOf(settableBeanPropertyArr, settableBeanPropertyArr.length);
        this._propsInOrder = settableBeanPropertyArr2;
        this._hashArea[i11] = settableBeanProperty;
        settableBeanPropertyArr2[i12] = settableBeanProperty;
    }

    public BeanPropertyMap(BeanPropertyMap beanPropertyMap, SettableBeanProperty settableBeanProperty, String str, int i11) {
        this._caseInsensitive = beanPropertyMap._caseInsensitive;
        this._locale = beanPropertyMap._locale;
        this._hashMask = beanPropertyMap._hashMask;
        this._size = beanPropertyMap._size;
        this._spillCount = beanPropertyMap._spillCount;
        this._aliasDefs = beanPropertyMap._aliasDefs;
        this._aliasMapping = beanPropertyMap._aliasMapping;
        Object[] objArr = beanPropertyMap._hashArea;
        this._hashArea = Arrays.copyOf(objArr, objArr.length);
        SettableBeanProperty[] settableBeanPropertyArr = beanPropertyMap._propsInOrder;
        int length = settableBeanPropertyArr.length;
        SettableBeanProperty[] settableBeanPropertyArr2 = (SettableBeanProperty[]) Arrays.copyOf(settableBeanPropertyArr, length + 1);
        this._propsInOrder = settableBeanPropertyArr2;
        settableBeanPropertyArr2[length] = settableBeanProperty;
        int i12 = this._hashMask + 1;
        int i13 = i11 << 1;
        Object[] objArr2 = this._hashArea;
        if (objArr2[i13] != null) {
            i13 = ((i11 >> 1) + i12) << 1;
            if (objArr2[i13] != null) {
                int i14 = this._spillCount;
                i13 = ((i12 + (i12 >> 1)) << 1) + i14;
                this._spillCount = i14 + 2;
                if (i13 >= objArr2.length) {
                    this._hashArea = Arrays.copyOf(objArr2, objArr2.length + 4);
                }
            }
        }
        Object[] objArr3 = this._hashArea;
        objArr3[i13] = str;
        objArr3[i13 + 1] = settableBeanProperty;
    }

    public BeanPropertyMap(BeanPropertyMap beanPropertyMap, boolean z11) {
        this._caseInsensitive = z11;
        this._locale = beanPropertyMap._locale;
        this._aliasDefs = beanPropertyMap._aliasDefs;
        this._aliasMapping = beanPropertyMap._aliasMapping;
        SettableBeanProperty[] settableBeanPropertyArr = beanPropertyMap._propsInOrder;
        SettableBeanProperty[] settableBeanPropertyArr2 = (SettableBeanProperty[]) Arrays.copyOf(settableBeanPropertyArr, settableBeanPropertyArr.length);
        this._propsInOrder = settableBeanPropertyArr2;
        init(Arrays.asList(settableBeanPropertyArr2));
    }
}
