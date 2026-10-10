package l20;

import android.view.View;
import com.kubi.sdk.BaseFragment;
import com.kubi.spot.R$id;
import com.kubi.spot.R$layout;
import com.kubi.spot.business.delegation.TSOActivePricePrefix;
import com.kubi.spot.entity.DelegationEntity;
import com.tencent.qcloud.tuicore.TUIConstants;
import io.chad.library.adapter.base.BaseViewHolder;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import p429lf.C42180b;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: l20.k */
/* JADX INFO: compiled from: DetailTSOHeaderView.kt */
/* JADX INFO: loaded from: classes47.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J \u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000eH\u0016¨\u0006\u000f"}, m90084d2 = {"Lcom/kubi/spot/business/delegation/delegateDetail/DetailTSOHeaderView;", "Lcom/kubi/spot/business/delegation/delegateDetail/DetailBaseHeaderView;", "<init>", "()V", "getHeaderLayout", "", "item", "Lcom/kubi/spot/entity/DelegationEntity;", "bindData", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", TUIConstants.TIMPush.NOTIFICATION.ENTITY, "delegationDetailFragment", "Lcom/kubi/sdk/BaseFragment;", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C42044k extends AbstractC42041h {
    @Override // l20.AbstractC42041h, l20.InterfaceC42045l
    /* JADX INFO: renamed from: a */
    public void mo92245a(@NotNull View view, @NotNull DelegationEntity entity, @NotNull BaseFragment delegationDetailFragment) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(entity, "entity");
        Intrinsics.checkNotNullParameter(delegationDetailFragment, "delegationDetailFragment");
        super.mo92245a(view, entity, delegationDetailFragment);
        String strM60968a = TSOActivePricePrefix.f50074a.m60968a(entity);
        m92246e().setText(R$id.tv_do_price, strM60968a + entity.getPriceFormatterStr(entity.getStopPrice()));
        BaseViewHolder baseViewHolderM92246e = m92246e();
        int i11 = R$id.tv_trail_variance;
        BigDecimal pop = entity.getPop();
        baseViewHolderM92246e.setText(i11, C42180b.m92649n(pop != null ? C42180b.m92642g(pop, null, null, 0, false, false, false, 63, null) : null));
        m92246e().setText(R$id.tv_trigger_pirce, entity.getPriceFormatterStr(entity.getTriggerPrice()));
    }

    @Override // l20.InterfaceC42045l
    /* JADX INFO: renamed from: b */
    public int mo92249b(@NotNull DelegationEntity item) {
        Intrinsics.checkNotNullParameter(item, "item");
        return R$layout.kucoin_delegation_detail_tso_header;
    }
}
