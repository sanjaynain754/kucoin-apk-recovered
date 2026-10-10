package okio.internal;

import io.flutter.plugin.editing.SpellCheckPlugin;
import java.util.Arrays;
import okio.Utf8;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: -Utf8.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0012\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\u001e\u0010\u0003\u001a\u00020\u0002*\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005¨\u0006\u0007"}, m90084d2 = {"commonAsUtf8ToByteArray", "", "", "commonToUtf8String", "beginIndex", "", SpellCheckPlugin.END_INDEX_KEY, "okio"}, m90085k = 2, m90086mv = {1, 9, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\n-Utf8.kt\nKotlin\n*S Kotlin\n*F\n+ 1 -Utf8.kt\nokio/internal/_Utf8Kt\n+ 2 Utf8.kt\nokio/Utf8\n+ 3 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,60:1\n260#2,16:61\n277#2:78\n397#2,9:79\n127#2:88\n406#2,20:90\n279#2,3:110\n440#2,4:113\n127#2:117\n446#2,10:118\n127#2:128\n456#2,5:129\n127#2:134\n461#2,24:135\n283#2,3:159\n500#2,3:162\n286#2,12:165\n503#2:177\n127#2:178\n506#2,2:179\n127#2:181\n510#2,10:182\n127#2:192\n520#2,5:193\n127#2:198\n525#2,5:199\n127#2:204\n530#2,28:205\n302#2,6:233\n138#2,67:239\n68#3:77\n74#3:89\n*S KotlinDebug\n*F\n+ 1 -Utf8.kt\nokio/internal/_Utf8Kt\n*L\n34#1:61,16\n34#1:78\n34#1:79,9\n34#1:88\n34#1:90,20\n34#1:110,3\n34#1:113,4\n34#1:117\n34#1:118,10\n34#1:128\n34#1:129,5\n34#1:134\n34#1:135,24\n34#1:159,3\n34#1:162,3\n34#1:165,12\n34#1:177\n34#1:178\n34#1:179,2\n34#1:181\n34#1:182,10\n34#1:192\n34#1:193,5\n34#1:198\n34#1:199,5\n34#1:204\n34#1:205,28\n34#1:233,6\n50#1:239,67\n34#1:77\n34#1:89\n*E\n"})
public final class _Utf8Kt {
    @NotNull
    public static final byte[] commonAsUtf8ToByteArray(@NotNull String str) {
        int i11;
        char cCharAt;
        Intrinsics.checkNotNullParameter(str, "<this>");
        byte[] bArr = new byte[str.length() * 4];
        int length = str.length();
        int i12 = 0;
        while (i12 < length) {
            char cCharAt2 = str.charAt(i12);
            if (Intrinsics.compare((int) cCharAt2, 128) >= 0) {
                int length2 = str.length();
                int i13 = i12;
                while (i12 < length2) {
                    char cCharAt3 = str.charAt(i12);
                    if (Intrinsics.compare((int) cCharAt3, 128) < 0) {
                        int i14 = i13 + 1;
                        bArr[i13] = (byte) cCharAt3;
                        i12++;
                        while (true) {
                            i13 = i14;
                            if (i12 >= length2 || Intrinsics.compare((int) str.charAt(i12), 128) >= 0) {
                                break;
                            }
                            i14 = i13 + 1;
                            bArr[i13] = (byte) str.charAt(i12);
                            i12++;
                        }
                    } else {
                        if (Intrinsics.compare((int) cCharAt3, 2048) < 0) {
                            bArr[i13] = (byte) ((cCharAt3 >> 6) | 192);
                            i13 += 2;
                            bArr[i13 + 1] = (byte) ((cCharAt3 & '?') | 128);
                        } else if (55296 > cCharAt3 || cCharAt3 >= 57344) {
                            bArr[i13] = (byte) ((cCharAt3 >> '\f') | 224);
                            bArr[i13 + 1] = (byte) (((cCharAt3 >> 6) & 63) | 128);
                            i13 += 3;
                            bArr[i13 + 2] = (byte) ((cCharAt3 & '?') | 128);
                        } else if (Intrinsics.compare((int) cCharAt3, 56319) > 0 || length2 <= (i11 = i12 + 1) || 56320 > (cCharAt = str.charAt(i11)) || cCharAt >= 57344) {
                            bArr[i13] = 63;
                            i12++;
                            i13++;
                        } else {
                            int iCharAt = ((cCharAt3 << '\n') + str.charAt(i11)) - 56613888;
                            bArr[i13] = (byte) ((iCharAt >> 18) | 240);
                            bArr[i13 + 1] = (byte) (((iCharAt >> 12) & 63) | 128);
                            bArr[i13 + 2] = (byte) (((iCharAt >> 6) & 63) | 128);
                            i13 += 4;
                            bArr[i13 + 3] = (byte) ((iCharAt & 63) | 128);
                            i12 += 2;
                        }
                        i12++;
                    }
                }
                byte[] bArrCopyOf = Arrays.copyOf(bArr, i13);
                Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(this, newSize)");
                return bArrCopyOf;
            }
            bArr[i12] = (byte) cCharAt2;
            i12++;
        }
        byte[] bArrCopyOf2 = Arrays.copyOf(bArr, str.length());
        Intrinsics.checkNotNullExpressionValue(bArrCopyOf2, "copyOf(this, newSize)");
        return bArrCopyOf2;
    }

    @NotNull
    public static final String commonToUtf8String(@NotNull byte[] bArr, int i11, int i12) {
        byte b11;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18 = i11;
        int i19 = 2;
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        if (i18 < 0 || i12 > bArr.length || i18 > i12) {
            throw new ArrayIndexOutOfBoundsException("size=" + bArr.length + " beginIndex=" + i18 + " endIndex=" + i12);
        }
        char[] cArr = new char[i12 - i18];
        int i21 = 0;
        while (i18 < i12) {
            byte b12 = bArr[i18];
            if (b12 >= 0) {
                int i22 = i21 + 1;
                cArr[i21] = (char) b12;
                i18++;
                while (true) {
                    i21 = i22;
                    if (i18 >= i12 || (b11 = bArr[i18]) < 0) {
                        break;
                    }
                    i18++;
                    i22 = i21 + 1;
                    cArr[i21] = (char) b11;
                }
            } else if ((b12 >> 5) == -2) {
                int i23 = i18 + 1;
                if (i12 <= i23) {
                    i13 = i21 + 1;
                    cArr[i21] = (char) Utf8.REPLACEMENT_CODE_POINT;
                } else {
                    byte b13 = bArr[i23];
                    if ((b13 & 192) == 128) {
                        int i24 = (b12 << 6) ^ (b13 ^ 3968);
                        if (i24 < 128) {
                            i13 = i21 + 1;
                            cArr[i21] = (char) Utf8.REPLACEMENT_CODE_POINT;
                        } else {
                            i13 = i21 + 1;
                            cArr[i21] = (char) i24;
                        }
                        Unit unit = Unit.INSTANCE;
                        i14 = i19;
                    } else {
                        i13 = i21 + 1;
                        cArr[i21] = (char) Utf8.REPLACEMENT_CODE_POINT;
                    }
                    i21 = i13;
                    i18 += i14;
                }
                Unit unit2 = Unit.INSTANCE;
                i14 = 1;
                i21 = i13;
                i18 += i14;
            } else if ((b12 >> 4) == -2) {
                int i25 = i18 + 2;
                if (i12 <= i25) {
                    int i26 = i21 + 1;
                    cArr[i21] = (char) Utf8.REPLACEMENT_CODE_POINT;
                    Unit unit3 = Unit.INSTANCE;
                    int i27 = i18 + 1;
                    i16 = (i12 <= i27 || (bArr[i27] & 192) != 128) ? 1 : i19;
                    i21 = i26;
                } else {
                    byte b14 = bArr[i18 + 1];
                    if ((b14 & 192) == 128) {
                        byte b15 = bArr[i25];
                        if ((b15 & 192) == 128) {
                            int i28 = ((b15 ^ (-123008)) ^ (b14 << 6)) ^ (b12 << 12);
                            if (i28 < 2048) {
                                i17 = i21 + 1;
                                cArr[i21] = (char) Utf8.REPLACEMENT_CODE_POINT;
                            } else if (55296 > i28 || i28 >= 57344) {
                                char c11 = (char) i28;
                                i17 = i21 + 1;
                                cArr[i21] = c11;
                            } else {
                                i17 = i21 + 1;
                                cArr[i21] = (char) Utf8.REPLACEMENT_CODE_POINT;
                            }
                            Unit unit4 = Unit.INSTANCE;
                            i21 = i17;
                            i16 = 3;
                        } else {
                            cArr[i21] = (char) Utf8.REPLACEMENT_CODE_POINT;
                            Unit unit5 = Unit.INSTANCE;
                            i21++;
                            i16 = i19;
                        }
                    } else {
                        cArr[i21] = (char) Utf8.REPLACEMENT_CODE_POINT;
                        Unit unit6 = Unit.INSTANCE;
                        i21++;
                        i16 = 1;
                    }
                }
                i18 += i16;
            } else if ((b12 >> 3) == -2) {
                int i29 = i18 + 3;
                if (i12 <= i29) {
                    int i31 = i21 + 1;
                    cArr[i21] = Utf8.REPLACEMENT_CHARACTER;
                    Unit unit7 = Unit.INSTANCE;
                    int i32 = i18 + 1;
                    if (i12 <= i32 || (bArr[i32] & 192) != 128) {
                        i21 = i31;
                        i19 = 1;
                    } else {
                        int i33 = i18 + 2;
                        if (i12 <= i33 || (bArr[i33] & 192) != 128) {
                            i21 = i31;
                            i19 = i19;
                        } else {
                            i21 = i31;
                            i19 = i19;
                            i19 = 3;
                        }
                    }
                } else {
                    byte b16 = bArr[i18 + 1];
                    if ((b16 & 192) == 128) {
                        byte b17 = bArr[i18 + 2];
                        i19 = i19;
                        if ((b17 & 192) == 128) {
                            byte b18 = bArr[i29];
                            if ((b18 & 192) == 128) {
                                int i34 = (((b18 ^ 3678080) ^ (b17 << 6)) ^ (b16 << 12)) ^ (b12 << 18);
                                if (i34 > 1114111) {
                                    i15 = i21 + 1;
                                    cArr[i21] = Utf8.REPLACEMENT_CHARACTER;
                                } else if ((55296 > i34 || i34 >= 57344) && i34 >= 65536 && i34 != 65533) {
                                    cArr[i21] = (char) ((i34 >>> 10) + Utf8.HIGH_SURROGATE_HEADER);
                                    cArr[i21 + 1] = (char) ((i34 & 1023) + Utf8.LOG_SURROGATE_HEADER);
                                    i15 = i21 + 2;
                                } else {
                                    i15 = i21 + 1;
                                    cArr[i21] = Utf8.REPLACEMENT_CHARACTER;
                                }
                                Unit unit8 = Unit.INSTANCE;
                                i21 = i15;
                                i19 = 4;
                            } else {
                                cArr[i21] = Utf8.REPLACEMENT_CHARACTER;
                                Unit unit9 = Unit.INSTANCE;
                                i21++;
                                i19 = 3;
                            }
                        } else {
                            cArr[i21] = Utf8.REPLACEMENT_CHARACTER;
                            Unit unit10 = Unit.INSTANCE;
                            i21++;
                            i19 = i19;
                        }
                    } else {
                        cArr[i21] = Utf8.REPLACEMENT_CHARACTER;
                        Unit unit11 = Unit.INSTANCE;
                        i21++;
                        i19 = 1;
                    }
                }
                i18 += i19;
                i19 = i19;
            } else {
                cArr[i21] = Utf8.REPLACEMENT_CHARACTER;
                i18++;
                i21++;
            }
        }
        return StringsKt.concatToString(cArr, 0, i21);
    }

    public static /* synthetic */ String commonToUtf8String$default(byte[] bArr, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = 0;
        }
        if ((i13 & 2) != 0) {
            i12 = bArr.length;
        }
        return commonToUtf8String(bArr, i11, i12);
    }
}
