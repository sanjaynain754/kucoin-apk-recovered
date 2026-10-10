package com.fasterxml.jackson.databind.deser.std;

import androidx.credentials.provider.CredentialEntry;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.p062io.C6313g;
import com.fasterxml.jackson.databind.AbstractC6390e;
import com.fasterxml.jackson.databind.AbstractC6394i;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.util.C6490g;
import com.fasterxml.jackson.databind.util.C6499p;
import com.fasterxml.jackson.databind.util.EnumResolver;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.Calendar;
import java.util.Currency;
import java.util.Date;
import java.util.Locale;
import java.util.UUID;
import p450m7.InterfaceC42435a;

/* JADX INFO: loaded from: classes45.dex */
@InterfaceC42435a
public class StdKeyDeserializer extends AbstractC6394i implements Serializable {
    public static final int TYPE_BOOLEAN = 1;
    public static final int TYPE_BYTE = 2;
    public static final int TYPE_BYTE_ARRAY = 17;
    public static final int TYPE_CALENDAR = 11;
    public static final int TYPE_CHAR = 4;
    public static final int TYPE_CLASS = 15;
    public static final int TYPE_CURRENCY = 16;
    public static final int TYPE_DATE = 10;
    public static final int TYPE_DOUBLE = 8;
    public static final int TYPE_FLOAT = 7;
    public static final int TYPE_INT = 5;
    public static final int TYPE_LOCALE = 9;
    public static final int TYPE_LONG = 6;
    public static final int TYPE_SHORT = 3;
    public static final int TYPE_URI = 13;
    public static final int TYPE_URL = 14;
    public static final int TYPE_UUID = 12;
    private static final long serialVersionUID = 1;
    protected final FromStringDeserializer<?> _deser;
    protected final Class<?> _keyClass;
    protected final int _kind;

    public static final class DelegatingKD extends AbstractC6394i implements Serializable {
        private static final long serialVersionUID = 1;
        protected final AbstractC6390e<?> _delegate;
        protected final Class<?> _keyClass;

        @Override // com.fasterxml.jackson.databind.AbstractC6394i
        public final Object deserializeKey(String str, DeserializationContext deserializationContext) throws IOException {
            if (str == null) {
                return null;
            }
            C6499p c6499pBufferForInputBuffering = deserializationContext.bufferForInputBuffering();
            c6499pBufferForInputBuffering.mo10787C0(str);
            try {
                JsonParser jsonParserM12013T0 = c6499pBufferForInputBuffering.m12013T0();
                jsonParserM12013T0.mo10905t0();
                Object objDeserialize = this._delegate.deserialize(jsonParserM12013T0, deserializationContext);
                return objDeserialize != null ? objDeserialize : deserializationContext.handleWeirdKey(this._keyClass, str, "not a valid representation", new Object[0]);
            } catch (Exception e11) {
                return deserializationContext.handleWeirdKey(this._keyClass, str, "not a valid representation: %s", e11.getMessage());
            }
        }

        public Class<?> getKeyClass() {
            return this._keyClass;
        }

        public DelegatingKD(Class<?> cls, AbstractC6390e<?> abstractC6390e) {
            this._keyClass = cls;
            this._delegate = abstractC6390e;
        }
    }

    @InterfaceC42435a
    public static final class EnumKD extends StdKeyDeserializer {
        private static final long serialVersionUID = 1;
        protected final EnumResolver _byNameResolver;
        protected EnumResolver _byToStringResolver;
        protected final Enum<?> _enumDefaultValue;
        protected final AnnotatedMethod _factory;

        @Override // com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer
        public Object _parse(String str, DeserializationContext deserializationContext) throws IOException {
            AnnotatedMethod annotatedMethod = this._factory;
            if (annotatedMethod != null) {
                try {
                    return annotatedMethod.call1(str);
                } catch (Exception e11) {
                    C6490g.m11947l0(e11);
                }
            }
            EnumResolver enumResolverM11408a = deserializationContext.isEnabled(DeserializationFeature.READ_ENUMS_USING_TO_STRING) ? m11408a(deserializationContext) : this._byNameResolver;
            Enum<?> enumFindEnum = enumResolverM11408a.findEnum(str);
            if (enumFindEnum != null) {
                return enumFindEnum;
            }
            if (this._enumDefaultValue == null || !deserializationContext.isEnabled(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_USING_DEFAULT_VALUE)) {
                return !deserializationContext.isEnabled(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_AS_NULL) ? deserializationContext.handleWeirdKey(this._keyClass, str, "not one of the values accepted for Enum class: %s", enumResolverM11408a.getEnumIds()) : enumFindEnum;
            }
            return this._enumDefaultValue;
        }

        /* JADX INFO: renamed from: a */
        public final EnumResolver m11408a(DeserializationContext deserializationContext) {
            EnumResolver enumResolverConstructUsingToString;
            EnumResolver enumResolver = this._byToStringResolver;
            if (enumResolver != null) {
                return enumResolver;
            }
            synchronized (this) {
                enumResolverConstructUsingToString = EnumResolver.constructUsingToString(deserializationContext.getConfig(), this._byNameResolver.getEnumClass());
                this._byToStringResolver = enumResolverConstructUsingToString;
            }
            return enumResolverConstructUsingToString;
        }

        public EnumKD(EnumResolver enumResolver, AnnotatedMethod annotatedMethod) {
            super(-1, enumResolver.getEnumClass());
            this._byNameResolver = enumResolver;
            this._factory = annotatedMethod;
            this._enumDefaultValue = enumResolver.getDefaultValue();
        }
    }

    public static final class StringCtorKeyDeserializer extends StdKeyDeserializer {
        private static final long serialVersionUID = 1;
        protected final Constructor<?> _ctor;

        @Override // com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer
        public Object _parse(String str, DeserializationContext deserializationContext) throws Exception {
            return this._ctor.newInstance(str);
        }

        public StringCtorKeyDeserializer(Constructor<?> constructor) {
            super(-1, constructor.getDeclaringClass());
            this._ctor = constructor;
        }
    }

    public static final class StringFactoryKeyDeserializer extends StdKeyDeserializer {
        private static final long serialVersionUID = 1;
        final Method _factoryMethod;

        @Override // com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer
        public Object _parse(String str, DeserializationContext deserializationContext) throws Exception {
            return this._factoryMethod.invoke(null, str);
        }

        public StringFactoryKeyDeserializer(Method method) {
            super(-1, method.getDeclaringClass());
            this._factoryMethod = method;
        }
    }

    @InterfaceC42435a
    public static final class StringKD extends StdKeyDeserializer {

        /* JADX INFO: renamed from: b */
        public static final StringKD f10359b = new StringKD(String.class);

        /* JADX INFO: renamed from: c */
        public static final StringKD f10360c = new StringKD(Object.class);
        private static final long serialVersionUID = 1;

        public StringKD(Class<?> cls) {
            super(-1, cls);
        }

        public static StringKD forType(Class<?> cls) {
            if (cls == String.class) {
                return f10359b;
            }
            return cls == Object.class ? f10360c : new StringKD(cls);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer, com.fasterxml.jackson.databind.AbstractC6394i
        public Object deserializeKey(String str, DeserializationContext deserializationContext) throws IOException {
            return str;
        }
    }

    public StdKeyDeserializer(int i11, Class<?> cls) {
        this(i11, cls, null);
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6394i
    public Object deserializeKey(String str, DeserializationContext deserializationContext) throws IOException {
        if (str == null) {
            return null;
        }
        try {
            Object obj_parse = _parse(str, deserializationContext);
            if (obj_parse != null) {
                return obj_parse;
            }
            if (C6490g.m11909L(this._keyClass) && deserializationContext.getConfig().isEnabled(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_AS_NULL)) {
                return null;
            }
            return deserializationContext.handleWeirdKey(this._keyClass, str, "not a valid representation", new Object[0]);
        } catch (Exception e11) {
            return deserializationContext.handleWeirdKey(this._keyClass, str, "not a valid representation, problem: (%s) %s", e11.getClass().getName(), C6490g.m11952o(e11));
        }
    }

    public StdKeyDeserializer(int i11, Class<?> cls, FromStringDeserializer<?> fromStringDeserializer) {
        this._kind = i11;
        this._keyClass = cls;
        this._deser = fromStringDeserializer;
    }

    public static StdKeyDeserializer forType(Class<?> cls) {
        int i11;
        if (cls == String.class || cls == Object.class || cls == CharSequence.class || cls == Serializable.class) {
            return StringKD.forType(cls);
        }
        if (cls == UUID.class) {
            i11 = 12;
        } else if (cls == Integer.class) {
            i11 = 5;
        } else if (cls == Long.class) {
            i11 = 6;
        } else if (cls == Date.class) {
            i11 = 10;
        } else if (cls == Calendar.class) {
            i11 = 11;
        } else if (cls == Boolean.class) {
            i11 = 1;
        } else if (cls == Byte.class) {
            i11 = 2;
        } else if (cls == Character.class) {
            i11 = 4;
        } else if (cls == Short.class) {
            i11 = 3;
        } else if (cls == Float.class) {
            i11 = 7;
        } else if (cls == Double.class) {
            i11 = 8;
        } else if (cls == URI.class) {
            i11 = 13;
        } else if (cls == URL.class) {
            i11 = 14;
        } else if (cls == Class.class) {
            i11 = 15;
        } else {
            if (cls == Locale.class) {
                return new StdKeyDeserializer(9, cls, FromStringDeserializer.findDeserializer(Locale.class));
            }
            if (cls == Currency.class) {
                return new StdKeyDeserializer(16, cls, FromStringDeserializer.findDeserializer(Currency.class));
            }
            if (cls != byte[].class) {
                return null;
            }
            i11 = 17;
        }
        return new StdKeyDeserializer(i11, cls);
    }

    public Object _parse(String str, DeserializationContext deserializationContext) throws Exception {
        switch (this._kind) {
            case 1:
                if (CredentialEntry.TRUE_STRING.equals(str)) {
                    return Boolean.TRUE;
                }
                return CredentialEntry.FALSE_STRING.equals(str) ? Boolean.FALSE : deserializationContext.handleWeirdKey(this._keyClass, str, "value not 'true' or 'false'", new Object[0]);
            case 2:
                int i_parseInt = _parseInt(str);
                return (i_parseInt < -128 || i_parseInt > 255) ? deserializationContext.handleWeirdKey(this._keyClass, str, "overflow, value cannot be represented as 8-bit value", new Object[0]) : Byte.valueOf((byte) i_parseInt);
            case 3:
                int i_parseInt2 = _parseInt(str);
                return (i_parseInt2 < -32768 || i_parseInt2 > 32767) ? deserializationContext.handleWeirdKey(this._keyClass, str, "overflow, value cannot be represented as 16-bit value", new Object[0]) : Short.valueOf((short) i_parseInt2);
            case 4:
                return str.length() == 1 ? Character.valueOf(str.charAt(0)) : deserializationContext.handleWeirdKey(this._keyClass, str, "can only convert 1-character Strings", new Object[0]);
            case 5:
                return Integer.valueOf(_parseInt(str));
            case 6:
                return Long.valueOf(_parseLong(str));
            case 7:
                return Float.valueOf((float) _parseDouble(str));
            case 8:
                return Double.valueOf(_parseDouble(str));
            case 9:
                try {
                    return this._deser._deserialize(str, deserializationContext);
                } catch (IllegalArgumentException e11) {
                    return _weirdKey(deserializationContext, str, e11);
                }
            case 10:
                return deserializationContext.parseDate(str);
            case 11:
                return deserializationContext.constructCalendar(deserializationContext.parseDate(str));
            case 12:
                try {
                    return UUID.fromString(str);
                } catch (Exception e12) {
                    return _weirdKey(deserializationContext, str, e12);
                }
            case 13:
                try {
                    return URI.create(str);
                } catch (Exception e13) {
                    return _weirdKey(deserializationContext, str, e13);
                }
            case 14:
                try {
                    return new URL(str);
                } catch (MalformedURLException e14) {
                    return _weirdKey(deserializationContext, str, e14);
                }
            case 15:
                try {
                    return deserializationContext.findClass(str);
                } catch (Exception unused) {
                    return deserializationContext.handleWeirdKey(this._keyClass, str, "unable to parse key as Class", new Object[0]);
                }
            case 16:
                try {
                    return this._deser._deserialize(str, deserializationContext);
                } catch (IllegalArgumentException e15) {
                    return _weirdKey(deserializationContext, str, e15);
                }
            case 17:
                try {
                    return deserializationContext.getConfig().getBase64Variant().decode(str);
                } catch (IllegalArgumentException e16) {
                    return _weirdKey(deserializationContext, str, e16);
                }
            default:
                throw new IllegalStateException("Internal error: unknown key type " + this._keyClass);
        }
    }

    public Object _weirdKey(DeserializationContext deserializationContext, String str, Exception exc) throws IOException {
        return deserializationContext.handleWeirdKey(this._keyClass, str, "problem: %s", C6490g.m11952o(exc));
    }

    public Class<?> getKeyClass() {
        return this._keyClass;
    }

    public double _parseDouble(String str) throws IllegalArgumentException {
        return C6313g.m11017i(str);
    }

    public int _parseInt(String str) throws IllegalArgumentException {
        return Integer.parseInt(str);
    }

    public long _parseLong(String str) throws IllegalArgumentException {
        return Long.parseLong(str);
    }
}
