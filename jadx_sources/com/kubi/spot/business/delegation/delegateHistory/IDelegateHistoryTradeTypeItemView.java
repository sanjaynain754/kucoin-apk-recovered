package com.kubi.spot.business.delegation.delegateHistory;

import com.kubi.sdk.BaseFragment;
import com.kubi.spot.entity.DelegationEntity;
import io.chad.library.adapter.base.BaseViewHolder;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: com.kubi.spot.business.delegation.delegateHistory.d0, reason: from Kotlin metadata */
/* JADX INFO: compiled from: IDelegateHistoryTradeTypeItemView.kt */
/* JADX INFO: loaded from: classes47.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J0\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\fH&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0001"}, m90084d2 = {"Lcom/kubi/spot/business/delegation/delegateHistory/IDelegateHistoryTradeTypeItemView;", "", "bindItemView", "", "helper", "Lio/chad/library/adapter/base/BaseViewHolder;", "item", "Lcom/kubi/spot/entity/DelegationEntity;", "isUpGreen", "", "isTradePage", "delegationHistoryFragment", "Lcom/kubi/sdk/BaseFragment;", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface IDelegateHistoryTradeTypeItemView {
    /* JADX INFO: renamed from: a */
    void mo60911a(@NotNull BaseViewHolder baseViewHolder, @NotNull DelegationEntity delegationEntity, boolean z11, boolean z12, @NotNull BaseFragment baseFragment);
}
