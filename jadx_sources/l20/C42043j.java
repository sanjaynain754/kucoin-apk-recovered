package l20;

import android.view.View;
import com.kubi.sdk.BaseFragment;
import com.kubi.spot.R$id;
import com.kubi.spot.R$layout;
import com.kubi.spot.R$string;
import com.kubi.spot.entity.DelegationEntity;
import com.kubi.utils.extensions.C27025c;
import com.tencent.qcloud.tuicore.TUIConstants;
import io.chad.library.adapter.base.BaseViewHolder;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.Typography;

/* JADX INFO: renamed from: l20.j */
/* JADX INFO: compiled from: DetailOCOHeaderView.kt */
/* JADX INFO: loaded from: classes47.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J \u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000eH\u0016¨\u0006\u000f"}, m90084d2 = {"Lcom/kubi/spot/business/delegation/delegateDetail/DetailOCOHeaderView;", "Lcom/kubi/spot/business/delegation/delegateDetail/DetailBaseHeaderView;", "<init>", "()V", "getHeaderLayout", "", "item", "Lcom/kubi/spot/entity/DelegationEntity;", "bindData", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", TUIConstants.TIMPush.NOTIFICATION.ENTITY, "delegationDetailFragment", "Lcom/kubi/sdk/BaseFragment;", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C42043j extends AbstractC42041h {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:18:0x004d  */
    /* JADX WARN: Code duplicated, block: B:28:0x007e  */
    /* JADX WARN: Code duplicated, block: B:29:0x0098  */
    /* JADX WARN: Instruction removed from duplicated block: B:18:0x004d, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:28:0x007e, please report this as an issue */
    @Override // l20.AbstractC42041h, l20.InterfaceC42045l
    /* JADX INFO: renamed from: a */
    public void mo92245a(@NotNull View view, @NotNull DelegationEntity entity, @NotNull BaseFragment delegationDetailFragment) {
        String priceFormatterStr;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(entity, "entity");
        Intrinsics.checkNotNullParameter(delegationDetailFragment, "delegationDetailFragment");
        super.mo92245a(view, entity, delegationDetailFragment);
        BaseViewHolder baseViewHolderM92246e = m92246e();
        int i11 = R$id.tv_do_price;
        if (getF92321b()) {
            String stop = entity.getStop();
            if (stop != null) {
                switch (stop) {
                    case "e_l_o":
                    case "e_oco":
                    case "e_s_o":
                        priceFormatterStr = Typography.greaterOrEqual + entity.getPriceFormatterStr(entity.getStopPrice());
                        break;
                    case "l_l_o":
                    case "l_oco":
                    case "l_s_o":
                        priceFormatterStr = Typography.lessOrEqual + entity.getPriceFormatterStr(entity.getStopPrice());
                        break;
                    default:
                        priceFormatterStr = entity.getPriceFormatterStr(entity.getStopPrice());
                        break;
                }
            } else {
                priceFormatterStr = entity.getPriceFormatterStr(entity.getStopPrice());
            }
        } else {
            priceFormatterStr = "--";
        }
        baseViewHolderM92246e.setText(i11, priceFormatterStr);
        if (!C27025c.m66566d(entity.getStopTriggered())) {
            m92246e().setText(R$id.tv_limit_price, entity.getPriceFormatterStr(entity.getLimitPrice()));
            m92246e().setText(R$id.tv_do_condition, "--");
            return;
        }
        if (Intrinsics.areEqual("l_l_o", entity.getStop()) || Intrinsics.areEqual("e_l_o", entity.getStop())) {
            m92246e().setGone(R$id.layoutDoPrice, false);
            m92246e().setGone(R$id.rlLimitPrice, false);
            m92246e().setText(R$id.tv_do_condition, delegationDetailFragment.getStringRes(R$string.oco_limit, new Object[0]));
        } else if (!Intrinsics.areEqual("l_s_o", entity.getStop()) && !Intrinsics.areEqual("e_s_o", entity.getStop())) {
            m92246e().setText(R$id.tv_do_condition, "--");
            m92246e().setText(R$id.tv_limit_price, "--");
        } else {
            m92246e().setGone(R$id.layoutPrice, false);
            m92246e().setText(R$id.tv_do_condition, delegationDetailFragment.getStringRes(R$string.oco_stop_limit, new Object[0]));
            m92246e().setText(R$id.tv_limit_price, entity.getPriceFormatterStr(entity.getPrice()));
        }
    }

    @Override // l20.InterfaceC42045l
    /* JADX INFO: renamed from: b */
    public int mo92249b(@NotNull DelegationEntity item) {
        Intrinsics.checkNotNullParameter(item, "item");
        return R$layout.kucoin_delegation_detail_oco_header;
    }
}
