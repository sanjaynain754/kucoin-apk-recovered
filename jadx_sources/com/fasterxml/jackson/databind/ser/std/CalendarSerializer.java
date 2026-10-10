package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.AbstractC6446m;
import java.io.IOException;
import java.text.DateFormat;
import java.util.Calendar;
import p450m7.InterfaceC42435a;

/* JADX INFO: loaded from: classes45.dex */
@InterfaceC42435a
public class CalendarSerializer extends DateTimeSerializerBase<Calendar> {
    public static final CalendarSerializer instance = new CalendarSerializer();

    public CalendarSerializer() {
        this(null, null);
    }

    public CalendarSerializer(Boolean bool, DateFormat dateFormat) {
        super(Calendar.class, bool, dateFormat);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase
    public long _timestamp(Calendar calendar) {
        if (calendar == null) {
            return 0L;
        }
        return calendar.getTimeInMillis();
    }

    @Override // com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase, com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.AbstractC6393h
    public void serialize(Calendar calendar, JsonGenerator jsonGenerator, AbstractC6446m abstractC6446m) throws IOException {
        if (_asTimestamp(abstractC6446m)) {
            jsonGenerator.mo10816f0(_timestamp(calendar));
        } else {
            _serializeAsString(calendar.getTime(), jsonGenerator, abstractC6446m);
        }
    }

    @Override // com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase
    /* JADX INFO: renamed from: withFormat, reason: merged with bridge method [inline-methods] */
    public DateTimeSerializerBase<Calendar> withFormat2(Boolean bool, DateFormat dateFormat) {
        return new CalendarSerializer(bool, dateFormat);
    }
}
