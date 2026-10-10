package com.squareup.wire;

import java.io.IOException;
import java.net.ProtocolException;

/* JADX INFO: loaded from: classes59.dex */
public enum FieldEncoding {
    VARINT(0),
    FIXED64(1),
    LENGTH_DELIMITED(2),
    FIXED32(5);

    final int value;

    /* JADX INFO: renamed from: com.squareup.wire.FieldEncoding$1 */
    public static /* synthetic */ class C278421 {
        static final /* synthetic */ int[] $SwitchMap$com$squareup$wire$FieldEncoding;

        static {
            int[] iArr = new int[FieldEncoding.values().length];
            $SwitchMap$com$squareup$wire$FieldEncoding = iArr;
            try {
                iArr[FieldEncoding.VARINT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$squareup$wire$FieldEncoding[FieldEncoding.FIXED32.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$squareup$wire$FieldEncoding[FieldEncoding.FIXED64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$squareup$wire$FieldEncoding[FieldEncoding.LENGTH_DELIMITED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static FieldEncoding get(int i11) throws IOException {
        if (i11 == 0) {
            return VARINT;
        }
        if (i11 == 1) {
            return FIXED64;
        }
        if (i11 == 2) {
            return LENGTH_DELIMITED;
        }
        if (i11 == 5) {
            return FIXED32;
        }
        throw new ProtocolException("Unexpected FieldEncoding: " + i11);
    }

    public ProtoAdapter<?> rawProtoAdapter() {
        int i11 = C278421.$SwitchMap$com$squareup$wire$FieldEncoding[ordinal()];
        if (i11 == 1) {
            return ProtoAdapter.UINT64;
        }
        if (i11 == 2) {
            return ProtoAdapter.FIXED32;
        }
        if (i11 == 3) {
            return ProtoAdapter.FIXED64;
        }
        if (i11 == 4) {
            return ProtoAdapter.BYTES;
        }
        throw new AssertionError();
    }

    FieldEncoding(int i11) {
        this.value = i11;
    }
}
