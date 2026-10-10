package com.kubi.assets.options;

import com.kubi.assets.entity.OptionsAssetPushEntity;
import com.kubi.assets.entity.OptionsOverviewEntity;
import com.kubi.assets.service.AssetsDepend;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import p402kf.C41014a;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.assets.options.m */
/* JADX INFO: compiled from: EntityMapExt.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000¨\u0006\u0004"}, m90084d2 = {"updateFrom", "Lcom/kubi/assets/entity/OptionsOverviewEntity;", "change", "Lcom/kubi/assets/entity/OptionsAssetPushEntity;", "AssetsCenterLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C10544m {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final OptionsOverviewEntity m18140a(@NotNull OptionsOverviewEntity optionsOverviewEntity, @NotNull OptionsAssetPushEntity change) {
        Intrinsics.checkNotNullParameter(optionsOverviewEntity, "<this>");
        Intrinsics.checkNotNullParameter(change, "change");
        String balanceCurrency = AssetsDepend.f18689a.m19189j().d0().getBalanceCurrency();
        if (Intrinsics.areEqual(change.getCurrency(), balanceCurrency)) {
            return OptionsOverviewEntity.copy$default(optionsOverviewEntity, balanceCurrency, change.getTotalBalance(), change.getUnrealizedProfitAndLossAmount(), change.getUnrealizedProfitAndLossRate(), change.getAvailableBalance(), change.getAssetBalance(), null, 64, null);
        }
        BigDecimal totalBalance = change.getTotalBalance();
        BigDecimal bigDecimalM89916A = totalBalance != null ? C41014a.m89916A(totalBalance, change.getCurrency(), balanceCurrency) : null;
        BigDecimal unrealizedProfitAndLossAmount = change.getUnrealizedProfitAndLossAmount();
        BigDecimal bigDecimalM89916A2 = unrealizedProfitAndLossAmount != null ? C41014a.m89916A(unrealizedProfitAndLossAmount, change.getCurrency(), balanceCurrency) : null;
        BigDecimal unrealizedProfitAndLossRate = change.getUnrealizedProfitAndLossRate();
        BigDecimal availableBalance = change.getAvailableBalance();
        BigDecimal bigDecimalM89916A3 = availableBalance != null ? C41014a.m89916A(availableBalance, change.getCurrency(), balanceCurrency) : null;
        BigDecimal assetBalance = change.getAssetBalance();
        return OptionsOverviewEntity.copy$default(optionsOverviewEntity, balanceCurrency, bigDecimalM89916A, bigDecimalM89916A2, unrealizedProfitAndLossRate, bigDecimalM89916A3, assetBalance != null ? C41014a.m89916A(assetBalance, change.getCurrency(), balanceCurrency) : null, null, 64, null);
    }
}
