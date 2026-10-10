package j50;

import android.content.Context;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.kubi.data.entity.SymbolInfoEntity;
import com.kubi.resources.C22890g;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.button.KcSecondaryButton;
import com.kubi.tradingbotkit.R$color;
import com.kubi.tradingbotkit.R$string;
import com.kubi.tradingbotkit.business.strategyList.entity.StrategyItemEntity;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.tencent.qcloud.tuicore.TUIConstants;
import gf.C37890n;
import io.chad.library.adapter.base.BaseViewHolder;
import java.math.BigDecimal;
import l50.C42066e0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p429lf.C42180b;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: j50.t */
/* JADX INFO: compiled from: SpotAipBinder.kt */
/* JADX INFO: loaded from: classes51.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u0011\u0010\u0005\u001a\u00020\u0006*\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\b\u001a\u0012\u0010\t\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\n\u001a\u00020\u000b¨\u0006\f"}, m90084d2 = {"bindSpotAip", "", "Lcom/kubi/tradingbotkit/business/strategyList/entity/StrategyItemEntity;", "helper", "Lio/chad/library/adapter/base/BaseViewHolder;", "formatNextTimeCountDown", "", "", "(Ljava/lang/Long;)Ljava/lang/String;", "getIntervalDesc", "ctx", "Landroid/content/Context;", "TradingBotKitLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C40320t {
    /* JADX INFO: renamed from: a */
    public static final void m88828a(@NotNull StrategyItemEntity strategyItemEntity, @NotNull BaseViewHolder helper) {
        String newAipVersionTip;
        Intrinsics.checkNotNullParameter(strategyItemEntity, "<this>");
        Intrinsics.checkNotNullParameter(helper, "helper");
        C42066e0 c42066e0M92283a = C42066e0.m92283a(helper.itemView);
        Intrinsics.checkNotNullExpressionValue(c42066e0M92283a, "bind(...)");
        Context context = helper.itemView.getContext();
        BaseTextView baseTextView = c42066e0M92283a.f92654N;
        C37890n c37890n = C37890n.f85269a;
        SymbolInfoEntity symbolInfoEntityM85601B = c37890n.m85601B(C27041f.m66668h(C40281a0.m88711n(strategyItemEntity)));
        String strM92640e = null;
        baseTextView.setText(C27041f.m66668h(symbolInfoEntityM85601B != null ? symbolInfoEntityM85601B.getShowSymbol() : null));
        c42066e0M92283a.f92653M.setText(context.getString(R$string.kc_tb_spot_aip));
        SymbolInfoEntity symbolInfoEntityM85601B2 = c37890n.m85601B(C27041f.m66668h(C40281a0.m88711n(strategyItemEntity)));
        String quoteCurrency = symbolInfoEntityM85601B2 != null ? symbolInfoEntityM85601B2.getQuoteCurrency() : null;
        SymbolInfoEntity symbolInfoEntityM85601B3 = c37890n.m85601B(C27041f.m66668h(C40281a0.m88711n(strategyItemEntity)));
        String baseCurrency = symbolInfoEntityM85601B3 != null ? symbolInfoEntityM85601B3.getBaseCurrency() : null;
        BaseTextView baseTextView2 = c42066e0M92283a.f92671o;
        int i11 = R$string.kc_tb_grid_spot_dca_status_desc;
        String strM88829b = m88829b(strategyItemEntity.getNextTimeDifference());
        BigDecimal amount = strategyItemEntity.getAmount();
        baseTextView2.setText(context.getString(i11, strM88829b, C42180b.m92647l(amount != null ? C42180b.m92640e(amount, null, C40292f.m88779n(strategyItemEntity), false, false, false, 0, null, 125, null) : null), quoteCurrency, baseCurrency));
        AppCompatImageView loadingIv = c42066e0M92283a.f92642B;
        Intrinsics.checkNotNullExpressionValue(loadingIv, "loadingIv");
        C40292f.m88783r(loadingIv);
        c42066e0M92283a.f92642B.setVisibility(8);
        c42066e0M92283a.f92656P.setText(context.getString(R$string.kc_tb_terminate_title));
        c42066e0M92283a.f92656P.setEnabled(!Intrinsics.areEqual(strategyItemEntity.getStatus(), "STOPPING"));
        KcSecondaryButton terminalTv = c42066e0M92283a.f92656P;
        Intrinsics.checkNotNullExpressionValue(terminalTv, "terminalTv");
        C40285b1.m88725H(terminalTv);
        c42066e0M92283a.f92652L.setTextColor(context.getColor(R$color.c_text));
        KcSecondaryButton detailTv = c42066e0M92283a.f92672p;
        Intrinsics.checkNotNullExpressionValue(detailTv, "detailTv");
        C40285b1.m88723F(detailTv, C40281a0.m88711n(strategyItemEntity), strategyItemEntity.getStatus(), strategyItemEntity.getType(), strategyItemEntity.getId());
        ConstraintLayout rootCl = c42066e0M92283a.f92650J;
        Intrinsics.checkNotNullExpressionValue(rootCl, "rootCl");
        C40285b1.m88723F(rootCl, C40281a0.m88711n(strategyItemEntity), strategyItemEntity.getStatus(), strategyItemEntity.getType(), strategyItemEntity.getId());
        if (Intrinsics.areEqual(strategyItemEntity.getStatus(), "STOPPING")) {
            BaseTextView baseTextView3 = c42066e0M92283a.f92652L;
            int i12 = R$string.kc_tb_grid_action_close;
            baseTextView3.setText(context.getString(i12));
            c42066e0M92283a.f92642B.setVisibility(0);
            AppCompatImageView loadingIv2 = c42066e0M92283a.f92642B;
            Intrinsics.checkNotNullExpressionValue(loadingIv2, "loadingIv");
            C40292f.m88782q(loadingIv2);
            c42066e0M92283a.f92656P.setText(context.getString(i12));
        } else {
            c42066e0M92283a.f92652L.setText(context.getString(R$string.kc_tb_grid_status_running));
            c42066e0M92283a.f92652L.setTextColor(context.getColor(R$color.brandGreen));
        }
        LinearLayoutCompat couponLl = c42066e0M92283a.f92669m;
        Intrinsics.checkNotNullExpressionValue(couponLl, "couponLl");
        BaseTextView couponDescTv = c42066e0M92283a.f92668l;
        Intrinsics.checkNotNullExpressionValue(couponDescTv, "couponDescTv");
        BaseTextView couponTimeTv = c42066e0M92283a.f92670n;
        Intrinsics.checkNotNullExpressionValue(couponTimeTv, "couponTimeTv");
        C40292f.m88768c(strategyItemEntity, couponLl, couponDescTv, couponTimeTv);
        BaseTextView baseTextView4 = c42066e0M92283a.f92678v;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(context.getString(R$string.kc_tb_grid_total_invest) + " (");
        sb2.append(C40281a0.m88710m(strategyItemEntity));
        sb2.append(")");
        baseTextView4.setText(sb2.toString());
        BaseTextView baseTextView5 = c42066e0M92283a.f92679w;
        BigDecimal totalCost = strategyItemEntity.getTotalCost();
        baseTextView5.setText(totalCost != null ? C42180b.m92640e(totalCost, null, C40281a0.m88714q(strategyItemEntity), false, false, false, 0, null, 125, null) : null);
        BaseTextView baseTextView6 = c42066e0M92283a.f92648H;
        StringBuilder sb3 = new StringBuilder();
        sb3.append(context.getString(R$string.kc_tb_grid_total_profit) + " (");
        sb3.append(C40281a0.m88710m(strategyItemEntity));
        sb3.append(")");
        baseTextView6.setText(sb3.toString());
        BaseTextView baseTextView7 = c42066e0M92283a.f92649I;
        BigDecimal totalProfit = strategyItemEntity.getTotalProfit();
        baseTextView7.setText(C42180b.m92647l(totalProfit != null ? C42180b.m92640e(totalProfit, null, C40281a0.m88714q(strategyItemEntity), false, false, false, 0, null, 125, null) : null));
        BaseTextView baseTextView8 = c42066e0M92283a.f92649I;
        Intrinsics.checkNotNull(context);
        BigDecimal totalProfit2 = strategyItemEntity.getTotalProfit();
        if (totalProfit2 == null) {
            totalProfit2 = BigDecimal.ZERO;
        }
        Intrinsics.checkNotNull(totalProfit2);
        baseTextView8.setTextColor(C22890g.m54282g(context, totalProfit2, 0, 2, null));
        BaseTextView baseTextView9 = c42066e0M92283a.f92647G;
        BigDecimal totalProfitRate = strategyItemEntity.getTotalProfitRate();
        baseTextView9.setText(C42180b.m92649n(totalProfitRate != null ? C42180b.m92642g(totalProfitRate, null, null, 0, true, false, false, 55, null) : null));
        BaseTextView baseTextView10 = c42066e0M92283a.f92647G;
        BigDecimal totalProfitRate2 = strategyItemEntity.getTotalProfitRate();
        if (totalProfitRate2 == null) {
            totalProfitRate2 = BigDecimal.ZERO;
        }
        Intrinsics.checkNotNull(totalProfitRate2);
        baseTextView10.setTextColor(C22890g.m54282g(context, totalProfitRate2, 0, 2, null));
        c42066e0M92283a.f92676t.setText(m88831d(strategyItemEntity, context));
        BaseTextView baseTextView11 = c42066e0M92283a.f92645E;
        BigDecimal amount2 = strategyItemEntity.getAmount();
        baseTextView11.setText(C42180b.m92647l(amount2 != null ? C42180b.m92640e(amount2, null, C40292f.m88779n(strategyItemEntity), false, false, false, 0, null, 125, null) : null));
        BaseTextView baseTextView12 = c42066e0M92283a.f92661e;
        BigDecimal avgBuyPrice = strategyItemEntity.getAvgBuyPrice();
        baseTextView12.setText(C42180b.m92647l(avgBuyPrice != null ? C42180b.m92640e(avgBuyPrice, null, C40292f.m88779n(strategyItemEntity), false, false, false, 0, null, 125, null) : null));
        BaseTextView baseTextView13 = c42066e0M92283a.f92666j;
        StringBuilder sb4 = new StringBuilder();
        sb4.append(context.getString(R$string.kc_tb_grid_spot_aip_invest_amount) + " (");
        sb4.append(C40281a0.m88712o(strategyItemEntity));
        sb4.append(")");
        baseTextView13.setText(sb4.toString());
        BaseTextView baseTextView14 = c42066e0M92283a.f92667k;
        BigDecimal totalSize = strategyItemEntity.getTotalSize();
        baseTextView14.setText(C42180b.m92647l(totalSize != null ? C42180b.m92640e(totalSize, null, C40292f.m88779n(strategyItemEntity), false, false, false, 0, null, 125, null) : null));
        BaseTextView baseTextView15 = c42066e0M92283a.f92665i;
        Long investedNum = strategyItemEntity.getInvestedNum();
        if (investedNum != null) {
            BigDecimal bigDecimalValueOf = BigDecimal.valueOf(investedNum.longValue());
            Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
            if (bigDecimalValueOf != null) {
                strM92640e = C42180b.m92640e(bigDecimalValueOf, null, C40292f.m88779n(strategyItemEntity), false, false, false, 0, null, 125, null);
            }
        }
        baseTextView15.setText(C42180b.m92647l(strM92640e));
        if (!Intrinsics.areEqual(strategyItemEntity.isNewAipVersion(), Boolean.TRUE) || (newAipVersionTip = strategyItemEntity.getNewAipVersionTip()) == null || newAipVersionTip.length() == 0) {
            BaseTextView spotAipPnlTips = c42066e0M92283a.f92651K;
            Intrinsics.checkNotNullExpressionValue(spotAipPnlTips, "spotAipPnlTips");
            C27046k.m66700o(spotAipPnlTips);
            return;
        }
        BaseTextView spotAipPnlTips2 = c42066e0M92283a.f92651K;
        Intrinsics.checkNotNullExpressionValue(spotAipPnlTips2, "spotAipPnlTips");
        C27046k.m66685H(spotAipPnlTips2);
        c42066e0M92283a.f92651K.setText("* " + strategyItemEntity.getNewAipVersionTip());
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final String m88829b(@Nullable Long l11) {
        long jLongValue = l11 != null ? l11.longValue() : 0L;
        if (jLongValue <= 0) {
            return C42180b.m92647l("");
        }
        long j11 = jLongValue / ((long) 1000);
        long j12 = 3600;
        long j13 = 60;
        return m88830c(j11 / j12) + ':' + m88830c((j11 % j12) / j13) + ':' + m88830c(j11 % j13);
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public static final String m88831d(@NotNull StrategyItemEntity strategyItemEntity, @NotNull Context ctx) {
        Intrinsics.checkNotNullParameter(strategyItemEntity, "<this>");
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        String interval = strategyItemEntity.getInterval();
        if (interval == null) {
            return "";
        }
        switch (interval) {
            case "D1":
                String string = ctx.getString(R$string.kc_tb_grid_interval_day, "1");
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                return string;
            case "D2":
                String string2 = ctx.getString(R$string.kc_tb_grid_interval_day2, "2");
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                return string2;
            case "D3":
                String string3 = ctx.getString(R$string.kc_tb_grid_interval_day2, "3");
                Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                return string3;
            case "D4":
                String string4 = ctx.getString(R$string.kc_tb_grid_interval_day2, "4");
                Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
                return string4;
            case "H1":
                String string5 = ctx.getString(R$string.kc_tb_grid_interval_hour, "1");
                Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
                return string5;
            case "H4":
                String string6 = ctx.getString(R$string.kc_tb_grid_interval_hour_2, "4");
                Intrinsics.checkNotNullExpressionValue(string6, "getString(...)");
                return string6;
            case "H8":
                String string7 = ctx.getString(R$string.kc_tb_grid_interval_hour_2, "8");
                Intrinsics.checkNotNullExpressionValue(string7, "getString(...)");
                return string7;
            case "W1":
                String string8 = ctx.getString(R$string.kc_tb_grid_interval_week, "1");
                Intrinsics.checkNotNullExpressionValue(string8, "getString(...)");
                return string8;
            case "W2":
                String string9 = ctx.getString(R$string.kc_tb_grid_interval_week_2, "2");
                Intrinsics.checkNotNullExpressionValue(string9, "getString(...)");
                return string9;
            case "H12":
                String string10 = ctx.getString(R$string.kc_tb_grid_interval_hour_2, TUIConstants.TUICustomerServicePlugin.BUSINESS_ID_SRC_CUSTOMER_SERVICE_TYPING);
                Intrinsics.checkNotNullExpressionValue(string10, "getString(...)");
                return string10;
            case "m10":
                String string11 = ctx.getString(R$string.kc_tb_grid_interval_minute_1, "10");
                Intrinsics.checkNotNullExpressionValue(string11, "getString(...)");
                return string11;
            case "m20":
                String string12 = ctx.getString(R$string.kc_tb_grid_interval_minute_1, "20");
                Intrinsics.checkNotNullExpressionValue(string12, "getString(...)");
                return string12;
            case "m30":
                String string13 = ctx.getString(R$string.kc_tb_grid_interval_minute_1, "30");
                Intrinsics.checkNotNullExpressionValue(string13, "getString(...)");
                return string13;
            case "m40":
                String string14 = ctx.getString(R$string.kc_tb_grid_interval_minute_1, "40");
                Intrinsics.checkNotNullExpressionValue(string14, "getString(...)");
                return string14;
            case "m50":
                String string15 = ctx.getString(R$string.kc_tb_grid_interval_minute_1, "50");
                Intrinsics.checkNotNullExpressionValue(string15, "getString(...)");
                return string15;
            default:
                return "";
        }
    }

    /* JADX INFO: renamed from: c */
    public static final String m88830c(long j11) {
        return StringsKt.padStart(String.valueOf(j11), 2, '0');
    }
}
