package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.AbstractC6340b;
import com.fasterxml.jackson.databind.AbstractC6390e;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.cfg.CoercionAction;
import com.fasterxml.jackson.databind.deser.impl.BeanAsArrayDeserializer;
import com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap;
import com.fasterxml.jackson.databind.deser.impl.C6369d;
import com.fasterxml.jackson.databind.deser.impl.C6372g;
import com.fasterxml.jackson.databind.deser.impl.C6373h;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdReader;
import com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator;
import com.fasterxml.jackson.databind.util.C6490g;
import com.fasterxml.jackson.databind.util.C6499p;
import com.fasterxml.jackson.databind.util.IgnorePropertiesUtil;
import com.fasterxml.jackson.databind.util.NameTransformer;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes45.dex */
public class BeanDeserializer extends BeanDeserializerBase implements Serializable {
    private static final long serialVersionUID = 1;
    protected transient Exception _nullFromCreator;

    /* JADX INFO: renamed from: b */
    public volatile transient NameTransformer f10235b;

    /* JADX INFO: renamed from: com.fasterxml.jackson.databind.deser.BeanDeserializer$b */
    public static class C6353b extends C6373h.a {

        /* JADX INFO: renamed from: c */
        public final DeserializationContext f10238c;

        /* JADX INFO: renamed from: d */
        public final SettableBeanProperty f10239d;

        /* JADX INFO: renamed from: e */
        public Object f10240e;

        @Override // com.fasterxml.jackson.databind.deser.impl.C6373h.a
        /* JADX INFO: renamed from: c */
        public void mo11205c(Object obj, Object obj2) throws IOException {
            if (this.f10240e == null) {
                DeserializationContext deserializationContext = this.f10238c;
                SettableBeanProperty settableBeanProperty = this.f10239d;
                deserializationContext.reportInputMismatch(settableBeanProperty, "Cannot resolve ObjectId forward reference using property '%s' (of type %s): Bean not yet resolved", settableBeanProperty.getName(), this.f10239d.getDeclaringClass().getName());
            }
            this.f10239d.set(this.f10240e, obj2);
        }

        /* JADX INFO: renamed from: e */
        public void m11206e(Object obj) {
            this.f10240e = obj;
        }

        public C6353b(DeserializationContext deserializationContext, UnresolvedForwardReference unresolvedForwardReference, JavaType javaType, C6372g c6372g, SettableBeanProperty settableBeanProperty) {
            super(unresolvedForwardReference, javaType);
            this.f10238c = deserializationContext;
            this.f10239d = settableBeanProperty;
        }
    }

    @Deprecated
    public BeanDeserializer(C6356a c6356a, AbstractC6340b abstractC6340b, BeanPropertyMap beanPropertyMap, Map<String, SettableBeanProperty> map, HashSet<String> hashSet, boolean z11, boolean z12) {
        super(c6356a, abstractC6340b, beanPropertyMap, map, hashSet, z11, null, z12);
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6390e
    public Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        if (!jsonParser.mo10900p0()) {
            return _deserializeOther(jsonParser, deserializationContext, jsonParser.mo10889k());
        }
        if (this._vanillaProcessing) {
            return m11204d(jsonParser, deserializationContext, jsonParser.mo10905t0());
        }
        jsonParser.mo10905t0();
        return this._objectIdReader != null ? deserializeWithObjectId(jsonParser, deserializationContext) : deserializeFromObject(jsonParser, deserializationContext);
    }

    public Object deserializeWithExternalTypeId(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        if (this._propertyBasedCreator != null) {
            return deserializeUsingPropertyBasedWithExternalTypeId(jsonParser, deserializationContext);
        }
        AbstractC6390e<Object> abstractC6390e = this._delegateDeserializer;
        return abstractC6390e != null ? this._valueInstantiator.createUsingDelegate(deserializationContext, abstractC6390e.deserialize(jsonParser, deserializationContext)) : deserializeWithExternalTypeId(jsonParser, deserializationContext, this._valueInstantiator.createUsingDefault(deserializationContext));
    }

    public Object deserializeWithUnwrapped(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        AbstractC6390e<Object> abstractC6390e = this._delegateDeserializer;
        if (abstractC6390e != null) {
            return this._valueInstantiator.createUsingDelegate(deserializationContext, abstractC6390e.deserialize(jsonParser, deserializationContext));
        }
        if (this._propertyBasedCreator != null) {
            return deserializeUsingPropertyBasedWithUnwrapped(jsonParser, deserializationContext);
        }
        C6499p c6499pBufferForInputBuffering = deserializationContext.bufferForInputBuffering(jsonParser);
        c6499pBufferForInputBuffering.mo10850y0();
        Object objCreateUsingDefault = this._valueInstantiator.createUsingDefault(deserializationContext);
        jsonParser.mo10916z0(objCreateUsingDefault);
        if (this._injectables != null) {
            injectValues(deserializationContext, objCreateUsingDefault);
        }
        Class<?> activeView = this._needViewProcesing ? deserializationContext.getActiveView() : null;
        String strMo10887j = jsonParser.mo10892l0(5) ? jsonParser.mo10887j() : null;
        while (strMo10887j != null) {
            jsonParser.mo10905t0();
            SettableBeanProperty settableBeanPropertyFind = this._beanProperties.find(strMo10887j);
            if (settableBeanPropertyFind != null) {
                if (activeView == null || settableBeanPropertyFind.visibleInView(activeView)) {
                    try {
                        settableBeanPropertyFind.deserializeAndSet(jsonParser, deserializationContext, objCreateUsingDefault);
                    } catch (Exception e11) {
                        wrapAndThrow(e11, objCreateUsingDefault, strMo10887j, deserializationContext);
                    }
                } else {
                    jsonParser.mo10856C0();
                }
            } else if (IgnorePropertiesUtil.m11868c(strMo10887j, this._ignorableProps, this._includableProps)) {
                handleIgnoredProperty(jsonParser, deserializationContext, objCreateUsingDefault, strMo10887j);
            } else if (this._anySetter == null) {
                c6499pBufferForInputBuffering.mo10810a0(strMo10887j);
                c6499pBufferForInputBuffering.m12017X0(jsonParser);
            } else {
                C6499p c6499pBufferAsCopyOfValue = deserializationContext.bufferAsCopyOfValue(jsonParser);
                c6499pBufferForInputBuffering.mo10810a0(strMo10887j);
                c6499pBufferForInputBuffering.m12012S0(c6499pBufferAsCopyOfValue);
                try {
                    this._anySetter.deserializeAndSet(c6499pBufferAsCopyOfValue.m12016W0(), deserializationContext, objCreateUsingDefault, strMo10887j);
                } catch (Exception e12) {
                    wrapAndThrow(e12, objCreateUsingDefault, strMo10887j, deserializationContext);
                }
            }
            strMo10887j = jsonParser.mo10903r0();
        }
        c6499pBufferForInputBuffering.mo10806X();
        this._unwrappedPropertyHandler.m11385b(jsonParser, deserializationContext, objCreateUsingDefault, c6499pBufferForInputBuffering);
        return objCreateUsingDefault;
    }

    public final Object deserializeWithView(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj, Class<?> cls) throws IOException {
        if (jsonParser.mo10892l0(5)) {
            String strMo10887j = jsonParser.mo10887j();
            do {
                jsonParser.mo10905t0();
                SettableBeanProperty settableBeanPropertyFind = this._beanProperties.find(strMo10887j);
                if (settableBeanPropertyFind == null) {
                    handleUnknownVanilla(jsonParser, deserializationContext, obj, strMo10887j);
                } else if (settableBeanPropertyFind.visibleInView(cls)) {
                    try {
                        settableBeanPropertyFind.deserializeAndSet(jsonParser, deserializationContext, obj);
                    } catch (Exception e11) {
                        wrapAndThrow(e11, obj, strMo10887j, deserializationContext);
                    }
                } else {
                    jsonParser.mo10856C0();
                }
                strMo10887j = jsonParser.mo10903r0();
            } while (strMo10887j != null);
        }
        return obj;
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase
    public /* bridge */ /* synthetic */ BeanDeserializerBase withByNameInclusion(Set set, Set set2) {
        return withByNameInclusion((Set<String>) set, (Set<String>) set2);
    }

    /* JADX INFO: renamed from: com.fasterxml.jackson.databind.deser.BeanDeserializer$a */
    public static /* synthetic */ class C6352a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f10236a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f10237b;

        static {
            int[] iArr = new int[CoercionAction.values().length];
            f10237b = iArr;
            try {
                iArr[CoercionAction.AsEmpty.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10237b[CoercionAction.AsNull.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f10237b[CoercionAction.TryConvert.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[JsonToken.values().length];
            f10236a = iArr2;
            try {
                iArr2[JsonToken.VALUE_STRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f10236a[JsonToken.VALUE_NUMBER_INT.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f10236a[JsonToken.VALUE_NUMBER_FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f10236a[JsonToken.VALUE_EMBEDDED_OBJECT.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f10236a[JsonToken.VALUE_TRUE.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f10236a[JsonToken.VALUE_FALSE.ordinal()] = 6;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f10236a[JsonToken.VALUE_NULL.ordinal()] = 7;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f10236a[JsonToken.START_ARRAY.ordinal()] = 8;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f10236a[JsonToken.FIELD_NAME.ordinal()] = 9;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f10236a[JsonToken.END_OBJECT.ordinal()] = 10;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    public BeanDeserializer(C6356a c6356a, AbstractC6340b abstractC6340b, BeanPropertyMap beanPropertyMap, Map<String, SettableBeanProperty> map, HashSet<String> hashSet, boolean z11, Set<String> set, boolean z12) {
        super(c6356a, abstractC6340b, beanPropertyMap, map, hashSet, z11, set, z12);
    }

    public Exception _creatorReturnedNullException() {
        if (this._nullFromCreator == null) {
            this._nullFromCreator = new NullPointerException("JSON Creator returned null");
        }
        return this._nullFromCreator;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer
    public Object _deserializeFromArray(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        JsonParser jsonParser2;
        DeserializationContext deserializationContext2;
        AbstractC6390e<Object> abstractC6390e = this._arrayDelegateDeserializer;
        if (abstractC6390e != null || (abstractC6390e = this._delegateDeserializer) != null) {
            Object objCreateUsingArrayDelegate = this._valueInstantiator.createUsingArrayDelegate(deserializationContext, abstractC6390e.deserialize(jsonParser, deserializationContext));
            if (this._injectables != null) {
                injectValues(deserializationContext, objCreateUsingArrayDelegate);
            }
            return objCreateUsingArrayDelegate;
        }
        CoercionAction coercionAction_findCoercionFromEmptyArray = _findCoercionFromEmptyArray(deserializationContext);
        boolean zIsEnabled = deserializationContext.isEnabled(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS);
        if (zIsEnabled || coercionAction_findCoercionFromEmptyArray != CoercionAction.Fail) {
            JsonToken jsonTokenMo10905t0 = jsonParser.mo10905t0();
            JsonToken jsonToken = JsonToken.END_ARRAY;
            if (jsonTokenMo10905t0 == jsonToken) {
                int i11 = C6352a.f10237b[coercionAction_findCoercionFromEmptyArray.ordinal()];
                if (i11 != 1) {
                    return (i11 == 2 || i11 == 3) ? getNullValue(deserializationContext) : deserializationContext.handleUnexpectedToken(getValueType(deserializationContext), JsonToken.START_ARRAY, jsonParser, (String) null, new Object[0]);
                }
                return getEmptyValue(deserializationContext);
            }
            jsonParser2 = jsonParser;
            if (zIsEnabled) {
                JsonToken jsonTokenMo10905t1 = jsonParser2.mo10905t0();
                JsonToken jsonToken2 = JsonToken.START_ARRAY;
                if (jsonTokenMo10905t1 == jsonToken2) {
                    JavaType valueType = getValueType(deserializationContext);
                    return deserializationContext.handleUnexpectedToken(valueType, jsonToken2, jsonParser2, "Cannot deserialize value of type %s from deeply-nested JSON Array: only single wrapper allowed with `%s`", C6490g.m11904G(valueType), "DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS");
                }
                Object objDeserialize = deserialize(jsonParser2, deserializationContext);
                if (jsonParser2.mo10905t0() != jsonToken) {
                    handleMissingEndArrayForSingle(jsonParser2, deserializationContext);
                }
                return objDeserialize;
            }
            deserializationContext2 = deserializationContext;
        } else {
            jsonParser2 = jsonParser;
            deserializationContext2 = deserializationContext;
        }
        return deserializationContext2.handleUnexpectedToken(getValueType(deserializationContext2), jsonParser2);
    }

    public final Object _deserializeOther(JsonParser jsonParser, DeserializationContext deserializationContext, JsonToken jsonToken) throws IOException {
        if (jsonToken != null) {
            switch (C6352a.f10236a[jsonToken.ordinal()]) {
                case 1:
                    return deserializeFromString(jsonParser, deserializationContext);
                case 2:
                    return deserializeFromNumber(jsonParser, deserializationContext);
                case 3:
                    return deserializeFromDouble(jsonParser, deserializationContext);
                case 4:
                    return deserializeFromEmbedded(jsonParser, deserializationContext);
                case 5:
                case 6:
                    return deserializeFromBoolean(jsonParser, deserializationContext);
                case 7:
                    return deserializeFromNull(jsonParser, deserializationContext);
                case 8:
                    return _deserializeFromArray(jsonParser, deserializationContext);
                case 9:
                case 10:
                    if (this._vanillaProcessing) {
                        return m11204d(jsonParser, deserializationContext, jsonToken);
                    }
                    return this._objectIdReader != null ? deserializeWithObjectId(jsonParser, deserializationContext) : deserializeFromObject(jsonParser, deserializationContext);
            }
        }
        return deserializationContext.handleUnexpectedToken(getValueType(deserializationContext), jsonParser);
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase
    public Object _deserializeUsingPropertyBased(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        Object objM11298a;
        Object objWrapInstantiationProblem;
        PropertyBasedCreator propertyBasedCreator = this._propertyBasedCreator;
        C6372g c6372gM11302g = propertyBasedCreator.m11302g(jsonParser, deserializationContext, this._objectIdReader);
        Class<?> activeView = this._needViewProcesing ? deserializationContext.getActiveView() : null;
        JsonToken jsonTokenMo10889k = jsonParser.mo10889k();
        ArrayList arrayList = null;
        C6499p c6499pBufferForInputBuffering = null;
        while (jsonTokenMo10889k == JsonToken.FIELD_NAME) {
            String strMo10887j = jsonParser.mo10887j();
            jsonParser.mo10905t0();
            SettableBeanProperty settableBeanPropertyM11300e = propertyBasedCreator.m11300e(strMo10887j);
            if (!c6372gM11302g.m11372i(strMo10887j) || settableBeanPropertyM11300e != null) {
                if (settableBeanPropertyM11300e == null) {
                    SettableBeanProperty settableBeanPropertyFind = this._beanProperties.find(strMo10887j);
                    if (settableBeanPropertyFind != null) {
                        try {
                            c6372gM11302g.m11368e(settableBeanPropertyFind, _deserializeWithErrorWrapping(jsonParser, deserializationContext, settableBeanPropertyFind));
                        } catch (UnresolvedForwardReference e11) {
                            C6353b c6353bM11203c = m11203c(deserializationContext, settableBeanPropertyFind, c6372gM11302g, e11);
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(c6353bM11203c);
                        }
                    } else if (IgnorePropertiesUtil.m11868c(strMo10887j, this._ignorableProps, this._includableProps)) {
                        handleIgnoredProperty(jsonParser, deserializationContext, handledType(), strMo10887j);
                    } else {
                        SettableAnyProperty settableAnyProperty = this._anySetter;
                        if (settableAnyProperty != null) {
                            try {
                                c6372gM11302g.m11366c(settableAnyProperty, strMo10887j, settableAnyProperty.deserialize(jsonParser, deserializationContext));
                            } catch (Exception e12) {
                                wrapAndThrow(e12, this._beanType.getRawClass(), strMo10887j, deserializationContext);
                            }
                        } else if (this._ignoreAllUnknown) {
                            jsonParser.mo10856C0();
                        } else {
                            if (c6499pBufferForInputBuffering == null) {
                                c6499pBufferForInputBuffering = deserializationContext.bufferForInputBuffering(jsonParser);
                            }
                            c6499pBufferForInputBuffering.mo10810a0(strMo10887j);
                            c6499pBufferForInputBuffering.m12017X0(jsonParser);
                        }
                    }
                } else if (activeView != null && !settableBeanPropertyM11300e.visibleInView(activeView)) {
                    jsonParser.mo10856C0();
                } else if (c6372gM11302g.m11365b(settableBeanPropertyM11300e, _deserializeWithErrorWrapping(jsonParser, deserializationContext, settableBeanPropertyM11300e))) {
                    jsonParser.mo10905t0();
                    try {
                        objWrapInstantiationProblem = propertyBasedCreator.m11298a(deserializationContext, c6372gM11302g);
                    } catch (Exception e13) {
                        objWrapInstantiationProblem = wrapInstantiationProblem(e13, deserializationContext);
                    }
                    if (objWrapInstantiationProblem == null) {
                        return deserializationContext.handleInstantiationProblem(handledType(), null, _creatorReturnedNullException());
                    }
                    jsonParser.mo10916z0(objWrapInstantiationProblem);
                    if (objWrapInstantiationProblem.getClass() != this._beanType.getRawClass()) {
                        return handlePolymorphic(jsonParser, deserializationContext, objWrapInstantiationProblem, c6499pBufferForInputBuffering);
                    }
                    if (c6499pBufferForInputBuffering != null) {
                        objWrapInstantiationProblem = handleUnknownProperties(deserializationContext, objWrapInstantiationProblem, c6499pBufferForInputBuffering);
                    }
                    return deserialize(jsonParser, deserializationContext, objWrapInstantiationProblem);
                }
            }
            jsonTokenMo10889k = jsonParser.mo10905t0();
        }
        try {
            objM11298a = propertyBasedCreator.m11298a(deserializationContext, c6372gM11302g);
        } catch (Exception e14) {
            wrapInstantiationProblem(e14, deserializationContext);
            objM11298a = null;
        }
        if (this._injectables != null) {
            injectValues(deserializationContext, objM11298a);
        }
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((C6353b) it.next()).m11206e(objM11298a);
            }
        }
        if (c6499pBufferForInputBuffering != null) {
            return objM11298a.getClass() != this._beanType.getRawClass() ? handlePolymorphic(null, deserializationContext, objM11298a, c6499pBufferForInputBuffering) : handleUnknownProperties(deserializationContext, objM11298a, c6499pBufferForInputBuffering);
        }
        return objM11298a;
    }

    public Object _deserializeWithExternalTypeId(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj, C6369d c6369d) throws IOException {
        Class<?> activeView = this._needViewProcesing ? deserializationContext.getActiveView() : null;
        JsonToken jsonTokenMo10889k = jsonParser.mo10889k();
        while (jsonTokenMo10889k == JsonToken.FIELD_NAME) {
            String strMo10887j = jsonParser.mo10887j();
            JsonToken jsonTokenMo10905t0 = jsonParser.mo10905t0();
            SettableBeanProperty settableBeanPropertyFind = this._beanProperties.find(strMo10887j);
            if (settableBeanPropertyFind != null) {
                if (jsonTokenMo10905t0.isScalarValue()) {
                    c6369d.m11339h(jsonParser, deserializationContext, strMo10887j, obj);
                }
                if (activeView == null || settableBeanPropertyFind.visibleInView(activeView)) {
                    try {
                        settableBeanPropertyFind.deserializeAndSet(jsonParser, deserializationContext, obj);
                    } catch (Exception e11) {
                        wrapAndThrow(e11, obj, strMo10887j, deserializationContext);
                    }
                } else {
                    jsonParser.mo10856C0();
                }
            } else if (IgnorePropertiesUtil.m11868c(strMo10887j, this._ignorableProps, this._includableProps)) {
                handleIgnoredProperty(jsonParser, deserializationContext, obj, strMo10887j);
            } else if (!c6369d.m11338g(jsonParser, deserializationContext, strMo10887j, obj)) {
                SettableAnyProperty settableAnyProperty = this._anySetter;
                if (settableAnyProperty != null) {
                    try {
                        settableAnyProperty.deserializeAndSet(jsonParser, deserializationContext, obj, strMo10887j);
                    } catch (Exception e12) {
                        wrapAndThrow(e12, obj, strMo10887j, deserializationContext);
                    }
                } else {
                    handleUnknownProperty(jsonParser, deserializationContext, obj, strMo10887j);
                }
            }
            jsonTokenMo10889k = jsonParser.mo10905t0();
        }
        return c6369d.m11337f(jsonParser, deserializationContext, obj);
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase
    public BeanDeserializerBase asArrayDeserializer() {
        return new BeanAsArrayDeserializer(this, this._beanProperties.getPropertiesInInsertionOrder());
    }

    /* JADX INFO: renamed from: c */
    public final C6353b m11203c(DeserializationContext deserializationContext, SettableBeanProperty settableBeanProperty, C6372g c6372g, UnresolvedForwardReference unresolvedForwardReference) throws JsonMappingException {
        C6353b c6353b = new C6353b(deserializationContext, unresolvedForwardReference, settableBeanProperty.getType(), c6372g, settableBeanProperty);
        unresolvedForwardReference.getRoid().m11373a(c6353b);
        return c6353b;
    }

    /* JADX INFO: renamed from: d */
    public final Object m11204d(JsonParser jsonParser, DeserializationContext deserializationContext, JsonToken jsonToken) throws IOException {
        Object objCreateUsingDefault = this._valueInstantiator.createUsingDefault(deserializationContext);
        jsonParser.mo10916z0(objCreateUsingDefault);
        if (jsonParser.mo10892l0(5)) {
            String strMo10887j = jsonParser.mo10887j();
            do {
                jsonParser.mo10905t0();
                SettableBeanProperty settableBeanPropertyFind = this._beanProperties.find(strMo10887j);
                if (settableBeanPropertyFind != null) {
                    try {
                        settableBeanPropertyFind.deserializeAndSet(jsonParser, deserializationContext, objCreateUsingDefault);
                    } catch (Exception e11) {
                        wrapAndThrow(e11, objCreateUsingDefault, strMo10887j, deserializationContext);
                    }
                } else {
                    handleUnknownVanilla(jsonParser, deserializationContext, objCreateUsingDefault, strMo10887j);
                }
                strMo10887j = jsonParser.mo10903r0();
            } while (strMo10887j != null);
        }
        return objCreateUsingDefault;
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase
    public Object deserializeFromObject(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        Class<?> activeView;
        Object objMo10865S;
        ObjectIdReader objectIdReader = this._objectIdReader;
        if (objectIdReader != null && objectIdReader.maySerializeAsObject() && jsonParser.mo10892l0(5) && this._objectIdReader.isValidReferencePropertyName(jsonParser.mo10887j(), jsonParser)) {
            return deserializeFromObjectId(jsonParser, deserializationContext);
        }
        if (this._nonStandardCreation) {
            if (this._unwrappedPropertyHandler != null) {
                return deserializeWithUnwrapped(jsonParser, deserializationContext);
            }
            return this._externalTypeIdHandler != null ? deserializeWithExternalTypeId(jsonParser, deserializationContext) : deserializeFromObjectUsingNonDefault(jsonParser, deserializationContext);
        }
        Object objCreateUsingDefault = this._valueInstantiator.createUsingDefault(deserializationContext);
        jsonParser.mo10916z0(objCreateUsingDefault);
        if (jsonParser.mo10881g() && (objMo10865S = jsonParser.mo10865S()) != null) {
            _handleTypedObjectId(jsonParser, deserializationContext, objCreateUsingDefault, objMo10865S);
        }
        if (this._injectables != null) {
            injectValues(deserializationContext, objCreateUsingDefault);
        }
        if (this._needViewProcesing && (activeView = deserializationContext.getActiveView()) != null) {
            return deserializeWithView(jsonParser, deserializationContext, objCreateUsingDefault, activeView);
        }
        if (jsonParser.mo10892l0(5)) {
            String strMo10887j = jsonParser.mo10887j();
            do {
                jsonParser.mo10905t0();
                SettableBeanProperty settableBeanPropertyFind = this._beanProperties.find(strMo10887j);
                if (settableBeanPropertyFind != null) {
                    try {
                        settableBeanPropertyFind.deserializeAndSet(jsonParser, deserializationContext, objCreateUsingDefault);
                    } catch (Exception e11) {
                        wrapAndThrow(e11, objCreateUsingDefault, strMo10887j, deserializationContext);
                    }
                } else {
                    handleUnknownVanilla(jsonParser, deserializationContext, objCreateUsingDefault, strMo10887j);
                }
                strMo10887j = jsonParser.mo10903r0();
            } while (strMo10887j != null);
        }
        return objCreateUsingDefault;
    }

    public Object deserializeUsingPropertyBasedWithExternalTypeId(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        C6369d c6369dM11340i = this._externalTypeIdHandler.m11340i();
        PropertyBasedCreator propertyBasedCreator = this._propertyBasedCreator;
        C6372g c6372gM11302g = propertyBasedCreator.m11302g(jsonParser, deserializationContext, this._objectIdReader);
        Class<?> activeView = this._needViewProcesing ? deserializationContext.getActiveView() : null;
        JsonToken jsonTokenMo10889k = jsonParser.mo10889k();
        while (jsonTokenMo10889k == JsonToken.FIELD_NAME) {
            String strMo10887j = jsonParser.mo10887j();
            JsonToken jsonTokenMo10905t0 = jsonParser.mo10905t0();
            SettableBeanProperty settableBeanPropertyM11300e = propertyBasedCreator.m11300e(strMo10887j);
            if (!c6372gM11302g.m11372i(strMo10887j) || settableBeanPropertyM11300e != null) {
                if (settableBeanPropertyM11300e == null) {
                    SettableBeanProperty settableBeanPropertyFind = this._beanProperties.find(strMo10887j);
                    if (settableBeanPropertyFind != null) {
                        if (jsonTokenMo10905t0.isScalarValue()) {
                            c6369dM11340i.m11339h(jsonParser, deserializationContext, strMo10887j, null);
                        }
                        if (activeView == null || settableBeanPropertyFind.visibleInView(activeView)) {
                            c6372gM11302g.m11368e(settableBeanPropertyFind, settableBeanPropertyFind.deserialize(jsonParser, deserializationContext));
                        } else {
                            jsonParser.mo10856C0();
                        }
                    } else if (!c6369dM11340i.m11338g(jsonParser, deserializationContext, strMo10887j, null)) {
                        if (IgnorePropertiesUtil.m11868c(strMo10887j, this._ignorableProps, this._includableProps)) {
                            handleIgnoredProperty(jsonParser, deserializationContext, handledType(), strMo10887j);
                        } else {
                            SettableAnyProperty settableAnyProperty = this._anySetter;
                            if (settableAnyProperty != null) {
                                c6372gM11302g.m11366c(settableAnyProperty, strMo10887j, settableAnyProperty.deserialize(jsonParser, deserializationContext));
                            } else {
                                handleUnknownProperty(jsonParser, deserializationContext, this._valueClass, strMo10887j);
                            }
                        }
                    }
                } else if (!c6369dM11340i.m11338g(jsonParser, deserializationContext, strMo10887j, null) && c6372gM11302g.m11365b(settableBeanPropertyM11300e, _deserializeWithErrorWrapping(jsonParser, deserializationContext, settableBeanPropertyM11300e))) {
                    jsonParser.mo10905t0();
                    try {
                        Object objM11298a = propertyBasedCreator.m11298a(deserializationContext, c6372gM11302g);
                        if (objM11298a.getClass() == this._beanType.getRawClass()) {
                            return _deserializeWithExternalTypeId(jsonParser, deserializationContext, objM11298a, c6369dM11340i);
                        }
                        JavaType javaType = this._beanType;
                        return deserializationContext.reportBadDefinition(javaType, String.format("Cannot create polymorphic instances with external type ids (%s -> %s)", javaType, objM11298a.getClass()));
                    } catch (Exception e11) {
                        wrapAndThrow(e11, this._beanType.getRawClass(), strMo10887j, deserializationContext);
                    }
                }
            }
            jsonTokenMo10889k = jsonParser.mo10905t0();
        }
        try {
            return c6369dM11340i.m11336e(jsonParser, deserializationContext, c6372gM11302g, propertyBasedCreator);
        } catch (Exception e12) {
            return wrapInstantiationProblem(e12, deserializationContext);
        }
    }

    public Object deserializeUsingPropertyBasedWithUnwrapped(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        Object objWrapInstantiationProblem;
        PropertyBasedCreator propertyBasedCreator = this._propertyBasedCreator;
        C6372g c6372gM11302g = propertyBasedCreator.m11302g(jsonParser, deserializationContext, this._objectIdReader);
        C6499p c6499pBufferForInputBuffering = deserializationContext.bufferForInputBuffering(jsonParser);
        c6499pBufferForInputBuffering.mo10850y0();
        JsonToken jsonTokenMo10889k = jsonParser.mo10889k();
        while (jsonTokenMo10889k == JsonToken.FIELD_NAME) {
            String strMo10887j = jsonParser.mo10887j();
            jsonParser.mo10905t0();
            SettableBeanProperty settableBeanPropertyM11300e = propertyBasedCreator.m11300e(strMo10887j);
            if (!c6372gM11302g.m11372i(strMo10887j) || settableBeanPropertyM11300e != null) {
                if (settableBeanPropertyM11300e == null) {
                    SettableBeanProperty settableBeanPropertyFind = this._beanProperties.find(strMo10887j);
                    if (settableBeanPropertyFind != null) {
                        c6372gM11302g.m11368e(settableBeanPropertyFind, _deserializeWithErrorWrapping(jsonParser, deserializationContext, settableBeanPropertyFind));
                    } else if (IgnorePropertiesUtil.m11868c(strMo10887j, this._ignorableProps, this._includableProps)) {
                        handleIgnoredProperty(jsonParser, deserializationContext, handledType(), strMo10887j);
                    } else if (this._anySetter == null) {
                        c6499pBufferForInputBuffering.mo10810a0(strMo10887j);
                        c6499pBufferForInputBuffering.m12017X0(jsonParser);
                    } else {
                        C6499p c6499pBufferAsCopyOfValue = deserializationContext.bufferAsCopyOfValue(jsonParser);
                        c6499pBufferForInputBuffering.mo10810a0(strMo10887j);
                        c6499pBufferForInputBuffering.m12012S0(c6499pBufferAsCopyOfValue);
                        try {
                            SettableAnyProperty settableAnyProperty = this._anySetter;
                            c6372gM11302g.m11366c(settableAnyProperty, strMo10887j, settableAnyProperty.deserialize(c6499pBufferAsCopyOfValue.m12016W0(), deserializationContext));
                        } catch (Exception e11) {
                            wrapAndThrow(e11, this._beanType.getRawClass(), strMo10887j, deserializationContext);
                        }
                    }
                } else if (c6372gM11302g.m11365b(settableBeanPropertyM11300e, _deserializeWithErrorWrapping(jsonParser, deserializationContext, settableBeanPropertyM11300e))) {
                    JsonToken jsonTokenMo10905t0 = jsonParser.mo10905t0();
                    try {
                        objWrapInstantiationProblem = propertyBasedCreator.m11298a(deserializationContext, c6372gM11302g);
                    } catch (Exception e12) {
                        objWrapInstantiationProblem = wrapInstantiationProblem(e12, deserializationContext);
                    }
                    jsonParser.mo10916z0(objWrapInstantiationProblem);
                    while (jsonTokenMo10905t0 == JsonToken.FIELD_NAME) {
                        c6499pBufferForInputBuffering.m12017X0(jsonParser);
                        jsonTokenMo10905t0 = jsonParser.mo10905t0();
                    }
                    JsonToken jsonToken = JsonToken.END_OBJECT;
                    if (jsonTokenMo10905t0 != jsonToken) {
                        deserializationContext.reportWrongTokenException(this, jsonToken, "Attempted to unwrap '%s' value", handledType().getName());
                    }
                    c6499pBufferForInputBuffering.mo10806X();
                    if (objWrapInstantiationProblem.getClass() == this._beanType.getRawClass()) {
                        return this._unwrappedPropertyHandler.m11385b(jsonParser, deserializationContext, objWrapInstantiationProblem, c6499pBufferForInputBuffering);
                    }
                    deserializationContext.reportInputMismatch(settableBeanPropertyM11300e, "Cannot create polymorphic instances with unwrapped values", new Object[0]);
                    return null;
                }
            }
            jsonTokenMo10889k = jsonParser.mo10905t0();
        }
        try {
            return this._unwrappedPropertyHandler.m11385b(jsonParser, deserializationContext, propertyBasedCreator.m11298a(deserializationContext, c6372gM11302g), c6499pBufferForInputBuffering);
        } catch (Exception e13) {
            wrapInstantiationProblem(e13, deserializationContext);
            return null;
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase
    public BeanDeserializerBase withBeanProperties(BeanPropertyMap beanPropertyMap) {
        return new BeanDeserializer(this, beanPropertyMap);
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase
    public BeanDeserializer withByNameInclusion(Set<String> set, Set<String> set2) {
        return new BeanDeserializer(this, set, set2);
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase
    public BeanDeserializerBase withIgnoreAllUnknown(boolean z11) {
        return new BeanDeserializer(this, z11);
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase
    public BeanDeserializer withObjectIdReader(ObjectIdReader objectIdReader) {
        return new BeanDeserializer(this, objectIdReader);
    }

    public BeanDeserializer(BeanDeserializerBase beanDeserializerBase) {
        super(beanDeserializerBase, beanDeserializerBase._ignoreAllUnknown);
    }

    public final Object _deserializeWithErrorWrapping(JsonParser jsonParser, DeserializationContext deserializationContext, SettableBeanProperty settableBeanProperty) throws IOException {
        try {
            return settableBeanProperty.deserialize(jsonParser, deserializationContext);
        } catch (Exception e11) {
            wrapAndThrow(e11, this._beanType.getRawClass(), settableBeanProperty.getName(), deserializationContext);
            return null;
        }
    }

    @Deprecated
    public Object _missingToken(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        throw deserializationContext.endOfInputException(handledType());
    }

    public Object deserializeFromNull(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        Object objDeserializeFromObject;
        if (jsonParser.mo10914y0()) {
            C6499p c6499pBufferForInputBuffering = deserializationContext.bufferForInputBuffering(jsonParser);
            c6499pBufferForInputBuffering.mo10806X();
            JsonParser jsonParserM12014U0 = c6499pBufferForInputBuffering.m12014U0(jsonParser);
            jsonParserM12014U0.mo10905t0();
            if (this._vanillaProcessing) {
                objDeserializeFromObject = m11204d(jsonParserM12014U0, deserializationContext, JsonToken.END_OBJECT);
            } else {
                objDeserializeFromObject = deserializeFromObject(jsonParserM12014U0, deserializationContext);
            }
            jsonParserM12014U0.close();
            return objDeserializeFromObject;
        }
        return deserializationContext.handleUnexpectedToken(getValueType(deserializationContext), jsonParser);
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase, com.fasterxml.jackson.databind.AbstractC6390e
    public AbstractC6390e<Object> unwrappingDeserializer(NameTransformer nameTransformer) {
        if (getClass() != BeanDeserializer.class || this.f10235b == nameTransformer) {
            return this;
        }
        this.f10235b = nameTransformer;
        try {
            return new BeanDeserializer(this, nameTransformer);
        } finally {
            this.f10235b = null;
        }
    }

    public BeanDeserializer(BeanDeserializerBase beanDeserializerBase, boolean z11) {
        super(beanDeserializerBase, z11);
    }

    public BeanDeserializer(BeanDeserializerBase beanDeserializerBase, NameTransformer nameTransformer) {
        super(beanDeserializerBase, nameTransformer);
    }

    public BeanDeserializer(BeanDeserializerBase beanDeserializerBase, ObjectIdReader objectIdReader) {
        super(beanDeserializerBase, objectIdReader);
    }

    @Deprecated
    public BeanDeserializer(BeanDeserializerBase beanDeserializerBase, Set<String> set) {
        super(beanDeserializerBase, set);
    }

    public BeanDeserializer(BeanDeserializerBase beanDeserializerBase, Set<String> set, Set<String> set2) {
        super(beanDeserializerBase, set, set2);
    }

    public Object deserializeWithExternalTypeId(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
        return _deserializeWithExternalTypeId(jsonParser, deserializationContext, obj, this._externalTypeIdHandler.m11340i());
    }

    public BeanDeserializer(BeanDeserializerBase beanDeserializerBase, BeanPropertyMap beanPropertyMap) {
        super(beanDeserializerBase, beanPropertyMap);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0057  */
    /* JADX WARN: Code duplicated, block: B:37:0x004e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.fasterxml.jackson.databind.AbstractC6390e
    public Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
        String strMo10887j;
        SettableBeanProperty settableBeanPropertyFind;
        Class<?> activeView;
        jsonParser.mo10916z0(obj);
        if (this._injectables != null) {
            injectValues(deserializationContext, obj);
        }
        if (this._unwrappedPropertyHandler != null) {
            return deserializeWithUnwrapped(jsonParser, deserializationContext, obj);
        }
        if (this._externalTypeIdHandler != null) {
            return deserializeWithExternalTypeId(jsonParser, deserializationContext, obj);
        }
        if (jsonParser.mo10900p0()) {
            strMo10887j = jsonParser.mo10903r0();
            if (strMo10887j != null) {
                if (!this._needViewProcesing && (activeView = deserializationContext.getActiveView()) != null) {
                    return deserializeWithView(jsonParser, deserializationContext, obj, activeView);
                }
                do {
                    jsonParser.mo10905t0();
                    settableBeanPropertyFind = this._beanProperties.find(strMo10887j);
                    if (settableBeanPropertyFind != null) {
                        try {
                            settableBeanPropertyFind.deserializeAndSet(jsonParser, deserializationContext, obj);
                        } catch (Exception e11) {
                            wrapAndThrow(e11, obj, strMo10887j, deserializationContext);
                        }
                    } else {
                        handleUnknownVanilla(jsonParser, deserializationContext, obj, strMo10887j);
                    }
                    strMo10887j = jsonParser.mo10903r0();
                } while (strMo10887j != null);
            }
        } else if (jsonParser.mo10892l0(5)) {
            strMo10887j = jsonParser.mo10887j();
            if (!this._needViewProcesing) {
            }
            do {
                jsonParser.mo10905t0();
                settableBeanPropertyFind = this._beanProperties.find(strMo10887j);
                if (settableBeanPropertyFind != null) {
                    settableBeanPropertyFind.deserializeAndSet(jsonParser, deserializationContext, obj);
                } else {
                    handleUnknownVanilla(jsonParser, deserializationContext, obj, strMo10887j);
                }
                strMo10887j = jsonParser.mo10903r0();
            } while (strMo10887j != null);
        }
        return obj;
    }

    public Object deserializeWithUnwrapped(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
        JsonToken jsonTokenMo10889k = jsonParser.mo10889k();
        if (jsonTokenMo10889k == JsonToken.START_OBJECT) {
            jsonTokenMo10889k = jsonParser.mo10905t0();
        }
        C6499p c6499pBufferForInputBuffering = deserializationContext.bufferForInputBuffering(jsonParser);
        c6499pBufferForInputBuffering.mo10850y0();
        Class<?> activeView = this._needViewProcesing ? deserializationContext.getActiveView() : null;
        while (jsonTokenMo10889k == JsonToken.FIELD_NAME) {
            String strMo10887j = jsonParser.mo10887j();
            SettableBeanProperty settableBeanPropertyFind = this._beanProperties.find(strMo10887j);
            jsonParser.mo10905t0();
            if (settableBeanPropertyFind != null) {
                if (activeView != null && !settableBeanPropertyFind.visibleInView(activeView)) {
                    jsonParser.mo10856C0();
                } else {
                    try {
                        settableBeanPropertyFind.deserializeAndSet(jsonParser, deserializationContext, obj);
                    } catch (Exception e11) {
                        wrapAndThrow(e11, obj, strMo10887j, deserializationContext);
                    }
                }
            } else if (IgnorePropertiesUtil.m11868c(strMo10887j, this._ignorableProps, this._includableProps)) {
                handleIgnoredProperty(jsonParser, deserializationContext, obj, strMo10887j);
            } else if (this._anySetter == null) {
                c6499pBufferForInputBuffering.mo10810a0(strMo10887j);
                c6499pBufferForInputBuffering.m12017X0(jsonParser);
            } else {
                C6499p c6499pBufferAsCopyOfValue = deserializationContext.bufferAsCopyOfValue(jsonParser);
                c6499pBufferForInputBuffering.mo10810a0(strMo10887j);
                c6499pBufferForInputBuffering.m12012S0(c6499pBufferAsCopyOfValue);
                try {
                    this._anySetter.deserializeAndSet(c6499pBufferAsCopyOfValue.m12016W0(), deserializationContext, obj, strMo10887j);
                } catch (Exception e12) {
                    wrapAndThrow(e12, obj, strMo10887j, deserializationContext);
                }
            }
            jsonTokenMo10889k = jsonParser.mo10905t0();
        }
        c6499pBufferForInputBuffering.mo10806X();
        this._unwrappedPropertyHandler.m11385b(jsonParser, deserializationContext, obj, c6499pBufferForInputBuffering);
        return obj;
    }
}
