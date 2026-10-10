package com.kubi.tradingbotkit.business.strategyList;

import com.kubi.tradingbotkit.business.strategyList.entity.StrategyItemEntity;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.tradingbotkit.business.strategyList.b */
/* JADX INFO: compiled from: StrategyAdapter.kt */
/* JADX INFO: loaded from: classes51.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, m90084d2 = {"isFuturesStrategy", "", "Lcom/kubi/tradingbotkit/business/strategyList/entity/StrategyItemEntity;", "TradingBotKitLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C26187b {
    /* JADX INFO: renamed from: a */
    public static final boolean m64127a(@NotNull StrategyItemEntity strategyItemEntity) {
        Intrinsics.checkNotNullParameter(strategyItemEntity, "<this>");
        Integer type = strategyItemEntity.getType();
        if (type != null && type.intValue() == 12) {
            return true;
        }
        Integer type2 = strategyItemEntity.getType();
        if (type2 != null && type2.intValue() == 9) {
            return true;
        }
        Integer type3 = strategyItemEntity.getType();
        if (type3 != null && type3.intValue() == 3) {
            return true;
        }
        Integer type4 = strategyItemEntity.getType();
        return type4 != null && type4.intValue() == 13;
    }
}
