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
import l50.C42074i0;
import o50.C42976j;
import org.jetbrains.annotations.NotNull;
import p429lf.C42180b;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: j50.h0 */
/* JADX INFO: compiled from: SpotMartinGaleBinder.kt */
/* JADX INFO: loaded from: classes51.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u000e\u0010\u0005\u001a\u0004\u0018\u00010\u0006*\u00020\u0002H\u0002¨\u0006\u0007"}, m90084d2 = {"bindSpotMartinGale", "", "Lcom/kubi/tradingbotkit/business/strategyList/entity/StrategyItemEntity;", "helper", "Lio/chad/library/adapter/base/BaseViewHolder;", "getNotMeetOpenPositionTips", "", "TradingBotKitLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C40297h0 {
    /* JADX INFO: renamed from: e */
    public static final void m88788e(@NotNull StrategyItemEntity strategyItemEntity, @NotNull BaseViewHolder helper) {
        Intrinsics.checkNotNullParameter(strategyItemEntity, "<this>");
        Intrinsics.checkNotNullParameter(helper, "helper");
        final C42074i0 c42074i0M92299a = C42074i0.m92299a(helper.itemView);
        Intrinsics.checkNotNullExpressionValue(c42074i0M92299a, "bind(...)");
        final Context context = helper.itemView.getContext();
        BaseTextView baseTextView = c42074i0M92299a.f92917V;
        SymbolInfoEntity symbolInfoEntityM85601B = C37890n.f85269a.m85601B(C27041f.m66668h(C40281a0.m88711n(strategyItemEntity)));
        baseTextView.setText(C27041f.m66668h(symbolInfoEntityM85601B != null ? symbolInfoEntityM85601B.getShowSymbol() : null));
        c42074i0M92299a.f92943u.setText(C42976j.m94383b(C27039d.m66652l(strategyItemEntity.getStartTimeDifference())));
        c42074i0M92299a.f92916U.setText(context.getString(R$string.kc_tb_spot_martin_gale));
        BaseTextView notMeetOpenPositionTipsTv = c42074i0M92299a.f92906K;
        Intrinsics.checkNotNullExpressionValue(notMeetOpenPositionTipsTv, "notMeetOpenPositionTipsTv");
        C27046k.m66700o(notMeetOpenPositionTipsTv);
        AppCompatImageView loadingIv = c42074i0M92299a.f92905J;
        Intrinsics.checkNotNullExpressionValue(loadingIv, "loadingIv");
        C40292f.m88783r(loadingIv);
        c42074i0M92299a.f92905J.setVisibility(8);
        c42074i0M92299a.f92919X.setText(context.getString(R$string.kc_tb_terminate_title));
        c42074i0M92299a.f92919X.setEnabled(!Intrinsics.areEqual(strategyItemEntity.getStatus(), "STOPPING"));
        KcSecondaryButton terminalTv = c42074i0M92299a.f92919X;
        Intrinsics.checkNotNullExpressionValue(terminalTv, "terminalTv");
        C40285b1.m88725H(terminalTv);
        c42074i0M92299a.f92915T.setTextColor(context.getColor(R$color.c_text));
        KcSecondaryButton detailTv = c42074i0M92299a.f92940r;
        Intrinsics.checkNotNullExpressionValue(detailTv, "detailTv");
        C40285b1.m88723F(detailTv, C40281a0.m88711n(strategyItemEntity), strategyItemEntity.getStatus(), strategyItemEntity.getType(), strategyItemEntity.getId());
        ConstraintLayout rootCl = c42074i0M92299a.f92914S;
        Intrinsics.checkNotNullExpressionValue(rootCl, "rootCl");
        C40285b1.m88723F(rootCl, C40281a0.m88711n(strategyItemEntity), strategyItemEntity.getStatus(), strategyItemEntity.getType(), strategyItemEntity.getId());
        if (Intrinsics.areEqual(strategyItemEntity.getStatus(), "STOPPING")) {
            BaseTextView baseTextView2 = c42074i0M92299a.f92915T;
            int i11 = R$string.kc_tb_grid_action_close;
            baseTextView2.setText(context.getString(i11));
            c42074i0M92299a.f92905J.setVisibility(0);
            AppCompatImageView loadingIv2 = c42074i0M92299a.f92905J;
            Intrinsics.checkNotNullExpressionValue(loadingIv2, "loadingIv");
            C40292f.m88782q(loadingIv2);
            c42074i0M92299a.f92919X.setText(context.getString(i11));
        } else {
            c42074i0M92299a.f92915T.setText(context.getString(R$string.kc_tb_grid_status_running));
            c42074i0M92299a.f92915T.setTextColor(context.getColor(R$color.brandGreen));
        }
        LinearLayoutCompat couponLl = c42074i0M92299a.f92938p;
        Intrinsics.checkNotNullExpressionValue(couponLl, "couponLl");
        BaseTextView couponDescTv = c42074i0M92299a.f92937o;
        Intrinsics.checkNotNullExpressionValue(couponDescTv, "couponDescTv");
        BaseTextView couponTimeTv = c42074i0M92299a.f92939q;
        Intrinsics.checkNotNullExpressionValue(couponTimeTv, "couponTimeTv");
        C40292f.m88768c(strategyItemEntity, couponLl, couponDescTv, couponTimeTv);
        String strM88793j = m88793j(strategyItemEntity);
        if (strM88793j != null) {
            BaseTextView notMeetOpenPositionTipsTv2 = c42074i0M92299a.f92906K;
            Intrinsics.checkNotNullExpressionValue(notMeetOpenPositionTipsTv2, "notMeetOpenPositionTipsTv");
            C27046k.m66685H(notMeetOpenPositionTipsTv2);
            c42074i0M92299a.f92906K.setText(strM88793j);
        }
        BaseTextView baseTextView3 = c42074i0M92299a.f92948z;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(context.getString(R$string.kc_tb_grid_total_invest) + " (");
        sb2.append(C40281a0.m88710m(strategyItemEntity));
        sb2.append(")");
        baseTextView3.setText(sb2.toString());
        BaseTextView baseTextView4 = c42074i0M92299a.f92896A;
        BigDecimal totalCost = strategyItemEntity.getTotalCost();
        baseTextView4.setText(totalCost != null ? C42180b.m92640e(totalCost, null, C40281a0.m88714q(strategyItemEntity), false, false, false, 0, null, 125, null) : null);
        BaseTextView baseTextView5 = c42074i0M92299a.f92909N;
        StringBuilder sb3 = new StringBuilder();
        sb3.append(context.getString(R$string.kc_tb_grid_total_profit) + " (");
        sb3.append(C40281a0.m88710m(strategyItemEntity));
        sb3.append(")");
        baseTextView5.setText(sb3.toString());
        BaseTextView baseTextView6 = c42074i0M92299a.f92910O;
        BigDecimal totalProfit = strategyItemEntity.getTotalProfit();
        baseTextView6.setText(C42180b.m92647l(totalProfit != null ? C42180b.m92640e(totalProfit, null, C40281a0.m88714q(strategyItemEntity), false, false, false, 0, null, 125, null) : null));
        BaseTextView baseTextView7 = c42074i0M92299a.f92910O;
        Intrinsics.checkNotNull(context);
        BigDecimal totalProfit2 = strategyItemEntity.getTotalProfit();
        if (totalProfit2 == null) {
            totalProfit2 = BigDecimal.ZERO;
        }
        Intrinsics.checkNotNull(totalProfit2);
        baseTextView7.setTextColor(C22890g.m54282g(context, totalProfit2, 0, 2, null));
        BaseTextView baseTextView8 = c42074i0M92299a.f92908M;
        BigDecimal totalProfitRate = strategyItemEntity.getTotalProfitRate();
        baseTextView8.setText(C42180b.m92649n(totalProfitRate != null ? C42180b.m92642g(totalProfitRate, null, null, 0, true, false, false, 55, null) : null));
        BaseTextView baseTextView9 = c42074i0M92299a.f92908M;
        BigDecimal totalProfitRate2 = strategyItemEntity.getTotalProfitRate();
        if (totalProfitRate2 == null) {
            totalProfitRate2 = BigDecimal.ZERO;
        }
        Intrinsics.checkNotNull(totalProfitRate2);
        baseTextView9.setTextColor(C22890g.m54282g(context, totalProfitRate2, 0, 2, null));
        BaseTextView baseTextView10 = c42074i0M92299a.f92926d;
        BigDecimal yearProfitRate = strategyItemEntity.getYearProfitRate();
        baseTextView10.setText(C42180b.m92649n(yearProfitRate != null ? C42180b.m92642g(yearProfitRate, null, null, 0, false, false, false, 63, null) : null));
        BaseTextView baseTextView11 = c42074i0M92299a.f92926d;
        BigDecimal yearProfitRate2 = strategyItemEntity.getYearProfitRate();
        if (yearProfitRate2 == null) {
            yearProfitRate2 = BigDecimal.ZERO;
        }
        Intrinsics.checkNotNull(yearProfitRate2);
        baseTextView11.setTextColor(C22890g.m54282g(context, yearProfitRate2, 0, 2, null));
        DashTextView unPnlTitleTv = c42074i0M92299a.f92921Z;
        Intrinsics.checkNotNullExpressionValue(unPnlTitleTv, "unPnlTitleTv");
        C40285b1.m88751t(unPnlTitleTv);
        BaseTextView baseTextView12 = c42074i0M92299a.f92923a0;
        BigDecimal floatingAmount = strategyItemEntity.getFloatingAmount();
        baseTextView12.setText(C42180b.m92647l(floatingAmount != null ? C42180b.m92640e(floatingAmount, null, C40281a0.m88714q(strategyItemEntity), false, false, false, 0, null, 125, null) : null));
        BaseTextView baseTextView13 = c42074i0M92299a.f92923a0;
        BigDecimal floatingAmount2 = strategyItemEntity.getFloatingAmount();
        if (floatingAmount2 == null) {
            floatingAmount2 = BigDecimal.ZERO;
        }
        Intrinsics.checkNotNull(floatingAmount2);
        baseTextView13.setTextColor(C22890g.m54282g(context, floatingAmount2, 0, 2, null));
        DashTextView gridProfitTitleTv = c42074i0M92299a.f92945w;
        Intrinsics.checkNotNullExpressionValue(gridProfitTitleTv, "gridProfitTitleTv");
        C27046k.m66711z(gridProfitTitleTv, 0L, new Function0() { // from class: j50.d0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C40297h0.m88789f(c42074i0M92299a, context);
            }
        }, 1, null);
        BaseTextView baseTextView14 = c42074i0M92299a.f92946x;
        BigDecimal strategyProfit = strategyItemEntity.getStrategyProfit();
        baseTextView14.setText(C42180b.m92647l(strategyProfit != null ? C42180b.m92640e(strategyProfit, null, C40281a0.m88714q(strategyItemEntity), false, false, false, 0, null, 125, null) : null));
        BaseTextView baseTextView15 = c42074i0M92299a.f92946x;
        BigDecimal strategyProfit2 = strategyItemEntity.getStrategyProfit();
        if (strategyProfit2 == null) {
            strategyProfit2 = BigDecimal.ZERO;
        }
        Intrinsics.checkNotNull(strategyProfit2);
        baseTextView15.setTextColor(C22890g.m54282g(context, strategyProfit2, 0, 2, null));
        BaseTextView baseTextView16 = c42074i0M92299a.f92933k;
        BigDecimal avgBuyPrice = strategyItemEntity.getAvgBuyPrice();
        baseTextView16.setText(C42180b.m92647l(avgBuyPrice != null ? C42180b.m92640e(avgBuyPrice, null, C40281a0.m88713p(strategyItemEntity), false, false, false, 0, null, 125, null) : null));
        DashTextView closePriceTitleTv = c42074i0M92299a.f92935m;
        Intrinsics.checkNotNullExpressionValue(closePriceTitleTv, "closePriceTitleTv");
        C27046k.m66711z(closePriceTitleTv, 0L, new Function0() { // from class: j50.e0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C40297h0.m88791h(c42074i0M92299a, context);
            }
        }, 1, null);
        BaseTextView baseTextView17 = c42074i0M92299a.f92936n;
        BigDecimal stopProfitPrice = strategyItemEntity.getStopProfitPrice();
        baseTextView17.setText(C42180b.m92647l(stopProfitPrice != null ? C42180b.m92640e(stopProfitPrice, null, C40281a0.m88713p(strategyItemEntity), false, false, false, 0, null, 125, null) : null));
        BaseTextView baseTextView18 = c42074i0M92299a.f92900E;
        BigDecimal price = strategyItemEntity.getPrice();
        baseTextView18.setText(C42180b.m92647l(price != null ? C42180b.m92640e(price, null, C40281a0.m88713p(strategyItemEntity), false, false, false, 0, null, 125, null) : null));
        BaseTextView baseTextView19 = c42074i0M92299a.f92913R;
        StringBuilder sb4 = new StringBuilder();
        BigDecimal minPrice = strategyItemEntity.getMinPrice();
        sb4.append(C42180b.m92647l(minPrice != null ? C42180b.m92640e(minPrice, null, C40281a0.m88713p(strategyItemEntity), false, false, false, 0, null, 125, null) : null));
        sb4.append(" - ");
        BigDecimal maxPrice = strategyItemEntity.getMaxPrice();
        sb4.append(C42180b.m92647l(maxPrice != null ? C42180b.m92640e(maxPrice, null, C40281a0.m88713p(strategyItemEntity), false, false, false, 0, null, 125, null) : null));
        baseTextView19.setText(sb4.toString());
        BaseTextView baseTextView20 = c42074i0M92299a.f92929g;
        StringBuilder sb5 = new StringBuilder();
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(C27039d.m66650j(strategyItemEntity.getDayArbitrageNum()));
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
        sb5.append(C42180b.m92647l(C42180b.m92640e(bigDecimalValueOf, null, 0, false, false, false, 0, null, 127, null)));
        sb5.append("/");
        BigDecimal bigDecimalValueOf2 = BigDecimal.valueOf(C27039d.m66650j(strategyItemEntity.getTotalArbitrageNum()));
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf2, "valueOf(...)");
        sb5.append(C42180b.m92647l(C42180b.m92640e(bigDecimalValueOf2, null, 0, false, false, false, 0, null, 127, null)));
        baseTextView20.setText(sb5.toString());
    }

    /* JADX INFO: renamed from: f */
    public static final Unit m88789f(C42074i0 c42074i0, Context context) {
        DashTextView closePriceTitleTv = c42074i0.f92935m;
        Intrinsics.checkNotNullExpressionValue(closePriceTitleTv, "closePriceTitleTv");
        FragmentManager childFragmentManager = ViewKt.findFragment(closePriceTitleTv).getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54168Y4(context.getString(R$string.kc_tb_arbitrage_profit)).m54156M4(context.getString(R$string.kc_tb_grid_alert_spot_martin_gale_profit_tips)).m54162S4(R$string.i_already_know, new DialogInterface.OnClickListener() { // from class: j50.g0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                C40297h0.m88790g(dialogInterface, i11);
            }
        }).m54172c5(childFragmentManager);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: h */
    public static final Unit m88791h(C42074i0 c42074i0, Context context) {
        DashTextView closePriceTitleTv = c42074i0.f92935m;
        Intrinsics.checkNotNullExpressionValue(closePriceTitleTv, "closePriceTitleTv");
        FragmentManager childFragmentManager = ViewKt.findFragment(closePriceTitleTv).getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54168Y4(context.getString(R$string.kc_tb_grid_spot_stop_profit_price)).m54156M4(context.getString(R$string.kc_tb_grid_alert_spot_martin_gale_close_price_tips)).m54162S4(R$string.i_already_know, new DialogInterface.OnClickListener() { // from class: j50.f0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                C40297h0.m88792i(dialogInterface, i11);
            }
        }).show(childFragmentManager, "NotMeetOpenPositionTips");
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: j */
    public static final String m88793j(StrategyItemEntity strategyItemEntity) {
        String strM92640e;
        String strM92640e2 = null;
        if (strategyItemEntity.getMinPrice() == null && strategyItemEntity.getMaxPrice() == null) {
            if (strategyItemEntity.getRsi() == null) {
                return null;
            }
            return C27017c.f54310a.m66516f(R$string.kc_tb_grid_spot_martin_gale_not_meet_open_dialog_desc_2, new Object[0]);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(C27017c.f54310a.m66516f(R$string.kc_tb_grid_spot_martin_gale_not_meet_open_dialog_desc_1, new Object[0]));
        BigDecimal minPrice = strategyItemEntity.getMinPrice();
        if (minPrice != null) {
            strM92640e = C42180b.m92640e(minPrice, null, C40281a0.m88713p(strategyItemEntity), false, false, false, 0, null, 125, null);
        } else {
            strM92640e = null;
        }
        sb2.append(C42180b.m92647l(strM92640e));
        sb2.append("~");
        BigDecimal maxPrice = strategyItemEntity.getMaxPrice();
        if (maxPrice != null) {
            strM92640e2 = C42180b.m92640e(maxPrice, null, C40281a0.m88713p(strategyItemEntity), false, false, false, 0, null, 125, null);
        }
        sb2.append(C42180b.m92647l(strM92640e2));
        return sb2.toString();
    }

    /* JADX INFO: renamed from: g */
    public static final void m88790g(DialogInterface dialogInterface, int i11) {
    }

    /* JADX INFO: renamed from: i */
    public static final void m88792i(DialogInterface dialogInterface, int i11) {
    }
}
