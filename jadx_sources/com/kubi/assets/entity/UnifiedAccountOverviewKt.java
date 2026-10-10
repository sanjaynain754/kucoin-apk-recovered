package com.kubi.assets.entity;

import java.math.BigDecimal;
import java.math.RoundingMode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p402kf.C41014a;
import p429lf.C42180b;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: UnifiedAccountOverview.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\u000e\u0010\u0003\u001a\u0004\u0018\u00010\u0004*\u00020\u0002H\u0000¨\u0006\u0005"}, m90084d2 = {"formatRiskRatio", "", "Lcom/kubi/assets/entity/UnifiedAccountOverview;", "limitRiskRatio", "Ljava/math/BigDecimal;", "AssetsCenterLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class UnifiedAccountOverviewKt {
    @NotNull
    public static final String formatRiskRatio(@NotNull UnifiedAccountOverview unifiedAccountOverview) {
        Intrinsics.checkNotNullParameter(unifiedAccountOverview, "<this>");
        BigDecimal bigDecimalLimitRiskRatio = limitRiskRatio(unifiedAccountOverview);
        return C42180b.m92649n(bigDecimalLimitRiskRatio != null ? C42180b.m92642g(bigDecimalLimitRiskRatio, null, RoundingMode.UP, 0, false, true, false, 13, null) : null);
    }

    @Nullable
    public static final BigDecimal limitRiskRatio(@NotNull UnifiedAccountOverview unifiedAccountOverview) {
        Intrinsics.checkNotNullParameter(unifiedAccountOverview, "<this>");
        BigDecimal riskRatio = unifiedAccountOverview.getRiskRatio();
        if (riskRatio != null) {
            return (C41014a.m89922G(riskRatio, null, 1, null).compareTo(BigDecimal.ZERO) < 0 || C41014a.m89922G(riskRatio, null, 1, null).compareTo(BigDecimal.TEN) >= 0) ? new BigDecimal("9.9999") : riskRatio;
        }
        return null;
    }
}
