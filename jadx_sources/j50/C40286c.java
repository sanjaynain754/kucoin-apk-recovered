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
import com.kubi.utils.C27017c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import io.chad.library.adapter.base.BaseViewHolder;
import java.math.BigDecimal;
import java.util.Locale;
import l50.C42100z;
import o50.C42976j;
import org.jetbrains.annotations.NotNull;
import p429lf.C42180b;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: j50.c */
/* JADX INFO: compiled from: FuturesCtaBinder.kt */
/* JADX INFO: loaded from: classes51.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, m90084d2 = {"bindFuturesCta", "", "Lcom/kubi/tradingbotkit/business/strategyList/entity/StrategyItemEntity;", "helper", "Lio/chad/library/adapter/base/BaseViewHolder;", "TradingBotKitLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C40286c {
    /* JADX INFO: renamed from: c */
    public static final void m88760c(@NotNull StrategyItemEntity strategyItemEntity, @NotNull BaseViewHolder helper) {
        String lowerCase;
        Intrinsics.checkNotNullParameter(strategyItemEntity, "<this>");
        Intrinsics.checkNotNullParameter(helper, "helper");
        final C42100z c42100zM92355a = C42100z.m92355a(helper.itemView);
        Intrinsics.checkNotNullExpressionValue(c42100zM92355a, "bind(...)");
        final Context context = helper.itemView.getContext();
        c42100zM92355a.f93387V.setText(IKuMexService.m33249T(TradingBotKitDepend.f52488a.m64276c(), C27041f.m66668h(strategyItemEntity.getSymbolCode()), false, 2, null).toString());
        c42100zM92355a.f93413r.setText(C42976j.m94383b(C27039d.m66652l(strategyItemEntity.getStartTimeDifference())));
        c42100zM92355a.f93386U.setText(context.getString(R$string.kc_tb_futures_cta));
        BaseTextView sideTv = c42100zM92355a.f93383R;
        Intrinsics.checkNotNullExpressionValue(sideTv, "sideTv");
        C40292f.m88770e(strategyItemEntity, sideTv);
        AppCompatImageView loadingIv = c42100zM92355a.f93372G;
        Intrinsics.checkNotNullExpressionValue(loadingIv, "loadingIv");
        C40292f.m88783r(loadingIv);
        c42100zM92355a.f93372G.setVisibility(8);
        c42100zM92355a.f93389X.setText(context.getString(R$string.kc_tb_terminate_title));
        c42100zM92355a.f93389X.setEnabled(!Intrinsics.areEqual(strategyItemEntity.getStatus(), "STOPPING"));
        KcSecondaryButton terminalTv = c42100zM92355a.f93389X;
        Intrinsics.checkNotNullExpressionValue(terminalTv, "terminalTv");
        C40285b1.m88725H(terminalTv);
        c42100zM92355a.f93385T.setTextColor(context.getColor(R$color.c_text));
        KcSecondaryButton detailTv = c42100zM92355a.f93410o;
        Intrinsics.checkNotNullExpressionValue(detailTv, "detailTv");
        C40285b1.m88723F(detailTv, C40281a0.m88711n(strategyItemEntity), strategyItemEntity.getStatus(), strategyItemEntity.getType(), strategyItemEntity.getId());
        ConstraintLayout rootCl = c42100zM92355a.f93380O;
        Intrinsics.checkNotNullExpressionValue(rootCl, "rootCl");
        C40285b1.m88723F(rootCl, C40281a0.m88711n(strategyItemEntity), strategyItemEntity.getStatus(), strategyItemEntity.getType(), strategyItemEntity.getId());
        if (Intrinsics.areEqual(strategyItemEntity.getStatus(), "STOPPING")) {
            BaseTextView baseTextView = c42100zM92355a.f93385T;
            int i11 = R$string.kc_tb_grid_action_close;
            baseTextView.setText(context.getString(i11));
            c42100zM92355a.f93372G.setVisibility(0);
            AppCompatImageView loadingIv2 = c42100zM92355a.f93372G;
            Intrinsics.checkNotNullExpressionValue(loadingIv2, "loadingIv");
            C40292f.m88782q(loadingIv2);
            c42100zM92355a.f93389X.setText(context.getString(i11));
        } else {
            c42100zM92355a.f93385T.setText(context.getString(R$string.kc_tb_grid_status_running));
            c42100zM92355a.f93385T.setTextColor(context.getColor(R$color.brandGreen));
        }
        LinearLayoutCompat couponLl = c42100zM92355a.f93405j;
        Intrinsics.checkNotNullExpressionValue(couponLl, "couponLl");
        BaseTextView couponDescTv = c42100zM92355a.f93404i;
        Intrinsics.checkNotNullExpressionValue(couponDescTv, "couponDescTv");
        BaseTextView couponTimeTv = c42100zM92355a.f93406k;
        Intrinsics.checkNotNullExpressionValue(couponTimeTv, "couponTimeTv");
        C40292f.m88768c(strategyItemEntity, couponLl, couponDescTv, couponTimeTv);
        BaseTextView baseTextView2 = c42100zM92355a.f93415t;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(context.getString(R$string.kc_tb_grid_total_invest) + " (");
        sb2.append(C42180b.m92647l(strategyItemEntity.getQuote()));
        sb2.append(")");
        baseTextView2.setText(sb2.toString());
        BaseTextView baseTextView3 = c42100zM92355a.f93416u;
        BigDecimal totalCost = strategyItemEntity.getTotalCost();
        baseTextView3.setText(totalCost != null ? C42180b.m92640e(totalCost, null, C40292f.m88779n(strategyItemEntity), false, false, false, 0, null, 125, null) : null);
        BaseTextView baseTextView4 = c42100zM92355a.f93375J;
        StringBuilder sb3 = new StringBuilder();
        sb3.append(context.getString(R$string.kc_tb_grid_total_profit) + " (");
        sb3.append(C42180b.m92647l(strategyItemEntity.getQuote()));
        sb3.append(")");
        baseTextView4.setText(sb3.toString());
        BaseTextView baseTextView5 = c42100zM92355a.f93376K;
        BigDecimal totalProfit = strategyItemEntity.getTotalProfit();
        baseTextView5.setText(C42180b.m92647l(totalProfit != null ? C42180b.m92640e(totalProfit, null, C40292f.m88779n(strategyItemEntity), false, false, false, 0, null, 125, null) : null));
        BaseTextView baseTextView6 = c42100zM92355a.f93376K;
        Intrinsics.checkNotNull(context);
        BigDecimal totalProfit2 = strategyItemEntity.getTotalProfit();
        if (totalProfit2 == null) {
            totalProfit2 = BigDecimal.ZERO;
        }
        Intrinsics.checkNotNull(totalProfit2);
        baseTextView6.setTextColor(C22890g.m54282g(context, totalProfit2, 0, 2, null));
        BaseTextView baseTextView7 = c42100zM92355a.f93374I;
        BigDecimal totalProfitRate = strategyItemEntity.getTotalProfitRate();
        baseTextView7.setText(C42180b.m92649n(totalProfitRate != null ? C42180b.m92642g(totalProfitRate, null, null, 0, true, false, false, 55, null) : null));
        BaseTextView baseTextView8 = c42100zM92355a.f93374I;
        BigDecimal totalProfitRate2 = strategyItemEntity.getTotalProfitRate();
        if (totalProfitRate2 == null) {
            totalProfitRate2 = BigDecimal.ZERO;
        }
        Intrinsics.checkNotNull(totalProfitRate2);
        baseTextView8.setTextColor(C22890g.m54282g(context, totalProfitRate2, 0, 2, null));
        DashTextView realizedProfitTv = c42100zM92355a.f93378M;
        Intrinsics.checkNotNullExpressionValue(realizedProfitTv, "realizedProfitTv");
        C40285b1.m88757z(realizedProfitTv);
        BaseTextView baseTextView9 = c42100zM92355a.f93379N;
        BigDecimal strategyProfit = strategyItemEntity.getStrategyProfit();
        baseTextView9.setText(C42180b.m92647l(strategyProfit != null ? C42180b.m92640e(strategyProfit, null, C40292f.m88779n(strategyItemEntity), false, false, false, 0, null, 125, null) : null));
        BaseTextView baseTextView10 = c42100zM92355a.f93379N;
        BigDecimal strategyProfit2 = strategyItemEntity.getStrategyProfit();
        if (strategyProfit2 == null) {
            strategyProfit2 = BigDecimal.ZERO;
        }
        Intrinsics.checkNotNull(strategyProfit2);
        baseTextView10.setTextColor(C22890g.m54282g(context, strategyProfit2, 0, 2, null));
        DashTextView unPnlTitleTv = c42100zM92355a.f93397c0;
        Intrinsics.checkNotNullExpressionValue(unPnlTitleTv, "unPnlTitleTv");
        C40285b1.m88751t(unPnlTitleTv);
        BaseTextView baseTextView11 = c42100zM92355a.f93399d0;
        BigDecimal floatingAmount = strategyItemEntity.getFloatingAmount();
        baseTextView11.setText(C42180b.m92647l(floatingAmount != null ? C42180b.m92640e(floatingAmount, null, C40292f.m88779n(strategyItemEntity), false, false, false, 0, null, 125, null) : null));
        BaseTextView baseTextView12 = c42100zM92355a.f93399d0;
        BigDecimal floatingAmount2 = strategyItemEntity.getFloatingAmount();
        if (floatingAmount2 == null) {
            floatingAmount2 = BigDecimal.ZERO;
        }
        Intrinsics.checkNotNull(floatingAmount2);
        baseTextView12.setTextColor(C22890g.m54282g(context, floatingAmount2, 0, 2, null));
        BaseTextView baseTextView13 = c42100zM92355a.f93398d;
        BigDecimal yearProfitRate = strategyItemEntity.getYearProfitRate();
        baseTextView13.setText(C42180b.m92649n(yearProfitRate != null ? C42180b.m92642g(yearProfitRate, null, null, 0, false, false, false, 63, null) : null));
        BaseTextView baseTextView14 = c42100zM92355a.f93398d;
        BigDecimal yearProfitRate2 = strategyItemEntity.getYearProfitRate();
        if (yearProfitRate2 == null) {
            yearProfitRate2 = BigDecimal.ZERO;
        }
        Intrinsics.checkNotNull(yearProfitRate2);
        baseTextView14.setTextColor(C22890g.m54282g(context, yearProfitRate2, 0, 2, null));
        DashTextView curCostTitleTv = c42100zM92355a.f93408m;
        Intrinsics.checkNotNullExpressionValue(curCostTitleTv, "curCostTitleTv");
        C40285b1.m88748q(curCostTitleTv);
        BaseTextView baseTextView15 = c42100zM92355a.f93409n;
        BigDecimal avgBuyPrice = strategyItemEntity.getAvgBuyPrice();
        baseTextView15.setText(C42180b.m92647l(avgBuyPrice != null ? C42180b.m92640e(avgBuyPrice, null, C40292f.m88777l(strategyItemEntity), false, false, false, 0, null, 125, null) : null));
        C27017c c27017c = C27017c.f54310a;
        int iM54281f = C22890g.m54281f(c27017c.m66513b(), !Intrinsics.areEqual(strategyItemEntity.getDirection(), "short"));
        String direction = strategyItemEntity.getDirection();
        if (direction != null) {
            lowerCase = direction.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        } else {
            lowerCase = null;
        }
        c42100zM92355a.f93384S.setText(Intrinsics.areEqual(lowerCase, "short") ? c27017c.m66516f(R$string.contract_short, new Object[0]) : c27017c.m66516f(R$string.contract_long, new Object[0]));
        c42100zM92355a.f93384S.setTextColor(iM54281f);
        DashTextView sideTitleTv = c42100zM92355a.f93382Q;
        Intrinsics.checkNotNullExpressionValue(sideTitleTv, "sideTitleTv");
        C27046k.m66711z(sideTitleTv, 0L, new Function0() { // from class: j50.a
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C40286c.m88761d(c42100zM92355a, context);
            }
        }, 1, null);
        DashTextView trendTitleTv = c42100zM92355a.f93391Z;
        Intrinsics.checkNotNullExpressionValue(trendTitleTv, "trendTitleTv");
        C40285b1.m88720C(trendTitleTv);
        c42100zM92355a.f93393a0.setText(C42180b.m92647l(strategyItemEntity.getTrend()));
        BaseTextView baseTextView16 = c42100zM92355a.f93393a0;
        BigDecimal bigDecimalNegate = StringsKt.equals("up", strategyItemEntity.getTrend(), true) ? BigDecimal.ONE : BigDecimal.ONE.negate();
        Intrinsics.checkNotNull(bigDecimalNegate);
        baseTextView16.setTextColor(C22890g.m54282g(context, bigDecimalNegate, 0, 2, null));
        BaseTextView baseTextView17 = c42100zM92355a.f93402g;
        StringBuilder sb4 = new StringBuilder();
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(C27039d.m66650j(strategyItemEntity.getDayArbitrageNum()));
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
        sb4.append(C42180b.m92647l(C42180b.m92640e(bigDecimalValueOf, null, 0, false, false, false, 0, null, 127, null)));
        sb4.append("/");
        BigDecimal bigDecimalValueOf2 = BigDecimal.valueOf(C27039d.m66650j(strategyItemEntity.getTotalArbitrageNum()));
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf2, "valueOf(...)");
        sb4.append(C42180b.m92647l(C42180b.m92640e(bigDecimalValueOf2, null, 0, false, false, false, 0, null, 127, null)));
        baseTextView17.setText(sb4.toString());
        BaseTextView baseTextView18 = c42100zM92355a.f93420y;
        BigDecimal price = strategyItemEntity.getPrice();
        baseTextView18.setText(C42180b.m92647l(price != null ? C42180b.m92640e(price, null, C40292f.m88777l(strategyItemEntity), false, false, false, 0, null, 125, null) : null));
        DashTextView liqTitleTv = c42100zM92355a.f93366A;
        Intrinsics.checkNotNullExpressionValue(liqTitleTv, "liqTitleTv");
        C40285b1.m88727J(liqTitleTv);
        BaseTextView baseTextView19 = c42100zM92355a.f93367B;
        BigDecimal blowUpPrice = strategyItemEntity.getBlowUpPrice();
        baseTextView19.setText(C42180b.m92647l(blowUpPrice != null ? C42180b.m92640e(blowUpPrice, null, C40292f.m88777l(strategyItemEntity), false, false, false, 0, null, 125, null) : null));
    }

    /* JADX INFO: renamed from: d */
    public static final Unit m88761d(C42100z c42100z, Context context) {
        DashTextView sideTitleTv = c42100z.f93382Q;
        Intrinsics.checkNotNullExpressionValue(sideTitleTv, "sideTitleTv");
        FragmentManager childFragmentManager = ViewKt.findFragment(sideTitleTv).getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54168Y4(context.getString(R$string.kc_tb_grid_trade_side)).m54156M4(context.getString(R$string.kc_tb_grid_futures_ai_side_tips)).m54162S4(R$string.i_already_know, new DialogInterface.OnClickListener() { // from class: j50.b
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                C40286c.m88762e(dialogInterface, i11);
            }
        }).m54172c5(childFragmentManager);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: e */
    public static final void m88762e(DialogInterface dialogInterface, int i11) {
    }
}
