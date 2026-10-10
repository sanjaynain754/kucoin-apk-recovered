package com.fasterxml.jackson.databind.jsontype;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import java.io.IOException;

/* JADX INFO: renamed from: com.fasterxml.jackson.databind.jsontype.b */
/* JADX INFO: compiled from: TypeDeserializer.java */
/* JADX INFO: loaded from: classes45.dex */
public abstract class AbstractC6428b {
    public static Object deserializeIfNatural(JsonParser jsonParser, DeserializationContext deserializationContext, JavaType javaType) throws IOException {
        return deserializeIfNatural(jsonParser, deserializationContext, javaType.getRawClass());
    }

    public abstract Object deserializeTypedFromAny(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException;

    public abstract Object deserializeTypedFromArray(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException;

    public abstract Object deserializeTypedFromObject(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException;

    public abstract Object deserializeTypedFromScalar(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException;

    public abstract AbstractC6428b forProperty(BeanProperty beanProperty);

    public abstract Class<?> getDefaultImpl();

    public abstract String getPropertyName();

    public abstract InterfaceC6429c getTypeIdResolver();

    public abstract JsonTypeInfo.EnumC6265As getTypeInclusion();

    /* JADX INFO: renamed from: com.fasterxml.jackson.databind.jsontype.b$a */
    /* JADX INFO: compiled from: TypeDeserializer.java */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f10527a;

        static {
            int[] iArr = new int[JsonToken.values().length];
            f10527a = iArr;
            try {
                iArr[JsonToken.VALUE_STRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10527a[JsonToken.VALUE_NUMBER_INT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f10527a[JsonToken.VALUE_NUMBER_FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f10527a[JsonToken.VALUE_TRUE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f10527a[JsonToken.VALUE_FALSE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public static Object deserializeIfNatural(JsonParser jsonParser, DeserializationContext deserializationContext, Class<?> cls) throws IOException {
        JsonToken jsonTokenMo10889k = jsonParser.mo10889k();
        if (jsonTokenMo10889k == null) {
            return null;
        }
        int i11 = a.f10527a[jsonTokenMo10889k.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        if (i11 == 5 && cls.isAssignableFrom(Boolean.class)) {
                            return Boolean.FALSE;
                        }
                    } else if (cls.isAssignableFrom(Boolean.class)) {
                        return Boolean.TRUE;
                    }
                } else if (cls.isAssignableFrom(Double.class)) {
                    return Double.valueOf(jsonParser.mo10857E());
                }
            } else if (cls.isAssignableFrom(Integer.class)) {
                return Integer.valueOf(jsonParser.mo10860M());
            }
        } else if (cls.isAssignableFrom(String.class)) {
            return jsonParser.mo10869W();
        }
        return null;
    }

    public boolean hasDefaultImpl() {
        if (getDefaultImpl() != null) {
            return true;
        }
        return false;
    }
}
