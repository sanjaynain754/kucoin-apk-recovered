package com.fasterxml.jackson.databind.ser.std;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.p062io.C6314h;
import com.fasterxml.jackson.core.type.WritableTypeId;
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
import java.math.BigDecimal;
import java.util.Map;
import p450m7.InterfaceC42435a;
import p528p7.InterfaceC43399e;

/* JADX INFO: loaded from: classes45.dex */
public class NumberSerializers {

    public static abstract class Base<T> extends StdScalarSerializer<T> implements InterfaceC6455d {
        protected final boolean _isInt;
        protected final JsonParser.NumberType _numberType;
        protected final String _schemaType;

        public Base(Class<?> cls, JsonParser.NumberType numberType, String str) {
            super(cls, false);
            this._numberType = numberType;
            this._schemaType = str;
            this._isInt = numberType == JsonParser.NumberType.INT || numberType == JsonParser.NumberType.LONG || numberType == JsonParser.NumberType.BIG_INTEGER;
        }

        @Override // com.fasterxml.jackson.databind.ser.std.StdScalarSerializer, com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.AbstractC6393h
        public void acceptJsonFormatVisitor(InterfaceC43399e interfaceC43399e, JavaType javaType) throws JsonMappingException {
            if (this._isInt) {
                visitIntFormat(interfaceC43399e, javaType, this._numberType);
            } else {
                visitFloatFormat(interfaceC43399e, javaType, this._numberType);
            }
        }

        @Override // com.fasterxml.jackson.databind.ser.std.StdScalarSerializer, com.fasterxml.jackson.databind.ser.std.StdSerializer, p551q7.InterfaceC43653c
        public AbstractC6391f getSchema(AbstractC6446m abstractC6446m, Type type) {
            return createSchemaNode(this._schemaType, true);
        }

        @Override // com.fasterxml.jackson.databind.ser.InterfaceC6455d
        public AbstractC6393h<?> createContextual(AbstractC6446m abstractC6446m, BeanProperty beanProperty) throws JsonMappingException {
            JsonFormat.Value valueFindFormatOverrides = findFormatOverrides(abstractC6446m, beanProperty, handledType());
            if (valueFindFormatOverrides != null && C6474a.f10656a[valueFindFormatOverrides.getShape().ordinal()] == 1) {
                if (handledType() == BigDecimal.class) {
                    return NumberSerializer.bigDecimalAsStringSerializer();
                }
                return ToStringSerializer.instance;
            }
            return this;
        }
    }

    @InterfaceC42435a
    public static class DoubleSerializer extends Base<Object> {
        @Override // com.fasterxml.jackson.databind.ser.std.StdScalarSerializer, com.fasterxml.jackson.databind.AbstractC6393h
        public void serializeWithType(Object obj, JsonGenerator jsonGenerator, AbstractC6446m abstractC6446m, AbstractC6431e abstractC6431e) throws IOException {
            Double d11 = (Double) obj;
            if (!C6314h.m11036o(d11.doubleValue())) {
                jsonGenerator.mo10813c0(d11.doubleValue());
                return;
            }
            WritableTypeId writableTypeIdMo11695g = abstractC6431e.mo11695g(jsonGenerator, abstractC6431e.m11692d(obj, JsonToken.VALUE_NUMBER_FLOAT));
            jsonGenerator.mo10813c0(d11.doubleValue());
            abstractC6431e.mo11696h(jsonGenerator, writableTypeIdMo11695g);
        }

        public DoubleSerializer(Class<?> cls) {
            super(cls, JsonParser.NumberType.DOUBLE, "number");
        }

        @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.AbstractC6393h
        public void serialize(Object obj, JsonGenerator jsonGenerator, AbstractC6446m abstractC6446m) throws IOException {
            jsonGenerator.mo10813c0(((Double) obj).doubleValue());
        }

        @Deprecated
        public static boolean notFinite(double d11) {
            return C6314h.m11036o(d11);
        }
    }

    @InterfaceC42435a
    public static class FloatSerializer extends Base<Object> {
        static final FloatSerializer instance = new FloatSerializer();

        public FloatSerializer() {
            super(Float.class, JsonParser.NumberType.FLOAT, "number");
        }

        @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.AbstractC6393h
        public void serialize(Object obj, JsonGenerator jsonGenerator, AbstractC6446m abstractC6446m) throws IOException {
            jsonGenerator.mo10814d0(((Float) obj).floatValue());
        }
    }

    @InterfaceC42435a
    public static class IntLikeSerializer extends Base<Object> {
        static final IntLikeSerializer instance = new IntLikeSerializer();

        public IntLikeSerializer() {
            super(Number.class, JsonParser.NumberType.INT, TypedValues.Custom.S_INT);
        }

        @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.AbstractC6393h
        public void serialize(Object obj, JsonGenerator jsonGenerator, AbstractC6446m abstractC6446m) throws IOException {
            jsonGenerator.mo10815e0(((Number) obj).intValue());
        }
    }

    @InterfaceC42435a
    public static class IntegerSerializer extends Base<Object> {
        public IntegerSerializer(Class<?> cls) {
            super(cls, JsonParser.NumberType.INT, TypedValues.Custom.S_INT);
        }

        @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.AbstractC6393h
        public void serialize(Object obj, JsonGenerator jsonGenerator, AbstractC6446m abstractC6446m) throws IOException {
            jsonGenerator.mo10815e0(((Integer) obj).intValue());
        }

        @Override // com.fasterxml.jackson.databind.ser.std.StdScalarSerializer, com.fasterxml.jackson.databind.AbstractC6393h
        public void serializeWithType(Object obj, JsonGenerator jsonGenerator, AbstractC6446m abstractC6446m, AbstractC6431e abstractC6431e) throws IOException {
            serialize(obj, jsonGenerator, abstractC6446m);
        }
    }

    @InterfaceC42435a
    public static class LongSerializer extends Base<Object> {
        public LongSerializer(Class<?> cls) {
            super(cls, JsonParser.NumberType.LONG, "number");
        }

        @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.AbstractC6393h
        public void serialize(Object obj, JsonGenerator jsonGenerator, AbstractC6446m abstractC6446m) throws IOException {
            jsonGenerator.mo10816f0(((Long) obj).longValue());
        }
    }

    @InterfaceC42435a
    public static class ShortSerializer extends Base<Object> {
        static final ShortSerializer instance = new ShortSerializer();

        public ShortSerializer() {
            super(Short.class, JsonParser.NumberType.INT, "number");
        }

        @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.AbstractC6393h
        public void serialize(Object obj, JsonGenerator jsonGenerator, AbstractC6446m abstractC6446m) throws IOException {
            jsonGenerator.mo10824j0(((Short) obj).shortValue());
        }
    }

    /* JADX INFO: renamed from: com.fasterxml.jackson.databind.ser.std.NumberSerializers$a */
    public static /* synthetic */ class C6474a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f10656a;

        static {
            int[] iArr = new int[JsonFormat.Shape.values().length];
            f10656a = iArr;
            try {
                iArr[JsonFormat.Shape.STRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m11833a(Map<String, AbstractC6393h<?>> map) {
        map.put(Integer.class.getName(), new IntegerSerializer(Integer.class));
        Class cls = Integer.TYPE;
        map.put(cls.getName(), new IntegerSerializer(cls));
        map.put(Long.class.getName(), new LongSerializer(Long.class));
        Class cls2 = Long.TYPE;
        map.put(cls2.getName(), new LongSerializer(cls2));
        String name = Byte.class.getName();
        IntLikeSerializer intLikeSerializer = IntLikeSerializer.instance;
        map.put(name, intLikeSerializer);
        map.put(Byte.TYPE.getName(), intLikeSerializer);
        String name2 = Short.class.getName();
        ShortSerializer shortSerializer = ShortSerializer.instance;
        map.put(name2, shortSerializer);
        map.put(Short.TYPE.getName(), shortSerializer);
        map.put(Double.class.getName(), new DoubleSerializer(Double.class));
        Class cls3 = Double.TYPE;
        map.put(cls3.getName(), new DoubleSerializer(cls3));
        String name3 = Float.class.getName();
        FloatSerializer floatSerializer = FloatSerializer.instance;
        map.put(name3, floatSerializer);
        map.put(Float.TYPE.getName(), floatSerializer);
    }
}
