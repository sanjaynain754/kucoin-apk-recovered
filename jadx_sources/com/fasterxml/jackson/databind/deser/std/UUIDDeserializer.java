package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.C6297a;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import java.io.IOException;
import java.util.Arrays;
import java.util.UUID;

/* JADX INFO: loaded from: classes45.dex */
public class UUIDDeserializer extends FromStringDeserializer<UUID> {
    static final int[] HEX_DIGITS;
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: b */
    public final UUID m11419b(byte[] bArr, DeserializationContext deserializationContext) throws JsonMappingException {
        if (bArr.length == 16) {
            return new UUID(m11417d(bArr, 0), m11417d(bArr, 8));
        }
        throw InvalidFormatException.from(deserializationContext.getParser(), "Can only construct UUIDs from byte[16]; got " + bArr.length + " bytes", bArr, handledType());
    }

    static {
        int[] iArr = new int[127];
        HEX_DIGITS = iArr;
        Arrays.fill(iArr, -1);
        for (int i11 = 0; i11 < 10; i11++) {
            HEX_DIGITS[i11 + 48] = i11;
        }
        for (int i12 = 0; i12 < 6; i12++) {
            int[] iArr2 = HEX_DIGITS;
            int i13 = i12 + 10;
            iArr2[i12 + 97] = i13;
            iArr2[i12 + 65] = i13;
        }
    }

    public UUIDDeserializer() {
        super(UUID.class);
    }

    /* JADX INFO: renamed from: c */
    public static int m11416c(byte[] bArr, int i11) {
        return (bArr[i11 + 3] & 255) | (bArr[i11] << 24) | ((bArr[i11 + 1] & 255) << 16) | ((bArr[i11 + 2] & 255) << 8);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.FromStringDeserializer
    public UUID _deserialize(String str, DeserializationContext deserializationContext) throws IOException {
        if (str.length() != 36) {
            return str.length() == 24 ? m11419b(C6297a.m10918a().decode(str), deserializationContext) : m11418a(str, deserializationContext);
        }
        if (str.charAt(8) != '-' || str.charAt(13) != '-' || str.charAt(18) != '-' || str.charAt(23) != '-') {
            m11418a(str, deserializationContext);
        }
        return new UUID((((long) intFromChars(str, 0, deserializationContext)) << 32) + ((((long) shortFromChars(str, 9, deserializationContext)) << 16) | ((long) shortFromChars(str, 14, deserializationContext))), ((((long) intFromChars(str, 28, deserializationContext)) << 32) >>> 32) | (((long) (shortFromChars(str, 24, deserializationContext) | (shortFromChars(str, 19, deserializationContext) << 16))) << 32));
    }

    @Override // com.fasterxml.jackson.databind.deser.std.FromStringDeserializer
    public UUID _deserializeEmbedded(Object obj, DeserializationContext deserializationContext) throws IOException {
        return obj instanceof byte[] ? m11419b((byte[]) obj, deserializationContext) : (UUID) super._deserializeEmbedded(obj, deserializationContext);
    }

    @Override // com.fasterxml.jackson.databind.AbstractC6390e
    public Object getEmptyValue(DeserializationContext deserializationContext) {
        return new UUID(0L, 0L);
    }

    /* JADX INFO: renamed from: d */
    public static long m11417d(byte[] bArr, int i11) {
        return ((((long) m11416c(bArr, i11 + 4)) << 32) >>> 32) | (((long) m11416c(bArr, i11)) << 32);
    }

    public int _badChar(String str, int i11, DeserializationContext deserializationContext, char c11) throws JsonMappingException {
        throw deserializationContext.weirdStringException(str, handledType(), String.format("Non-hex character '%c' (value 0x%s), not valid for UUID String", Character.valueOf(c11), Integer.toHexString(c11)));
    }

    /* JADX INFO: renamed from: a */
    public final UUID m11418a(String str, DeserializationContext deserializationContext) throws IOException {
        return (UUID) deserializationContext.handleWeirdStringValue(handledType(), str, "UUID has to be represented by standard 36-char representation", new Object[0]);
    }

    public int byteFromChars(String str, int i11, DeserializationContext deserializationContext) throws JsonMappingException {
        char cCharAt = str.charAt(i11);
        int i12 = i11 + 1;
        char cCharAt2 = str.charAt(i12);
        if (cCharAt <= 127 && cCharAt2 <= 127) {
            int[] iArr = HEX_DIGITS;
            int i13 = iArr[cCharAt2] | (iArr[cCharAt] << 4);
            if (i13 >= 0) {
                return i13;
            }
        }
        if (cCharAt <= 127 && HEX_DIGITS[cCharAt] >= 0) {
            return _badChar(str, i12, deserializationContext, cCharAt2);
        }
        return _badChar(str, i11, deserializationContext, cCharAt);
    }

    public int intFromChars(String str, int i11, DeserializationContext deserializationContext) throws JsonMappingException {
        return (byteFromChars(str, i11, deserializationContext) << 24) + (byteFromChars(str, i11 + 2, deserializationContext) << 16) + (byteFromChars(str, i11 + 4, deserializationContext) << 8) + byteFromChars(str, i11 + 6, deserializationContext);
    }

    public int shortFromChars(String str, int i11, DeserializationContext deserializationContext) throws JsonMappingException {
        return (byteFromChars(str, i11, deserializationContext) << 8) + byteFromChars(str, i11 + 2, deserializationContext);
    }
}
