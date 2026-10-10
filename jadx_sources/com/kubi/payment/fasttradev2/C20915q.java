package com.kubi.payment.fasttradev2;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.payment.helper.PrecisionHelper;
import com.kubi.utils.extensions.DowngradeExKt;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p429lf.C42180b;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.payment.fasttradev2.q */
/* JADX INFO: compiled from: FastTradeCryptoCurrencyAdapter.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0001¨\u0006\u0003"}, m90084d2 = {"formatMoney", "", FirebaseAnalytics.Param.CURRENCY, "PaymentLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C20915q {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final String m47935a(@Nullable String str, @NotNull String currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        BigDecimal bigDecimalM66536f = DowngradeExKt.m66536f(str);
        return C42180b.m92647l(bigDecimalM66536f != null ? C42180b.m92640e(bigDecimalM66536f, null, PrecisionHelper.f39545a.m48247a(currency), false, false, false, 2, null, 93, null) : null);
    }
}
