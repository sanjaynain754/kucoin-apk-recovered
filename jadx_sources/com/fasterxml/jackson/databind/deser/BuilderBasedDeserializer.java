package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.AbstractC6340b;
import com.fasterxml.jackson.databind.AbstractC6390e;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.cfg.CoercionAction;
import com.fasterxml.jackson.databind.deser.impl.BeanAsArrayBuilderDeserializer;
import com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap;
import com.fasterxml.jackson.databind.deser.impl.C6369d;
import com.fasterxml.jackson.databind.deser.impl.C6372g;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdReader;
import com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.util.C6499p;
import com.fasterxml.jackson.databind.util.IgnorePropertiesUtil;
import com.fasterxml.jackson.databind.util.NameTransformer;
import java.io.IOException;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes45.dex */
public class BuilderBasedDeserializer extends BeanDeserializerBase {
    private static final long serialVersionUID = 1;
    protected final AnnotatedMethod _buildMethod;
    protected final JavaType _targetType;

    public BuilderBasedDeserializer(C6356a c6356a, AbstractC6340b abstractC6340b, JavaType javaType, BeanPropertyMap beanPropertyMap, Map<String, SettableBeanProperty> map, Set<String> set, boolean z11, boolean z12) {
        this(c6356a, abstractC6340b, javaType, beanPropertyMap, map, set, z11, null, z12);
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6390e
    public Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        if (jsonParser.mo10900p0()) {
            return this._vanillaProcessing ? finishBuild(deserializationContext, m11210c(jsonParser, deserializationContext, jsonParser.mo10905t0())) : finishBuild(deserializationContext, deserializeFromObject(jsonParser, deserializationContext));
        }
        switch (jsonParser.mo10891l()) {
            case 2:
            case 5:
                return finishBuild(deserializationContext, deserializeFromObject(jsonParser, deserializationContext));
            case 3:
                return _deserializeFromArray(jsonParser, deserializationContext);
            case 4:
            case 11:
            default:
                return deserializationContext.handleUnexpectedToken(getValueType(deserializationContext), jsonParser);
            case 6:
                return finishBuild(deserializationContext, deserializeFromString(jsonParser, deserializationContext));
            case 7:
                return finishBuild(deserializationContext, deserializeFromNumber(jsonParser, deserializationContext));
            case 8:
                return finishBuild(deserializationContext, deserializeFromDouble(jsonParser, deserializationContext));
            case 9:
            case 10:
                return finishBuild(deserializationContext, deserializeFromBoolean(jsonParser, deserializationContext));
            case 12:
                return jsonParser.mo10858J();
        }
    }

    public Object deserializeWithExternalTypeId(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        return this._propertyBasedCreator != null ? deserializeUsingPropertyBasedWithExternalTypeId(jsonParser, deserializationContext) : deserializeWithExternalTypeId(jsonParser, deserializationContext, this._valueInstantiator.createUsingDefault(deserializationContext));
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
        if (this._injectables != null) {
            injectValues(deserializationContext, objCreateUsingDefault);
        }
        Class<?> activeView = this._needViewProcesing ? deserializationContext.getActiveView() : null;
        while (jsonParser.mo10889k() == JsonToken.FIELD_NAME) {
            String strMo10887j = jsonParser.mo10887j();
            jsonParser.mo10905t0();
            SettableBeanProperty settableBeanPropertyFind = this._beanProperties.find(strMo10887j);
            if (settableBeanPropertyFind != null) {
                if (activeView == null || settableBeanPropertyFind.visibleInView(activeView)) {
                    try {
                        objCreateUsingDefault = settableBeanPropertyFind.deserializeSetAndReturn(jsonParser, deserializationContext, objCreateUsingDefault);
                    } catch (Exception e11) {
                        wrapAndThrow(e11, objCreateUsingDefault, strMo10887j, deserializationContext);
                    }
                } else {
                    jsonParser.mo10856C0();
                }
            } else if (IgnorePropertiesUtil.m11868c(strMo10887j, this._ignorableProps, this._includableProps)) {
                handleIgnoredProperty(jsonParser, deserializationContext, objCreateUsingDefault, strMo10887j);
            } else {
                c6499pBufferForInputBuffering.mo10810a0(strMo10887j);
                c6499pBufferForInputBuffering.m12017X0(jsonParser);
                SettableAnyProperty settableAnyProperty = this._anySetter;
                if (settableAnyProperty != null) {
                    try {
                        settableAnyProperty.deserializeAndSet(jsonParser, deserializationContext, objCreateUsingDefault, strMo10887j);
                    } catch (Exception e12) {
                        wrapAndThrow(e12, objCreateUsingDefault, strMo10887j, deserializationContext);
                    }
                }
            }
            jsonParser.mo10905t0();
        }
        c6499pBufferForInputBuffering.mo10806X();
        return this._unwrappedPropertyHandler.m11385b(jsonParser, deserializationContext, objCreateUsingDefault, c6499pBufferForInputBuffering);
    }

    /* JADX INFO: renamed from: com.fasterxml.jackson.databind.deser.BuilderBasedDeserializer$a */
    public static /* synthetic */ class C6354a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f10242a;

        static {
            int[] iArr = new int[CoercionAction.values().length];
            f10242a = iArr;
            try {
                iArr[CoercionAction.AsEmpty.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10242a[CoercionAction.AsNull.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f10242a[CoercionAction.TryConvert.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public BuilderBasedDeserializer(C6356a c6356a, AbstractC6340b abstractC6340b, JavaType javaType, BeanPropertyMap beanPropertyMap, Map<String, SettableBeanProperty> map, Set<String> set, boolean z11, Set<String> set2, boolean z12) {
        super(c6356a, abstractC6340b, beanPropertyMap, map, set, z11, set2, z12);
        this._targetType = javaType;
        this._buildMethod = c6356a.m11236r();
        if (this._objectIdReader == null) {
            return;
        }
        throw new IllegalArgumentException("Cannot use Object Id with Builder-based deserialization (type " + abstractC6340b.m11151A() + ")");
    }

    /* JADX INFO: renamed from: c */
    private final Object m11210c(JsonParser jsonParser, DeserializationContext deserializationContext, JsonToken jsonToken) throws IOException {
        Object objCreateUsingDefault = this._valueInstantiator.createUsingDefault(deserializationContext);
        while (jsonParser.mo10889k() == JsonToken.FIELD_NAME) {
            String strMo10887j = jsonParser.mo10887j();
            jsonParser.mo10905t0();
            SettableBeanProperty settableBeanPropertyFind = this._beanProperties.find(strMo10887j);
            if (settableBeanPropertyFind != null) {
                try {
                    objCreateUsingDefault = settableBeanPropertyFind.deserializeSetAndReturn(jsonParser, deserializationContext, objCreateUsingDefault);
                } catch (Exception e11) {
                    wrapAndThrow(e11, objCreateUsingDefault, strMo10887j, deserializationContext);
                }
            } else {
                handleUnknownVanilla(jsonParser, deserializationContext, objCreateUsingDefault, strMo10887j);
            }
            jsonParser.mo10905t0();
        }
        return objCreateUsingDefault;
    }

    public final Object _deserialize(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
        Class<?> activeView;
        if (this._injectables != null) {
            injectValues(deserializationContext, obj);
        }
        if (this._unwrappedPropertyHandler != null) {
            if (jsonParser.mo10890k0(JsonToken.START_OBJECT)) {
                jsonParser.mo10905t0();
            }
            C6499p c6499pBufferForInputBuffering = deserializationContext.bufferForInputBuffering(jsonParser);
            c6499pBufferForInputBuffering.mo10850y0();
            return deserializeWithUnwrapped(jsonParser, deserializationContext, obj, c6499pBufferForInputBuffering);
        }
        if (this._externalTypeIdHandler != null) {
            return deserializeWithExternalTypeId(jsonParser, deserializationContext, obj);
        }
        if (this._needViewProcesing && (activeView = deserializationContext.getActiveView()) != null) {
            return deserializeWithView(jsonParser, deserializationContext, obj, activeView);
        }
        JsonToken jsonTokenMo10889k = jsonParser.mo10889k();
        if (jsonTokenMo10889k == JsonToken.START_OBJECT) {
            jsonTokenMo10889k = jsonParser.mo10905t0();
        }
        while (jsonTokenMo10889k == JsonToken.FIELD_NAME) {
            String strMo10887j = jsonParser.mo10887j();
            jsonParser.mo10905t0();
            SettableBeanProperty settableBeanPropertyFind = this._beanProperties.find(strMo10887j);
            if (settableBeanPropertyFind != null) {
                try {
                    obj = settableBeanPropertyFind.deserializeSetAndReturn(jsonParser, deserializationContext, obj);
                } catch (Exception e11) {
                    wrapAndThrow(e11, obj, strMo10887j, deserializationContext);
                }
            } else {
                handleUnknownVanilla(jsonParser, deserializationContext, obj, strMo10887j);
            }
            jsonTokenMo10889k = jsonParser.mo10905t0();
        }
        return obj;
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
            return finishBuild(deserializationContext, objCreateUsingArrayDelegate);
        }
        CoercionAction coercionAction_findCoercionFromEmptyArray = _findCoercionFromEmptyArray(deserializationContext);
        boolean zIsEnabled = deserializationContext.isEnabled(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS);
        if (zIsEnabled || coercionAction_findCoercionFromEmptyArray != CoercionAction.Fail) {
            JsonToken jsonTokenMo10905t0 = jsonParser.mo10905t0();
            JsonToken jsonToken = JsonToken.END_ARRAY;
            if (jsonTokenMo10905t0 == jsonToken) {
                int i11 = C6354a.f10242a[coercionAction_findCoercionFromEmptyArray.ordinal()];
                if (i11 != 1) {
                    return (i11 == 2 || i11 == 3) ? getNullValue(deserializationContext) : deserializationContext.handleUnexpectedToken(getValueType(deserializationContext), JsonToken.START_ARRAY, jsonParser, (String) null, new Object[0]);
                }
                return getEmptyValue(deserializationContext);
            }
            jsonParser2 = jsonParser;
            deserializationContext2 = deserializationContext;
            if (zIsEnabled) {
                Object objDeserialize = deserialize(jsonParser2, deserializationContext2);
                if (jsonParser2.mo10905t0() != jsonToken) {
                    handleMissingEndArrayForSingle(jsonParser2, deserializationContext2);
                }
                return objDeserialize;
            }
        } else {
            jsonParser2 = jsonParser;
            deserializationContext2 = deserializationContext;
        }
        return deserializationContext2.handleUnexpectedToken(getValueType(deserializationContext2), jsonParser2);
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase
    public Object _deserializeUsingPropertyBased(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        Object objWrapInstantiationProblem;
        PropertyBasedCreator propertyBasedCreator = this._propertyBasedCreator;
        C6372g c6372gM11302g = propertyBasedCreator.m11302g(jsonParser, deserializationContext, this._objectIdReader);
        Class<?> activeView = this._needViewProcesing ? deserializationContext.getActiveView() : null;
        JsonToken jsonTokenMo10889k = jsonParser.mo10889k();
        C6499p c6499pBufferForInputBuffering = null;
        while (jsonTokenMo10889k == JsonToken.FIELD_NAME) {
            String strMo10887j = jsonParser.mo10887j();
            jsonParser.mo10905t0();
            SettableBeanProperty settableBeanPropertyM11300e = propertyBasedCreator.m11300e(strMo10887j);
            if (!c6372gM11302g.m11372i(strMo10887j) || settableBeanPropertyM11300e != null) {
                if (settableBeanPropertyM11300e == null) {
                    SettableBeanProperty settableBeanPropertyFind = this._beanProperties.find(strMo10887j);
                    if (settableBeanPropertyFind != null) {
                        c6372gM11302g.m11368e(settableBeanPropertyFind, settableBeanPropertyFind.deserialize(jsonParser, deserializationContext));
                    } else if (IgnorePropertiesUtil.m11868c(strMo10887j, this._ignorableProps, this._includableProps)) {
                        handleIgnoredProperty(jsonParser, deserializationContext, handledType(), strMo10887j);
                    } else {
                        SettableAnyProperty settableAnyProperty = this._anySetter;
                        if (settableAnyProperty != null) {
                            c6372gM11302g.m11366c(settableAnyProperty, strMo10887j, settableAnyProperty.deserialize(jsonParser, deserializationContext));
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
                } else if (c6372gM11302g.m11365b(settableBeanPropertyM11300e, settableBeanPropertyM11300e.deserialize(jsonParser, deserializationContext))) {
                    jsonParser.mo10905t0();
                    try {
                        Object objM11298a = propertyBasedCreator.m11298a(deserializationContext, c6372gM11302g);
                        if (objM11298a.getClass() != this._beanType.getRawClass()) {
                            return handlePolymorphic(jsonParser, deserializationContext, objM11298a, c6499pBufferForInputBuffering);
                        }
                        if (c6499pBufferForInputBuffering != null) {
                            objM11298a = handleUnknownProperties(deserializationContext, objM11298a, c6499pBufferForInputBuffering);
                        }
                        return _deserialize(jsonParser, deserializationContext, objM11298a);
                    } catch (Exception e11) {
                        wrapAndThrow(e11, this._beanType.getRawClass(), strMo10887j, deserializationContext);
                    }
                } else {
                    continue;
                }
            }
            jsonTokenMo10889k = jsonParser.mo10905t0();
        }
        try {
            objWrapInstantiationProblem = propertyBasedCreator.m11298a(deserializationContext, c6372gM11302g);
        } catch (Exception e12) {
            objWrapInstantiationProblem = wrapInstantiationProblem(e12, deserializationContext);
        }
        if (c6499pBufferForInputBuffering != null) {
            return objWrapInstantiationProblem.getClass() != this._beanType.getRawClass() ? handlePolymorphic(null, deserializationContext, objWrapInstantiationProblem, c6499pBufferForInputBuffering) : handleUnknownProperties(deserializationContext, objWrapInstantiationProblem, c6499pBufferForInputBuffering);
        }
        return objWrapInstantiationProblem;
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase
    public BeanDeserializerBase asArrayDeserializer() {
        return new BeanAsArrayBuilderDeserializer(this, this._targetType, this._beanProperties.getPropertiesInInsertionOrder(), this._buildMethod);
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase
    public Object deserializeFromObject(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        Class<?> activeView;
        if (this._nonStandardCreation) {
            if (this._unwrappedPropertyHandler != null) {
                return deserializeWithUnwrapped(jsonParser, deserializationContext);
            }
            return this._externalTypeIdHandler != null ? deserializeWithExternalTypeId(jsonParser, deserializationContext) : deserializeFromObjectUsingNonDefault(jsonParser, deserializationContext);
        }
        Object objCreateUsingDefault = this._valueInstantiator.createUsingDefault(deserializationContext);
        if (this._injectables != null) {
            injectValues(deserializationContext, objCreateUsingDefault);
        }
        if (this._needViewProcesing && (activeView = deserializationContext.getActiveView()) != null) {
            return deserializeWithView(jsonParser, deserializationContext, objCreateUsingDefault, activeView);
        }
        while (jsonParser.mo10889k() == JsonToken.FIELD_NAME) {
            String strMo10887j = jsonParser.mo10887j();
            jsonParser.mo10905t0();
            SettableBeanProperty settableBeanPropertyFind = this._beanProperties.find(strMo10887j);
            if (settableBeanPropertyFind != null) {
                try {
                    objCreateUsingDefault = settableBeanPropertyFind.deserializeSetAndReturn(jsonParser, deserializationContext, objCreateUsingDefault);
                } catch (Exception e11) {
                    wrapAndThrow(e11, objCreateUsingDefault, strMo10887j, deserializationContext);
                }
            } else {
                handleUnknownVanilla(jsonParser, deserializationContext, objCreateUsingDefault, strMo10887j);
            }
            jsonParser.mo10905t0();
        }
        return objCreateUsingDefault;
    }

    public Object deserializeUsingPropertyBasedWithExternalTypeId(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        JavaType javaType = this._targetType;
        return deserializationContext.reportBadDefinition(javaType, String.format("Deserialization (of %s) with Builder, External type id, @JsonCreator not yet implemented", javaType));
    }

    public Object deserializeUsingPropertyBasedWithUnwrapped(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
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
                        c6372gM11302g.m11368e(settableBeanPropertyFind, settableBeanPropertyFind.deserialize(jsonParser, deserializationContext));
                    } else if (IgnorePropertiesUtil.m11868c(strMo10887j, this._ignorableProps, this._includableProps)) {
                        handleIgnoredProperty(jsonParser, deserializationContext, handledType(), strMo10887j);
                    } else {
                        c6499pBufferForInputBuffering.mo10810a0(strMo10887j);
                        c6499pBufferForInputBuffering.m12017X0(jsonParser);
                        SettableAnyProperty settableAnyProperty = this._anySetter;
                        if (settableAnyProperty != null) {
                            c6372gM11302g.m11366c(settableAnyProperty, strMo10887j, settableAnyProperty.deserialize(jsonParser, deserializationContext));
                        }
                    }
                } else if (c6372gM11302g.m11365b(settableBeanPropertyM11300e, settableBeanPropertyM11300e.deserialize(jsonParser, deserializationContext))) {
                    jsonParser.mo10905t0();
                    try {
                        Object objM11298a = propertyBasedCreator.m11298a(deserializationContext, c6372gM11302g);
                        return objM11298a.getClass() != this._beanType.getRawClass() ? handlePolymorphic(jsonParser, deserializationContext, objM11298a, c6499pBufferForInputBuffering) : deserializeWithUnwrapped(jsonParser, deserializationContext, objM11298a, c6499pBufferForInputBuffering);
                    } catch (Exception e11) {
                        wrapAndThrow(e11, this._beanType.getRawClass(), strMo10887j, deserializationContext);
                    }
                } else {
                    continue;
                }
            }
            jsonTokenMo10889k = jsonParser.mo10905t0();
        }
        c6499pBufferForInputBuffering.mo10806X();
        try {
            return this._unwrappedPropertyHandler.m11385b(jsonParser, deserializationContext, propertyBasedCreator.m11298a(deserializationContext, c6372gM11302g), c6499pBufferForInputBuffering);
        } catch (Exception e12) {
            return wrapInstantiationProblem(e12, deserializationContext);
        }
    }

    public Object finishBuild(DeserializationContext deserializationContext, Object obj) throws IOException {
        AnnotatedMethod annotatedMethod = this._buildMethod;
        if (annotatedMethod == null) {
            return obj;
        }
        try {
            return annotatedMethod.getMember().invoke(obj, null);
        } catch (Exception e11) {
            return wrapInstantiationProblem(e11, deserializationContext);
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase, com.fasterxml.jackson.databind.AbstractC6390e
    public Boolean supportsUpdate(DeserializationConfig deserializationConfig) {
        return Boolean.FALSE;
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase, com.fasterxml.jackson.databind.AbstractC6390e
    public AbstractC6390e<Object> unwrappingDeserializer(NameTransformer nameTransformer) {
        return new BuilderBasedDeserializer(this, nameTransformer);
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase
    public BeanDeserializerBase withBeanProperties(BeanPropertyMap beanPropertyMap) {
        return new BuilderBasedDeserializer(this, beanPropertyMap);
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase
    public BeanDeserializerBase withByNameInclusion(Set<String> set, Set<String> set2) {
        return new BuilderBasedDeserializer(this, set, set2);
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase
    public BeanDeserializerBase withIgnoreAllUnknown(boolean z11) {
        return new BuilderBasedDeserializer(this, z11);
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase
    public BeanDeserializerBase withObjectIdReader(ObjectIdReader objectIdReader) {
        return new BuilderBasedDeserializer(this, objectIdReader);
    }

    public final Object deserializeWithView(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj, Class<?> cls) throws IOException {
        JsonToken jsonTokenMo10889k = jsonParser.mo10889k();
        while (jsonTokenMo10889k == JsonToken.FIELD_NAME) {
            String strMo10887j = jsonParser.mo10887j();
            jsonParser.mo10905t0();
            SettableBeanProperty settableBeanPropertyFind = this._beanProperties.find(strMo10887j);
            if (settableBeanPropertyFind != null) {
                if (!settableBeanPropertyFind.visibleInView(cls)) {
                    jsonParser.mo10856C0();
                } else {
                    try {
                        obj = settableBeanPropertyFind.deserializeSetAndReturn(jsonParser, deserializationContext, obj);
                    } catch (Exception e11) {
                        wrapAndThrow(e11, obj, strMo10887j, deserializationContext);
                    }
                }
            } else {
                handleUnknownVanilla(jsonParser, deserializationContext, obj, strMo10887j);
            }
            jsonTokenMo10889k = jsonParser.mo10905t0();
        }
        return obj;
    }

    public Object deserializeWithExternalTypeId(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
        Class<?> activeView = this._needViewProcesing ? deserializationContext.getActiveView() : null;
        C6369d c6369dM11340i = this._externalTypeIdHandler.m11340i();
        JsonToken jsonTokenMo10889k = jsonParser.mo10889k();
        while (jsonTokenMo10889k == JsonToken.FIELD_NAME) {
            String strMo10887j = jsonParser.mo10887j();
            JsonToken jsonTokenMo10905t0 = jsonParser.mo10905t0();
            SettableBeanProperty settableBeanPropertyFind = this._beanProperties.find(strMo10887j);
            if (settableBeanPropertyFind != null) {
                if (jsonTokenMo10905t0.isScalarValue()) {
                    c6369dM11340i.m11339h(jsonParser, deserializationContext, strMo10887j, obj);
                }
                if (activeView != null && !settableBeanPropertyFind.visibleInView(activeView)) {
                    jsonParser.mo10856C0();
                } else {
                    try {
                        obj = settableBeanPropertyFind.deserializeSetAndReturn(jsonParser, deserializationContext, obj);
                    } catch (Exception e11) {
                        wrapAndThrow(e11, obj, strMo10887j, deserializationContext);
                    }
                }
            } else if (IgnorePropertiesUtil.m11868c(strMo10887j, this._ignorableProps, this._includableProps)) {
                handleIgnoredProperty(jsonParser, deserializationContext, obj, strMo10887j);
            } else if (!c6369dM11340i.m11338g(jsonParser, deserializationContext, strMo10887j, obj)) {
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
        return c6369dM11340i.m11337f(jsonParser, deserializationContext, obj);
    }

    @Deprecated
    public BuilderBasedDeserializer(C6356a c6356a, AbstractC6340b abstractC6340b, BeanPropertyMap beanPropertyMap, Map<String, SettableBeanProperty> map, Set<String> set, boolean z11, boolean z12) {
        this(c6356a, abstractC6340b, abstractC6340b.m11151A(), beanPropertyMap, map, set, z11, z12);
    }

    public BuilderBasedDeserializer(BuilderBasedDeserializer builderBasedDeserializer) {
        this(builderBasedDeserializer, builderBasedDeserializer._ignoreAllUnknown);
    }

    public BuilderBasedDeserializer(BuilderBasedDeserializer builderBasedDeserializer, boolean z11) {
        super(builderBasedDeserializer, z11);
        this._buildMethod = builderBasedDeserializer._buildMethod;
        this._targetType = builderBasedDeserializer._targetType;
    }

    public BuilderBasedDeserializer(BuilderBasedDeserializer builderBasedDeserializer, NameTransformer nameTransformer) {
        super(builderBasedDeserializer, nameTransformer);
        this._buildMethod = builderBasedDeserializer._buildMethod;
        this._targetType = builderBasedDeserializer._targetType;
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6390e
    public Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
        JavaType javaType = this._targetType;
        Class<?> clsHandledType = handledType();
        Class<?> cls = obj.getClass();
        if (clsHandledType.isAssignableFrom(cls)) {
            return deserializationContext.reportBadDefinition(javaType, String.format("Deserialization of %s by passing existing Builder (%s) instance not supported", javaType, clsHandledType.getName()));
        }
        return deserializationContext.reportBadDefinition(javaType, String.format("Deserialization of %s by passing existing instance (of %s) not supported", javaType, cls.getName()));
    }

    public BuilderBasedDeserializer(BuilderBasedDeserializer builderBasedDeserializer, ObjectIdReader objectIdReader) {
        super(builderBasedDeserializer, objectIdReader);
        this._buildMethod = builderBasedDeserializer._buildMethod;
        this._targetType = builderBasedDeserializer._targetType;
    }

    public BuilderBasedDeserializer(BuilderBasedDeserializer builderBasedDeserializer, Set<String> set) {
        this(builderBasedDeserializer, set, builderBasedDeserializer._includableProps);
    }

    public BuilderBasedDeserializer(BuilderBasedDeserializer builderBasedDeserializer, Set<String> set, Set<String> set2) {
        super(builderBasedDeserializer, set, set2);
        this._buildMethod = builderBasedDeserializer._buildMethod;
        this._targetType = builderBasedDeserializer._targetType;
    }

    public BuilderBasedDeserializer(BuilderBasedDeserializer builderBasedDeserializer, BeanPropertyMap beanPropertyMap) {
        super(builderBasedDeserializer, beanPropertyMap);
        this._buildMethod = builderBasedDeserializer._buildMethod;
        this._targetType = builderBasedDeserializer._targetType;
    }

    public Object deserializeWithUnwrapped(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj, C6499p c6499p) throws IOException {
        Class<?> activeView = this._needViewProcesing ? deserializationContext.getActiveView() : null;
        JsonToken jsonTokenMo10889k = jsonParser.mo10889k();
        while (jsonTokenMo10889k == JsonToken.FIELD_NAME) {
            String strMo10887j = jsonParser.mo10887j();
            SettableBeanProperty settableBeanPropertyFind = this._beanProperties.find(strMo10887j);
            jsonParser.mo10905t0();
            if (settableBeanPropertyFind != null) {
                if (activeView != null && !settableBeanPropertyFind.visibleInView(activeView)) {
                    jsonParser.mo10856C0();
                } else {
                    try {
                        obj = settableBeanPropertyFind.deserializeSetAndReturn(jsonParser, deserializationContext, obj);
                    } catch (Exception e11) {
                        wrapAndThrow(e11, obj, strMo10887j, deserializationContext);
                    }
                }
            } else if (IgnorePropertiesUtil.m11868c(strMo10887j, this._ignorableProps, this._includableProps)) {
                handleIgnoredProperty(jsonParser, deserializationContext, obj, strMo10887j);
            } else {
                c6499p.mo10810a0(strMo10887j);
                c6499p.m12017X0(jsonParser);
                SettableAnyProperty settableAnyProperty = this._anySetter;
                if (settableAnyProperty != null) {
                    settableAnyProperty.deserializeAndSet(jsonParser, deserializationContext, obj, strMo10887j);
                }
            }
            jsonTokenMo10889k = jsonParser.mo10905t0();
        }
        c6499p.mo10806X();
        return this._unwrappedPropertyHandler.m11385b(jsonParser, deserializationContext, obj, c6499p);
    }
}
