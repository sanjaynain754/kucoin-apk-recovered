package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.AbstractC6390e;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.cfg.CoercionAction;
import com.fasterxml.jackson.databind.cfg.CoercionInputShape;
import com.fasterxml.jackson.databind.deser.InterfaceC6358c;
import com.fasterxml.jackson.databind.deser.InterfaceC6375j;
import com.fasterxml.jackson.databind.deser.UnresolvedForwardReference;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.deser.impl.C6373h;
import com.fasterxml.jackson.databind.jsontype.AbstractC6428b;
import com.fasterxml.jackson.databind.type.LogicalType;
import com.fasterxml.jackson.databind.util.C6490g;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import p450m7.InterfaceC42435a;

/* JADX INFO: loaded from: classes45.dex */
@InterfaceC42435a
public class CollectionDeserializer extends ContainerDeserializerBase<Collection<Object>> implements InterfaceC6358c {
    private static final long serialVersionUID = -1;
    protected final AbstractC6390e<Object> _delegateDeserializer;
    protected final AbstractC6390e<Object> _valueDeserializer;
    protected final ValueInstantiator _valueInstantiator;
    protected final AbstractC6428b _valueTypeDeserializer;

    /* JADX INFO: renamed from: com.fasterxml.jackson.databind.deser.std.CollectionDeserializer$a */
    public static final class C6380a extends C6373h.a {

        /* JADX INFO: renamed from: c */
        public final C6381b f10339c;

        /* JADX INFO: renamed from: d */
        public final List<Object> f10340d;

        @Override // com.fasterxml.jackson.databind.deser.impl.C6373h.a
        /* JADX INFO: renamed from: c */
        public void mo11205c(Object obj, Object obj2) throws IOException {
            this.f10339c.m11392c(obj, obj2);
        }

        public C6380a(C6381b c6381b, UnresolvedForwardReference unresolvedForwardReference, Class<?> cls) {
            super(unresolvedForwardReference, cls);
            this.f10340d = new ArrayList();
            this.f10339c = c6381b;
        }
    }

    /* JADX INFO: renamed from: com.fasterxml.jackson.databind.deser.std.CollectionDeserializer$b */
    public static class C6381b {

        /* JADX INFO: renamed from: a */
        public final Class<?> f10341a;

        /* JADX INFO: renamed from: b */
        public final Collection<Object> f10342b;

        /* JADX INFO: renamed from: c */
        public List<C6380a> f10343c = new ArrayList();

        /* JADX INFO: renamed from: a */
        public void m11390a(Object obj) {
            if (this.f10343c.isEmpty()) {
                this.f10342b.add(obj);
            } else {
                List<C6380a> list = this.f10343c;
                list.get(list.size() - 1).f10340d.add(obj);
            }
        }

        /* JADX INFO: renamed from: b */
        public C6373h.a m11391b(UnresolvedForwardReference unresolvedForwardReference) {
            C6380a c6380a = new C6380a(this, unresolvedForwardReference, this.f10341a);
            this.f10343c.add(c6380a);
            return c6380a;
        }

        /* JADX INFO: renamed from: c */
        public void m11392c(Object obj, Object obj2) throws IOException {
            Iterator<C6380a> it = this.f10343c.iterator();
            Collection collection = this.f10342b;
            while (it.hasNext()) {
                C6380a next = it.next();
                if (next.m11383d(obj)) {
                    it.remove();
                    collection.add(obj2);
                    collection.addAll(next.f10340d);
                    return;
                }
                collection = next.f10340d;
            }
            throw new IllegalArgumentException("Trying to resolve a forward reference with id [" + obj + "] that wasn't previously seen as unresolved.");
        }

        public C6381b(Class<?> cls, Collection<Object> collection) {
            this.f10341a = cls;
            this.f10342b = collection;
        }
    }

    public CollectionDeserializer(JavaType javaType, AbstractC6390e<Object> abstractC6390e, AbstractC6428b abstractC6428b, ValueInstantiator valueInstantiator) {
        this(javaType, abstractC6390e, abstractC6428b, valueInstantiator, null, null, null);
    }

    public CollectionDeserializer(JavaType javaType, AbstractC6390e<Object> abstractC6390e, AbstractC6428b abstractC6428b, ValueInstantiator valueInstantiator, AbstractC6390e<Object> abstractC6390e2, InterfaceC6375j interfaceC6375j, Boolean bool) {
        super(javaType, interfaceC6375j, bool);
        this._valueDeserializer = abstractC6390e;
        this._valueTypeDeserializer = abstractC6428b;
        this._valueInstantiator = valueInstantiator;
        this._delegateDeserializer = abstractC6390e2;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0067  */
    @Override // com.fasterxml.jackson.databind.deser.InterfaceC6358c
    public CollectionDeserializer createContextual(DeserializationContext deserializationContext, BeanProperty beanProperty) throws JsonMappingException {
        AbstractC6390e<Object> abstractC6390eFindDeserializer;
        ValueInstantiator valueInstantiator = this._valueInstantiator;
        if (valueInstantiator == null) {
            abstractC6390eFindDeserializer = null;
        } else if (valueInstantiator.canCreateUsingDelegate()) {
            JavaType delegateType = this._valueInstantiator.getDelegateType(deserializationContext.getConfig());
            if (delegateType == null) {
                JavaType javaType = this._containerType;
                deserializationContext.reportBadDefinition(javaType, String.format("Invalid delegate-creator definition for %s: value instantiator (%s) returned true for 'canCreateUsingDelegate()', but null for 'getDelegateType()'", javaType, this._valueInstantiator.getClass().getName()));
            }
            abstractC6390eFindDeserializer = findDeserializer(deserializationContext, delegateType, beanProperty);
        } else if (this._valueInstantiator.canCreateUsingArrayDelegate()) {
            JavaType arrayDelegateType = this._valueInstantiator.getArrayDelegateType(deserializationContext.getConfig());
            if (arrayDelegateType == null) {
                JavaType javaType2 = this._containerType;
                deserializationContext.reportBadDefinition(javaType2, String.format("Invalid delegate-creator definition for %s: value instantiator (%s) returned true for 'canCreateUsingArrayDelegate()', but null for 'getArrayDelegateType()'", javaType2, this._valueInstantiator.getClass().getName()));
            }
            abstractC6390eFindDeserializer = findDeserializer(deserializationContext, arrayDelegateType, beanProperty);
        } else {
            abstractC6390eFindDeserializer = null;
        }
        AbstractC6390e<Object> abstractC6390e = abstractC6390eFindDeserializer;
        Boolean boolFindFormatFeature = findFormatFeature(deserializationContext, beanProperty, Collection.class, JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
        AbstractC6390e<?> abstractC6390eFindConvertingContentDeserializer = findConvertingContentDeserializer(deserializationContext, beanProperty, this._valueDeserializer);
        JavaType contentType = this._containerType.getContentType();
        AbstractC6390e<?> abstractC6390eFindContextualValueDeserializer = abstractC6390eFindConvertingContentDeserializer == null ? deserializationContext.findContextualValueDeserializer(contentType, beanProperty) : deserializationContext.handleSecondaryContextualization(abstractC6390eFindConvertingContentDeserializer, beanProperty, contentType);
        AbstractC6428b abstractC6428bForProperty = this._valueTypeDeserializer;
        if (abstractC6428bForProperty != null) {
            abstractC6428bForProperty = abstractC6428bForProperty.forProperty(beanProperty);
        }
        AbstractC6428b abstractC6428b = abstractC6428bForProperty;
        InterfaceC6375j interfaceC6375jFindContentNullProvider = findContentNullProvider(deserializationContext, beanProperty, abstractC6390eFindContextualValueDeserializer);
        return (Objects.equals(boolFindFormatFeature, this._unwrapSingle) && interfaceC6375jFindContentNullProvider == this._nullProvider && abstractC6390e == this._delegateDeserializer && abstractC6390eFindContextualValueDeserializer == this._valueDeserializer && abstractC6428b == this._valueTypeDeserializer) ? this : withResolved(abstractC6390e, abstractC6390eFindContextualValueDeserializer, abstractC6428b, interfaceC6375jFindContentNullProvider, boolFindFormatFeature);
    }

    public Collection<Object> createDefaultInstance(DeserializationContext deserializationContext) throws IOException {
        return (Collection) this._valueInstantiator.createUsingDefault(deserializationContext);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase
    public AbstractC6390e<Object> getContentDeserializer() {
        return this._valueDeserializer;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer
    public ValueInstantiator getValueInstantiator() {
        return this._valueInstantiator;
    }

    public final Collection<Object> handleNonArray(JsonParser jsonParser, DeserializationContext deserializationContext, Collection<Object> collection) throws IOException {
        Object objDeserialize;
        Boolean bool = this._unwrapSingle;
        if (bool != Boolean.TRUE && (bool != null || !deserializationContext.isEnabled(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY))) {
            return (Collection) deserializationContext.handleUnexpectedToken(this._containerType, jsonParser);
        }
        AbstractC6390e<Object> abstractC6390e = this._valueDeserializer;
        AbstractC6428b abstractC6428b = this._valueTypeDeserializer;
        try {
            if (!jsonParser.mo10890k0(JsonToken.VALUE_NULL)) {
                objDeserialize = abstractC6428b == null ? abstractC6390e.deserialize(jsonParser, deserializationContext) : abstractC6390e.deserializeWithType(jsonParser, deserializationContext, abstractC6428b);
            } else {
                if (this._skipNullValues) {
                    return collection;
                }
                objDeserialize = this._nullProvider.getNullValue(deserializationContext);
            }
            collection.add(objDeserialize);
            return collection;
        } catch (Exception e11) {
            if (!deserializationContext.isEnabled(DeserializationFeature.WRAP_EXCEPTIONS)) {
                C6490g.m11943j0(e11);
            }
            throw JsonMappingException.wrapWithPath(e11, Object.class, collection.size());
        }
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6390e
    public boolean isCachable() {
        return this._valueDeserializer == null && this._valueTypeDeserializer == null && this._delegateDeserializer == null;
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6390e
    public LogicalType logicalType() {
        return LogicalType.Collection;
    }

    public CollectionDeserializer withResolved(AbstractC6390e<?> abstractC6390e, AbstractC6390e<?> abstractC6390e2, AbstractC6428b abstractC6428b, InterfaceC6375j interfaceC6375j, Boolean bool) {
        return new CollectionDeserializer(this._containerType, abstractC6390e2, abstractC6428b, this._valueInstantiator, abstractC6390e, interfaceC6375j, bool);
    }

    public Collection<Object> _deserializeFromArray(JsonParser jsonParser, DeserializationContext deserializationContext, Collection<Object> collection) throws IOException {
        Object objDeserializeWithType;
        jsonParser.mo10916z0(collection);
        AbstractC6390e<Object> abstractC6390e = this._valueDeserializer;
        if (abstractC6390e.getObjectIdReader() != null) {
            return _deserializeWithObjectId(jsonParser, deserializationContext, collection);
        }
        AbstractC6428b abstractC6428b = this._valueTypeDeserializer;
        while (true) {
            JsonToken jsonTokenMo10905t0 = jsonParser.mo10905t0();
            if (jsonTokenMo10905t0 != JsonToken.END_ARRAY) {
                try {
                    if (jsonTokenMo10905t0 == JsonToken.VALUE_NULL) {
                        if (!this._skipNullValues) {
                            objDeserializeWithType = this._nullProvider.getNullValue(deserializationContext);
                        }
                    } else if (abstractC6428b == null) {
                        objDeserializeWithType = abstractC6390e.deserialize(jsonParser, deserializationContext);
                    } else {
                        objDeserializeWithType = abstractC6390e.deserializeWithType(jsonParser, deserializationContext, abstractC6428b);
                    }
                    collection.add(objDeserializeWithType);
                } catch (Exception e11) {
                    if (deserializationContext != null && !deserializationContext.isEnabled(DeserializationFeature.WRAP_EXCEPTIONS)) {
                        C6490g.m11943j0(e11);
                    }
                    throw JsonMappingException.wrapWithPath(e11, collection, collection.size());
                }
            } else {
                return collection;
            }
        }
    }

    public Collection<Object> _deserializeFromString(JsonParser jsonParser, DeserializationContext deserializationContext, String str) throws IOException {
        JsonParser jsonParser2;
        DeserializationContext deserializationContext2;
        Class<?> clsHandledType = handledType();
        if (str.isEmpty()) {
            CoercionAction coercionAction_checkCoercionFail = _checkCoercionFail(deserializationContext, deserializationContext.findCoercionAction(logicalType(), clsHandledType, CoercionInputShape.EmptyString), clsHandledType, str, "empty String (\"\")");
            deserializationContext2 = deserializationContext;
            if (coercionAction_checkCoercionFail != null) {
                return (Collection) _deserializeFromEmptyString(jsonParser, deserializationContext2, coercionAction_checkCoercionFail, clsHandledType, "empty String (\"\")");
            }
            jsonParser2 = jsonParser;
        } else {
            jsonParser2 = jsonParser;
            deserializationContext2 = deserializationContext;
            if (StdDeserializer._isBlank(str)) {
                return (Collection) _deserializeFromEmptyString(jsonParser2, deserializationContext2, deserializationContext2.findCoercionFromBlankString(logicalType(), clsHandledType, CoercionAction.Fail), clsHandledType, "blank String (all whitespace)");
            }
        }
        return handleNonArray(jsonParser2, deserializationContext2, createDefaultInstance(deserializationContext2));
    }

    public Collection<Object> _deserializeWithObjectId(JsonParser jsonParser, DeserializationContext deserializationContext, Collection<Object> collection) throws IOException {
        Object objDeserializeWithType;
        if (!jsonParser.mo10898o0()) {
            return handleNonArray(jsonParser, deserializationContext, collection);
        }
        jsonParser.mo10916z0(collection);
        AbstractC6390e<Object> abstractC6390e = this._valueDeserializer;
        AbstractC6428b abstractC6428b = this._valueTypeDeserializer;
        C6381b c6381b = new C6381b(this._containerType.getContentType().getRawClass(), collection);
        while (true) {
            JsonToken jsonTokenMo10905t0 = jsonParser.mo10905t0();
            if (jsonTokenMo10905t0 != JsonToken.END_ARRAY) {
                try {
                    if (jsonTokenMo10905t0 == JsonToken.VALUE_NULL) {
                        if (!this._skipNullValues) {
                            objDeserializeWithType = this._nullProvider.getNullValue(deserializationContext);
                        }
                    } else if (abstractC6428b == null) {
                        objDeserializeWithType = abstractC6390e.deserialize(jsonParser, deserializationContext);
                    } else {
                        objDeserializeWithType = abstractC6390e.deserializeWithType(jsonParser, deserializationContext, abstractC6428b);
                    }
                    c6381b.m11390a(objDeserializeWithType);
                } catch (UnresolvedForwardReference e11) {
                    e11.getRoid().m11373a(c6381b.m11391b(e11));
                } catch (Exception e12) {
                    if (deserializationContext != null && !deserializationContext.isEnabled(DeserializationFeature.WRAP_EXCEPTIONS)) {
                        C6490g.m11943j0(e12);
                    }
                    throw JsonMappingException.wrapWithPath(e12, collection, collection.size());
                }
            } else {
                return collection;
            }
        }
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6390e
    public Collection<Object> deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        AbstractC6390e<Object> abstractC6390e = this._delegateDeserializer;
        if (abstractC6390e != null) {
            return (Collection) this._valueInstantiator.createUsingDelegate(deserializationContext, abstractC6390e.deserialize(jsonParser, deserializationContext));
        }
        if (jsonParser.mo10898o0()) {
            return _deserializeFromArray(jsonParser, deserializationContext, createDefaultInstance(deserializationContext));
        }
        if (jsonParser.mo10890k0(JsonToken.VALUE_STRING)) {
            return _deserializeFromString(jsonParser, deserializationContext, jsonParser.mo10869W());
        }
        return handleNonArray(jsonParser, deserializationContext, createDefaultInstance(deserializationContext));
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer, com.fasterxml.jackson.databind.AbstractC6390e
    public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, AbstractC6428b abstractC6428b) throws IOException {
        return abstractC6428b.deserializeTypedFromArray(jsonParser, deserializationContext);
    }

    public CollectionDeserializer(CollectionDeserializer collectionDeserializer) {
        super(collectionDeserializer);
        this._valueDeserializer = collectionDeserializer._valueDeserializer;
        this._valueTypeDeserializer = collectionDeserializer._valueTypeDeserializer;
        this._valueInstantiator = collectionDeserializer._valueInstantiator;
        this._delegateDeserializer = collectionDeserializer._delegateDeserializer;
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6390e
    public Collection<Object> deserialize(JsonParser jsonParser, DeserializationContext deserializationContext, Collection<Object> collection) throws IOException {
        if (jsonParser.mo10898o0()) {
            return _deserializeFromArray(jsonParser, deserializationContext, collection);
        }
        return handleNonArray(jsonParser, deserializationContext, collection);
    }
}
