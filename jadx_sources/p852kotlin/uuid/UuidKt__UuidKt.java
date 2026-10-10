package p852kotlin.uuid;

import io.flutter.plugin.editing.SpellCheckPlugin;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.collections.ArraysKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.HexExtensionsKt;

/* JADX INFO: compiled from: Uuid.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000b\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0001\u001a\u0014\u0010\u0004\u001a\u00020\u0005*\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u0000\u001a,\u0010\b\u001a\u00020\t*\u00020\u00052\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0007H\u0001\u001a\u0014\u0010\u000e\u001a\u00020\t*\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u0007H\u0000\u001a\u001c\u0010\u0010\u001a\u00020\t*\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0005H\u0000\u001a\u0010\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u000fH\u0001\u001a\u0010\u0010\u0014\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u000fH\u0001\u001a\u0019\u0010\u0016\u001a\u00020\u000f*\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u0007H\u0002¢\u0006\u0002\b\u0018\u001a\u0019\u0010\u0016\u001a\u00020\u000f*\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u0007H\u0002¢\u0006\u0002\b\u0018¨\u0006\u001a"}, m90084d2 = {"uuidFromRandomBytes", "Lkotlin/uuid/Uuid;", "randomBytes", "", "getLongAtCommonImpl", "", "index", "", "formatBytesIntoCommonImpl", "", "dst", "dstOffset", SpellCheckPlugin.START_INDEX_KEY, SpellCheckPlugin.END_INDEX_KEY, "checkHyphenAt", "", "setLongAtCommonImpl", "value", "uuidParseHexDashCommonImpl", "hexDashString", "uuidParseHexCommonImpl", "hexString", "truncateForErrorMessage", "maxLength", "truncateForErrorMessage$UuidKt__UuidKt", "maxSize", "kotlin-stdlib"}, m90085k = 5, m90086mv = {2, 2, 0}, m90088xi = 49, m90089xs = "kotlin/uuid/UuidKt")
@SourceDebugExtension({"SMAP\nUuid.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Uuid.kt\nkotlin/uuid/UuidKt__UuidKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,648:1\n1#2:649\n*E\n"})
class UuidKt__UuidKt extends UuidKt__UuidJVMKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final String truncateForErrorMessage$UuidKt__UuidKt(String str, int i11) {
        if (str.length() <= i11) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        Intrinsics.checkNotNull(str, "null cannot be cast to non-null type java.lang.String");
        String strSubstring = str.substring(0, i11);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        sb2.append(strSubstring);
        sb2.append("...");
        return sb2.toString();
    }

    public static final void checkHyphenAt(@NotNull String str, int i11) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (str.charAt(i11) == '-') {
            return;
        }
        throw new IllegalArgumentException(("Expected '-' (hyphen) at index " + i11 + ", but was '" + str.charAt(i11) + '\'').toString());
    }

    @ExperimentalUuidApi
    public static final void formatBytesIntoCommonImpl(long j11, @NotNull byte[] dst, int i11, int i12, int i13) {
        Intrinsics.checkNotNullParameter(dst, "dst");
        int i14 = 7 - i12;
        int i15 = 8 - i13;
        if (i15 > i14) {
            return;
        }
        while (true) {
            int i16 = HexExtensionsKt.getBYTE_TO_LOWER_CASE_HEX_DIGITS()[(int) ((j11 >> (i14 << 3)) & 255)];
            int i17 = i11 + 1;
            dst[i11] = (byte) (i16 >> 8);
            i11 += 2;
            dst[i17] = (byte) i16;
            if (i14 == i15) {
                return;
            } else {
                i14--;
            }
        }
    }

    public static final long getLongAtCommonImpl(@NotNull byte[] bArr, int i11) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return (((long) bArr[i11 + 7]) & 255) | ((((long) bArr[i11]) & 255) << 56) | ((((long) bArr[i11 + 1]) & 255) << 48) | ((((long) bArr[i11 + 2]) & 255) << 40) | ((((long) bArr[i11 + 3]) & 255) << 32) | ((((long) bArr[i11 + 4]) & 255) << 24) | ((((long) bArr[i11 + 5]) & 255) << 16) | ((((long) bArr[i11 + 6]) & 255) << 8);
    }

    public static final void setLongAtCommonImpl(@NotNull byte[] bArr, int i11, long j11) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        int i12 = 7;
        while (-1 < i12) {
            bArr[i11] = (byte) (j11 >> (i12 << 3));
            i12--;
            i11++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String truncateForErrorMessage$UuidKt__UuidKt(byte[] bArr, int i11) {
        return ArraysKt.joinToString$default(bArr, (CharSequence) null, (CharSequence) "[", (CharSequence) "]", i11, (CharSequence) null, (Function1) null, 49, (Object) null);
    }

    @ExperimentalUuidApi
    @NotNull
    public static final Uuid uuidFromRandomBytes(@NotNull byte[] randomBytes) {
        Intrinsics.checkNotNullParameter(randomBytes, "randomBytes");
        byte b11 = (byte) (randomBytes[6] & 15);
        randomBytes[6] = b11;
        randomBytes[6] = (byte) (b11 | 64);
        byte b12 = (byte) (randomBytes[8] & 63);
        randomBytes[8] = b12;
        randomBytes[8] = (byte) (b12 | 128);
        return Uuid.Companion.fromByteArray(randomBytes);
    }

    @ExperimentalUuidApi
    @NotNull
    public static final Uuid uuidParseHexCommonImpl(@NotNull String hexString) {
        Intrinsics.checkNotNullParameter(hexString, "hexString");
        return Uuid.Companion.fromLongs(HexExtensionsKt.hexToLong$default(hexString, 0, 16, null, 4, null), HexExtensionsKt.hexToLong$default(hexString, 16, 32, null, 4, null));
    }

    @ExperimentalUuidApi
    @NotNull
    public static final Uuid uuidParseHexDashCommonImpl(@NotNull String hexDashString) {
        Intrinsics.checkNotNullParameter(hexDashString, "hexDashString");
        long jHexToLong$default = HexExtensionsKt.hexToLong$default(hexDashString, 0, 8, null, 4, null);
        checkHyphenAt(hexDashString, 8);
        long jHexToLong$default2 = HexExtensionsKt.hexToLong$default(hexDashString, 9, 13, null, 4, null);
        checkHyphenAt(hexDashString, 13);
        long jHexToLong$default3 = HexExtensionsKt.hexToLong$default(hexDashString, 14, 18, null, 4, null);
        checkHyphenAt(hexDashString, 18);
        long jHexToLong$default4 = HexExtensionsKt.hexToLong$default(hexDashString, 19, 23, null, 4, null);
        checkHyphenAt(hexDashString, 23);
        return Uuid.Companion.fromLongs((jHexToLong$default2 << 16) | (jHexToLong$default << 32) | jHexToLong$default3, (jHexToLong$default4 << 48) | HexExtensionsKt.hexToLong$default(hexDashString, 24, 36, null, 4, null));
    }
}
