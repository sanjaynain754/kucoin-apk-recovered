package com.kubi.assets.spot;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.assets.AssetApiRemoteConfig;
import com.kubi.assets.R$id;
import com.kubi.assets.R$layout;
import com.kubi.assets.R$string;
import com.kubi.assets.detail.CoinDetailDispatcher;
import com.kubi.assets.entity.AccountItemEntity;
import com.kubi.assets.entity.EarnAccountItem;
import com.kubi.assets.holdearn.HoldEarnOpenDialog;
import com.kubi.assets.holdearn.HoldEarnTipView;
import com.kubi.assets.service.AssetsService;
import com.kubi.data.entity.CoinInfoEntity;
import com.kubi.resources.widget.ShowHideTextView;
import com.kubi.sdk.site.C24129b;
import com.kubi.sdk.site.SiteVisibleConfigKey;
import com.kubi.sdk.util.C24277v;
import com.kubi.unify.api.IUnifyAccountService;
import com.kubi.user.config.UserInfo;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.DowngradeExKt;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import e60.C37084b;
import gf.C37885i;
import gf.C37890n;
import io.chad.library.adapter.base.BaseQuickAdapter;
import io.chad.library.adapter.base.BaseViewHolder;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import nf.C42827a;
import nf.C42828b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p481ny.C42899b;
import p569qq.C43852m;
import p852kotlin.Metadata;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;
import rs.AbstractC44173c;
import rs.C44172b;

/* JADX INFO: compiled from: AssetV2SpotAdapter.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\u001e\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\"\u001a\u00020\u001d2\u0006\u0010#\u001a\u00020\u00032\u0006\u0010$\u001a\u00020\u0002H\u0014J\u0010\u0010%\u001a\u00020\u001d2\u0006\u0010$\u001a\u00020\u0002H\u0002J\u001c\u0010'\u001a\u00020\u001d2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00020)2\u0006\u0010&\u001a\u00020\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR*\u0010\u0010\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R(\u0010\u0017\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\u00180\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0014\"\u0004\b\u001a\u0010\u0016R\"\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001cX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u000e\u0010&\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006*"}, m90084d2 = {"Lcom/kubi/assets/spot/AssetV2SpotAdapter;", "Lio/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/kubi/assets/entity/AccountItemEntity;", "Lio/chad/library/adapter/base/BaseViewHolder;", "fragment", "Lcom/kubi/assets/spot/AssetV2SpotFragment;", "<init>", "(Lcom/kubi/assets/spot/AssetV2SpotFragment;)V", "getFragment", "()Lcom/kubi/assets/spot/AssetV2SpotFragment;", "hideNumber", "", "getHideNumber", "()Z", "setHideNumber", "(Z)V", "rateMap", "", "", "getRateMap", "()Ljava/util/Map;", "setRateMap", "(Ljava/util/Map;)V", "productsMap", "Lcom/kubi/assets/entity/EarnAccountItem;", "getProductsMap", "setProductsMap", "onCostEditSuccess", "Lkotlin/Function0;", "", "getOnCostEditSuccess", "()Lkotlin/jvm/functions/Function0;", "setOnCostEditSuccess", "(Lkotlin/jvm/functions/Function0;)V", "convert", "helper", TUIConstants.TIMPush.NOTIFICATION.ENTITY, "openEditAvgCost", "filterText", "replaceData", "data", "", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class AssetV2SpotAdapter extends BaseQuickAdapter<AccountItemEntity, BaseViewHolder> {

    /* JADX INFO: renamed from: i */
    @NotNull
    public final AssetV2SpotFragment f18805i;

    /* JADX INFO: renamed from: j */
    public boolean f18806j;

    /* JADX INFO: renamed from: k */
    @NotNull
    public Map<String, String> f18807k;

    /* JADX INFO: renamed from: l */
    @NotNull
    public Map<String, EarnAccountItem> f18808l;

    /* JADX INFO: renamed from: m */
    @Nullable
    public Function0<Unit> f18809m;

    /* JADX INFO: renamed from: n */
    @NotNull
    public String f18810n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AssetV2SpotAdapter(@NotNull AssetV2SpotFragment fragment) {
        super(R$layout.item_asset_spot_account);
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        this.f18805i = fragment;
        this.f18807k = new HashMap();
        this.f18808l = new HashMap();
        this.f18810n = "";
    }

    /* JADX INFO: renamed from: q */
    public static final Unit m19378q(AccountItemEntity accountItemEntity) {
        C42899b.m94073c(new Function1() { // from class: com.kubi.assets.spot.g
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AssetV2SpotAdapter.m19379r((FragmentActivity) obj);
            }
        });
        C43852m.m96590b("B5TradeAccount", "holdToEarnLabel", "1", TuplesKt.m90091to(FirebaseAnalytics.Param.CURRENCY, C27041f.m66668h(accountItemEntity.getCurrency())));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: r */
    public static final Unit m19379r(FragmentActivity it) {
        Intrinsics.checkNotNullParameter(it, "it");
        HoldEarnOpenDialog holdEarnOpenDialogCreate = HoldEarnOpenDialog.f17726y0.create(C43852m.m96601m("B5TradeAccount", "holdToEarnLabel", "1"));
        FragmentManager supportFragmentManager = it.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        holdEarnOpenDialogCreate.show(supportFragmentManager, "HoldEarnOpenDialog");
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: s */
    public static final Unit m19380s(final AssetV2SpotAdapter assetV2SpotAdapter, boolean z11, final AccountItemEntity accountItemEntity) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        String currency = accountItemEntity.getCurrency();
        if (currency == null) {
            currency = "";
        }
        jSONObject.put("coin", currency);
        Unit unit = Unit.INSTANCE;
        C43852m.m96589a("B5TradeAccount", "coin", "avgPrice", jSONObject);
        AssetsService assetsService = new AssetsService();
        FragmentManager childFragmentManager = assetV2SpotAdapter.f18805i.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        assetsService.mo15340e(childFragmentManager, z11, IUnifyAccountService.f53155a.get().mo64983G(), new Function0() { // from class: com.kubi.assets.spot.f
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AssetV2SpotAdapter.m19381t(this.f18876b, accountItemEntity);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: u */
    public static final Unit m19382u(boolean z11, AssetV2SpotAdapter assetV2SpotAdapter, AccountItemEntity accountItemEntity) {
        if (z11) {
            assetV2SpotAdapter.m19390w(accountItemEntity);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: v */
    public static final Unit m19383v(boolean z11, AssetV2SpotAdapter assetV2SpotAdapter, AccountItemEntity accountItemEntity) {
        if (z11) {
            assetV2SpotAdapter.m19390w(accountItemEntity);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: x */
    public static final Unit m19384x(AssetV2SpotAdapter assetV2SpotAdapter) {
        Function0<Unit> function0 = assetV2SpotAdapter.f18809m;
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: A */
    public final void m19385A(boolean z11) {
        this.f18806j = z11;
    }

    /* JADX INFO: renamed from: B */
    public final void m19386B(@Nullable Function0<Unit> function0) {
        this.f18809m = function0;
    }

    /* JADX INFO: renamed from: C */
    public final void m19387C(@NotNull Map<String, EarnAccountItem> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.f18808l = map;
    }

    /* JADX INFO: renamed from: D */
    public final void m19388D(@NotNull Map<String, String> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.f18807k = map;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x011a  */
    @Override // io.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public void convert(@NotNull final BaseViewHolder helper, @NotNull final AccountItemEntity entity) {
        String strM85565d;
        int i11;
        Integer numIsHoldEarnOpen;
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(entity, "entity");
        final boolean z11 = AssetApiRemoteConfig.f17838a.m17475d() && !C42827a.f94887a.m93899a(entity.getCurrency());
        int i12 = R$id.tv_total_amount;
        View view = helper.getView(i12);
        Intrinsics.checkNotNullExpressionValue(view, "getView(...)");
        C44172b.m97383c((TextView) view, new AbstractC44173c.a(0, false, 3, null), false, 2, null);
        int i13 = R$id.tv_fait_price_amount;
        View view2 = helper.getView(i13);
        Intrinsics.checkNotNullExpressionValue(view2, "getView(...)");
        C44172b.m97383c((TextView) view2, new AbstractC44173c.a(0, false, 3, null), false, 2, null);
        int i14 = R$id.tv_in_order_amount;
        View view3 = helper.getView(i14);
        Intrinsics.checkNotNullExpressionValue(view3, "getView(...)");
        C44172b.m97383c((TextView) view3, new AbstractC44173c.a(0, false, 3, null), false, 2, null);
        int i15 = R$id.tv_cost_amount;
        View view4 = helper.getView(i15);
        Intrinsics.checkNotNullExpressionValue(view4, "getView(...)");
        C44172b.m97383c((TextView) view4, new AbstractC44173c.a(0, false, 3, null), false, 2, null);
        int i16 = R$id.tv_coin_name;
        BaseViewHolder text = helper.setText(i16, entity.getCurrencyNameStr());
        int i17 = R$id.tv_currency_full_name;
        BaseViewHolder gone = text.setText(i17, entity.getCurrencyFullNameStr()).setText(i12, entity.getTotalBalanceStr()).setText(i13, entity.getTotalBalancePriceStr()).setText(i14, entity.getHoldBalanceStr()).setText(i15, entity.getCostStr()).setGone(R$id.tv_fiat_lab, entity.isFiat()).setGone(i14, entity.isOrderVisible()).setGone(R$id.tv_in_order_name, entity.isOrderVisible());
        int i18 = R$id.iv_edit_avg_cost;
        gone.setGone(i18, z11);
        if (!StringsKt.isBlank(this.f18810n)) {
            View view5 = helper.getView(i16);
            Intrinsics.checkNotNullExpressionValue(view5, "getView(...)");
            C37084b.m83008c((TextView) view5, this.f18810n);
            View view6 = helper.getView(i17);
            Intrinsics.checkNotNullExpressionValue(view6, "getView(...)");
            C37084b.m83008c((TextView) view6, this.f18810n);
        }
        View itemView = helper.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        C27046k.m66711z(itemView, 0L, new Function0() { // from class: com.kubi.assets.spot.a
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AssetV2SpotAdapter.m19377p(helper, entity);
            }
        }, 1, null);
        TextView textView = (TextView) helper.getView(R$id.tv_lend);
        if (!entity.isFiat()) {
            CoinInfoEntity coinInfoEntityM85613u = C37890n.f85269a.m85613u(C27041f.m66668h(entity.getCurrency()));
            if (C27025c.m66566d(coinInfoEntityM85613u != null ? Boolean.valueOf(coinInfoEntityM85613u.isEarnEnabled()) : null)) {
                AssetV2SpotFragment assetV2SpotFragment = this.f18805i;
                int i19 = R$string.earn_coin_percentage_tag;
                StringBuilder sb2 = new StringBuilder();
                sb2.append((char) 8207);
                BigDecimal bigDecimalM66536f = DowngradeExKt.m66536f(this.f18807k.get(C27041f.m66668h(entity.getCurrency())));
                sb2.append((bigDecimalM66536f == null || (strM85565d = C37885i.m85565d(bigDecimalM66536f, 0, 0, 1, null)) == null) ? null : C42828b.m93905f(strM85565d, "%", true, false));
                textView.setText(assetV2SpotFragment.getString(i19, sb2.toString()));
                String str = this.f18807k.get(C27041f.m66668h(entity.getCurrency()));
                i11 = (str == null || str.length() == 0) ? 8 : 0;
            }
        }
        textView.setVisibility(i11);
        HoldEarnTipView holdEarnTipView = (HoldEarnTipView) helper.getView(R$id.holdEarnTip);
        EarnAccountItem earnAccountItem = this.f18808l.get(C27041f.m66668h(entity.getCurrency()));
        if (earnAccountItem == null || (((numIsHoldEarnOpen = earnAccountItem.isHoldEarnOpen()) != null && numIsHoldEarnOpen.intValue() == 1) || earnAccountItem.getHoldEarnApr() == null || Double.parseDouble(earnAccountItem.getHoldEarnApr()) <= 0.0d || !C24129b.m58030b(SiteVisibleConfigKey.EARN_HOLD_TO_EARN) || UserInfo.c().getType() == 3)) {
            Intrinsics.checkNotNull(holdEarnTipView);
            ViewExtKt.m66577h(holdEarnTipView);
        } else {
            Intrinsics.checkNotNull(holdEarnTipView);
            ViewExtKt.m66594y(holdEarnTipView);
            Intrinsics.checkNotNull(textView);
            ViewExtKt.m66577h(textView);
            holdEarnTipView.setText(earnAccountItem.getHoldEarnAprText());
            C27046k.m66711z(holdEarnTipView, 0L, new Function0() { // from class: com.kubi.assets.spot.b
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AssetV2SpotAdapter.m19378q(entity);
                }
            }, 1, null);
        }
        C37890n c37890n = C37890n.f85269a;
        String currency = entity.getCurrency();
        if (currency == null) {
            currency = "";
        }
        CoinInfoEntity coinInfoEntityM85613u2 = c37890n.m85613u(currency);
        C24277v.m58542g((ImageView) helper.getView(R$id.iv_icon), C27041f.m66669i(coinInfoEntityM85613u2 != null ? coinInfoEntityM85613u2.getIconUrl() : null, C27041f.m66668h(entity.getIconUrl())));
        ShowHideTextView.m54778d(helper.itemView, this.f18806j);
        View view7 = helper.getView(R$id.tv_cost_name);
        Intrinsics.checkNotNullExpressionValue(view7, "getView(...)");
        C27046k.m66711z(view7, 0L, new Function0() { // from class: com.kubi.assets.spot.c
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AssetV2SpotAdapter.m19380s(this.f18831b, z11, entity);
            }
        }, 1, null);
        View view8 = helper.getView(i15);
        Intrinsics.checkNotNullExpressionValue(view8, "getView(...)");
        C27046k.m66711z(view8, 0L, new Function0() { // from class: com.kubi.assets.spot.d
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AssetV2SpotAdapter.m19382u(z11, this, entity);
            }
        }, 1, null);
        View view9 = helper.getView(i18);
        Intrinsics.checkNotNullExpressionValue(view9, "getView(...)");
        C27046k.m66711z(view9, 0L, new Function0() { // from class: com.kubi.assets.spot.e
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AssetV2SpotAdapter.m19383v(z11, this, entity);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: w */
    public final void m19390w(AccountItemEntity accountItemEntity) {
        AssetsService assetsService = new AssetsService();
        AssetV2SpotFragment assetV2SpotFragment = this.f18805i;
        String currency = accountItemEntity.getCurrency();
        if (currency == null) {
            currency = "";
        }
        assetsService.mo15352r(assetV2SpotFragment, currency, accountItemEntity.getCostUsdt(), new Function0() { // from class: com.kubi.assets.spot.h
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AssetV2SpotAdapter.m19384x(this.f18881b);
            }
        }, "B5TradeAccount", "spotFundsEditAvgCost");
    }

    /* JADX INFO: renamed from: y */
    public final void m19391y(@NotNull Collection<AccountItemEntity> data, @NotNull String filterText) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(filterText, "filterText");
        this.f18810n = filterText;
        super.replaceData(data);
    }

    /* JADX INFO: renamed from: p */
    public static final Unit m19377p(BaseViewHolder baseViewHolder, AccountItemEntity accountItemEntity) {
        String code;
        if (baseViewHolder.getAdapterPosition() < 0) {
            return Unit.INSTANCE;
        }
        String strValueOf = String.valueOf(baseViewHolder.getAdapterPosition());
        JSONObject jSONObject = new JSONObject();
        CoinInfoEntity coinInfoEntityM85613u = C37890n.f85269a.m85613u(C27041f.m66668h(accountItemEntity.getCurrency()));
        if (coinInfoEntityM85613u != null) {
            code = coinInfoEntityM85613u.getCode();
        } else {
            code = null;
        }
        String str = "";
        if (code == null) {
            code = "";
        }
        C43852m.m96589a("B5TradeAccount", "coinList", strValueOf, jSONObject.put("coin", code));
        CoinDetailDispatcher.Companion companion = CoinDetailDispatcher.f16880U;
        String currency = accountItemEntity.getCurrency();
        if (currency != null) {
            str = currency;
        }
        companion.start(2, str, C43852m.m96601m("B5TradeAccount", "coinList", String.valueOf(baseViewHolder.getAdapterPosition())));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: t */
    public static final Unit m19381t(AssetV2SpotAdapter assetV2SpotAdapter, AccountItemEntity accountItemEntity) {
        assetV2SpotAdapter.m19390w(accountItemEntity);
        return Unit.INSTANCE;
    }
}
