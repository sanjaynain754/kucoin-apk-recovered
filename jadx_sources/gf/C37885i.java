package gf;

import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.MediaPeriodQueue;
import com.kubi.data.DataInitPlugins;
import com.kubi.mine.lib.jsapi.KCTurboSystemSettingsModuleImpl;
import com.kubi.utils.DataMapUtil;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import java.math.BigDecimal;
import java.math.RoundingMode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p402kf.C41014a;
import p402kf.C41016c;
import p429lf.C42180b;
import p852kotlin.Deprecated;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: gf.i */
/* JADX INFO: compiled from: CoinRateEx.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\u001aV\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\u0001H\u0007\u001aR\u0010\u0000\u001a\u00020\u0001*\u00020\u00042\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\u0001H\u0007\u001aP\u0010\r\u001a\u00020\u0001*\u00020\u00042\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\u0001\u001aR\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\u0001H\u0007\u001a\\\u0010\u0000\u001a\u00020\u0001*\u00020\u000e2\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\u0001H\u0007\u001a\u001e\u0010\u0011\u001a\u00020\u0001*\u00020\u000e2\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u001a\u0016\u0010\u0012\u001a\u00020\u0001*\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0007\u001a\u001e\u0010\u0013\u001a\u00020\u0001*\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0014\u001a\u00020\u0010\u001a\u0016\u0010\u0019\u001a\u00020\u0001*\u00020\u00042\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0001\u001a\u0014\u0010\u001b\u001a\u00020\u0001*\u00020\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u000e\"\u001a\u0010\u0015\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, m90084d2 = {"getCoinOrSymbolDisplay", "", "coinOrSymbol", "value", "", "roundingMode", "Ljava/math/RoundingMode;", "isGroup", "", "isShowMin", "isApprox", "isFollowPrecision", "zeroStr", "convertPriceToString", "Ljava/math/BigDecimal;", "precision", "", "digitalStringForAssetsV2", "digitalStringForFinanceV2", "formatAsPercentage", "miniPrecision", "isUseDealUnit", "()Z", "setUseDealUnit", "(Z)V", "formatterVolume", "quoteCurrency", "prefixPlusSignIfNeeded", "LDataProvider_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nCoinRateEx.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoinRateEx.kt\ncom/kubi/data/coin/CoinRateExKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,274:1\n1#2:275\n*E\n"})
public final class C37885i {

    /* JADX INFO: renamed from: a */
    public static boolean f85266a;

    static {
        f85266a = DataMapUtil.f54245a.m66371c(KCTurboSystemSettingsModuleImpl.DEAL_UNIT_KEY, 0) == 0;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public static final String m85562a(@NotNull BigDecimal bigDecimal, @Nullable String str, int i11) {
        Intrinsics.checkNotNullParameter(bigDecimal, "<this>");
        return C42180b.m92640e(bigDecimal, null, i11, false, true, false, 2, null, 85, null);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ String m85563b(BigDecimal bigDecimal, String str, int i11, int i12, Object obj) {
        Integer numM23685a;
        if ((i12 & 2) != 0) {
            i11 = (str == null || (numM23685a = DataInitPlugins.f21489a.m23681b().m23685a(str)) == null) ? 8 : numM23685a.intValue();
        }
        return m85562a(bigDecimal, str, i11);
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public static final String m85564c(@NotNull BigDecimal bigDecimal, int i11, int i12) {
        Intrinsics.checkNotNullParameter(bigDecimal, "<this>");
        return C42180b.m92640e(bigDecimal, RoundingMode.DOWN, i11, false, true, false, i12, null, 84, null);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ String m85565d(BigDecimal bigDecimal, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = bigDecimal.compareTo(new BigDecimal("0.01")) >= 0 ? 2 : 4;
        }
        if ((i13 & 2) != 0) {
            i12 = 2;
        }
        return m85564c(bigDecimal, i11, i12);
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public static final String m85566e(double d11, @Nullable String str) {
        double d12;
        String str2;
        String str3;
        boolean z11 = (f85266a || str == null) ? false : true;
        if (z11) {
            d11 = C41014a.m89939m(d11, str);
        }
        double d13 = d11;
        if (d13 >= 10000.0d && d13 < 1000000.0d) {
            d12 = d13 / ((double) 1000);
            str2 = "K";
        } else if (d13 >= 1000000.0d && d13 < 1.0E9d) {
            d12 = d13 / ((double) 1000000);
            str2 = "M";
        } else if (d13 >= 1.0E9d && d13 < 1.0E12d) {
            d12 = d13 / ((double) 1000000000);
            str2 = "B";
        } else {
            if (d13 < 1.0E12d) {
                return z11 ? C41014a.m89950x(d13, null, null, 0, false, false, true, false, 95, null) : C42180b.m92640e(new BigDecimal(String.valueOf(d13)), null, 2, true, false, true, 2, null, 73, null);
            }
            d12 = d13 / MediaPeriodQueue.INITIAL_RENDERER_POSITION_OFFSET_US;
            str2 = ExifInterface.GPS_DIRECTION_TRUE;
        }
        if (z11) {
            str3 = C41016c.m89967e(C41016c.m89965c()) + ' ';
        } else {
            str3 = "";
        }
        return str3 + C42180b.m92640e(new BigDecimal(String.valueOf(d12)), RoundingMode.DOWN, 2, false, true, true, 2, null, 64, null) + str2;
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ String m85567f(double d11, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = null;
        }
        return m85566e(d11, str);
    }

    @Deprecated(message = "使用formatCurrencyDisplay，formatSymbolDisplay")
    @NotNull
    /* JADX INFO: renamed from: g */
    public static final String m85568g(double d11, @Nullable String str, @NotNull RoundingMode roundingMode, boolean z11, boolean z12, boolean z13, boolean z14, @NotNull String zeroStr) {
        Intrinsics.checkNotNullParameter(roundingMode, "roundingMode");
        Intrinsics.checkNotNullParameter(zeroStr, "zeroStr");
        return C27041f.m66668h(m85569h(String.valueOf(d11), str, roundingMode, z11, z12, z13, z14, zeroStr));
    }

    @Deprecated(message = "使用formatCurrencyDisplay，formatSymbolDisplay")
    @NotNull
    /* JADX INFO: renamed from: h */
    public static final String m85569h(@NotNull String str, @Nullable String str2, @NotNull RoundingMode roundingMode, boolean z11, boolean z12, boolean z13, boolean z14, @NotNull String zeroStr) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(roundingMode, "roundingMode");
        Intrinsics.checkNotNullParameter(zeroStr, "zeroStr");
        return C27041f.m66668h(m85570i(new BigDecimal(str), str2, roundingMode, 8, z11, z12, z13, z14, zeroStr));
    }

    @Deprecated(message = "使用formatCurrencyDisplay，formatSymbolDisplay")
    @NotNull
    /* JADX INFO: renamed from: i */
    public static final String m85570i(@NotNull BigDecimal bigDecimal, @Nullable String str, @NotNull RoundingMode roundingMode, int i11, boolean z11, boolean z12, boolean z13, boolean z14, @NotNull String zeroStr) {
        Intrinsics.checkNotNullParameter(bigDecimal, "<this>");
        Intrinsics.checkNotNullParameter(roundingMode, "roundingMode");
        Intrinsics.checkNotNullParameter(zeroStr, "zeroStr");
        return str == null ? C41014a.m89946t(bigDecimal, roundingMode, i11, z11, z12, z13, true, z14, zeroStr, 0, 256, null) : C41014a.m89946t(bigDecimal, roundingMode, C27039d.m66651k(DataInitPlugins.f21489a.m23681b().m23685a(str), 8), z11, z12, z13, true, z14, zeroStr, 0, 256, null);
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ String m85571j(double d11, String str, RoundingMode roundingMode, boolean z11, boolean z12, boolean z13, boolean z14, String str2, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            roundingMode = RoundingMode.DOWN;
        }
        return m85568g(d11, str, roundingMode, (i11 & 4) != 0 ? false : z11, (i11 & 8) != 0 ? false : z12, (i11 & 16) != 0 ? false : z13, (i11 & 32) != 0 ? true : z14, (i11 & 64) != 0 ? "0.00" : str2);
    }

    /* JADX INFO: renamed from: m */
    public static final boolean m85574m() {
        return f85266a;
    }

    @NotNull
    /* JADX INFO: renamed from: n */
    public static final String m85575n(@NotNull String str, @Nullable BigDecimal bigDecimal) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (bigDecimal == null || bigDecimal.compareTo(BigDecimal.ZERO) <= 0) {
            return str;
        }
        return '+' + str;
    }

    /* JADX INFO: renamed from: o */
    public static final void m85576o(boolean z11) {
        f85266a = z11;
    }
}
