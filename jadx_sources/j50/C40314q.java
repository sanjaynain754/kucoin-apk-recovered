package j50;

import android.content.Context;
import android.content.DialogInterface;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.ViewKt;
import com.kubi.data.entity.SymbolInfoEntity;
import com.kubi.resources.C22890g;
import com.kubi.resources.dialog.AlertDialogFragmentHelper;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.DashTextView;
import com.kubi.resources.widget.button.KcSecondaryButton;
import com.kubi.tradingbotkit.R$color;
import com.kubi.tradingbotkit.R$string;
import com.kubi.tradingbotkit.business.strategyList.entity.StrategyItemEntity;
import com.kubi.utils.C27017c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import gf.C37890n;
import io.chad.library.adapter.base.BaseViewHolder;
import java.math.BigDecimal;
import l50.C42062c0;
import o50.C42976j;
import org.jetbrains.annotations.NotNull;
import p402kf.C41014a;
import p429lf.C42180b;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: j50.q */
/* JADX INFO: compiled from: MarginGridBinder.kt */
/* JADX INFO: loaded from: classes51.dex */
@Metadata(m90083d1 = {"\u00000\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u001c\u0010\u0005\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0002\u001a\u001c\u0010\n\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0002\u001a\u0018\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f*\u00020\u0002H\u0002¨\u0006\u000f"}, m90084d2 = {"bindMarginGrid", "", "Lcom/kubi/tradingbotkit/business/strategyList/entity/StrategyItemEntity;", "helper", "Lio/chad/library/adapter/base/BaseViewHolder;", "bindNotTrigger", "viewBinding", "Lcom/kubi/tradingbotkit/databinding/BtradingBotKitStrategyItemMarginGridBinding;", "ctx", "Landroid/content/Context;", "bindOther", "getRiskInfo", "Lkotlin/Pair;", "", "", "TradingBotKitLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C40314q {
    /* JADX INFO: renamed from: c */
    public static final void m88819c(@NotNull StrategyItemEntity strategyItemEntity, @NotNull BaseViewHolder helper) {
        Intrinsics.checkNotNullParameter(strategyItemEntity, "<this>");
        Intrinsics.checkNotNullParameter(helper, "helper");
        C42062c0 c42062c0M92275a = C42062c0.m92275a(helper.itemView);
        Intrinsics.checkNotNullExpressionValue(c42062c0M92275a, "bind(...)");
        Context context = helper.itemView.getContext();
        BaseTextView baseTextView = c42062c0M92275a.f92546Y;
        SymbolInfoEntity symbolInfoEntityM85601B = C37890n.f85269a.m85601B(C27041f.m66668h(C40281a0.m88711n(strategyItemEntity)));
        baseTextView.setText(C27041f.m66668h(symbolInfoEntityM85601B != null ? symbolInfoEntityM85601B.getShowSymbol() : null));
        c42062c0M92275a.f92569r.setText(C42976j.m94383b(C27039d.m66652l(strategyItemEntity.getStartTimeDifference())));
        c42062c0M92275a.f92545X.setText(context.getString(R$string.kc_tb_margin_grid));
        BaseTextView outRangeTipsTv = c42062c0M92275a.f92535N;
        Intrinsics.checkNotNullExpressionValue(outRangeTipsTv, "outRangeTipsTv");
        C27046k.m66700o(outRangeTipsTv);
        AppCompatImageView loadingIv = c42062c0M92275a.f92531J;
        Intrinsics.checkNotNullExpressionValue(loadingIv, "loadingIv");
        C40292f.m88783r(loadingIv);
        c42062c0M92275a.f92531J.setVisibility(8);
        c42062c0M92275a.f92549a0.setText(context.getString(R$string.kc_tb_terminate_title));
        c42062c0M92275a.f92549a0.setEnabled(!Intrinsics.areEqual(strategyItemEntity.getStatus(), "STOPPING"));
        KcSecondaryButton terminalTv = c42062c0M92275a.f92549a0;
        Intrinsics.checkNotNullExpressionValue(terminalTv, "terminalTv");
        C40285b1.m88725H(terminalTv);
        c42062c0M92275a.f92544W.setTextColor(context.getColor(R$color.c_text));
        KcSecondaryButton detailTv = c42062c0M92275a.f92566o;
        Intrinsics.checkNotNullExpressionValue(detailTv, "detailTv");
        C40285b1.m88723F(detailTv, C40281a0.m88711n(strategyItemEntity), strategyItemEntity.getStatus(), strategyItemEntity.getType(), strategyItemEntity.getId());
        ConstraintLayout rootCl = c42062c0M92275a.f92543V;
        Intrinsics.checkNotNullExpressionValue(rootCl, "rootCl");
        C40285b1.m88723F(rootCl, C40281a0.m88711n(strategyItemEntity), strategyItemEntity.getStatus(), strategyItemEntity.getType(), strategyItemEntity.getId());
        if (Intrinsics.areEqual(strategyItemEntity.getStatus(), "STOPPING")) {
            BaseTextView baseTextView2 = c42062c0M92275a.f92544W;
            int i11 = R$string.kc_tb_grid_action_close;
            baseTextView2.setText(context.getString(i11));
            c42062c0M92275a.f92531J.setVisibility(0);
            AppCompatImageView loadingIv2 = c42062c0M92275a.f92531J;
            Intrinsics.checkNotNullExpressionValue(loadingIv2, "loadingIv");
            C40292f.m88782q(loadingIv2);
            c42062c0M92275a.f92549a0.setText(context.getString(i11));
        } else if (C40292f.m88781p(strategyItemEntity)) {
            c42062c0M92275a.f92544W.setText(context.getString(R$string.kc_tb_grid_status_out_range));
            BaseTextView outRangeTipsTv2 = c42062c0M92275a.f92535N;
            Intrinsics.checkNotNullExpressionValue(outRangeTipsTv2, "outRangeTipsTv");
            C27046k.m66685H(outRangeTipsTv2);
            if (C41014a.m89922G(strategyItemEntity.getPrice(), null, 1, null).compareTo(C41014a.m89922G(strategyItemEntity.getDown(), null, 1, null)) < 0) {
                c42062c0M92275a.f92535N.setText(context.getString(R$string.kc_tb_grid_status_range_low_tips));
            } else if (C41014a.m89922G(strategyItemEntity.getPrice(), null, 1, null).compareTo(C41014a.m89922G(strategyItemEntity.getUp(), null, 1, null)) > 0) {
                c42062c0M92275a.f92535N.setText(context.getString(R$string.kc_tb_grid_status_range_high_tips));
            }
        } else if (C40292f.m88780o(strategyItemEntity)) {
            c42062c0M92275a.f92544W.setText(context.getString(R$string.kc_tb_grid_status_not_trigger));
        } else {
            c42062c0M92275a.f92544W.setText(context.getString(R$string.kc_tb_grid_status_running));
            c42062c0M92275a.f92544W.setTextColor(context.getColor(R$color.brandGreen));
        }
        LinearLayoutCompat couponLl = c42062c0M92275a.f92561j;
        Intrinsics.checkNotNullExpressionValue(couponLl, "couponLl");
        BaseTextView couponDescTv = c42062c0M92275a.f92560i;
        Intrinsics.checkNotNullExpressionValue(couponDescTv, "couponDescTv");
        BaseTextView couponTimeTv = c42062c0M92275a.f92562k;
        Intrinsics.checkNotNullExpressionValue(couponTimeTv, "couponTimeTv");
        C40292f.m88768c(strategyItemEntity, couponLl, couponDescTv, couponTimeTv);
        BaseTextView baseTextView3 = c42062c0M92275a.f92533L;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(context.getString(R$string.kc_tb_grid_total_margin) + " (");
        sb2.append(C40281a0.m88710m(strategyItemEntity));
        sb2.append(")");
        baseTextView3.setText(sb2.toString());
        BaseTextView baseTextView4 = c42062c0M92275a.f92534M;
        BigDecimal totalCost = strategyItemEntity.getTotalCost();
        baseTextView4.setText(totalCost != null ? C42180b.m92640e(totalCost, null, C40281a0.m88714q(strategyItemEntity), false, false, false, 0, null, 125, null) : null);
        BaseTextView baseTextView5 = c42062c0M92275a.f92538Q;
        StringBuilder sb3 = new StringBuilder();
        sb3.append(context.getString(R$string.kc_tb_grid_total_profit) + " (");
        sb3.append(C40281a0.m88710m(strategyItemEntity));
        sb3.append(")");
        baseTextView5.setText(sb3.toString());
        BaseTextView baseTextView6 = c42062c0M92275a.f92539R;
        BigDecimal totalProfit = strategyItemEntity.getTotalProfit();
        baseTextView6.setText(C42180b.m92647l(totalProfit != null ? C42180b.m92640e(totalProfit, null, C40281a0.m88714q(strategyItemEntity), false, false, false, 0, null, 125, null) : null));
        BaseTextView baseTextView7 = c42062c0M92275a.f92539R;
        Intrinsics.checkNotNull(context);
        BigDecimal totalProfit2 = strategyItemEntity.getTotalProfit();
        if (totalProfit2 == null) {
            totalProfit2 = BigDecimal.ZERO;
        }
        Intrinsics.checkNotNull(totalProfit2);
        baseTextView7.setTextColor(C22890g.m54282g(context, totalProfit2, 0, 2, null));
        BaseTextView baseTextView8 = c42062c0M92275a.f92537P;
        BigDecimal totalProfitRate = strategyItemEntity.getTotalProfitRate();
        baseTextView8.setText(C42180b.m92649n(totalProfitRate != null ? C42180b.m92642g(totalProfitRate, null, null, 0, true, false, false, 55, null) : null));
        BaseTextView baseTextView9 = c42062c0M92275a.f92537P;
        BigDecimal totalProfitRate2 = strategyItemEntity.getTotalProfitRate();
        if (totalProfitRate2 == null) {
            totalProfitRate2 = BigDecimal.ZERO;
        }
        Intrinsics.checkNotNull(totalProfitRate2);
        baseTextView9.setTextColor(C22890g.m54282g(context, totalProfitRate2, 0, 2, null));
        if (C40292f.m88780o(strategyItemEntity)) {
            m88820d(strategyItemEntity, c42062c0M92275a, context);
        } else {
            m88821e(strategyItemEntity, c42062c0M92275a, context);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m88820d(StrategyItemEntity strategyItemEntity, C42062c0 c42062c0, Context context) {
        LinearLayoutCompat ll2 = c42062c0.f92528G;
        Intrinsics.checkNotNullExpressionValue(ll2, "ll2");
        C27046k.m66700o(ll2);
        LinearLayoutCompat ll3 = c42062c0.f92529H;
        Intrinsics.checkNotNullExpressionValue(ll3, "ll3");
        C27046k.m66700o(ll3);
        c42062c0.f92522A.setText(context.getString(R$string.kc_tb_grid_order_section));
        BaseTextView baseTextView = c42062c0.f92523B;
        StringBuilder sb2 = new StringBuilder();
        BigDecimal down = strategyItemEntity.getDown();
        sb2.append(C42180b.m92647l(down != null ? C42180b.m92640e(down, null, C40281a0.m88713p(strategyItemEntity), false, false, false, 0, null, 125, null) : null));
        sb2.append(" - ");
        BigDecimal up2 = strategyItemEntity.getUp();
        sb2.append(C42180b.m92647l(up2 != null ? C42180b.m92640e(up2, null, C40281a0.m88713p(strategyItemEntity), false, false, false, 0, null, 125, null) : null));
        baseTextView.setText(sb2.toString());
        c42062c0.f92525D.setText(context.getString(R$string.kc_latest_price));
        BaseTextView baseTextView2 = c42062c0.f92526E;
        BigDecimal price = strategyItemEntity.getPrice();
        baseTextView2.setText(C42180b.m92647l(price != null ? C42180b.m92640e(price, null, C40281a0.m88713p(strategyItemEntity), false, false, false, 0, null, 125, null) : null));
        c42062c0.f92557f.setText(context.getString(R$string.trigger_price_tips));
        BaseTextView baseTextView3 = c42062c0.f92558g;
        BigDecimal openUnitPrice = strategyItemEntity.getOpenUnitPrice();
        baseTextView3.setText(C42180b.m92647l(openUnitPrice != null ? C42180b.m92640e(openUnitPrice, null, C40281a0.m88713p(strategyItemEntity), false, false, false, 0, null, 125, null) : null));
    }

    /* JADX INFO: renamed from: e */
    public static final void m88821e(StrategyItemEntity strategyItemEntity, final C42062c0 c42062c0, final Context context) {
        LinearLayoutCompat ll2 = c42062c0.f92528G;
        Intrinsics.checkNotNullExpressionValue(ll2, "ll2");
        C27046k.m66685H(ll2);
        LinearLayoutCompat ll3 = c42062c0.f92529H;
        Intrinsics.checkNotNullExpressionValue(ll3, "ll3");
        C27046k.m66685H(ll3);
        BaseTextView baseTextView = c42062c0.f92554d;
        BigDecimal yearProfitRate = strategyItemEntity.getYearProfitRate();
        baseTextView.setText(C42180b.m92649n(yearProfitRate != null ? C42180b.m92642g(yearProfitRate, null, null, 0, false, false, false, 63, null) : null));
        BaseTextView baseTextView2 = c42062c0.f92554d;
        BigDecimal yearProfitRate2 = strategyItemEntity.getYearProfitRate();
        if (yearProfitRate2 == null) {
            yearProfitRate2 = BigDecimal.ZERO;
        }
        Intrinsics.checkNotNull(yearProfitRate2);
        baseTextView2.setTextColor(C22890g.m54282g(context, yearProfitRate2, 0, 2, null));
        DashTextView unPnlTitleTv = c42062c0.f92553c0;
        Intrinsics.checkNotNullExpressionValue(unPnlTitleTv, "unPnlTitleTv");
        C40285b1.m88751t(unPnlTitleTv);
        BaseTextView baseTextView3 = c42062c0.f92555d0;
        BigDecimal floatingAmount = strategyItemEntity.getFloatingAmount();
        baseTextView3.setText(C42180b.m92647l(floatingAmount != null ? C42180b.m92640e(floatingAmount, null, C40281a0.m88714q(strategyItemEntity), false, false, false, 0, null, 125, null) : null));
        BaseTextView baseTextView4 = c42062c0.f92555d0;
        BigDecimal floatingAmount2 = strategyItemEntity.getFloatingAmount();
        if (floatingAmount2 == null) {
            floatingAmount2 = BigDecimal.ZERO;
        }
        Intrinsics.checkNotNull(floatingAmount2);
        baseTextView4.setTextColor(C22890g.m54282g(context, floatingAmount2, 0, 2, null));
        DashTextView gridProfitTitleTv = c42062c0.f92574w;
        Intrinsics.checkNotNullExpressionValue(gridProfitTitleTv, "gridProfitTitleTv");
        C40285b1.m88754w(gridProfitTitleTv);
        BaseTextView baseTextView5 = c42062c0.f92575x;
        BigDecimal strategyProfit = strategyItemEntity.getStrategyProfit();
        baseTextView5.setText(C42180b.m92647l(strategyProfit != null ? C42180b.m92640e(strategyProfit, null, C40281a0.m88714q(strategyItemEntity), false, false, false, 0, null, 125, null) : null));
        BaseTextView baseTextView6 = c42062c0.f92575x;
        BigDecimal strategyProfit2 = strategyItemEntity.getStrategyProfit();
        if (strategyProfit2 == null) {
            strategyProfit2 = BigDecimal.ZERO;
        }
        Intrinsics.checkNotNull(strategyProfit2);
        baseTextView6.setTextColor(C22890g.m54282g(context, strategyProfit2, 0, 2, null));
        BaseTextView baseTextView7 = c42062c0.f92542U;
        StringBuilder sb2 = new StringBuilder();
        BigDecimal down = strategyItemEntity.getDown();
        sb2.append(C42180b.m92647l(down != null ? C42180b.m92640e(down, null, C40281a0.m88713p(strategyItemEntity), false, false, false, 0, null, 125, null) : null));
        sb2.append(" - ");
        BigDecimal up2 = strategyItemEntity.getUp();
        sb2.append(C42180b.m92647l(up2 != null ? C42180b.m92640e(up2, null, C40281a0.m88713p(strategyItemEntity), false, false, false, 0, null, 125, null) : null));
        baseTextView7.setText(sb2.toString());
        c42062c0.f92557f.setText(context.getString(R$string.kc_tb_grid_arbitrage_count_24h));
        BaseTextView baseTextView8 = c42062c0.f92558g;
        StringBuilder sb3 = new StringBuilder();
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(C27039d.m66650j(strategyItemEntity.getDayArbitrageNum()));
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
        sb3.append(C42180b.m92647l(C42180b.m92640e(bigDecimalValueOf, null, 0, false, false, false, 0, null, 127, null)));
        sb3.append("/");
        BigDecimal bigDecimalValueOf2 = BigDecimal.valueOf(C27039d.m66650j(strategyItemEntity.getTotalArbitrageNum()));
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf2, "valueOf(...)");
        sb3.append(C42180b.m92647l(C42180b.m92640e(bigDecimalValueOf2, null, 0, false, false, false, 0, null, 127, null)));
        baseTextView8.setText(sb3.toString());
        DashTextView debtRatioTitleTv = c42062c0.f92564m;
        Intrinsics.checkNotNullExpressionValue(debtRatioTitleTv, "debtRatioTitleTv");
        C27046k.m66711z(debtRatioTitleTv, 0L, new Function0() { // from class: j50.o
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C40314q.m88822f(c42062c0, context);
            }
        }, 1, null);
        Pair<String, Integer> pairM88824h = m88824h(strategyItemEntity);
        BaseTextView baseTextView9 = c42062c0.f92565n;
        StringBuilder sb4 = new StringBuilder();
        BigDecimal debtRate = strategyItemEntity.getDebtRate();
        sb4.append(C42180b.m92649n(debtRate != null ? C42180b.m92642g(debtRate, null, null, 0, false, false, false, 63, null) : null));
        sb4.append(" (");
        sb4.append(pairM88824h.getFirst());
        sb4.append(")");
        baseTextView9.setText(sb4.toString());
        c42062c0.f92565n.setTextColor(pairM88824h.getSecond().intValue());
        BaseTextView baseTextView10 = c42062c0.f92523B;
        BigDecimal price = strategyItemEntity.getPrice();
        baseTextView10.setText(C42180b.m92647l(price != null ? C42180b.m92640e(price, null, C40281a0.m88713p(strategyItemEntity), false, false, false, 0, null, 125, null) : null));
        BaseTextView baseTextView11 = c42062c0.f92572u;
        BigDecimal entryPrice = strategyItemEntity.getEntryPrice();
        baseTextView11.setText(C42180b.m92647l(entryPrice != null ? C42180b.m92640e(entryPrice, null, C40281a0.m88713p(strategyItemEntity), false, false, false, 0, null, 125, null) : null));
        BaseTextView baseTextView12 = c42062c0.f92526E;
        BigDecimal blowUpPrice = strategyItemEntity.getBlowUpPrice();
        baseTextView12.setText(C42180b.m92647l(blowUpPrice != null ? C42180b.m92640e(blowUpPrice, null, C40281a0.m88713p(strategyItemEntity), false, false, false, 0, null, 125, null) : null));
    }

    /* JADX INFO: renamed from: f */
    public static final Unit m88822f(C42062c0 c42062c0, Context context) {
        DashTextView debtRatioTitleTv = c42062c0.f92564m;
        Intrinsics.checkNotNullExpressionValue(debtRatioTitleTv, "debtRatioTitleTv");
        FragmentManager childFragmentManager = ViewKt.findFragment(debtRatioTitleTv).getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54168Y4(context.getString(R$string.debt_ratio)).m54156M4(context.getString(R$string.kc_tb_grid_margin_debt_tips)).m54162S4(R$string.i_already_know, new DialogInterface.OnClickListener() { // from class: j50.p
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                C40314q.m88823g(dialogInterface, i11);
            }
        }).m54172c5(childFragmentManager);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: h */
    public static final Pair<String, Integer> m88824h(StrategyItemEntity strategyItemEntity) {
        BigDecimal debtRate = strategyItemEntity.getDebtRate();
        if (debtRate == null) {
            debtRate = BigDecimal.ZERO;
        }
        Intrinsics.checkNotNull(debtRate);
        BigDecimal bigDecimalMultiply = debtRate.multiply(new BigDecimal(100));
        Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
        if (bigDecimalMultiply.compareTo(new BigDecimal(80)) < 0) {
            return new Pair<>(C27017c.f54310a.m66516f(R$string.low_risk, new Object[0]), Integer.valueOf(R$color.primary));
        }
        if (bigDecimalMultiply.compareTo(new BigDecimal(80)) >= 0 && bigDecimalMultiply.compareTo(new BigDecimal(90)) < 0) {
            return new Pair<>(C27017c.f54310a.m66516f(R$string.medium_risk, new Object[0]), Integer.valueOf(R$color.complementary));
        }
        return new Pair<>(C27017c.f54310a.m66516f(R$string.high_risk, new Object[0]), Integer.valueOf(R$color.secondary));
    }

    /* JADX INFO: renamed from: g */
    public static final void m88823g(DialogInterface dialogInterface, int i11) {
    }
}
