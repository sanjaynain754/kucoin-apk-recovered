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
import com.fasterxml.jackson.databind.ser.InterfaceC6455d;
import java.io.IOException;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import p450m7.InterfaceC42435a;
import p528p7.InterfaceC43399e;

/* JADX INFO: loaded from: classes45.dex */
@InterfaceC42435a
public class NumberSerializer extends StdScalarSerializer<Number> implements InterfaceC6455d {
    protected static final int MAX_BIG_DECIMAL_SCALE = 9999;
    public static final NumberSerializer instance = new NumberSerializer(Number.class);
    protected final boolean _isInt;

    public static final class BigDecimalAsStringSerializer extends ToStringSerializerBase {
        static final BigDecimalAsStringSerializer BD_INSTANCE = new BigDecimalAsStringSerializer();

        @Override // com.fasterxml.jackson.databind.ser.std.ToStringSerializerBase, com.fasterxml.jackson.databind.AbstractC6393h
        public boolean isEmpty(AbstractC6446m abstractC6446m, Object obj) {
            return false;
        }

        public BigDecimalAsStringSerializer() {
            super(BigDecimal.class);
        }

        @Override // com.fasterxml.jackson.databind.ser.std.ToStringSerializerBase, com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.AbstractC6393h
        public void serialize(Object obj, JsonGenerator jsonGenerator, AbstractC6446m abstractC6446m) throws IOException {
            String string;
            if (jsonGenerator.mo10837q(JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN)) {
                BigDecimal bigDecimal = (BigDecimal) obj;
                if (!_verifyBigDecimalRange(jsonGenerator, bigDecimal)) {
                    abstractC6446m.reportMappingProblem(String.format("Attempt to write plain `java.math.BigDecimal` (see JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN) with illegal scale (%d): needs to be between [-%d, %d]", Integer.valueOf(bigDecimal.scale()), Integer.valueOf(NumberSerializer.MAX_BIG_DECIMAL_SCALE), Integer.valueOf(NumberSerializer.MAX_BIG_DECIMAL_SCALE)), new Object[0]);
                }
                string = bigDecimal.toPlainString();
            } else {
                string = obj.toString();
            }
            jsonGenerator.mo10787C0(string);
        }

        @Override // com.fasterxml.jackson.databind.ser.std.ToStringSerializerBase
        public String valueToString(Object obj) {
            throw new IllegalStateException();
        }

        public boolean _verifyBigDecimalRange(JsonGenerator jsonGenerator, BigDecimal bigDecimal) throws IOException {
            int iScale = bigDecimal.scale();
            if (iScale >= -9999 && iScale <= NumberSerializer.MAX_BIG_DECIMAL_SCALE) {
                return true;
            }
            return false;
        }
    }

    public NumberSerializer(Class<? extends Number> cls) {
        super(cls, false);
        this._isInt = cls == BigInteger.class;
    }

    /* JADX INFO: renamed from: com.fasterxml.jackson.databind.ser.std.NumberSerializer$a */
    public static /* synthetic */ class C6473a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f10655a;

        static {
            int[] iArr = new int[JsonFormat.Shape.values().length];
            f10655a = iArr;
            try {
                iArr[JsonFormat.Shape.STRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    public static AbstractC6393h<?> bigDecimalAsStringSerializer() {
        return BigDecimalAsStringSerializer.BD_INSTANCE;
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdScalarSerializer, com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.AbstractC6393h
    public void acceptJsonFormatVisitor(InterfaceC43399e interfaceC43399e, JavaType javaType) throws JsonMappingException {
        if (this._isInt) {
            visitIntFormat(interfaceC43399e, javaType, JsonParser.NumberType.BIG_INTEGER);
        } else if (handledType() == BigDecimal.class) {
            visitFloatFormat(interfaceC43399e, javaType, JsonParser.NumberType.BIG_DECIMAL);
        } else {
            interfaceC43399e.mo95582l(javaType);
        }
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdScalarSerializer, com.fasterxml.jackson.databind.ser.std.StdSerializer, p551q7.InterfaceC43653c
    public AbstractC6391f getSchema(AbstractC6446m abstractC6446m, Type type) {
        return createSchemaNode(this._isInt ? TypedValues.Custom.S_INT : "number", true);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.AbstractC6393h
    public void serialize(Number number, JsonGenerator jsonGenerator, AbstractC6446m abstractC6446m) throws IOException {
        if (number instanceof BigDecimal) {
            jsonGenerator.mo10820h0((BigDecimal) number);
            return;
        }
        if (number instanceof BigInteger) {
            jsonGenerator.mo10822i0((BigInteger) number);
            return;
        }
        if (number instanceof Long) {
            jsonGenerator.mo10816f0(number.longValue());
            return;
        }
        if (number instanceof Double) {
            jsonGenerator.mo10813c0(number.doubleValue());
            return;
        }
        if (number instanceof Float) {
            jsonGenerator.mo10814d0(number.floatValue());
        } else if ((number instanceof Integer) || (number instanceof Byte) || (number instanceof Short)) {
            jsonGenerator.mo10815e0(number.intValue());
        } else {
            jsonGenerator.mo10818g0(number.toString());
        }
    }

    @Override // com.fasterxml.jackson.databind.ser.InterfaceC6455d
    public AbstractC6393h<?> createContextual(AbstractC6446m abstractC6446m, BeanProperty beanProperty) throws JsonMappingException {
        JsonFormat.Value valueFindFormatOverrides = findFormatOverrides(abstractC6446m, beanProperty, handledType());
        if (valueFindFormatOverrides != null && C6473a.f10655a[valueFindFormatOverrides.getShape().ordinal()] == 1) {
            if (handledType() == BigDecimal.class) {
                return bigDecimalAsStringSerializer();
            }
            return ToStringSerializer.instance;
        }
        return this;
    }
}
