package l20;

import android.content.Context;
import android.view.View;
import com.kubi.resources.C22890g;
import com.kubi.sdk.BaseFragment;
import com.kubi.spot.R$color;
import com.kubi.spot.R$id;
import com.kubi.spot.R$string;
import com.kubi.spot.business.delegation.DelegationTracker;
import com.kubi.spot.business.delegation.delegateDetail.DelegationDetailFragment;
import com.kubi.spot.entity.DelegationEntity;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.tencent.qcloud.tuicore.TUIConstants;
import f30.C37330a;
import f30.C37347r;
import io.chad.library.adapter.base.BaseViewHolder;
import nf.C42828b;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: l20.h */
/* JADX INFO: compiled from: DetailBaseHeaderView.kt */
/* JADX INFO: loaded from: classes47.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0017"}, m90084d2 = {"Lcom/kubi/spot/business/delegation/delegateDetail/DetailBaseHeaderView;", "Lcom/kubi/spot/business/delegation/delegateDetail/IDelegateDetailTradeTypeHeaderView;", "<init>", "()V", "helper", "Lio/chad/library/adapter/base/BaseViewHolder;", "getHelper", "()Lio/chad/library/adapter/base/BaseViewHolder;", "setHelper", "(Lio/chad/library/adapter/base/BaseViewHolder;)V", "isShowTrigger", "", "()Z", "setShowTrigger", "(Z)V", "bindData", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", TUIConstants.TIMPush.NOTIFICATION.ENTITY, "Lcom/kubi/spot/entity/DelegationEntity;", "delegationDetailFragment", "Lcom/kubi/sdk/BaseFragment;", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public abstract class AbstractC42041h implements InterfaceC42045l {

    /* JADX INFO: renamed from: a */
    public BaseViewHolder f92320a;

    /* JADX INFO: renamed from: b */
    public boolean f92321b;

    /* JADX INFO: renamed from: d */
    public static final Unit m92244d(BaseFragment baseFragment, DelegationEntity delegationEntity) {
        if ((baseFragment instanceof DelegationDetailFragment) && Intrinsics.areEqual(((DelegationDetailFragment) baseFragment).m60832T3(), "TRADE")) {
            DelegationTracker.f50071a.m60958b();
            C37330a.m83911c(delegationEntity.getSymbol(), false, 0, 6, null);
        }
        return Unit.INSTANCE;
    }

    @Override // l20.InterfaceC42045l
    /* JADX INFO: renamed from: a */
    public void mo92245a(@NotNull View view, @NotNull final DelegationEntity entity, @NotNull final BaseFragment delegationDetailFragment) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(entity, "entity");
        Intrinsics.checkNotNullParameter(delegationDetailFragment, "delegationDetailFragment");
        boolean zEquals = StringsKt.equals(entity.getSide(), "buy", true);
        this.f92321b = entity.isShowTrigger();
        boolean zIsMarket = entity.isMarket(2);
        boolean z11 = zIsMarket && zEquals;
        m92248g(new BaseViewHolder(view));
        BaseViewHolder baseViewHolderM92246e = m92246e();
        int i11 = R$id.tv_symbols;
        View view2 = baseViewHolderM92246e.getView(i11);
        Intrinsics.checkNotNullExpressionValue(view2, "getView(...)");
        C27046k.m66711z(view2, 0L, new Function0() { // from class: l20.g
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AbstractC42041h.m92244d(delegationDetailFragment, entity);
            }
        }, 1, null);
        BaseViewHolder gone = m92246e().setText(i11, entity.getShowSymbol()).setText(R$id.tv_status, delegationDetailFragment.getString(entity.getStatusString()) + '(' + C42828b.m93915p(entity.getDealPercent()) + ')').setGone(R$id.tv_hide, entity.needShowHideTag());
        int i12 = R$id.tv_trade_type;
        BaseViewHolder text = gone.setText(i12, delegationDetailFragment.getString(entity.getSideString()) + '/' + entity.getTypeString(2) + entity.getSubType());
        Context context = delegationDetailFragment.getContext();
        text.setTextColor(i12, C27039d.m66651k(context != null ? Integer.valueOf(C22890g.m54281f(context, Intrinsics.areEqual(entity.getSide(), "buy"))) : null, delegationDetailFragment.getColorRes(R$color.c_text))).setText(R$id.tv_time, C37347r.m83944d(C27039d.m66652l(entity.getTime()))).setText(R$id.tv_amount, entity.getAmountFormatterStr(entity.getSize(), z11)).setText(R$id.tv_price, zIsMarket ? delegationDetailFragment.getString(R$string.market_price) : entity.getPriceFormatterStr(entity.getPrice())).setText(R$id.tv_deal_amount, entity.getAmountFormatterStr(entity.getDealSize(), z11)).setText(R$id.tv_amount_name, delegationDetailFragment.getString(R$string.dealed) + '/' + delegationDetailFragment.getString(R$string.delegation_amount_stub, C27041f.m66669i(entity.getUnit(), "--")));
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final BaseViewHolder m92246e() {
        BaseViewHolder baseViewHolder = this.f92320a;
        if (baseViewHolder != null) {
            return baseViewHolder;
        }
        Intrinsics.throwUninitializedPropertyAccessException("helper");
        return null;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getF92321b() {
        return this.f92321b;
    }

    /* JADX INFO: renamed from: g */
    public final void m92248g(@NotNull BaseViewHolder baseViewHolder) {
        Intrinsics.checkNotNullParameter(baseViewHolder, "<set-?>");
        this.f92320a = baseViewHolder;
    }
}
