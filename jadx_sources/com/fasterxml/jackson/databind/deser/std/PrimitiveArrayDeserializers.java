package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.core.C6297a;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.AbstractC6390e;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.deser.InterfaceC6358c;
import com.fasterxml.jackson.databind.deser.InterfaceC6375j;
import com.fasterxml.jackson.databind.deser.impl.NullsConstantProvider;
import com.fasterxml.jackson.databind.deser.impl.NullsFailProvider;
import com.fasterxml.jackson.databind.exc.InvalidNullException;
import com.fasterxml.jackson.databind.jsontype.AbstractC6428b;
import com.fasterxml.jackson.databind.type.LogicalType;
import com.fasterxml.jackson.databind.util.AccessPattern;
import com.fasterxml.jackson.databind.util.C6485b;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Objects;
import p450m7.InterfaceC42435a;

/* JADX INFO: loaded from: classes45.dex */
public abstract class PrimitiveArrayDeserializers<T> extends StdDeserializer<T> implements InterfaceC6358c {
    protected final InterfaceC6375j _nuller;
    protected final Boolean _unwrapSingle;

    /* JADX INFO: renamed from: b */
    public transient Object f10357b;

    @InterfaceC42435a
    public static final class BooleanDeser extends PrimitiveArrayDeserializers<boolean[]> {
        private static final long serialVersionUID = 1;

        public BooleanDeser() {
            super(boolean[].class);
        }

        public BooleanDeser(BooleanDeser booleanDeser, InterfaceC6375j interfaceC6375j, Boolean bool) {
            super(booleanDeser, interfaceC6375j, bool);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public boolean[] _concat(boolean[] zArr, boolean[] zArr2) {
            int length = zArr.length;
            int length2 = zArr2.length;
            boolean[] zArrCopyOf = Arrays.copyOf(zArr, length + length2);
            System.arraycopy(zArr2, 0, zArrCopyOf, length, length2);
            return zArrCopyOf;
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public boolean[] _constructEmpty() {
            return new boolean[0];
        }

        @Override // com.fasterxml.jackson.databind.AbstractC6390e
        public boolean[] deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            boolean z_parseBooleanPrimitive;
            int i11;
            if (!jsonParser.mo10898o0()) {
                return handleNonArray(jsonParser, deserializationContext);
            }
            C6485b.b bVarM11879c = deserializationContext.getArrayBuilders().m11879c();
            boolean[] zArrM11992f = bVarM11879c.m11992f();
            int i12 = 0;
            while (true) {
                try {
                    JsonToken jsonTokenMo10905t0 = jsonParser.mo10905t0();
                    if (jsonTokenMo10905t0 == JsonToken.END_ARRAY) {
                        return bVarM11879c.m11991e(zArrM11992f, i12);
                    }
                    try {
                        if (jsonTokenMo10905t0 == JsonToken.VALUE_TRUE) {
                            z_parseBooleanPrimitive = true;
                        } else {
                            if (jsonTokenMo10905t0 != JsonToken.VALUE_FALSE) {
                                if (jsonTokenMo10905t0 == JsonToken.VALUE_NULL) {
                                    InterfaceC6375j interfaceC6375j = this._nuller;
                                    if (interfaceC6375j != null) {
                                        interfaceC6375j.getNullValue(deserializationContext);
                                    } else {
                                        _verifyNullForPrimitive(deserializationContext);
                                    }
                                } else {
                                    z_parseBooleanPrimitive = _parseBooleanPrimitive(jsonParser, deserializationContext);
                                }
                            }
                            z_parseBooleanPrimitive = false;
                        }
                        zArrM11992f[i12] = z_parseBooleanPrimitive;
                        i12 = i11;
                    } catch (Exception e11) {
                        e = e11;
                        i12 = i11;
                        throw JsonMappingException.wrapWithPath(e, zArrM11992f, bVarM11879c.m11990d() + i12);
                    }
                    if (i12 >= zArrM11992f.length) {
                        boolean[] zArrM11989c = bVarM11879c.m11989c(zArrM11992f, i12);
                        i12 = 0;
                        zArrM11992f = zArrM11989c;
                    }
                    i11 = i12 + 1;
                } catch (Exception e12) {
                    e = e12;
                }
            }
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public boolean[] handleSingleElementUnwrapped(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            return new boolean[]{_parseBooleanPrimitive(jsonParser, deserializationContext)};
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public PrimitiveArrayDeserializers<?> withResolved(InterfaceC6375j interfaceC6375j, Boolean bool) {
            return new BooleanDeser(this, interfaceC6375j, bool);
        }
    }

    @InterfaceC42435a
    public static final class ByteDeser extends PrimitiveArrayDeserializers<byte[]> {
        private static final long serialVersionUID = 1;

        public ByteDeser() {
            super(byte[].class);
        }

        public ByteDeser(ByteDeser byteDeser, InterfaceC6375j interfaceC6375j, Boolean bool) {
            super(byteDeser, interfaceC6375j, bool);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public byte[] _concat(byte[] bArr, byte[] bArr2) {
            int length = bArr.length;
            int length2 = bArr2.length;
            byte[] bArrCopyOf = Arrays.copyOf(bArr, length + length2);
            System.arraycopy(bArr2, 0, bArrCopyOf, length, length2);
            return bArrCopyOf;
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public byte[] _constructEmpty() {
            return new byte[0];
        }

        @Override // com.fasterxml.jackson.databind.AbstractC6390e
        public byte[] deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            byte bMo10901q;
            int i11;
            JsonToken jsonTokenMo10889k = jsonParser.mo10889k();
            if (jsonTokenMo10889k == JsonToken.VALUE_STRING) {
                try {
                    return jsonParser.mo10899p(deserializationContext.getBase64Variant());
                } catch (StreamReadException e11) {
                    String originalMessage = e11.getOriginalMessage();
                    if (originalMessage.contains("base64")) {
                        return (byte[]) deserializationContext.handleWeirdStringValue(byte[].class, jsonParser.mo10869W(), originalMessage, new Object[0]);
                    }
                }
            }
            if (jsonTokenMo10889k == JsonToken.VALUE_EMBEDDED_OBJECT) {
                Object objMo10858J = jsonParser.mo10858J();
                if (objMo10858J == null) {
                    return null;
                }
                if (objMo10858J instanceof byte[]) {
                    return (byte[]) objMo10858J;
                }
            }
            if (!jsonParser.mo10898o0()) {
                return handleNonArray(jsonParser, deserializationContext);
            }
            C6485b.c cVarM11880d = deserializationContext.getArrayBuilders().m11880d();
            byte[] bArrM11992f = cVarM11880d.m11992f();
            int i12 = 0;
            while (true) {
                try {
                    JsonToken jsonTokenMo10905t0 = jsonParser.mo10905t0();
                    if (jsonTokenMo10905t0 == JsonToken.END_ARRAY) {
                        return cVarM11880d.m11991e(bArrM11992f, i12);
                    }
                    try {
                        if (jsonTokenMo10905t0 == JsonToken.VALUE_NUMBER_INT) {
                            bMo10901q = jsonParser.mo10901q();
                        } else if (jsonTokenMo10905t0 == JsonToken.VALUE_NULL) {
                            InterfaceC6375j interfaceC6375j = this._nuller;
                            if (interfaceC6375j != null) {
                                interfaceC6375j.getNullValue(deserializationContext);
                            } else {
                                _verifyNullForPrimitive(deserializationContext);
                                bMo10901q = 0;
                            }
                        } else {
                            bMo10901q = _parseBytePrimitive(jsonParser, deserializationContext);
                        }
                        bArrM11992f[i12] = bMo10901q;
                        i12 = i11;
                    } catch (Exception e12) {
                        e = e12;
                        i12 = i11;
                        throw JsonMappingException.wrapWithPath(e, bArrM11992f, cVarM11880d.m11990d() + i12);
                    }
                    if (i12 >= bArrM11992f.length) {
                        byte[] bArrM11989c = cVarM11880d.m11989c(bArrM11992f, i12);
                        i12 = 0;
                        bArrM11992f = bArrM11989c;
                    }
                    i11 = i12 + 1;
                } catch (Exception e13) {
                    e = e13;
                }
            }
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public byte[] handleSingleElementUnwrapped(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            byte bByteValue;
            JsonToken jsonTokenMo10889k = jsonParser.mo10889k();
            if (jsonTokenMo10889k == JsonToken.VALUE_NUMBER_INT) {
                bByteValue = jsonParser.mo10901q();
            } else {
                if (jsonTokenMo10889k == JsonToken.VALUE_NULL) {
                    InterfaceC6375j interfaceC6375j = this._nuller;
                    if (interfaceC6375j != null) {
                        interfaceC6375j.getNullValue(deserializationContext);
                        return (byte[]) getEmptyValue(deserializationContext);
                    }
                    _verifyNullForPrimitive(deserializationContext);
                    return null;
                }
                bByteValue = ((Number) deserializationContext.handleUnexpectedToken(this._valueClass.getComponentType(), jsonParser)).byteValue();
            }
            return new byte[]{bByteValue};
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers, com.fasterxml.jackson.databind.AbstractC6390e
        public LogicalType logicalType() {
            return LogicalType.Binary;
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public PrimitiveArrayDeserializers<?> withResolved(InterfaceC6375j interfaceC6375j, Boolean bool) {
            return new ByteDeser(this, interfaceC6375j, bool);
        }
    }

    @InterfaceC42435a
    public static final class CharDeser extends PrimitiveArrayDeserializers<char[]> {
        private static final long serialVersionUID = 1;

        public CharDeser() {
            super(char[].class);
        }

        public CharDeser(CharDeser charDeser, InterfaceC6375j interfaceC6375j, Boolean bool) {
            super(charDeser, interfaceC6375j, bool);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public char[] _concat(char[] cArr, char[] cArr2) {
            int length = cArr.length;
            int length2 = cArr2.length;
            char[] cArrCopyOf = Arrays.copyOf(cArr, length + length2);
            System.arraycopy(cArr2, 0, cArrCopyOf, length, length2);
            return cArrCopyOf;
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public char[] _constructEmpty() {
            return new char[0];
        }

        @Override // com.fasterxml.jackson.databind.AbstractC6390e
        public char[] deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            String strMo10869W;
            if (jsonParser.mo10890k0(JsonToken.VALUE_STRING)) {
                char[] cArrMo10870X = jsonParser.mo10870X();
                int iMo10872Z = jsonParser.mo10872Z();
                int iMo10871Y = jsonParser.mo10871Y();
                char[] cArr = new char[iMo10871Y];
                System.arraycopy(cArrMo10870X, iMo10872Z, cArr, 0, iMo10871Y);
                return cArr;
            }
            if (!jsonParser.mo10898o0()) {
                if (jsonParser.mo10890k0(JsonToken.VALUE_EMBEDDED_OBJECT)) {
                    Object objMo10858J = jsonParser.mo10858J();
                    if (objMo10858J == null) {
                        return null;
                    }
                    if (objMo10858J instanceof char[]) {
                        return (char[]) objMo10858J;
                    }
                    if (objMo10858J instanceof String) {
                        return ((String) objMo10858J).toCharArray();
                    }
                    if (objMo10858J instanceof byte[]) {
                        return C6297a.m10918a().encode((byte[]) objMo10858J, false).toCharArray();
                    }
                }
                return (char[]) deserializationContext.handleUnexpectedToken(this._valueClass, jsonParser);
            }
            StringBuilder sb2 = new StringBuilder(64);
            while (true) {
                JsonToken jsonTokenMo10905t0 = jsonParser.mo10905t0();
                if (jsonTokenMo10905t0 == JsonToken.END_ARRAY) {
                    return sb2.toString().toCharArray();
                }
                if (jsonTokenMo10905t0 == JsonToken.VALUE_STRING) {
                    strMo10869W = jsonParser.mo10869W();
                } else if (jsonTokenMo10905t0 == JsonToken.VALUE_NULL) {
                    InterfaceC6375j interfaceC6375j = this._nuller;
                    if (interfaceC6375j != null) {
                        interfaceC6375j.getNullValue(deserializationContext);
                    } else {
                        _verifyNullForPrimitive(deserializationContext);
                        strMo10869W = "\u0000";
                    }
                } else {
                    strMo10869W = ((CharSequence) deserializationContext.handleUnexpectedToken(Character.TYPE, jsonParser)).toString();
                }
                if (strMo10869W.length() != 1) {
                    deserializationContext.reportInputMismatch(this, "Cannot convert a JSON String of length %d into a char element of char array", Integer.valueOf(strMo10869W.length()));
                }
                sb2.append(strMo10869W.charAt(0));
            }
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public char[] handleSingleElementUnwrapped(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            return (char[]) deserializationContext.handleUnexpectedToken(this._valueClass, jsonParser);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public PrimitiveArrayDeserializers<?> withResolved(InterfaceC6375j interfaceC6375j, Boolean bool) {
            return this;
        }
    }

    @InterfaceC42435a
    public static final class DoubleDeser extends PrimitiveArrayDeserializers<double[]> {
        private static final long serialVersionUID = 1;

        public DoubleDeser() {
            super(double[].class);
        }

        public DoubleDeser(DoubleDeser doubleDeser, InterfaceC6375j interfaceC6375j, Boolean bool) {
            super(doubleDeser, interfaceC6375j, bool);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public double[] _concat(double[] dArr, double[] dArr2) {
            int length = dArr.length;
            int length2 = dArr2.length;
            double[] dArrCopyOf = Arrays.copyOf(dArr, length + length2);
            System.arraycopy(dArr2, 0, dArrCopyOf, length, length2);
            return dArrCopyOf;
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public double[] _constructEmpty() {
            return new double[0];
        }

        @Override // com.fasterxml.jackson.databind.AbstractC6390e
        public double[] deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            InterfaceC6375j interfaceC6375j;
            if (!jsonParser.mo10898o0()) {
                return handleNonArray(jsonParser, deserializationContext);
            }
            C6485b.d dVarM11881e = deserializationContext.getArrayBuilders().m11881e();
            double[] dArr = (double[]) dVarM11881e.m11992f();
            int i11 = 0;
            while (true) {
                try {
                    JsonToken jsonTokenMo10905t0 = jsonParser.mo10905t0();
                    if (jsonTokenMo10905t0 == JsonToken.END_ARRAY) {
                        return (double[]) dVarM11881e.m11991e(dArr, i11);
                    }
                    if (jsonTokenMo10905t0 != JsonToken.VALUE_NULL || (interfaceC6375j = this._nuller) == null) {
                        double d_parseDoublePrimitive = _parseDoublePrimitive(jsonParser, deserializationContext);
                        if (i11 >= dArr.length) {
                            double[] dArr2 = (double[]) dVarM11881e.m11989c(dArr, i11);
                            i11 = 0;
                            dArr = dArr2;
                        }
                        int i12 = i11 + 1;
                        try {
                            dArr[i11] = d_parseDoublePrimitive;
                            i11 = i12;
                        } catch (Exception e11) {
                            e = e11;
                            i11 = i12;
                            throw JsonMappingException.wrapWithPath(e, dArr, dVarM11881e.m11990d() + i11);
                        }
                    } else {
                        interfaceC6375j.getNullValue(deserializationContext);
                    }
                } catch (Exception e12) {
                    e = e12;
                }
            }
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public double[] handleSingleElementUnwrapped(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            return new double[]{_parseDoublePrimitive(jsonParser, deserializationContext)};
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public PrimitiveArrayDeserializers<?> withResolved(InterfaceC6375j interfaceC6375j, Boolean bool) {
            return new DoubleDeser(this, interfaceC6375j, bool);
        }
    }

    @InterfaceC42435a
    public static final class FloatDeser extends PrimitiveArrayDeserializers<float[]> {
        private static final long serialVersionUID = 1;

        public FloatDeser() {
            super(float[].class);
        }

        public FloatDeser(FloatDeser floatDeser, InterfaceC6375j interfaceC6375j, Boolean bool) {
            super(floatDeser, interfaceC6375j, bool);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public float[] _concat(float[] fArr, float[] fArr2) {
            int length = fArr.length;
            int length2 = fArr2.length;
            float[] fArrCopyOf = Arrays.copyOf(fArr, length + length2);
            System.arraycopy(fArr2, 0, fArrCopyOf, length, length2);
            return fArrCopyOf;
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public float[] _constructEmpty() {
            return new float[0];
        }

        @Override // com.fasterxml.jackson.databind.AbstractC6390e
        public float[] deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            InterfaceC6375j interfaceC6375j;
            if (!jsonParser.mo10898o0()) {
                return handleNonArray(jsonParser, deserializationContext);
            }
            C6485b.e eVarM11882f = deserializationContext.getArrayBuilders().m11882f();
            float[] fArr = (float[]) eVarM11882f.m11992f();
            int i11 = 0;
            while (true) {
                try {
                    JsonToken jsonTokenMo10905t0 = jsonParser.mo10905t0();
                    if (jsonTokenMo10905t0 == JsonToken.END_ARRAY) {
                        return (float[]) eVarM11882f.m11991e(fArr, i11);
                    }
                    if (jsonTokenMo10905t0 != JsonToken.VALUE_NULL || (interfaceC6375j = this._nuller) == null) {
                        float f_parseFloatPrimitive = _parseFloatPrimitive(jsonParser, deserializationContext);
                        if (i11 >= fArr.length) {
                            float[] fArr2 = (float[]) eVarM11882f.m11989c(fArr, i11);
                            i11 = 0;
                            fArr = fArr2;
                        }
                        int i12 = i11 + 1;
                        try {
                            fArr[i11] = f_parseFloatPrimitive;
                            i11 = i12;
                        } catch (Exception e11) {
                            e = e11;
                            i11 = i12;
                            throw JsonMappingException.wrapWithPath(e, fArr, eVarM11882f.m11990d() + i11);
                        }
                    } else {
                        interfaceC6375j.getNullValue(deserializationContext);
                    }
                } catch (Exception e12) {
                    e = e12;
                }
            }
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public float[] handleSingleElementUnwrapped(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            return new float[]{_parseFloatPrimitive(jsonParser, deserializationContext)};
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public PrimitiveArrayDeserializers<?> withResolved(InterfaceC6375j interfaceC6375j, Boolean bool) {
            return new FloatDeser(this, interfaceC6375j, bool);
        }
    }

    @InterfaceC42435a
    public static final class IntDeser extends PrimitiveArrayDeserializers<int[]> {
        public static final IntDeser instance = new IntDeser();
        private static final long serialVersionUID = 1;

        public IntDeser() {
            super(int[].class);
        }

        public IntDeser(IntDeser intDeser, InterfaceC6375j interfaceC6375j, Boolean bool) {
            super(intDeser, interfaceC6375j, bool);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public int[] _concat(int[] iArr, int[] iArr2) {
            int length = iArr.length;
            int length2 = iArr2.length;
            int[] iArrCopyOf = Arrays.copyOf(iArr, length + length2);
            System.arraycopy(iArr2, 0, iArrCopyOf, length, length2);
            return iArrCopyOf;
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public int[] _constructEmpty() {
            return new int[0];
        }

        @Override // com.fasterxml.jackson.databind.AbstractC6390e
        public int[] deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            int iMo10860M;
            int i11;
            if (!jsonParser.mo10898o0()) {
                return handleNonArray(jsonParser, deserializationContext);
            }
            C6485b.f fVarM11883g = deserializationContext.getArrayBuilders().m11883g();
            int[] iArr = (int[]) fVarM11883g.m11992f();
            int i12 = 0;
            while (true) {
                try {
                    JsonToken jsonTokenMo10905t0 = jsonParser.mo10905t0();
                    if (jsonTokenMo10905t0 == JsonToken.END_ARRAY) {
                        return (int[]) fVarM11883g.m11991e(iArr, i12);
                    }
                    try {
                        if (jsonTokenMo10905t0 == JsonToken.VALUE_NUMBER_INT) {
                            iMo10860M = jsonParser.mo10860M();
                        } else if (jsonTokenMo10905t0 == JsonToken.VALUE_NULL) {
                            InterfaceC6375j interfaceC6375j = this._nuller;
                            if (interfaceC6375j != null) {
                                interfaceC6375j.getNullValue(deserializationContext);
                            } else {
                                _verifyNullForPrimitive(deserializationContext);
                                iMo10860M = 0;
                            }
                        } else {
                            iMo10860M = _parseIntPrimitive(jsonParser, deserializationContext);
                        }
                        iArr[i12] = iMo10860M;
                        i12 = i11;
                    } catch (Exception e11) {
                        e = e11;
                        i12 = i11;
                        throw JsonMappingException.wrapWithPath(e, iArr, fVarM11883g.m11990d() + i12);
                    }
                    if (i12 >= iArr.length) {
                        int[] iArr2 = (int[]) fVarM11883g.m11989c(iArr, i12);
                        i12 = 0;
                        iArr = iArr2;
                    }
                    i11 = i12 + 1;
                } catch (Exception e12) {
                    e = e12;
                }
            }
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public int[] handleSingleElementUnwrapped(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            return new int[]{_parseIntPrimitive(jsonParser, deserializationContext)};
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public PrimitiveArrayDeserializers<?> withResolved(InterfaceC6375j interfaceC6375j, Boolean bool) {
            return new IntDeser(this, interfaceC6375j, bool);
        }
    }

    @InterfaceC42435a
    public static final class LongDeser extends PrimitiveArrayDeserializers<long[]> {
        public static final LongDeser instance = new LongDeser();
        private static final long serialVersionUID = 1;

        public LongDeser() {
            super(long[].class);
        }

        public LongDeser(LongDeser longDeser, InterfaceC6375j interfaceC6375j, Boolean bool) {
            super(longDeser, interfaceC6375j, bool);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public long[] _concat(long[] jArr, long[] jArr2) {
            int length = jArr.length;
            int length2 = jArr2.length;
            long[] jArrCopyOf = Arrays.copyOf(jArr, length + length2);
            System.arraycopy(jArr2, 0, jArrCopyOf, length, length2);
            return jArrCopyOf;
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public long[] _constructEmpty() {
            return new long[0];
        }

        @Override // com.fasterxml.jackson.databind.AbstractC6390e
        public long[] deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            long jMo10861O;
            int i11;
            if (!jsonParser.mo10898o0()) {
                return handleNonArray(jsonParser, deserializationContext);
            }
            C6485b.g gVarM11884h = deserializationContext.getArrayBuilders().m11884h();
            long[] jArr = (long[]) gVarM11884h.m11992f();
            int i12 = 0;
            while (true) {
                try {
                    JsonToken jsonTokenMo10905t0 = jsonParser.mo10905t0();
                    if (jsonTokenMo10905t0 == JsonToken.END_ARRAY) {
                        return (long[]) gVarM11884h.m11991e(jArr, i12);
                    }
                    try {
                        if (jsonTokenMo10905t0 == JsonToken.VALUE_NUMBER_INT) {
                            jMo10861O = jsonParser.mo10861O();
                        } else if (jsonTokenMo10905t0 == JsonToken.VALUE_NULL) {
                            InterfaceC6375j interfaceC6375j = this._nuller;
                            if (interfaceC6375j != null) {
                                interfaceC6375j.getNullValue(deserializationContext);
                            } else {
                                _verifyNullForPrimitive(deserializationContext);
                                jMo10861O = 0;
                            }
                        } else {
                            jMo10861O = _parseLongPrimitive(jsonParser, deserializationContext);
                        }
                        jArr[i12] = jMo10861O;
                        i12 = i11;
                    } catch (Exception e11) {
                        e = e11;
                        i12 = i11;
                        throw JsonMappingException.wrapWithPath(e, jArr, gVarM11884h.m11990d() + i12);
                    }
                    if (i12 >= jArr.length) {
                        long[] jArr2 = (long[]) gVarM11884h.m11989c(jArr, i12);
                        i12 = 0;
                        jArr = jArr2;
                    }
                    i11 = i12 + 1;
                } catch (Exception e12) {
                    e = e12;
                }
            }
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public long[] handleSingleElementUnwrapped(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            return new long[]{_parseLongPrimitive(jsonParser, deserializationContext)};
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public PrimitiveArrayDeserializers<?> withResolved(InterfaceC6375j interfaceC6375j, Boolean bool) {
            return new LongDeser(this, interfaceC6375j, bool);
        }
    }

    @InterfaceC42435a
    public static final class ShortDeser extends PrimitiveArrayDeserializers<short[]> {
        private static final long serialVersionUID = 1;

        public ShortDeser() {
            super(short[].class);
        }

        public ShortDeser(ShortDeser shortDeser, InterfaceC6375j interfaceC6375j, Boolean bool) {
            super(shortDeser, interfaceC6375j, bool);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public short[] _concat(short[] sArr, short[] sArr2) {
            int length = sArr.length;
            int length2 = sArr2.length;
            short[] sArrCopyOf = Arrays.copyOf(sArr, length + length2);
            System.arraycopy(sArr2, 0, sArrCopyOf, length, length2);
            return sArrCopyOf;
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public short[] _constructEmpty() {
            return new short[0];
        }

        @Override // com.fasterxml.jackson.databind.AbstractC6390e
        public short[] deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            short s_parseShortPrimitive;
            int i11;
            if (!jsonParser.mo10898o0()) {
                return handleNonArray(jsonParser, deserializationContext);
            }
            C6485b.h hVarM11885i = deserializationContext.getArrayBuilders().m11885i();
            short[] sArrM11992f = hVarM11885i.m11992f();
            int i12 = 0;
            while (true) {
                try {
                    JsonToken jsonTokenMo10905t0 = jsonParser.mo10905t0();
                    if (jsonTokenMo10905t0 == JsonToken.END_ARRAY) {
                        return hVarM11885i.m11991e(sArrM11992f, i12);
                    }
                    try {
                        if (jsonTokenMo10905t0 == JsonToken.VALUE_NULL) {
                            InterfaceC6375j interfaceC6375j = this._nuller;
                            if (interfaceC6375j != null) {
                                interfaceC6375j.getNullValue(deserializationContext);
                            } else {
                                _verifyNullForPrimitive(deserializationContext);
                                s_parseShortPrimitive = 0;
                            }
                        } else {
                            s_parseShortPrimitive = _parseShortPrimitive(jsonParser, deserializationContext);
                        }
                        sArrM11992f[i12] = s_parseShortPrimitive;
                        i12 = i11;
                    } catch (Exception e11) {
                        e = e11;
                        i12 = i11;
                        throw JsonMappingException.wrapWithPath(e, sArrM11992f, hVarM11885i.m11990d() + i12);
                    }
                    if (i12 >= sArrM11992f.length) {
                        short[] sArrM11989c = hVarM11885i.m11989c(sArrM11992f, i12);
                        i12 = 0;
                        sArrM11992f = sArrM11989c;
                    }
                    i11 = i12 + 1;
                } catch (Exception e12) {
                    e = e12;
                }
            }
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public short[] handleSingleElementUnwrapped(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            return new short[]{_parseShortPrimitive(jsonParser, deserializationContext)};
        }

        @Override // com.fasterxml.jackson.databind.deser.std.PrimitiveArrayDeserializers
        public PrimitiveArrayDeserializers<?> withResolved(InterfaceC6375j interfaceC6375j, Boolean bool) {
            return new ShortDeser(this, interfaceC6375j, bool);
        }
    }

    public PrimitiveArrayDeserializers(Class<T> cls) {
        super((Class<?>) cls);
        this._unwrapSingle = null;
        this._nuller = null;
    }

    public abstract T _concat(T t11, T t12);

    public abstract T _constructEmpty();

    public abstract T handleSingleElementUnwrapped(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException;

    public abstract PrimitiveArrayDeserializers<?> withResolved(InterfaceC6375j interfaceC6375j, Boolean bool);

    public static AbstractC6390e<?> forType(Class<?> cls) {
        if (cls == Integer.TYPE) {
            return IntDeser.instance;
        }
        if (cls == Long.TYPE) {
            return LongDeser.instance;
        }
        if (cls == Byte.TYPE) {
            return new ByteDeser();
        }
        if (cls == Short.TYPE) {
            return new ShortDeser();
        }
        if (cls == Float.TYPE) {
            return new FloatDeser();
        }
        if (cls == Double.TYPE) {
            return new DoubleDeser();
        }
        if (cls == Boolean.TYPE) {
            return new BooleanDeser();
        }
        if (cls == Character.TYPE) {
            return new CharDeser();
        }
        throw new IllegalStateException();
    }

    public void _failOnNull(DeserializationContext deserializationContext) throws IOException {
        throw InvalidNullException.from(deserializationContext, (PropertyName) null, deserializationContext.constructType(this._valueClass));
    }

    @Override // com.fasterxml.jackson.databind.deser.InterfaceC6358c
    public AbstractC6390e<?> createContextual(DeserializationContext deserializationContext, BeanProperty beanProperty) throws JsonMappingException {
        InterfaceC6375j interfaceC6375jConstructForRootValue;
        Boolean boolFindFormatFeature = findFormatFeature(deserializationContext, beanProperty, this._valueClass, JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
        Nulls nullsFindContentNullStyle = findContentNullStyle(deserializationContext, beanProperty);
        if (nullsFindContentNullStyle == Nulls.SKIP) {
            interfaceC6375jConstructForRootValue = NullsConstantProvider.skipper();
        } else if (nullsFindContentNullStyle == Nulls.FAIL) {
            interfaceC6375jConstructForRootValue = beanProperty == null ? NullsFailProvider.constructForRootValue(deserializationContext.constructType(this._valueClass.getComponentType())) : NullsFailProvider.constructForProperty(beanProperty, beanProperty.getType().getContentType());
        } else {
            interfaceC6375jConstructForRootValue = null;
        }
        return (Objects.equals(boolFindFormatFeature, this._unwrapSingle) && interfaceC6375jConstructForRootValue == this._nuller) ? this : withResolved(interfaceC6375jConstructForRootValue, boolFindFormatFeature);
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6390e
    public AccessPattern getEmptyAccessPattern() {
        return AccessPattern.CONSTANT;
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6390e
    public Object getEmptyValue(DeserializationContext deserializationContext) throws JsonMappingException {
        Object obj = this.f10357b;
        if (obj != null) {
            return obj;
        }
        T t_constructEmpty = _constructEmpty();
        this.f10357b = t_constructEmpty;
        return t_constructEmpty;
    }

    public T handleNonArray(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        if (jsonParser.mo10890k0(JsonToken.VALUE_STRING)) {
            return _deserializeFromString(jsonParser, deserializationContext);
        }
        Boolean bool = this._unwrapSingle;
        return (bool == Boolean.TRUE || (bool == null && deserializationContext.isEnabled(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY))) ? handleSingleElementUnwrapped(jsonParser, deserializationContext) : (T) deserializationContext.handleUnexpectedToken(this._valueClass, jsonParser);
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6390e
    public LogicalType logicalType() {
        return LogicalType.Array;
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6390e
    public Boolean supportsUpdate(DeserializationConfig deserializationConfig) {
        return Boolean.TRUE;
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6390e
    public T deserialize(JsonParser jsonParser, DeserializationContext deserializationContext, T t11) throws IOException {
        T tDeserialize = deserialize(jsonParser, deserializationContext);
        if (t11 == null || Array.getLength(t11) == 0) {
            return tDeserialize;
        }
        return _concat(t11, tDeserialize);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer, com.fasterxml.jackson.databind.AbstractC6390e
    public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, AbstractC6428b abstractC6428b) throws IOException {
        return abstractC6428b.deserializeTypedFromArray(jsonParser, deserializationContext);
    }

    public PrimitiveArrayDeserializers(PrimitiveArrayDeserializers<?> primitiveArrayDeserializers, InterfaceC6375j interfaceC6375j, Boolean bool) {
        super(primitiveArrayDeserializers._valueClass);
        this._unwrapSingle = bool;
        this._nuller = interfaceC6375j;
    }
}
