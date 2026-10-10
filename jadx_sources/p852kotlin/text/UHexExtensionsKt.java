package p852kotlin.text;

import com.tencent.qcloud.tuicore.TUIConstants;
import io.flutter.plugin.editing.SpellCheckPlugin;
import p852kotlin.ExperimentalStdlibApi;
import p852kotlin.ExperimentalUnsignedTypes;
import p852kotlin.Metadata;
import p852kotlin.SinceKotlin;
import p852kotlin.UByte;
import p852kotlin.UByteArray;
import p852kotlin.UInt;
import p852kotlin.ULong;
import p852kotlin.UShort;
import p852kotlin.WasExperimental;
import p852kotlin.internal.InlineOnly;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: UHexExtensions.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000<\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u0087\b¢\u0006\u0004\b\u0005\u0010\u0006\u001a2\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u0087\b¢\u0006\u0004\b\n\u0010\u000b\u001a\u001c\u0010\f\u001a\u00020\u0002*\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u0087\b¢\u0006\u0002\u0010\r\u001a\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u000e2\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u0087\b¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001c\u0010\u0011\u001a\u00020\u000e*\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u0087\b¢\u0006\u0002\u0010\u0012\u001a\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00132\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u0087\b¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u001c\u0010\u0016\u001a\u00020\u0013*\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u0087\b¢\u0006\u0002\u0010\u0017\u001a\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00182\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u0087\b¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u001c\u0010\u001b\u001a\u00020\u0018*\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u0087\b¢\u0006\u0002\u0010\u001c\u001a\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u001d2\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u0087\b¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u001c\u0010 \u001a\u00020\u001d*\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u0087\b¢\u0006\u0002\u0010!¨\u0006\""}, m90084d2 = {"toHexString", "", "Lkotlin/UByteArray;", TUIConstants.TUIGroupNotePlugin.PLUGIN_GROUP_NOTE_FORMAT, "Lkotlin/text/HexFormat;", "toHexString-zHuV2wU", "([BLkotlin/text/HexFormat;)Ljava/lang/String;", SpellCheckPlugin.START_INDEX_KEY, "", SpellCheckPlugin.END_INDEX_KEY, "toHexString-lZCiFrA", "([BIILkotlin/text/HexFormat;)Ljava/lang/String;", "hexToUByteArray", "(Ljava/lang/String;Lkotlin/text/HexFormat;)[B", "Lkotlin/UByte;", "toHexString-ZQbaR00", "(BLkotlin/text/HexFormat;)Ljava/lang/String;", "hexToUByte", "(Ljava/lang/String;Lkotlin/text/HexFormat;)B", "Lkotlin/UShort;", "toHexString-r3ox_E0", "(SLkotlin/text/HexFormat;)Ljava/lang/String;", "hexToUShort", "(Ljava/lang/String;Lkotlin/text/HexFormat;)S", "Lkotlin/UInt;", "toHexString-8M7LxHw", "(ILkotlin/text/HexFormat;)Ljava/lang/String;", "hexToUInt", "(Ljava/lang/String;Lkotlin/text/HexFormat;)I", "Lkotlin/ULong;", "toHexString-8UJCm-I", "(JLkotlin/text/HexFormat;)Ljava/lang/String;", "hexToULong", "(Ljava/lang/String;Lkotlin/text/HexFormat;)J", "kotlin-stdlib"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class UHexExtensionsKt {
    @SinceKotlin(version = "2.2")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final byte hexToUByte(String str, HexFormat format) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        return UByte.m103862constructorimpl(HexExtensionsKt.hexToByte(str, format));
    }

    public static /* synthetic */ byte hexToUByte$default(String str, HexFormat format, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            format = HexFormat.INSTANCE.getDefault();
        }
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        return UByte.m103862constructorimpl(HexExtensionsKt.hexToByte(str, format));
    }

    @SinceKotlin(version = "2.2")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    private static final byte[] hexToUByteArray(String str, HexFormat format) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        return UByteArray.m103915constructorimpl(HexExtensionsKt.hexToByteArray(str, format));
    }

    public static /* synthetic */ byte[] hexToUByteArray$default(String str, HexFormat format, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            format = HexFormat.INSTANCE.getDefault();
        }
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        return UByteArray.m103915constructorimpl(HexExtensionsKt.hexToByteArray(str, format));
    }

    @SinceKotlin(version = "2.2")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final int hexToUInt(String str, HexFormat format) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        return UInt.m103939constructorimpl(HexExtensionsKt.hexToInt(str, format));
    }

    public static /* synthetic */ int hexToUInt$default(String str, HexFormat format, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            format = HexFormat.INSTANCE.getDefault();
        }
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        return UInt.m103939constructorimpl(HexExtensionsKt.hexToInt(str, format));
    }

    @SinceKotlin(version = "2.2")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final long hexToULong(String str, HexFormat format) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        return ULong.m104018constructorimpl(HexExtensionsKt.hexToLong(str, format));
    }

    public static /* synthetic */ long hexToULong$default(String str, HexFormat format, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            format = HexFormat.INSTANCE.getDefault();
        }
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        return ULong.m104018constructorimpl(HexExtensionsKt.hexToLong(str, format));
    }

    @SinceKotlin(version = "2.2")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final short hexToUShort(String str, HexFormat format) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        return UShort.m104125constructorimpl(HexExtensionsKt.hexToShort(str, format));
    }

    public static /* synthetic */ short hexToUShort$default(String str, HexFormat format, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            format = HexFormat.INSTANCE.getDefault();
        }
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        return UShort.m104125constructorimpl(HexExtensionsKt.hexToShort(str, format));
    }

    @SinceKotlin(version = "2.2")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    /* JADX INFO: renamed from: toHexString-8M7LxHw, reason: not valid java name */
    private static final String m105161toHexString8M7LxHw(int i11, HexFormat format) {
        Intrinsics.checkNotNullParameter(format, "format");
        return HexExtensionsKt.toHexString(i11, format);
    }

    /* JADX INFO: renamed from: toHexString-8M7LxHw$default, reason: not valid java name */
    public static /* synthetic */ String m105162toHexString8M7LxHw$default(int i11, HexFormat format, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            format = HexFormat.INSTANCE.getDefault();
        }
        Intrinsics.checkNotNullParameter(format, "format");
        return HexExtensionsKt.toHexString(i11, format);
    }

    @SinceKotlin(version = "2.2")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    /* JADX INFO: renamed from: toHexString-8UJCm-I, reason: not valid java name */
    private static final String m105163toHexString8UJCmI(long j11, HexFormat format) {
        Intrinsics.checkNotNullParameter(format, "format");
        return HexExtensionsKt.toHexString(j11, format);
    }

    /* JADX INFO: renamed from: toHexString-8UJCm-I$default, reason: not valid java name */
    public static /* synthetic */ String m105164toHexString8UJCmI$default(long j11, HexFormat format, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            format = HexFormat.INSTANCE.getDefault();
        }
        Intrinsics.checkNotNullParameter(format, "format");
        return HexExtensionsKt.toHexString(j11, format);
    }

    @SinceKotlin(version = "2.2")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    /* JADX INFO: renamed from: toHexString-ZQbaR00, reason: not valid java name */
    private static final String m105165toHexStringZQbaR00(byte b11, HexFormat format) {
        Intrinsics.checkNotNullParameter(format, "format");
        return HexExtensionsKt.toHexString(b11, format);
    }

    /* JADX INFO: renamed from: toHexString-ZQbaR00$default, reason: not valid java name */
    public static /* synthetic */ String m105166toHexStringZQbaR00$default(byte b11, HexFormat format, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            format = HexFormat.INSTANCE.getDefault();
        }
        Intrinsics.checkNotNullParameter(format, "format");
        return HexExtensionsKt.toHexString(b11, format);
    }

    @SinceKotlin(version = "2.2")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    /* JADX INFO: renamed from: toHexString-lZCiFrA, reason: not valid java name */
    private static final String m105167toHexStringlZCiFrA(byte[] toHexString, int i11, int i12, HexFormat format) {
        Intrinsics.checkNotNullParameter(toHexString, "$this$toHexString");
        Intrinsics.checkNotNullParameter(format, "format");
        return HexExtensionsKt.toHexString(toHexString, i11, i12, format);
    }

    /* JADX INFO: renamed from: toHexString-lZCiFrA$default, reason: not valid java name */
    public static /* synthetic */ String m105168toHexStringlZCiFrA$default(byte[] toHexString, int i11, int i12, HexFormat format, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = 0;
        }
        if ((i13 & 2) != 0) {
            i12 = UByteArray.m103921getSizeimpl(toHexString);
        }
        if ((i13 & 4) != 0) {
            format = HexFormat.INSTANCE.getDefault();
        }
        Intrinsics.checkNotNullParameter(toHexString, "$this$toHexString");
        Intrinsics.checkNotNullParameter(format, "format");
        return HexExtensionsKt.toHexString(toHexString, i11, i12, format);
    }

    @SinceKotlin(version = "2.2")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    /* JADX INFO: renamed from: toHexString-r3ox_E0, reason: not valid java name */
    private static final String m105169toHexStringr3ox_E0(short s11, HexFormat format) {
        Intrinsics.checkNotNullParameter(format, "format");
        return HexExtensionsKt.toHexString(s11, format);
    }

    /* JADX INFO: renamed from: toHexString-r3ox_E0$default, reason: not valid java name */
    public static /* synthetic */ String m105170toHexStringr3ox_E0$default(short s11, HexFormat format, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            format = HexFormat.INSTANCE.getDefault();
        }
        Intrinsics.checkNotNullParameter(format, "format");
        return HexExtensionsKt.toHexString(s11, format);
    }

    @SinceKotlin(version = "2.2")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    /* JADX INFO: renamed from: toHexString-zHuV2wU, reason: not valid java name */
    private static final String m105171toHexStringzHuV2wU(byte[] toHexString, HexFormat format) {
        Intrinsics.checkNotNullParameter(toHexString, "$this$toHexString");
        Intrinsics.checkNotNullParameter(format, "format");
        return HexExtensionsKt.toHexString(toHexString, format);
    }

    /* JADX INFO: renamed from: toHexString-zHuV2wU$default, reason: not valid java name */
    public static /* synthetic */ String m105172toHexStringzHuV2wU$default(byte[] toHexString, HexFormat format, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            format = HexFormat.INSTANCE.getDefault();
        }
        Intrinsics.checkNotNullParameter(toHexString, "$this$toHexString");
        Intrinsics.checkNotNullParameter(format, "format");
        return HexExtensionsKt.toHexString(toHexString, format);
    }
}
