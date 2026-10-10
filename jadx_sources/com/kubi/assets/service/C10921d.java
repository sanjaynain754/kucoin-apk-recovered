package com.kubi.assets.service;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.data.entity.CoinInfoEntity;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.StringEx;
import gf.C37890n;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p402kf.C41014a;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: com.kubi.assets.service.d */
/* JADX INFO: compiled from: AssetsHelper.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u0001\u001a \u0010\u0002\u001a\u00020\u0001*\u0004\u0018\u00010\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u001a \u0010\u0002\u001a\u00020\u0001*\u0004\u0018\u00010\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¨\u0006\u0007"}, m90084d2 = {"getCoinInfoDisplayName", "", "getLegalCoinAmount", FirebaseAnalytics.Param.CURRENCY, "showBySymbol", "", "Ljava/math/BigDecimal;", "AssetsCenterLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C10921d {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final String m19190a(@Nullable String str) {
        CoinInfoEntity coinInfoEntityM85613u = C37890n.f85269a.m85613u(C27041f.m66668h(str));
        return C27041f.m66669i(coinInfoEntityM85613u != null ? coinInfoEntityM85613u.getCurrency() : null, C27041f.m66668h(StringEx.INSTANCE.xbt2btc4Java(C27041f.m66668h(str))));
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final String m19191b(@Nullable String str, @Nullable String str2, boolean z11) {
        return (str == null || str.length() == 0 || str2 == null || str2.length() == 0) ? "--" : m19192c(new BigDecimal(str), str2, z11);
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public static final String m19192c(@Nullable BigDecimal bigDecimal, @Nullable String str, boolean z11) {
        return (bigDecimal == null || str == null || str.length() == 0) ? "--" : C27041f.m66669i(C41014a.m89933g(new BigDecimal(String.valueOf(C41014a.m89940n(bigDecimal, str))), null, null, 0, false, false, z11, 31, null), "--");
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ String m19193d(String str, String str2, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = true;
        }
        return m19191b(str, str2, z11);
    }
}
