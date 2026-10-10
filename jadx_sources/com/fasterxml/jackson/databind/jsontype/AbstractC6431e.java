package com.fasterxml.jackson.databind.jsontype;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.core.util.C6332k;
import com.fasterxml.jackson.databind.BeanProperty;
import java.io.IOException;

/* JADX INFO: renamed from: com.fasterxml.jackson.databind.jsontype.e */
/* JADX INFO: compiled from: TypeSerializer.java */
/* JADX INFO: loaded from: classes45.dex */
public abstract class AbstractC6431e {
    /* JADX INFO: renamed from: a */
    public abstract AbstractC6431e mo11689a(BeanProperty beanProperty);

    /* JADX INFO: renamed from: b */
    public abstract String mo11690b();

    /* JADX INFO: renamed from: c */
    public abstract JsonTypeInfo.EnumC6265As mo11691c();

    /* JADX INFO: renamed from: g */
    public abstract WritableTypeId mo11695g(JsonGenerator jsonGenerator, WritableTypeId writableTypeId) throws IOException;

    /* JADX INFO: renamed from: h */
    public abstract WritableTypeId mo11696h(JsonGenerator jsonGenerator, WritableTypeId writableTypeId) throws IOException;

    /* JADX INFO: renamed from: com.fasterxml.jackson.databind.jsontype.e$a */
    /* JADX INFO: compiled from: TypeSerializer.java */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f10528a;

        static {
            int[] iArr = new int[JsonTypeInfo.EnumC6265As.values().length];
            f10528a = iArr;
            try {
                iArr[JsonTypeInfo.EnumC6265As.EXISTING_PROPERTY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10528a[JsonTypeInfo.EnumC6265As.EXTERNAL_PROPERTY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f10528a[JsonTypeInfo.EnumC6265As.PROPERTY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f10528a[JsonTypeInfo.EnumC6265As.WRAPPER_ARRAY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f10528a[JsonTypeInfo.EnumC6265As.WRAPPER_OBJECT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public WritableTypeId m11692d(Object obj, JsonToken jsonToken) {
        WritableTypeId writableTypeId = new WritableTypeId(obj, jsonToken);
        int i11 = a.f10528a[mo11691c().ordinal()];
        if (i11 == 1) {
            writableTypeId.f10144e = WritableTypeId.Inclusion.PAYLOAD_PROPERTY;
            writableTypeId.f10143d = mo11690b();
            return writableTypeId;
        }
        if (i11 == 2) {
            writableTypeId.f10144e = WritableTypeId.Inclusion.PARENT_PROPERTY;
            writableTypeId.f10143d = mo11690b();
            return writableTypeId;
        }
        if (i11 == 3) {
            writableTypeId.f10144e = WritableTypeId.Inclusion.METADATA_PROPERTY;
            writableTypeId.f10143d = mo11690b();
            return writableTypeId;
        }
        if (i11 == 4) {
            writableTypeId.f10144e = WritableTypeId.Inclusion.WRAPPER_ARRAY;
            return writableTypeId;
        }
        if (i11 != 5) {
            C6332k.m11125c();
            return writableTypeId;
        }
        writableTypeId.f10144e = WritableTypeId.Inclusion.WRAPPER_OBJECT;
        return writableTypeId;
    }

    /* JADX INFO: renamed from: e */
    public WritableTypeId m11693e(Object obj, JsonToken jsonToken, Object obj2) {
        WritableTypeId writableTypeIdM11692d = m11692d(obj, jsonToken);
        writableTypeIdM11692d.f10142c = obj2;
        return writableTypeIdM11692d;
    }

    /* JADX INFO: renamed from: f */
    public WritableTypeId m11694f(Object obj, Class<?> cls, JsonToken jsonToken) {
        WritableTypeId writableTypeIdM11692d = m11692d(obj, jsonToken);
        writableTypeIdM11692d.f10141b = cls;
        return writableTypeIdM11692d;
    }
}
