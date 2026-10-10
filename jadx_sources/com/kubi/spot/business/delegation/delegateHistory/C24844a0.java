package com.kubi.spot.business.delegation.delegateHistory;

import com.kubi.spot.entity.DelegationEntity;
import com.kubi.utils.extensions.C27025c;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.spot.business.delegation.delegateHistory.a0 */
/* JADX INFO: compiled from: DelegationHistoryFragmentExt.kt */
/* JADX INFO: loaded from: classes47.dex */
@Metadata(m90083d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003¨\u0006\u0004"}, m90084d2 = {"getTradeTypeItemView", "Lcom/kubi/spot/business/delegation/delegateHistory/IDelegateHistoryTradeTypeItemView;", "item", "Lcom/kubi/spot/entity/DelegationEntity;", "SpotLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C24844a0 {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final IDelegateHistoryTradeTypeItemView m60912a(@NotNull DelegationEntity item) {
        Intrinsics.checkNotNullParameter(item, "item");
        boolean z11 = item.isOCO(2) && !C27025c.m66566d(item.getStopTriggered());
        boolean zIsTradingStop = item.isTradingStop(2);
        if (z11) {
            return new DelegationHistoryOCOItemView();
        }
        return zIsTradingStop ? new DelegationHistoryTSOItemView() : new DelegationHistoryNormalItemView();
    }
}
