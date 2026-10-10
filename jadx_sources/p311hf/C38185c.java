package p311hf;

import com.fasterxml.jackson.databind.node.C6447a;
import com.kubi.utils.extensions.C27039d;
import java.math.BigDecimal;
import java.math.RoundingMode;
import org.jetbrains.annotations.NotNull;
import p402kf.C41014a;
import p429lf.C42180b;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: hf.c */
/* JADX INFO: compiled from: TradeConfig.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u001a\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0002H\u0002¨\u0006\b"}, m90084d2 = {"formatAssetCostPrice", "", "Ljava/math/BigDecimal;", "legal", "", "firstNonZeroDecimalIndex", "", "value", "LDataProvider_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nTradeConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TradeConfig.kt\ncom/kubi/data/config/TradeConfigKt\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,100:1\n158#2,6:101\n*S KotlinDebug\n*F\n+ 1 TradeConfig.kt\ncom/kubi/data/config/TradeConfigKt\n*L\n97#1:101,6\n*E\n"})
public final class C38185c {
    @NotNull
    /* JADX INFO: renamed from: b */
    public static final String m86150b(@NotNull BigDecimal bigDecimal, boolean z11) {
        String plainString;
        Intrinsics.checkNotNullParameter(bigDecimal, "<this>");
        BigDecimal bigDecimal2 = BigDecimal.ZERO;
        if (bigDecimal.compareTo(bigDecimal2) < 0) {
            return "--";
        }
        BigDecimal bigDecimalAbs = bigDecimal.abs();
        if (bigDecimalAbs.compareTo(BigDecimal.ONE) >= 0) {
            plainString = C6447a.m11724a(bigDecimalAbs.setScale(2, RoundingMode.DOWN)).toPlainString();
        } else if (bigDecimalAbs.compareTo(new BigDecimal("0.00000001")) >= 0) {
            Intrinsics.checkNotNull(bigDecimalAbs);
            plainString = C6447a.m11724a(bigDecimalAbs.setScale(m86149a(bigDecimalAbs) + 3, RoundingMode.DOWN)).toPlainString();
        } else if (bigDecimalAbs.compareTo(bigDecimal2) > 0) {
            Intrinsics.checkNotNull(bigDecimalAbs);
            plainString = C6447a.m11724a(bigDecimalAbs.setScale(m86149a(bigDecimalAbs) + 1, RoundingMode.DOWN)).toPlainString();
        } else {
            plainString = C6447a.m11724a(bigDecimalAbs.setScale(2, RoundingMode.DOWN)).toPlainString();
        }
        if (z11) {
            Intrinsics.checkNotNull(plainString);
            BigDecimal bigDecimalOrNull = StringsKt.toBigDecimalOrNull(plainString);
            if (bigDecimalOrNull != null) {
                BigDecimal bigDecimalOrNull2 = StringsKt.toBigDecimalOrNull(plainString);
                String strM89933g = C41014a.m89933g(bigDecimalOrNull, null, null, C27039d.m66651k(bigDecimalOrNull2 != null ? Integer.valueOf(bigDecimalOrNull2.scale()) : null, 2), false, false, true, 27, null);
                if (strM89933g != null) {
                    return strM89933g;
                }
            }
            return "--";
        }
        Intrinsics.checkNotNull(plainString);
        BigDecimal bigDecimalOrNull3 = StringsKt.toBigDecimalOrNull(plainString);
        if (bigDecimalOrNull3 != null) {
            BigDecimal bigDecimalOrNull4 = StringsKt.toBigDecimalOrNull(plainString);
            String strM92640e = C42180b.m92640e(bigDecimalOrNull3, null, C27039d.m66651k(bigDecimalOrNull4 != null ? Integer.valueOf(bigDecimalOrNull4.scale()) : null, 2), false, false, false, 0, null, 121, null);
            if (strM92640e != null) {
                return strM92640e;
            }
        }
        return "--";
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ String m86151c(BigDecimal bigDecimal, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        return m86150b(bigDecimal, z11);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0035  */
    /* JADX WARN: Code duplicated, block: B:15:0x003a  */
    /* JADX INFO: renamed from: a */
    public static final int m86149a(BigDecimal bigDecimal) {
        String plainString = bigDecimal.toPlainString();
        Intrinsics.checkNotNull(plainString);
        int iIndexOf$default = StringsKt.indexOf$default((CharSequence) plainString, '.', 0, false, 6, (Object) null);
        int i11 = 0;
        if (iIndexOf$default < 0) {
            return 0;
        }
        String strSubstring = plainString.substring(iIndexOf$default + 1);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        int length = strSubstring.length();
        while (i11 < length) {
            if (strSubstring.charAt(i11) == '0') {
                i11++;
            } else {
                if (i11 < 0) {
                    return strSubstring.length();
                }
                return i11 + 1;
            }
        }
        i11 = -1;
        if (i11 < 0) {
            return strSubstring.length();
        }
        return i11 + 1;
    }
}
