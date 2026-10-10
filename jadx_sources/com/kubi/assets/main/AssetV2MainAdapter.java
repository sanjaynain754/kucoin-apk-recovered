package com.kubi.assets.main;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.assets.R$id;
import com.kubi.assets.R$layout;
import com.kubi.assets.R$string;
import com.kubi.assets.detail.CoinDetailDispatcher;
import com.kubi.assets.entity.AccountItemEntity;
import com.kubi.assets.entity.EarnAccountItem;
import com.kubi.assets.holdearn.HoldEarnOpenDialog;
import com.kubi.assets.holdearn.HoldEarnTipView;
import com.kubi.data.entity.CoinInfoEntity;
import com.kubi.resources.widget.ShowHideTextView;
import com.kubi.sdk.site.C24129b;
import com.kubi.sdk.site.SiteVisibleConfigKey;
import com.kubi.sdk.util.C24277v;
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
import nf.C42828b;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import p481ny.C42899b;
import p569qq.C43841b;
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

/* JADX INFO: compiled from: AssetV2MainAdapter.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u001e\u0010\u001c\u001a\u00020\u001d2\u000e\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u001f2\u0006\u0010\u001b\u001a\u00020\u0012J\u0018\u0010 \u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\u00032\u0006\u0010\"\u001a\u00020\u0002H\u0014R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR*\u0010\u0010\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R(\u0010\u0017\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\u00180\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0014\"\u0004\b\u001a\u0010\u0016R\u000e\u0010\u001b\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006#"}, m90084d2 = {"Lcom/kubi/assets/main/AssetV2MainAdapter;", "Lio/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/kubi/assets/entity/AccountItemEntity;", "Lio/chad/library/adapter/base/BaseViewHolder;", "fragment", "Lcom/kubi/assets/main/AssetV2MainFragment;", "<init>", "(Lcom/kubi/assets/main/AssetV2MainFragment;)V", "getFragment", "()Lcom/kubi/assets/main/AssetV2MainFragment;", "hideNumber", "", "getHideNumber", "()Z", "setHideNumber", "(Z)V", "rateMap", "", "", "getRateMap", "()Ljava/util/Map;", "setRateMap", "(Ljava/util/Map;)V", "productsMap", "Lcom/kubi/assets/entity/EarnAccountItem;", "getProductsMap", "setProductsMap", "filterText", "replaceData", "", "data", "", "convert", "helper", TUIConstants.TIMPush.NOTIFICATION.ENTITY, "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class AssetV2MainAdapter extends BaseQuickAdapter<AccountItemEntity, BaseViewHolder> {

    /* JADX INFO: renamed from: i */
    @NotNull
    public final AssetV2MainFragment f17900i;

    /* JADX INFO: renamed from: j */
    public boolean f17901j;

    /* JADX INFO: renamed from: k */
    @NotNull
    public Map<String, String> f17902k;

    /* JADX INFO: renamed from: l */
    @NotNull
    public Map<String, EarnAccountItem> f17903l;

    /* JADX INFO: renamed from: m */
    @NotNull
    public String f17904m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AssetV2MainAdapter(@NotNull AssetV2MainFragment fragment) {
        super(R$layout.item_asset_main_account);
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        this.f17900i = fragment;
        this.f17902k = new HashMap();
        this.f17903l = new HashMap();
        this.f17904m = "";
    }

    /* JADX INFO: renamed from: k */
    public static final Unit m17635k(AccountItemEntity accountItemEntity) {
        C42899b.m94073c(new Function1() { // from class: com.kubi.assets.main.c
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AssetV2MainAdapter.m17636l((FragmentActivity) obj);
            }
        });
        C43852m.m96590b("B1mainAccount", "holdToEarnLabel", "1", TuplesKt.m90091to(FirebaseAnalytics.Param.CURRENCY, C27041f.m66668h(accountItemEntity.getCurrency())));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: l */
    public static final Unit m17636l(FragmentActivity it) {
        Intrinsics.checkNotNullParameter(it, "it");
        HoldEarnOpenDialog holdEarnOpenDialogCreate = HoldEarnOpenDialog.f17726y0.create(C43852m.m96601m("B1mainAccount", "holdToEarnLabel", "1"));
        FragmentManager supportFragmentManager = it.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        holdEarnOpenDialogCreate.show(supportFragmentManager, "HoldEarnOpenDialog");
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x00d2  */
    @Override // io.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void convert(@NotNull final BaseViewHolder helper, @NotNull final AccountItemEntity entity) {
        String strM85565d;
        int i11;
        Integer numIsHoldEarnOpen;
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(entity, "entity");
        int i12 = R$id.tv_total_amount;
        View view = helper.getView(i12);
        Intrinsics.checkNotNullExpressionValue(view, "getView(...)");
        String strM93905f = null;
        C44172b.m97383c((TextView) view, new AbstractC44173c.a(0, false, 3, null), false, 2, null);
        int i13 = R$id.tv_fait_price_amount;
        View view2 = helper.getView(i13);
        Intrinsics.checkNotNullExpressionValue(view2, "getView(...)");
        C44172b.m97383c((TextView) view2, new AbstractC44173c.a(0, false, 3, null), false, 2, null);
        int i14 = R$id.tv_in_order_amount;
        View view3 = helper.getView(i14);
        Intrinsics.checkNotNullExpressionValue(view3, "getView(...)");
        C44172b.m97383c((TextView) view3, new AbstractC44173c.a(0, false, 3, null), false, 2, null);
        int i15 = R$id.tv_coin_name;
        BaseViewHolder text = helper.setText(i15, entity.getCurrencyNameStr());
        int i16 = R$id.tv_currency_full_name;
        text.setText(i16, entity.getCurrencyFullNameStr()).setText(i12, entity.getTotalBalanceStr()).setText(i13, entity.getTotalBalancePriceStr()).setText(i14, entity.getHoldBalanceStr()).setGone(R$id.tv_fiat_lab, entity.isFiat()).setGone(i14, entity.isOrderVisible()).setGone(R$id.tv_in_order_name, entity.isOrderVisible());
        C37890n c37890n = C37890n.f85269a;
        String currency = entity.getCurrency();
        if (currency == null) {
            currency = "";
        }
        CoinInfoEntity coinInfoEntityM85613u = c37890n.m85613u(currency);
        C24277v.m58542g((ImageView) helper.getView(R$id.iv_icon), C27041f.m66669i(coinInfoEntityM85613u != null ? coinInfoEntityM85613u.getIconUrl() : null, C27041f.m66668h(entity.getIconUrl())));
        TextView textView = (TextView) helper.getView(R$id.tv_lend);
        if (!entity.isFiat()) {
            CoinInfoEntity coinInfoEntityM85613u2 = c37890n.m85613u(C27041f.m66668h(entity.getCurrency()));
            if (C27025c.m66566d(coinInfoEntityM85613u2 != null ? Boolean.valueOf(coinInfoEntityM85613u2.isEarnEnabled()) : null)) {
                AssetV2MainFragment assetV2MainFragment = this.f17900i;
                int i17 = R$string.earn_coin_percentage_tag;
                StringBuilder sb2 = new StringBuilder();
                sb2.append((char) 8207);
                BigDecimal bigDecimalM66536f = DowngradeExKt.m66536f(this.f17902k.get(C27041f.m66668h(entity.getCurrency())));
                if (bigDecimalM66536f != null && (strM85565d = C37885i.m85565d(bigDecimalM66536f, 0, 0, 1, null)) != null) {
                    strM93905f = C42828b.m93905f(strM85565d, "%", true, false);
                }
                sb2.append(strM93905f);
                textView.setText(assetV2MainFragment.getString(i17, sb2.toString()));
                String str = this.f17902k.get(C27041f.m66668h(entity.getCurrency()));
                i11 = (str == null || str.length() == 0) ? 8 : 0;
            }
        }
        textView.setVisibility(i11);
        HoldEarnTipView holdEarnTipView = (HoldEarnTipView) helper.getView(R$id.holdEarnTip);
        EarnAccountItem earnAccountItem = this.f17903l.get(C27041f.m66668h(entity.getCurrency()));
        if (earnAccountItem == null || (((numIsHoldEarnOpen = earnAccountItem.isHoldEarnOpen()) != null && numIsHoldEarnOpen.intValue() == 1) || earnAccountItem.getHoldEarnApr() == null || Double.parseDouble(earnAccountItem.getHoldEarnApr()) <= 0.0d || !C24129b.m58030b(SiteVisibleConfigKey.EARN_HOLD_TO_EARN) || UserInfo.c().getType() == 3)) {
            Intrinsics.checkNotNull(holdEarnTipView);
            ViewExtKt.m66577h(holdEarnTipView);
        } else {
            Intrinsics.checkNotNull(holdEarnTipView);
            ViewExtKt.m66594y(holdEarnTipView);
            Intrinsics.checkNotNull(textView);
            ViewExtKt.m66577h(textView);
            holdEarnTipView.setText(earnAccountItem.getHoldEarnAprText());
            C27046k.m66711z(holdEarnTipView, 0L, new Function0() { // from class: com.kubi.assets.main.a
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AssetV2MainAdapter.m17635k(entity);
                }
            }, 1, null);
        }
        View itemView = helper.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        C27046k.m66711z(itemView, 0L, new Function0() { // from class: com.kubi.assets.main.b
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AssetV2MainAdapter.m17637m(helper, entity);
            }
        }, 1, null);
        ShowHideTextView.m54778d(helper.itemView, this.f17901j);
        if (StringsKt.isBlank(this.f17904m)) {
            return;
        }
        View view4 = helper.getView(i15);
        Intrinsics.checkNotNullExpressionValue(view4, "getView(...)");
        C37084b.m83008c((TextView) view4, this.f17904m);
        View view5 = helper.getView(i16);
        Intrinsics.checkNotNullExpressionValue(view5, "getView(...)");
        C37084b.m83008c((TextView) view5, this.f17904m);
    }

    /* JADX INFO: renamed from: n */
    public final void m17639n(@NotNull Collection<AccountItemEntity> data, @NotNull String filterText) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(filterText, "filterText");
        this.f17904m = filterText;
        super.replaceData(data);
    }

    /* JADX INFO: renamed from: o */
    public final void m17640o(boolean z11) {
        this.f17901j = z11;
    }

    /* JADX INFO: renamed from: p */
    public final void m17641p(@NotNull Map<String, EarnAccountItem> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.f17903l = map;
    }

    /* JADX INFO: renamed from: q */
    public final void m17642q(@NotNull Map<String, String> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.f17902k = map;
    }

    /* JADX INFO: renamed from: m */
    public static final Unit m17637m(BaseViewHolder baseViewHolder, AccountItemEntity accountItemEntity) {
        String code;
        String str;
        String strValueOf = String.valueOf(baseViewHolder.getAdapterPosition());
        JSONObject jSONObject = new JSONObject();
        CoinInfoEntity coinInfoEntityM85613u = C37890n.f85269a.m85613u(C27041f.m66668h(accountItemEntity.getCurrency()));
        if (coinInfoEntityM85613u != null) {
            code = coinInfoEntityM85613u.getCode();
        } else {
            code = null;
        }
        if (code == null) {
            code = "";
        }
        C43852m.m96589a("B1mainAccount", "coinList", strValueOf, jSONObject.put("coin", code));
        CoinDetailDispatcher.Companion companion = CoinDetailDispatcher.f16880U;
        String currency = accountItemEntity.getCurrency();
        if (currency == null) {
            str = "";
        } else {
            str = currency;
        }
        CoinDetailDispatcher.Companion.start$default(companion, 1, str, null, 4, null);
        C43841b.m96557d("b1overview_asset_detail_load", "page_load_start", null, 4, null);
        return Unit.INSTANCE;
    }
}
