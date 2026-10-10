package com.kubi.spot.business.delegation.delegateHistory;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.kubi.resources.C22890g;
import com.kubi.resources.dialog.AlertDialogFragmentHelper;
import com.kubi.resources.widget.DashTextView;
import com.kubi.sdk.BaseFragment;
import com.kubi.sdk.base.p113ui.BaseFragmentActivity;
import com.kubi.spot.R$color;
import com.kubi.spot.R$id;
import com.kubi.spot.R$string;
import com.kubi.spot.business.delegation.DelegationTracker;
import com.kubi.spot.business.delegation.delegateDetail.DelegationDetailFragment;
import com.kubi.spot.entity.DelegationEntity;
import com.kubi.utils.C27051h;
import com.kubi.utils.C27096v0;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
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

/* JADX INFO: renamed from: com.kubi.spot.business.delegation.delegateHistory.d, reason: from Kotlin metadata */
/* JADX INFO: compiled from: DelegationHistoryBaseItemView.kt */
/* JADX INFO: loaded from: classes47.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J0\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0014H\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\u0006\"\u0004\b\n\u0010\b¨\u0006\u0015"}, m90084d2 = {"Lcom/kubi/spot/business/delegation/delegateHistory/DelegationHistoryBaseItemView;", "Lcom/kubi/spot/business/delegation/delegateHistory/IDelegateHistoryTradeTypeItemView;", "<init>", "()V", "isMarket", "", "()Z", "setMarket", "(Z)V", "isShowTrigger", "setShowTrigger", "bindItemView", "", "helper", "Lio/chad/library/adapter/base/BaseViewHolder;", "item", "Lcom/kubi/spot/entity/DelegationEntity;", "isUpGreen", "isTradePage", "delegationHistoryFragment", "Lcom/kubi/sdk/BaseFragment;", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public class DelegationHistoryBaseItemView implements IDelegateHistoryTradeTypeItemView {

    /* JADX INFO: renamed from: a */
    public boolean f50032a;

    /* JADX INFO: renamed from: b */
    public boolean f50033b;

    /* JADX INFO: renamed from: e */
    public static final Unit m60916e(BaseFragment baseFragment, boolean z11, DelegationEntity delegationEntity) {
        if ((baseFragment instanceof DelegationHistoryFragment) && Intrinsics.areEqual(((DelegationHistoryFragment) baseFragment).m60905v4(), "TRADE")) {
            DelegationTracker.f50071a.m60959c(z11);
            C37330a.m83911c(delegationEntity.getSymbol(), false, 0, 6, null);
        }
        return Unit.INSTANCE;
    }

    @Override // com.kubi.spot.business.delegation.delegateHistory.IDelegateHistoryTradeTypeItemView
    /* JADX INFO: renamed from: a */
    public void mo60911a(@NotNull BaseViewHolder helper, @NotNull final DelegationEntity item, boolean z11, final boolean z12, @NotNull final BaseFragment delegationHistoryFragment) {
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(delegationHistoryFragment, "delegationHistoryFragment");
        boolean zEquals = StringsKt.equals(item.getSide(), "buy", true);
        boolean zIsMarket = item.isMarket(2);
        this.f50032a = zIsMarket;
        boolean z13 = zIsMarket && zEquals;
        this.f50033b = item.isShowTrigger();
        int i11 = R$id.tv_trade_pair;
        View view = helper.getView(i11);
        Intrinsics.checkNotNullExpressionValue(view, "getView(...)");
        C27046k.m66711z(view, 0L, new Function0() { // from class: com.kubi.spot.business.delegation.delegateHistory.a
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DelegationHistoryBaseItemView.m60916e(delegationHistoryFragment, z12, item);
            }
        }, 1, null);
        BaseViewHolder text = helper.setText(i11, item.getShowSymbol());
        int i12 = R$id.tv_trade_type;
        BaseViewHolder text2 = text.setText(i12, delegationHistoryFragment.getString(item.getSideString()) + " / " + item.getTypeString(2));
        Context context = delegationHistoryFragment.getContext();
        BaseViewHolder text3 = text2.setTextColor(i12, C27039d.m66651k(context != null ? Integer.valueOf(C22890g.m54281f(context, Intrinsics.areEqual(item.getSide(), "buy"))) : null, delegationHistoryFragment.getColorRes(R$color.c_text))).setText(R$id.tv_time, C37347r.m83944d(C27039d.m66652l(item.getTime())));
        int i13 = R$id.tv_amount_type;
        text3.setText(i13, delegationHistoryFragment.getString(R$string.dealed) + '/' + delegationHistoryFragment.getString(R$string.delegation_amount_stub, C27041f.m66669i(item.getUnit(), "--"))).setGone(R$id.tv_hide, item.needShowHideTag()).setText(R$id.tv_status, item.getStatusString());
        View view2 = helper.getView(i13);
        Intrinsics.checkNotNullExpressionValue(view2, "getView(...)");
        C27046k.m66711z(view2, 0L, new Function0() { // from class: com.kubi.spot.business.delegation.delegateHistory.b
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DelegationHistoryBaseItemView.m60917f(item, delegationHistoryFragment);
            }
        }, 1, null);
        ((DashTextView) helper.getView(i13)).setNeedDash(C27025c.m66566d(item.getPriceLimitTrigger()));
        helper.setText(R$id.tvDealAndTotalAmount, new C27096v0().append(item.getAmountFormatterStr(item.getDealSize(), z13)).m66905e(" / " + item.getAmountFormatterStr(item.getSize(), z13), delegationHistoryFragment.getColorRes(R$color.c_text40)));
        helper.setText(R$id.tvDealPercent, '(' + C42828b.m93915p(item.getDealPercent()) + ')');
        helper.setGone(R$id.tv_trigger_price_title, this.f50033b);
        helper.setGone(R$id.tv_trigger_price, this.f50033b);
        helper.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.kubi.spot.business.delegation.delegateHistory.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                DelegationHistoryBaseItemView.m60918g(delegationHistoryFragment, item, view3);
            }
        });
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final boolean getF50032a() {
        return this.f50032a;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final boolean getF50033b() {
        return this.f50033b;
    }

    /* JADX INFO: renamed from: f */
    public static final Unit m60917f(DelegationEntity delegationEntity, BaseFragment baseFragment) {
        if (!C27025c.m66566d(delegationEntity.getPriceLimitTrigger())) {
            return Unit.INSTANCE;
        }
        AlertDialogFragmentHelper alertDialogFragmentHelperM54163T4 = AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54167X4(R$string.notice_prompt).m54156M4(baseFragment.getString(R$string.price_protect_part_deal)).m54163T4(baseFragment.getString(R$string.i_already_know), null);
        FragmentManager childFragmentManager = baseFragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        alertDialogFragmentHelperM54163T4.show(childFragmentManager, "request_order_tips_deal");
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: g */
    public static final void m60918g(BaseFragment baseFragment, DelegationEntity delegationEntity, View view) {
        DelegationHistoryFragment delegationHistoryFragment;
        Context context = baseFragment.getContext();
        if (context != null) {
            String string = baseFragment.getString(R$string.deal_detail);
            String name = DelegationDetailFragment.class.getName();
            C27051h c27051h = new C27051h();
            c27051h.m66721e("data", delegationEntity);
            String strM60905v4 = null;
            if (baseFragment instanceof DelegationHistoryFragment) {
                delegationHistoryFragment = (DelegationHistoryFragment) baseFragment;
            } else {
                delegationHistoryFragment = null;
            }
            if (delegationHistoryFragment != null) {
                strM60905v4 = delegationHistoryFragment.m60905v4();
            }
            c27051h.m66724h("tradeType", strM60905v4);
            Unit unit = Unit.INSTANCE;
            BaseFragmentActivity.m56574n0(context, string, name, c27051h.m66717a());
        }
    }
}
