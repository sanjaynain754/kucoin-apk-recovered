package m20;

import com.kubi.sdk.BaseFragment;
import com.kubi.spot.R$id;
import com.kubi.spot.R$string;
import com.kubi.spot.entity.DelegationEntity;
import io.chad.library.adapter.base.BaseViewHolder;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.Typography;

/* JADX INFO: renamed from: m20.p */
/* JADX INFO: compiled from: DelegationListOCOItemView.kt */
/* JADX INFO: loaded from: classes47.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, m90084d2 = {"Lcom/kubi/spot/business/delegation/delegationList/DelegationListOCOItemView;", "Lcom/kubi/spot/business/delegation/delegationList/DelegationListBaseItemView;", "<init>", "()V", "bindItemView", "", "helper", "Lio/chad/library/adapter/base/BaseViewHolder;", "item", "Lcom/kubi/spot/entity/DelegationEntity;", "delegationListFragment", "Lcom/kubi/sdk/BaseFragment;", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C42416p extends C42401a {
    @Override // m20.C42401a, m20.InterfaceC42418r
    /* JADX INFO: renamed from: a */
    public void mo93102a(@NotNull BaseViewHolder helper, @NotNull DelegationEntity item, @NotNull BaseFragment delegationListFragment) {
        String priceFormatterStr;
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(delegationListFragment, "delegationListFragment");
        super.mo93102a(helper, item, delegationListFragment);
        helper.setText(R$id.tv_delegation_price, getF94018b() ? "--" : item.getPriceFormatterStr(item.getLimitPrice()));
        int i11 = R$id.tv_trigger_price;
        String stop = item.getStop();
        if (Intrinsics.areEqual(stop, "l_oco")) {
            priceFormatterStr = Typography.lessOrEqual + item.getPriceFormatterStr(item.getStopPrice());
        } else if (Intrinsics.areEqual(stop, "e_oco")) {
            priceFormatterStr = Typography.greaterOrEqual + item.getPriceFormatterStr(item.getStopPrice());
        } else {
            priceFormatterStr = item.getPriceFormatterStr(item.getStopPrice());
        }
        helper.setText(i11, priceFormatterStr);
        helper.setText(R$id.tv_delegation_price_label, delegationListFragment.getStringRes(R$string.trade_limit_price, new Object[0]));
        helper.setGone(R$id.tv_limit_price_label, true);
        helper.setGone(R$id.tv_limit_price, true);
        helper.setGone(R$id.view_dash, true);
    }
}
