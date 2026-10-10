package com.kubi.assets.futures.coins;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.kubi.assets.R$color;
import com.kubi.assets.R$drawable;
import com.kubi.assets.R$id;
import com.kubi.assets.R$mipmap;
import com.kubi.assets.R$string;
import com.kubi.assets.service.AssetsDepend;
import com.kubi.data.entity.CoinInfoEntity;
import com.kubi.event.api.C12572a;
import com.kubi.kumex.api.IKuMexService;
import com.kubi.kumex.entity.BalanceEntity;
import com.kubi.resources.C22890g;
import com.kubi.resources.widget.FullCoinBean;
import com.kubi.resources.widget.FullCoinView;
import com.kubi.resources.widget.ShowHideTextView;
import com.kubi.sdk.BaseApplication;
import com.kubi.utils.C27017c;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import f00.C37304a;
import g00.InterfaceC37752d;
import gf.C37885i;
import gf.C37890n;
import io.chad.library.adapter.base.BaseSectionQuickAdapter;
import io.chad.library.adapter.base.BaseViewHolder;
import io.chad.library.adapter.base.entity.SectionEntity;
import java.math.BigDecimal;
import java.util.List;
import nf.C42828b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p402kf.C41014a;
import p429lf.C42180b;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AssetFuturesCoinsAdapter.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u0001B5\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0014\u0010\b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0018\u00010\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\"\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u00042\u000e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0014J\u0010\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0004H\u0002J\u0018\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u0003H\u0002J \u0010\u001f\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u0006H\u0002J \u0010!\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u0006H\u0002J\u0018\u0010\"\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u0006H\u0002J\u0010\u0010#\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u0003H\u0002J\u0018\u0010$\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u0003H\u0002J\u0018\u0010%\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u0003H\u0002J \u0010&\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u0006H\u0002J\u001a\u0010'\u001a\u00020\u00062\b\u0010(\u001a\u0004\u0018\u00010)2\u0006\u0010\u001e\u001a\u00020\u0003H\u0002J\u0018\u0010*\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0013H\u0002J\"\u0010,\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u00042\u000e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0014R\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006-"}, m90084d2 = {"Lcom/kubi/assets/futures/coins/AssetFuturesCoinsAdapter;", "Lio/chad/library/adapter/base/BaseSectionQuickAdapter;", "Lio/chad/library/adapter/base/entity/SectionEntity;", "Lcom/kubi/kumex/entity/BalanceEntity;", "Lio/chad/library/adapter/base/BaseViewHolder;", "layoutResId", "", "sectionHeadResId", "data", "", "mContext", "Landroid/content/Context;", "<init>", "(IILjava/util/List;Landroid/content/Context;)V", "getMContext", "()Landroid/content/Context;", "setMContext", "(Landroid/content/Context;)V", "hideNumber", "", "getHideNumber", "()Z", "setHideNumber", "(Z)V", "convert", "", "helper", "item", "autoFitNumber", "setupItemClick", "balance", "setBalanceData", "precision", "setPnlData", "handleEquityTitleClick", "handleTrialTitleClick", "setEquityTitle", "setTrialTitle", "setEquityQtyText", "getPrecision", "coin", "Lcom/kubi/data/entity/CoinInfoEntity;", "handleTotalZeroState", "totalZero", "convertHead", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class AssetFuturesCoinsAdapter extends BaseSectionQuickAdapter<SectionEntity<BalanceEntity>, BaseViewHolder> {

    /* JADX INFO: renamed from: i */
    @NotNull
    public Context f17546i;

    /* JADX INFO: renamed from: j */
    public boolean f17547j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AssetFuturesCoinsAdapter(int i11, int i12, @Nullable List<SectionEntity<BalanceEntity>> list, @NotNull Context mContext) {
        super(i11, i12, list);
        Intrinsics.checkNotNullParameter(mContext, "mContext");
        this.f17546i = mContext;
    }

    /* JADX INFO: renamed from: y */
    public static final Unit m16930y(BalanceEntity balanceEntity) {
        InterfaceC37752d.a.m85124c(C37304a.f82764a, C27041f.m66668h(balanceEntity.getCurrency()), null, null, null, null, null, 62, null);
        return Unit.INSTANCE;
    }

    @Override // io.chad.library.adapter.base.BaseSectionQuickAdapter
    public void convertHead(@Nullable BaseViewHolder helper, @Nullable SectionEntity<BalanceEntity> item) {
        String str = item != null ? item.header : null;
        if (helper != null) {
            helper.setText(R$id.tvFuturesType, str);
        }
    }

    @Override // io.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public void convert(@Nullable BaseViewHolder baseViewHolder, @Nullable SectionEntity<BalanceEntity> sectionEntity) {
        BalanceEntity t11;
        String strM66668h;
        String strM66668h2;
        if (baseViewHolder == null || sectionEntity == null || (t11 = sectionEntity.f86727t) == null) {
            return;
        }
        Intrinsics.checkNotNullExpressionValue(t11, "t");
        final BalanceEntity balanceEntity = t11;
        boolean z11 = C27039d.m66647g(balanceEntity.getMargin()) == 0.0d;
        m16931j(baseViewHolder);
        m16935p(baseViewHolder, z11);
        CoinInfoEntity coinInfoEntityM85613u = C37890n.f85269a.m85613u(C27041f.m66668h(C27041f.m66677q(balanceEntity.getCurrency())));
        FullCoinView fullCoinView = (FullCoinView) baseViewHolder.getView(R$id.assetCoin);
        String strM66668h3 = C27041f.m66668h(coinInfoEntityM85613u != null ? coinInfoEntityM85613u.getIconUrl() : null);
        if (coinInfoEntityM85613u == null || (strM66668h = coinInfoEntityM85613u.getCurrency()) == null) {
            strM66668h = C27041f.m66668h(balanceEntity.getCurrency());
        }
        if (coinInfoEntityM85613u == null || (strM66668h2 = coinInfoEntityM85613u.getName()) == null) {
            strM66668h2 = C27041f.m66668h(balanceEntity.getCurrency());
        }
        fullCoinView.m54517a(new FullCoinBean(strM66668h3, strM66668h, strM66668h2));
        final int iM16933n = m16933n(coinInfoEntityM85613u, balanceEntity);
        m16938s(baseViewHolder, balanceEntity, iM16933n);
        if (balanceEntity.isTrialFunds()) {
            m16942w(baseViewHolder, balanceEntity);
            baseViewHolder.setOnClickListener(R$id.viewEquityTitle, new View.OnClickListener() { // from class: com.kubi.assets.futures.coins.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AssetFuturesCoinsAdapter.m16928l(this.f17571b, balanceEntity, view);
                }
            });
        } else {
            m16939t(baseViewHolder, balanceEntity);
            baseViewHolder.setOnClickListener(R$id.viewEquityTitle, new View.OnClickListener() { // from class: com.kubi.assets.futures.coins.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AssetFuturesCoinsAdapter.m16929m(this.f17574b, balanceEntity, iM16933n, view);
                }
            });
        }
        if (!IKuMexService.m33248N(AssetsDepend.m19180c(), null, 1, null)) {
            m16937r(baseViewHolder, balanceEntity, iM16933n);
            m16941v(baseViewHolder, balanceEntity, iM16933n);
            m16943x(baseViewHolder, balanceEntity);
        }
        ShowHideTextView.m54778d(baseViewHolder.itemView, this.f17547j);
    }

    /* JADX INFO: renamed from: p */
    public final void m16935p(BaseViewHolder baseViewHolder, boolean z11) {
        if (z11) {
            View view = baseViewHolder.getView(R$id.balanceValue);
            Intrinsics.checkNotNullExpressionValue(view, "getView(...)");
            ViewExtKt.m66577h(view);
            View view2 = baseViewHolder.getView(R$id.positionValue);
            Intrinsics.checkNotNullExpressionValue(view2, "getView(...)");
            ViewExtKt.m66577h(view2);
            View view3 = baseViewHolder.getView(R$id.delegationValue);
            Intrinsics.checkNotNullExpressionValue(view3, "getView(...)");
            ViewExtKt.m66577h(view3);
            int i11 = R$id.balanceQty;
            Context context = this.f17546i;
            int i12 = R$color.c_text40;
            baseViewHolder.setTextColor(i11, ContextCompat.getColor(context, i12)).setTextColor(R$id.positionQty, ContextCompat.getColor(this.f17546i, i12)).setTextColor(R$id.delegationQty, ContextCompat.getColor(this.f17546i, i12));
            return;
        }
        View view4 = baseViewHolder.getView(R$id.balanceValue);
        Intrinsics.checkNotNullExpressionValue(view4, "getView(...)");
        ViewExtKt.m66594y(view4);
        View view5 = baseViewHolder.getView(R$id.positionValue);
        Intrinsics.checkNotNullExpressionValue(view5, "getView(...)");
        ViewExtKt.m66594y(view5);
        View view6 = baseViewHolder.getView(R$id.delegationValue);
        Intrinsics.checkNotNullExpressionValue(view6, "getView(...)");
        ViewExtKt.m66594y(view6);
        int i13 = R$id.balanceQty;
        Context context2 = this.f17546i;
        int i14 = R$color.c_text;
        baseViewHolder.setTextColor(i13, ContextCompat.getColor(context2, i14)).setTextColor(R$id.positionQty, ContextCompat.getColor(this.f17546i, i14)).setTextColor(R$id.delegationQty, ContextCompat.getColor(this.f17546i, i14));
    }

    /* JADX INFO: renamed from: r */
    public final void m16937r(BaseViewHolder baseViewHolder, BalanceEntity balanceEntity, int i11) {
        BigDecimal bigDecimalAbs;
        BigDecimal bigDecimalAbs2;
        BigDecimal bigDecimalAbs3;
        int i12 = R$id.balanceQty;
        BigDecimal availableBalance = balanceEntity.getAvailableBalance();
        String strM89933g = null;
        BaseViewHolder text = baseViewHolder.setText(i12, availableBalance != null ? C42180b.m92640e(availableBalance, null, i11, false, true, false, 2, null, 85, null) : null);
        int i13 = R$id.balanceValue;
        BigDecimal availableBalance2 = balanceEntity.getAvailableBalance();
        BaseViewHolder text2 = text.setText(i13, (availableBalance2 == null || (bigDecimalAbs3 = availableBalance2.abs()) == null) ? null : C41014a.m89933g(new BigDecimal(String.valueOf(C41014a.m89939m(bigDecimalAbs3.doubleValue(), C27041f.m66668h(C27041f.m66677q(balanceEntity.getCurrency()))))), null, null, 0, false, false, true, 31, null));
        int i14 = R$id.positionQty;
        BigDecimal maintMargin = balanceEntity.getMaintMargin();
        BaseViewHolder text3 = text2.setText(i14, maintMargin != null ? C42180b.m92640e(maintMargin, null, i11, false, true, false, 2, null, 85, null) : null);
        int i15 = R$id.positionValue;
        BigDecimal maintMargin2 = balanceEntity.getMaintMargin();
        BaseViewHolder text4 = text3.setText(i15, (maintMargin2 == null || (bigDecimalAbs2 = maintMargin2.abs()) == null) ? null : C41014a.m89933g(new BigDecimal(String.valueOf(C41014a.m89939m(bigDecimalAbs2.doubleValue(), C27041f.m66668h(C27041f.m66677q(balanceEntity.getCurrency()))))), null, null, 0, false, false, true, 31, null));
        int i16 = R$id.delegationQty;
        BigDecimal orderMargin = balanceEntity.getOrderMargin();
        BaseViewHolder text5 = text4.setText(i16, orderMargin != null ? C42180b.m92640e(orderMargin, null, i11, false, true, false, 2, null, 85, null) : null);
        int i17 = R$id.delegationValue;
        BigDecimal orderMargin2 = balanceEntity.getOrderMargin();
        if (orderMargin2 != null && (bigDecimalAbs = orderMargin2.abs()) != null) {
            strM89933g = C41014a.m89933g(new BigDecimal(String.valueOf(C41014a.m89939m(bigDecimalAbs.doubleValue(), C27041f.m66668h(C27041f.m66677q(balanceEntity.getCurrency()))))), null, null, 0, false, false, true, 31, null);
        }
        text5.setText(i17, strM89933g);
    }

    /* JADX INFO: renamed from: s */
    public final void m16938s(BaseViewHolder baseViewHolder, BalanceEntity balanceEntity, int i11) {
        int i12 = R$id.equityQty;
        BigDecimal margin = balanceEntity.getMargin();
        baseViewHolder.setText(i12, margin != null ? C37885i.m85562a(margin, C27041f.m66677q(balanceEntity.getCurrency()), i11) : null);
        BigDecimal bigDecimalAbs = C27039d.m66656p(balanceEntity.getMargin()).abs();
        Intrinsics.checkNotNullExpressionValue(bigDecimalAbs, "abs(...)");
        baseViewHolder.setText(R$id.equityValue, C27041f.m66668h(C41014a.m89933g(new BigDecimal(String.valueOf(C41014a.m89940n(bigDecimalAbs, C27041f.m66668h(C27041f.m66677q(balanceEntity.getCurrency()))))), null, null, 0, false, false, true, 31, null)));
    }

    /* JADX INFO: renamed from: t */
    public final void m16939t(BaseViewHolder baseViewHolder, BalanceEntity balanceEntity) {
        TextView textView = (TextView) baseViewHolder.getView(R$id.equityTitle);
        BigDecimal trialBalance = balanceEntity.getTrialBalance();
        if (C27039d.m66646f(trialBalance != null ? Double.valueOf(trialBalance.doubleValue()) : null) == 0.0d) {
            Intrinsics.checkNotNull(textView);
            C27046k.m66694i(textView, 0, 0, 0, 6, null);
        } else {
            Intrinsics.checkNotNull(textView);
            C27046k.m66694i(textView, R$drawable.ic2_bonus_12, 0, 0, 6, null);
            C27046k.m66702q(textView, C27017c.f54310a.m66512a(R$color.primary));
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m16940u(boolean z11) {
        this.f17547j = z11;
    }

    /* JADX INFO: renamed from: v */
    public final void m16941v(BaseViewHolder baseViewHolder, BalanceEntity balanceEntity, int i11) {
        Context context = baseViewHolder.itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        BigDecimal unrealisedPNL = balanceEntity.getUnrealisedPNL();
        int iM54278c = C22890g.m54278c(context, C27039d.m66646f(unrealisedPNL != null ? Double.valueOf(unrealisedPNL.doubleValue()) : null), R$color.c_text40);
        BigDecimal bigDecimalAbs = C27039d.m66656p(balanceEntity.getUnrealisedPNL()).abs();
        Intrinsics.checkNotNullExpressionValue(bigDecimalAbs, "abs(...)");
        String strM89933g = C41014a.m89933g(new BigDecimal(String.valueOf(C41014a.m89940n(bigDecimalAbs, C27041f.m66668h(C27041f.m66677q(balanceEntity.getCurrency()))))), null, null, 0, false, false, true, 31, null);
        int i12 = R$id.pnlQty;
        BigDecimal unrealisedPNL2 = balanceEntity.getUnrealisedPNL();
        BaseViewHolder textColor = baseViewHolder.setText(i12, unrealisedPNL2 != null ? C42180b.m92640e(unrealisedPNL2, null, i11, false, true, false, 2, null, 85, null) : null).setTextColor(i12, iM54278c);
        int i13 = R$id.pnlValue;
        textColor.setText(i13, strM89933g).setTextColor(i13, iM54278c);
    }

    /* JADX INFO: renamed from: w */
    public final void m16942w(BaseViewHolder baseViewHolder, BalanceEntity balanceEntity) {
        TextView textView = (TextView) baseViewHolder.getView(R$id.equityTitle);
        Intrinsics.checkNotNull(textView);
        C27046k.m66694i(textView, R$mipmap.asset_ic_futures_trial, 0, 0, 6, null);
    }

    /* JADX INFO: renamed from: x */
    public final void m16943x(BaseViewHolder baseViewHolder, final BalanceEntity balanceEntity) {
        View itemView = baseViewHolder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        C27046k.m66711z(itemView, 0L, new Function0() { // from class: com.kubi.assets.futures.coins.c
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AssetFuturesCoinsAdapter.m16930y(balanceEntity);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: l */
    public static final void m16928l(AssetFuturesCoinsAdapter assetFuturesCoinsAdapter, BalanceEntity balanceEntity, View view) {
        assetFuturesCoinsAdapter.m16936q(balanceEntity);
    }

    /* JADX INFO: renamed from: m */
    public static final void m16929m(AssetFuturesCoinsAdapter assetFuturesCoinsAdapter, BalanceEntity balanceEntity, int i11, View view) {
        assetFuturesCoinsAdapter.m16934o(balanceEntity, i11);
    }

    /* JADX INFO: renamed from: n */
    public final int m16933n(CoinInfoEntity coinInfoEntity, BalanceEntity balanceEntity) {
        String currency;
        IKuMexService iKuMexServiceM19180c = AssetsDepend.m19180c();
        if (coinInfoEntity == null || (currency = coinInfoEntity.getCurrency()) == null) {
            currency = balanceEntity.getCurrency();
        }
        return C27039d.m66650j(Integer.valueOf(iKuMexServiceM19180c.mo33293w(currency)));
    }

    /* JADX INFO: renamed from: o */
    public final void m16934o(BalanceEntity balanceEntity, int i11) {
        Double dValueOf;
        Double dValueOf2;
        String strM92640e;
        String string;
        String strM92640e2;
        BigDecimal trialBalance = balanceEntity.getTrialBalance();
        String strM89933g = null;
        if (trialBalance != null) {
            dValueOf = Double.valueOf(trialBalance.doubleValue());
        } else {
            dValueOf = null;
        }
        if (C27039d.m66646f(dValueOf) == 0.0d) {
            return;
        }
        BigDecimal trialBalance2 = balanceEntity.getTrialBalance();
        if (trialBalance2 != null) {
            dValueOf2 = Double.valueOf(trialBalance2.doubleValue());
        } else {
            dValueOf2 = null;
        }
        if (C27039d.m66646f(dValueOf2) == 0.0d) {
            if (C27025c.m66566d(balanceEntity.getTrialHistory())) {
                string = BaseApplication.INSTANCE.get().getResources().getString(R$string.trail_unlock_tips);
            } else {
                string = BaseApplication.INSTANCE.get().getResources().getString(R$string.kumex_trial_tips);
            }
        } else {
            Resources resources = BaseApplication.INSTANCE.get().getResources();
            int i12 = R$string.trail_lock_tips;
            StringBuilder sb2 = new StringBuilder();
            BigDecimal trialLimit = balanceEntity.getTrialLimit();
            if (trialLimit != null) {
                strM92640e = C42180b.m92640e(trialLimit, null, i11, false, true, false, 2, null, 85, null);
            } else {
                strM92640e = null;
            }
            sb2.append(strM92640e);
            sb2.append(' ');
            sb2.append(C27041f.m66677q(balanceEntity.getCurrency()));
            string = resources.getString(i12, sb2.toString());
        }
        Intrinsics.checkNotNull(string);
        BigDecimal trialBalance3 = balanceEntity.getTrialBalance();
        if (trialBalance3 != null) {
            strM92640e2 = C42180b.m92640e(trialBalance3, null, i11, false, true, false, 2, null, 85, null);
        } else {
            strM92640e2 = null;
        }
        String strM93906g = C42828b.m93906g(strM92640e2, C27041f.m66668h(C27041f.m66677q(balanceEntity.getCurrency())), true, false, 4, null);
        BigDecimal trialBalance4 = balanceEntity.getTrialBalance();
        if (trialBalance4 != null) {
            strM89933g = C41014a.m89933g(new BigDecimal(String.valueOf(C41014a.m89939m(trialBalance4.doubleValue(), C27041f.m66668h(C27041f.m66677q(balanceEntity.getCurrency()))))), null, null, 0, false, false, true, 31, null);
        }
        C12572a.m23695d("equity_alert_dialog", new EquityData(strM93906g, strM89933g, string), 0L, 4, null);
    }

    /* JADX INFO: renamed from: q */
    public final void m16936q(BalanceEntity balanceEntity) {
        String trialCode = balanceEntity.getTrialCode();
        if (trialCode != null && trialCode.length() != 0) {
            C12572a.m23695d("equity_alert_dialog2", new TrialData(C27041f.m66668h(balanceEntity.getTrialCode())), 0L, 4, null);
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m16931j(BaseViewHolder baseViewHolder) {
    }
}
