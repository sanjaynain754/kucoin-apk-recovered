package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.AbstractC6393h;
import com.fasterxml.jackson.databind.AbstractC6446m;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonValueFormat;
import com.fasterxml.jackson.databind.ser.InterfaceC6455d;
import com.fasterxml.jackson.databind.util.C6499p;
import java.io.IOException;
import java.util.Objects;
import java.util.UUID;
import p528p7.InterfaceC43399e;

/* JADX INFO: loaded from: classes45.dex */
public class UUIDSerializer extends StdScalarSerializer<UUID> implements InterfaceC6455d {
    static final char[] HEX_CHARS = "0123456789abcdef".toCharArray();
    protected final Boolean _asBinary;

    public UUIDSerializer() {
        this(null);
    }

    public UUIDSerializer(Boolean bool) {
        super(UUID.class);
        this._asBinary = bool;
    }

    /* JADX INFO: renamed from: a */
    public static final void m11841a(int i11, byte[] bArr, int i12) {
        bArr[i12] = (byte) (i11 >> 24);
        bArr[i12 + 1] = (byte) (i11 >> 16);
        bArr[i12 + 2] = (byte) (i11 >> 8);
        bArr[i12 + 3] = (byte) i11;
    }

    /* JADX INFO: renamed from: b */
    public static void m11842b(int i11, char[] cArr, int i12) {
        m11843c(i11 >> 16, cArr, i12);
        m11843c(i11, cArr, i12 + 4);
    }

    /* JADX INFO: renamed from: c */
    public static void m11843c(int i11, char[] cArr, int i12) {
        char[] cArr2 = HEX_CHARS;
        cArr[i12] = cArr2[(i11 >> 12) & 15];
        cArr[i12 + 1] = cArr2[(i11 >> 8) & 15];
        cArr[i12 + 2] = cArr2[(i11 >> 4) & 15];
        cArr[i12 + 3] = cArr2[i11 & 15];
    }

    /* JADX INFO: renamed from: d */
    public static final byte[] m11844d(UUID uuid) {
        byte[] bArr = new byte[16];
        long mostSignificantBits = uuid.getMostSignificantBits();
        long leastSignificantBits = uuid.getLeastSignificantBits();
        m11841a((int) (mostSignificantBits >> 32), bArr, 0);
        m11841a((int) mostSignificantBits, bArr, 4);
        m11841a((int) (leastSignificantBits >> 32), bArr, 8);
        m11841a((int) leastSignificantBits, bArr, 12);
        return bArr;
    }

    public boolean _writeAsBinary(JsonGenerator jsonGenerator) {
        Boolean bool = this._asBinary;
        if (bool != null) {
            return bool.booleanValue();
        }
        return !(jsonGenerator instanceof C6499p) && jsonGenerator.mo10823j();
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdScalarSerializer, com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.AbstractC6393h
    public void acceptJsonFormatVisitor(InterfaceC43399e interfaceC43399e, JavaType javaType) throws JsonMappingException {
        visitStringFormat(interfaceC43399e, javaType, JsonValueFormat.UUID);
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6393h
    public boolean isEmpty(AbstractC6446m abstractC6446m, UUID uuid) {
        return uuid.getLeastSignificantBits() == 0 && uuid.getMostSignificantBits() == 0;
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.AbstractC6393h
    public void serialize(UUID uuid, JsonGenerator jsonGenerator, AbstractC6446m abstractC6446m) throws IOException {
        if (_writeAsBinary(jsonGenerator)) {
            jsonGenerator.m10801S(m11844d(uuid));
            return;
        }
        char[] cArr = new char[36];
        long mostSignificantBits = uuid.getMostSignificantBits();
        m11842b((int) (mostSignificantBits >> 32), cArr, 0);
        cArr[8] = '-';
        int i11 = (int) mostSignificantBits;
        m11843c(i11 >>> 16, cArr, 9);
        cArr[13] = '-';
        m11843c(i11, cArr, 14);
        cArr[18] = '-';
        long leastSignificantBits = uuid.getLeastSignificantBits();
        m11843c((int) (leastSignificantBits >>> 48), cArr, 19);
        cArr[23] = '-';
        m11843c((int) (leastSignificantBits >>> 32), cArr, 24);
        m11842b((int) leastSignificantBits, cArr, 28);
        jsonGenerator.mo10788D0(cArr, 0, 36);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001c  */
    @Override // com.fasterxml.jackson.databind.ser.InterfaceC6455d
    public AbstractC6393h<?> createContextual(AbstractC6446m abstractC6446m, BeanProperty beanProperty) throws JsonMappingException {
        Boolean bool;
        JsonFormat.Value valueFindFormatOverrides = findFormatOverrides(abstractC6446m, beanProperty, handledType());
        if (valueFindFormatOverrides != null) {
            JsonFormat.Shape shape = valueFindFormatOverrides.getShape();
            if (shape == JsonFormat.Shape.BINARY) {
                bool = Boolean.TRUE;
            } else if (shape == JsonFormat.Shape.STRING) {
                bool = Boolean.FALSE;
            } else {
                bool = null;
            }
        } else {
            bool = null;
        }
        if (!Objects.equals(bool, this._asBinary)) {
            return new UUIDSerializer(bool);
        }
        return this;
    }
}
