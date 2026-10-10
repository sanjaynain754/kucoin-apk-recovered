package okio;

import io.flutter.plugin.editing.SpellCheckPlugin;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.JvmName;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: Utf8.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000D\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\u001a\u0011\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0001H\u0080\b\u001a\u0011\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0007H\u0080\b\u001a4\u0010\u0010\u001a\u00020\u0001*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00012\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00160\u0015H\u0080\bø\u0001\u0000\u001a4\u0010\u0017\u001a\u00020\u0001*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00012\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00160\u0015H\u0080\bø\u0001\u0000\u001a4\u0010\u0018\u001a\u00020\u0001*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00012\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00160\u0015H\u0080\bø\u0001\u0000\u001a4\u0010\u0019\u001a\u00020\u0016*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00012\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00160\u0015H\u0080\bø\u0001\u0000\u001a4\u0010\u001a\u001a\u00020\u0016*\u00020\u001b2\u0006\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00012\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00160\u0015H\u0080\bø\u0001\u0000\u001a4\u0010\u001c\u001a\u00020\u0016*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00012\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00160\u0015H\u0080\bø\u0001\u0000\u001a%\u0010\u001d\u001a\u00020\u001e*\u00020\u001b2\b\b\u0002\u0010\u0012\u001a\u00020\u00012\b\b\u0002\u0010\u0013\u001a\u00020\u0001H\u0007¢\u0006\u0002\b\u001f\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0007X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\tX\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006 "}, m90084d2 = {"HIGH_SURROGATE_HEADER", "", "LOG_SURROGATE_HEADER", "MASK_2BYTES", "MASK_3BYTES", "MASK_4BYTES", "REPLACEMENT_BYTE", "", "REPLACEMENT_CHARACTER", "", "REPLACEMENT_CODE_POINT", "isIsoControl", "", "codePoint", "isUtf8Continuation", "byte", "process2Utf8Bytes", "", "beginIndex", SpellCheckPlugin.END_INDEX_KEY, "yield", "Lkotlin/Function1;", "", "process3Utf8Bytes", "process4Utf8Bytes", "processUtf16Chars", "processUtf8Bytes", "", "processUtf8CodePoints", "utf8Size", "", "size", "okio"}, m90085k = 2, m90086mv = {1, 9, 0}, m90088xi = 48)
@JvmName(name = "Utf8")
@SourceDebugExtension({"SMAP\nUtf8.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Utf8.kt\nokio/Utf8\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,559:1\n397#1,9:563\n127#1:572\n406#1,20:574\n440#1,4:595\n127#1:599\n446#1,10:601\n127#1:611\n456#1,5:612\n127#1:617\n461#1,24:618\n500#1,4:643\n127#1:647\n506#1,2:649\n127#1:651\n510#1,10:652\n127#1:662\n520#1,5:663\n127#1:668\n525#1,5:669\n127#1:674\n530#1,28:675\n397#1,9:704\n127#1:713\n406#1,20:715\n440#1,4:736\n127#1:740\n446#1,10:742\n127#1:752\n456#1,5:753\n127#1:758\n461#1,24:759\n500#1,4:784\n127#1:788\n506#1,2:790\n127#1:792\n510#1,10:793\n127#1:803\n520#1,5:804\n127#1:809\n525#1,5:810\n127#1:815\n530#1,28:816\n127#1:844\n127#1:846\n127#1:848\n127#1:850\n127#1:852\n127#1:854\n127#1:856\n127#1:858\n127#1:860\n1#2:560\n74#3:561\n68#3:562\n74#3:573\n68#3:594\n74#3:600\n68#3:642\n74#3:648\n68#3:703\n74#3:714\n68#3:735\n74#3:741\n68#3:783\n74#3:789\n74#3:845\n74#3:847\n74#3:849\n74#3:851\n74#3:853\n74#3:855\n74#3:857\n74#3:859\n74#3:861\n*S KotlinDebug\n*F\n+ 1 Utf8.kt\nokio/Utf8\n*L\n228#1:563,9\n228#1:572\n228#1:574,20\n232#1:595,4\n232#1:599\n232#1:601,10\n232#1:611\n232#1:612,5\n232#1:617\n232#1:618,24\n236#1:643,4\n236#1:647\n236#1:649,2\n236#1:651\n236#1:652,10\n236#1:662\n236#1:663,5\n236#1:668\n236#1:669,5\n236#1:674\n236#1:675,28\n277#1:704,9\n277#1:713\n277#1:715,20\n281#1:736,4\n281#1:740\n281#1:742,10\n281#1:752\n281#1:753,5\n281#1:758\n281#1:759,24\n285#1:784,4\n285#1:788\n285#1:790,2\n285#1:792\n285#1:793,10\n285#1:803\n285#1:804,5\n285#1:809\n285#1:810,5\n285#1:815\n285#1:816,28\n405#1:844\n443#1:846\n455#1:848\n460#1:850\n503#1:852\n507#1:854\n519#1:856\n524#1:858\n529#1:860\n127#1:561\n226#1:562\n228#1:573\n230#1:594\n232#1:600\n234#1:642\n236#1:648\n275#1:703\n277#1:714\n279#1:735\n281#1:741\n283#1:783\n285#1:789\n405#1:845\n443#1:847\n455#1:849\n460#1:851\n503#1:853\n507#1:855\n519#1:857\n524#1:859\n529#1:861\n*E\n"})
public final class Utf8 {
    public static final int HIGH_SURROGATE_HEADER = 55232;
    public static final int LOG_SURROGATE_HEADER = 56320;
    public static final int MASK_2BYTES = 3968;
    public static final int MASK_3BYTES = -123008;
    public static final int MASK_4BYTES = 3678080;
    public static final byte REPLACEMENT_BYTE = 63;
    public static final char REPLACEMENT_CHARACTER = 65533;
    public static final int REPLACEMENT_CODE_POINT = 65533;

    @JvmOverloads
    @JvmName(name = "size")
    public static final long size(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return size$default(str, 0, 0, 3, null);
    }

    public static final boolean isIsoControl(int i11) {
        if (i11 < 0 || i11 >= 32) {
            return 127 <= i11 && i11 < 160;
        }
        return true;
    }

    public static final boolean isUtf8Continuation(byte b11) {
        return (b11 & 192) == 128;
    }

    public static final int process2Utf8Bytes(@NotNull byte[] bArr, int i11, int i12, @NotNull Function1<? super Integer, Unit> yield) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(yield, "yield");
        int i13 = i11 + 1;
        Integer numValueOf = Integer.valueOf(REPLACEMENT_CODE_POINT);
        if (i12 <= i13) {
            yield.invoke(numValueOf);
            return 1;
        }
        byte b11 = bArr[i11];
        byte b12 = bArr[i13];
        if ((b12 & 192) != 128) {
            yield.invoke(numValueOf);
            return 1;
        }
        int i14 = (b12 ^ 3968) ^ (b11 << 6);
        if (i14 < 128) {
            yield.invoke(numValueOf);
            return 2;
        }
        yield.invoke(Integer.valueOf(i14));
        return 2;
    }

    public static final int process3Utf8Bytes(@NotNull byte[] bArr, int i11, int i12, @NotNull Function1<? super Integer, Unit> yield) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(yield, "yield");
        int i13 = i11 + 2;
        Integer numValueOf = Integer.valueOf(REPLACEMENT_CODE_POINT);
        if (i12 <= i13) {
            yield.invoke(numValueOf);
            int i14 = i11 + 1;
            return (i12 <= i14 || (bArr[i14] & 192) != 128) ? 1 : 2;
        }
        byte b11 = bArr[i11];
        byte b12 = bArr[i11 + 1];
        if ((b12 & 192) != 128) {
            yield.invoke(numValueOf);
            return 1;
        }
        byte b13 = bArr[i13];
        if ((b13 & 192) != 128) {
            yield.invoke(numValueOf);
            return 2;
        }
        int i15 = ((b13 ^ (-123008)) ^ (b12 << 6)) ^ (b11 << 12);
        if (i15 < 2048) {
            yield.invoke(numValueOf);
            return 3;
        }
        if (55296 > i15 || i15 >= 57344) {
            yield.invoke(Integer.valueOf(i15));
            return 3;
        }
        yield.invoke(numValueOf);
        return 3;
    }

    public static final int process4Utf8Bytes(@NotNull byte[] bArr, int i11, int i12, @NotNull Function1<? super Integer, Unit> yield) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(yield, "yield");
        int i13 = i11 + 3;
        Integer numValueOf = Integer.valueOf(REPLACEMENT_CODE_POINT);
        if (i12 <= i13) {
            yield.invoke(numValueOf);
            int i14 = i11 + 1;
            if (i12 <= i14 || (bArr[i14] & 192) != 128) {
                return 1;
            }
            int i15 = i11 + 2;
            return (i12 <= i15 || (bArr[i15] & 192) != 128) ? 2 : 3;
        }
        byte b11 = bArr[i11];
        byte b12 = bArr[i11 + 1];
        if ((b12 & 192) != 128) {
            yield.invoke(numValueOf);
            return 1;
        }
        byte b13 = bArr[i11 + 2];
        if ((b13 & 192) != 128) {
            yield.invoke(numValueOf);
            return 2;
        }
        byte b14 = bArr[i13];
        if ((b14 & 192) != 128) {
            yield.invoke(numValueOf);
            return 3;
        }
        int i16 = (((b14 ^ 3678080) ^ (b13 << 6)) ^ (b12 << 12)) ^ (b11 << 18);
        if (i16 > 1114111) {
            yield.invoke(numValueOf);
            return 4;
        }
        if (55296 <= i16 && i16 < 57344) {
            yield.invoke(numValueOf);
            return 4;
        }
        if (i16 < 65536) {
            yield.invoke(numValueOf);
            return 4;
        }
        yield.invoke(Integer.valueOf(i16));
        return 4;
    }

    public static final void processUtf16Chars(@NotNull byte[] bArr, int i11, int i12, @NotNull Function1<? super Character, Unit> yield) {
        int i13;
        int i14;
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(yield, "yield");
        int i15 = i11;
        while (i15 < i12) {
            byte b11 = bArr[i15];
            if (b11 >= 0) {
                yield.invoke(Character.valueOf((char) b11));
                i15++;
                while (i15 < i12) {
                    byte b12 = bArr[i15];
                    if (b12 < 0) {
                        break;
                    }
                    i15++;
                    yield.invoke(Character.valueOf((char) b12));
                }
            } else if ((b11 >> 5) == -2) {
                int i16 = i15 + 1;
                if (i12 > i16) {
                    byte b13 = bArr[i16];
                    if ((b13 & 192) == 128) {
                        int i17 = (b11 << 6) ^ (b13 ^ 3968);
                        yield.invoke(Character.valueOf(i17 < 128 ? (char) REPLACEMENT_CODE_POINT : (char) i17));
                        Unit unit = Unit.INSTANCE;
                        i15 += i13;
                    }
                }
                yield.invoke(Character.valueOf((char) REPLACEMENT_CODE_POINT));
                Unit unit2 = Unit.INSTANCE;
                i15 += i13;
            } else if ((b11 >> 4) == -2) {
                int i18 = i15 + 2;
                if (i12 <= i18) {
                    yield.invoke(Character.valueOf((char) REPLACEMENT_CODE_POINT));
                    Unit unit3 = Unit.INSTANCE;
                    int i19 = i15 + 1;
                    i13 = (i12 <= i19 || (bArr[i19] & 192) != 128) ? 1 : 2;
                } else {
                    byte b14 = bArr[i15 + 1];
                    if ((b14 & 192) == 128) {
                        byte b15 = bArr[i18];
                        if ((b15 & 192) == 128) {
                            int i21 = (b11 << 12) ^ ((b15 ^ (-123008)) ^ (b14 << 6));
                            yield.invoke(Character.valueOf((i21 >= 2048 && (55296 > i21 || i21 >= 57344)) ? (char) i21 : (char) REPLACEMENT_CODE_POINT));
                            Unit unit4 = Unit.INSTANCE;
                            i13 = 3;
                        } else {
                            yield.invoke(Character.valueOf((char) REPLACEMENT_CODE_POINT));
                            Unit unit5 = Unit.INSTANCE;
                        }
                    } else {
                        yield.invoke(Character.valueOf((char) REPLACEMENT_CODE_POINT));
                        Unit unit6 = Unit.INSTANCE;
                    }
                }
                i15 += i13;
            } else if ((b11 >> 3) == -2) {
                int i22 = i15 + 3;
                if (i12 <= i22) {
                    yield.invoke(Character.valueOf(REPLACEMENT_CHARACTER));
                    Unit unit7 = Unit.INSTANCE;
                    int i23 = i15 + 1;
                    if (i12 <= i23 || (bArr[i23] & 192) != 128) {
                        i14 = 1;
                    } else {
                        int i24 = i15 + 2;
                        i14 = (i12 <= i24 || (bArr[i24] & 192) != 128) ? 2 : 3;
                    }
                } else {
                    byte b16 = bArr[i15 + 1];
                    if ((b16 & 192) == 128) {
                        byte b17 = bArr[i15 + 2];
                        if ((b17 & 192) == 128) {
                            byte b18 = bArr[i22];
                            if ((b18 & 192) == 128) {
                                int i25 = (((b18 ^ 3678080) ^ (b17 << 6)) ^ (b16 << 12)) ^ (b11 << 18);
                                if (i25 <= 1114111 && ((55296 > i25 || i25 >= 57344) && i25 >= 65536 && i25 != 65533)) {
                                    yield.invoke(Character.valueOf((char) ((i25 >>> 10) + HIGH_SURROGATE_HEADER)));
                                    yield.invoke(Character.valueOf((char) ((i25 & 1023) + LOG_SURROGATE_HEADER)));
                                } else {
                                    yield.invoke(Character.valueOf(REPLACEMENT_CHARACTER));
                                }
                                Unit unit8 = Unit.INSTANCE;
                                i14 = 4;
                            } else {
                                yield.invoke(Character.valueOf(REPLACEMENT_CHARACTER));
                                Unit unit9 = Unit.INSTANCE;
                            }
                        } else {
                            yield.invoke(Character.valueOf(REPLACEMENT_CHARACTER));
                            Unit unit10 = Unit.INSTANCE;
                        }
                    } else {
                        yield.invoke(Character.valueOf(REPLACEMENT_CHARACTER));
                        Unit unit11 = Unit.INSTANCE;
                        i14 = 1;
                    }
                }
                i15 += i14;
            } else {
                yield.invoke(Character.valueOf(REPLACEMENT_CHARACTER));
                i15++;
            }
        }
    }

    public static final void processUtf8Bytes(@NotNull String str, int i11, int i12, @NotNull Function1<? super Byte, Unit> yield) {
        int i13;
        char cCharAt;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(yield, "yield");
        while (i11 < i12) {
            char cCharAt2 = str.charAt(i11);
            if (Intrinsics.compare((int) cCharAt2, 128) < 0) {
                yield.invoke(Byte.valueOf((byte) cCharAt2));
                i11++;
                while (i11 < i12 && Intrinsics.compare((int) str.charAt(i11), 128) < 0) {
                    yield.invoke(Byte.valueOf((byte) str.charAt(i11)));
                    i11++;
                }
            } else {
                if (Intrinsics.compare((int) cCharAt2, 2048) < 0) {
                    yield.invoke(Byte.valueOf((byte) ((cCharAt2 >> 6) | 192)));
                    yield.invoke(Byte.valueOf((byte) ((cCharAt2 & '?') | 128)));
                } else if (55296 > cCharAt2 || cCharAt2 >= 57344) {
                    yield.invoke(Byte.valueOf((byte) ((cCharAt2 >> '\f') | 224)));
                    yield.invoke(Byte.valueOf((byte) (((cCharAt2 >> 6) & 63) | 128)));
                    yield.invoke(Byte.valueOf((byte) ((cCharAt2 & '?') | 128)));
                } else if (Intrinsics.compare((int) cCharAt2, 56319) > 0 || i12 <= (i13 = i11 + 1) || 56320 > (cCharAt = str.charAt(i13)) || cCharAt >= 57344) {
                    yield.invoke((byte) 63);
                } else {
                    int iCharAt = ((cCharAt2 << '\n') + str.charAt(i13)) - 56613888;
                    yield.invoke(Byte.valueOf((byte) ((iCharAt >> 18) | 240)));
                    yield.invoke(Byte.valueOf((byte) (((iCharAt >> 12) & 63) | 128)));
                    yield.invoke(Byte.valueOf((byte) (((iCharAt >> 6) & 63) | 128)));
                    yield.invoke(Byte.valueOf((byte) ((iCharAt & 63) | 128)));
                    i11 += 2;
                }
                i11++;
            }
        }
    }

    public static final void processUtf8CodePoints(@NotNull byte[] bArr, int i11, int i12, @NotNull Function1<? super Integer, Unit> yield) {
        int i13;
        int i14;
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(yield, "yield");
        int i15 = i11;
        while (i15 < i12) {
            byte b11 = bArr[i15];
            if (b11 >= 0) {
                yield.invoke(Integer.valueOf(b11));
                i15++;
                while (i15 < i12) {
                    byte b12 = bArr[i15];
                    if (b12 < 0) {
                        break;
                    }
                    i15++;
                    yield.invoke(Integer.valueOf(b12));
                }
            } else if ((b11 >> 5) == -2) {
                int i16 = i15 + 1;
                if (i12 > i16) {
                    byte b13 = bArr[i16];
                    if ((b13 & 192) == 128) {
                        int i17 = (b11 << 6) ^ (b13 ^ 3968);
                        yield.invoke(i17 < 128 ? Integer.valueOf(REPLACEMENT_CODE_POINT) : Integer.valueOf(i17));
                        Unit unit = Unit.INSTANCE;
                        i15 += i13;
                    }
                }
                yield.invoke(Integer.valueOf(REPLACEMENT_CODE_POINT));
                Unit unit2 = Unit.INSTANCE;
                i15 += i13;
            } else if ((b11 >> 4) == -2) {
                int i18 = i15 + 2;
                if (i12 <= i18) {
                    yield.invoke(Integer.valueOf(REPLACEMENT_CODE_POINT));
                    Unit unit3 = Unit.INSTANCE;
                    int i19 = i15 + 1;
                    i13 = (i12 <= i19 || (bArr[i19] & 192) != 128) ? 1 : 2;
                } else {
                    byte b14 = bArr[i15 + 1];
                    if ((b14 & 192) == 128) {
                        byte b15 = bArr[i18];
                        if ((b15 & 192) == 128) {
                            int i21 = (b11 << 12) ^ ((b15 ^ (-123008)) ^ (b14 << 6));
                            yield.invoke((i21 >= 2048 && (55296 > i21 || i21 >= 57344)) ? Integer.valueOf(i21) : Integer.valueOf(REPLACEMENT_CODE_POINT));
                            Unit unit4 = Unit.INSTANCE;
                            i13 = 3;
                        } else {
                            yield.invoke(Integer.valueOf(REPLACEMENT_CODE_POINT));
                            Unit unit5 = Unit.INSTANCE;
                        }
                    } else {
                        yield.invoke(Integer.valueOf(REPLACEMENT_CODE_POINT));
                        Unit unit6 = Unit.INSTANCE;
                    }
                }
                i15 += i13;
            } else if ((b11 >> 3) == -2) {
                int i22 = i15 + 3;
                if (i12 <= i22) {
                    yield.invoke(Integer.valueOf(REPLACEMENT_CODE_POINT));
                    Unit unit7 = Unit.INSTANCE;
                    int i23 = i15 + 1;
                    if (i12 <= i23 || (bArr[i23] & 192) != 128) {
                        i14 = 1;
                    } else {
                        int i24 = i15 + 2;
                        i14 = (i12 <= i24 || (bArr[i24] & 192) != 128) ? 2 : 3;
                    }
                } else {
                    byte b16 = bArr[i15 + 1];
                    if ((b16 & 192) == 128) {
                        byte b17 = bArr[i15 + 2];
                        if ((b17 & 192) == 128) {
                            byte b18 = bArr[i22];
                            if ((b18 & 192) == 128) {
                                int i25 = (((b18 ^ 3678080) ^ (b17 << 6)) ^ (b16 << 12)) ^ (b11 << 18);
                                yield.invoke((i25 <= 1114111 && (55296 > i25 || i25 >= 57344) && i25 >= 65536) ? Integer.valueOf(i25) : Integer.valueOf(REPLACEMENT_CODE_POINT));
                                Unit unit8 = Unit.INSTANCE;
                                i14 = 4;
                            } else {
                                yield.invoke(Integer.valueOf(REPLACEMENT_CODE_POINT));
                                Unit unit9 = Unit.INSTANCE;
                            }
                        } else {
                            yield.invoke(Integer.valueOf(REPLACEMENT_CODE_POINT));
                            Unit unit10 = Unit.INSTANCE;
                        }
                    } else {
                        yield.invoke(Integer.valueOf(REPLACEMENT_CODE_POINT));
                        Unit unit11 = Unit.INSTANCE;
                        i14 = 1;
                    }
                }
                i15 += i14;
            } else {
                yield.invoke(Integer.valueOf(REPLACEMENT_CODE_POINT));
                i15++;
            }
        }
    }

    @JvmOverloads
    @JvmName(name = "size")
    public static final long size(@NotNull String str, int i11) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return size$default(str, i11, 0, 2, null);
    }

    public static /* synthetic */ long size$default(String str, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = 0;
        }
        if ((i13 & 2) != 0) {
            i12 = str.length();
        }
        return size(str, i11, i12);
    }

    @JvmOverloads
    @JvmName(name = "size")
    public static final long size(@NotNull String str, int i11, int i12) {
        int i13;
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (i11 < 0) {
            throw new IllegalArgumentException(("beginIndex < 0: " + i11).toString());
        }
        if (i12 >= i11) {
            if (i12 > str.length()) {
                throw new IllegalArgumentException(("endIndex > string.length: " + i12 + " > " + str.length()).toString());
            }
            long j11 = 0;
            while (i11 < i12) {
                char cCharAt = str.charAt(i11);
                if (cCharAt < 128) {
                    j11++;
                } else {
                    if (cCharAt < 2048) {
                        i13 = 2;
                    } else if (cCharAt < 55296 || cCharAt > 57343) {
                        i13 = 3;
                    } else {
                        int i14 = i11 + 1;
                        char cCharAt2 = i14 < i12 ? str.charAt(i14) : (char) 0;
                        if (cCharAt > 56319 || cCharAt2 < 56320 || cCharAt2 > 57343) {
                            j11++;
                            i11 = i14;
                        } else {
                            j11 += (long) 4;
                            i11 += 2;
                        }
                    }
                    j11 += (long) i13;
                }
                i11++;
            }
            return j11;
        }
        throw new IllegalArgumentException(("endIndex < beginIndex: " + i12 + " < " + i11).toString());
    }
}
