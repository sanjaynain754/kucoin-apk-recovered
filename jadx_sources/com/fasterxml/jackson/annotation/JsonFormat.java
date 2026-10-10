package com.fasterxml.jackson.annotation;

import java.io.Serializable;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes45.dex */
@Target({ElementType.ANNOTATION_TYPE, ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface JsonFormat {

    public enum Feature {
        ACCEPT_SINGLE_VALUE_AS_ARRAY,
        ACCEPT_CASE_INSENSITIVE_PROPERTIES,
        ACCEPT_CASE_INSENSITIVE_VALUES,
        WRITE_DATE_TIMESTAMPS_AS_NANOSECONDS,
        WRITE_DATES_WITH_ZONE_ID,
        WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED,
        WRITE_SORTED_MAP_ENTRIES,
        ADJUST_DATES_TO_CONTEXT_TIME_ZONE
    }

    public enum Shape {
        ANY,
        NATURAL,
        SCALAR,
        ARRAY,
        OBJECT,
        NUMBER,
        NUMBER_FLOAT,
        NUMBER_INT,
        STRING,
        BOOLEAN,
        BINARY;

        public boolean isNumeric() {
            return this == NUMBER || this == NUMBER_INT || this == NUMBER_FLOAT;
        }

        public boolean isStructured() {
            return this == OBJECT || this == ARRAY;
        }
    }

    public static class Value implements Serializable {

        /* JADX INFO: renamed from: c */
        public static final Value f10000c = new Value();
        private static final long serialVersionUID = 1;
        private final C6264a _features;
        private final Boolean _lenient;
        private final Locale _locale;
        private final String _pattern;
        private final Shape _shape;
        private final String _timezoneStr;

        /* JADX INFO: renamed from: b */
        public transient TimeZone f10001b;

        public Value() {
            this("", Shape.ANY, "", "", C6264a.m10766c(), (Boolean) null);
        }

        /* JADX INFO: renamed from: a */
        public static <T> boolean m10763a(T t11, T t12) {
            if (t11 == null) {
                return t12 == null;
            }
            if (t12 == null) {
                return false;
            }
            return t11.equals(t12);
        }

        public static Value mergeAll(Value... valueArr) {
            Value value = null;
            for (Value valueWithOverrides : valueArr) {
                if (valueWithOverrides != null) {
                    if (value != null) {
                        valueWithOverrides = value.withOverrides(valueWithOverrides);
                    }
                    value = valueWithOverrides;
                }
            }
            return value;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj == null || obj.getClass() != getClass()) {
                return false;
            }
            Value value = (Value) obj;
            return this._shape == value._shape && this._features.equals(value._features) && m10763a(this._lenient, value._lenient) && m10763a(this._timezoneStr, value._timezoneStr) && m10763a(this._pattern, value._pattern) && m10763a(this.f10001b, value.f10001b) && m10763a(this._locale, value._locale);
        }

        public Value(JsonFormat jsonFormat) {
            this(jsonFormat.pattern(), jsonFormat.shape(), jsonFormat.locale(), jsonFormat.timezone(), C6264a.m10764a(jsonFormat), jsonFormat.lenient().asBoolean());
        }

        public static final Value empty() {
            return f10000c;
        }

        public static Value forLeniency(boolean z11) {
            return new Value("", null, null, null, null, C6264a.m10766c(), Boolean.valueOf(z11));
        }

        public static Value forPattern(String str) {
            return new Value(str, null, null, null, null, C6264a.m10766c(), null);
        }

        public static Value forShape(Shape shape) {
            return new Value("", shape, null, null, null, C6264a.m10766c(), null);
        }

        public static final Value from(JsonFormat jsonFormat) {
            return jsonFormat == null ? f10000c : new Value(jsonFormat);
        }

        public static Value merge(Value value, Value value2) {
            return value == null ? value2 : value.withOverrides(value2);
        }

        public Boolean getFeature(Feature feature) {
            return this._features.m10767d(feature);
        }

        public C6264a getFeatures() {
            return this._features;
        }

        public Boolean getLenient() {
            return this._lenient;
        }

        public Locale getLocale() {
            return this._locale;
        }

        public String getPattern() {
            return this._pattern;
        }

        public Shape getShape() {
            return this._shape;
        }

        public TimeZone getTimeZone() {
            TimeZone timeZone = this.f10001b;
            if (timeZone != null) {
                return timeZone;
            }
            String str = this._timezoneStr;
            if (str == null) {
                return null;
            }
            TimeZone timeZone2 = TimeZone.getTimeZone(str);
            this.f10001b = timeZone2;
            return timeZone2;
        }

        public boolean hasLenient() {
            return this._lenient != null;
        }

        public boolean hasLocale() {
            return this._locale != null;
        }

        public boolean hasPattern() {
            String str = this._pattern;
            return str != null && str.length() > 0;
        }

        public boolean hasShape() {
            return this._shape != Shape.ANY;
        }

        public boolean hasTimeZone() {
            if (this.f10001b != null) {
                return true;
            }
            String str = this._timezoneStr;
            return (str == null || str.isEmpty()) ? false : true;
        }

        public int hashCode() {
            String str = this._timezoneStr;
            int iHashCode = str == null ? 1 : str.hashCode();
            String str2 = this._pattern;
            if (str2 != null) {
                iHashCode ^= str2.hashCode();
            }
            int iHashCode2 = iHashCode + this._shape.hashCode();
            Boolean bool = this._lenient;
            if (bool != null) {
                iHashCode2 ^= bool.hashCode();
            }
            Locale locale = this._locale;
            if (locale != null) {
                iHashCode2 += locale.hashCode();
            }
            return iHashCode2 ^ this._features.hashCode();
        }

        public boolean isLenient() {
            return Boolean.TRUE.equals(this._lenient);
        }

        public String timeZoneAsString() {
            TimeZone timeZone = this.f10001b;
            return timeZone != null ? timeZone.getID() : this._timezoneStr;
        }

        public String toString() {
            return String.format("JsonFormat.Value(pattern=%s,shape=%s,lenient=%s,locale=%s,timezone=%s,features=%s)", this._pattern, this._shape, this._lenient, this._locale, this._timezoneStr, this._features);
        }

        public Class<JsonFormat> valueFor() {
            return JsonFormat.class;
        }

        public Value withFeature(Feature feature) {
            C6264a c6264aM10768e = this._features.m10768e(feature);
            return c6264aM10768e == this._features ? this : new Value(this._pattern, this._shape, this._locale, this._timezoneStr, this.f10001b, c6264aM10768e, this._lenient);
        }

        public Value withLenient(Boolean bool) {
            return bool == this._lenient ? this : new Value(this._pattern, this._shape, this._locale, this._timezoneStr, this.f10001b, this._features, bool);
        }

        public Value withLocale(Locale locale) {
            return new Value(this._pattern, this._shape, locale, this._timezoneStr, this.f10001b, this._features, this._lenient);
        }

        public final Value withOverrides(Value value) {
            Value value2;
            TimeZone timeZone;
            if (value == null || value == (value2 = f10000c) || value == this) {
                return this;
            }
            if (this == value2) {
                return value;
            }
            String str = value._pattern;
            if (str == null || str.isEmpty()) {
                str = this._pattern;
            }
            String str2 = str;
            Shape shape = value._shape;
            if (shape == Shape.ANY) {
                shape = this._shape;
            }
            Shape shape2 = shape;
            Locale locale = value._locale;
            if (locale == null) {
                locale = this._locale;
            }
            Locale locale2 = locale;
            C6264a c6264a = this._features;
            C6264a c6264aM10769f = c6264a == null ? value._features : c6264a.m10769f(value._features);
            Boolean bool = value._lenient;
            if (bool == null) {
                bool = this._lenient;
            }
            Boolean bool2 = bool;
            String str3 = value._timezoneStr;
            if (str3 == null || str3.isEmpty()) {
                str3 = this._timezoneStr;
                timeZone = this.f10001b;
            } else {
                timeZone = value.f10001b;
            }
            return new Value(str2, shape2, locale2, str3, timeZone, c6264aM10769f, bool2);
        }

        public Value withPattern(String str) {
            return new Value(str, this._shape, this._locale, this._timezoneStr, this.f10001b, this._features, this._lenient);
        }

        public Value withShape(Shape shape) {
            return shape == this._shape ? this : new Value(this._pattern, shape, this._locale, this._timezoneStr, this.f10001b, this._features, this._lenient);
        }

        public Value withTimeZone(TimeZone timeZone) {
            return new Value(this._pattern, this._shape, this._locale, null, timeZone, this._features, this._lenient);
        }

        public Value withoutFeature(Feature feature) {
            C6264a c6264aM10770g = this._features.m10770g(feature);
            return c6264aM10770g == this._features ? this : new Value(this._pattern, this._shape, this._locale, this._timezoneStr, this.f10001b, c6264aM10770g, this._lenient);
        }

        public Value(String str, Shape shape, String str2, String str3, C6264a c6264a, Boolean bool) {
            this(str, shape, (str2 == null || str2.length() == 0 || "##default".equals(str2)) ? null : new Locale(str2), (str3 == null || str3.length() == 0 || "##default".equals(str3)) ? null : str3, null, c6264a, bool);
        }

        public Value(String str, Shape shape, Locale locale, TimeZone timeZone, C6264a c6264a, Boolean bool) {
            this._pattern = str == null ? "" : str;
            this._shape = shape == null ? Shape.ANY : shape;
            this._locale = locale;
            this.f10001b = timeZone;
            this._timezoneStr = null;
            this._features = c6264a == null ? C6264a.m10766c() : c6264a;
            this._lenient = bool;
        }

        public Value(String str, Shape shape, Locale locale, String str2, TimeZone timeZone, C6264a c6264a, Boolean bool) {
            this._pattern = str == null ? "" : str;
            this._shape = shape == null ? Shape.ANY : shape;
            this._locale = locale;
            this.f10001b = timeZone;
            this._timezoneStr = str2;
            this._features = c6264a == null ? C6264a.m10766c() : c6264a;
            this._lenient = bool;
        }

        @Deprecated
        public Value(String str, Shape shape, Locale locale, String str2, TimeZone timeZone, C6264a c6264a) {
            this(str, shape, locale, str2, timeZone, c6264a, null);
        }

        @Deprecated
        public Value(String str, Shape shape, String str2, String str3, C6264a c6264a) {
            this(str, shape, str2, str3, c6264a, (Boolean) null);
        }

        @Deprecated
        public Value(String str, Shape shape, Locale locale, TimeZone timeZone, C6264a c6264a) {
            this(str, shape, locale, timeZone, c6264a, (Boolean) null);
        }
    }

    /* JADX INFO: renamed from: com.fasterxml.jackson.annotation.JsonFormat$a */
    public static class C6264a {

        /* JADX INFO: renamed from: c */
        public static final C6264a f10002c = new C6264a(0, 0);

        /* JADX INFO: renamed from: a */
        public final int f10003a;

        /* JADX INFO: renamed from: b */
        public final int f10004b;

        /* JADX INFO: renamed from: b */
        public static C6264a m10765b(Feature[] featureArr, Feature[] featureArr2) {
            int iOrdinal = 0;
            for (Feature feature : featureArr) {
                iOrdinal |= 1 << feature.ordinal();
            }
            int iOrdinal2 = 0;
            for (Feature feature2 : featureArr2) {
                iOrdinal2 |= 1 << feature2.ordinal();
            }
            return new C6264a(iOrdinal, iOrdinal2);
        }

        /* JADX INFO: renamed from: d */
        public Boolean m10767d(Feature feature) {
            int iOrdinal = 1 << feature.ordinal();
            if ((this.f10004b & iOrdinal) != 0) {
                return Boolean.FALSE;
            }
            if ((iOrdinal & this.f10003a) != 0) {
                return Boolean.TRUE;
            }
            return null;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj == null || obj.getClass() != getClass()) {
                return false;
            }
            C6264a c6264a = (C6264a) obj;
            return c6264a.f10003a == this.f10003a && c6264a.f10004b == this.f10004b;
        }

        /* JADX INFO: renamed from: c */
        public static C6264a m10766c() {
            return f10002c;
        }

        /* JADX INFO: renamed from: e */
        public C6264a m10768e(Feature... featureArr) {
            int iOrdinal = this.f10003a;
            for (Feature feature : featureArr) {
                iOrdinal |= 1 << feature.ordinal();
            }
            return iOrdinal == this.f10003a ? this : new C6264a(iOrdinal, this.f10004b);
        }

        /* JADX INFO: renamed from: f */
        public C6264a m10769f(C6264a c6264a) {
            if (c6264a != null) {
                int i11 = c6264a.f10004b;
                int i12 = c6264a.f10003a;
                if (i11 != 0 || i12 != 0) {
                    int i13 = this.f10003a;
                    if (i13 == 0 && this.f10004b == 0) {
                        return c6264a;
                    }
                    int i14 = ((~i11) & i13) | i12;
                    int i15 = this.f10004b;
                    int i16 = i11 | ((~i12) & i15);
                    if (i14 != i13 || i16 != i15) {
                        return new C6264a(i14, i16);
                    }
                }
            }
            return this;
        }

        /* JADX INFO: renamed from: g */
        public C6264a m10770g(Feature... featureArr) {
            int iOrdinal = this.f10004b;
            for (Feature feature : featureArr) {
                iOrdinal |= 1 << feature.ordinal();
            }
            return iOrdinal == this.f10004b ? this : new C6264a(this.f10003a, iOrdinal);
        }

        public int hashCode() {
            return this.f10004b + this.f10003a;
        }

        public String toString() {
            return this == f10002c ? "EMPTY" : String.format("(enabled=0x%x,disabled=0x%x)", Integer.valueOf(this.f10003a), Integer.valueOf(this.f10004b));
        }

        public C6264a(int i11, int i12) {
            this.f10003a = i11;
            this.f10004b = i12;
        }

        /* JADX INFO: renamed from: a */
        public static C6264a m10764a(JsonFormat jsonFormat) {
            return m10765b(jsonFormat.with(), jsonFormat.without());
        }
    }

    OptBoolean lenient() default OptBoolean.DEFAULT;

    String locale() default "##default";

    String pattern() default "";

    Shape shape() default Shape.ANY;

    String timezone() default "##default";

    Feature[] with() default {};

    Feature[] without() default {};
}
