package com.kubi.spot.business.delegation;

import android.view.View;
import android.widget.ImageView;
import androidx.fragment.app.FragmentManager;
import com.kubi.assets.AssetApiRemoteConfig;
import com.kubi.assets.api.IAssetsCenterService;
import com.kubi.data.entity.CoinInfoEntity;
import com.kubi.sdk.util.C24277v;
import com.kubi.spot.R$id;
import com.kubi.spot.business.delegation.assets.AccountItemEntity;
import com.kubi.unify.api.IUnifyAccountService;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import f30.C37330a;
import gf.C37890n;
import io.chad.library.adapter.base.BaseQuickAdapter;
import io.chad.library.adapter.base.BaseViewHolder;
import nf.C42827a;
import org.json.JSONException;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: TradeFundsListFragment.kt */
/* JADX INFO: loaded from: classes47.dex */
@Metadata(m90083d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0014¨\u0006\b"}, m90084d2 = {"com/kubi/spot/business/delegation/TradeFundsListFragment$fundsListAdapter$1", "Lio/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/kubi/spot/business/delegation/AccountItemEntityWrapper;", "Lio/chad/library/adapter/base/BaseViewHolder;", "convert", "", "helper", "entityWrapper", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nTradeFundsListFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TradeFundsListFragment.kt\ncom/kubi/spot/business/delegation/TradeFundsListFragment$fundsListAdapter$1\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,498:1\n256#2,2:499\n*S KotlinDebug\n*F\n+ 1 TradeFundsListFragment.kt\ncom/kubi/spot/business/delegation/TradeFundsListFragment$fundsListAdapter$1\n*L\n121#1:499,2\n*E\n"})
public final class TradeFundsListFragment$fundsListAdapter$1 extends BaseQuickAdapter<AccountItemEntityWrapper, BaseViewHolder> {

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ TradeFundsListFragment f49927i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TradeFundsListFragment$fundsListAdapter$1(TradeFundsListFragment tradeFundsListFragment, int i11) {
        super(i11);
        this.f49927i = tradeFundsListFragment;
    }

    /* JADX INFO: renamed from: q */
    public static final Unit m60695q(final TradeFundsListFragment tradeFundsListFragment, boolean z11, final AccountItemEntity accountItemEntity) {
        IAssetsCenterService iAssetsCenterService = IAssetsCenterService.f16464a.get();
        FragmentManager childFragmentManager = tradeFundsListFragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        iAssetsCenterService.mo15340e(childFragmentManager, z11, IUnifyAccountService.f53155a.get().mo64983G(), new Function0() { // from class: com.kubi.spot.business.delegation.v0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TradeFundsListFragment$fundsListAdapter$1.m60696r(tradeFundsListFragment, accountItemEntity);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: s */
    public static final Unit m60697s(boolean z11, TradeFundsListFragment tradeFundsListFragment, AccountItemEntity accountItemEntity) {
        if (z11) {
            tradeFundsListFragment.m60682k4(accountItemEntity);
        }
        return Unit.INSTANCE;
    }

    @Override // io.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public void convert(BaseViewHolder helper, final AccountItemEntityWrapper entityWrapper) {
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(entityWrapper, "entityWrapper");
        final AccountItemEntity accountItemEntity = entityWrapper.getAccountItemEntity();
        final boolean z11 = AssetApiRemoteConfig.f17838a.m17475d() && !C42827a.f94887a.m93899a(accountItemEntity.getCurrency());
        BaseViewHolder text = helper.setText(R$id.tv_coin_name, accountItemEntity.getCurrencyNameStr()).setText(R$id.tv_total_amount, accountItemEntity.getTotalBalanceStr()).setText(R$id.tv_fait_price_amount, accountItemEntity.getTotalBalancePriceStr());
        int i11 = R$id.tv_in_order_amount;
        BaseViewHolder text2 = text.setText(i11, accountItemEntity.getHoldBalanceStr());
        int i12 = R$id.tv_cost_amount;
        BaseViewHolder text3 = text2.setText(i12, accountItemEntity.getCostStr());
        int i13 = R$id.tv_fund_label;
        BaseViewHolder gone = text3.setText(i13, entityWrapper.getLabelText()).setGone(i13, true ^ StringsKt.isBlank(entityWrapper.getLabelText())).setGone(i11, accountItemEntity.isOrderVisible()).setGone(R$id.tv_in_order_name, accountItemEntity.isOrderVisible());
        int i14 = R$id.iv_edit_avg_cost;
        gone.setGone(i14, z11);
        View itemView = helper.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        final TradeFundsListFragment tradeFundsListFragment = this.f49927i;
        C27046k.m66711z(itemView, 0L, new Function0() { // from class: com.kubi.spot.business.delegation.o0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TradeFundsListFragment$fundsListAdapter$1.m60694p(tradeFundsListFragment, accountItemEntity);
            }
        }, 1, null);
        C37890n c37890n = C37890n.f85269a;
        String currency = accountItemEntity.getCurrency();
        if (currency == null) {
            currency = "";
        }
        CoinInfoEntity coinInfoEntityM85613u = c37890n.m85613u(currency);
        C24277v.m58542g((ImageView) helper.getView(R$id.iv_coin_avatar), C27041f.m66669i(coinInfoEntityM85613u != null ? coinInfoEntityM85613u.getIconUrl() : null, C27041f.m66668h(accountItemEntity.getIconUrl())));
        View view = helper.getView(R$id.tv_cost_name);
        Intrinsics.checkNotNullExpressionValue(view, "getView(...)");
        final TradeFundsListFragment tradeFundsListFragment2 = this.f49927i;
        C27046k.m66711z(view, 0L, new Function0() { // from class: com.kubi.spot.business.delegation.p0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TradeFundsListFragment$fundsListAdapter$1.m60695q(tradeFundsListFragment2, z11, accountItemEntity);
            }
        }, 1, null);
        View view2 = helper.getView(i14);
        Intrinsics.checkNotNullExpressionValue(view2, "getView(...)");
        view2.setVisibility(z11 ? 0 : 8);
        final TradeFundsListFragment tradeFundsListFragment3 = this.f49927i;
        final Function0 function0 = new Function0() { // from class: com.kubi.spot.business.delegation.q0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TradeFundsListFragment$fundsListAdapter$1.m60697s(z11, tradeFundsListFragment3, accountItemEntity);
            }
        };
        View view3 = helper.getView(i12);
        Intrinsics.checkNotNullExpressionValue(view3, "getView(...)");
        C27046k.m66711z(view3, 0L, new Function0() { // from class: com.kubi.spot.business.delegation.r0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TradeFundsListFragment$fundsListAdapter$1.m60698t(function0);
            }
        }, 1, null);
        View view4 = helper.getView(i14);
        Intrinsics.checkNotNullExpressionValue(view4, "getView(...)");
        C27046k.m66711z(view4, 0L, new Function0() { // from class: com.kubi.spot.business.delegation.s0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TradeFundsListFragment$fundsListAdapter$1.m60699u(function0);
            }
        }, 1, null);
        View view5 = helper.getView(R$id.buySellBtn);
        Intrinsics.checkNotNullExpressionValue(view5, "getView(...)");
        final TradeFundsListFragment tradeFundsListFragment4 = this.f49927i;
        C27046k.m66711z(view5, 0L, new Function0() { // from class: com.kubi.spot.business.delegation.t0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TradeFundsListFragment$fundsListAdapter$1.m60700v(tradeFundsListFragment4, entityWrapper);
            }
        }, 1, null);
        View view6 = helper.getView(R$id.addFundsBtn);
        Intrinsics.checkNotNullExpressionValue(view6, "getView(...)");
        final TradeFundsListFragment tradeFundsListFragment5 = this.f49927i;
        C27046k.m66711z(view6, 0L, new Function0() { // from class: com.kubi.spot.business.delegation.u0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TradeFundsListFragment$fundsListAdapter$1.m60701w(tradeFundsListFragment5, entityWrapper);
            }
        }, 1, null);
        View view7 = helper.getView(R$id.tvSymbolOfflineAlert);
        Intrinsics.checkNotNullExpressionValue(view7, "getView(...)");
        C37330a.m83912d(view7, this.f49927i.m60678e4(entityWrapper));
    }

    /* JADX INFO: renamed from: p */
    public static final Unit m60694p(TradeFundsListFragment tradeFundsListFragment, AccountItemEntity accountItemEntity) throws JSONException {
        tradeFundsListFragment.m60679f4(accountItemEntity);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: r */
    public static final Unit m60696r(TradeFundsListFragment tradeFundsListFragment, AccountItemEntity accountItemEntity) {
        tradeFundsListFragment.m60682k4(accountItemEntity);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: t */
    public static final Unit m60698t(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: u */
    public static final Unit m60699u(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: v */
    public static final Unit m60700v(TradeFundsListFragment tradeFundsListFragment, AccountItemEntityWrapper accountItemEntityWrapper) {
        tradeFundsListFragment.m60681i4(accountItemEntityWrapper);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: w */
    public static final Unit m60701w(TradeFundsListFragment tradeFundsListFragment, AccountItemEntityWrapper accountItemEntityWrapper) {
        tradeFundsListFragment.m60680g4(accountItemEntityWrapper);
        return Unit.INSTANCE;
    }
}
