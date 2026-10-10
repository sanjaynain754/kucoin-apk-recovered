package com.fasterxml.jackson.databind.jsontype.impl;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.util.C6329h;
import com.fasterxml.jackson.databind.AbstractC6390e;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.jsontype.AbstractC6428b;
import com.fasterxml.jackson.databind.jsontype.InterfaceC6429c;
import com.fasterxml.jackson.databind.util.C6499p;
import java.io.IOException;

/* JADX INFO: loaded from: classes45.dex */
public class AsPropertyTypeDeserializer extends AsArrayTypeDeserializer {
    private static final long serialVersionUID = 1;
    protected final JsonTypeInfo.EnumC6265As _inclusion;
    protected final String _msgForMissingId;

    public AsPropertyTypeDeserializer(JavaType javaType, InterfaceC6429c interfaceC6429c, String str, boolean z11, JavaType javaType2) {
        this(javaType, interfaceC6429c, str, z11, javaType2, JsonTypeInfo.EnumC6265As.PROPERTY);
    }

    @Deprecated
    public Object _deserializeTypedUsingDefaultImpl(JsonParser jsonParser, DeserializationContext deserializationContext, C6499p c6499p) throws IOException {
        return _deserializeTypedUsingDefaultImpl(jsonParser, deserializationContext, c6499p, null);
    }

    public AsPropertyTypeDeserializer(JavaType javaType, InterfaceC6429c interfaceC6429c, String str, boolean z11, JavaType javaType2, JsonTypeInfo.EnumC6265As enumC6265As) {
        super(javaType, interfaceC6429c, str, z11, javaType2);
        BeanProperty beanProperty = this._property;
        this._msgForMissingId = beanProperty == null ? String.format("missing type id property '%s'", this._typePropertyName) : String.format("missing type id property '%s' (for POJO property '%s')", this._typePropertyName, beanProperty.getName());
        this._inclusion = enumC6265As;
    }

    public Object _deserializeTypedUsingDefaultImpl(JsonParser jsonParser, DeserializationContext deserializationContext, C6499p c6499p, String str) throws IOException {
        if (!hasDefaultImpl()) {
            Object objDeserializeIfNatural = AbstractC6428b.deserializeIfNatural(jsonParser, deserializationContext, this._baseType);
            if (objDeserializeIfNatural != null) {
                return objDeserializeIfNatural;
            }
            if (jsonParser.mo10898o0()) {
                return super.deserializeTypedFromAny(jsonParser, deserializationContext);
            }
            if (jsonParser.mo10890k0(JsonToken.VALUE_STRING) && deserializationContext.isEnabled(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT) && jsonParser.mo10869W().trim().isEmpty()) {
                return null;
            }
        }
        AbstractC6390e<Object> abstractC6390e_findDefaultImplDeserializer = _findDefaultImplDeserializer(deserializationContext);
        if (abstractC6390e_findDefaultImplDeserializer == null) {
            JavaType javaType_handleMissingTypeId = _handleMissingTypeId(deserializationContext, str);
            if (javaType_handleMissingTypeId == null) {
                return null;
            }
            abstractC6390e_findDefaultImplDeserializer = deserializationContext.findContextualValueDeserializer(javaType_handleMissingTypeId, this._property);
        }
        if (c6499p != null) {
            c6499p.mo10806X();
            jsonParser = c6499p.m12014U0(jsonParser);
            jsonParser.mo10905t0();
        }
        return abstractC6390e_findDefaultImplDeserializer.deserialize(jsonParser, deserializationContext);
    }

    @Override // com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer, com.fasterxml.jackson.databind.jsontype.AbstractC6428b
    public Object deserializeTypedFromAny(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        return jsonParser.mo10890k0(JsonToken.START_ARRAY) ? super.deserializeTypedFromArray(jsonParser, deserializationContext) : deserializeTypedFromObject(jsonParser, deserializationContext);
    }

    @Override // com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer, com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase, com.fasterxml.jackson.databind.jsontype.AbstractC6428b
    public AbstractC6428b forProperty(BeanProperty beanProperty) {
        return beanProperty == this._property ? this : new AsPropertyTypeDeserializer(this, beanProperty);
    }

    @Override // com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer, com.fasterxml.jackson.databind.jsontype.impl.TypeDeserializerBase, com.fasterxml.jackson.databind.jsontype.AbstractC6428b
    public JsonTypeInfo.EnumC6265As getTypeInclusion() {
        return this._inclusion;
    }

    public Object _deserializeTypedForId(JsonParser jsonParser, DeserializationContext deserializationContext, C6499p c6499p, String str) throws IOException {
        AbstractC6390e<Object> abstractC6390e_findDeserializer = _findDeserializer(deserializationContext, str);
        if (this._typeIdVisible) {
            if (c6499p == null) {
                c6499p = deserializationContext.bufferForInputBuffering(jsonParser);
            }
            c6499p.mo10810a0(jsonParser.mo10887j());
            c6499p.mo10787C0(str);
        }
        if (c6499p != null) {
            jsonParser.mo10885i();
            jsonParser = C6329h.m11083E0(false, c6499p.m12014U0(jsonParser), jsonParser);
        }
        if (jsonParser.mo10889k() != JsonToken.END_OBJECT) {
            jsonParser.mo10905t0();
        }
        return abstractC6390e_findDeserializer.deserialize(jsonParser, deserializationContext);
    }

    @Override // com.fasterxml.jackson.databind.jsontype.impl.AsArrayTypeDeserializer, com.fasterxml.jackson.databind.jsontype.AbstractC6428b
    public Object deserializeTypedFromObject(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        String strMo10882g0;
        Object objMo10876b0;
        if (jsonParser.mo10883h() && (objMo10876b0 = jsonParser.mo10876b0()) != null) {
            return _deserializeWithNativeTypeId(jsonParser, deserializationContext, objMo10876b0);
        }
        JsonToken jsonTokenMo10889k = jsonParser.mo10889k();
        C6499p c6499pBufferForInputBuffering = null;
        if (jsonTokenMo10889k == JsonToken.START_OBJECT) {
            jsonTokenMo10889k = jsonParser.mo10905t0();
        } else if (jsonTokenMo10889k != JsonToken.FIELD_NAME) {
            return _deserializeTypedUsingDefaultImpl(jsonParser, deserializationContext, null, this._msgForMissingId);
        }
        boolean zIsEnabled = deserializationContext.isEnabled(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES);
        while (jsonTokenMo10889k == JsonToken.FIELD_NAME) {
            String strMo10887j = jsonParser.mo10887j();
            jsonParser.mo10905t0();
            if ((strMo10887j.equals(this._typePropertyName) || (zIsEnabled && strMo10887j.equalsIgnoreCase(this._typePropertyName))) && (strMo10882g0 = jsonParser.mo10882g0()) != null) {
                return _deserializeTypedForId(jsonParser, deserializationContext, c6499pBufferForInputBuffering, strMo10882g0);
            }
            if (c6499pBufferForInputBuffering == null) {
                c6499pBufferForInputBuffering = deserializationContext.bufferForInputBuffering(jsonParser);
            }
            c6499pBufferForInputBuffering.mo10810a0(strMo10887j);
            c6499pBufferForInputBuffering.m12017X0(jsonParser);
            jsonTokenMo10889k = jsonParser.mo10905t0();
        }
        return _deserializeTypedUsingDefaultImpl(jsonParser, deserializationContext, c6499pBufferForInputBuffering, this._msgForMissingId);
    }

    public AsPropertyTypeDeserializer(AsPropertyTypeDeserializer asPropertyTypeDeserializer, BeanProperty beanProperty) {
        String str;
        super(asPropertyTypeDeserializer, beanProperty);
        BeanProperty beanProperty2 = this._property;
        if (beanProperty2 == null) {
            str = String.format("missing type id property '%s'", this._typePropertyName);
        } else {
            str = String.format("missing type id property '%s' (for POJO property '%s')", this._typePropertyName, beanProperty2.getName());
        }
        this._msgForMissingId = str;
        this._inclusion = asPropertyTypeDeserializer._inclusion;
    }
}
