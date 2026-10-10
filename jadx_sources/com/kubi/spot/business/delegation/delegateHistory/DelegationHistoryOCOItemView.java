package com.kubi.spot.business.delegation.delegateHistory;

import com.kubi.sdk.BaseFragment;
import com.kubi.spot.R$id;
import com.kubi.spot.R$string;
import com.kubi.spot.entity.DelegationEntity;
import io.chad.library.adapter.base.BaseViewHolder;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.Typography;

/* JADX INFO: compiled from: DelegationHistoryOCOItemView.kt */
/* JADX INFO: loaded from: classes47.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J0\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000eH\u0016¨\u0006\u0010"}, m90084d2 = {"Lcom/kubi/spot/business/delegation/delegateHistory/DelegationHistoryOCOItemView;", "Lcom/kubi/spot/business/delegation/delegateHistory/DelegationHistoryBaseItemView;", "<init>", "()V", "bindItemView", "", "helper", "Lio/chad/library/adapter/base/BaseViewHolder;", "item", "Lcom/kubi/spot/entity/DelegationEntity;", "isUpGreen", "", "isTradePage", "delegationHistoryFragment", "Lcom/kubi/sdk/BaseFragment;", "Companion", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public class DelegationHistoryOCOItemView extends DelegationHistoryBaseItemView {

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final Companion f50024c = new Companion(null);

    /* JADX INFO: compiled from: DelegationHistoryOCOItemView.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m90084d2 = {"Lcom/kubi/spot/business/delegation/delegateHistory/DelegationHistoryOCOItemView$Companion;", "", "<init>", "()V", "L_OCO", "", "L_L_O", "L_S_O", "E_OCO", "E_L_O", "E_S_O", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:22:0x0089  */
    /* JADX WARN: Code duplicated, block: B:32:0x00be  */
    /* JADX WARN: Code duplicated, block: B:33:0x00d8  */
    /* JADX WARN: Instruction removed from duplicated block: B:22:0x0089, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:32:0x00be, please report this as an issue */
    @Override // com.kubi.spot.business.delegation.delegateHistory.DelegationHistoryBaseItemView, com.kubi.spot.business.delegation.delegateHistory.IDelegateHistoryTradeTypeItemView
    /* JADX INFO: renamed from: a */
    public void mo60911a(@NotNull BaseViewHolder helper, @NotNull DelegationEntity item, boolean z11, boolean z12, @NotNull BaseFragment delegationHistoryFragment) {
        String priceFormatterStr;
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(delegationHistoryFragment, "delegationHistoryFragment");
        super.mo60911a(helper, item, z11, z12, delegationHistoryFragment);
        helper.setText(R$id.tv_avg_price_label, delegationHistoryFragment.getStringRes(R$string.oco_price, new Object[0])).setText(R$id.tv_average_price, item.getPriceFormatterStr(item.getPrice())).setText(R$id.tv_delegation_price_label, delegationHistoryFragment.getStringRes(R$string.trade_limit_price, new Object[0])).setText(R$id.tv_delegation_price, getF50032a() ? delegationHistoryFragment.getString(R$string.market_price) : item.getPriceFormatterStr(item.getLimitPrice()));
        int i11 = R$id.tv_trigger_price;
        if (getF50033b()) {
            String stop = item.getStop();
            if (stop != null) {
                switch (stop) {
                    case "e_l_o":
                    case "e_oco":
                    case "e_s_o":
                        priceFormatterStr = Typography.greaterOrEqual + item.getPriceFormatterStr(item.getStopPrice());
                        break;
                    case "l_l_o":
                    case "l_oco":
                    case "l_s_o":
                        priceFormatterStr = Typography.lessOrEqual + item.getPriceFormatterStr(item.getStopPrice());
                        break;
                    default:
                        priceFormatterStr = item.getPriceFormatterStr(item.getStopPrice());
                        break;
                }
            } else {
                priceFormatterStr = item.getPriceFormatterStr(item.getStopPrice());
            }
        } else {
            priceFormatterStr = "--";
        }
        helper.setText(i11, priceFormatterStr);
    }
}
