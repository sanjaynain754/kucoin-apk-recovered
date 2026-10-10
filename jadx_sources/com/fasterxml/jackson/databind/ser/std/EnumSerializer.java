package com.fasterxml.jackson.databind.ser.std;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.InterfaceC6306i;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.AbstractC6340b;
import com.fasterxml.jackson.databind.AbstractC6391f;
import com.fasterxml.jackson.databind.AbstractC6393h;
import com.fasterxml.jackson.databind.AbstractC6446m;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.ser.InterfaceC6455d;
import com.fasterxml.jackson.databind.util.EnumValues;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Iterator;
import java.util.Objects;
import p450m7.InterfaceC42435a;
import p528p7.InterfaceC43399e;

/* JADX INFO: loaded from: classes45.dex */
@InterfaceC42435a
public class EnumSerializer extends StdScalarSerializer<Enum<?>> implements InterfaceC6455d {
    private static final long serialVersionUID = 1;
    protected final Boolean _serializeAsIndex;
    protected final EnumValues _values;

    public static Boolean _isShapeWrittenUsingIndex(Class<?> cls, JsonFormat.Value value, boolean z11, Boolean bool) {
        JsonFormat.Shape shape = value == null ? null : value.getShape();
        if (shape == null || shape == JsonFormat.Shape.ANY || shape == JsonFormat.Shape.SCALAR) {
            return bool;
        }
        if (shape == JsonFormat.Shape.STRING || shape == JsonFormat.Shape.NATURAL) {
            return Boolean.FALSE;
        }
        if (shape.isNumeric() || shape == JsonFormat.Shape.ARRAY) {
            return Boolean.TRUE;
        }
        throw new IllegalArgumentException(String.format("Unsupported serialization shape (%s) for Enum %s, not supported as %s annotation", shape, cls.getName(), z11 ? "class" : "property"));
    }

    public final boolean _serializeAsIndex(AbstractC6446m abstractC6446m) {
        Boolean bool = this._serializeAsIndex;
        return bool != null ? bool.booleanValue() : abstractC6446m.isEnabled(SerializationFeature.WRITE_ENUMS_USING_INDEX);
    }

    public EnumValues getEnumValues() {
        return this._values;
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.AbstractC6393h
    public final void serialize(Enum<?> r11, JsonGenerator jsonGenerator, AbstractC6446m abstractC6446m) throws IOException {
        if (_serializeAsIndex(abstractC6446m)) {
            jsonGenerator.mo10815e0(r11.ordinal());
        } else if (abstractC6446m.isEnabled(SerializationFeature.WRITE_ENUMS_USING_TO_STRING)) {
            jsonGenerator.mo10787C0(r11.toString());
        } else {
            jsonGenerator.mo10785B0(this._values.serializedValueFor(r11));
        }
    }

    public EnumSerializer(EnumValues enumValues, Boolean bool) {
        super(enumValues.getEnumClass(), false);
        this._values = enumValues;
        this._serializeAsIndex = bool;
    }

    public static EnumSerializer construct(Class<?> cls, SerializationConfig serializationConfig, AbstractC6340b abstractC6340b, JsonFormat.Value value) {
        return new EnumSerializer(EnumValues.constructFromName(serializationConfig, cls), _isShapeWrittenUsingIndex(cls, value, true, null));
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdScalarSerializer, com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.AbstractC6393h
    public void acceptJsonFormatVisitor(InterfaceC43399e interfaceC43399e, JavaType javaType) throws JsonMappingException {
        if (_serializeAsIndex(interfaceC43399e.mo95575a())) {
            visitIntFormat(interfaceC43399e, javaType, JsonParser.NumberType.INT);
        } else {
            interfaceC43399e.mo95579f(javaType);
        }
    }

    @Override // com.fasterxml.jackson.databind.ser.InterfaceC6455d
    public AbstractC6393h<?> createContextual(AbstractC6446m abstractC6446m, BeanProperty beanProperty) throws JsonMappingException {
        JsonFormat.Value valueFindFormatOverrides = findFormatOverrides(abstractC6446m, beanProperty, handledType());
        if (valueFindFormatOverrides != null) {
            Boolean bool_isShapeWrittenUsingIndex = _isShapeWrittenUsingIndex(handledType(), valueFindFormatOverrides, false, this._serializeAsIndex);
            if (!Objects.equals(bool_isShapeWrittenUsingIndex, this._serializeAsIndex)) {
                return new EnumSerializer(this._values, bool_isShapeWrittenUsingIndex);
            }
        }
        return this;
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdScalarSerializer, com.fasterxml.jackson.databind.ser.std.StdSerializer, p551q7.InterfaceC43653c
    public AbstractC6391f getSchema(AbstractC6446m abstractC6446m, Type type) {
        if (_serializeAsIndex(abstractC6446m)) {
            return createSchemaNode(TypedValues.Custom.S_INT, true);
        }
        ObjectNode objectNodeCreateSchemaNode = createSchemaNode(TypedValues.Custom.S_STRING, true);
        if (type != null && abstractC6446m.constructType(type).isEnumType()) {
            ArrayNode arrayNodePutArray = objectNodeCreateSchemaNode.putArray("enum");
            Iterator<InterfaceC6306i> it = this._values.values().iterator();
            while (it.hasNext()) {
                arrayNodePutArray.add(it.next().getValue());
            }
        }
        return objectNodeCreateSchemaNode;
    }
}
