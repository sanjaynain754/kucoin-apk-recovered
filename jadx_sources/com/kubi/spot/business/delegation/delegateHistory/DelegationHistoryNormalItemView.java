package com.kubi.spot.business.delegation.delegateHistory;

import com.kubi.router.core.Router;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.site.info.SiteInfoManager;
import com.kubi.spot.R$id;
import com.kubi.spot.R$string;
import com.kubi.spot.entity.DelegationEntity;
import io.chad.library.adapter.base.BaseViewHolder;
import org.jetbrains.annotations.NotNull;
import p830zf.InterfaceC46815o0;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.Typography;

/* JADX INFO: renamed from: com.kubi.spot.business.delegation.delegateHistory.b0, reason: from Kotlin metadata */
/* JADX INFO: compiled from: DelegationHistoryNormalItemView.kt */
/* JADX INFO: loaded from: classes47.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J0\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000eH\u0016¨\u0006\u000f"}, m90084d2 = {"Lcom/kubi/spot/business/delegation/delegateHistory/DelegationHistoryNormalItemView;", "Lcom/kubi/spot/business/delegation/delegateHistory/DelegationHistoryBaseItemView;", "<init>", "()V", "bindItemView", "", "helper", "Lio/chad/library/adapter/base/BaseViewHolder;", "item", "Lcom/kubi/spot/entity/DelegationEntity;", "isUpGreen", "", "isTradePage", "delegationHistoryFragment", "Lcom/kubi/sdk/BaseFragment;", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nDelegationHistoryNormalItemView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DelegationHistoryNormalItemView.kt\ncom/kubi/spot/business/delegation/delegateHistory/DelegationHistoryNormalItemView\n+ 2 FlavorEx.kt\ncom/kubi/kucoin/helper/FlavorExKt\n*L\n1#1,66:1\n17#2,2:67\n*S KotlinDebug\n*F\n+ 1 DelegationHistoryNormalItemView.kt\ncom/kubi/spot/business/delegation/delegateHistory/DelegationHistoryNormalItemView\n*L\n24#1:67,2\n*E\n"})
public class DelegationHistoryNormalItemView extends DelegationHistoryBaseItemView {
    @Override // com.kubi.spot.business.delegation.delegateHistory.DelegationHistoryBaseItemView, com.kubi.spot.business.delegation.delegateHistory.IDelegateHistoryTradeTypeItemView
    /* JADX INFO: renamed from: a */
    public void mo60911a(@NotNull BaseViewHolder helper, @NotNull DelegationEntity item, boolean z11, boolean z12, @NotNull BaseFragment delegationHistoryFragment) {
        String priceFormatterStr;
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(delegationHistoryFragment, "delegationHistoryFragment");
        super.mo60911a(helper, item, z11, z12, delegationHistoryFragment);
        Object objM56186h = Router.f46192a.m56186h(InterfaceC46815o0.class, SiteInfoManager.f47913a.m58109c());
        helper.setText(R$id.tv_avg_price_label, delegationHistoryFragment.getStringRes(objM56186h != null ? ((InterfaceC46815o0) objM56186h).mo102977a() : false ? R$string.price : R$string.deal_avg_price, new Object[0])).setText(R$id.tv_average_price, item.getPriceFormatterStr(item.getAveragePrice())).setText(R$id.tv_delegation_price_label, delegationHistoryFragment.getStringRes(R$string.delegation_price, new Object[0])).setText(R$id.tv_delegation_price, getF50032a() ? delegationHistoryFragment.getString(R$string.market_price) : item.getPriceFormatterStr(item.getPrice()));
        int i11 = R$id.tv_trigger_price;
        if (getF50033b()) {
            String stop = item.getStop();
            if (Intrinsics.areEqual(stop, "loss")) {
                priceFormatterStr = Typography.lessOrEqual + item.getPriceFormatterStr(item.getStopPrice());
            } else if (Intrinsics.areEqual(stop, "entry")) {
                priceFormatterStr = Typography.greaterOrEqual + item.getPriceFormatterStr(item.getStopPrice());
            } else {
                priceFormatterStr = item.getPriceFormatterStr(item.getStopPrice());
            }
        } else {
            priceFormatterStr = "--";
        }
        helper.setText(i11, priceFormatterStr);
    }
}
