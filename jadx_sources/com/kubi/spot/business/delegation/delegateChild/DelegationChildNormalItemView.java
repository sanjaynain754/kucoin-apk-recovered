package com.kubi.spot.business.delegation.delegateChild;

import com.kubi.sdk.BaseFragment;
import com.kubi.spot.R$id;
import com.kubi.spot.R$string;
import com.kubi.spot.entity.DelegationEntity;
import io.chad.library.adapter.base.BaseViewHolder;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.Typography;

/* JADX INFO: renamed from: com.kubi.spot.business.delegation.delegateChild.s, reason: from Kotlin metadata */
/* JADX INFO: compiled from: DelegationChildNormalItemView.kt */
/* JADX INFO: loaded from: classes47.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, m90084d2 = {"Lcom/kubi/spot/business/delegation/delegateChild/DelegationChildNormalItemView;", "Lcom/kubi/spot/business/delegation/delegateChild/DelegationChildBaseItemView;", "<init>", "()V", "bindItemView", "", "helper", "Lio/chad/library/adapter/base/BaseViewHolder;", "item", "Lcom/kubi/spot/entity/DelegationEntity;", "delegationChildFragment", "Lcom/kubi/sdk/BaseFragment;", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class DelegationChildNormalItemView extends DelegationChildBaseItemView {
    @Override // com.kubi.spot.business.delegation.delegateChild.DelegationChildBaseItemView, com.kubi.spot.business.delegation.delegateChild.IDelegateChildTradeTypeItemView
    /* JADX INFO: renamed from: a */
    public void mo60812a(@NotNull BaseViewHolder helper, @NotNull DelegationEntity item, @NotNull BaseFragment delegationChildFragment) {
        String priceFormatterStr;
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(delegationChildFragment, "delegationChildFragment");
        super.mo60812a(helper, item, delegationChildFragment);
        helper.setText(R$id.tv_delegation_price, getF49974b() ? "--" : item.getPriceFormatterStr(item.getPrice()));
        helper.setText(R$id.tv_trigger_price_label, delegationChildFragment.getStringRes(R$string.trigger_price, new Object[0]));
        int i11 = R$id.tv_trigger_price;
        String stop = item.getStop();
        if (Intrinsics.areEqual(stop, "loss")) {
            priceFormatterStr = Typography.lessOrEqual + item.getPriceFormatterStr(item.getStopPrice());
        } else if (Intrinsics.areEqual(stop, "entry")) {
            priceFormatterStr = Typography.greaterOrEqual + item.getPriceFormatterStr(item.getStopPrice());
        } else {
            priceFormatterStr = item.getPriceFormatterStr(item.getStopPrice());
        }
        helper.setText(i11, priceFormatterStr);
        helper.setText(R$id.tv_delegation_price_label, delegationChildFragment.getStringRes(R$string.delegation_price, new Object[0]));
        helper.setGone(R$id.tv_limit_price_label, false);
        helper.setGone(R$id.tv_limit_price, false);
        helper.setGone(R$id.view_dash, false);
    }
}
