package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.AbstractC6393h;
import com.fasterxml.jackson.databind.AbstractC6446m;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.jsontype.AbstractC6431e;
import com.fasterxml.jackson.databind.ser.InterfaceC6455d;
import java.io.IOException;
import java.net.InetAddress;

/* JADX INFO: loaded from: classes45.dex */
public class InetAddressSerializer extends StdScalarSerializer<InetAddress> implements InterfaceC6455d {
    protected final boolean _asNumeric;

    public InetAddressSerializer() {
        this(false);
    }

    public InetAddressSerializer(boolean z11) {
        super(InetAddress.class);
        this._asNumeric = z11;
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.AbstractC6393h
    public void serialize(InetAddress inetAddress, JsonGenerator jsonGenerator, AbstractC6446m abstractC6446m) throws IOException {
        String strTrim;
        if (this._asNumeric) {
            strTrim = inetAddress.getHostAddress();
        } else {
            strTrim = inetAddress.toString().trim();
            int iIndexOf = strTrim.indexOf(47);
            if (iIndexOf >= 0) {
                strTrim = iIndexOf == 0 ? strTrim.substring(1) : strTrim.substring(0, iIndexOf);
            }
        }
        jsonGenerator.mo10787C0(strTrim);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdScalarSerializer, com.fasterxml.jackson.databind.AbstractC6393h
    public void serializeWithType(InetAddress inetAddress, JsonGenerator jsonGenerator, AbstractC6446m abstractC6446m, AbstractC6431e abstractC6431e) throws IOException {
        WritableTypeId writableTypeIdMo11695g = abstractC6431e.mo11695g(jsonGenerator, abstractC6431e.m11694f(inetAddress, InetAddress.class, JsonToken.VALUE_STRING));
        serialize(inetAddress, jsonGenerator, abstractC6446m);
        abstractC6431e.mo11696h(jsonGenerator, writableTypeIdMo11695g);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001a  */
    @Override // com.fasterxml.jackson.databind.ser.InterfaceC6455d
    public AbstractC6393h<?> createContextual(AbstractC6446m abstractC6446m, BeanProperty beanProperty) throws JsonMappingException {
        boolean z11;
        JsonFormat.Value valueFindFormatOverrides = findFormatOverrides(abstractC6446m, beanProperty, handledType());
        if (valueFindFormatOverrides != null) {
            JsonFormat.Shape shape = valueFindFormatOverrides.getShape();
            if (shape.isNumeric() || shape == JsonFormat.Shape.ARRAY) {
                z11 = true;
            } else {
                z11 = false;
            }
        } else {
            z11 = false;
        }
        if (z11 != this._asNumeric) {
            return new InetAddressSerializer(z11);
        }
        return this;
    }
}
