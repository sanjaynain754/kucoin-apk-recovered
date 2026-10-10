package com.google.zxing.aztec.encoder;

import com.google.zxing.common.BitArray;
import p852kotlin.text.Typography;

/* JADX INFO: loaded from: classes56.dex */
final class SimpleToken extends Token {
    private final short bitCount;
    private final short value;

    @Override // com.google.zxing.aztec.encoder.Token
    public void appendTo(BitArray bitArray, byte[] bArr) {
        bitArray.appendBits(this.value, this.bitCount);
    }

    public String toString() {
        short s11 = this.value;
        short s12 = this.bitCount;
        return "<" + Integer.toBinaryString((s11 & ((1 << s12) - 1)) | (1 << s12) | (1 << this.bitCount)).substring(1) + Typography.greater;
    }

    public SimpleToken(Token token, int i11, int i12) {
        super(token);
        this.value = (short) i11;
        this.bitCount = (short) i12;
    }
}
