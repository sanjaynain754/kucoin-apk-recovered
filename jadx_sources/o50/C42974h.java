package o50;

import android.content.Context;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.StringCompanionObject;
import ro.C44128b;

/* JADX INFO: renamed from: o50.h */
/* JADX INFO: compiled from: StringExt.kt */
/* JADX INFO: loaded from: classes51.dex */
@Metadata(m90083d1 = {"\u00000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0001\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0001\u001a\n\u0010\u0003\u001a\u00020\u0001*\u00020\u0001\u001a\n\u0010\u0004\u001a\u00020\u0001*\u00020\u0001\u001a\n\u0010\u0005\u001a\u00020\u0001*\u00020\u0001\u001a\n\u0010\u0006\u001a\u00020\u0001*\u00020\u0001\u001a\n\u0010\u0007\u001a\u00020\u0001*\u00020\u0001\u001a\n\u0010\b\u001a\u00020\u0001*\u00020\u0001\u001a\f\u0010\t\u001a\u00020\u0001*\u0004\u0018\u00010\u0001\u001a-\u0010\n\u001a\u00020\u0001*\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0014\b\u0002\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u000f\"\u00020\u0001¢\u0006\u0002\u0010\u0010\u001a&\u0010\u0011\u001a\u00020\u0001*\u00060\u0012j\u0002`\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\r\u001a\n\u0010\u0018\u001a\u00020\u0001*\u00020\u0001¨\u0006\u0019"}, m90084d2 = {"bracketsString", "", "squareBracketsString", "addBeforeBlockString", "addBothBlockString", "addAboutString", "changeLine", "addColon", "upperCaseFirst", "getFormatString", "getStringByRes", "Landroid/content/Context;", "res", "", "args", "", "(Landroid/content/Context;I[Ljava/lang/String;)Ljava/lang/String;", "getPriceRangeString", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "lowerLimit", "Ljava/math/BigDecimal;", "upperLimit", "precision", "extractDigitsDotsAndCommas", "TradingBotKitLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C42974h {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final String m94372a(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return ' ' + str;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final String m94373b(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return ' ' + str + ' ';
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public static final String m94374c(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return '(' + str + ')';
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public static final String m94375d(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return str + '\n';
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public static final String m94376e(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        StringBuilder sb2 = new StringBuilder();
        int length = str.length();
        int i11 = 0;
        while (i11 < length) {
            char cCharAt = str.charAt(i11);
            if (Character.isDigit(cCharAt)) {
                sb2.append(cCharAt);
            } else if (cCharAt == '.' || cCharAt == ',') {
                boolean z11 = i11 > 0 && Character.isDigit(str.charAt(i11 + (-1)));
                boolean z12 = i11 < length + (-1) && Character.isDigit(str.charAt(i11 + 1));
                if (z11 && z12) {
                    sb2.append(cCharAt);
                }
            }
            i11++;
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public static final String m94377f(@NotNull Context context, int i11, @NotNull String... args) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(args, "args");
        try {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String string = context.getString(i11);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            Object[] objArrCopyOf = Arrays.copyOf(args, args.length);
            String str = String.format(string, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            return str;
        } catch (Exception e11) {
            C44128b.m97260d(context.getClass().getName() + "|getStringByRes|" + e11);
            return "";
        }
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ String m94378g(Context context, int i11, String[] strArr, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            strArr = new String[0];
        }
        return m94377f(context, i11, strArr);
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public static final String m94379h(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return '[' + str + ']';
    }
}
