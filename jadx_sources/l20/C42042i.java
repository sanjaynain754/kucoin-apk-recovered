package l20;

import android.view.View;
import com.kubi.router.core.Router;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.site.info.SiteInfoManager;
import com.kubi.spot.R$id;
import com.kubi.spot.R$layout;
import com.kubi.spot.R$string;
import com.kubi.spot.entity.DelegationEntity;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import p830zf.InterfaceC46815o0;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.Typography;

/* JADX INFO: renamed from: l20.i */
/* JADX INFO: compiled from: DetailNormalHeaderView.kt */
/* JADX INFO: loaded from: classes47.dex */
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J \u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u0007H\u0002¨\u0006\u0011"}, m90084d2 = {"Lcom/kubi/spot/business/delegation/delegateDetail/DetailNormalHeaderView;", "Lcom/kubi/spot/business/delegation/delegateDetail/DetailBaseHeaderView;", "<init>", "()V", "getHeaderLayout", "", "item", "Lcom/kubi/spot/entity/DelegationEntity;", "bindData", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", TUIConstants.TIMPush.NOTIFICATION.ENTITY, "delegationDetailFragment", "Lcom/kubi/sdk/BaseFragment;", "getTriggerPriceStr", "", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nDetailNormalHeaderView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DetailNormalHeaderView.kt\ncom/kubi/spot/business/delegation/delegateDetail/DetailNormalHeaderView\n+ 2 FlavorEx.kt\ncom/kubi/kucoin/helper/FlavorExKt\n*L\n1#1,63:1\n17#2,2:64\n*S KotlinDebug\n*F\n+ 1 DetailNormalHeaderView.kt\ncom/kubi/spot/business/delegation/delegateDetail/DetailNormalHeaderView\n*L\n26#1:64,2\n*E\n"})
public final class C42042i extends AbstractC42041h {
    @Override // l20.AbstractC42041h, l20.InterfaceC42045l
    /* JADX INFO: renamed from: a */
    public void mo92245a(@NotNull View view, @NotNull DelegationEntity entity, @NotNull BaseFragment delegationDetailFragment) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(entity, "entity");
        Intrinsics.checkNotNullParameter(delegationDetailFragment, "delegationDetailFragment");
        super.mo92245a(view, entity, delegationDetailFragment);
        Object objM56186h = Router.f46192a.m56186h(InterfaceC46815o0.class, SiteInfoManager.f47913a.m58109c());
        int i11 = objM56186h != null ? ((InterfaceC46815o0) objM56186h).mo102977a() : false ? R$string.price : R$string.deal_avg_price;
        m92246e().setText(R$id.tv_do_price, m92250h(entity)).setText(R$id.tv_price_name, delegationDetailFragment.getStringRes(i11, new Object[0]) + " / " + delegationDetailFragment.getStringRes(R$string.delegation_price, new Object[0])).setText(R$id.tv_avg_price, entity.getPriceFormatterStr(entity.getAveragePrice())).setGone(R$id.layout_stop_price, getF92321b());
    }

    @Override // l20.InterfaceC42045l
    /* JADX INFO: renamed from: b */
    public int mo92249b(@NotNull DelegationEntity item) {
        Intrinsics.checkNotNullParameter(item, "item");
        return R$layout.kucoin_delegation_detail_header;
    }

    /* JADX INFO: renamed from: h */
    public final String m92250h(DelegationEntity delegationEntity) {
        if (getF92321b()) {
            String stop = delegationEntity.getStop();
            if (Intrinsics.areEqual(stop, "loss")) {
                return Typography.lessOrEqual + delegationEntity.getPriceFormatterStr(delegationEntity.getStopPrice());
            }
            if (Intrinsics.areEqual(stop, "entry")) {
                return Typography.greaterOrEqual + delegationEntity.getPriceFormatterStr(delegationEntity.getStopPrice());
            }
            return delegationEntity.getPriceFormatterStr(delegationEntity.getStopPrice());
        }
        return "--";
    }
}
