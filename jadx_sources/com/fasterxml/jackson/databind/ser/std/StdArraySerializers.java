package com.fasterxml.jackson.databind.ser.std;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.AbstractC6391f;
import com.fasterxml.jackson.databind.AbstractC6393h;
import com.fasterxml.jackson.databind.AbstractC6446m;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes;
import com.fasterxml.jackson.databind.jsontype.AbstractC6431e;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.ser.ContainerSerializer;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.HashMap;
import p450m7.InterfaceC42435a;
import p528p7.InterfaceC43399e;

/* JADX INFO: loaded from: classes45.dex */
public class StdArraySerializers {

    /* JADX INFO: renamed from: a */
    public static final HashMap<String, AbstractC6393h<?>> f10658a;

    @InterfaceC42435a
    public static class BooleanArraySerializer extends ArraySerializerBase<boolean[]> {

        /* JADX INFO: renamed from: c */
        public static final JavaType f10659c = TypeFactory.defaultInstance().uncheckedSimpleType(Boolean.class);

        public BooleanArraySerializer() {
            super(boolean[].class);
        }

        @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
        public AbstractC6393h<?> getContentSerializer() {
            return null;
        }

        public BooleanArraySerializer(BooleanArraySerializer booleanArraySerializer, BeanProperty beanProperty, Boolean bool) {
            super(booleanArraySerializer, beanProperty, bool);
        }

        @Override // com.fasterxml.jackson.databind.ser.std.ArraySerializerBase
        public AbstractC6393h<?> _withResolved(BeanProperty beanProperty, Boolean bool) {
            return new BooleanArraySerializer(this, beanProperty, bool);
        }

        @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.AbstractC6393h
        public void acceptJsonFormatVisitor(InterfaceC43399e interfaceC43399e, JavaType javaType) throws JsonMappingException {
            visitArrayFormat(interfaceC43399e, javaType, JsonFormatTypes.BOOLEAN);
        }

        @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
        public JavaType getContentType() {
            return f10659c;
        }

        @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, p551q7.InterfaceC43653c
        public AbstractC6391f getSchema(AbstractC6446m abstractC6446m, Type type) {
            ObjectNode objectNodeCreateSchemaNode = createSchemaNode("array", true);
            objectNodeCreateSchemaNode.set(FirebaseAnalytics.Param.ITEMS, createSchemaNode(TypedValues.Custom.S_BOOLEAN));
            return objectNodeCreateSchemaNode;
        }

        @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
        public boolean hasSingleElement(boolean[] zArr) {
            return zArr.length == 1;
        }

        @Override // com.fasterxml.jackson.databind.AbstractC6393h
        public boolean isEmpty(AbstractC6446m abstractC6446m, boolean[] zArr) {
            return zArr.length == 0;
        }

        @Override // com.fasterxml.jackson.databind.ser.std.ArraySerializerBase, com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.AbstractC6393h
        public final void serialize(boolean[] zArr, JsonGenerator jsonGenerator, AbstractC6446m abstractC6446m) throws IOException {
            int length = zArr.length;
            if (length == 1 && _shouldUnwrapSingle(abstractC6446m)) {
                serializeContents(zArr, jsonGenerator, abstractC6446m);
                return;
            }
            jsonGenerator.mo10849x0(zArr, length);
            serializeContents(zArr, jsonGenerator, abstractC6446m);
            jsonGenerator.mo10805W();
        }

        @Override // com.fasterxml.jackson.databind.ser.std.ArraySerializerBase
        public void serializeContents(boolean[] zArr, JsonGenerator jsonGenerator, AbstractC6446m abstractC6446m) throws IOException {
            for (boolean z11 : zArr) {
                jsonGenerator.mo10803U(z11);
            }
        }

        @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
        public ContainerSerializer<?> _withValueTypeSerializer(AbstractC6431e abstractC6431e) {
            return this;
        }
    }

    @InterfaceC42435a
    public static class CharArraySerializer extends StdSerializer<char[]> {
        /* JADX INFO: renamed from: a */
        public final void m11837a(JsonGenerator jsonGenerator, char[] cArr) throws IOException {
            int length = cArr.length;
            for (int i11 = 0; i11 < length; i11++) {
                jsonGenerator.mo10788D0(cArr, i11, 1);
            }
        }

        public CharArraySerializer() {
            super(char[].class);
        }

        @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.AbstractC6393h
        public void acceptJsonFormatVisitor(InterfaceC43399e interfaceC43399e, JavaType javaType) throws JsonMappingException {
            visitArrayFormat(interfaceC43399e, javaType, JsonFormatTypes.STRING);
        }

        @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, p551q7.InterfaceC43653c
        public AbstractC6391f getSchema(AbstractC6446m abstractC6446m, Type type) {
            ObjectNode objectNodeCreateSchemaNode = createSchemaNode("array", true);
            ObjectNode objectNodeCreateSchemaNode2 = createSchemaNode(TypedValues.Custom.S_STRING);
            objectNodeCreateSchemaNode2.put("type", TypedValues.Custom.S_STRING);
            return objectNodeCreateSchemaNode.set(FirebaseAnalytics.Param.ITEMS, objectNodeCreateSchemaNode2);
        }

        @Override // com.fasterxml.jackson.databind.AbstractC6393h
        public boolean isEmpty(AbstractC6446m abstractC6446m, char[] cArr) {
            return cArr.length == 0;
        }

        @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.AbstractC6393h
        public void serialize(char[] cArr, JsonGenerator jsonGenerator, AbstractC6446m abstractC6446m) throws IOException {
            if (!abstractC6446m.isEnabled(SerializationFeature.WRITE_CHAR_ARRAYS_AS_JSON_ARRAYS)) {
                jsonGenerator.mo10788D0(cArr, 0, cArr.length);
                return;
            }
            jsonGenerator.mo10849x0(cArr, cArr.length);
            m11837a(jsonGenerator, cArr);
            jsonGenerator.mo10805W();
        }

        @Override // com.fasterxml.jackson.databind.AbstractC6393h
        public void serializeWithType(char[] cArr, JsonGenerator jsonGenerator, AbstractC6446m abstractC6446m, AbstractC6431e abstractC6431e) throws IOException {
            WritableTypeId writableTypeIdMo11695g;
            if (abstractC6446m.isEnabled(SerializationFeature.WRITE_CHAR_ARRAYS_AS_JSON_ARRAYS)) {
                writableTypeIdMo11695g = abstractC6431e.mo11695g(jsonGenerator, abstractC6431e.m11692d(cArr, JsonToken.START_ARRAY));
                m11837a(jsonGenerator, cArr);
            } else {
                writableTypeIdMo11695g = abstractC6431e.mo11695g(jsonGenerator, abstractC6431e.m11692d(cArr, JsonToken.VALUE_STRING));
                jsonGenerator.mo10788D0(cArr, 0, cArr.length);
            }
            abstractC6431e.mo11696h(jsonGenerator, writableTypeIdMo11695g);
        }
    }

    @InterfaceC42435a
    public static class DoubleArraySerializer extends ArraySerializerBase<double[]> {

        /* JADX INFO: renamed from: c */
        public static final JavaType f10660c = TypeFactory.defaultInstance().uncheckedSimpleType(Double.TYPE);

        public DoubleArraySerializer() {
            super(double[].class);
        }

        @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
        public AbstractC6393h<?> getContentSerializer() {
            return null;
        }

        public DoubleArraySerializer(DoubleArraySerializer doubleArraySerializer, BeanProperty beanProperty, Boolean bool) {
            super(doubleArraySerializer, beanProperty, bool);
        }

        @Override // com.fasterxml.jackson.databind.ser.std.ArraySerializerBase
        public AbstractC6393h<?> _withResolved(BeanProperty beanProperty, Boolean bool) {
            return new DoubleArraySerializer(this, beanProperty, bool);
        }

        @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.AbstractC6393h
        public void acceptJsonFormatVisitor(InterfaceC43399e interfaceC43399e, JavaType javaType) throws JsonMappingException {
            visitArrayFormat(interfaceC43399e, javaType, JsonFormatTypes.NUMBER);
        }

        @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
        public JavaType getContentType() {
            return f10660c;
        }

        @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, p551q7.InterfaceC43653c
        public AbstractC6391f getSchema(AbstractC6446m abstractC6446m, Type type) {
            return createSchemaNode("array", true).set(FirebaseAnalytics.Param.ITEMS, createSchemaNode("number"));
        }

        @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
        public boolean hasSingleElement(double[] dArr) {
            return dArr.length == 1;
        }

        @Override // com.fasterxml.jackson.databind.AbstractC6393h
        public boolean isEmpty(AbstractC6446m abstractC6446m, double[] dArr) {
            return dArr.length == 0;
        }

        @Override // com.fasterxml.jackson.databind.ser.std.ArraySerializerBase, com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.AbstractC6393h
        public final void serialize(double[] dArr, JsonGenerator jsonGenerator, AbstractC6446m abstractC6446m) throws IOException {
            if (dArr.length == 1 && _shouldUnwrapSingle(abstractC6446m)) {
                serializeContents(dArr, jsonGenerator, abstractC6446m);
            } else {
                jsonGenerator.m10795L(dArr, 0, dArr.length);
            }
        }

        @Override // com.fasterxml.jackson.databind.ser.std.ArraySerializerBase
        public void serializeContents(double[] dArr, JsonGenerator jsonGenerator, AbstractC6446m abstractC6446m) throws IOException {
            for (double d11 : dArr) {
                jsonGenerator.mo10813c0(d11);
            }
        }

        @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
        public ContainerSerializer<?> _withValueTypeSerializer(AbstractC6431e abstractC6431e) {
            return this;
        }
    }

    @InterfaceC42435a
    public static class FloatArraySerializer extends TypedPrimitiveArraySerializer<float[]> {

        /* JADX INFO: renamed from: c */
        public static final JavaType f10661c = TypeFactory.defaultInstance().uncheckedSimpleType(Float.TYPE);

        public FloatArraySerializer() {
            super(float[].class);
        }

        @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
        public AbstractC6393h<?> getContentSerializer() {
            return null;
        }

        public FloatArraySerializer(FloatArraySerializer floatArraySerializer, BeanProperty beanProperty, Boolean bool) {
            super(floatArraySerializer, beanProperty, bool);
        }

        @Override // com.fasterxml.jackson.databind.ser.std.ArraySerializerBase
        public AbstractC6393h<?> _withResolved(BeanProperty beanProperty, Boolean bool) {
            return new FloatArraySerializer(this, beanProperty, bool);
        }

        @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.AbstractC6393h
        public void acceptJsonFormatVisitor(InterfaceC43399e interfaceC43399e, JavaType javaType) throws JsonMappingException {
            visitArrayFormat(interfaceC43399e, javaType, JsonFormatTypes.NUMBER);
        }

        @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
        public JavaType getContentType() {
            return f10661c;
        }

        @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, p551q7.InterfaceC43653c
        public AbstractC6391f getSchema(AbstractC6446m abstractC6446m, Type type) {
            return createSchemaNode("array", true).set(FirebaseAnalytics.Param.ITEMS, createSchemaNode("number"));
        }

        @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
        public boolean hasSingleElement(float[] fArr) {
            return fArr.length == 1;
        }

        @Override // com.fasterxml.jackson.databind.AbstractC6393h
        public boolean isEmpty(AbstractC6446m abstractC6446m, float[] fArr) {
            return fArr.length == 0;
        }

        @Override // com.fasterxml.jackson.databind.ser.std.ArraySerializerBase, com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.AbstractC6393h
        public final void serialize(float[] fArr, JsonGenerator jsonGenerator, AbstractC6446m abstractC6446m) throws IOException {
            int length = fArr.length;
            if (length == 1 && _shouldUnwrapSingle(abstractC6446m)) {
                serializeContents(fArr, jsonGenerator, abstractC6446m);
                return;
            }
            jsonGenerator.mo10849x0(fArr, length);
            serializeContents(fArr, jsonGenerator, abstractC6446m);
            jsonGenerator.mo10805W();
        }

        @Override // com.fasterxml.jackson.databind.ser.std.ArraySerializerBase
        public void serializeContents(float[] fArr, JsonGenerator jsonGenerator, AbstractC6446m abstractC6446m) throws IOException {
            for (float f11 : fArr) {
                jsonGenerator.mo10814d0(f11);
            }
        }
    }

    @InterfaceC42435a
    public static class IntArraySerializer extends ArraySerializerBase<int[]> {

        /* JADX INFO: renamed from: c */
        public static final JavaType f10662c = TypeFactory.defaultInstance().uncheckedSimpleType(Integer.TYPE);

        public IntArraySerializer() {
            super(int[].class);
        }

        @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
        public AbstractC6393h<?> getContentSerializer() {
            return null;
        }

        public IntArraySerializer(IntArraySerializer intArraySerializer, BeanProperty beanProperty, Boolean bool) {
            super(intArraySerializer, beanProperty, bool);
        }

        @Override // com.fasterxml.jackson.databind.ser.std.ArraySerializerBase
        public AbstractC6393h<?> _withResolved(BeanProperty beanProperty, Boolean bool) {
            return new IntArraySerializer(this, beanProperty, bool);
        }

        @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.AbstractC6393h
        public void acceptJsonFormatVisitor(InterfaceC43399e interfaceC43399e, JavaType javaType) throws JsonMappingException {
            visitArrayFormat(interfaceC43399e, javaType, JsonFormatTypes.INTEGER);
        }

        @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
        public JavaType getContentType() {
            return f10662c;
        }

        @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, p551q7.InterfaceC43653c
        public AbstractC6391f getSchema(AbstractC6446m abstractC6446m, Type type) {
            return createSchemaNode("array", true).set(FirebaseAnalytics.Param.ITEMS, createSchemaNode(TypedValues.Custom.S_INT));
        }

        @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
        public boolean hasSingleElement(int[] iArr) {
            return iArr.length == 1;
        }

        @Override // com.fasterxml.jackson.databind.AbstractC6393h
        public boolean isEmpty(AbstractC6446m abstractC6446m, int[] iArr) {
            return iArr.length == 0;
        }

        @Override // com.fasterxml.jackson.databind.ser.std.ArraySerializerBase, com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.AbstractC6393h
        public final void serialize(int[] iArr, JsonGenerator jsonGenerator, AbstractC6446m abstractC6446m) throws IOException {
            if (iArr.length == 1 && _shouldUnwrapSingle(abstractC6446m)) {
                serializeContents(iArr, jsonGenerator, abstractC6446m);
            } else {
                jsonGenerator.m10796M(iArr, 0, iArr.length);
            }
        }

        @Override // com.fasterxml.jackson.databind.ser.std.ArraySerializerBase
        public void serializeContents(int[] iArr, JsonGenerator jsonGenerator, AbstractC6446m abstractC6446m) throws IOException {
            for (int i11 : iArr) {
                jsonGenerator.mo10815e0(i11);
            }
        }

        @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
        public ContainerSerializer<?> _withValueTypeSerializer(AbstractC6431e abstractC6431e) {
            return this;
        }
    }

    @InterfaceC42435a
    public static class LongArraySerializer extends TypedPrimitiveArraySerializer<long[]> {

        /* JADX INFO: renamed from: c */
        public static final JavaType f10663c = TypeFactory.defaultInstance().uncheckedSimpleType(Long.TYPE);

        public LongArraySerializer() {
            super(long[].class);
        }

        @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
        public AbstractC6393h<?> getContentSerializer() {
            return null;
        }

        public LongArraySerializer(LongArraySerializer longArraySerializer, BeanProperty beanProperty, Boolean bool) {
            super(longArraySerializer, beanProperty, bool);
        }

        @Override // com.fasterxml.jackson.databind.ser.std.ArraySerializerBase
        public AbstractC6393h<?> _withResolved(BeanProperty beanProperty, Boolean bool) {
            return new LongArraySerializer(this, beanProperty, bool);
        }

        @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.AbstractC6393h
        public void acceptJsonFormatVisitor(InterfaceC43399e interfaceC43399e, JavaType javaType) throws JsonMappingException {
            visitArrayFormat(interfaceC43399e, javaType, JsonFormatTypes.NUMBER);
        }

        @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
        public JavaType getContentType() {
            return f10663c;
        }

        @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, p551q7.InterfaceC43653c
        public AbstractC6391f getSchema(AbstractC6446m abstractC6446m, Type type) {
            return createSchemaNode("array", true).set(FirebaseAnalytics.Param.ITEMS, createSchemaNode("number", true));
        }

        @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
        public boolean hasSingleElement(long[] jArr) {
            return jArr.length == 1;
        }

        @Override // com.fasterxml.jackson.databind.AbstractC6393h
        public boolean isEmpty(AbstractC6446m abstractC6446m, long[] jArr) {
            return jArr.length == 0;
        }

        @Override // com.fasterxml.jackson.databind.ser.std.ArraySerializerBase, com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.AbstractC6393h
        public final void serialize(long[] jArr, JsonGenerator jsonGenerator, AbstractC6446m abstractC6446m) throws IOException {
            if (jArr.length == 1 && _shouldUnwrapSingle(abstractC6446m)) {
                serializeContents(jArr, jsonGenerator, abstractC6446m);
            } else {
                jsonGenerator.m10797O(jArr, 0, jArr.length);
            }
        }

        @Override // com.fasterxml.jackson.databind.ser.std.ArraySerializerBase
        public void serializeContents(long[] jArr, JsonGenerator jsonGenerator, AbstractC6446m abstractC6446m) throws IOException {
            for (long j11 : jArr) {
                jsonGenerator.mo10816f0(j11);
            }
        }
    }

    @InterfaceC42435a
    public static class ShortArraySerializer extends TypedPrimitiveArraySerializer<short[]> {

        /* JADX INFO: renamed from: c */
        public static final JavaType f10664c = TypeFactory.defaultInstance().uncheckedSimpleType(Short.TYPE);

        public ShortArraySerializer() {
            super(short[].class);
        }

        @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
        public AbstractC6393h<?> getContentSerializer() {
            return null;
        }

        public ShortArraySerializer(ShortArraySerializer shortArraySerializer, BeanProperty beanProperty, Boolean bool) {
            super(shortArraySerializer, beanProperty, bool);
        }

        @Override // com.fasterxml.jackson.databind.ser.std.ArraySerializerBase
        public AbstractC6393h<?> _withResolved(BeanProperty beanProperty, Boolean bool) {
            return new ShortArraySerializer(this, beanProperty, bool);
        }

        @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.AbstractC6393h
        public void acceptJsonFormatVisitor(InterfaceC43399e interfaceC43399e, JavaType javaType) throws JsonMappingException {
            visitArrayFormat(interfaceC43399e, javaType, JsonFormatTypes.INTEGER);
        }

        @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
        public JavaType getContentType() {
            return f10664c;
        }

        @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, p551q7.InterfaceC43653c
        public AbstractC6391f getSchema(AbstractC6446m abstractC6446m, Type type) {
            return createSchemaNode("array", true).set(FirebaseAnalytics.Param.ITEMS, createSchemaNode(TypedValues.Custom.S_INT));
        }

        @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
        public boolean hasSingleElement(short[] sArr) {
            return sArr.length == 1;
        }

        @Override // com.fasterxml.jackson.databind.AbstractC6393h
        public boolean isEmpty(AbstractC6446m abstractC6446m, short[] sArr) {
            return sArr.length == 0;
        }

        @Override // com.fasterxml.jackson.databind.ser.std.ArraySerializerBase, com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.AbstractC6393h
        public final void serialize(short[] sArr, JsonGenerator jsonGenerator, AbstractC6446m abstractC6446m) throws IOException {
            int length = sArr.length;
            if (length == 1 && _shouldUnwrapSingle(abstractC6446m)) {
                serializeContents(sArr, jsonGenerator, abstractC6446m);
                return;
            }
            jsonGenerator.mo10849x0(sArr, length);
            serializeContents(sArr, jsonGenerator, abstractC6446m);
            jsonGenerator.mo10805W();
        }

        @Override // com.fasterxml.jackson.databind.ser.std.ArraySerializerBase
        public void serializeContents(short[] sArr, JsonGenerator jsonGenerator, AbstractC6446m abstractC6446m) throws IOException {
            for (short s11 : sArr) {
                jsonGenerator.mo10815e0(s11);
            }
        }
    }

    public static abstract class TypedPrimitiveArraySerializer<T> extends ArraySerializerBase<T> {
        public TypedPrimitiveArraySerializer(Class<T> cls) {
            super(cls);
        }

        public TypedPrimitiveArraySerializer(TypedPrimitiveArraySerializer<T> typedPrimitiveArraySerializer, BeanProperty beanProperty, Boolean bool) {
            super(typedPrimitiveArraySerializer, beanProperty, bool);
        }

        @Override // com.fasterxml.jackson.databind.ser.ContainerSerializer
        public final ContainerSerializer<?> _withValueTypeSerializer(AbstractC6431e abstractC6431e) {
            return this;
        }
    }

    static {
        HashMap<String, AbstractC6393h<?>> map = new HashMap<>();
        f10658a = map;
        map.put(boolean[].class.getName(), new BooleanArraySerializer());
        map.put(byte[].class.getName(), new ByteArraySerializer());
        map.put(char[].class.getName(), new CharArraySerializer());
        map.put(short[].class.getName(), new ShortArraySerializer());
        map.put(int[].class.getName(), new IntArraySerializer());
        map.put(long[].class.getName(), new LongArraySerializer());
        map.put(float[].class.getName(), new FloatArraySerializer());
        map.put(double[].class.getName(), new DoubleArraySerializer());
    }

    /* JADX INFO: renamed from: a */
    public static AbstractC6393h<?> m11836a(Class<?> cls) {
        return f10658a.get(cls.getName());
    }
}
