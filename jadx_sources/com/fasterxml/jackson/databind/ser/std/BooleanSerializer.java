package com.fasterxml.jackson.databind.ser.std;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.AbstractC6391f;
import com.fasterxml.jackson.databind.AbstractC6393h;
import com.fasterxml.jackson.databind.AbstractC6446m;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.jsontype.AbstractC6431e;
import com.fasterxml.jackson.databind.ser.InterfaceC6455d;
import java.io.IOException;
import java.lang.reflect.Type;
import p450m7.InterfaceC42435a;
import p528p7.InterfaceC43399e;

/* JADX INFO: loaded from: classes45.dex */
@InterfaceC42435a
public final class BooleanSerializer extends StdScalarSerializer<Object> implements InterfaceC6455d {
    private static final long serialVersionUID = 1;
    protected final boolean _forPrimitive;

    public static final class AsNumber extends StdScalarSerializer<Object> implements InterfaceC6455d {
        private static final long serialVersionUID = 1;
        protected final boolean _forPrimitive;

        public AsNumber(boolean z11) {
            super(z11 ? Boolean.TYPE : Boolean.class, false);
            this._forPrimitive = z11;
        }

        @Override // com.fasterxml.jackson.databind.ser.std.StdScalarSerializer, com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.AbstractC6393h
        public void acceptJsonFormatVisitor(InterfaceC43399e interfaceC43399e, JavaType javaType) throws JsonMappingException {
            visitIntFormat(interfaceC43399e, javaType, JsonParser.NumberType.INT);
        }

        @Override // com.fasterxml.jackson.databind.ser.InterfaceC6455d
        public AbstractC6393h<?> createContextual(AbstractC6446m abstractC6446m, BeanProperty beanProperty) throws JsonMappingException {
            JsonFormat.Value valueFindFormatOverrides = findFormatOverrides(abstractC6446m, beanProperty, Boolean.class);
            return (valueFindFormatOverrides == null || valueFindFormatOverrides.getShape().isNumeric()) ? this : new BooleanSerializer(this._forPrimitive);
        }

        @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.AbstractC6393h
        public void serialize(Object obj, JsonGenerator jsonGenerator, AbstractC6446m abstractC6446m) throws IOException {
            jsonGenerator.mo10815e0(!Boolean.FALSE.equals(obj) ? 1 : 0);
        }

        @Override // com.fasterxml.jackson.databind.ser.std.StdScalarSerializer, com.fasterxml.jackson.databind.AbstractC6393h
        public final void serializeWithType(Object obj, JsonGenerator jsonGenerator, AbstractC6446m abstractC6446m, AbstractC6431e abstractC6431e) throws IOException {
            jsonGenerator.mo10803U(Boolean.TRUE.equals(obj));
        }
    }

    public BooleanSerializer(boolean z11) {
        super(z11 ? Boolean.TYPE : Boolean.class, false);
        this._forPrimitive = z11;
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdScalarSerializer, com.fasterxml.jackson.databind.ser.std.StdSerializer, p551q7.InterfaceC43653c
    public AbstractC6391f getSchema(AbstractC6446m abstractC6446m, Type type) {
        return createSchemaNode(TypedValues.Custom.S_BOOLEAN, !this._forPrimitive);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.AbstractC6393h
    public void serialize(Object obj, JsonGenerator jsonGenerator, AbstractC6446m abstractC6446m) throws IOException {
        jsonGenerator.mo10803U(Boolean.TRUE.equals(obj));
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdScalarSerializer, com.fasterxml.jackson.databind.AbstractC6393h
    public final void serializeWithType(Object obj, JsonGenerator jsonGenerator, AbstractC6446m abstractC6446m, AbstractC6431e abstractC6431e) throws IOException {
        jsonGenerator.mo10803U(Boolean.TRUE.equals(obj));
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdScalarSerializer, com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.AbstractC6393h
    public void acceptJsonFormatVisitor(InterfaceC43399e interfaceC43399e, JavaType javaType) throws JsonMappingException {
        interfaceC43399e.mo95584n(javaType);
    }

    @Override // com.fasterxml.jackson.databind.ser.InterfaceC6455d
    public AbstractC6393h<?> createContextual(AbstractC6446m abstractC6446m, BeanProperty beanProperty) throws JsonMappingException {
        JsonFormat.Value valueFindFormatOverrides = findFormatOverrides(abstractC6446m, beanProperty, handledType());
        if (valueFindFormatOverrides != null) {
            JsonFormat.Shape shape = valueFindFormatOverrides.getShape();
            if (shape.isNumeric()) {
                return new AsNumber(this._forPrimitive);
            }
            if (shape == JsonFormat.Shape.STRING) {
                return new ToStringSerializer(this._handledType);
            }
        }
        return this;
    }
}
