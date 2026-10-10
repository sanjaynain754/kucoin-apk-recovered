package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.AbstractC6390e;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.cfg.CoercionAction;
import com.fasterxml.jackson.databind.deser.InterfaceC6358c;
import com.fasterxml.jackson.databind.type.LogicalType;
import com.fasterxml.jackson.databind.util.C6490g;
import com.fasterxml.jackson.databind.util.StdDateFormat;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.Locale;
import java.util.TimeZone;
import p450m7.InterfaceC42435a;

/* JADX INFO: loaded from: classes45.dex */
public class DateDeserializers {

    /* JADX INFO: renamed from: a */
    public static final HashSet<String> f10344a;

    @InterfaceC42435a
    public static class CalendarDeserializer extends DateBasedDeserializer<Calendar> {
        protected final Constructor<Calendar> _defaultCtor;

        public CalendarDeserializer() {
            super(Calendar.class);
            this._defaultCtor = null;
        }

        @Override // com.fasterxml.jackson.databind.AbstractC6390e
        public Calendar deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            Date date_parseDate = _parseDate(jsonParser, deserializationContext);
            if (date_parseDate == null) {
                return null;
            }
            Constructor<Calendar> constructor = this._defaultCtor;
            if (constructor == null) {
                return deserializationContext.constructCalendar(date_parseDate);
            }
            try {
                Calendar calendarNewInstance = constructor.newInstance(new Object[0]);
                calendarNewInstance.setTimeInMillis(date_parseDate.getTime());
                TimeZone timeZone = deserializationContext.getTimeZone();
                if (timeZone == null) {
                    return calendarNewInstance;
                }
                calendarNewInstance.setTimeZone(timeZone);
                return calendarNewInstance;
            } catch (Exception e11) {
                return (Calendar) deserializationContext.handleInstantiationProblem(handledType(), date_parseDate, e11);
            }
        }

        @Override // com.fasterxml.jackson.databind.AbstractC6390e
        public Object getEmptyValue(DeserializationContext deserializationContext) {
            GregorianCalendar gregorianCalendar = new GregorianCalendar();
            gregorianCalendar.setTimeInMillis(0L);
            return gregorianCalendar;
        }

        @Override // com.fasterxml.jackson.databind.deser.std.DateDeserializers.DateBasedDeserializer
        /* JADX INFO: renamed from: withDateFormat, reason: merged with bridge method [inline-methods] */
        public DateBasedDeserializer<Calendar> withDateFormat2(DateFormat dateFormat, String str) {
            return new CalendarDeserializer(this, dateFormat, str);
        }

        public CalendarDeserializer(Class<? extends Calendar> cls) {
            super(cls);
            this._defaultCtor = C6490g.m11955q(cls, false);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.DateDeserializers.DateBasedDeserializer, com.fasterxml.jackson.databind.deser.InterfaceC6358c
        public /* bridge */ /* synthetic */ AbstractC6390e createContextual(DeserializationContext deserializationContext, BeanProperty beanProperty) throws JsonMappingException {
            return super.createContextual(deserializationContext, beanProperty);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.DateDeserializers.DateBasedDeserializer, com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer, com.fasterxml.jackson.databind.AbstractC6390e
        public /* bridge */ /* synthetic */ LogicalType logicalType() {
            return super.logicalType();
        }

        public CalendarDeserializer(CalendarDeserializer calendarDeserializer, DateFormat dateFormat, String str) {
            super(calendarDeserializer, dateFormat, str);
            this._defaultCtor = calendarDeserializer._defaultCtor;
        }
    }

    public static abstract class DateBasedDeserializer<T> extends StdScalarDeserializer<T> implements InterfaceC6358c {
        protected final DateFormat _customFormat;
        protected final String _formatString;

        public DateBasedDeserializer(Class<?> cls) {
            super(cls);
            this._customFormat = null;
            this._formatString = null;
        }

        /* JADX INFO: renamed from: withDateFormat */
        public abstract DateBasedDeserializer<T> withDateFormat2(DateFormat dateFormat, String str);

        @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer
        public Date _parseDate(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            Date date;
            if (this._customFormat == null || !jsonParser.mo10890k0(JsonToken.VALUE_STRING)) {
                return super._parseDate(jsonParser, deserializationContext);
            }
            String strTrim = jsonParser.mo10869W().trim();
            if (strTrim.isEmpty()) {
                if (C6382a.f10345a[_checkFromStringCoercion(deserializationContext, strTrim).ordinal()] != 1) {
                    return null;
                }
                return new Date(0L);
            }
            synchronized (this._customFormat) {
                try {
                    try {
                        date = this._customFormat.parse(strTrim);
                    } catch (ParseException unused) {
                        return (Date) deserializationContext.handleWeirdStringValue(handledType(), strTrim, "expected format \"%s\"", this._formatString);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return date;
        }

        @Override // com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer, com.fasterxml.jackson.databind.AbstractC6390e
        public LogicalType logicalType() {
            return LogicalType.DateTime;
        }

        public AbstractC6390e<?> createContextual(DeserializationContext deserializationContext, BeanProperty beanProperty) throws JsonMappingException {
            DateFormat dateFormat;
            DateFormat dateFormat2;
            StdDateFormat stdDateFormatWithLenient;
            DateFormat dateFormat3;
            DateFormat dateFormatWithLenient;
            Locale locale;
            Locale locale2;
            JsonFormat.Value valueFindFormatOverrides = findFormatOverrides(deserializationContext, beanProperty, handledType());
            if (valueFindFormatOverrides != null) {
                TimeZone timeZone = valueFindFormatOverrides.getTimeZone();
                Boolean lenient = valueFindFormatOverrides.getLenient();
                if (valueFindFormatOverrides.hasPattern()) {
                    String pattern = valueFindFormatOverrides.getPattern();
                    if (valueFindFormatOverrides.hasLocale()) {
                        locale2 = valueFindFormatOverrides.getLocale();
                    } else {
                        locale2 = deserializationContext.getLocale();
                    }
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern, locale2);
                    if (timeZone == null) {
                        timeZone = deserializationContext.getTimeZone();
                    }
                    simpleDateFormat.setTimeZone(timeZone);
                    if (lenient != null) {
                        simpleDateFormat.setLenient(lenient.booleanValue());
                    }
                    return withDateFormat2(simpleDateFormat, pattern);
                }
                if (timeZone != null) {
                    DateFormat dateFormat4 = deserializationContext.getConfig().getDateFormat();
                    if (dateFormat4.getClass() == StdDateFormat.class) {
                        if (valueFindFormatOverrides.hasLocale()) {
                            locale = valueFindFormatOverrides.getLocale();
                        } else {
                            locale = deserializationContext.getLocale();
                        }
                        StdDateFormat stdDateFormatWithLocale = ((StdDateFormat) dateFormat4).withTimeZone(timeZone).withLocale(locale);
                        dateFormatWithLenient = stdDateFormatWithLocale;
                        if (lenient != null) {
                            dateFormatWithLenient = stdDateFormatWithLocale.withLenient(lenient);
                        }
                    } else {
                        dateFormat3 = (DateFormat) dateFormat4.clone();
                        dateFormat3.setTimeZone(timeZone);
                        if (lenient != null) {
                            dateFormatWithLenient = dateFormat3;
                            dateFormat3.setLenient(lenient.booleanValue());
                            dateFormatWithLenient = dateFormat3;
                        }
                    }
                    dateFormatWithLenient = dateFormat3;
                    return withDateFormat2(dateFormatWithLenient, this._formatString);
                }
                if (lenient != null) {
                    DateFormat dateFormat5 = deserializationContext.getConfig().getDateFormat();
                    String pattern2 = this._formatString;
                    if (dateFormat5.getClass() == StdDateFormat.class) {
                        stdDateFormatWithLenient = ((StdDateFormat) dateFormat5).withLenient(lenient);
                        pattern2 = stdDateFormatWithLenient.toPattern();
                    } else {
                        dateFormat = (DateFormat) dateFormat5.clone();
                        dateFormat.setLenient(lenient.booleanValue());
                        if (dateFormat instanceof SimpleDateFormat) {
                            dateFormat2 = dateFormat;
                            ((SimpleDateFormat) dateFormat).toPattern();
                            dateFormat2 = dateFormat;
                        }
                    }
                    if (pattern2 == null) {
                        dateFormat2 = stdDateFormatWithLenient;
                        pattern2 = "[unknown]";
                    }
                    dateFormat2 = stdDateFormatWithLenient;
                    return withDateFormat2(dateFormat2, pattern2);
                }
            }
            return this;
        }

        public DateBasedDeserializer(DateBasedDeserializer<T> dateBasedDeserializer, DateFormat dateFormat, String str) {
            super(dateBasedDeserializer._valueClass);
            this._customFormat = dateFormat;
            this._formatString = str;
        }
    }

    @InterfaceC42435a
    public static class DateDeserializer extends DateBasedDeserializer<Date> {
        public static final DateDeserializer instance = new DateDeserializer();

        public DateDeserializer() {
            super(Date.class);
        }

        public DateDeserializer(DateDeserializer dateDeserializer, DateFormat dateFormat, String str) {
            super(dateDeserializer, dateFormat, str);
        }

        @Override // com.fasterxml.jackson.databind.AbstractC6390e
        public Date deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            return _parseDate(jsonParser, deserializationContext);
        }

        @Override // com.fasterxml.jackson.databind.AbstractC6390e
        public Object getEmptyValue(DeserializationContext deserializationContext) {
            return new Date(0L);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.DateDeserializers.DateBasedDeserializer
        /* JADX INFO: renamed from: withDateFormat, reason: avoid collision after fix types in other method */
        public DateBasedDeserializer<Date> withDateFormat2(DateFormat dateFormat, String str) {
            return new DateDeserializer(this, dateFormat, str);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.DateDeserializers.DateBasedDeserializer, com.fasterxml.jackson.databind.deser.InterfaceC6358c
        public /* bridge */ /* synthetic */ AbstractC6390e createContextual(DeserializationContext deserializationContext, BeanProperty beanProperty) throws JsonMappingException {
            return super.createContextual(deserializationContext, beanProperty);
        }

        @Override // com.fasterxml.jackson.databind.deser.std.DateDeserializers.DateBasedDeserializer, com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer, com.fasterxml.jackson.databind.AbstractC6390e
        public /* bridge */ /* synthetic */ LogicalType logicalType() {
            return super.logicalType();
        }
    }

    /* JADX INFO: renamed from: com.fasterxml.jackson.databind.deser.std.DateDeserializers$a */
    public static /* synthetic */ class C6382a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f10345a;

        static {
            int[] iArr = new int[CoercionAction.values().length];
            f10345a = iArr;
            try {
                iArr[CoercionAction.AsEmpty.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10345a[CoercionAction.AsNull.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f10345a[CoercionAction.TryConvert.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static {
        HashSet<String> hashSet = new HashSet<>();
        f10344a = hashSet;
        hashSet.add("java.util.Calendar");
        hashSet.add("java.util.GregorianCalendar");
        hashSet.add("java.util.Date");
    }

    /* JADX INFO: renamed from: a */
    public static AbstractC6390e<?> m11393a(Class<?> cls, String str) {
        if (!f10344a.contains(str)) {
            return null;
        }
        if (cls == Calendar.class) {
            return new CalendarDeserializer();
        }
        if (cls == Date.class) {
            return DateDeserializer.instance;
        }
        if (cls == GregorianCalendar.class) {
            return new CalendarDeserializer(GregorianCalendar.class);
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m11394b(Class<?> cls) {
        return f10344a.contains(cls.getName());
    }
}
