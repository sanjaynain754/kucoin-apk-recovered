package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.util.C6332k;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.cfg.CoercionAction;
import com.fasterxml.jackson.databind.cfg.CoercionInputShape;
import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import com.fasterxml.jackson.databind.type.LogicalType;
import com.fasterxml.jackson.databind.util.C6490g;
import java.io.File;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.Currency;
import java.util.IllformedLocaleException;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes45.dex */
public abstract class FromStringDeserializer<T> extends StdScalarDeserializer<T> {

    public static class Std extends FromStringDeserializer<Object> {
        protected static final String LOCALE_EXT_MARKER = "_#";
        public static final int STD_CHARSET = 9;
        public static final int STD_CLASS = 4;
        public static final int STD_CURRENCY = 6;
        public static final int STD_FILE = 1;
        public static final int STD_INET_ADDRESS = 11;
        public static final int STD_INET_SOCKET_ADDRESS = 12;
        public static final int STD_JAVA_TYPE = 5;
        public static final int STD_LOCALE = 8;
        public static final int STD_PATTERN = 7;
        public static final int STD_TIME_ZONE = 10;
        public static final int STD_URI = 3;
        public static final int STD_URL = 2;
        private static final long serialVersionUID = 1;
        protected final int _kind;

        @Override // com.fasterxml.jackson.databind.deser.std.FromStringDeserializer
        public Object _deserialize(String str, DeserializationContext deserializationContext) throws IOException {
            switch (this._kind) {
                case 1:
                    return new File(str);
                case 2:
                    return new URL(str);
                case 3:
                    return URI.create(str);
                case 4:
                    try {
                        return deserializationContext.findClass(str);
                    } catch (Exception e11) {
                        return deserializationContext.handleInstantiationProblem(this._valueClass, str, C6490g.m11903F(e11));
                    }
                case 5:
                    return deserializationContext.getTypeFactory().constructFromCanonical(str);
                case 6:
                    return Currency.getInstance(str);
                case 7:
                    return Pattern.compile(str);
                case 8:
                    return m11399b(str, deserializationContext);
                case 9:
                    return Charset.forName(str);
                case 10:
                    return TimeZone.getTimeZone(str);
                case 11:
                    return InetAddress.getByName(str);
                case 12:
                    if (str.startsWith("[")) {
                        int iLastIndexOf = str.lastIndexOf(93);
                        if (iLastIndexOf == -1) {
                            throw new InvalidFormatException(deserializationContext.getParser(), "Bracketed IPv6 address must contain closing bracket", str, (Class<?>) InetSocketAddress.class);
                        }
                        int iIndexOf = str.indexOf(58, iLastIndexOf);
                        return new InetSocketAddress(str.substring(0, iLastIndexOf + 1), iIndexOf > -1 ? Integer.parseInt(str.substring(iIndexOf + 1)) : 0);
                    }
                    int iIndexOf2 = str.indexOf(58);
                    if (iIndexOf2 >= 0) {
                        int i11 = iIndexOf2 + 1;
                        if (str.indexOf(58, i11) < 0) {
                            return new InetSocketAddress(str.substring(0, iIndexOf2), Integer.parseInt(str.substring(i11)));
                        }
                    }
                    return new InetSocketAddress(str, 0);
                default:
                    C6332k.m11125c();
                    return null;
            }
        }

        @Override // com.fasterxml.jackson.databind.deser.std.FromStringDeserializer
        public boolean _shouldTrim() {
            return this._kind != 7;
        }

        /* JADX INFO: renamed from: a */
        public final Locale m11398a(String str, int i11, String str2, String str3, int i12) {
            String strSubstring = "";
            if (i12 > 0 && i12 > i11) {
                try {
                    strSubstring = str.substring(i11 + 1, i12);
                } catch (IllformedLocaleException unused) {
                    return new Locale(str2, str3, "");
                }
            }
            String strSubstring2 = str.substring(i12 + 2);
            if (strSubstring2.indexOf(95) < 0 && strSubstring2.indexOf(45) < 0) {
                return new Locale.Builder().setLanguage(str2).setRegion(str3).setVariant(strSubstring).setScript(strSubstring2).build();
            }
            if (strSubstring2.indexOf(95) < 0) {
                return new Locale.Builder().setLanguage(str2).setRegion(str3).setVariant(strSubstring).setExtension(strSubstring2.charAt(0), strSubstring2.substring(strSubstring2.indexOf(45) + 1)).build();
            }
            int iIndexOf = strSubstring2.indexOf(95);
            return new Locale.Builder().setLanguage(str2).setRegion(str3).setVariant(strSubstring).setScript(strSubstring2.substring(0, iIndexOf)).setExtension(strSubstring2.charAt(iIndexOf + 1), strSubstring2.substring(iIndexOf + 3)).build();
        }

        @Override // com.fasterxml.jackson.databind.AbstractC6390e
        public Object getEmptyValue(DeserializationContext deserializationContext) throws JsonMappingException {
            int i11 = this._kind;
            if (i11 != 3) {
                return i11 != 8 ? super.getEmptyValue(deserializationContext) : Locale.ROOT;
            }
            return URI.create("");
        }

        public Std(Class<?> cls, int i11) {
            super(cls);
            this._kind = i11;
        }

        @Override // com.fasterxml.jackson.databind.deser.std.FromStringDeserializer
        public Object _deserializeFromEmptyStringDefault(DeserializationContext deserializationContext) throws IOException {
            return getEmptyValue(deserializationContext);
        }

        public int _firstHyphenOrUnderscore(String str) {
            int length = str.length();
            for (int i11 = 0; i11 < length; i11++) {
                char cCharAt = str.charAt(i11);
                if (cCharAt == '_' || cCharAt == '-') {
                    return i11;
                }
            }
            return -1;
        }

        /* JADX INFO: renamed from: b */
        public final Locale m11399b(String str, DeserializationContext deserializationContext) throws IOException {
            int i_firstHyphenOrUnderscore = _firstHyphenOrUnderscore(str);
            if (i_firstHyphenOrUnderscore < 0) {
                return new Locale(str);
            }
            String strSubstring = str.substring(0, i_firstHyphenOrUnderscore);
            String strSubstring2 = str.substring(i_firstHyphenOrUnderscore + 1);
            int i_firstHyphenOrUnderscore2 = _firstHyphenOrUnderscore(strSubstring2);
            if (i_firstHyphenOrUnderscore2 < 0) {
                return new Locale(strSubstring, strSubstring2);
            }
            String strSubstring3 = strSubstring2.substring(0, i_firstHyphenOrUnderscore2);
            int iIndexOf = strSubstring2.indexOf(LOCALE_EXT_MARKER);
            if (iIndexOf < 0) {
                return new Locale(strSubstring, strSubstring3, strSubstring2.substring(i_firstHyphenOrUnderscore2 + 1));
            }
            return m11398a(strSubstring2, i_firstHyphenOrUnderscore2, strSubstring, strSubstring3, iIndexOf);
        }
    }

    public static class StringBufferDeserializer extends FromStringDeserializer<Object> {
        public StringBufferDeserializer() {
            super(StringBuffer.class);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.FromStringDeserializer
        public Object _deserialize(String str, DeserializationContext deserializationContext) throws IOException {
            return new StringBuffer(str);
        }

        @Override // com.fasterxml.jackson.databind.AbstractC6390e
        public Object getEmptyValue(DeserializationContext deserializationContext) {
            return new StringBuffer();
        }

        @Override // com.fasterxml.jackson.databind.deser.std.FromStringDeserializer, com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer, com.fasterxml.jackson.databind.AbstractC6390e
        public LogicalType logicalType() {
            return LogicalType.Textual;
        }

        @Override // com.fasterxml.jackson.databind.deser.std.FromStringDeserializer, com.fasterxml.jackson.databind.AbstractC6390e
        public Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            String strMo10882g0 = jsonParser.mo10882g0();
            if (strMo10882g0 != null) {
                return _deserialize(strMo10882g0, deserializationContext);
            }
            return super.deserialize(jsonParser, deserializationContext);
        }
    }

    public static class StringBuilderDeserializer extends FromStringDeserializer<Object> {
        public StringBuilderDeserializer() {
            super(StringBuilder.class);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.FromStringDeserializer
        public Object _deserialize(String str, DeserializationContext deserializationContext) throws IOException {
            return new StringBuilder(str);
        }

        @Override // com.fasterxml.jackson.databind.AbstractC6390e
        public Object getEmptyValue(DeserializationContext deserializationContext) throws JsonMappingException {
            return new StringBuilder();
        }

        @Override // com.fasterxml.jackson.databind.deser.std.FromStringDeserializer, com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer, com.fasterxml.jackson.databind.AbstractC6390e
        public LogicalType logicalType() {
            return LogicalType.Textual;
        }

        @Override // com.fasterxml.jackson.databind.deser.std.FromStringDeserializer, com.fasterxml.jackson.databind.AbstractC6390e
        public Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            String strMo10882g0 = jsonParser.mo10882g0();
            if (strMo10882g0 != null) {
                return _deserialize(strMo10882g0, deserializationContext);
            }
            return super.deserialize(jsonParser, deserializationContext);
        }
    }

    public abstract T _deserialize(String str, DeserializationContext deserializationContext) throws IOException;

    @Deprecated
    public final T _deserializeFromEmptyString() throws IOException {
        return null;
    }

    public boolean _shouldTrim() {
        return true;
    }

    public static FromStringDeserializer<?> findDeserializer(Class<?> cls) {
        int i11;
        if (cls == File.class) {
            i11 = 1;
        } else if (cls == URL.class) {
            i11 = 2;
        } else if (cls == URI.class) {
            i11 = 3;
        } else if (cls == Class.class) {
            i11 = 4;
        } else if (cls == JavaType.class) {
            i11 = 5;
        } else if (cls == Currency.class) {
            i11 = 6;
        } else if (cls == Pattern.class) {
            i11 = 7;
        } else if (cls == Locale.class) {
            i11 = 8;
        } else if (cls == Charset.class) {
            i11 = 9;
        } else if (cls == TimeZone.class) {
            i11 = 10;
        } else if (cls == InetAddress.class) {
            i11 = 11;
        } else {
            if (cls != InetSocketAddress.class) {
                if (cls == StringBuilder.class) {
                    return new StringBuilderDeserializer();
                }
                if (cls == StringBuffer.class) {
                    return new StringBufferDeserializer();
                }
                return null;
            }
            i11 = 12;
        }
        return new Std(cls, i11);
    }

    public static Class<?>[] types() {
        return new Class[]{File.class, URL.class, URI.class, Class.class, JavaType.class, Currency.class, Pattern.class, Locale.class, Charset.class, TimeZone.class, InetAddress.class, InetSocketAddress.class, StringBuilder.class, StringBuffer.class};
    }

    public Object _deserializeFromEmptyString(DeserializationContext deserializationContext) throws IOException {
        CoercionAction coercionActionFindCoercionAction = deserializationContext.findCoercionAction(logicalType(), this._valueClass, CoercionInputShape.EmptyString);
        if (coercionActionFindCoercionAction == CoercionAction.Fail) {
            deserializationContext.reportInputMismatch(this, "Cannot coerce empty String (\"\") to %s (but could if enabling coercion using `CoercionConfig`)", _coercedTypeDesc());
        }
        if (coercionActionFindCoercionAction == CoercionAction.AsNull) {
            return getNullValue(deserializationContext);
        }
        return coercionActionFindCoercionAction == CoercionAction.AsEmpty ? getEmptyValue(deserializationContext) : _deserializeFromEmptyStringDefault(deserializationContext);
    }

    public Object _deserializeFromOther(JsonParser jsonParser, DeserializationContext deserializationContext, JsonToken jsonToken) throws IOException {
        if (jsonToken == JsonToken.START_ARRAY) {
            return _deserializeFromArray(jsonParser, deserializationContext);
        }
        if (jsonToken != JsonToken.VALUE_EMBEDDED_OBJECT) {
            return deserializationContext.handleUnexpectedToken(this._valueClass, jsonParser);
        }
        Object objMo10858J = jsonParser.mo10858J();
        if (objMo10858J == null) {
            return null;
        }
        return this._valueClass.isAssignableFrom(objMo10858J.getClass()) ? objMo10858J : _deserializeEmbedded(objMo10858J, deserializationContext);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer, com.fasterxml.jackson.databind.AbstractC6390e
    public LogicalType logicalType() {
        return LogicalType.OtherScalar;
    }

    public FromStringDeserializer(Class<?> cls) {
        super(cls);
    }

    public T _deserializeEmbedded(Object obj, DeserializationContext deserializationContext) throws IOException {
        deserializationContext.reportInputMismatch(this, "Don't know how to convert embedded Object of type %s into %s", obj.getClass().getName(), this._valueClass.getName());
        return null;
    }

    public Object _deserializeFromEmptyStringDefault(DeserializationContext deserializationContext) throws IOException {
        return getNullValue(deserializationContext);
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6390e
    public T deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        String strMo10882g0 = jsonParser.mo10882g0();
        if (strMo10882g0 == null) {
            JsonToken jsonTokenMo10889k = jsonParser.mo10889k();
            if (jsonTokenMo10889k != JsonToken.START_OBJECT) {
                return (T) _deserializeFromOther(jsonParser, deserializationContext, jsonTokenMo10889k);
            }
            strMo10882g0 = deserializationContext.extractScalarFromObject(jsonParser, this, this._valueClass);
        }
        if (strMo10882g0.isEmpty()) {
            return (T) _deserializeFromEmptyString(deserializationContext);
        }
        if (_shouldTrim()) {
            String strTrim = strMo10882g0.trim();
            if (strTrim != strMo10882g0 && strTrim.isEmpty()) {
                return (T) _deserializeFromEmptyString(deserializationContext);
            }
            strMo10882g0 = strTrim;
        }
        try {
            return _deserialize(strMo10882g0, deserializationContext);
        } catch (IllegalArgumentException | MalformedURLException e11) {
            String message = e11.getMessage();
            String str = "not a valid textual representation";
            if (message != null) {
                str = "not a valid textual representation, problem: " + message;
            }
            throw deserializationContext.weirdStringException(strMo10882g0, this._valueClass, str).withCause(e11);
        }
    }
}
