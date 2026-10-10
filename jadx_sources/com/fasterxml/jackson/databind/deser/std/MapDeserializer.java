package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonIncludeProperties;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.AbstractC6390e;
import com.fasterxml.jackson.databind.AbstractC6394i;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.deser.InterfaceC6358c;
import com.fasterxml.jackson.databind.deser.InterfaceC6359d;
import com.fasterxml.jackson.databind.deser.InterfaceC6375j;
import com.fasterxml.jackson.databind.deser.InterfaceC6376k;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.UnresolvedForwardReference;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.deser.impl.C6372g;
import com.fasterxml.jackson.databind.deser.impl.C6373h;
import com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.jsontype.AbstractC6428b;
import com.fasterxml.jackson.databind.type.LogicalType;
import com.fasterxml.jackson.databind.util.C6485b;
import com.fasterxml.jackson.databind.util.IgnorePropertiesUtil;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p450m7.InterfaceC42435a;

/* JADX INFO: loaded from: classes45.dex */
@InterfaceC42435a
public class MapDeserializer extends ContainerDeserializerBase<Map<Object, Object>> implements InterfaceC6358c, InterfaceC6376k {
    private static final long serialVersionUID = 1;
    protected AbstractC6390e<Object> _delegateDeserializer;
    protected final boolean _hasDefaultCreator;
    protected Set<String> _ignorableProperties;
    protected Set<String> _includableProperties;
    protected IgnorePropertiesUtil.Checker _inclusionChecker;
    protected final AbstractC6394i _keyDeserializer;
    protected PropertyBasedCreator _propertyBasedCreator;
    protected boolean _standardStringKey;
    protected final AbstractC6390e<Object> _valueDeserializer;
    protected final ValueInstantiator _valueInstantiator;
    protected final AbstractC6428b _valueTypeDeserializer;

    /* JADX INFO: renamed from: com.fasterxml.jackson.databind.deser.std.MapDeserializer$a */
    public static class C6384a extends C6373h.a {

        /* JADX INFO: renamed from: c */
        public final C6385b f10349c;

        /* JADX INFO: renamed from: d */
        public final Map<Object, Object> f10350d;

        /* JADX INFO: renamed from: e */
        public final Object f10351e;

        @Override // com.fasterxml.jackson.databind.deser.impl.C6373h.a
        /* JADX INFO: renamed from: c */
        public void mo11205c(Object obj, Object obj2) throws IOException {
            this.f10349c.m11406c(obj, obj2);
        }

        public C6384a(C6385b c6385b, UnresolvedForwardReference unresolvedForwardReference, Class<?> cls, Object obj) {
            super(unresolvedForwardReference, cls);
            this.f10350d = new LinkedHashMap();
            this.f10349c = c6385b;
            this.f10351e = obj;
        }
    }

    /* JADX INFO: renamed from: com.fasterxml.jackson.databind.deser.std.MapDeserializer$b */
    public static final class C6385b {

        /* JADX INFO: renamed from: a */
        public final Class<?> f10352a;

        /* JADX INFO: renamed from: b */
        public Map<Object, Object> f10353b;

        /* JADX INFO: renamed from: c */
        public List<C6384a> f10354c = new ArrayList();

        /* JADX INFO: renamed from: a */
        public C6373h.a m11404a(UnresolvedForwardReference unresolvedForwardReference, Object obj) {
            C6384a c6384a = new C6384a(this, unresolvedForwardReference, this.f10352a, obj);
            this.f10354c.add(c6384a);
            return c6384a;
        }

        /* JADX INFO: renamed from: b */
        public void m11405b(Object obj, Object obj2) {
            if (this.f10354c.isEmpty()) {
                this.f10353b.put(obj, obj2);
            } else {
                List<C6384a> list = this.f10354c;
                list.get(list.size() - 1).f10350d.put(obj, obj2);
            }
        }

        /* JADX INFO: renamed from: c */
        public void m11406c(Object obj, Object obj2) throws IOException {
            Iterator<C6384a> it = this.f10354c.iterator();
            Map<Object, Object> map = this.f10353b;
            while (it.hasNext()) {
                C6384a next = it.next();
                if (next.m11383d(obj)) {
                    it.remove();
                    map.put(next.f10351e, obj2);
                    map.putAll(next.f10350d);
                    return;
                }
                map = next.f10350d;
            }
            throw new IllegalArgumentException("Trying to resolve a forward reference with id [" + obj + "] that wasn't previously seen as unresolved.");
        }

        public C6385b(Class<?> cls, Map<Object, Object> map) {
            this.f10352a = cls;
            this.f10353b = map;
        }
    }

    public MapDeserializer(JavaType javaType, ValueInstantiator valueInstantiator, AbstractC6394i abstractC6394i, AbstractC6390e<Object> abstractC6390e, AbstractC6428b abstractC6428b) {
        super(javaType, (InterfaceC6375j) null, (Boolean) null);
        this._keyDeserializer = abstractC6394i;
        this._valueDeserializer = abstractC6390e;
        this._valueTypeDeserializer = abstractC6428b;
        this._valueInstantiator = valueInstantiator;
        this._hasDefaultCreator = valueInstantiator.canCreateUsingDefault();
        this._delegateDeserializer = null;
        this._propertyBasedCreator = null;
        this._standardStringKey = _isStdKeyDeser(javaType, abstractC6394i);
        this._inclusionChecker = null;
    }

    public final boolean _isStdKeyDeser(JavaType javaType, AbstractC6394i abstractC6394i) {
        JavaType keyType;
        if (abstractC6394i == null || (keyType = javaType.getKeyType()) == null) {
            return true;
        }
        Class<?> rawClass = keyType.getRawClass();
        return (rawClass == String.class || rawClass == Object.class) && isDefaultKeyDeserializer(abstractC6394i);
    }

    @Deprecated
    public void setIgnorableProperties(String[] strArr) {
        HashSet hashSetM11876a = (strArr == null || strArr.length == 0) ? null : C6485b.m11876a(strArr);
        this._ignorableProperties = hashSetM11876a;
        this._inclusionChecker = IgnorePropertiesUtil.m11866a(hashSetM11876a, this._includableProperties);
    }

    public MapDeserializer withResolved(AbstractC6394i abstractC6394i, AbstractC6428b abstractC6428b, AbstractC6390e<?> abstractC6390e, InterfaceC6375j interfaceC6375j, Set<String> set) {
        return withResolved(abstractC6394i, abstractC6428b, abstractC6390e, interfaceC6375j, set, this._includableProperties);
    }

    public Map<Object, Object> _deserializeUsingCreator(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        String strMo10887j;
        Object objDeserialize;
        PropertyBasedCreator propertyBasedCreator = this._propertyBasedCreator;
        C6372g c6372gM11302g = propertyBasedCreator.m11302g(jsonParser, deserializationContext, null);
        AbstractC6390e<Object> abstractC6390e = this._valueDeserializer;
        AbstractC6428b abstractC6428b = this._valueTypeDeserializer;
        if (jsonParser.mo10900p0()) {
            strMo10887j = jsonParser.mo10903r0();
        } else {
            strMo10887j = jsonParser.mo10890k0(JsonToken.FIELD_NAME) ? jsonParser.mo10887j() : null;
        }
        while (strMo10887j != null) {
            JsonToken jsonTokenMo10905t0 = jsonParser.mo10905t0();
            IgnorePropertiesUtil.Checker checker = this._inclusionChecker;
            if (checker == null || !checker.shouldIgnore(strMo10887j)) {
                SettableBeanProperty settableBeanPropertyM11300e = propertyBasedCreator.m11300e(strMo10887j);
                if (settableBeanPropertyM11300e == null) {
                    Object objDeserializeKey = this._keyDeserializer.deserializeKey(strMo10887j, deserializationContext);
                    try {
                        if (jsonTokenMo10905t0 != JsonToken.VALUE_NULL) {
                            objDeserialize = abstractC6428b == null ? abstractC6390e.deserialize(jsonParser, deserializationContext) : abstractC6390e.deserializeWithType(jsonParser, deserializationContext, abstractC6428b);
                        } else if (!this._skipNullValues) {
                            objDeserialize = this._nullProvider.getNullValue(deserializationContext);
                        }
                        c6372gM11302g.m11367d(objDeserializeKey, objDeserialize);
                    } catch (Exception e11) {
                        wrapAndThrow(deserializationContext, e11, this._containerType.getRawClass(), strMo10887j);
                        return null;
                    }
                } else if (c6372gM11302g.m11365b(settableBeanPropertyM11300e, settableBeanPropertyM11300e.deserialize(jsonParser, deserializationContext))) {
                    jsonParser.mo10905t0();
                    try {
                        Map<Object, Object> map = (Map) propertyBasedCreator.m11298a(deserializationContext, c6372gM11302g);
                        _readAndBind(jsonParser, deserializationContext, map);
                        return map;
                    } catch (Exception e12) {
                        return (Map) wrapAndThrow(deserializationContext, e12, this._containerType.getRawClass(), strMo10887j);
                    }
                }
            } else {
                jsonParser.mo10856C0();
            }
            strMo10887j = jsonParser.mo10903r0();
        }
        try {
            return (Map) propertyBasedCreator.m11298a(deserializationContext, c6372gM11302g);
        } catch (Exception e13) {
            wrapAndThrow(deserializationContext, e13, this._containerType.getRawClass(), strMo10887j);
            return null;
        }
    }

    public final void _readAndBind(JsonParser jsonParser, DeserializationContext deserializationContext, Map<Object, Object> map) throws IOException {
        String strMo10887j;
        Object objDeserialize;
        AbstractC6394i abstractC6394i = this._keyDeserializer;
        AbstractC6390e<Object> abstractC6390e = this._valueDeserializer;
        AbstractC6428b abstractC6428b = this._valueTypeDeserializer;
        boolean z11 = abstractC6390e.getObjectIdReader() != null;
        C6385b c6385b = z11 ? new C6385b(this._containerType.getContentType().getRawClass(), map) : null;
        if (jsonParser.mo10900p0()) {
            strMo10887j = jsonParser.mo10903r0();
        } else {
            JsonToken jsonTokenMo10889k = jsonParser.mo10889k();
            JsonToken jsonToken = JsonToken.FIELD_NAME;
            if (jsonTokenMo10889k != jsonToken) {
                if (jsonTokenMo10889k == JsonToken.END_OBJECT) {
                    return;
                } else {
                    deserializationContext.reportWrongTokenException(this, jsonToken, (String) null, new Object[0]);
                }
            }
            strMo10887j = jsonParser.mo10887j();
        }
        while (strMo10887j != null) {
            Object objDeserializeKey = abstractC6394i.deserializeKey(strMo10887j, deserializationContext);
            JsonToken jsonTokenMo10905t0 = jsonParser.mo10905t0();
            IgnorePropertiesUtil.Checker checker = this._inclusionChecker;
            if (checker == null || !checker.shouldIgnore(strMo10887j)) {
                try {
                    if (jsonTokenMo10905t0 != JsonToken.VALUE_NULL) {
                        objDeserialize = abstractC6428b == null ? abstractC6390e.deserialize(jsonParser, deserializationContext) : abstractC6390e.deserializeWithType(jsonParser, deserializationContext, abstractC6428b);
                    } else if (!this._skipNullValues) {
                        objDeserialize = this._nullProvider.getNullValue(deserializationContext);
                    }
                    if (z11) {
                        c6385b.m11405b(objDeserializeKey, objDeserialize);
                    } else {
                        map.put(objDeserializeKey, objDeserialize);
                    }
                } catch (UnresolvedForwardReference e11) {
                    m11403a(deserializationContext, c6385b, objDeserializeKey, e11);
                } catch (Exception e12) {
                    wrapAndThrow(deserializationContext, e12, map, strMo10887j);
                }
            } else {
                jsonParser.mo10856C0();
            }
            strMo10887j = jsonParser.mo10903r0();
        }
    }

    public final void _readAndBindStringKeyMap(JsonParser jsonParser, DeserializationContext deserializationContext, Map<Object, Object> map) throws IOException {
        String strMo10887j;
        Object objDeserialize;
        AbstractC6390e<Object> abstractC6390e = this._valueDeserializer;
        AbstractC6428b abstractC6428b = this._valueTypeDeserializer;
        boolean z11 = abstractC6390e.getObjectIdReader() != null;
        C6385b c6385b = z11 ? new C6385b(this._containerType.getContentType().getRawClass(), map) : null;
        if (jsonParser.mo10900p0()) {
            strMo10887j = jsonParser.mo10903r0();
        } else {
            JsonToken jsonTokenMo10889k = jsonParser.mo10889k();
            if (jsonTokenMo10889k == JsonToken.END_OBJECT) {
                return;
            }
            JsonToken jsonToken = JsonToken.FIELD_NAME;
            if (jsonTokenMo10889k != jsonToken) {
                deserializationContext.reportWrongTokenException(this, jsonToken, (String) null, new Object[0]);
            }
            strMo10887j = jsonParser.mo10887j();
        }
        while (strMo10887j != null) {
            JsonToken jsonTokenMo10905t0 = jsonParser.mo10905t0();
            IgnorePropertiesUtil.Checker checker = this._inclusionChecker;
            if (checker == null || !checker.shouldIgnore(strMo10887j)) {
                try {
                    if (jsonTokenMo10905t0 != JsonToken.VALUE_NULL) {
                        objDeserialize = abstractC6428b == null ? abstractC6390e.deserialize(jsonParser, deserializationContext) : abstractC6390e.deserializeWithType(jsonParser, deserializationContext, abstractC6428b);
                    } else if (!this._skipNullValues) {
                        objDeserialize = this._nullProvider.getNullValue(deserializationContext);
                    }
                    if (z11) {
                        c6385b.m11405b(strMo10887j, objDeserialize);
                    } else {
                        map.put(strMo10887j, objDeserialize);
                    }
                } catch (UnresolvedForwardReference e11) {
                    m11403a(deserializationContext, c6385b, strMo10887j, e11);
                } catch (Exception e12) {
                    wrapAndThrow(deserializationContext, e12, map, strMo10887j);
                }
            } else {
                jsonParser.mo10856C0();
            }
            strMo10887j = jsonParser.mo10903r0();
        }
    }

    public final void _readAndUpdate(JsonParser jsonParser, DeserializationContext deserializationContext, Map<Object, Object> map) throws IOException {
        String strMo10887j;
        Object objDeserialize;
        AbstractC6394i abstractC6394i = this._keyDeserializer;
        AbstractC6390e<Object> abstractC6390e = this._valueDeserializer;
        AbstractC6428b abstractC6428b = this._valueTypeDeserializer;
        if (jsonParser.mo10900p0()) {
            strMo10887j = jsonParser.mo10903r0();
        } else {
            JsonToken jsonTokenMo10889k = jsonParser.mo10889k();
            if (jsonTokenMo10889k == JsonToken.END_OBJECT) {
                return;
            }
            JsonToken jsonToken = JsonToken.FIELD_NAME;
            if (jsonTokenMo10889k != jsonToken) {
                deserializationContext.reportWrongTokenException(this, jsonToken, (String) null, new Object[0]);
            }
            strMo10887j = jsonParser.mo10887j();
        }
        while (strMo10887j != null) {
            Object objDeserializeKey = abstractC6394i.deserializeKey(strMo10887j, deserializationContext);
            JsonToken jsonTokenMo10905t0 = jsonParser.mo10905t0();
            IgnorePropertiesUtil.Checker checker = this._inclusionChecker;
            if (checker == null || !checker.shouldIgnore(strMo10887j)) {
                try {
                    if (jsonTokenMo10905t0 != JsonToken.VALUE_NULL) {
                        Object obj = map.get(objDeserializeKey);
                        if (obj != null) {
                            objDeserialize = abstractC6428b == null ? abstractC6390e.deserialize(jsonParser, deserializationContext, obj) : abstractC6390e.deserializeWithType(jsonParser, deserializationContext, abstractC6428b, obj);
                        } else {
                            objDeserialize = abstractC6428b == null ? abstractC6390e.deserialize(jsonParser, deserializationContext) : abstractC6390e.deserializeWithType(jsonParser, deserializationContext, abstractC6428b);
                        }
                        if (objDeserialize != obj) {
                            map.put(objDeserializeKey, objDeserialize);
                        }
                    } else if (!this._skipNullValues) {
                        map.put(objDeserializeKey, this._nullProvider.getNullValue(deserializationContext));
                    }
                } catch (Exception e11) {
                    wrapAndThrow(deserializationContext, e11, map, strMo10887j);
                }
            } else {
                jsonParser.mo10856C0();
            }
            strMo10887j = jsonParser.mo10903r0();
        }
    }

    public final void _readAndUpdateStringKeyMap(JsonParser jsonParser, DeserializationContext deserializationContext, Map<Object, Object> map) throws IOException {
        String strMo10887j;
        Object objDeserialize;
        AbstractC6390e<Object> abstractC6390e = this._valueDeserializer;
        AbstractC6428b abstractC6428b = this._valueTypeDeserializer;
        if (jsonParser.mo10900p0()) {
            strMo10887j = jsonParser.mo10903r0();
        } else {
            JsonToken jsonTokenMo10889k = jsonParser.mo10889k();
            if (jsonTokenMo10889k == JsonToken.END_OBJECT) {
                return;
            }
            JsonToken jsonToken = JsonToken.FIELD_NAME;
            if (jsonTokenMo10889k != jsonToken) {
                deserializationContext.reportWrongTokenException(this, jsonToken, (String) null, new Object[0]);
            }
            strMo10887j = jsonParser.mo10887j();
        }
        while (strMo10887j != null) {
            JsonToken jsonTokenMo10905t0 = jsonParser.mo10905t0();
            IgnorePropertiesUtil.Checker checker = this._inclusionChecker;
            if (checker == null || !checker.shouldIgnore(strMo10887j)) {
                try {
                    if (jsonTokenMo10905t0 != JsonToken.VALUE_NULL) {
                        Object obj = map.get(strMo10887j);
                        if (obj != null) {
                            objDeserialize = abstractC6428b == null ? abstractC6390e.deserialize(jsonParser, deserializationContext, obj) : abstractC6390e.deserializeWithType(jsonParser, deserializationContext, abstractC6428b, obj);
                        } else {
                            objDeserialize = abstractC6428b == null ? abstractC6390e.deserialize(jsonParser, deserializationContext) : abstractC6390e.deserializeWithType(jsonParser, deserializationContext, abstractC6428b);
                        }
                        if (objDeserialize != obj) {
                            map.put(strMo10887j, objDeserialize);
                        }
                    } else if (!this._skipNullValues) {
                        map.put(strMo10887j, this._nullProvider.getNullValue(deserializationContext));
                    }
                } catch (Exception e11) {
                    wrapAndThrow(deserializationContext, e11, map, strMo10887j);
                }
            } else {
                jsonParser.mo10856C0();
            }
            strMo10887j = jsonParser.mo10903r0();
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m11403a(DeserializationContext deserializationContext, C6385b c6385b, Object obj, UnresolvedForwardReference unresolvedForwardReference) throws JsonMappingException {
        if (c6385b == null) {
            deserializationContext.reportInputMismatch(this, "Unresolved forward reference but no identity info: " + unresolvedForwardReference, new Object[0]);
        }
        unresolvedForwardReference.getRoid().m11373a(c6385b.m11404a(unresolvedForwardReference, obj));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase, com.fasterxml.jackson.databind.deser.std.MapDeserializer, com.fasterxml.jackson.databind.deser.std.StdDeserializer] */
    /* JADX WARN: Type inference failed for: r2v0, types: [com.fasterxml.jackson.databind.i] */
    @Override // com.fasterxml.jackson.databind.deser.InterfaceC6358c
    public AbstractC6390e<?> createContextual(DeserializationContext deserializationContext, BeanProperty beanProperty) throws JsonMappingException {
        AnnotatedMember member;
        Set<String> included;
        Object objCreateContextual = this._keyDeserializer;
        if (objCreateContextual == null) {
            objCreateContextual = deserializationContext.findKeyDeserializer(this._containerType.getKeyType(), beanProperty);
        } else if (objCreateContextual instanceof InterfaceC6359d) {
            objCreateContextual = ((InterfaceC6359d) objCreateContextual).createContextual(deserializationContext, beanProperty);
        }
        ?? r11 = objCreateContextual;
        AbstractC6390e<?> abstractC6390eFindConvertingContentDeserializer = this._valueDeserializer;
        if (beanProperty != null) {
            abstractC6390eFindConvertingContentDeserializer = findConvertingContentDeserializer(deserializationContext, beanProperty, abstractC6390eFindConvertingContentDeserializer);
        }
        JavaType contentType = this._containerType.getContentType();
        AbstractC6390e<?> abstractC6390eFindContextualValueDeserializer = abstractC6390eFindConvertingContentDeserializer == null ? deserializationContext.findContextualValueDeserializer(contentType, beanProperty) : deserializationContext.handleSecondaryContextualization(abstractC6390eFindConvertingContentDeserializer, beanProperty, contentType);
        AbstractC6428b abstractC6428bForProperty = this._valueTypeDeserializer;
        if (abstractC6428bForProperty != null) {
            abstractC6428bForProperty = abstractC6428bForProperty.forProperty(beanProperty);
        }
        AbstractC6428b abstractC6428b = abstractC6428bForProperty;
        Set<String> hashSet = this._ignorableProperties;
        Set hashSet2 = this._includableProperties;
        AnnotationIntrospector annotationIntrospector = deserializationContext.getAnnotationIntrospector();
        if (StdDeserializer._neitherNull(annotationIntrospector, beanProperty) && (member = beanProperty.getMember()) != null) {
            DeserializationConfig config = deserializationContext.getConfig();
            JsonIgnoreProperties.Value valueFindPropertyIgnoralByName = annotationIntrospector.findPropertyIgnoralByName(config, member);
            if (valueFindPropertyIgnoralByName != null) {
                Set<String> setFindIgnoredForDeserialization = valueFindPropertyIgnoralByName.findIgnoredForDeserialization();
                if (!setFindIgnoredForDeserialization.isEmpty()) {
                    hashSet = hashSet == null ? new HashSet<>() : new HashSet(hashSet);
                    Iterator<String> it = setFindIgnoredForDeserialization.iterator();
                    while (it.hasNext()) {
                        hashSet.add(it.next());
                    }
                }
            }
            JsonIncludeProperties.Value valueFindPropertyInclusionByName = annotationIntrospector.findPropertyInclusionByName(config, member);
            if (valueFindPropertyInclusionByName != null && (included = valueFindPropertyInclusionByName.getIncluded()) != null) {
                HashSet hashSet3 = new HashSet();
                if (hashSet2 == null) {
                    hashSet2 = new HashSet(included);
                } else {
                    for (String str : included) {
                        if (hashSet2.contains(str)) {
                            hashSet3.add(str);
                        }
                    }
                    hashSet2 = hashSet3;
                }
            }
        }
        return withResolved(r11, abstractC6428b, abstractC6390eFindContextualValueDeserializer, findContentNullProvider(deserializationContext, beanProperty, abstractC6390eFindContextualValueDeserializer), hashSet, hashSet2);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase
    public AbstractC6390e<Object> getContentDeserializer() {
        return this._valueDeserializer;
    }

    public final Class<?> getMapClass() {
        return this._containerType.getRawClass();
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer
    public ValueInstantiator getValueInstantiator() {
        return this._valueInstantiator;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase, com.fasterxml.jackson.databind.deser.std.StdDeserializer
    public JavaType getValueType() {
        return this._containerType;
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6390e
    public boolean isCachable() {
        return this._valueDeserializer == null && this._keyDeserializer == null && this._valueTypeDeserializer == null && this._ignorableProperties == null && this._includableProperties == null;
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6390e
    public LogicalType logicalType() {
        return LogicalType.Map;
    }

    @Override // com.fasterxml.jackson.databind.deser.InterfaceC6376k
    public void resolve(DeserializationContext deserializationContext) throws JsonMappingException {
        if (this._valueInstantiator.canCreateUsingDelegate()) {
            JavaType delegateType = this._valueInstantiator.getDelegateType(deserializationContext.getConfig());
            if (delegateType == null) {
                JavaType javaType = this._containerType;
                deserializationContext.reportBadDefinition(javaType, String.format("Invalid delegate-creator definition for %s: value instantiator (%s) returned true for 'canCreateUsingDelegate()', but null for 'getDelegateType()'", javaType, this._valueInstantiator.getClass().getName()));
            }
            this._delegateDeserializer = findDeserializer(deserializationContext, delegateType, null);
        } else if (this._valueInstantiator.canCreateUsingArrayDelegate()) {
            JavaType arrayDelegateType = this._valueInstantiator.getArrayDelegateType(deserializationContext.getConfig());
            if (arrayDelegateType == null) {
                JavaType javaType2 = this._containerType;
                deserializationContext.reportBadDefinition(javaType2, String.format("Invalid delegate-creator definition for %s: value instantiator (%s) returned true for 'canCreateUsingArrayDelegate()', but null for 'getArrayDelegateType()'", javaType2, this._valueInstantiator.getClass().getName()));
            }
            this._delegateDeserializer = findDeserializer(deserializationContext, arrayDelegateType, null);
        }
        if (this._valueInstantiator.canCreateFromObjectWith()) {
            this._propertyBasedCreator = PropertyBasedCreator.m11297c(deserializationContext, this._valueInstantiator, this._valueInstantiator.getFromObjectArguments(deserializationContext.getConfig()), deserializationContext.isEnabled(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES));
        }
        this._standardStringKey = _isStdKeyDeser(this._containerType, this._keyDeserializer);
    }

    public void setIncludableProperties(Set<String> set) {
        this._includableProperties = set;
        this._inclusionChecker = IgnorePropertiesUtil.m11866a(this._ignorableProperties, set);
    }

    public MapDeserializer withResolved(AbstractC6394i abstractC6394i, AbstractC6428b abstractC6428b, AbstractC6390e<?> abstractC6390e, InterfaceC6375j interfaceC6375j, Set<String> set, Set<String> set2) {
        return (this._keyDeserializer == abstractC6394i && this._valueDeserializer == abstractC6390e && this._valueTypeDeserializer == abstractC6428b && this._nullProvider == interfaceC6375j && this._ignorableProperties == set && this._includableProperties == set2) ? this : new MapDeserializer(this, abstractC6394i, abstractC6390e, abstractC6428b, interfaceC6375j, set, set2);
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6390e
    public Map<Object, Object> deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        if (this._propertyBasedCreator != null) {
            return _deserializeUsingCreator(jsonParser, deserializationContext);
        }
        AbstractC6390e<Object> abstractC6390e = this._delegateDeserializer;
        if (abstractC6390e != null) {
            return (Map) this._valueInstantiator.createUsingDelegate(deserializationContext, abstractC6390e.deserialize(jsonParser, deserializationContext));
        }
        if (!this._hasDefaultCreator) {
            return (Map) deserializationContext.handleMissingInstantiator(getMapClass(), getValueInstantiator(), jsonParser, "no default constructor found", new Object[0]);
        }
        int iMo10891l = jsonParser.mo10891l();
        if (iMo10891l != 1 && iMo10891l != 2) {
            if (iMo10891l == 3) {
                return _deserializeFromArray(jsonParser, deserializationContext);
            }
            if (iMo10891l != 5) {
                if (iMo10891l != 6) {
                    return (Map) deserializationContext.handleUnexpectedToken(getValueType(deserializationContext), jsonParser);
                }
                return _deserializeFromString(jsonParser, deserializationContext);
            }
        }
        Map<Object, Object> map = (Map) this._valueInstantiator.createUsingDefault(deserializationContext);
        if (this._standardStringKey) {
            _readAndBindStringKeyMap(jsonParser, deserializationContext, map);
            return map;
        }
        _readAndBind(jsonParser, deserializationContext, map);
        return map;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer, com.fasterxml.jackson.databind.AbstractC6390e
    public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, AbstractC6428b abstractC6428b) throws IOException {
        return abstractC6428b.deserializeTypedFromObject(jsonParser, deserializationContext);
    }

    public void setIgnorableProperties(Set<String> set) {
        if (set == null || set.size() == 0) {
            set = null;
        }
        this._ignorableProperties = set;
        this._inclusionChecker = IgnorePropertiesUtil.m11866a(set, this._includableProperties);
    }

    public MapDeserializer(MapDeserializer mapDeserializer) {
        super(mapDeserializer);
        this._keyDeserializer = mapDeserializer._keyDeserializer;
        this._valueDeserializer = mapDeserializer._valueDeserializer;
        this._valueTypeDeserializer = mapDeserializer._valueTypeDeserializer;
        this._valueInstantiator = mapDeserializer._valueInstantiator;
        this._propertyBasedCreator = mapDeserializer._propertyBasedCreator;
        this._delegateDeserializer = mapDeserializer._delegateDeserializer;
        this._hasDefaultCreator = mapDeserializer._hasDefaultCreator;
        this._ignorableProperties = mapDeserializer._ignorableProperties;
        this._includableProperties = mapDeserializer._includableProperties;
        this._inclusionChecker = mapDeserializer._inclusionChecker;
        this._standardStringKey = mapDeserializer._standardStringKey;
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6390e
    public Map<Object, Object> deserialize(JsonParser jsonParser, DeserializationContext deserializationContext, Map<Object, Object> map) throws IOException {
        jsonParser.mo10916z0(map);
        JsonToken jsonTokenMo10889k = jsonParser.mo10889k();
        if (jsonTokenMo10889k != JsonToken.START_OBJECT && jsonTokenMo10889k != JsonToken.FIELD_NAME) {
            return (Map) deserializationContext.handleUnexpectedToken(getMapClass(), jsonParser);
        }
        if (this._standardStringKey) {
            _readAndUpdateStringKeyMap(jsonParser, deserializationContext, map);
            return map;
        }
        _readAndUpdate(jsonParser, deserializationContext, map);
        return map;
    }

    public MapDeserializer(MapDeserializer mapDeserializer, AbstractC6394i abstractC6394i, AbstractC6390e<Object> abstractC6390e, AbstractC6428b abstractC6428b, InterfaceC6375j interfaceC6375j, Set<String> set) {
        this(mapDeserializer, abstractC6394i, abstractC6390e, abstractC6428b, interfaceC6375j, set, null);
    }

    public MapDeserializer(MapDeserializer mapDeserializer, AbstractC6394i abstractC6394i, AbstractC6390e<Object> abstractC6390e, AbstractC6428b abstractC6428b, InterfaceC6375j interfaceC6375j, Set<String> set, Set<String> set2) {
        super(mapDeserializer, interfaceC6375j, mapDeserializer._unwrapSingle);
        this._keyDeserializer = abstractC6394i;
        this._valueDeserializer = abstractC6390e;
        this._valueTypeDeserializer = abstractC6428b;
        this._valueInstantiator = mapDeserializer._valueInstantiator;
        this._propertyBasedCreator = mapDeserializer._propertyBasedCreator;
        this._delegateDeserializer = mapDeserializer._delegateDeserializer;
        this._hasDefaultCreator = mapDeserializer._hasDefaultCreator;
        this._ignorableProperties = set;
        this._includableProperties = set2;
        this._inclusionChecker = IgnorePropertiesUtil.m11866a(set, set2);
        this._standardStringKey = _isStdKeyDeser(this._containerType, abstractC6394i);
    }
}
