package p852kotlin.p407io.encoding;

import androidx.exifinterface.media.ExifInterface;
import androidx.webkit.Profile;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.qcloud.tuicore.TUIConstants;
import io.flutter.plugin.editing.SpellCheckPlugin;
import java.io.IOException;
import java.nio.charset.Charset;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.SinceKotlin;
import p852kotlin.WasExperimental;
import p852kotlin.collections.AbstractList;
import p852kotlin.enums.EnumEntries;
import p852kotlin.enums.EnumEntriesKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.CharsKt;
import p852kotlin.text.Charsets;

/* JADX INFO: compiled from: Base64.kt */
/* JADX INFO: loaded from: classes61.dex */
@SinceKotlin(version = "2.2")
@Metadata(m90083d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0012\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0013\n\u0002\u0010\u0002\n\u0002\b\t\b\u0017\u0018\u0000 B2\u00020\u0001:\u0002ABB)\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\bH\u0007J\"\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0018\u001a\u00020\u00062\b\b\u0002\u0010\u0019\u001a\u00020\u0006J4\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u00162\b\b\u0002\u0010\u001c\u001a\u00020\u00062\b\b\u0002\u0010\u0018\u001a\u00020\u00062\b\b\u0002\u0010\u0019\u001a\u00020\u0006J\"\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0018\u001a\u00020\u00062\b\b\u0002\u0010\u0019\u001a\u00020\u0006J=\u0010\u001f\u001a\u0002H \"\f\b\u0000\u0010 *\u00060!j\u0002`\"2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u0002H 2\b\b\u0002\u0010\u0018\u001a\u00020\u00062\b\b\u0002\u0010\u0019\u001a\u00020\u0006¢\u0006\u0002\u0010#J\"\u0010$\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0018\u001a\u00020\u00062\b\b\u0002\u0010\u0019\u001a\u00020\u0006J4\u0010%\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u00162\b\b\u0002\u0010\u001c\u001a\u00020\u00062\b\b\u0002\u0010\u0018\u001a\u00020\u00062\b\b\u0002\u0010\u0019\u001a\u00020\u0006J\"\u0010$\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020&2\b\b\u0002\u0010\u0018\u001a\u00020\u00062\b\b\u0002\u0010\u0019\u001a\u00020\u0006J4\u0010%\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020&2\u0006\u0010\u001b\u001a\u00020\u00162\b\b\u0002\u0010\u001c\u001a\u00020\u00062\b\b\u0002\u0010\u0018\u001a\u00020\u00062\b\b\u0002\u0010\u0019\u001a\u00020\u0006J%\u0010'\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0006H\u0000¢\u0006\u0002\b(J5\u0010)\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0006H\u0000¢\u0006\u0002\b*J\u0015\u0010+\u001a\u00020\u00062\u0006\u0010,\u001a\u00020\u0006H\u0000¢\u0006\u0002\b-J\b\u0010.\u001a\u00020\u0003H\u0002J0\u0010/\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0006H\u0002J%\u00100\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0006H\u0000¢\u0006\u0002\b1J%\u00102\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020&2\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0006H\u0000¢\u0006\u0002\b3J\u0015\u00104\u001a\u00020\u001e2\u0006\u0010\u0017\u001a\u00020\u0016H\u0000¢\u0006\u0002\b5J(\u00106\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u00107\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u00108\u001a\u00020\u0006H\u0002J\u0010\u00109\u001a\u00020:2\u0006\u00107\u001a\u00020\u0006H\u0002J \u0010;\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0006H\u0002J%\u0010<\u001a\u00020:2\u0006\u0010,\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0006H\u0000¢\u0006\u0002\b=J \u0010>\u001a\u00020:2\u0006\u0010?\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u00062\u0006\u0010@\u001a\u00020\u0006H\u0002R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0004\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0014\u0010\u0005\u001a\u00020\u0006X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0007\u001a\u00020\bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006C"}, m90084d2 = {"Lkotlin/io/encoding/Base64;", "", "isUrlSafe", "", "isMimeScheme", "mimeLineLength", "", "paddingOption", "Lkotlin/io/encoding/Base64$PaddingOption;", "<init>", "(ZZILkotlin/io/encoding/Base64$PaddingOption;)V", "isUrlSafe$kotlin_stdlib", "()Z", "isMimeScheme$kotlin_stdlib", "getMimeLineLength$kotlin_stdlib", "()I", "getPaddingOption$kotlin_stdlib", "()Lkotlin/io/encoding/Base64$PaddingOption;", "mimeGroupsPerLine", "withPadding", TUIConstants.TUIPollPlugin.PLUGIN_POLL_OPTION_CONTENT, "encodeToByteArray", "", "source", SpellCheckPlugin.START_INDEX_KEY, SpellCheckPlugin.END_INDEX_KEY, "encodeIntoByteArray", FirebaseAnalytics.Param.DESTINATION, "destinationOffset", "encode", "", "encodeToAppendable", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "([BLjava/lang/Appendable;II)Ljava/lang/Appendable;", "decode", "decodeIntoByteArray", "", "encodeToByteArrayImpl", "encodeToByteArrayImpl$kotlin_stdlib", "encodeIntoByteArrayImpl", "encodeIntoByteArrayImpl$kotlin_stdlib", "encodeSize", "sourceSize", "encodeSize$kotlin_stdlib", "shouldPadOnEncode", "decodeImpl", "decodeSize", "decodeSize$kotlin_stdlib", "charsToBytesImpl", "charsToBytesImpl$kotlin_stdlib", "bytesToStringImpl", "bytesToStringImpl$kotlin_stdlib", "handlePaddingSymbol", "padIndex", "byteStart", "checkPaddingIsAllowed", "", "skipIllegalSymbolsIfMime", "checkSourceBounds", "checkSourceBounds$kotlin_stdlib", "checkDestinationBounds", "destinationSize", "capacityNeeded", "PaddingOption", Profile.DEFAULT_PROFILE_NAME, "kotlin-stdlib"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@WasExperimental(markerClass = {ExperimentalEncodingApi.class})
public class Base64 {

    @NotNull
    private static final Base64 Mime;

    @NotNull
    private static final Base64 Pem;

    @NotNull
    private static final Base64 UrlSafe;
    private static final int bitsPerByte = 8;
    private static final int bitsPerSymbol = 6;
    public static final int bytesPerGroup = 3;
    private static final int lineLengthMime = 76;
    private static final int lineLengthPem = 64;
    public static final byte padSymbol = 61;
    public static final int symbolsPerGroup = 4;
    private final boolean isMimeScheme;
    private final boolean isUrlSafe;
    private final int mimeGroupsPerLine;
    private final int mimeLineLength;

    @NotNull
    private final PaddingOption paddingOption;

    /* JADX INFO: renamed from: Default, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final byte[] mimeLineSeparatorSymbols = {13, 10};

    /* JADX INFO: renamed from: kotlin.io.encoding.Base64$Default, reason: from kotlin metadata */
    /* JADX INFO: compiled from: Base64.kt */
    @Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u00020\u000eX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0014\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0011\u0010\u0016\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013¨\u0006\u0018"}, m90084d2 = {"Lkotlin/io/encoding/Base64$Default;", "Lkotlin/io/encoding/Base64;", "<init>", "()V", "bitsPerByte", "", "bitsPerSymbol", "bytesPerGroup", "symbolsPerGroup", "padSymbol", "", "lineLengthMime", "lineLengthPem", "mimeLineSeparatorSymbols", "", "getMimeLineSeparatorSymbols$kotlin_stdlib", "()[B", "UrlSafe", "getUrlSafe", "()Lkotlin/io/encoding/Base64;", "Mime", "getMime", "Pem", "getPem", "kotlin-stdlib"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion extends Base64 {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
            super(false, false, -1, PaddingOption.PRESENT, null);
        }

        @NotNull
        public final Base64 getMime() {
            return Base64.Mime;
        }

        @NotNull
        public final byte[] getMimeLineSeparatorSymbols$kotlin_stdlib() {
            return Base64.mimeLineSeparatorSymbols;
        }

        @NotNull
        public final Base64 getPem() {
            return Base64.Pem;
        }

        @NotNull
        public final Base64 getUrlSafe() {
            return Base64.UrlSafe;
        }
    }

    /* JADX INFO: compiled from: Base64.kt */
    @SinceKotlin(version = "2.0")
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, m90084d2 = {"Lkotlin/io/encoding/Base64$PaddingOption;", "", "<init>", "(Ljava/lang/String;I)V", "PRESENT", "ABSENT", "PRESENT_OPTIONAL", "ABSENT_OPTIONAL", "kotlin-stdlib"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public enum PaddingOption {
        PRESENT,
        ABSENT,
        PRESENT_OPTIONAL,
        ABSENT_OPTIONAL;

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

        @NotNull
        public static EnumEntries<PaddingOption> getEntries() {
            return $ENTRIES;
        }
    }

    public /* synthetic */ Base64(boolean z11, boolean z12, int i11, PaddingOption paddingOption, DefaultConstructorMarker defaultConstructorMarker) {
        this(z11, z12, i11, paddingOption);
    }

    public static /* synthetic */ byte[] decode$default(Base64 base64, byte[] bArr, int i11, int i12, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decode");
        }
        if ((i13 & 2) != 0) {
            i11 = 0;
        }
        if ((i13 & 4) != 0) {
            i12 = bArr.length;
        }
        return base64.decode(bArr, i11, i12);
    }

    public static /* synthetic */ int decodeIntoByteArray$default(Base64 base64, byte[] bArr, byte[] bArr2, int i11, int i12, int i13, int i14, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decodeIntoByteArray");
        }
        if ((i14 & 4) != 0) {
            i11 = 0;
        }
        if ((i14 & 8) != 0) {
            i12 = 0;
        }
        if ((i14 & 16) != 0) {
            i13 = bArr.length;
        }
        return base64.decodeIntoByteArray(bArr, bArr2, i11, i12, i13);
    }

    private final int handlePaddingSymbol(byte[] source, int padIndex, int endIndex, int byteStart) {
        if (byteStart == -8) {
            throw new IllegalArgumentException("Redundant pad character at index " + padIndex);
        }
        if (byteStart == -6) {
            checkPaddingIsAllowed(padIndex);
            return padIndex + 1;
        }
        if (byteStart != -4) {
            if (byteStart == -2) {
                return padIndex + 1;
            }
            throw new IllegalStateException("Unreachable");
        }
        checkPaddingIsAllowed(padIndex);
        int iSkipIllegalSymbolsIfMime = skipIllegalSymbolsIfMime(source, padIndex + 1, endIndex);
        if (iSkipIllegalSymbolsIfMime != endIndex && source[iSkipIllegalSymbolsIfMime] == 61) {
            return iSkipIllegalSymbolsIfMime + 1;
        }
        throw new IllegalArgumentException("Missing one pad character at index " + iSkipIllegalSymbolsIfMime);
    }

    @NotNull
    public final byte[] decode(@NotNull byte[] source, int startIndex, int endIndex) {
        Intrinsics.checkNotNullParameter(source, "source");
        checkSourceBounds$kotlin_stdlib(source.length, startIndex, endIndex);
        int iDecodeSize$kotlin_stdlib = decodeSize$kotlin_stdlib(source, startIndex, endIndex);
        byte[] bArr = new byte[iDecodeSize$kotlin_stdlib];
        if (decodeImpl(source, bArr, 0, startIndex, endIndex) == iDecodeSize$kotlin_stdlib) {
            return bArr;
        }
        throw new IllegalStateException("Check failed.");
    }

    public final int decodeIntoByteArray(@NotNull byte[] source, @NotNull byte[] destination, int destinationOffset, int startIndex, int endIndex) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(destination, "destination");
        checkSourceBounds$kotlin_stdlib(source.length, startIndex, endIndex);
        checkDestinationBounds(destination.length, destinationOffset, decodeSize$kotlin_stdlib(source, startIndex, endIndex));
        return decodeImpl(source, destination, destinationOffset, startIndex, endIndex);
    }

    static {
        PaddingOption paddingOption = PaddingOption.PRESENT;
        UrlSafe = new Base64(true, false, -1, paddingOption);
        Mime = new Base64(false, true, 76, paddingOption);
        Pem = new Base64(false, true, 64, paddingOption);
    }

    private Base64(boolean z11, boolean z12, int i11, PaddingOption paddingOption) {
        this.isUrlSafe = z11;
        this.isMimeScheme = z12;
        this.mimeLineLength = i11;
        this.paddingOption = paddingOption;
        if (z11 && z12) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this.mimeGroupsPerLine = i11 / 4;
    }

    private final void checkDestinationBounds(int destinationSize, int destinationOffset, int capacityNeeded) {
        if (destinationOffset < 0 || destinationOffset > destinationSize) {
            throw new IndexOutOfBoundsException("destination offset: " + destinationOffset + ", destination size: " + destinationSize);
        }
        int i11 = destinationOffset + capacityNeeded;
        if (i11 < 0 || i11 > destinationSize) {
            throw new IndexOutOfBoundsException("The destination array does not have enough capacity, destination offset: " + destinationOffset + ", destination size: " + destinationSize + ", capacity needed: " + capacityNeeded);
        }
    }

    private final void checkPaddingIsAllowed(int padIndex) {
        if (this.paddingOption != PaddingOption.ABSENT) {
            return;
        }
        throw new IllegalArgumentException("The padding option is set to ABSENT, but the input has a pad character at index " + padIndex);
    }

    public static /* synthetic */ byte[] decode$default(Base64 base64, CharSequence charSequence, int i11, int i12, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decode");
        }
        if ((i13 & 2) != 0) {
            i11 = 0;
        }
        if ((i13 & 4) != 0) {
            i12 = charSequence.length();
        }
        return base64.decode(charSequence, i11, i12);
    }

    private final int decodeImpl(byte[] source, byte[] destination, int destinationOffset, int startIndex, int endIndex) {
        int i11;
        int i12;
        int i13;
        int[] iArr = this.isUrlSafe ? Base64Kt.base64UrlDecodeMap : Base64Kt.base64DecodeMap;
        int i14 = -8;
        int i15 = destinationOffset;
        int iHandlePaddingSymbol = startIndex;
        int i16 = -8;
        int i17 = 0;
        while (true) {
            if (iHandlePaddingSymbol >= endIndex) {
                i11 = 8;
                i12 = 0;
                break;
            }
            if (i16 != i14 || iHandlePaddingSymbol + 3 >= endIndex) {
                i11 = 8;
                i13 = 1;
            } else {
                i11 = 8;
                i13 = 1;
                int i18 = iHandlePaddingSymbol + 4;
                int i19 = (iArr[source[iHandlePaddingSymbol + 1] & 255] << 12) | (iArr[source[iHandlePaddingSymbol] & 255] << 18) | (iArr[source[iHandlePaddingSymbol + 2] & 255] << 6) | iArr[source[iHandlePaddingSymbol + 3] & 255];
                if (i19 >= 0) {
                    destination[i15] = (byte) (i19 >> 16);
                    int i21 = i15 + 2;
                    destination[i15 + 1] = (byte) (i19 >> 8);
                    i15 += 3;
                    destination[i21] = (byte) i19;
                    iHandlePaddingSymbol = i18;
                }
                i14 = -8;
            }
            int i22 = source[iHandlePaddingSymbol] & 255;
            int i23 = iArr[i22];
            if (i23 >= 0) {
                iHandlePaddingSymbol++;
                i17 = (i17 << 6) | i23;
                int i24 = i16 + 6;
                if (i24 >= 0) {
                    destination[i15] = (byte) (i17 >>> i24);
                    i17 &= (i13 << i24) - 1;
                    i16 -= 2;
                    i15++;
                } else {
                    i16 = i24;
                }
            } else {
                if (i23 == -2) {
                    iHandlePaddingSymbol = handlePaddingSymbol(source, iHandlePaddingSymbol, endIndex, i16);
                    i12 = i13;
                    break;
                }
                if (!this.isMimeScheme) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Invalid symbol '");
                    sb2.append((char) i22);
                    sb2.append("'(");
                    String string = Integer.toString(i22, CharsKt.checkRadix(i11));
                    Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                    sb2.append(string);
                    sb2.append(") at index ");
                    sb2.append(iHandlePaddingSymbol);
                    throw new IllegalArgumentException(sb2.toString());
                }
                iHandlePaddingSymbol++;
            }
            i14 = -8;
        }
        if (i16 == -2) {
            throw new IllegalArgumentException("The last unit of input does not have enough bits");
        }
        if (i16 != -8 && i12 == 0 && this.paddingOption == PaddingOption.PRESENT) {
            throw new IllegalArgumentException("The padding option is set to PRESENT, but the input is not properly padded");
        }
        if (i17 != 0) {
            throw new IllegalArgumentException("The pad bits must be zeros");
        }
        int iSkipIllegalSymbolsIfMime = skipIllegalSymbolsIfMime(source, iHandlePaddingSymbol, endIndex);
        if (iSkipIllegalSymbolsIfMime >= endIndex) {
            return i15 - destinationOffset;
        }
        int i25 = source[iSkipIllegalSymbolsIfMime] & 255;
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Symbol '");
        sb3.append((char) i25);
        sb3.append("'(");
        String string2 = Integer.toString(i25, CharsKt.checkRadix(i11));
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        sb3.append(string2);
        sb3.append(") at index ");
        sb3.append(iSkipIllegalSymbolsIfMime - 1);
        sb3.append(" is prohibited after the pad character");
        throw new IllegalArgumentException(sb3.toString());
    }

    public static /* synthetic */ String encode$default(Base64 base64, byte[] bArr, int i11, int i12, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: encode");
        }
        if ((i13 & 2) != 0) {
            i11 = 0;
        }
        if ((i13 & 4) != 0) {
            i12 = bArr.length;
        }
        return base64.encode(bArr, i11, i12);
    }

    public static /* synthetic */ int encodeIntoByteArray$default(Base64 base64, byte[] bArr, byte[] bArr2, int i11, int i12, int i13, int i14, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: encodeIntoByteArray");
        }
        if ((i14 & 4) != 0) {
            i11 = 0;
        }
        if ((i14 & 8) != 0) {
            i12 = 0;
        }
        if ((i14 & 16) != 0) {
            i13 = bArr.length;
        }
        return base64.encodeIntoByteArray(bArr, bArr2, i11, i12, i13);
    }

    public static /* synthetic */ Appendable encodeToAppendable$default(Base64 base64, byte[] bArr, Appendable appendable, int i11, int i12, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: encodeToAppendable");
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = bArr.length;
        }
        return base64.encodeToAppendable(bArr, appendable, i11, i12);
    }

    public static /* synthetic */ byte[] encodeToByteArray$default(Base64 base64, byte[] bArr, int i11, int i12, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: encodeToByteArray");
        }
        if ((i13 & 2) != 0) {
            i11 = 0;
        }
        if ((i13 & 4) != 0) {
            i12 = bArr.length;
        }
        return base64.encodeToByteArray(bArr, i11, i12);
    }

    private final boolean shouldPadOnEncode() {
        PaddingOption paddingOption = this.paddingOption;
        return paddingOption == PaddingOption.PRESENT || paddingOption == PaddingOption.PRESENT_OPTIONAL;
    }

    private final int skipIllegalSymbolsIfMime(byte[] source, int startIndex, int endIndex) {
        if (!this.isMimeScheme) {
            return startIndex;
        }
        while (startIndex < endIndex) {
            if (Base64Kt.base64DecodeMap[source[startIndex] & 255] != -1) {
                break;
            }
            startIndex++;
        }
        return startIndex;
    }

    public final void checkSourceBounds$kotlin_stdlib(int sourceSize, int startIndex, int endIndex) {
        AbstractList.INSTANCE.checkBoundsIndexes$kotlin_stdlib(startIndex, endIndex, sourceSize);
    }

    public final int encodeIntoByteArrayImpl$kotlin_stdlib(@NotNull byte[] source, @NotNull byte[] destination, int destinationOffset, int startIndex, int endIndex) {
        int i11 = startIndex;
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(destination, "destination");
        checkSourceBounds$kotlin_stdlib(source.length, i11, endIndex);
        checkDestinationBounds(destination.length, destinationOffset, encodeSize$kotlin_stdlib(endIndex - i11));
        byte[] bArr = this.isUrlSafe ? Base64Kt.base64UrlEncodeMap : Base64Kt.base64EncodeMap;
        int i12 = this.isMimeScheme ? this.mimeGroupsPerLine : Integer.MAX_VALUE;
        int i13 = destinationOffset;
        while (i11 + 2 < endIndex) {
            int iMin = Math.min((endIndex - i11) / 3, i12);
            for (int i14 = 0; i14 < iMin; i14++) {
                int i15 = source[i11] & 255;
                int i16 = i11 + 2;
                int i17 = source[i11 + 1] & 255;
                i11 += 3;
                int i18 = (i17 << 8) | (i15 << 16) | (source[i16] & 255);
                destination[i13] = bArr[i18 >>> 18];
                destination[i13 + 1] = bArr[(i18 >>> 12) & 63];
                int i19 = i13 + 3;
                destination[i13 + 2] = bArr[(i18 >>> 6) & 63];
                i13 += 4;
                destination[i19] = bArr[i18 & 63];
            }
            if (iMin == i12 && i11 != endIndex) {
                int i21 = i13 + 1;
                byte[] bArr2 = mimeLineSeparatorSymbols;
                destination[i13] = bArr2[0];
                i13 += 2;
                destination[i21] = bArr2[1];
            }
        }
        int i22 = endIndex - i11;
        if (i22 == 1) {
            int i23 = i11 + 1;
            int i24 = (source[i11] & 255) << 4;
            destination[i13] = bArr[i24 >>> 6];
            int i25 = i13 + 2;
            destination[i13 + 1] = bArr[i24 & 63];
            if (shouldPadOnEncode()) {
                int i26 = i13 + 3;
                destination[i25] = 61;
                i13 += 4;
                destination[i26] = 61;
                i11 = i23;
            } else {
                i11 = i23;
                i13 = i25;
            }
        } else if (i22 == 2) {
            int i27 = i11 + 1;
            int i28 = source[i11] & 255;
            i11 += 2;
            int i29 = ((source[i27] & 255) << 2) | (i28 << 10);
            destination[i13] = bArr[i29 >>> 12];
            destination[i13 + 1] = bArr[(i29 >>> 6) & 63];
            int i31 = i13 + 3;
            destination[i13 + 2] = bArr[i29 & 63];
            if (shouldPadOnEncode()) {
                i13 += 4;
                destination[i31] = 61;
            } else {
                i13 = i31;
            }
        }
        if (i11 == endIndex) {
            return i13 - destinationOffset;
        }
        throw new IllegalStateException("Check failed.");
    }

    public final int encodeSize$kotlin_stdlib(int sourceSize) {
        int i11 = sourceSize / 3;
        int i12 = sourceSize % 3;
        int i13 = i11 * 4;
        if (i12 != 0) {
            i13 += shouldPadOnEncode() ? 4 : i12 + 1;
        }
        if (i13 < 0) {
            throw new IllegalArgumentException("Input is too big");
        }
        if (this.isMimeScheme) {
            i13 += ((i13 - 1) / this.mimeLineLength) * 2;
        }
        if (i13 >= 0) {
            return i13;
        }
        throw new IllegalArgumentException("Input is too big");
    }

    /* JADX INFO: renamed from: getMimeLineLength$kotlin_stdlib, reason: from getter */
    public final int getMimeLineLength() {
        return this.mimeLineLength;
    }

    @NotNull
    /* JADX INFO: renamed from: getPaddingOption$kotlin_stdlib, reason: from getter */
    public final PaddingOption getPaddingOption() {
        return this.paddingOption;
    }

    /* JADX INFO: renamed from: isMimeScheme$kotlin_stdlib, reason: from getter */
    public final boolean getIsMimeScheme() {
        return this.isMimeScheme;
    }

    /* JADX INFO: renamed from: isUrlSafe$kotlin_stdlib, reason: from getter */
    public final boolean getIsUrlSafe() {
        return this.isUrlSafe;
    }

    @SinceKotlin(version = "2.0")
    @NotNull
    public final Base64 withPadding(@NotNull PaddingOption option) {
        Intrinsics.checkNotNullParameter(option, "option");
        return this.paddingOption == option ? this : new Base64(this.isUrlSafe, this.isMimeScheme, this.mimeLineLength, option);
    }

    public static /* synthetic */ int decodeIntoByteArray$default(Base64 base64, CharSequence charSequence, byte[] bArr, int i11, int i12, int i13, int i14, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decodeIntoByteArray");
        }
        if ((i14 & 4) != 0) {
            i11 = 0;
        }
        if ((i14 & 8) != 0) {
            i12 = 0;
        }
        if ((i14 & 16) != 0) {
            i13 = charSequence.length();
        }
        return base64.decodeIntoByteArray(charSequence, bArr, i11, i12, i13);
    }

    @NotNull
    public final String bytesToStringImpl$kotlin_stdlib(@NotNull byte[] source) {
        Intrinsics.checkNotNullParameter(source, "source");
        StringBuilder sb2 = new StringBuilder(source.length);
        for (byte b11 : source) {
            sb2.append((char) b11);
        }
        return sb2.toString();
    }

    @NotNull
    public final byte[] charsToBytesImpl$kotlin_stdlib(@NotNull CharSequence source, int startIndex, int endIndex) {
        Intrinsics.checkNotNullParameter(source, "source");
        checkSourceBounds$kotlin_stdlib(source.length(), startIndex, endIndex);
        byte[] bArr = new byte[endIndex - startIndex];
        int i11 = 0;
        while (startIndex < endIndex) {
            char cCharAt = source.charAt(startIndex);
            if (cCharAt <= 255) {
                bArr[i11] = (byte) cCharAt;
                i11++;
            } else {
                bArr[i11] = 63;
                i11++;
            }
            startIndex++;
        }
        return bArr;
    }

    public final int decodeSize$kotlin_stdlib(@NotNull byte[] source, int startIndex, int endIndex) {
        Intrinsics.checkNotNullParameter(source, "source");
        int i11 = endIndex - startIndex;
        if (i11 == 0) {
            return 0;
        }
        if (i11 != 1) {
            if (this.isMimeScheme) {
                while (startIndex < endIndex) {
                    int i12 = Base64Kt.base64DecodeMap[source[startIndex] & 255];
                    if (i12 < 0) {
                        if (i12 == -2) {
                            i11 -= endIndex - startIndex;
                            break;
                        }
                        i11--;
                    }
                    startIndex++;
                }
            } else if (source[endIndex - 1] == 61) {
                int i13 = i11 - 1;
                if (source[endIndex - 2] == 61) {
                    i11 -= 2;
                } else {
                    i11 = i13;
                }
            }
            return (int) ((((long) i11) * ((long) 6)) / ((long) 8));
        }
        throw new IllegalArgumentException("Input should have at least 2 symbols for Base64 decoding, startIndex: " + startIndex + ", endIndex: " + endIndex);
    }

    @NotNull
    public final String encode(@NotNull byte[] source, int startIndex, int endIndex) {
        Intrinsics.checkNotNullParameter(source, "source");
        return new String(encodeToByteArrayImpl$kotlin_stdlib(source, startIndex, endIndex), Charsets.ISO_8859_1);
    }

    public final int encodeIntoByteArray(@NotNull byte[] source, @NotNull byte[] destination, int destinationOffset, int startIndex, int endIndex) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(destination, "destination");
        return encodeIntoByteArrayImpl$kotlin_stdlib(source, destination, destinationOffset, startIndex, endIndex);
    }

    @NotNull
    public final <A extends Appendable> A encodeToAppendable(@NotNull byte[] source, @NotNull A destination, int startIndex, int endIndex) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(destination, "destination");
        destination.append(new String(encodeToByteArrayImpl$kotlin_stdlib(source, startIndex, endIndex), Charsets.ISO_8859_1));
        return destination;
    }

    @NotNull
    public final byte[] encodeToByteArray(@NotNull byte[] source, int startIndex, int endIndex) {
        Intrinsics.checkNotNullParameter(source, "source");
        return encodeToByteArrayImpl$kotlin_stdlib(source, startIndex, endIndex);
    }

    @NotNull
    public final byte[] encodeToByteArrayImpl$kotlin_stdlib(@NotNull byte[] source, int startIndex, int endIndex) {
        Intrinsics.checkNotNullParameter(source, "source");
        checkSourceBounds$kotlin_stdlib(source.length, startIndex, endIndex);
        byte[] bArr = new byte[encodeSize$kotlin_stdlib(endIndex - startIndex)];
        encodeIntoByteArrayImpl$kotlin_stdlib(source, bArr, 0, startIndex, endIndex);
        return bArr;
    }

    public final int decodeIntoByteArray(@NotNull CharSequence source, @NotNull byte[] destination, int destinationOffset, int startIndex, int endIndex) {
        byte[] bArrCharsToBytesImpl$kotlin_stdlib;
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(destination, "destination");
        if (source instanceof String) {
            String str = (String) source;
            checkSourceBounds$kotlin_stdlib(str.length(), startIndex, endIndex);
            String strSubstring = str.substring(startIndex, endIndex);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            Charset charset = Charsets.ISO_8859_1;
            Intrinsics.checkNotNull(strSubstring, "null cannot be cast to non-null type java.lang.String");
            bArrCharsToBytesImpl$kotlin_stdlib = strSubstring.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(bArrCharsToBytesImpl$kotlin_stdlib, "getBytes(...)");
        } else {
            bArrCharsToBytesImpl$kotlin_stdlib = charsToBytesImpl$kotlin_stdlib(source, startIndex, endIndex);
        }
        return decodeIntoByteArray$default(this, bArrCharsToBytesImpl$kotlin_stdlib, destination, destinationOffset, 0, 0, 24, (Object) null);
    }

    @NotNull
    public final byte[] decode(@NotNull CharSequence source, int startIndex, int endIndex) {
        byte[] bArrCharsToBytesImpl$kotlin_stdlib;
        Intrinsics.checkNotNullParameter(source, "source");
        if (source instanceof String) {
            String str = (String) source;
            checkSourceBounds$kotlin_stdlib(str.length(), startIndex, endIndex);
            String strSubstring = str.substring(startIndex, endIndex);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            Charset charset = Charsets.ISO_8859_1;
            Intrinsics.checkNotNull(strSubstring, "null cannot be cast to non-null type java.lang.String");
            bArrCharsToBytesImpl$kotlin_stdlib = strSubstring.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(bArrCharsToBytesImpl$kotlin_stdlib, "getBytes(...)");
        } else {
            bArrCharsToBytesImpl$kotlin_stdlib = charsToBytesImpl$kotlin_stdlib(source, startIndex, endIndex);
        }
        return decode$default(this, bArrCharsToBytesImpl$kotlin_stdlib, 0, 0, 6, (Object) null);
    }
}
