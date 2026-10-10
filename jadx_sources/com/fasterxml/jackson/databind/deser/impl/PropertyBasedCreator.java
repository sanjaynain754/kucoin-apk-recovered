package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes45.dex */
public final class PropertyBasedCreator {

    /* JADX INFO: renamed from: a */
    public final int f10275a;

    /* JADX INFO: renamed from: b */
    public final ValueInstantiator f10276b;

    /* JADX INFO: renamed from: c */
    public final HashMap<String, SettableBeanProperty> f10277c;

    /* JADX INFO: renamed from: d */
    public final SettableBeanProperty[] f10278d;

    public static class CaseInsensitiveMap extends HashMap<String, SettableBeanProperty> {
        private static final long serialVersionUID = 1;
        protected final Locale _locale;

        @Deprecated
        public CaseInsensitiveMap() {
            this(Locale.getDefault());
        }

        public CaseInsensitiveMap(Locale locale) {
            this._locale = locale;
        }

        public static CaseInsensitiveMap construct(Locale locale) {
            return new CaseInsensitiveMap(locale);
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public SettableBeanProperty get(Object obj) {
            return (SettableBeanProperty) super.get((Object) ((String) obj).toLowerCase(this._locale));
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public SettableBeanProperty put(String str, SettableBeanProperty settableBeanProperty) {
            return (SettableBeanProperty) super.put(str.toLowerCase(this._locale), settableBeanProperty);
        }
    }

    /* JADX INFO: renamed from: b */
    public static PropertyBasedCreator m11296b(DeserializationContext deserializationContext, ValueInstantiator valueInstantiator, SettableBeanProperty[] settableBeanPropertyArr, BeanPropertyMap beanPropertyMap) throws JsonMappingException {
        int length = settableBeanPropertyArr.length;
        SettableBeanProperty[] settableBeanPropertyArr2 = new SettableBeanProperty[length];
        for (int i11 = 0; i11 < length; i11++) {
            SettableBeanProperty settableBeanPropertyWithValueDeserializer = settableBeanPropertyArr[i11];
            if (!settableBeanPropertyWithValueDeserializer.hasValueDeserializer() && !settableBeanPropertyWithValueDeserializer.isInjectionOnly()) {
                settableBeanPropertyWithValueDeserializer = settableBeanPropertyWithValueDeserializer.withValueDeserializer(deserializationContext.findContextualValueDeserializer(settableBeanPropertyWithValueDeserializer.getType(), settableBeanPropertyWithValueDeserializer));
            }
            settableBeanPropertyArr2[i11] = settableBeanPropertyWithValueDeserializer;
        }
        return new PropertyBasedCreator(deserializationContext, valueInstantiator, settableBeanPropertyArr2, beanPropertyMap.isCaseInsensitive(), true);
    }

    /* JADX INFO: renamed from: c */
    public static PropertyBasedCreator m11297c(DeserializationContext deserializationContext, ValueInstantiator valueInstantiator, SettableBeanProperty[] settableBeanPropertyArr, boolean z11) throws JsonMappingException {
        int length = settableBeanPropertyArr.length;
        SettableBeanProperty[] settableBeanPropertyArr2 = new SettableBeanProperty[length];
        for (int i11 = 0; i11 < length; i11++) {
            SettableBeanProperty settableBeanPropertyWithValueDeserializer = settableBeanPropertyArr[i11];
            if (!settableBeanPropertyWithValueDeserializer.hasValueDeserializer()) {
                settableBeanPropertyWithValueDeserializer = settableBeanPropertyWithValueDeserializer.withValueDeserializer(deserializationContext.findContextualValueDeserializer(settableBeanPropertyWithValueDeserializer.getType(), settableBeanPropertyWithValueDeserializer));
            }
            settableBeanPropertyArr2[i11] = settableBeanPropertyWithValueDeserializer;
        }
        return new PropertyBasedCreator(deserializationContext, valueInstantiator, settableBeanPropertyArr2, z11, false);
    }

    /* JADX INFO: renamed from: a */
    public Object m11298a(DeserializationContext deserializationContext, C6372g c6372g) throws IOException {
        Object objCreateFromObjectWith = this.f10276b.createFromObjectWith(deserializationContext, this.f10278d, c6372g);
        if (objCreateFromObjectWith == null) {
            return objCreateFromObjectWith;
        }
        Object objM11371h = c6372g.m11371h(deserializationContext, objCreateFromObjectWith);
        for (AbstractC6371f abstractC6371fM11369f = c6372g.m11369f(); abstractC6371fM11369f != null; abstractC6371fM11369f = abstractC6371fM11369f.f10311a) {
            abstractC6371fM11369f.mo11363a(objM11371h);
        }
        return objM11371h;
    }

    /* JADX INFO: renamed from: d */
    public SettableBeanProperty m11299d(int i11) {
        for (SettableBeanProperty settableBeanProperty : this.f10277c.values()) {
            if (settableBeanProperty.getPropertyIndex() == i11) {
                return settableBeanProperty;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public SettableBeanProperty m11300e(String str) {
        return this.f10277c.get(str);
    }

    /* JADX INFO: renamed from: f */
    public Collection<SettableBeanProperty> m11301f() {
        return this.f10277c.values();
    }

    /* JADX INFO: renamed from: g */
    public C6372g m11302g(JsonParser jsonParser, DeserializationContext deserializationContext, ObjectIdReader objectIdReader) {
        return new C6372g(jsonParser, deserializationContext, this.f10275a, objectIdReader);
    }

    public PropertyBasedCreator(DeserializationContext deserializationContext, ValueInstantiator valueInstantiator, SettableBeanProperty[] settableBeanPropertyArr, boolean z11, boolean z12) {
        this.f10276b = valueInstantiator;
        if (z11) {
            this.f10277c = CaseInsensitiveMap.construct(deserializationContext.getConfig().getLocale());
        } else {
            this.f10277c = new HashMap<>();
        }
        int length = settableBeanPropertyArr.length;
        this.f10275a = length;
        this.f10278d = new SettableBeanProperty[length];
        if (z12) {
            DeserializationConfig config = deserializationContext.getConfig();
            for (SettableBeanProperty settableBeanProperty : settableBeanPropertyArr) {
                if (!settableBeanProperty.isIgnorable()) {
                    List<PropertyName> listFindAliases = settableBeanProperty.findAliases(config);
                    if (!listFindAliases.isEmpty()) {
                        Iterator<PropertyName> it = listFindAliases.iterator();
                        while (it.hasNext()) {
                            this.f10277c.put(it.next().getSimpleName(), settableBeanProperty);
                        }
                    }
                }
            }
        }
        for (int i11 = 0; i11 < length; i11++) {
            SettableBeanProperty settableBeanProperty2 = settableBeanPropertyArr[i11];
            this.f10278d[i11] = settableBeanProperty2;
            if (!settableBeanProperty2.isIgnorable()) {
                this.f10277c.put(settableBeanProperty2.getName(), settableBeanProperty2);
            }
        }
    }
}
