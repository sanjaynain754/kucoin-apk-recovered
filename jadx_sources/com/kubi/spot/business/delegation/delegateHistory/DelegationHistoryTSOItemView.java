package com.kubi.spot.business.delegation.delegateHistory;

import com.kubi.sdk.BaseFragment;
import com.kubi.spot.R$id;
import com.kubi.spot.R$string;
import com.kubi.spot.business.delegation.TSOActivePricePrefix;
import com.kubi.spot.entity.DelegationEntity;
import io.chad.library.adapter.base.BaseViewHolder;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import p429lf.C42180b;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.spot.business.delegation.delegateHistory.c0, reason: from Kotlin metadata */
/* JADX INFO: compiled from: DelegationHistoryTSOItemView.kt */
/* JADX INFO: loaded from: classes47.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J0\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000eH\u0016¨\u0006\u000f"}, m90084d2 = {"Lcom/kubi/spot/business/delegation/delegateHistory/DelegationHistoryTSOItemView;", "Lcom/kubi/spot/business/delegation/delegateHistory/DelegationHistoryBaseItemView;", "<init>", "()V", "bindItemView", "", "helper", "Lio/chad/library/adapter/base/BaseViewHolder;", "item", "Lcom/kubi/spot/entity/DelegationEntity;", "isUpGreen", "", "isTradePage", "delegationHistoryFragment", "Lcom/kubi/sdk/BaseFragment;", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public class DelegationHistoryTSOItemView extends DelegationHistoryBaseItemView {
    @Override // com.kubi.spot.business.delegation.delegateHistory.DelegationHistoryBaseItemView, com.kubi.spot.business.delegation.delegateHistory.IDelegateHistoryTradeTypeItemView
    /* JADX INFO: renamed from: a */
    public void mo60911a(@NotNull BaseViewHolder helper, @NotNull DelegationEntity item, boolean z11, boolean z12, @NotNull BaseFragment delegationHistoryFragment) {
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(delegationHistoryFragment, "delegationHistoryFragment");
        super.mo60911a(helper, item, z11, z12, delegationHistoryFragment);
        int i11 = R$id.tv_trigger_price_title;
        helper.setGone(i11, true);
        int i12 = R$id.tv_trigger_price;
        helper.setGone(i12, true);
        helper.setText(R$id.tv_avg_price_label, delegationHistoryFragment.getString(R$string.delegation_price));
        helper.setText(R$id.tv_average_price, item.getPriceFormatterStr(item.getPrice()));
        helper.setText(i11, delegationHistoryFragment.getString(R$string.trailing_stop_act_price));
        helper.setText(i12, TSOActivePricePrefix.f50074a.m60968a(item) + item.getPriceFormatterStr(item.getStopPrice()));
        helper.setText(R$id.tv_delegation_price_label, delegationHistoryFragment.getString(R$string.trailing_stop_trailing_delta));
        int i13 = R$id.tv_delegation_price;
        BigDecimal pop = item.getPop();
        helper.setText(i13, C42180b.m92649n(pop != null ? C42180b.m92642g(pop, null, null, 0, false, false, false, 63, null) : null));
    }
}
