package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.AbstractC6446m;
import java.io.IOException;
import java.text.DateFormat;
import java.util.Date;
import p450m7.InterfaceC42435a;

/* JADX INFO: loaded from: classes45.dex */
@InterfaceC42435a
public class DateSerializer extends DateTimeSerializerBase<Date> {
    public static final DateSerializer instance = new DateSerializer();

    public DateSerializer() {
        this(null, null);
    }

    public DateSerializer(Boolean bool, DateFormat dateFormat) {
        super(Date.class, bool, dateFormat);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase
    public long _timestamp(Date date) {
        if (date == null) {
            return 0L;
        }
        return date.getTime();
    }

    @Override // com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase, com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.AbstractC6393h
    public void serialize(Date date, JsonGenerator jsonGenerator, AbstractC6446m abstractC6446m) throws IOException {
        if (_asTimestamp(abstractC6446m)) {
            jsonGenerator.mo10816f0(_timestamp(date));
        } else {
            _serializeAsString(date, jsonGenerator, abstractC6446m);
        }
    }

    @Override // com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase
    /* JADX INFO: renamed from: withFormat */
    public DateTimeSerializerBase<Date> withFormat2(Boolean bool, DateFormat dateFormat) {
        return new DateSerializer(bool, dateFormat);
    }
}
