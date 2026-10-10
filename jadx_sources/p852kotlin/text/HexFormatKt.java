package p852kotlin.text;

import p852kotlin.ExperimentalStdlibApi;
import p852kotlin.Metadata;
import p852kotlin.SinceKotlin;
import p852kotlin.Unit;
import p852kotlin.WasExperimental;
import p852kotlin.internal.InlineOnly;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: HexFormat.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010\u000e\n\u0000\u001a%\u0010\u0000\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0087\bø\u0001\u0000\u001a\f\u0010\u0007\u001a\u00020\b*\u00020\tH\u0002\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\n"}, m90084d2 = {"HexFormat", "Lkotlin/text/HexFormat;", "builderAction", "Lkotlin/Function1;", "Lkotlin/text/HexFormat$Builder;", "", "Lkotlin/ExtensionFunctionType;", "isCaseSensitive", "", "", "kotlin-stdlib"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nHexFormat.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HexFormat.kt\nkotlin/text/HexFormatKt\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,845:1\n1088#2,2:846\n*S KotlinDebug\n*F\n+ 1 HexFormat.kt\nkotlin/text/HexFormatKt\n*L\n843#1:846,2\n*E\n"})
public final class HexFormatKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isCaseSensitive(String str) {
        for (int i11 = 0; i11 < str.length(); i11++) {
            char cCharAt = str.charAt(i11);
            if (Intrinsics.compare((int) cCharAt, 128) >= 0 || Character.isLetter(cCharAt)) {
                return true;
            }
        }
        return false;
    }

    @SinceKotlin(version = "2.2")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final HexFormat HexFormat(Function1<? super HexFormat.Builder, Unit> builderAction) {
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        HexFormat.Builder builder = new HexFormat.Builder();
        builderAction.invoke(builder);
        return builder.build();
    }
}
