package gf;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.data.DataInitPlugins;
import com.kubi.data.InterceptorChain;
import com.kubi.sdk.function.language.MultiLanguageManager;
import com.kubi.utils.extensions.C27039d;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p429lf.C42180b;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: gf.j */
/* JADX INFO: compiled from: CoinSymbolRateEx.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aZ\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000b\u001aP\u0010\u000f\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r¨\u0006\u0011"}, m90084d2 = {"formatCurrencyDisplay", "", "Ljava/math/BigDecimal;", FirebaseAnalytics.Param.CURRENCY, "roundingMode", "Ljava/math/RoundingMode;", "keepZero", "", "isShowLess", "isGroup", "miniPrecision", "", "cLocale", "Ljava/util/Locale;", "precision", "formatSymbolDisplay", "symbol", "LDataProvider_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C37886j {
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ String m85578b(BigDecimal bigDecimal, String str, RoundingMode roundingMode, boolean z11, boolean z12, boolean z13, int i11, Locale locale, int i12, int i13, Object obj) {
        int iM66651k;
        RoundingMode roundingMode2 = (i13 & 2) != 0 ? RoundingMode.DOWN : roundingMode;
        boolean z14 = (i13 & 4) != 0 ? false : z11;
        boolean z15 = (i13 & 8) != 0 ? false : z12;
        boolean z16 = (i13 & 16) != 0 ? true : z13;
        int i14 = (i13 & 32) == 0 ? i11 : 0;
        Locale locale2 = (i13 & 64) != 0 ? MultiLanguageManager.f46811g.getLocale() : locale;
        if ((i13 & 128) != 0) {
            iM66651k = C27039d.m66651k(DataInitPlugins.f21489a.m23681b().m23685a(str == null ? "" : str), 12);
        } else {
            iM66651k = i12;
        }
        return m85577a(bigDecimal, str, roundingMode2, z14, z15, z16, i14, locale2, iM66651k);
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public static final String m85577a(@NotNull BigDecimal bigDecimal, @Nullable String str, @NotNull RoundingMode roundingMode, boolean z11, boolean z12, boolean z13, int i11, @NotNull Locale cLocale, int i12) {
        Intrinsics.checkNotNullParameter(bigDecimal, "<this>");
        Intrinsics.checkNotNullParameter(roundingMode, "roundingMode");
        Intrinsics.checkNotNullParameter(cLocale, "cLocale");
        return C42180b.m92639d(bigDecimal, roundingMode, i12, z11, z12, z13, i11, cLocale);
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public static final String m85579c(@NotNull BigDecimal bigDecimal, @Nullable String str, @NotNull RoundingMode roundingMode, boolean z11, boolean z12, boolean z13, int i11, @NotNull Locale cLocale) {
        Intrinsics.checkNotNullParameter(bigDecimal, "<this>");
        Intrinsics.checkNotNullParameter(roundingMode, "roundingMode");
        Intrinsics.checkNotNullParameter(cLocale, "cLocale");
        InterceptorChain interceptorChainM23681b = DataInitPlugins.f21489a.m23681b();
        if (str == null) {
            str = "";
        }
        return C42180b.m92639d(bigDecimal, roundingMode, C27039d.m66651k(interceptorChainM23681b.m23685a(str), 12), z11, z12, z13, i11, cLocale);
    }
}
