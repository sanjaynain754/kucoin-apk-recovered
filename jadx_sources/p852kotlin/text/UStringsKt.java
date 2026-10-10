package p852kotlin.text;

import io.flutter.embedding.android.KeyboardMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.C41089a;
import p852kotlin.C41154d;
import p852kotlin.KotlinNothingValueException;
import p852kotlin.Metadata;
import p852kotlin.SinceKotlin;
import p852kotlin.UByte;
import p852kotlin.UInt;
import p852kotlin.ULong;
import p852kotlin.UShort;
import p852kotlin.UnsignedKt;
import p852kotlin.jvm.JvmName;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: UStrings.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\u001a\u001b\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001b\u0010\u0000\u001a\u00020\u0001*\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\t\u001a\u001b\u0010\u0000\u001a\u00020\u0001*\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a\u001b\u0010\u0000\u001a\u00020\u0001*\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0011\u0010\u0010\u001a\u00020\u0002*\u00020\u0001H\u0007¢\u0006\u0002\u0010\u0011\u001a\u0019\u0010\u0010\u001a\u00020\u0002*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0007¢\u0006\u0002\u0010\u0012\u001a\u0011\u0010\u0013\u001a\u00020\u0007*\u00020\u0001H\u0007¢\u0006\u0002\u0010\u0014\u001a\u0019\u0010\u0013\u001a\u00020\u0007*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0007¢\u0006\u0002\u0010\u0015\u001a\u0011\u0010\u0016\u001a\u00020\n*\u00020\u0001H\u0007¢\u0006\u0002\u0010\u0017\u001a\u0019\u0010\u0016\u001a\u00020\n*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0007¢\u0006\u0002\u0010\u0018\u001a\u0011\u0010\u0019\u001a\u00020\r*\u00020\u0001H\u0007¢\u0006\u0002\u0010\u001a\u001a\u0019\u0010\u0019\u001a\u00020\r*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0007¢\u0006\u0002\u0010\u001b\u001a\u000e\u0010\u001c\u001a\u0004\u0018\u00010\u0002*\u00020\u0001H\u0007\u001a\u0016\u0010\u001c\u001a\u0004\u0018\u00010\u0002*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0007\u001a\u000e\u0010\u001d\u001a\u0004\u0018\u00010\u0007*\u00020\u0001H\u0007\u001a\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u0007*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0007\u001a\u000e\u0010\u001e\u001a\u0004\u0018\u00010\n*\u00020\u0001H\u0007\u001a\u0016\u0010\u001e\u001a\u0004\u0018\u00010\n*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0007\u001a\u000e\u0010\u001f\u001a\u0004\u0018\u00010\r*\u00020\u0001H\u0007\u001a\u0016\u0010\u001f\u001a\u0004\u0018\u00010\r*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006 "}, m90084d2 = {"toString", "", "Lkotlin/UByte;", "radix", "", "toString-LxnNnR4", "(BI)Ljava/lang/String;", "Lkotlin/UShort;", "toString-olVBNx4", "(SI)Ljava/lang/String;", "Lkotlin/UInt;", "toString-V7xB4Y4", "(II)Ljava/lang/String;", "Lkotlin/ULong;", "toString-JSWoG40", "(JI)Ljava/lang/String;", "toUByte", "(Ljava/lang/String;)B", "(Ljava/lang/String;I)B", "toUShort", "(Ljava/lang/String;)S", "(Ljava/lang/String;I)S", "toUInt", "(Ljava/lang/String;)I", "(Ljava/lang/String;I)I", "toULong", "(Ljava/lang/String;)J", "(Ljava/lang/String;I)J", "toUByteOrNull", "toUShortOrNull", "toUIntOrNull", "toULongOrNull", "kotlin-stdlib"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
@JvmName(name = "UStringsKt")
public final class UStringsKt {
    @SinceKotlin(version = "1.5")
    public static final byte toUByte(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        UByte uByteOrNull = toUByteOrNull(str);
        if (uByteOrNull != null) {
            return uByteOrNull.getData();
        }
        StringsKt__StringNumberConversionsKt.numberFormatError(str);
        throw new KotlinNothingValueException();
    }

    @SinceKotlin(version = "1.5")
    @Nullable
    public static final UByte toUByteOrNull(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return toUByteOrNull(str, 10);
    }

    @SinceKotlin(version = "1.5")
    public static final int toUInt(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        UInt uIntOrNull = toUIntOrNull(str);
        if (uIntOrNull != null) {
            return uIntOrNull.getData();
        }
        StringsKt__StringNumberConversionsKt.numberFormatError(str);
        throw new KotlinNothingValueException();
    }

    @SinceKotlin(version = "1.5")
    @Nullable
    public static final UInt toUIntOrNull(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return toUIntOrNull(str, 10);
    }

    @SinceKotlin(version = "1.5")
    public static final long toULong(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        ULong uLongOrNull = toULongOrNull(str);
        if (uLongOrNull != null) {
            return uLongOrNull.getData();
        }
        StringsKt__StringNumberConversionsKt.numberFormatError(str);
        throw new KotlinNothingValueException();
    }

    @SinceKotlin(version = "1.5")
    @Nullable
    public static final ULong toULongOrNull(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return toULongOrNull(str, 10);
    }

    @SinceKotlin(version = "1.5")
    public static final short toUShort(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        UShort uShortOrNull = toUShortOrNull(str);
        if (uShortOrNull != null) {
            return uShortOrNull.getData();
        }
        StringsKt__StringNumberConversionsKt.numberFormatError(str);
        throw new KotlinNothingValueException();
    }

    @SinceKotlin(version = "1.5")
    @Nullable
    public static final UShort toUShortOrNull(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return toUShortOrNull(str, 10);
    }

    @SinceKotlin(version = "1.5")
    @NotNull
    /* JADX INFO: renamed from: toString-LxnNnR4, reason: not valid java name */
    public static final String m105174toStringLxnNnR4(byte b11, int i11) {
        String string = Integer.toString(b11 & 255, CharsKt__CharJVMKt.checkRadix(i11));
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @SinceKotlin(version = "1.5")
    public static final byte toUByte(@NotNull String str, int i11) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        UByte uByteOrNull = toUByteOrNull(str, i11);
        if (uByteOrNull != null) {
            return uByteOrNull.getData();
        }
        StringsKt__StringNumberConversionsKt.numberFormatError(str);
        throw new KotlinNothingValueException();
    }

    @SinceKotlin(version = "1.5")
    @Nullable
    public static final UByte toUByteOrNull(@NotNull String str, int i11) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        UInt uIntOrNull = toUIntOrNull(str, i11);
        if (uIntOrNull == null) {
            return null;
        }
        int data = uIntOrNull.getData();
        if (Integer.compare(data ^ Integer.MIN_VALUE, UInt.m103939constructorimpl(255) ^ Integer.MIN_VALUE) > 0) {
            return null;
        }
        return UByte.m103856boximpl(UByte.m103862constructorimpl((byte) data));
    }

    @SinceKotlin(version = "1.5")
    public static final int toUInt(@NotNull String str, int i11) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        UInt uIntOrNull = toUIntOrNull(str, i11);
        if (uIntOrNull != null) {
            return uIntOrNull.getData();
        }
        StringsKt__StringNumberConversionsKt.numberFormatError(str);
        throw new KotlinNothingValueException();
    }

    @SinceKotlin(version = "1.5")
    @Nullable
    public static final UInt toUIntOrNull(@NotNull String str, int i11) {
        int i12;
        Intrinsics.checkNotNullParameter(str, "<this>");
        CharsKt__CharJVMKt.checkRadix(i11);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i13 = 0;
        char cCharAt = str.charAt(0);
        if (Intrinsics.compare((int) cCharAt, 48) < 0) {
            i12 = 1;
            if (length == 1 || cCharAt != '+') {
                return null;
            }
        } else {
            i12 = 0;
        }
        int iM103939constructorimpl = UInt.m103939constructorimpl(i11);
        int iM90092a = 119304647;
        while (i12 < length) {
            int iDigitOf = CharsKt__CharJVMKt.digitOf(str.charAt(i12), i11);
            if (iDigitOf < 0) {
                return null;
            }
            if (Integer.compare(i13 ^ Integer.MIN_VALUE, iM90092a ^ Integer.MIN_VALUE) > 0) {
                if (iM90092a == 119304647) {
                    iM90092a = C41089a.m90092a(-1, iM103939constructorimpl);
                    if (Integer.compare(i13 ^ Integer.MIN_VALUE, iM90092a ^ Integer.MIN_VALUE) > 0) {
                    }
                }
                return null;
            }
            int iM103939constructorimpl2 = UInt.m103939constructorimpl(i13 * iM103939constructorimpl);
            int iM103939constructorimpl3 = UInt.m103939constructorimpl(UInt.m103939constructorimpl(iDigitOf) + iM103939constructorimpl2);
            if (Integer.compare(iM103939constructorimpl3 ^ Integer.MIN_VALUE, iM103939constructorimpl2 ^ Integer.MIN_VALUE) < 0) {
                return null;
            }
            i12++;
            i13 = iM103939constructorimpl3;
        }
        return UInt.m103933boximpl(i13);
    }

    @SinceKotlin(version = "1.5")
    public static final long toULong(@NotNull String str, int i11) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        ULong uLongOrNull = toULongOrNull(str, i11);
        if (uLongOrNull != null) {
            return uLongOrNull.getData();
        }
        StringsKt__StringNumberConversionsKt.numberFormatError(str);
        throw new KotlinNothingValueException();
    }

    @SinceKotlin(version = "1.5")
    @Nullable
    public static final ULong toULongOrNull(@NotNull String str, int i11) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        CharsKt__CharJVMKt.checkRadix(i11);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i12 = 0;
        char cCharAt = str.charAt(0);
        if (Intrinsics.compare((int) cCharAt, 48) < 0) {
            i12 = 1;
            if (length == 1 || cCharAt != '+') {
                return null;
            }
        }
        long jM104018constructorimpl = ULong.m104018constructorimpl(i11);
        long j11 = 0;
        long jM90129a = 512409557603043100L;
        while (i12 < length) {
            int iDigitOf = CharsKt__CharJVMKt.digitOf(str.charAt(i12), i11);
            if (iDigitOf < 0) {
                return null;
            }
            if (Long.compare(j11 ^ Long.MIN_VALUE, jM90129a ^ Long.MIN_VALUE) > 0) {
                if (jM90129a == 512409557603043100L) {
                    jM90129a = C41154d.m90129a(-1L, jM104018constructorimpl);
                    if (Long.compare(j11 ^ Long.MIN_VALUE, jM90129a ^ Long.MIN_VALUE) > 0) {
                    }
                }
                return null;
            }
            long jM104018constructorimpl2 = ULong.m104018constructorimpl(j11 * jM104018constructorimpl);
            long jM104018constructorimpl3 = ULong.m104018constructorimpl(ULong.m104018constructorimpl(((long) UInt.m103939constructorimpl(iDigitOf)) & KeyboardMap.kValueMask) + jM104018constructorimpl2);
            if (Long.compare(jM104018constructorimpl3 ^ Long.MIN_VALUE, jM104018constructorimpl2 ^ Long.MIN_VALUE) < 0) {
                return null;
            }
            i12++;
            j11 = jM104018constructorimpl3;
        }
        return ULong.m104012boximpl(j11);
    }

    @SinceKotlin(version = "1.5")
    public static final short toUShort(@NotNull String str, int i11) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        UShort uShortOrNull = toUShortOrNull(str, i11);
        if (uShortOrNull != null) {
            return uShortOrNull.getData();
        }
        StringsKt__StringNumberConversionsKt.numberFormatError(str);
        throw new KotlinNothingValueException();
    }

    @SinceKotlin(version = "1.5")
    @Nullable
    public static final UShort toUShortOrNull(@NotNull String str, int i11) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        UInt uIntOrNull = toUIntOrNull(str, i11);
        if (uIntOrNull == null) {
            return null;
        }
        int data = uIntOrNull.getData();
        if (Integer.compare(data ^ Integer.MIN_VALUE, UInt.m103939constructorimpl(65535) ^ Integer.MIN_VALUE) > 0) {
            return null;
        }
        return UShort.m104119boximpl(UShort.m104125constructorimpl((short) data));
    }

    @SinceKotlin(version = "1.5")
    @NotNull
    /* JADX INFO: renamed from: toString-JSWoG40, reason: not valid java name */
    public static final String m105173toStringJSWoG40(long j11, int i11) {
        return UnsignedKt.ulongToString(j11, CharsKt__CharJVMKt.checkRadix(i11));
    }

    @SinceKotlin(version = "1.5")
    @NotNull
    /* JADX INFO: renamed from: toString-V7xB4Y4, reason: not valid java name */
    public static final String m105175toStringV7xB4Y4(int i11, int i12) {
        return UnsignedKt.ulongToString(((long) i11) & KeyboardMap.kValueMask, CharsKt__CharJVMKt.checkRadix(i12));
    }

    @SinceKotlin(version = "1.5")
    @NotNull
    /* JADX INFO: renamed from: toString-olVBNx4, reason: not valid java name */
    public static final String m105176toStringolVBNx4(short s11, int i11) {
        String string = Integer.toString(s11 & UShort.MAX_VALUE, CharsKt__CharJVMKt.checkRadix(i11));
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }
}
