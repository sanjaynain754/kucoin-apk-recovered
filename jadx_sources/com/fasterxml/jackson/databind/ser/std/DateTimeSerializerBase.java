package com.fasterxml.jackson.databind.ser.std;

import androidx.camera.view.C1454t;
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
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonValueFormat;
import com.fasterxml.jackson.databind.ser.InterfaceC6455d;
import com.fasterxml.jackson.databind.util.StdDateFormat;
import java.io.IOException;
import java.lang.reflect.Type;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;
import p528p7.InterfaceC43399e;

/* JADX INFO: loaded from: classes45.dex */
public abstract class DateTimeSerializerBase<T> extends StdScalarSerializer<T> implements InterfaceC6455d {
    protected final DateFormat _customFormat;
    protected final AtomicReference<DateFormat> _reusedCustomFormat;
    protected final Boolean _useTimestamp;

    public abstract long _timestamp(T t11);

    @Override // com.fasterxml.jackson.databind.AbstractC6393h
    public boolean isEmpty(AbstractC6446m abstractC6446m, T t11) {
        return false;
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.AbstractC6393h
    public abstract void serialize(T t11, JsonGenerator jsonGenerator, AbstractC6446m abstractC6446m) throws IOException;

    public abstract DateTimeSerializerBase<T> withFormat(Boolean bool, DateFormat dateFormat);

    public void _acceptJsonFormatVisitor(InterfaceC43399e interfaceC43399e, JavaType javaType, boolean z11) throws JsonMappingException {
        if (z11) {
            visitIntFormat(interfaceC43399e, javaType, JsonParser.NumberType.LONG, JsonValueFormat.UTC_MILLISEC);
        } else {
            visitStringFormat(interfaceC43399e, javaType, JsonValueFormat.DATE_TIME);
        }
    }

    public boolean _asTimestamp(AbstractC6446m abstractC6446m) {
        Boolean bool = this._useTimestamp;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (this._customFormat != null) {
            return false;
        }
        if (abstractC6446m != null) {
            return abstractC6446m.isEnabled(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
        }
        throw new IllegalArgumentException("Null SerializerProvider passed for " + handledType().getName());
    }

    public void _serializeAsString(Date date, JsonGenerator jsonGenerator, AbstractC6446m abstractC6446m) throws IOException {
        if (this._customFormat == null) {
            abstractC6446m.defaultSerializeDateValue(date, jsonGenerator);
            return;
        }
        DateFormat andSet = this._reusedCustomFormat.getAndSet(null);
        if (andSet == null) {
            andSet = (DateFormat) this._customFormat.clone();
        }
        jsonGenerator.mo10787C0(andSet.format(date));
        C1454t.m2255a(this._reusedCustomFormat, null, andSet);
    }

    public DateTimeSerializerBase(Class<T> cls, Boolean bool, DateFormat dateFormat) {
        AtomicReference<DateFormat> atomicReference;
        super(cls);
        this._useTimestamp = bool;
        this._customFormat = dateFormat;
        if (dateFormat == null) {
            atomicReference = null;
        } else {
            atomicReference = new AtomicReference<>();
        }
        this._reusedCustomFormat = atomicReference;
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdScalarSerializer, com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.AbstractC6393h
    public void acceptJsonFormatVisitor(InterfaceC43399e interfaceC43399e, JavaType javaType) throws JsonMappingException {
        _acceptJsonFormatVisitor(interfaceC43399e, javaType, _asTimestamp(interfaceC43399e.mo95575a()));
    }

    @Override // com.fasterxml.jackson.databind.ser.InterfaceC6455d
    public AbstractC6393h<?> createContextual(AbstractC6446m abstractC6446m, BeanProperty beanProperty) throws JsonMappingException {
        boolean z11;
        SimpleDateFormat simpleDateFormat;
        Locale locale;
        TimeZone timeZone;
        JsonFormat.Value valueFindFormatOverrides = findFormatOverrides(abstractC6446m, beanProperty, handledType());
        if (valueFindFormatOverrides != null) {
            JsonFormat.Shape shape = valueFindFormatOverrides.getShape();
            if (shape.isNumeric()) {
                return withFormat(Boolean.TRUE, null);
            }
            if (valueFindFormatOverrides.hasPattern()) {
                if (valueFindFormatOverrides.hasLocale()) {
                    locale = valueFindFormatOverrides.getLocale();
                } else {
                    locale = abstractC6446m.getLocale();
                }
                SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat(valueFindFormatOverrides.getPattern(), locale);
                if (valueFindFormatOverrides.hasTimeZone()) {
                    timeZone = valueFindFormatOverrides.getTimeZone();
                } else {
                    timeZone = abstractC6446m.getTimeZone();
                }
                simpleDateFormat2.setTimeZone(timeZone);
                return withFormat(Boolean.FALSE, simpleDateFormat2);
            }
            boolean zHasLocale = valueFindFormatOverrides.hasLocale();
            boolean zHasTimeZone = valueFindFormatOverrides.hasTimeZone();
            if (shape == JsonFormat.Shape.STRING) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (zHasLocale || zHasTimeZone || z11) {
                DateFormat dateFormat = abstractC6446m.getConfig().getDateFormat();
                if (dateFormat instanceof StdDateFormat) {
                    StdDateFormat stdDateFormatWithTimeZone = (StdDateFormat) dateFormat;
                    if (valueFindFormatOverrides.hasLocale()) {
                        stdDateFormatWithTimeZone = stdDateFormatWithTimeZone.withLocale(valueFindFormatOverrides.getLocale());
                    }
                    if (valueFindFormatOverrides.hasTimeZone()) {
                        stdDateFormatWithTimeZone = stdDateFormatWithTimeZone.withTimeZone(valueFindFormatOverrides.getTimeZone());
                    }
                    return withFormat(Boolean.FALSE, stdDateFormatWithTimeZone);
                }
                if (!(dateFormat instanceof SimpleDateFormat)) {
                    abstractC6446m.reportBadDefinition((Class<?>) handledType(), String.format("Configured `DateFormat` (%s) not a `SimpleDateFormat`; cannot configure `Locale` or `TimeZone`", dateFormat.getClass().getName()));
                }
                SimpleDateFormat simpleDateFormat3 = (SimpleDateFormat) dateFormat;
                if (zHasLocale) {
                    simpleDateFormat = new SimpleDateFormat(simpleDateFormat3.toPattern(), valueFindFormatOverrides.getLocale());
                } else {
                    simpleDateFormat = (SimpleDateFormat) simpleDateFormat3.clone();
                }
                TimeZone timeZone2 = valueFindFormatOverrides.getTimeZone();
                if (timeZone2 != null && !timeZone2.equals(simpleDateFormat.getTimeZone())) {
                    simpleDateFormat.setTimeZone(timeZone2);
                }
                return withFormat(Boolean.FALSE, simpleDateFormat);
            }
        }
        return this;
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdScalarSerializer, com.fasterxml.jackson.databind.ser.std.StdSerializer, p551q7.InterfaceC43653c
    public AbstractC6391f getSchema(AbstractC6446m abstractC6446m, Type type) {
        String str;
        if (_asTimestamp(abstractC6446m)) {
            str = "number";
        } else {
            str = TypedValues.Custom.S_STRING;
        }
        return createSchemaNode(str, true);
    }
}
