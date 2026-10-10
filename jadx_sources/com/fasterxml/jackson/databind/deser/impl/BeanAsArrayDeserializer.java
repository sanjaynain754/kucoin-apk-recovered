package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.AbstractC6390e;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.deser.BeanDeserializerBase;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.util.C6490g;
import com.fasterxml.jackson.databind.util.NameTransformer;
import java.io.IOException;
import java.util.Set;

/* JADX INFO: loaded from: classes45.dex */
public class BeanAsArrayDeserializer extends BeanDeserializerBase {
    private static final long serialVersionUID = 1;
    protected final BeanDeserializerBase _delegate;
    protected final SettableBeanProperty[] _orderedProperties;

    @Override // com.fasterxml.jackson.databind.AbstractC6390e
    public Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        if (!jsonParser.mo10898o0()) {
            return _deserializeFromNonArray(jsonParser, deserializationContext);
        }
        if (!this._vanillaProcessing) {
            return _deserializeNonVanilla(jsonParser, deserializationContext);
        }
        Object objCreateUsingDefault = this._valueInstantiator.createUsingDefault(deserializationContext);
        jsonParser.mo10916z0(objCreateUsingDefault);
        SettableBeanProperty[] settableBeanPropertyArr = this._orderedProperties;
        int length = settableBeanPropertyArr.length;
        int i11 = 0;
        while (true) {
            JsonToken jsonTokenMo10905t0 = jsonParser.mo10905t0();
            JsonToken jsonToken = JsonToken.END_ARRAY;
            if (jsonTokenMo10905t0 == jsonToken) {
                break;
            }
            if (i11 == length) {
                if (!this._ignoreAllUnknown && deserializationContext.isEnabled(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES)) {
                    deserializationContext.reportWrongTokenException(this, jsonToken, "Unexpected JSON values; expected at most %d properties (in JSON Array)", Integer.valueOf(length));
                }
                do {
                    jsonParser.mo10856C0();
                } while (jsonParser.mo10905t0() != JsonToken.END_ARRAY);
            } else {
                SettableBeanProperty settableBeanProperty = settableBeanPropertyArr[i11];
                if (settableBeanProperty != null) {
                    try {
                        settableBeanProperty.deserializeAndSet(jsonParser, deserializationContext, objCreateUsingDefault);
                    } catch (Exception e11) {
                        wrapAndThrow(e11, objCreateUsingDefault, settableBeanProperty.getName(), deserializationContext);
                    }
                } else {
                    jsonParser.mo10856C0();
                }
                i11++;
            }
        }
        return objCreateUsingDefault;
    }

    public Object _deserializeNonVanilla(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        if (this._nonStandardCreation) {
            return deserializeFromObjectUsingNonDefault(jsonParser, deserializationContext);
        }
        Object objCreateUsingDefault = this._valueInstantiator.createUsingDefault(deserializationContext);
        jsonParser.mo10916z0(objCreateUsingDefault);
        if (this._injectables != null) {
            injectValues(deserializationContext, objCreateUsingDefault);
        }
        Class<?> activeView = this._needViewProcesing ? deserializationContext.getActiveView() : null;
        SettableBeanProperty[] settableBeanPropertyArr = this._orderedProperties;
        int length = settableBeanPropertyArr.length;
        int i11 = 0;
        while (true) {
            JsonToken jsonTokenMo10905t0 = jsonParser.mo10905t0();
            JsonToken jsonToken = JsonToken.END_ARRAY;
            if (jsonTokenMo10905t0 == jsonToken) {
                break;
            }
            if (i11 == length) {
                if (!this._ignoreAllUnknown) {
                    deserializationContext.reportWrongTokenException(this, jsonToken, "Unexpected JSON values; expected at most %d properties (in JSON Array)", Integer.valueOf(length));
                }
                do {
                    jsonParser.mo10856C0();
                } while (jsonParser.mo10905t0() != JsonToken.END_ARRAY);
            } else {
                SettableBeanProperty settableBeanProperty = settableBeanPropertyArr[i11];
                i11++;
                if (settableBeanProperty == null || !(activeView == null || settableBeanProperty.visibleInView(activeView))) {
                    jsonParser.mo10856C0();
                } else {
                    try {
                        settableBeanProperty.deserializeAndSet(jsonParser, deserializationContext, objCreateUsingDefault);
                    } catch (Exception e11) {
                        wrapAndThrow(e11, objCreateUsingDefault, settableBeanProperty.getName(), deserializationContext);
                    }
                }
            }
        }
        return objCreateUsingDefault;
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase
    public final Object _deserializeUsingPropertyBased(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        PropertyBasedCreator propertyBasedCreator = this._propertyBasedCreator;
        C6372g c6372gM11302g = propertyBasedCreator.m11302g(jsonParser, deserializationContext, this._objectIdReader);
        SettableBeanProperty[] settableBeanPropertyArr = this._orderedProperties;
        int length = settableBeanPropertyArr.length;
        Class<?> activeView = this._needViewProcesing ? deserializationContext.getActiveView() : null;
        int i11 = 0;
        Object objM11298a = null;
        while (jsonParser.mo10905t0() != JsonToken.END_ARRAY) {
            SettableBeanProperty settableBeanProperty = i11 < length ? settableBeanPropertyArr[i11] : null;
            if (settableBeanProperty == null) {
                jsonParser.mo10856C0();
            } else if (activeView != null && !settableBeanProperty.visibleInView(activeView)) {
                jsonParser.mo10856C0();
            } else if (objM11298a != null) {
                try {
                    settableBeanProperty.deserializeAndSet(jsonParser, deserializationContext, objM11298a);
                } catch (Exception e11) {
                    wrapAndThrow(e11, objM11298a, settableBeanProperty.getName(), deserializationContext);
                }
            } else {
                String name = settableBeanProperty.getName();
                SettableBeanProperty settableBeanPropertyM11300e = propertyBasedCreator.m11300e(name);
                if (!c6372gM11302g.m11372i(name) || settableBeanPropertyM11300e != null) {
                    if (settableBeanPropertyM11300e == null) {
                        c6372gM11302g.m11368e(settableBeanProperty, settableBeanProperty.deserialize(jsonParser, deserializationContext));
                    } else if (c6372gM11302g.m11365b(settableBeanPropertyM11300e, settableBeanPropertyM11300e.deserialize(jsonParser, deserializationContext))) {
                        try {
                            objM11298a = propertyBasedCreator.m11298a(deserializationContext, c6372gM11302g);
                            jsonParser.mo10916z0(objM11298a);
                            if (objM11298a.getClass() != this._beanType.getRawClass()) {
                                JavaType javaType = this._beanType;
                                deserializationContext.reportBadDefinition(javaType, String.format("Cannot support implicit polymorphic deserialization for POJOs-as-Arrays style: nominal type %s, actual type %s", C6490g.m11904G(javaType), C6490g.m11963y(objM11298a)));
                            }
                        } catch (Exception e12) {
                            wrapAndThrow(e12, this._beanType.getRawClass(), name, deserializationContext);
                        }
                    }
                }
            }
            i11++;
        }
        if (objM11298a != null) {
            return objM11298a;
        }
        try {
            return propertyBasedCreator.m11298a(deserializationContext, c6372gM11302g);
        } catch (Exception e13) {
            return wrapInstantiationProblem(e13, deserializationContext);
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase, com.fasterxml.jackson.databind.AbstractC6390e
    public AbstractC6390e<Object> unwrappingDeserializer(NameTransformer nameTransformer) {
        return this._delegate.unwrappingDeserializer(nameTransformer);
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase
    public BeanDeserializerBase withBeanProperties(BeanPropertyMap beanPropertyMap) {
        return new BeanAsArrayDeserializer(this._delegate.withBeanProperties(beanPropertyMap), this._orderedProperties);
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase
    public BeanDeserializerBase withByNameInclusion(Set<String> set, Set<String> set2) {
        return new BeanAsArrayDeserializer(this._delegate.withByNameInclusion(set, set2), this._orderedProperties);
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase
    public BeanDeserializerBase withIgnoreAllUnknown(boolean z11) {
        return new BeanAsArrayDeserializer(this._delegate.withIgnoreAllUnknown(z11), this._orderedProperties);
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase
    public BeanDeserializerBase withObjectIdReader(ObjectIdReader objectIdReader) {
        return new BeanAsArrayDeserializer(this._delegate.withObjectIdReader(objectIdReader), this._orderedProperties);
    }

    public BeanAsArrayDeserializer(BeanDeserializerBase beanDeserializerBase, SettableBeanProperty[] settableBeanPropertyArr) {
        super(beanDeserializerBase);
        this._delegate = beanDeserializerBase;
        this._orderedProperties = settableBeanPropertyArr;
    }

    public Object _deserializeFromNonArray(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        return deserializationContext.handleUnexpectedToken(getValueType(deserializationContext), jsonParser.mo10889k(), jsonParser, "Cannot deserialize a POJO (of type %s) from non-Array representation (token: %s): type/property designed to be serialized as JSON Array", C6490g.m11904G(this._beanType), jsonParser.mo10889k());
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase
    public Object deserializeFromObject(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        return _deserializeFromNonArray(jsonParser, deserializationContext);
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase
    public BeanDeserializerBase asArrayDeserializer() {
        return this;
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6390e
    public Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
        jsonParser.mo10916z0(obj);
        if (!jsonParser.mo10898o0()) {
            return _deserializeFromNonArray(jsonParser, deserializationContext);
        }
        if (this._injectables != null) {
            injectValues(deserializationContext, obj);
        }
        SettableBeanProperty[] settableBeanPropertyArr = this._orderedProperties;
        int length = settableBeanPropertyArr.length;
        int i11 = 0;
        while (true) {
            JsonToken jsonTokenMo10905t0 = jsonParser.mo10905t0();
            JsonToken jsonToken = JsonToken.END_ARRAY;
            if (jsonTokenMo10905t0 == jsonToken) {
                break;
            }
            if (i11 == length) {
                if (!this._ignoreAllUnknown && deserializationContext.isEnabled(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES)) {
                    deserializationContext.reportWrongTokenException(this, jsonToken, "Unexpected JSON values; expected at most %d properties (in JSON Array)", Integer.valueOf(length));
                }
                do {
                    jsonParser.mo10856C0();
                } while (jsonParser.mo10905t0() != JsonToken.END_ARRAY);
            } else {
                SettableBeanProperty settableBeanProperty = settableBeanPropertyArr[i11];
                if (settableBeanProperty != null) {
                    try {
                        settableBeanProperty.deserializeAndSet(jsonParser, deserializationContext, obj);
                    } catch (Exception e11) {
                        wrapAndThrow(e11, obj, settableBeanProperty.getName(), deserializationContext);
                    }
                } else {
                    jsonParser.mo10856C0();
                }
                i11++;
            }
        }
        return obj;
    }
}
