package sd;

import af.C0296a;
import android.widget.RelativeLayout;
import com.kubi.core.base.order.uidata.C11629a;
import com.kubi.core.base.order.uidata.HistoryOrdersUiData$ItemEntity;
import com.kubi.resources.widget.ShowHideTextView;
import com.kubi.sdk.BaseFragment;
import com.kubi.tradecorebiz.R$string;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;
import v30.C45398o;

/* JADX INFO: renamed from: sd.g */
/* JADX INFO: compiled from: DetailNormalHeaderView.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J \u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0012\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0006\u001a\u00020\u0007H\u0002¨\u0006\u000f"}, m90084d2 = {"Lcom/kubi/core/biz/order/detail/DetailNormalHeaderView;", "Lcom/kubi/core/biz/order/detail/DetailBaseHeaderView;", "<init>", "()V", "onItemClick", "", TUIConstants.TIMPush.NOTIFICATION.ENTITY, "Lcom/kubi/core/base/order/uidata/HistoryOrdersUiData$ItemEntity;", "bindData", "binding", "Lcom/kubi/tradecorebiz/databinding/CoreOrderDetailHeaderLayoutBinding;", "delegationDetailFragment", "Lcom/kubi/sdk/BaseFragment;", "getTriggerPriceStr", "", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C44393g extends AbstractC44392f {
    @Override // sd.AbstractC44392f
    /* JADX INFO: renamed from: c */
    public void mo97917c(@NotNull C45398o binding, @NotNull HistoryOrdersUiData$ItemEntity entity, @NotNull BaseFragment delegationDetailFragment) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(entity, "entity");
        Intrinsics.checkNotNullParameter(delegationDetailFragment, "delegationDetailFragment");
        super.mo97917c(binding, entity, delegationDetailFragment);
        binding.f102259t.setText(delegationDetailFragment.getStringRes(R$string.deal_avg_price, new Object[0]) + " / " + delegationDetailFragment.getStringRes(R$string.delegation_price, new Object[0]));
        ShowHideTextView showHideTextView = binding.f102252m;
        String averagePrice = entity.getAveragePrice();
        showHideTextView.setText(C11629a.m21105h(entity, averagePrice != null ? StringsKt.toBigDecimalOrNull(averagePrice) : null));
        String strM97920h = m97920h(entity);
        if (strM97920h == null) {
            RelativeLayout rlStopPrice = binding.f102246g;
            Intrinsics.checkNotNullExpressionValue(rlStopPrice, "rlStopPrice");
            C0296a.m1042d(rlStopPrice, false);
        } else {
            binding.f102255p.setText(strM97920h);
            RelativeLayout rlStopPrice2 = binding.f102246g;
            Intrinsics.checkNotNullExpressionValue(rlStopPrice2, "rlStopPrice");
            C0296a.m1042d(rlStopPrice2, true);
        }
    }

    @Override // sd.AbstractC44392f
    /* JADX INFO: renamed from: g */
    public void mo97919g(@NotNull HistoryOrdersUiData$ItemEntity entity) {
        Intrinsics.checkNotNullParameter(entity, "entity");
    }

    /* JADX INFO: renamed from: h */
    public final String m97920h(HistoryOrdersUiData$ItemEntity historyOrdersUiData$ItemEntity) {
        if (historyOrdersUiData$ItemEntity instanceof HistoryOrdersUiData$ItemEntity.StopLimit) {
            return C11629a.m21114q((HistoryOrdersUiData$ItemEntity.StopLimit) historyOrdersUiData$ItemEntity);
        }
        if (historyOrdersUiData$ItemEntity instanceof HistoryOrdersUiData$ItemEntity.StopMarket) {
            return C11629a.m21115r((HistoryOrdersUiData$ItemEntity.StopMarket) historyOrdersUiData$ItemEntity);
        }
        return null;
    }
}
