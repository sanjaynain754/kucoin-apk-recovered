package com.kubi.tradingbotkit.business.coupons.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.kubi.sdk.ItemCallBack;
import com.kubi.sdk.ViewHolderProxy;
import com.kubi.tradingbotkit.R$color;
import com.kubi.tradingbotkit.R$layout;
import com.kubi.tradingbotkit.R$mipmap;
import com.kubi.tradingbotkit.R$string;
import com.kubi.tradingbotkit.business.coupons.adapter.AvailableCouponsProxy;
import com.kubi.tradingbotkit.business.spot.viewmodel.t0;
import com.kubi.tradingbotkit.model.AllCouponsItemModel;
import com.kubi.utils.C27017c;
import com.kubi.utils.C27096v0;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.bugly.proguard.C33556b3;
import gf.C37886j;
import java.math.BigDecimal;
import l50.C42061c;
import o50.C42975i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p402kf.C41014a;
import p429lf.C42180b;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AllCouponsItemProxy.kt */
/* JADX INFO: loaded from: classes51.dex */
@Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0002H\u0016J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0002H\u0002J\u0010\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0002H\u0002J\u0010\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0002H\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, m90084d2 = {"Lcom/kubi/tradingbotkit/business/coupons/adapter/AvailableCouponsProxy;", "Lcom/kubi/sdk/ViewHolderProxy;", "Lcom/kubi/tradingbotkit/model/AllCouponsItemModel;", "parent", "Landroid/view/ViewGroup;", "shortCall", "Lcom/kubi/sdk/ItemCallBack;", "longCall", "<init>", "(Landroid/view/ViewGroup;Lcom/kubi/sdk/ItemCallBack;Lcom/kubi/sdk/ItemCallBack;)V", "getParent", "()Landroid/view/ViewGroup;", "getShortCall", "()Lcom/kubi/sdk/ItemCallBack;", "getLongCall", "btradingBotKitCouponsItemAvailableCouponsBinding", "Lcom/kubi/tradingbotkit/databinding/BtradingBotKitCouponsItemAvailableCouponsBinding;", "createView", "Landroid/view/View;", "bindView", "", "d", "generateMaxRewardShowText", "Lcom/kubi/utils/StyledText;", "model", "generateMaxRebateDaysText", "generateMinInvestmentText", "TradingBotKitLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class AvailableCouponsProxy extends ViewHolderProxy<AllCouponsItemModel> {

    @Nullable
    private C42061c btradingBotKitCouponsItemAvailableCouponsBinding;

    @Nullable
    private final ItemCallBack<AllCouponsItemModel> longCall;

    @NotNull
    private final ViewGroup parent;

    @Nullable
    private final ItemCallBack<AllCouponsItemModel> shortCall;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AvailableCouponsProxy(@NotNull ViewGroup parent, @Nullable ItemCallBack<AllCouponsItemModel> itemCallBack, @Nullable ItemCallBack<AllCouponsItemModel> itemCallBack2) {
        super(parent, itemCallBack, itemCallBack2);
        Intrinsics.checkNotNullParameter(parent, "parent");
        this.parent = parent;
        this.shortCall = itemCallBack;
        this.longCall = itemCallBack2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$3$lambda$1(AllCouponsItemModel allCouponsItemModel, AvailableCouponsProxy availableCouponsProxy, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        allCouponsItemModel.setDetailShowing(Boolean.valueOf(!C27025c.m66567e(allCouponsItemModel.getDetailShowing(), false)));
        ItemCallBack<AllCouponsItemModel> shortCall = availableCouponsProxy.getShortCall();
        if (shortCall != null) {
            shortCall.mo24515a(it, availableCouponsProxy.getHolder().getAdapterPosition(), allCouponsItemModel);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$3$lambda$2(AllCouponsItemModel allCouponsItemModel, C42061c c42061c, AvailableCouponsProxy availableCouponsProxy, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        allCouponsItemModel.setChecked(!c42061c.f92504b.isChecked());
        ItemCallBack<AllCouponsItemModel> shortCall = availableCouponsProxy.getShortCall();
        if (shortCall != null) {
            shortCall.mo24515a(it, availableCouponsProxy.getHolder().getAdapterPosition(), allCouponsItemModel);
        }
        return Unit.INSTANCE;
    }

    @Override // com.kubi.sdk.ViewHolderProxy
    public void bindView(@NotNull final AllCouponsItemModel d11) {
        BigDecimal minTotalInvestments;
        BigDecimal rewardSeconds;
        BigDecimal bigDecimalMultiply;
        Intrinsics.checkNotNullParameter(d11, "d");
        final C42061c c42061c = this.btradingBotKitCouponsItemAvailableCouponsBinding;
        if (c42061c != null) {
            c42061c.f92520r.setText(d11.getDiscountTitle());
            AppCompatTextView appCompatTextView = c42061c.f92515m;
            BigDecimal discountPercentageShowBd = d11.getDiscountPercentageShowBd();
            appCompatTextView.setText(C42180b.m92647l((discountPercentageShowBd == null || (bigDecimalMultiply = discountPercentageShowBd.multiply(new BigDecimal(C33556b3.f68995S))) == null) ? null : C42180b.m92640e(bigDecimalMultiply, null, 2, false, false, false, 0, null, 121, null)));
            c42061c.f92513k.setText(d11.getDiscountExpireDate());
            c42061c.f92511i.setText(d11.getShowTypeName());
            c42061c.f92512j.setText(d11.getShowSupportSymbol());
            if (d11.getMaxReward() == null) {
                TextView tvRebateCap = c42061c.f92516n;
                Intrinsics.checkNotNullExpressionValue(tvRebateCap, "tvRebateCap");
                ViewExtKt.m66577h(tvRebateCap);
            } else {
                c42061c.f92516n.setText(generateMaxRewardShowText(d11));
                TextView tvRebateCap2 = c42061c.f92516n;
                Intrinsics.checkNotNullExpressionValue(tvRebateCap2, "tvRebateCap");
                ViewExtKt.m66594y(tvRebateCap2);
            }
            if (d11.getRewardSeconds() == null || ((rewardSeconds = d11.getRewardSeconds()) != null && rewardSeconds.compareTo(BigDecimal.ZERO) == 0)) {
                TextView tvRebateDays = c42061c.f92517o;
                Intrinsics.checkNotNullExpressionValue(tvRebateDays, "tvRebateDays");
                ViewExtKt.m66577h(tvRebateDays);
            } else {
                TextView tvRebateDays2 = c42061c.f92517o;
                Intrinsics.checkNotNullExpressionValue(tvRebateDays2, "tvRebateDays");
                ViewExtKt.m66594y(tvRebateDays2);
            }
            c42061c.f92517o.setText(generateMaxRebateDaysText(d11));
            if (d11.getMinTotalInvestments() == null || ((minTotalInvestments = d11.getMinTotalInvestments()) != null && minTotalInvestments.compareTo(BigDecimal.ZERO) == 0)) {
                TextView tvMinInvest = c42061c.f92514l;
                Intrinsics.checkNotNullExpressionValue(tvMinInvest, "tvMinInvest");
                ViewExtKt.m66577h(tvMinInvest);
            } else {
                TextView tvMinInvest2 = c42061c.f92514l;
                Intrinsics.checkNotNullExpressionValue(tvMinInvest2, "tvMinInvest");
                ViewExtKt.m66594y(tvMinInvest2);
            }
            c42061c.f92514l.setText(generateMinInvestmentText(d11));
            c42061c.f92521s.setText(d11.getValidityPeriod());
            c42061c.f92504b.setChecked(d11.getIsChecked());
            if (C27025c.m66567e(d11.getDetailShowing(), false)) {
                c42061c.f92509g.setImageResource(R$mipmap.kucoin_icon_strategy_detail_arrow);
                ConstraintLayout clRules = c42061c.f92506d;
                Intrinsics.checkNotNullExpressionValue(clRules, "clRules");
                ViewExtKt.m66594y(clRules);
            } else {
                c42061c.f92509g.setImageResource(R$mipmap.kucoin_icon_strategy_detail_arrow_open);
                ConstraintLayout clRules2 = c42061c.f92506d;
                Intrinsics.checkNotNullExpressionValue(clRules2, "clRules");
                ViewExtKt.m66577h(clRules2);
            }
            LinearLayout llRules = c42061c.f92510h;
            Intrinsics.checkNotNullExpressionValue(llRules, "llRules");
            ViewExtKt.m66575f(llRules, new Function1() { // from class: p40.a
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AvailableCouponsProxy.bindView$lambda$3$lambda$1(d11, this, (View) obj);
                }
            });
            ConstraintLayout clCoupons = c42061c.f92505c;
            Intrinsics.checkNotNullExpressionValue(clCoupons, "clCoupons");
            ViewExtKt.m66575f(clCoupons, new Function1() { // from class: p40.b
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AvailableCouponsProxy.bindView$lambda$3$lambda$2(d11, c42061c, this, (View) obj);
                }
            });
        }
    }

    @Override // com.kubi.sdk.ViewHolderProxy
    @Nullable
    public ItemCallBack<AllCouponsItemModel> getLongCall() {
        return this.longCall;
    }

    @Override // com.kubi.sdk.ViewHolderProxy
    @NotNull
    public ViewGroup getParent() {
        return this.parent;
    }

    @Override // com.kubi.sdk.ViewHolderProxy
    @Nullable
    public ItemCallBack<AllCouponsItemModel> getShortCall() {
        return this.shortCall;
    }

    private final C27096v0 generateMaxRebateDaysText(AllCouponsItemModel allCouponsItemModel) {
        BigDecimal bigDecimalDivide = C41014a.m89922G(allCouponsItemModel.getRewardSeconds(), null, 1, null).divide(new BigDecimal(86400));
        Intrinsics.checkNotNullExpressionValue(bigDecimalDivide, "divide(...)");
        String strM92640e = C42180b.m92640e(bigDecimalDivide, null, 0, false, false, false, 0, null, 125, null);
        String strM66516f = C27017c.f54310a.m66516f(R$string.kc_tb_coupon_back_days, strM92640e);
        C27096v0 c27096v0 = new C27096v0();
        c27096v0.append(strM66516f);
        C42975i.m94380a(c27096v0, strM92640e, R$color.complementary);
        return c27096v0;
    }

    private final C27096v0 generateMaxRewardShowText(AllCouponsItemModel allCouponsItemModel) {
        String rewardCurrency;
        BigDecimal maxReward;
        AllCouponsItemModel.Rules rules = allCouponsItemModel.getRules();
        String strM85578b = null;
        if (rules != null) {
            rewardCurrency = rules.getRewardCurrency();
        } else {
            rewardCurrency = null;
        }
        String strM66669i = C27041f.m66669i(rewardCurrency, "USDT");
        AllCouponsItemModel.Rules rules2 = allCouponsItemModel.getRules();
        if (rules2 != null && (maxReward = rules2.getMaxReward()) != null) {
            strM85578b = C37886j.m85578b(maxReward, strM66669i, null, false, false, false, 0, null, 0, 254, null);
        }
        String strM92647l = C42180b.m92647l(strM85578b);
        String strM66516f = C27017c.f54310a.m66516f(R$string.kc_tb_coupon_back_upperlimit, t0.a(strM92647l, strM66669i).toString());
        C27096v0 c27096v0 = new C27096v0();
        c27096v0.append(strM66516f);
        C42975i.m94380a(c27096v0, strM92647l, R$color.complementary);
        return c27096v0;
    }

    private final C27096v0 generateMinInvestmentText(AllCouponsItemModel allCouponsItemModel) {
        String strM85578b;
        BigDecimal minTotalInvestments = allCouponsItemModel.getMinTotalInvestments();
        if (minTotalInvestments != null) {
            strM85578b = C37886j.m85578b(minTotalInvestments, "USDT", null, false, false, false, 0, null, 0, 254, null);
        } else {
            strM85578b = null;
        }
        String strM92647l = C42180b.m92647l(strM85578b);
        String strM66516f = C27017c.f54310a.m66516f(R$string.kc_tb_coupon_least_invest, t0.a(strM92647l, "USDT").toString());
        C27096v0 c27096v0 = new C27096v0();
        c27096v0.append(strM66516f);
        C42975i.m94380a(c27096v0, strM92647l, R$color.complementary);
        return c27096v0;
    }

    @Override // com.kubi.sdk.ViewHolderProxy
    @NotNull
    public View createView() {
        View viewInflate = LayoutInflater.from(getParent().getContext()).inflate(R$layout.btrading_bot_kit_coupons_item_available_coupons, getParent(), false);
        this.btradingBotKitCouponsItemAvailableCouponsBinding = C42061c.m92273a(viewInflate);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "apply(...)");
        return viewInflate;
    }
}
