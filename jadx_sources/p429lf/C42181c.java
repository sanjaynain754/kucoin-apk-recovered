package p429lf;

import com.tencent.bugly.proguard.C33978va;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: lf.c */
/* JADX INFO: compiled from: RegulationsNumberUtils.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0004\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0000¢\u0006\u0002\b\bJ\u0019\u0010\t\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0000¢\u0006\u0002\b\nJ\u001b\u0010\u000b\u001a\u00020\u0005*\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\rH\u0000¢\u0006\u0002\b\u000eJ\u0015\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0000¢\u0006\u0002\b\u0013¨\u0006\u0014"}, m90084d2 = {"Lcom/kubi/data/regulations/RegulationsNumberUtils;", "", "<init>", "()V", "eastArabia2Arabic", "", "locale", "Ljava/util/Locale;", "eastArabia2Arabic$LDataProvider_googleRelease", "bengali2Arabic", "bengali2Arabic$LDataProvider_googleRelease", "rollBackTurkeySeparator", "isTurkey", "", "rollBackTurkeySeparator$LDataProvider_googleRelease", "lessBigDecimal", "Ljava/math/BigDecimal;", "pricePrecision", "", "lessBigDecimal$LDataProvider_googleRelease", "LDataProvider_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nRegulationsNumberUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RegulationsNumberUtils.kt\ncom/kubi/data/regulations/RegulationsNumberUtils\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,77:1\n975#2:78\n1046#2,3:79\n*S KotlinDebug\n*F\n+ 1 RegulationsNumberUtils.kt\ncom/kubi/data/regulations/RegulationsNumberUtils\n*L\n20#1:78\n20#1:79,3\n*E\n"})
public final class C42181c {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C42181c f93650a = new C42181c();

    @NotNull
    /* JADX INFO: renamed from: a */
    public final String m92652a(@NotNull String str, @NotNull Locale locale) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(locale, "locale");
        if (!Intrinsics.areEqual(locale.toString(), "bn_BD")) {
            return str;
        }
        char[] charArray = str.toCharArray();
        Intrinsics.checkNotNullExpressionValue(charArray, "toCharArray(...)");
        StringBuilder sb2 = new StringBuilder();
        for (char c11 : charArray) {
            if (Character.isDigit(c11)) {
                sb2.append(Character.getNumericValue(c11));
            } else {
                sb2.append(c11);
            }
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final String m92653b(@NotNull String str, @NotNull Locale locale) {
        Object objValueOf;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(locale, "locale");
        if (!Intrinsics.areEqual(locale.toString(), "ar_AE")) {
            return str;
        }
        ArrayList arrayList = new ArrayList(str.length());
        for (int i11 = 0; i11 < str.length(); i11++) {
            char cCharAt = str.charAt(i11);
            if (1632 > cCharAt || cCharAt >= 1642) {
                switch (cCharAt) {
                    case 1642:
                        objValueOf = "%";
                        break;
                    case 1643:
                        objValueOf = C33978va.f72339h;
                        break;
                    case 1644:
                        objValueOf = ",";
                        break;
                    default:
                        objValueOf = Character.valueOf(cCharAt);
                        break;
                }
            } else {
                objValueOf = Character.valueOf((char) (cCharAt - 1584));
            }
            arrayList.add(objValueOf);
        }
        return CollectionsKt.joinToString$default(arrayList, "", null, null, 0, null, null, 62, null);
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final String m92655d(@NotNull String str, boolean z11) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return z11 ? StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(str, ",", "&", false, 4, (Object) null), C33978va.f72339h, ",", false, 4, (Object) null), "&", C33978va.f72339h, false, 4, (Object) null) : str;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final BigDecimal m92654c(int i11) {
        int iAbs = Math.abs(i11);
        if (i11 < 0) {
            BigDecimal bigDecimalPow = BigDecimal.TEN.pow(iAbs);
            Intrinsics.checkNotNull(bigDecimalPow);
            return bigDecimalPow;
        }
        BigDecimal bigDecimalPow2 = new BigDecimal("0.1").pow(iAbs);
        Intrinsics.checkNotNull(bigDecimalPow2);
        return bigDecimalPow2;
    }
}
