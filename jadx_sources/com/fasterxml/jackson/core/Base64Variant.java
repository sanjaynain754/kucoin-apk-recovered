package com.fasterxml.jackson.core;

import com.fasterxml.jackson.core.util.C6324c;
import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes45.dex */
public final class Base64Variant implements Serializable {
    public static final int BASE64_VALUE_INVALID = -1;
    public static final int BASE64_VALUE_PADDING = -2;
    protected static final char PADDING_CHAR_NONE = 0;
    private static final long serialVersionUID = 1;
    private final int _maxLineLength;
    final String _name;
    private final char _paddingChar;
    private final PaddingReadBehaviour _paddingReadBehaviour;
    private final boolean _writePadding;

    /* JADX INFO: renamed from: b */
    public final transient int[] f10013b;

    /* JADX INFO: renamed from: c */
    public final transient char[] f10014c;

    /* JADX INFO: renamed from: d */
    public final transient byte[] f10015d;

    public enum PaddingReadBehaviour {
        PADDING_FORBIDDEN,
        PADDING_REQUIRED,
        PADDING_ALLOWED
    }

    public Base64Variant(String str, String str2, boolean z11, char c11, int i11) {
        int[] iArr = new int[128];
        this.f10013b = iArr;
        char[] cArr = new char[64];
        this.f10014c = cArr;
        this.f10015d = new byte[64];
        this._name = str;
        this._writePadding = z11;
        this._paddingChar = c11;
        this._maxLineLength = i11;
        int length = str2.length();
        if (length != 64) {
            throw new IllegalArgumentException("Base64Alphabet length must be exactly 64 (was " + length + ")");
        }
        str2.getChars(0, length, cArr, 0);
        Arrays.fill(iArr, -1);
        for (int i12 = 0; i12 < length; i12++) {
            char c12 = this.f10014c[i12];
            this.f10015d[i12] = (byte) c12;
            this.f10013b[c12] = i12;
        }
        if (z11) {
            this.f10013b[c11] = -2;
        }
        this._paddingReadBehaviour = z11 ? PaddingReadBehaviour.PADDING_REQUIRED : PaddingReadBehaviour.PADDING_FORBIDDEN;
    }

    public byte[] decode(String str) throws IllegalArgumentException {
        C6324c c6324c = new C6324c();
        decode(str, c6324c);
        return c6324c.m11079q();
    }

    public int decodeBase64Char(char c11) {
        if (c11 <= 127) {
            return this.f10013b[c11];
        }
        return -1;
    }

    public String encode(byte[] bArr) {
        return encode(bArr, false);
    }

    public int encodeBase64Chunk(int i11, char[] cArr, int i12) {
        char[] cArr2 = this.f10014c;
        cArr[i12] = cArr2[(i11 >> 18) & 63];
        cArr[i12 + 1] = cArr2[(i11 >> 12) & 63];
        int i13 = i12 + 3;
        cArr[i12 + 2] = cArr2[(i11 >> 6) & 63];
        int i14 = i12 + 4;
        cArr[i13] = cArr2[i11 & 63];
        return i14;
    }

    public int encodeBase64Partial(int i11, int i12, char[] cArr, int i13) {
        char[] cArr2 = this.f10014c;
        cArr[i13] = cArr2[(i11 >> 18) & 63];
        int i14 = i13 + 2;
        cArr[i13 + 1] = cArr2[(i11 >> 12) & 63];
        if (usesPadding()) {
            int i15 = i13 + 3;
            cArr[i14] = i12 == 2 ? this.f10014c[(i11 >> 6) & 63] : this._paddingChar;
            int i16 = i13 + 4;
            cArr[i15] = this._paddingChar;
            return i16;
        }
        if (i12 != 2) {
            return i14;
        }
        int i17 = i13 + 3;
        cArr[i14] = this.f10014c[(i11 >> 6) & 63];
        return i17;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && obj.getClass() == Base64Variant.class) {
            Base64Variant base64Variant = (Base64Variant) obj;
            if (base64Variant._paddingChar == this._paddingChar && base64Variant._maxLineLength == this._maxLineLength && base64Variant._writePadding == this._writePadding && base64Variant._paddingReadBehaviour == this._paddingReadBehaviour && this._name.equals(base64Variant._name)) {
                return true;
            }
        }
        return false;
    }

    public boolean usesPaddingChar(char c11) {
        return c11 == this._paddingChar;
    }

    public void _reportBase64EOF() throws IllegalArgumentException {
        throw new IllegalArgumentException(missingPaddingMessage());
    }

    public void _reportBase64UnexpectedPadding() throws IllegalArgumentException {
        throw new IllegalArgumentException(unexpectedPaddingMessage());
    }

    public void _reportInvalidBase64(char c11, int i11, String str) throws IllegalArgumentException {
        String str2;
        if (c11 <= ' ') {
            str2 = "Illegal white space character (code 0x" + Integer.toHexString(c11) + ") as character #" + (i11 + 1) + " of 4-char base64 unit: can only used between units";
        } else if (usesPaddingChar(c11)) {
            str2 = "Unexpected padding character ('" + getPaddingChar() + "') as character #" + (i11 + 1) + " of 4-char base64 unit: padding only legal as 3rd or 4th character";
        } else if (!Character.isDefined(c11) || Character.isISOControl(c11)) {
            str2 = "Illegal character (code 0x" + Integer.toHexString(c11) + ") in base64 content";
        } else {
            str2 = "Illegal character '" + c11 + "' (code 0x" + Integer.toHexString(c11) + ") in base64 content";
        }
        if (str != null) {
            str2 = str2 + ": " + str;
        }
        throw new IllegalArgumentException(str2);
    }

    public boolean acceptsPaddingOnRead() {
        return this._paddingReadBehaviour != PaddingReadBehaviour.PADDING_FORBIDDEN;
    }

    public int decodeBase64Byte(byte b11) {
        if (b11 < 0) {
            return -1;
        }
        return this.f10013b[b11];
    }

    public int decodeBase64Char(int i11) {
        if (i11 <= 127) {
            return this.f10013b[i11];
        }
        return -1;
    }

    public String encode(byte[] bArr, boolean z11) {
        int length = bArr.length;
        StringBuilder sb2 = new StringBuilder((length >> 2) + length + (length >> 3));
        if (z11) {
            sb2.append('\"');
        }
        int maxLineLength = getMaxLineLength() >> 2;
        int i11 = length - 3;
        int i12 = 0;
        while (i12 <= i11) {
            int i13 = i12 + 2;
            int i14 = ((bArr[i12 + 1] & 255) | (bArr[i12] << 8)) << 8;
            i12 += 3;
            encodeBase64Chunk(sb2, i14 | (bArr[i13] & 255));
            maxLineLength--;
            if (maxLineLength <= 0) {
                sb2.append('\\');
                sb2.append('n');
                maxLineLength = getMaxLineLength() >> 2;
            }
        }
        int i15 = length - i12;
        if (i15 > 0) {
            int i16 = i12 + 1;
            int i17 = bArr[i12] << 16;
            if (i15 == 2) {
                i17 |= (bArr[i16] & 255) << 8;
            }
            encodeBase64Partial(sb2, i17, i15);
        }
        if (z11) {
            sb2.append('\"');
        }
        return sb2.toString();
    }

    public byte encodeBase64BitsAsByte(int i11) {
        return this.f10015d[i11];
    }

    public char encodeBase64BitsAsChar(int i11) {
        return this.f10014c[i11];
    }

    public int getMaxLineLength() {
        return this._maxLineLength;
    }

    public String getName() {
        return this._name;
    }

    public byte getPaddingByte() {
        return (byte) this._paddingChar;
    }

    public char getPaddingChar() {
        return this._paddingChar;
    }

    public int hashCode() {
        return this._name.hashCode();
    }

    public PaddingReadBehaviour paddingReadBehaviour() {
        return this._paddingReadBehaviour;
    }

    public Object readResolve() {
        Base64Variant base64VariantM10919b = C6297a.m10919b(this._name);
        boolean z11 = this._writePadding;
        boolean z12 = base64VariantM10919b._writePadding;
        return (z11 == z12 && this._paddingChar == base64VariantM10919b._paddingChar && this._paddingReadBehaviour == base64VariantM10919b._paddingReadBehaviour && this._maxLineLength == base64VariantM10919b._maxLineLength && z11 == z12) ? base64VariantM10919b : new Base64Variant(base64VariantM10919b, this._name, z11, this._paddingChar, this._paddingReadBehaviour, this._maxLineLength);
    }

    public boolean requiresPaddingOnRead() {
        return this._paddingReadBehaviour == PaddingReadBehaviour.PADDING_REQUIRED;
    }

    public String toString() {
        return this._name;
    }

    public boolean usesPadding() {
        return this._writePadding;
    }

    public boolean usesPaddingChar(int i11) {
        return i11 == this._paddingChar;
    }

    public Base64Variant withPaddingAllowed() {
        return withReadPadding(PaddingReadBehaviour.PADDING_ALLOWED);
    }

    public Base64Variant withPaddingForbidden() {
        return withReadPadding(PaddingReadBehaviour.PADDING_FORBIDDEN);
    }

    public Base64Variant withPaddingRequired() {
        return withReadPadding(PaddingReadBehaviour.PADDING_REQUIRED);
    }

    public Base64Variant withReadPadding(PaddingReadBehaviour paddingReadBehaviour) {
        return paddingReadBehaviour == this._paddingReadBehaviour ? this : new Base64Variant(this, paddingReadBehaviour);
    }

    public Base64Variant withWritePadding(boolean z11) {
        return z11 == this._writePadding ? this : new Base64Variant(this, this._name, z11, this._paddingChar, this._maxLineLength);
    }

    public String missingPaddingMessage() {
        return String.format("Unexpected end of base64-encoded String: base64 variant '%s' expects padding (one or more '%c' characters) at the end. This Base64Variant might have been incorrectly configured", getName(), Character.valueOf(getPaddingChar()));
    }

    public String unexpectedPaddingMessage() {
        return String.format("Unexpected end of base64-encoded String: base64 variant '%s' expects no padding at the end while decoding. This Base64Variant might have been incorrectly configured", getName());
    }

    public void decode(String str, C6324c c6324c) throws IllegalArgumentException {
        int length = str.length();
        int i11 = 0;
        while (i11 < length) {
            int i12 = i11 + 1;
            char cCharAt = str.charAt(i11);
            if (cCharAt > ' ') {
                int iDecodeBase64Char = decodeBase64Char(cCharAt);
                if (iDecodeBase64Char < 0) {
                    _reportInvalidBase64(cCharAt, 0, null);
                }
                if (i12 >= length) {
                    _reportBase64EOF();
                }
                int i13 = i11 + 2;
                char cCharAt2 = str.charAt(i12);
                int iDecodeBase64Char2 = decodeBase64Char(cCharAt2);
                if (iDecodeBase64Char2 < 0) {
                    _reportInvalidBase64(cCharAt2, 1, null);
                }
                int i14 = (iDecodeBase64Char << 6) | iDecodeBase64Char2;
                if (i13 >= length) {
                    if (!requiresPaddingOnRead()) {
                        c6324c.m11069b(i14 >> 4);
                        return;
                    }
                    _reportBase64EOF();
                }
                int i15 = i11 + 3;
                char cCharAt3 = str.charAt(i13);
                int iDecodeBase64Char3 = decodeBase64Char(cCharAt3);
                if (iDecodeBase64Char3 < 0) {
                    if (iDecodeBase64Char3 != -2) {
                        _reportInvalidBase64(cCharAt3, 2, null);
                    }
                    if (!acceptsPaddingOnRead()) {
                        _reportBase64UnexpectedPadding();
                    }
                    if (i15 >= length) {
                        _reportBase64EOF();
                    }
                    i11 += 4;
                    char cCharAt4 = str.charAt(i15);
                    if (!usesPaddingChar(cCharAt4)) {
                        _reportInvalidBase64(cCharAt4, 3, "expected padding character '" + getPaddingChar() + "'");
                    }
                    c6324c.m11069b(i14 >> 4);
                } else {
                    int i16 = (i14 << 6) | iDecodeBase64Char3;
                    if (i15 >= length) {
                        if (!requiresPaddingOnRead()) {
                            c6324c.m11071h(i16 >> 2);
                            return;
                        }
                        _reportBase64EOF();
                    }
                    i11 += 4;
                    char cCharAt5 = str.charAt(i15);
                    int iDecodeBase64Char4 = decodeBase64Char(cCharAt5);
                    if (iDecodeBase64Char4 < 0) {
                        if (iDecodeBase64Char4 != -2) {
                            _reportInvalidBase64(cCharAt5, 3, null);
                        }
                        if (!acceptsPaddingOnRead()) {
                            _reportBase64UnexpectedPadding();
                        }
                        c6324c.m11071h(i16 >> 2);
                    } else {
                        c6324c.m11070g((i16 << 6) | iDecodeBase64Char4);
                    }
                }
            } else {
                i11 = i12;
            }
        }
    }

    public void encodeBase64Chunk(StringBuilder sb2, int i11) {
        sb2.append(this.f10014c[(i11 >> 18) & 63]);
        sb2.append(this.f10014c[(i11 >> 12) & 63]);
        sb2.append(this.f10014c[(i11 >> 6) & 63]);
        sb2.append(this.f10014c[i11 & 63]);
    }

    public void encodeBase64Partial(StringBuilder sb2, int i11, int i12) {
        sb2.append(this.f10014c[(i11 >> 18) & 63]);
        sb2.append(this.f10014c[(i11 >> 12) & 63]);
        if (usesPadding()) {
            sb2.append(i12 == 2 ? this.f10014c[(i11 >> 6) & 63] : this._paddingChar);
            sb2.append(this._paddingChar);
        } else if (i12 == 2) {
            sb2.append(this.f10014c[(i11 >> 6) & 63]);
        }
    }

    public int encodeBase64Chunk(int i11, byte[] bArr, int i12) {
        byte[] bArr2 = this.f10015d;
        bArr[i12] = bArr2[(i11 >> 18) & 63];
        bArr[i12 + 1] = bArr2[(i11 >> 12) & 63];
        int i13 = i12 + 3;
        bArr[i12 + 2] = bArr2[(i11 >> 6) & 63];
        int i14 = i12 + 4;
        bArr[i13] = bArr2[i11 & 63];
        return i14;
    }

    public int encodeBase64Partial(int i11, int i12, byte[] bArr, int i13) {
        byte[] bArr2 = this.f10015d;
        bArr[i13] = bArr2[(i11 >> 18) & 63];
        int i14 = i13 + 2;
        bArr[i13 + 1] = bArr2[(i11 >> 12) & 63];
        if (!usesPadding()) {
            if (i12 != 2) {
                return i14;
            }
            int i15 = i13 + 3;
            bArr[i14] = this.f10015d[(i11 >> 6) & 63];
            return i15;
        }
        byte b11 = (byte) this._paddingChar;
        int i16 = i13 + 3;
        bArr[i14] = i12 == 2 ? this.f10015d[(i11 >> 6) & 63] : b11;
        int i17 = i13 + 4;
        bArr[i16] = b11;
        return i17;
    }

    public Base64Variant(Base64Variant base64Variant, String str, int i11) {
        this(base64Variant, str, base64Variant._writePadding, base64Variant._paddingChar, i11);
    }

    public String encode(byte[] bArr, boolean z11, String str) {
        int length = bArr.length;
        StringBuilder sb2 = new StringBuilder((length >> 2) + length + (length >> 3));
        if (z11) {
            sb2.append('\"');
        }
        int maxLineLength = getMaxLineLength() >> 2;
        int i11 = length - 3;
        int i12 = 0;
        while (i12 <= i11) {
            int i13 = i12 + 2;
            int i14 = ((bArr[i12 + 1] & 255) | (bArr[i12] << 8)) << 8;
            i12 += 3;
            encodeBase64Chunk(sb2, i14 | (bArr[i13] & 255));
            maxLineLength--;
            if (maxLineLength <= 0) {
                sb2.append(str);
                maxLineLength = getMaxLineLength() >> 2;
            }
        }
        int i15 = length - i12;
        if (i15 > 0) {
            int i16 = i12 + 1;
            int i17 = bArr[i12] << 16;
            if (i15 == 2) {
                i17 |= (bArr[i16] & 255) << 8;
            }
            encodeBase64Partial(sb2, i17, i15);
        }
        if (z11) {
            sb2.append('\"');
        }
        return sb2.toString();
    }

    public Base64Variant(Base64Variant base64Variant, String str, boolean z11, char c11, int i11) {
        this(base64Variant, str, z11, c11, base64Variant._paddingReadBehaviour, i11);
    }

    public Base64Variant(Base64Variant base64Variant, String str, boolean z11, char c11, PaddingReadBehaviour paddingReadBehaviour, int i11) {
        int[] iArr = new int[128];
        this.f10013b = iArr;
        char[] cArr = new char[64];
        this.f10014c = cArr;
        byte[] bArr = new byte[64];
        this.f10015d = bArr;
        this._name = str;
        byte[] bArr2 = base64Variant.f10015d;
        System.arraycopy(bArr2, 0, bArr, 0, bArr2.length);
        char[] cArr2 = base64Variant.f10014c;
        System.arraycopy(cArr2, 0, cArr, 0, cArr2.length);
        int[] iArr2 = base64Variant.f10013b;
        System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
        this._writePadding = z11;
        this._paddingChar = c11;
        this._maxLineLength = i11;
        this._paddingReadBehaviour = paddingReadBehaviour;
    }

    public Base64Variant(Base64Variant base64Variant, PaddingReadBehaviour paddingReadBehaviour) {
        this(base64Variant, base64Variant._name, base64Variant._writePadding, base64Variant._paddingChar, paddingReadBehaviour, base64Variant._maxLineLength);
    }
}
