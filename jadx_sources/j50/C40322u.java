package j50;

import android.content.Context;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.kubi.data.entity.SymbolInfoEntity;
import com.kubi.resources.C22890g;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.DashTextView;
import com.kubi.resources.widget.button.KcSecondaryButton;
import com.kubi.tradingbotkit.R$color;
import com.kubi.tradingbotkit.R$string;
import com.kubi.tradingbotkit.business.strategyList.entity.StrategyItemEntity;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import gf.C37890n;
import io.chad.library.adapter.base.BaseViewHolder;
import java.math.BigDecimal;
import l50.C42070g0;
import o50.C42976j;
import org.jetbrains.annotations.NotNull;
import p429lf.C42180b;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: j50.u */
/* JADX INFO: compiled from: SpotCtaBinder.kt */
/* JADX INFO: loaded from: classes51.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, m90084d2 = {"bindSpotCta", "", "Lcom/kubi/tradingbotkit/business/strategyList/entity/StrategyItemEntity;", "helper", "Lio/chad/library/adapter/base/BaseViewHolder;", "TradingBotKitLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C40322u {
    /* JADX INFO: renamed from: a */
    public static final void m88832a(@NotNull StrategyItemEntity strategyItemEntity, @NotNull BaseViewHolder helper) {
        Intrinsics.checkNotNullParameter(strategyItemEntity, "<this>");
        Intrinsics.checkNotNullParameter(helper, "helper");
        C42070g0 c42070g0M92291a = C42070g0.m92291a(helper.itemView);
        Intrinsics.checkNotNullExpressionValue(c42070g0M92291a, "bind(...)");
        Context context = helper.itemView.getContext();
        BaseTextView baseTextView = c42070g0M92291a.f92777R;
        SymbolInfoEntity symbolInfoEntityM85601B = C37890n.f85269a.m85601B(C27041f.m66668h(C40281a0.m88711n(strategyItemEntity)));
        baseTextView.setText(C27041f.m66668h(symbolInfoEntityM85601B != null ? symbolInfoEntityM85601B.getShowSymbol() : null));
        c42070g0M92291a.f92803r.setText(C42976j.m94383b(C27039d.m66652l(strategyItemEntity.getStartTimeDifference())));
        c42070g0M92291a.f92776Q.setText(context.getString(R$string.kc_tb_spot_cta));
        AppCompatImageView loadingIv = c42070g0M92291a.f92763D;
        Intrinsics.checkNotNullExpressionValue(loadingIv, "loadingIv");
        C40292f.m88783r(loadingIv);
        c42070g0M92291a.f92763D.setVisibility(8);
        c42070g0M92291a.f92779T.setText(context.getString(R$string.kc_tb_terminate_title));
        c42070g0M92291a.f92779T.setEnabled(!Intrinsics.areEqual(strategyItemEntity.getStatus(), "STOPPING"));
        KcSecondaryButton terminalTv = c42070g0M92291a.f92779T;
        Intrinsics.checkNotNullExpressionValue(terminalTv, "terminalTv");
        C40285b1.m88725H(terminalTv);
        c42070g0M92291a.f92775P.setTextColor(context.getColor(R$color.c_text));
        KcSecondaryButton detailTv = c42070g0M92291a.f92800o;
        Intrinsics.checkNotNullExpressionValue(detailTv, "detailTv");
        C40285b1.m88723F(detailTv, C40281a0.m88711n(strategyItemEntity), strategyItemEntity.getStatus(), strategyItemEntity.getType(), strategyItemEntity.getId());
        ConstraintLayout rootCl = c42070g0M92291a.f92774O;
        Intrinsics.checkNotNullExpressionValue(rootCl, "rootCl");
        C40285b1.m88723F(rootCl, C40281a0.m88711n(strategyItemEntity), strategyItemEntity.getStatus(), strategyItemEntity.getType(), strategyItemEntity.getId());
        if (Intrinsics.areEqual(strategyItemEntity.getStatus(), "STOPPING")) {
            BaseTextView baseTextView2 = c42070g0M92291a.f92775P;
            int i11 = R$string.kc_tb_grid_action_close;
            baseTextView2.setText(context.getString(i11));
            c42070g0M92291a.f92763D.setVisibility(0);
            AppCompatImageView loadingIv2 = c42070g0M92291a.f92763D;
            Intrinsics.checkNotNullExpressionValue(loadingIv2, "loadingIv");
            C40292f.m88782q(loadingIv2);
            c42070g0M92291a.f92779T.setText(context.getString(i11));
        } else {
            c42070g0M92291a.f92775P.setText(context.getString(R$string.kc_tb_grid_status_running));
            c42070g0M92291a.f92775P.setTextColor(context.getColor(R$color.brandGreen));
        }
        LinearLayoutCompat couponLl = c42070g0M92291a.f92795j;
        Intrinsics.checkNotNullExpressionValue(couponLl, "couponLl");
        BaseTextView couponDescTv = c42070g0M92291a.f92794i;
        Intrinsics.checkNotNullExpressionValue(couponDescTv, "couponDescTv");
        BaseTextView couponTimeTv = c42070g0M92291a.f92796k;
        Intrinsics.checkNotNullExpressionValue(couponTimeTv, "couponTimeTv");
        C40292f.m88768c(strategyItemEntity, couponLl, couponDescTv, couponTimeTv);
        BaseTextView baseTextView3 = c42070g0M92291a.f92805t;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(context.getString(R$string.kc_tb_grid_total_invest) + " (");
        sb2.append(C40281a0.m88710m(strategyItemEntity));
        sb2.append(")");
        baseTextView3.setText(sb2.toString());
        BaseTextView baseTextView4 = c42070g0M92291a.f92806u;
        BigDecimal totalCost = strategyItemEntity.getTotalCost();
        baseTextView4.setText(totalCost != null ? C42180b.m92640e(totalCost, null, C40281a0.m88714q(strategyItemEntity), false, false, false, 0, null, 125, null) : null);
        BaseTextView baseTextView5 = c42070g0M92291a.f92766G;
        StringBuilder sb3 = new StringBuilder();
        sb3.append(context.getString(R$string.kc_tb_grid_total_profit) + " (");
        sb3.append(C40281a0.m88710m(strategyItemEntity));
        sb3.append(")");
        baseTextView5.setText(sb3.toString());
        BaseTextView baseTextView6 = c42070g0M92291a.f92767H;
        BigDecimal totalProfit = strategyItemEntity.getTotalProfit();
        baseTextView6.setText(C42180b.m92647l(totalProfit != null ? C42180b.m92640e(totalProfit, null, C40281a0.m88714q(strategyItemEntity), false, false, false, 0, null, 125, null) : null));
        BaseTextView baseTextView7 = c42070g0M92291a.f92767H;
        Intrinsics.checkNotNull(context);
        BigDecimal totalProfit2 = strategyItemEntity.getTotalProfit();
        if (totalProfit2 == null) {
            totalProfit2 = BigDecimal.ZERO;
        }
        Intrinsics.checkNotNull(totalProfit2);
        baseTextView7.setTextColor(C22890g.m54282g(context, totalProfit2, 0, 2, null));
        BaseTextView baseTextView8 = c42070g0M92291a.f92765F;
        BigDecimal totalProfitRate = strategyItemEntity.getTotalProfitRate();
        baseTextView8.setText(C42180b.m92649n(totalProfitRate != null ? C42180b.m92642g(totalProfitRate, null, null, 0, true, false, false, 55, null) : null));
        BaseTextView baseTextView9 = c42070g0M92291a.f92765F;
        BigDecimal totalProfitRate2 = strategyItemEntity.getTotalProfitRate();
        if (totalProfitRate2 == null) {
            totalProfitRate2 = BigDecimal.ZERO;
        }
        Intrinsics.checkNotNull(totalProfitRate2);
        baseTextView9.setTextColor(C22890g.m54282g(context, totalProfitRate2, 0, 2, null));
        DashTextView realizedProfitTitleTv = c42070g0M92291a.f92772M;
        Intrinsics.checkNotNullExpressionValue(realizedProfitTitleTv, "realizedProfitTitleTv");
        C40285b1.m88757z(realizedProfitTitleTv);
        BaseTextView baseTextView10 = c42070g0M92291a.f92773N;
        BigDecimal strategyProfit = strategyItemEntity.getStrategyProfit();
        baseTextView10.setText(C42180b.m92647l(strategyProfit != null ? C42180b.m92640e(strategyProfit, null, C40292f.m88779n(strategyItemEntity), false, false, false, 0, null, 125, null) : null));
        BaseTextView baseTextView11 = c42070g0M92291a.f92773N;
        BigDecimal strategyProfit2 = strategyItemEntity.getStrategyProfit();
        if (strategyProfit2 == null) {
            strategyProfit2 = BigDecimal.ZERO;
        }
        Intrinsics.checkNotNull(strategyProfit2);
        baseTextView11.setTextColor(C22890g.m54282g(context, strategyProfit2, 0, 2, null));
        DashTextView unPnlTitleTv = c42070g0M92291a.f92784Y;
        Intrinsics.checkNotNullExpressionValue(unPnlTitleTv, "unPnlTitleTv");
        C40285b1.m88751t(unPnlTitleTv);
        BaseTextView baseTextView12 = c42070g0M92291a.f92785Z;
        BigDecimal floatingAmount = strategyItemEntity.getFloatingAmount();
        baseTextView12.setText(C42180b.m92647l(floatingAmount != null ? C42180b.m92640e(floatingAmount, null, C40292f.m88779n(strategyItemEntity), false, false, false, 0, null, 125, null) : null));
        BaseTextView baseTextView13 = c42070g0M92291a.f92785Z;
        BigDecimal floatingAmount2 = strategyItemEntity.getFloatingAmount();
        if (floatingAmount2 == null) {
            floatingAmount2 = BigDecimal.ZERO;
        }
        Intrinsics.checkNotNull(floatingAmount2);
        baseTextView13.setTextColor(C22890g.m54282g(context, floatingAmount2, 0, 2, null));
        BaseTextView baseTextView14 = c42070g0M92291a.f92789d;
        BigDecimal yearProfitRate = strategyItemEntity.getYearProfitRate();
        baseTextView14.setText(C42180b.m92649n(yearProfitRate != null ? C42180b.m92642g(yearProfitRate, null, null, 0, false, false, false, 63, null) : null));
        BaseTextView baseTextView15 = c42070g0M92291a.f92789d;
        BigDecimal yearProfitRate2 = strategyItemEntity.getYearProfitRate();
        if (yearProfitRate2 == null) {
            yearProfitRate2 = BigDecimal.ZERO;
        }
        Intrinsics.checkNotNull(yearProfitRate2);
        baseTextView15.setTextColor(C22890g.m54282g(context, yearProfitRate2, 0, 2, null));
        BaseTextView baseTextView16 = c42070g0M92291a.f92769J;
        StringBuilder sb4 = new StringBuilder();
        sb4.append(context.getString(R$string.kc_tb_grid_spot_cta_cur_position) + " (");
        sb4.append(C40281a0.m88712o(strategyItemEntity));
        sb4.append(")");
        baseTextView16.setText(sb4.toString());
        BaseTextView baseTextView17 = c42070g0M92291a.f92770K;
        BigDecimal baseAmount = strategyItemEntity.getBaseAmount();
        baseTextView17.setText(C42180b.m92647l(baseAmount != null ? C42180b.m92640e(baseAmount, null, C40281a0.m88714q(strategyItemEntity), false, false, false, 0, null, 125, null) : null));
        DashTextView currentCostTitleTv = c42070g0M92291a.f92798m;
        Intrinsics.checkNotNullExpressionValue(currentCostTitleTv, "currentCostTitleTv");
        C40285b1.m88748q(currentCostTitleTv);
        BaseTextView baseTextView18 = c42070g0M92291a.f92799n;
        BigDecimal avgBuyPrice = strategyItemEntity.getAvgBuyPrice();
        baseTextView18.setText(C42180b.m92647l(avgBuyPrice != null ? C42180b.m92640e(avgBuyPrice, null, C40281a0.m88713p(strategyItemEntity), false, false, false, 0, null, 125, null) : null));
        DashTextView trendTitleTv = c42070g0M92291a.f92781V;
        Intrinsics.checkNotNullExpressionValue(trendTitleTv, "trendTitleTv");
        C40285b1.m88720C(trendTitleTv);
        c42070g0M92291a.f92782W.setText(C42180b.m92647l(strategyItemEntity.getTrend()));
        BaseTextView baseTextView19 = c42070g0M92291a.f92782W;
        BigDecimal bigDecimalNegate = StringsKt.equals("up", strategyItemEntity.getTrend(), true) ? BigDecimal.ONE : BigDecimal.ONE.negate();
        Intrinsics.checkNotNull(bigDecimalNegate);
        baseTextView19.setTextColor(C22890g.m54282g(context, bigDecimalNegate, 0, 2, null));
        BaseTextView baseTextView20 = c42070g0M92291a.f92792g;
        StringBuilder sb5 = new StringBuilder();
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(C27039d.m66650j(strategyItemEntity.getDayArbitrageNum()));
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
        sb5.append(C42180b.m92647l(C42180b.m92640e(bigDecimalValueOf, null, 0, false, false, false, 0, null, 127, null)));
        sb5.append("/");
        BigDecimal bigDecimalValueOf2 = BigDecimal.valueOf(C27039d.m66650j(strategyItemEntity.getTotalArbitrageNum()));
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf2, "valueOf(...)");
        sb5.append(C42180b.m92647l(C42180b.m92640e(bigDecimalValueOf2, null, 0, false, false, false, 0, null, 127, null)));
        baseTextView20.setText(sb5.toString());
        BaseTextView baseTextView21 = c42070g0M92291a.f92810y;
        BigDecimal price = strategyItemEntity.getPrice();
        baseTextView21.setText(C42180b.m92647l(price != null ? C42180b.m92640e(price, null, C40292f.m88777l(strategyItemEntity), false, false, false, 0, null, 125, null) : null));
    }
}
