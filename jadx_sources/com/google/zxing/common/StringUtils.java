package com.google.zxing.common;

import com.google.zxing.DecodeHintType;
import java.nio.charset.Charset;
import java.util.Map;

/* JADX INFO: loaded from: classes56.dex */
public final class StringUtils {
    private static final boolean ASSUME_SHIFT_JIS;
    private static final String EUC_JP = "EUC_JP";
    public static final String GB2312 = "GB2312";
    private static final String ISO88591 = "ISO8859_1";
    private static final String PLATFORM_DEFAULT_ENCODING;
    public static final String SHIFT_JIS = "SJIS";
    private static final String UTF8 = "UTF8";

    /* JADX WARN: Code duplicated, block: B:71:0x00bc  */
    public static String guessEncoding(byte[] bArr, Map<DecodeHintType, ?> map) {
        boolean z11;
        byte[] bArr2 = bArr;
        if (map != null) {
            DecodeHintType decodeHintType = DecodeHintType.CHARACTER_SET;
            if (map.containsKey(decodeHintType)) {
                return map.get(decodeHintType).toString();
            }
        }
        int length = bArr2.length;
        boolean z12 = true;
        int i11 = 0;
        boolean z13 = bArr2.length > 3 && bArr2[0] == -17 && bArr2[1] == -69 && bArr2[2] == -65;
        boolean z14 = true;
        boolean z15 = true;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        int i21 = 0;
        int i22 = 0;
        int i23 = 0;
        while (i13 < length && (z12 || z14 || z15)) {
            byte b11 = bArr2[i13];
            int i24 = b11 & 255;
            if (z15) {
                if (i14 <= 0) {
                    z11 = z13;
                    if ((b11 & 128) != 0) {
                        if ((b11 & 64) != 0) {
                            int i25 = i14 + 1;
                            if ((b11 & 32) == 0) {
                                i16++;
                            } else {
                                i25 = i14 + 2;
                                if ((b11 & 16) == 0) {
                                    i17++;
                                } else {
                                    i14 += 3;
                                    if ((b11 & 8) == 0) {
                                        i18++;
                                    }
                                }
                            }
                            i14 = i25;
                        }
                    }
                } else if ((b11 & 128) != 0) {
                    i14--;
                    z11 = z13;
                } else {
                    z11 = z13;
                }
                z15 = false;
            } else {
                z11 = z13;
            }
            if (z12) {
                if (i24 > 127 && i24 < 160) {
                    z12 = false;
                } else if (i24 > 159 && (i24 < 192 || i24 == 215 || i24 == 247)) {
                    i21++;
                }
            }
            if (z14) {
                if (i15 > 0) {
                    if (i24 < 64 || i24 == 127 || i24 > 252) {
                        z14 = false;
                    } else {
                        i15--;
                    }
                } else if (i24 == 128 || i24 == 160 || i24 > 239) {
                    z14 = false;
                } else if (i24 <= 160 || i24 >= 224) {
                    if (i24 > 127) {
                        i15++;
                        int i26 = i22 + 1;
                        if (i26 > i11) {
                            i11 = i26;
                            i22 = i11;
                        } else {
                            i22 = i26;
                        }
                    } else {
                        i22 = 0;
                    }
                    i23 = 0;
                } else {
                    i12++;
                    int i27 = i23 + 1;
                    if (i27 > i19) {
                        i19 = i27;
                        i23 = i19;
                    } else {
                        i23 = i27;
                    }
                    i22 = 0;
                }
            }
            i13++;
            bArr2 = bArr;
            z13 = z11;
        }
        boolean z16 = z13;
        if (z15 && i14 > 0) {
            z15 = false;
        }
        if (z14 && i15 > 0) {
            z14 = false;
        }
        if (z15 && (z16 || i16 + i17 + i18 > 0)) {
            return UTF8;
        }
        if (z14 && (ASSUME_SHIFT_JIS || i19 >= 3 || i11 >= 3)) {
            return SHIFT_JIS;
        }
        if (z12 && z14) {
            return (!(i19 == 2 && i12 == 2) && i21 * 10 < length) ? ISO88591 : SHIFT_JIS;
        }
        if (z12) {
            return ISO88591;
        }
        if (z14) {
            return SHIFT_JIS;
        }
        return z15 ? UTF8 : PLATFORM_DEFAULT_ENCODING;
    }

    static {
        boolean z11;
        String strName = Charset.defaultCharset().name();
        PLATFORM_DEFAULT_ENCODING = strName;
        if (!SHIFT_JIS.equalsIgnoreCase(strName) && !EUC_JP.equalsIgnoreCase(strName)) {
            z11 = false;
        } else {
            z11 = true;
        }
        ASSUME_SHIFT_JIS = z11;
    }

    private StringUtils() {
    }
}
