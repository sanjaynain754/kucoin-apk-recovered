package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.AbstractC6393h;
import com.fasterxml.jackson.databind.AbstractC6446m;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.ser.impl.AbstractC6464b;
import com.fasterxml.jackson.databind.util.C6490g;
import com.fasterxml.jackson.databind.util.EnumValues;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.UUID;
import p528p7.InterfaceC43399e;

/* JADX INFO: loaded from: classes45.dex */
public abstract class StdKeySerializers {

    /* JADX INFO: renamed from: a */
    public static final AbstractC6393h<Object> f10665a = new StdKeySerializer();

    /* JADX INFO: renamed from: b */
    public static final AbstractC6393h<Object> f10666b = new StringKeySerializer();

    public static class Default extends StdSerializer<Object> {
        static final int TYPE_BYTE_ARRAY = 7;
        static final int TYPE_CALENDAR = 2;
        static final int TYPE_CLASS = 3;
        static final int TYPE_DATE = 1;
        static final int TYPE_ENUM = 4;
        static final int TYPE_INTEGER = 5;
        static final int TYPE_LONG = 6;
        static final int TYPE_TO_STRING = 8;
        protected final int _typeId;

        public Default(int i11, Class<?> cls) {
            super(cls, false);
            this._typeId = i11;
        }

        @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.AbstractC6393h
        public void serialize(Object obj, JsonGenerator jsonGenerator, AbstractC6446m abstractC6446m) throws IOException {
            String strValueOf;
            switch (this._typeId) {
                case 1:
                    abstractC6446m.defaultSerializeDateKey((Date) obj, jsonGenerator);
                    break;
                case 2:
                    abstractC6446m.defaultSerializeDateKey(((Calendar) obj).getTimeInMillis(), jsonGenerator);
                    break;
                case 3:
                    jsonGenerator.mo10810a0(((Class) obj).getName());
                    break;
                case 4:
                    if (abstractC6446m.isEnabled(SerializationFeature.WRITE_ENUMS_USING_TO_STRING)) {
                        strValueOf = obj.toString();
                    } else {
                        Enum r11 = (Enum) obj;
                        strValueOf = abstractC6446m.isEnabled(SerializationFeature.WRITE_ENUM_KEYS_USING_INDEX) ? String.valueOf(r11.ordinal()) : r11.name();
                    }
                    jsonGenerator.mo10810a0(strValueOf);
                    break;
                case 5:
                case 6:
                    jsonGenerator.m10807Y(((Number) obj).longValue());
                    break;
                case 7:
                    jsonGenerator.mo10810a0(abstractC6446m.getConfig().getBase64Variant().encode((byte[]) obj));
                    break;
                default:
                    jsonGenerator.mo10810a0(obj.toString());
                    break;
            }
        }
    }

    public static class Dynamic extends StdSerializer<Object> {
        protected transient AbstractC6464b _dynamicSerializers;

        public Dynamic() {
            super(String.class, false);
            this._dynamicSerializers = AbstractC6464b.m11798c();
        }

        public AbstractC6393h<Object> _findAndAddDynamic(AbstractC6464b abstractC6464b, Class<?> cls, AbstractC6446m abstractC6446m) throws JsonMappingException {
            if (cls == Object.class) {
                Default r11 = new Default(8, cls);
                this._dynamicSerializers = abstractC6464b.mo11807j(cls, r11);
                return r11;
            }
            AbstractC6464b.d dVarM11802e = abstractC6464b.m11802e(cls, abstractC6446m, null);
            AbstractC6464b abstractC6464b2 = dVarM11802e.f10632b;
            if (abstractC6464b != abstractC6464b2) {
                this._dynamicSerializers = abstractC6464b2;
            }
            return dVarM11802e.f10631a;
        }

        @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.AbstractC6393h
        public void acceptJsonFormatVisitor(InterfaceC43399e interfaceC43399e, JavaType javaType) throws JsonMappingException {
            visitStringFormat(interfaceC43399e, javaType);
        }

        public Object readResolve() {
            this._dynamicSerializers = AbstractC6464b.m11798c();
            return this;
        }

        @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.AbstractC6393h
        public void serialize(Object obj, JsonGenerator jsonGenerator, AbstractC6446m abstractC6446m) throws IOException {
            Class<?> cls = obj.getClass();
            AbstractC6464b abstractC6464b = this._dynamicSerializers;
            AbstractC6393h<Object> abstractC6393hMo11808k = abstractC6464b.mo11808k(cls);
            if (abstractC6393hMo11808k == null) {
                abstractC6393hMo11808k = _findAndAddDynamic(abstractC6464b, cls, abstractC6446m);
            }
            abstractC6393hMo11808k.serialize(obj, jsonGenerator, abstractC6446m);
        }
    }

    public static class EnumKeySerializer extends StdSerializer<Object> {
        protected final EnumValues _values;

        public EnumKeySerializer(Class<?> cls, EnumValues enumValues) {
            super(cls, false);
            this._values = enumValues;
        }

        public static EnumKeySerializer construct(Class<?> cls, EnumValues enumValues) {
            return new EnumKeySerializer(cls, enumValues);
        }

        @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.AbstractC6393h
        public void serialize(Object obj, JsonGenerator jsonGenerator, AbstractC6446m abstractC6446m) throws IOException {
            if (abstractC6446m.isEnabled(SerializationFeature.WRITE_ENUMS_USING_TO_STRING)) {
                jsonGenerator.mo10810a0(obj.toString());
                return;
            }
            Enum<?> r11 = (Enum) obj;
            if (abstractC6446m.isEnabled(SerializationFeature.WRITE_ENUM_KEYS_USING_INDEX)) {
                jsonGenerator.mo10810a0(String.valueOf(r11.ordinal()));
            } else {
                jsonGenerator.mo10808Z(this._values.serializedValueFor(r11));
            }
        }
    }

    public static class StringKeySerializer extends StdSerializer<Object> {
        public StringKeySerializer() {
            super(String.class, false);
        }

        @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.AbstractC6393h
        public void serialize(Object obj, JsonGenerator jsonGenerator, AbstractC6446m abstractC6446m) throws IOException {
            jsonGenerator.mo10810a0((String) obj);
        }
    }

    /* JADX INFO: renamed from: a */
    public static AbstractC6393h<Object> m11839a(SerializationConfig serializationConfig, Class<?> cls) {
        if (cls != null) {
            if (cls == Enum.class) {
                return new Dynamic();
            }
            if (C6490g.m11909L(cls)) {
                return EnumKeySerializer.construct(cls, EnumValues.constructFromName(serializationConfig, cls));
            }
        }
        return new Default(8, cls);
    }

    /* JADX INFO: renamed from: b */
    public static AbstractC6393h<Object> m11840b(SerializationConfig serializationConfig, Class<?> cls, boolean z11) {
        if (cls == null || cls == Object.class) {
            return new Dynamic();
        }
        if (cls == String.class) {
            return f10666b;
        }
        if (cls.isPrimitive()) {
            cls = C6490g.m11953o0(cls);
        }
        if (cls == Integer.class) {
            return new Default(5, cls);
        }
        if (cls == Long.class) {
            return new Default(6, cls);
        }
        if (cls.isPrimitive() || Number.class.isAssignableFrom(cls)) {
            return new Default(8, cls);
        }
        if (cls == Class.class) {
            return new Default(3, cls);
        }
        if (Date.class.isAssignableFrom(cls)) {
            return new Default(1, cls);
        }
        if (Calendar.class.isAssignableFrom(cls)) {
            return new Default(2, cls);
        }
        if (cls == UUID.class) {
            return new Default(8, cls);
        }
        if (cls == byte[].class) {
            return new Default(7, cls);
        }
        if (z11) {
            return new Default(8, cls);
        }
        return null;
    }
}
