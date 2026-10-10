package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.AbstractC6390e;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.BeanDeserializer;
import com.fasterxml.jackson.databind.deser.SettableAnyProperty;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.util.NameTransformer;
import java.io.IOException;
import java.util.Set;

/* JADX INFO: loaded from: classes45.dex */
public class ThrowableDeserializer extends BeanDeserializer {
    protected static final String PROP_NAME_MESSAGE = "message";
    protected static final String PROP_NAME_SUPPRESSED = "suppressed";
    private static final long serialVersionUID = 1;

    public ThrowableDeserializer(BeanDeserializer beanDeserializer) {
        super(beanDeserializer);
        this._vanillaProcessing = false;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:44:0x00d2  */
    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializer, com.fasterxml.jackson.databind.deser.BeanDeserializerBase
    public Object deserializeFromObject(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        Set<String> set;
        SettableAnyProperty settableAnyProperty;
        if (this._propertyBasedCreator != null) {
            return _deserializeUsingPropertyBased(jsonParser, deserializationContext);
        }
        AbstractC6390e<Object> abstractC6390e = this._delegateDeserializer;
        if (abstractC6390e != null) {
            return this._valueInstantiator.createUsingDelegate(deserializationContext, abstractC6390e.deserialize(jsonParser, deserializationContext));
        }
        if (this._beanType.isAbstract()) {
            return deserializationContext.handleMissingInstantiator(handledType(), getValueInstantiator(), jsonParser, "abstract type (need to add/enable type information?)", new Object[0]);
        }
        boolean zCanCreateFromString = this._valueInstantiator.canCreateFromString();
        boolean zCanCreateUsingDefault = this._valueInstantiator.canCreateUsingDefault();
        if (!zCanCreateFromString && !zCanCreateUsingDefault) {
            return deserializationContext.handleMissingInstantiator(handledType(), getValueInstantiator(), jsonParser, "Throwable needs a default constructor, a single-String-arg constructor; or explicit @JsonCreator", new Object[0]);
        }
        int i11 = 0;
        Throwable th2 = null;
        Object[] objArr = null;
        Throwable[] thArr = null;
        while (!jsonParser.mo10890k0(JsonToken.END_OBJECT)) {
            String strMo10887j = jsonParser.mo10887j();
            SettableBeanProperty settableBeanPropertyFind = this._beanProperties.find(strMo10887j);
            jsonParser.mo10905t0();
            if (settableBeanPropertyFind != null) {
                if (th2 != null) {
                    settableBeanPropertyFind.deserializeAndSet(jsonParser, deserializationContext, th2);
                } else {
                    if (objArr == null) {
                        int size = this._beanProperties.size();
                        objArr = new Object[size + size];
                    }
                    int i12 = i11 + 1;
                    objArr[i11] = settableBeanPropertyFind;
                    i11 += 2;
                    objArr[i12] = settableBeanPropertyFind.deserialize(jsonParser, deserializationContext);
                }
            } else if ("message".equals(strMo10887j)) {
                if (zCanCreateFromString) {
                    th2 = (Throwable) this._valueInstantiator.createFromString(deserializationContext, jsonParser.mo10882g0());
                } else {
                    set = this._ignorableProps;
                    if (set == null && set.contains(strMo10887j)) {
                        jsonParser.mo10856C0();
                    } else {
                        settableAnyProperty = this._anySetter;
                        if (settableAnyProperty != null) {
                            settableAnyProperty.deserializeAndSet(jsonParser, deserializationContext, th2, strMo10887j);
                        } else {
                            handleUnknownProperty(jsonParser, deserializationContext, th2, strMo10887j);
                        }
                    }
                }
            } else if (PROP_NAME_SUPPRESSED.equals(strMo10887j)) {
                thArr = (Throwable[]) deserializationContext.readValue(jsonParser, Throwable[].class);
            } else {
                set = this._ignorableProps;
                if (set == null) {
                    settableAnyProperty = this._anySetter;
                    if (settableAnyProperty != null) {
                        settableAnyProperty.deserializeAndSet(jsonParser, deserializationContext, th2, strMo10887j);
                    } else {
                        handleUnknownProperty(jsonParser, deserializationContext, th2, strMo10887j);
                    }
                } else {
                    settableAnyProperty = this._anySetter;
                    if (settableAnyProperty != null) {
                        settableAnyProperty.deserializeAndSet(jsonParser, deserializationContext, th2, strMo10887j);
                    } else {
                        handleUnknownProperty(jsonParser, deserializationContext, th2, strMo10887j);
                    }
                }
            }
            jsonParser.mo10905t0();
        }
        if (th2 == null) {
            th2 = zCanCreateFromString ? (Throwable) this._valueInstantiator.createFromString(deserializationContext, null) : (Throwable) this._valueInstantiator.createUsingDefault(deserializationContext);
        }
        if (objArr != null) {
            for (int i13 = 0; i13 < i11; i13 += 2) {
                ((SettableBeanProperty) objArr[i13]).set(th2, objArr[i13 + 1]);
            }
        }
        if (thArr != null) {
            for (Throwable th3 : thArr) {
                th2.addSuppressed(th3);
            }
        }
        return th2;
    }

    public ThrowableDeserializer(BeanDeserializer beanDeserializer, NameTransformer nameTransformer) {
        super(beanDeserializer, nameTransformer);
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializer, com.fasterxml.jackson.databind.deser.BeanDeserializerBase, com.fasterxml.jackson.databind.AbstractC6390e
    public AbstractC6390e<Object> unwrappingDeserializer(NameTransformer nameTransformer) {
        if (getClass() != ThrowableDeserializer.class) {
            return this;
        }
        return new ThrowableDeserializer(this, nameTransformer);
    }
}
