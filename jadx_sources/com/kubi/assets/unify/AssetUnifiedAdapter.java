package com.kubi.assets.unify;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.fasterxml.jackson.databind.node.C6447a;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.assets.AssetApiRemoteConfig;
import com.kubi.assets.R$id;
import com.kubi.assets.R$layout;
import com.kubi.assets.R$string;
import com.kubi.assets.entity.EarnAccountItem;
import com.kubi.assets.entity.UnifiedAssetsEntity;
import com.kubi.assets.holdearn.HoldEarnOpenDialog;
import com.kubi.assets.holdearn.HoldEarnTipView;
import com.kubi.assets.service.AssetsService;
import com.kubi.assets.unify.detail.UnifiedAccountDetailFragment;
import com.kubi.data.entity.CoinInfoEntity;
import com.kubi.resources.CollateralStatusUiHelper;
import com.kubi.resources.dialog.AlertDialogFragmentHelper;
import com.kubi.resources.widget.ShowHideTextView;
import com.kubi.sdk.site.C24129b;
import com.kubi.sdk.site.SiteVisibleConfigKey;
import com.kubi.sdk.util.C24277v;
import com.kubi.unify.api.IUnifyAccountService;
import com.kubi.user.config.UserInfo;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import gf.C37890n;
import io.chad.library.adapter.base.BaseQuickAdapter;
import io.chad.library.adapter.base.BaseViewHolder;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import nf.C42827a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p402kf.C41014a;
import p481ny.C42899b;
import p569qq.C43852m;
import p852kotlin.Metadata;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.SetsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import rs.AbstractC44173c;
import rs.C44172b;

/* JADX INFO: compiled from: AssetUnifiedAdapter.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\"\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010+\u001a\u00020&2\u0006\u0010,\u001a\u00020\u00032\u0006\u0010-\u001a\u00020\u0002H\u0014J\u0010\u0010.\u001a\u00020&2\u0006\u0010-\u001a\u00020\u0002H\u0002R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR*\u0010\u0010\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R(\u0010\u0017\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\u00180\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0014\"\u0004\b\u001a\u0010\u0016R\u001a\u0010\u001b\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\r\"\u0004\b\u001d\u0010\u000fR \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00120\u001fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\"\u0010$\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010%X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*¨\u0006/"}, m90084d2 = {"Lcom/kubi/assets/unify/AssetUnifiedAdapter;", "Lio/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/kubi/assets/entity/UnifiedAssetsEntity;", "Lio/chad/library/adapter/base/BaseViewHolder;", "fragment", "Lcom/kubi/assets/unify/AssetUnifiedFragment;", "<init>", "(Lcom/kubi/assets/unify/AssetUnifiedFragment;)V", "getFragment", "()Lcom/kubi/assets/unify/AssetUnifiedFragment;", "hideNumber", "", "getHideNumber", "()Z", "setHideNumber", "(Z)V", "rateMap", "", "", "getRateMap", "()Ljava/util/Map;", "setRateMap", "(Ljava/util/Map;)V", "productsMap", "Lcom/kubi/assets/entity/EarnAccountItem;", "getProductsMap", "setProductsMap", "marginCurrencyFeatureAvailable", "getMarginCurrencyFeatureAvailable", "setMarginCurrencyFeatureAvailable", "marginCurrencySet", "", "getMarginCurrencySet", "()Ljava/util/Set;", "setMarginCurrencySet", "(Ljava/util/Set;)V", "onCostPriceUpdated", "Lkotlin/Function0;", "", "getOnCostPriceUpdated", "()Lkotlin/jvm/functions/Function0;", "setOnCostPriceUpdated", "(Lkotlin/jvm/functions/Function0;)V", "convert", "helper", TUIConstants.TIMPush.NOTIFICATION.ENTITY, "openEditAvgCost", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class AssetUnifiedAdapter extends BaseQuickAdapter<UnifiedAssetsEntity, BaseViewHolder> {

    /* JADX INFO: renamed from: i */
    @NotNull
    public final AssetUnifiedFragment f18911i;

    /* JADX INFO: renamed from: j */
    public boolean f18912j;

    /* JADX INFO: renamed from: k */
    @NotNull
    public Map<String, String> f18913k;

    /* JADX INFO: renamed from: l */
    @NotNull
    public Map<String, EarnAccountItem> f18914l;

    /* JADX INFO: renamed from: m */
    public boolean f18915m;

    /* JADX INFO: renamed from: n */
    @NotNull
    public Set<String> f18916n;

    /* JADX INFO: renamed from: o */
    @Nullable
    public Function0<Unit> f18917o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AssetUnifiedAdapter(@NotNull AssetUnifiedFragment fragment) {
        super(R$layout.item_asset_unified_account);
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        this.f18911i = fragment;
        this.f18913k = new HashMap();
        this.f18914l = new HashMap();
        this.f18916n = SetsKt.emptySet();
    }

    /* JADX INFO: renamed from: B */
    public static final Unit m19583B(AssetUnifiedAdapter assetUnifiedAdapter) {
        Function0<Unit> function0 = assetUnifiedAdapter.f18917o;
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: q */
    public static final Unit m19593q(UnifiedAssetsEntity unifiedAssetsEntity) {
        C42899b.m94073c(new Function1() { // from class: com.kubi.assets.unify.i
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AssetUnifiedAdapter.m19594r((FragmentActivity) obj);
            }
        });
        C43852m.m96590b("B5UnifyTrading", "holdToEarnLabel", "1", TuplesKt.m90091to(FirebaseAnalytics.Param.CURRENCY, C27041f.m66668h(unifiedAssetsEntity.getCurrency())));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final Unit m19594r(FragmentActivity it) {
        Intrinsics.checkNotNullParameter(it, "it");
        HoldEarnOpenDialog holdEarnOpenDialogCreate = HoldEarnOpenDialog.f17726y0.create(C43852m.m96601m("B5UnifyTrading", "holdToEarnLabel", "1"));
        FragmentManager supportFragmentManager = it.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        holdEarnOpenDialogCreate.show(supportFragmentManager, "HoldEarnOpenDialog");
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: t */
    public static final Unit m19596t(AssetUnifiedAdapter assetUnifiedAdapter) {
        AlertDialogFragmentHelper alertDialogFragmentHelperM54162S4 = AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54167X4(R$string.unify_fund_avg_liabilities).m54153J4(R$string.unify_fund_avg_liabilities_desc).m54162S4(R$string.i_already_know, null);
        FragmentManager childFragmentManager = assetUnifiedAdapter.f18911i.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        alertDialogFragmentHelperM54162S4.show(childFragmentManager, "UnifiedDebtAmountDialog");
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: u */
    public static final Unit m19597u(boolean z11, final AssetUnifiedAdapter assetUnifiedAdapter, boolean z12, final UnifiedAssetsEntity unifiedAssetsEntity) throws JSONException {
        if (z11) {
            JSONObject jSONObject = new JSONObject();
            String currency = unifiedAssetsEntity.getCurrency();
            if (currency == null) {
                currency = "";
            }
            jSONObject.put("coin", currency);
            Unit unit = Unit.INSTANCE;
            C43852m.m96589a("B5UnifyTrading", "coin", "avgPrice", jSONObject);
            AssetsService assetsService = new AssetsService();
            FragmentManager childFragmentManager = assetUnifiedAdapter.f18911i.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            assetsService.mo15340e(childFragmentManager, z12, IUnifyAccountService.f53155a.get().mo64983G(), new Function0() { // from class: com.kubi.assets.unify.h
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AssetUnifiedAdapter.m19598v(this.f19024b, unifiedAssetsEntity);
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: w */
    public static final Unit m19599w(boolean z11, AssetUnifiedAdapter assetUnifiedAdapter, UnifiedAssetsEntity unifiedAssetsEntity) {
        if (z11) {
            assetUnifiedAdapter.m19601A(unifiedAssetsEntity);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: x */
    public static final Unit m19600x(boolean z11, AssetUnifiedAdapter assetUnifiedAdapter, UnifiedAssetsEntity unifiedAssetsEntity) {
        if (z11) {
            assetUnifiedAdapter.m19601A(unifiedAssetsEntity);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: A */
    public final void m19601A(UnifiedAssetsEntity unifiedAssetsEntity) {
        BigDecimal bigDecimalM11724a;
        AssetsService assetsService = new AssetsService();
        AssetUnifiedFragment assetUnifiedFragment = this.f18911i;
        String currency = unifiedAssetsEntity.getCurrency();
        if (currency == null) {
            currency = "";
        }
        BigDecimal avgCostPrice = unifiedAssetsEntity.getAvgCostPrice();
        assetsService.mo15352r(assetUnifiedFragment, currency, (avgCostPrice == null || (bigDecimalM11724a = C6447a.m11724a(avgCostPrice)) == null) ? null : bigDecimalM11724a.toPlainString(), new Function0() { // from class: com.kubi.assets.unify.g
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AssetUnifiedAdapter.m19583B(this.f19022b);
            }
        }, "B5UnifyTrading", "unifiedFundsEditAvgCost");
    }

    /* JADX INFO: renamed from: C */
    public final void m19602C(boolean z11) {
        this.f18912j = z11;
    }

    /* JADX INFO: renamed from: D */
    public final void m19603D(boolean z11) {
        this.f18915m = z11;
    }

    /* JADX INFO: renamed from: E */
    public final void m19604E(@NotNull Set<String> set) {
        Intrinsics.checkNotNullParameter(set, "<set-?>");
        this.f18916n = set;
    }

    /* JADX INFO: renamed from: F */
    public final void m19605F(@Nullable Function0<Unit> function0) {
        this.f18917o = function0;
    }

    /* JADX INFO: renamed from: G */
    public final void m19606G(@NotNull Map<String, EarnAccountItem> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.f18914l = map;
    }

    /* JADX INFO: renamed from: H */
    public final void m19607H(@NotNull Map<String, String> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.f18913k = map;
    }

    @Override // io.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public void convert(@NotNull final BaseViewHolder helper, @NotNull final UnifiedAssetsEntity entity) {
        Integer numIsHoldEarnOpen;
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(entity, "entity");
        int i11 = R$id.tv_total_amount;
        View view = helper.getView(i11);
        Intrinsics.checkNotNullExpressionValue(view, "getView(...)");
        C44172b.m97383c((TextView) view, new AbstractC44173c.a(0, false, 3, null), false, 2, null);
        int i12 = R$id.tv_fait_price_amount;
        View view2 = helper.getView(i12);
        Intrinsics.checkNotNullExpressionValue(view2, "getView(...)");
        C44172b.m97383c((TextView) view2, new AbstractC44173c.a(0, false, 3, null), false, 2, null);
        int i13 = R$id.tv_unavailable_amount;
        View view3 = helper.getView(i13);
        Intrinsics.checkNotNullExpressionValue(view3, "getView(...)");
        C44172b.m97383c((TextView) view3, new AbstractC44173c.a(0, false, 3, null), false, 2, null);
        int i14 = R$id.tv_cost_amount;
        View view4 = helper.getView(i14);
        Intrinsics.checkNotNullExpressionValue(view4, "getView(...)");
        C44172b.m97383c((TextView) view4, new AbstractC44173c.a(0, false, 3, null), false, 2, null);
        int i15 = R$id.tv_debt_amount;
        View view5 = helper.getView(i15);
        Intrinsics.checkNotNullExpressionValue(view5, "getView(...)");
        C44172b.m97383c((TextView) view5, new AbstractC44173c.a(0, false, 3, null), false, 2, null);
        AssetApiRemoteConfig assetApiRemoteConfig = AssetApiRemoteConfig.f17838a;
        final boolean z11 = (!assetApiRemoteConfig.m17476e() || C42827a.f94887a.m93899a(entity.getCurrency()) || C41014a.m89917B(entity.getEquity())) ? false : true;
        final boolean z12 = assetApiRemoteConfig.m17475d() && z11;
        BaseViewHolder gone = helper.setText(R$id.tv_coin_name, entity.getCurrencyNameStr()).setText(R$id.tv_currency_full_name, entity.getCurrencyFullNameStr()).setText(i11, entity.getTotalBalanceStr()).setText(i12, entity.getTotalBalancePriceStr()).setText(i13, entity.getUnavailableEquityStr()).setText(i15, entity.getLiabilityStr()).setText(i14, entity.getAvgCostPriceStr()).setGone(R$id.tv_fiat_lab, entity.isFiat()).setGone(i13, entity.isOrderVisible()).setGone(R$id.tv_unavailable_name, entity.isOrderVisible()).setGone(R$id.tv_debt_name, entity.isLiabilityVisible()).setGone(i15, entity.isLiabilityVisible());
        int i16 = R$id.tv_cost_name;
        BaseViewHolder gone2 = gone.setGone(i16, z11).setGone(i14, z11);
        int i17 = R$id.iv_edit_avg_cost;
        gone2.setGone(i17, z12);
        CollateralStatusUiHelper.m54264g(CollateralStatusUiHelper.f43602a, (ImageView) helper.getView(R$id.ivCollateralStatus), entity.getCollateralStatus(), this.f18911i.getChildFragmentManager(), "AssetUnifiedCollateralStatusDialog", null, 16, null);
        HoldEarnTipView holdEarnTipView = (HoldEarnTipView) helper.getView(R$id.holdEarnTip);
        EarnAccountItem earnAccountItem = this.f18914l.get(C27041f.m66668h(entity.getCurrency()));
        if (earnAccountItem == null || (((numIsHoldEarnOpen = earnAccountItem.isHoldEarnOpen()) != null && numIsHoldEarnOpen.intValue() == 1) || earnAccountItem.getHoldEarnApr() == null || Double.parseDouble(earnAccountItem.getHoldEarnApr()) <= 0.0d || !C24129b.m58030b(SiteVisibleConfigKey.EARN_HOLD_TO_EARN) || UserInfo.c().getType() == 3)) {
            Intrinsics.checkNotNull(holdEarnTipView);
            ViewExtKt.m66577h(holdEarnTipView);
        } else {
            Intrinsics.checkNotNull(holdEarnTipView);
            ViewExtKt.m66594y(holdEarnTipView);
            holdEarnTipView.setText(earnAccountItem.getHoldEarnAprText());
            C27046k.m66711z(holdEarnTipView, 0L, new Function0() { // from class: com.kubi.assets.unify.a
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AssetUnifiedAdapter.m19593q(entity);
                }
            }, 1, null);
        }
        View itemView = helper.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        C27046k.m66711z(itemView, 0L, new Function0() { // from class: com.kubi.assets.unify.b
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AssetUnifiedAdapter.m19595s(helper, entity, this);
            }
        }, 1, null);
        C37890n c37890n = C37890n.f85269a;
        String currency = entity.getCurrency();
        if (currency == null) {
            currency = "";
        }
        CoinInfoEntity coinInfoEntityM85613u = c37890n.m85613u(currency);
        C24277v.m58542g((ImageView) helper.getView(R$id.iv_icon), C27041f.m66669i(coinInfoEntityM85613u != null ? coinInfoEntityM85613u.getIconUrl() : null, C27041f.m66668h(entity.getIconUrl())));
        helper.setGone(R$id.iv_margin_currency_checked, this.f18915m && UnifyMarginCurrencyHelper.f19058a.m19893a(this.f18916n, entity.getCurrency()));
        ShowHideTextView.m54778d(helper.itemView, this.f18912j);
        View view6 = helper.getView(i15);
        Intrinsics.checkNotNullExpressionValue(view6, "getView(...)");
        C27046k.m66711z(view6, 0L, new Function0() { // from class: com.kubi.assets.unify.c
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AssetUnifiedAdapter.m19596t(this.f18949b);
            }
        }, 1, null);
        View view7 = helper.getView(i16);
        Intrinsics.checkNotNullExpressionValue(view7, "getView(...)");
        C27046k.m66711z(view7, 0L, new Function0() { // from class: com.kubi.assets.unify.d
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AssetUnifiedAdapter.m19597u(z11, this, z12, entity);
            }
        }, 1, null);
        View view8 = helper.getView(i14);
        Intrinsics.checkNotNullExpressionValue(view8, "getView(...)");
        C27046k.m66711z(view8, 0L, new Function0() { // from class: com.kubi.assets.unify.e
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AssetUnifiedAdapter.m19599w(z12, this, entity);
            }
        }, 1, null);
        View view9 = helper.getView(i17);
        Intrinsics.checkNotNullExpressionValue(view9, "getView(...)");
        C27046k.m66711z(view9, 0L, new Function0() { // from class: com.kubi.assets.unify.f
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AssetUnifiedAdapter.m19600x(z12, this, entity);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: y, reason: from getter */
    public final boolean getF18915m() {
        return this.f18915m;
    }

    /* JADX INFO: renamed from: s */
    public static final Unit m19595s(BaseViewHolder baseViewHolder, UnifiedAssetsEntity unifiedAssetsEntity, AssetUnifiedAdapter assetUnifiedAdapter) {
        String code;
        if (baseViewHolder.getAdapterPosition() < 0) {
            return Unit.INSTANCE;
        }
        String strValueOf = String.valueOf(baseViewHolder.getAdapterPosition());
        JSONObject jSONObject = new JSONObject();
        CoinInfoEntity coinInfoEntityM85613u = C37890n.f85269a.m85613u(C27041f.m66668h(unifiedAssetsEntity.getCurrency()));
        if (coinInfoEntityM85613u != null) {
            code = coinInfoEntityM85613u.getCode();
        } else {
            code = null;
        }
        if (code == null) {
            code = "";
        }
        C43852m.m96589a("B5UnifyTrading", "coinList", strValueOf, jSONObject.put("coin", code));
        UnifiedAccountDetailFragment.Companion companion = UnifiedAccountDetailFragment.f18957n0;
        Context contextRequireContext = assetUnifiedAdapter.f18911i.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        companion.startFragment(contextRequireContext, unifiedAssetsEntity);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: v */
    public static final Unit m19598v(AssetUnifiedAdapter assetUnifiedAdapter, UnifiedAssetsEntity unifiedAssetsEntity) {
        assetUnifiedAdapter.m19601A(unifiedAssetsEntity);
        return Unit.INSTANCE;
    }
}
