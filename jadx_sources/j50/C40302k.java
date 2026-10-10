package j50;

import android.content.Context;
import android.content.DialogInterface;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.ViewKt;
import com.kubi.kumex.api.IKuMexService;
import com.kubi.resources.C22890g;
import com.kubi.resources.dialog.AlertDialogFragmentHelper;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.DashTextView;
import com.kubi.resources.widget.button.KcSecondaryButton;
import com.kubi.tradingbotkit.R$color;
import com.kubi.tradingbotkit.R$string;
import com.kubi.tradingbotkit.business.strategyList.entity.StrategyItemEntity;
import com.kubi.tradingbotkit.service.TradingBotKitDepend;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import io.chad.library.adapter.base.BaseViewHolder;
import java.math.BigDecimal;
import l50.C42058a0;
import o50.C42976j;
import org.jetbrains.annotations.NotNull;
import p429lf.C42180b;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: j50.k */
/* JADX INFO: compiled from: FuturesMartinGaleBinder.kt */
/* JADX INFO: loaded from: classes51.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, m90084d2 = {"bindFuturesMartinGale", "", "Lcom/kubi/tradingbotkit/business/strategyList/entity/StrategyItemEntity;", "helper", "Lio/chad/library/adapter/base/BaseViewHolder;", "TradingBotKitLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C40302k {
    /* JADX INFO: renamed from: e */
    public static final void m88798e(@NotNull StrategyItemEntity strategyItemEntity, @NotNull BaseViewHolder helper) {
        Intrinsics.checkNotNullParameter(strategyItemEntity, "<this>");
        Intrinsics.checkNotNullParameter(helper, "helper");
        final C42058a0 c42058a0M92267a = C42058a0.m92267a(helper.itemView);
        Intrinsics.checkNotNullExpressionValue(c42058a0M92267a, "bind(...)");
        final Context context = helper.itemView.getContext();
        c42058a0M92267a.f92381V.setText(IKuMexService.m33249T(TradingBotKitDepend.f52488a.m64276c(), C27041f.m66668h(strategyItemEntity.getSymbolCode()), false, 2, null).toString());
        c42058a0M92267a.f92407u.setText(C42976j.m94383b(C27039d.m66652l(strategyItemEntity.getStartTimeDifference())));
        c42058a0M92267a.f92380U.setText(context.getString(R$string.kc_tb_futures_martin_gale));
        BaseTextView sideTv = c42058a0M92267a.f92378S;
        Intrinsics.checkNotNullExpressionValue(sideTv, "sideTv");
        C40292f.m88770e(strategyItemEntity, sideTv);
        LinearLayoutCompat couponLl = c42058a0M92267a.f92402p;
        Intrinsics.checkNotNullExpressionValue(couponLl, "couponLl");
        BaseTextView couponDescTv = c42058a0M92267a.f92401o;
        Intrinsics.checkNotNullExpressionValue(couponDescTv, "couponDescTv");
        BaseTextView couponTimeTv = c42058a0M92267a.f92403q;
        Intrinsics.checkNotNullExpressionValue(couponTimeTv, "couponTimeTv");
        C40292f.m88768c(strategyItemEntity, couponLl, couponDescTv, couponTimeTv);
        BaseTextView baseTextView = c42058a0M92267a.f92372M;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(context.getString(R$string.kc_tb_grid_total_profit) + " (");
        sb2.append(C42180b.m92647l(strategyItemEntity.getQuote()));
        sb2.append(")");
        baseTextView.setText(sb2.toString());
        BaseTextView baseTextView2 = c42058a0M92267a.f92373N;
        BigDecimal totalProfit = strategyItemEntity.getTotalProfit();
        baseTextView2.setText(C42180b.m92647l(totalProfit != null ? C42180b.m92640e(totalProfit, null, C40292f.m88779n(strategyItemEntity), false, false, false, 0, null, 125, null) : null));
        BaseTextView baseTextView3 = c42058a0M92267a.f92373N;
        Intrinsics.checkNotNull(context);
        BigDecimal totalProfit2 = strategyItemEntity.getTotalProfit();
        if (totalProfit2 == null) {
            totalProfit2 = BigDecimal.ZERO;
        }
        Intrinsics.checkNotNull(totalProfit2);
        baseTextView3.setTextColor(C22890g.m54282g(context, totalProfit2, 0, 2, null));
        BaseTextView baseTextView4 = c42058a0M92267a.f92371L;
        BigDecimal totalProfitRate = strategyItemEntity.getTotalProfitRate();
        baseTextView4.setText(C42180b.m92649n(totalProfitRate != null ? C42180b.m92642g(totalProfitRate, null, null, 0, true, false, false, 55, null) : null));
        BaseTextView baseTextView5 = c42058a0M92267a.f92371L;
        BigDecimal totalProfitRate2 = strategyItemEntity.getTotalProfitRate();
        if (totalProfitRate2 == null) {
            totalProfitRate2 = BigDecimal.ZERO;
        }
        Intrinsics.checkNotNull(totalProfitRate2);
        baseTextView5.setTextColor(C22890g.m54282g(context, totalProfitRate2, 0, 2, null));
        BaseTextView baseTextView6 = c42058a0M92267a.f92368I;
        StringBuilder sb3 = new StringBuilder();
        sb3.append(context.getString(R$string.kc_tb_grid_total_margin) + " (");
        sb3.append(C42180b.m92647l(strategyItemEntity.getQuote()));
        sb3.append(")");
        baseTextView6.setText(sb3.toString());
        BaseTextView baseTextView7 = c42058a0M92267a.f92369J;
        BigDecimal totalCost = strategyItemEntity.getTotalCost();
        baseTextView7.setText(totalCost != null ? C42180b.m92640e(totalCost, null, C40292f.m88779n(strategyItemEntity), false, false, false, 0, null, 125, null) : null);
        AppCompatImageView loadingIv = c42058a0M92267a.f92366G;
        Intrinsics.checkNotNullExpressionValue(loadingIv, "loadingIv");
        C40292f.m88783r(loadingIv);
        c42058a0M92267a.f92366G.setVisibility(8);
        c42058a0M92267a.f92383X.setText(context.getString(R$string.kc_tb_terminate_title));
        c42058a0M92267a.f92383X.setEnabled(!Intrinsics.areEqual(strategyItemEntity.getStatus(), "STOPPING"));
        KcSecondaryButton terminalTv = c42058a0M92267a.f92383X;
        Intrinsics.checkNotNullExpressionValue(terminalTv, "terminalTv");
        C40285b1.m88725H(terminalTv);
        c42058a0M92267a.f92379T.setTextColor(context.getColor(R$color.c_text));
        KcSecondaryButton detailTv = c42058a0M92267a.f92404r;
        Intrinsics.checkNotNullExpressionValue(detailTv, "detailTv");
        C40285b1.m88723F(detailTv, C40281a0.m88711n(strategyItemEntity), strategyItemEntity.getStatus(), strategyItemEntity.getType(), strategyItemEntity.getId());
        ConstraintLayout rootCl = c42058a0M92267a.f92377R;
        Intrinsics.checkNotNullExpressionValue(rootCl, "rootCl");
        C40285b1.m88723F(rootCl, C40281a0.m88711n(strategyItemEntity), strategyItemEntity.getStatus(), strategyItemEntity.getType(), strategyItemEntity.getId());
        if (Intrinsics.areEqual(strategyItemEntity.getStatus(), "STOPPING")) {
            BaseTextView baseTextView8 = c42058a0M92267a.f92379T;
            int i11 = R$string.kc_tb_grid_action_close;
            baseTextView8.setText(context.getString(i11));
            c42058a0M92267a.f92366G.setVisibility(0);
            AppCompatImageView loadingIv2 = c42058a0M92267a.f92366G;
            Intrinsics.checkNotNullExpressionValue(loadingIv2, "loadingIv");
            C40292f.m88782q(loadingIv2);
            c42058a0M92267a.f92383X.setText(context.getString(i11));
        } else {
            c42058a0M92267a.f92379T.setText(context.getString(R$string.kc_tb_grid_status_running));
            c42058a0M92267a.f92379T.setTextColor(context.getColor(R$color.brandGreen));
        }
        DashTextView realizedProfitTitleTv = c42058a0M92267a.f92375P;
        Intrinsics.checkNotNullExpressionValue(realizedProfitTitleTv, "realizedProfitTitleTv");
        C27046k.m66711z(realizedProfitTitleTv, 0L, new Function0() { // from class: j50.g
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C40302k.m88799f(c42058a0M92267a, context);
            }
        }, 1, null);
        BaseTextView baseTextView9 = c42058a0M92267a.f92376Q;
        BigDecimal strategyProfit = strategyItemEntity.getStrategyProfit();
        baseTextView9.setText(C42180b.m92647l(strategyProfit != null ? C42180b.m92640e(strategyProfit, null, C40292f.m88779n(strategyItemEntity), false, false, false, 0, null, 125, null) : null));
        BaseTextView baseTextView10 = c42058a0M92267a.f92376Q;
        BigDecimal strategyProfit2 = strategyItemEntity.getStrategyProfit();
        if (strategyProfit2 == null) {
            strategyProfit2 = BigDecimal.ZERO;
        }
        Intrinsics.checkNotNull(strategyProfit2);
        baseTextView10.setTextColor(C22890g.m54282g(context, strategyProfit2, 0, 2, null));
        DashTextView unPnlTitleTv = c42058a0M92267a.f92385Z;
        Intrinsics.checkNotNullExpressionValue(unPnlTitleTv, "unPnlTitleTv");
        C40285b1.m88751t(unPnlTitleTv);
        BaseTextView baseTextView11 = c42058a0M92267a.f92387a0;
        BigDecimal floatingAmount = strategyItemEntity.getFloatingAmount();
        baseTextView11.setText(C42180b.m92647l(floatingAmount != null ? C42180b.m92640e(floatingAmount, null, C40292f.m88779n(strategyItemEntity), false, false, false, 0, null, 125, null) : null));
        BaseTextView baseTextView12 = c42058a0M92267a.f92387a0;
        BigDecimal floatingAmount2 = strategyItemEntity.getFloatingAmount();
        if (floatingAmount2 == null) {
            floatingAmount2 = BigDecimal.ZERO;
        }
        Intrinsics.checkNotNull(floatingAmount2);
        baseTextView12.setTextColor(C22890g.m54282g(context, floatingAmount2, 0, 2, null));
        BaseTextView baseTextView13 = c42058a0M92267a.f92390d;
        BigDecimal yearProfitRate = strategyItemEntity.getYearProfitRate();
        baseTextView13.setText(C42180b.m92649n(yearProfitRate != null ? C42180b.m92642g(yearProfitRate, null, null, 0, false, false, false, 63, null) : null));
        BaseTextView baseTextView14 = c42058a0M92267a.f92390d;
        BigDecimal yearProfitRate2 = strategyItemEntity.getYearProfitRate();
        if (yearProfitRate2 == null) {
            yearProfitRate2 = BigDecimal.ZERO;
        }
        Intrinsics.checkNotNull(yearProfitRate2);
        baseTextView14.setTextColor(C22890g.m54282g(context, yearProfitRate2, 0, 2, null));
        BaseTextView baseTextView15 = c42058a0M92267a.f92397k;
        BigDecimal avgBuyPrice = strategyItemEntity.getAvgBuyPrice();
        baseTextView15.setText(C42180b.m92647l(avgBuyPrice != null ? C42180b.m92640e(avgBuyPrice, null, C40292f.m88777l(strategyItemEntity), false, false, false, 0, null, 125, null) : null));
        DashTextView closePriceTitleTv = c42058a0M92267a.f92399m;
        Intrinsics.checkNotNullExpressionValue(closePriceTitleTv, "closePriceTitleTv");
        C27046k.m66711z(closePriceTitleTv, 0L, new Function0() { // from class: j50.h
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C40302k.m88801h(c42058a0M92267a, context);
            }
        }, 1, null);
        BaseTextView baseTextView16 = c42058a0M92267a.f92400n;
        BigDecimal stopProfitPrice = strategyItemEntity.getStopProfitPrice();
        baseTextView16.setText(C42180b.m92647l(stopProfitPrice != null ? C42180b.m92640e(stopProfitPrice, null, C40292f.m88777l(strategyItemEntity), false, false, false, 0, null, 125, null) : null));
        BaseTextView baseTextView17 = c42058a0M92267a.f92393g;
        StringBuilder sb4 = new StringBuilder();
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(C27039d.m66650j(strategyItemEntity.getDayArbitrageNum()));
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
        sb4.append(C42180b.m92647l(C42180b.m92640e(bigDecimalValueOf, null, 0, false, false, false, 0, null, 127, null)));
        sb4.append("/");
        BigDecimal bigDecimalValueOf2 = BigDecimal.valueOf(C27039d.m66650j(strategyItemEntity.getTotalArbitrageNum()));
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf2, "valueOf(...)");
        sb4.append(C42180b.m92647l(C42180b.m92640e(bigDecimalValueOf2, null, 0, false, false, false, 0, null, 127, null)));
        baseTextView17.setText(sb4.toString());
        BaseTextView baseTextView18 = c42058a0M92267a.f92411y;
        BigDecimal price = strategyItemEntity.getPrice();
        baseTextView18.setText(C42180b.m92647l(price != null ? C42180b.m92640e(price, null, C40292f.m88777l(strategyItemEntity), false, false, false, 0, null, 125, null) : null));
        DashTextView liqTitleTv = c42058a0M92267a.f92360A;
        Intrinsics.checkNotNullExpressionValue(liqTitleTv, "liqTitleTv");
        C40285b1.m88727J(liqTitleTv);
        BaseTextView baseTextView19 = c42058a0M92267a.f92361B;
        BigDecimal blowUpPrice = strategyItemEntity.getBlowUpPrice();
        baseTextView19.setText(C42180b.m92647l(blowUpPrice != null ? C42180b.m92640e(blowUpPrice, null, C40292f.m88777l(strategyItemEntity), false, false, false, 0, null, 125, null) : null));
    }

    /* JADX INFO: renamed from: f */
    public static final Unit m88799f(C42058a0 c42058a0, Context context) {
        DashTextView closePriceTitleTv = c42058a0.f92399m;
        Intrinsics.checkNotNullExpressionValue(closePriceTitleTv, "closePriceTitleTv");
        FragmentManager childFragmentManager = ViewKt.findFragment(closePriceTitleTv).getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54168Y4(context.getString(R$string.kc_tb_arbitrage_profit)).m54156M4(context.getString(R$string.kc_tb_grid_alert_spot_martin_gale_profit_tips)).m54162S4(R$string.i_already_know, new DialogInterface.OnClickListener() { // from class: j50.j
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                C40302k.m88800g(dialogInterface, i11);
            }
        }).m54172c5(childFragmentManager);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: h */
    public static final Unit m88801h(C42058a0 c42058a0, Context context) {
        DashTextView closePriceTitleTv = c42058a0.f92399m;
        Intrinsics.checkNotNullExpressionValue(closePriceTitleTv, "closePriceTitleTv");
        FragmentManager childFragmentManager = ViewKt.findFragment(closePriceTitleTv).getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54168Y4(context.getString(R$string.kc_tb_exit_price)).m54156M4(context.getString(R$string.kc_tb_grid_alert_close_price)).m54162S4(R$string.i_already_know, new DialogInterface.OnClickListener() { // from class: j50.i
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                C40302k.m88802i(dialogInterface, i11);
            }
        }).m54172c5(childFragmentManager);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: g */
    public static final void m88800g(DialogInterface dialogInterface, int i11) {
    }

    /* JADX INFO: renamed from: i */
    public static final void m88802i(DialogInterface dialogInterface, int i11) {
    }
}
