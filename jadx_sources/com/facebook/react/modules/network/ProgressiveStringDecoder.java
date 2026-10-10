package com.facebook.react.modules.network;

import com.facebook.react.common.ReactConstants;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import p747x3.C45999a;

/* JADX INFO: loaded from: classes45.dex */
class ProgressiveStringDecoder {
    private static final String EMPTY_STRING = "";
    private final CharsetDecoder mDecoder;
    private byte[] remainder = null;

    public String decodeNext(byte[] bArr, int i11) {
        byte[] bArr2 = this.remainder;
        if (bArr2 != null) {
            byte[] bArr3 = new byte[bArr2.length + i11];
            System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
            System.arraycopy(bArr, 0, bArr3, this.remainder.length, i11);
            i11 += this.remainder.length;
            bArr = bArr3;
        }
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr, 0, i11);
        boolean z11 = false;
        int i12 = 0;
        CharBuffer charBufferDecode = null;
        while (!z11 && i12 < 4) {
            try {
                charBufferDecode = this.mDecoder.decode(byteBufferWrap);
                z11 = true;
            } catch (CharacterCodingException unused) {
                i12++;
                byteBufferWrap = ByteBuffer.wrap(bArr, 0, i11 - i12);
            }
        }
        if (!z11 || i12 <= 0) {
            this.remainder = null;
        } else {
            byte[] bArr4 = new byte[i12];
            this.remainder = bArr4;
            System.arraycopy(bArr, i11 - i12, bArr4, 0, i12);
        }
        if (z11) {
            return new String(charBufferDecode.array(), 0, charBufferDecode.length());
        }
        C45999a.m101488I(ReactConstants.TAG, "failed to decode string from byte array");
        return "";
    }

    public ProgressiveStringDecoder(Charset charset) {
        this.mDecoder = charset.newDecoder();
    }
}
