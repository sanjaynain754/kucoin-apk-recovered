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
import l50.C42060b0;
import o50.C42976j;
import org.jetbrains.annotations.NotNull;
import p429lf.C42180b;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: j50.n */
/* JADX INFO: compiled from: FuturesWinTwoWayBinder.kt */
/* JADX INFO: loaded from: classes51.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, m90084d2 = {"bindFuturesWinTwoWay", "", "Lcom/kubi/tradingbotkit/business/strategyList/entity/StrategyItemEntity;", "helper", "Lio/chad/library/adapter/base/BaseViewHolder;", "TradingBotKitLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C40308n {
    /* JADX INFO: renamed from: c */
    public static final void m88814c(@NotNull StrategyItemEntity strategyItemEntity, @NotNull BaseViewHolder helper) {
        Intrinsics.checkNotNullParameter(strategyItemEntity, "<this>");
        Intrinsics.checkNotNullParameter(helper, "helper");
        final C42060b0 c42060b0M92271a = C42060b0.m92271a(helper.itemView);
        Intrinsics.checkNotNullExpressionValue(c42060b0M92271a, "bind(...)");
        final Context context = helper.itemView.getContext();
        c42060b0M92271a.f92471K.setText(IKuMexService.m33249T(TradingBotKitDepend.f52488a.m64276c(), C27041f.m66668h(strategyItemEntity.getSymbolCode()), false, 2, null).toString());
        c42060b0M92271a.f92491o.setText(C42976j.m94383b(C27039d.m66652l(strategyItemEntity.getStartTimeDifference())));
        c42060b0M92271a.f92470J.setText(context.getString(R$string.kc_tb_futures_win_two_way));
        AppCompatImageView loadingIv = c42060b0M92271a.f92502z;
        Intrinsics.checkNotNullExpressionValue(loadingIv, "loadingIv");
        C40292f.m88783r(loadingIv);
        c42060b0M92271a.f92502z.setVisibility(8);
        c42060b0M92271a.f92473M.setText(context.getString(R$string.kc_tb_terminate_title));
        c42060b0M92271a.f92473M.setEnabled(!Intrinsics.areEqual(strategyItemEntity.getStatus(), "STOPPING"));
        KcSecondaryButton terminalTv = c42060b0M92271a.f92473M;
        Intrinsics.checkNotNullExpressionValue(terminalTv, "terminalTv");
        C40285b1.m88725H(terminalTv);
        c42060b0M92271a.f92469I.setTextColor(context.getColor(R$color.c_text));
        KcSecondaryButton detailTv = c42060b0M92271a.f92488l;
        Intrinsics.checkNotNullExpressionValue(detailTv, "detailTv");
        C40285b1.m88723F(detailTv, C40281a0.m88711n(strategyItemEntity), strategyItemEntity.getStatus(), strategyItemEntity.getType(), strategyItemEntity.getId());
        ConstraintLayout rootCl = c42060b0M92271a.f92468H;
        Intrinsics.checkNotNullExpressionValue(rootCl, "rootCl");
        C40285b1.m88723F(rootCl, C40281a0.m88711n(strategyItemEntity), strategyItemEntity.getStatus(), strategyItemEntity.getType(), strategyItemEntity.getId());
        if (Intrinsics.areEqual(strategyItemEntity.getStatus(), "STOPPING")) {
            BaseTextView baseTextView = c42060b0M92271a.f92469I;
            int i11 = R$string.kc_tb_grid_action_close;
            baseTextView.setText(context.getString(i11));
            c42060b0M92271a.f92502z.setVisibility(0);
            AppCompatImageView loadingIv2 = c42060b0M92271a.f92502z;
            Intrinsics.checkNotNullExpressionValue(loadingIv2, "loadingIv");
            C40292f.m88782q(loadingIv2);
            c42060b0M92271a.f92473M.setText(context.getString(i11));
        } else {
            c42060b0M92271a.f92469I.setText(context.getString(R$string.kc_tb_grid_status_running));
            c42060b0M92271a.f92469I.setTextColor(context.getColor(R$color.brandGreen));
        }
        LinearLayoutCompat couponLl = c42060b0M92271a.f92486j;
        Intrinsics.checkNotNullExpressionValue(couponLl, "couponLl");
        BaseTextView couponDescTv = c42060b0M92271a.f92485i;
        Intrinsics.checkNotNullExpressionValue(couponDescTv, "couponDescTv");
        BaseTextView couponTimeTv = c42060b0M92271a.f92487k;
        Intrinsics.checkNotNullExpressionValue(couponTimeTv, "couponTimeTv");
        C40292f.m88768c(strategyItemEntity, couponLl, couponDescTv, couponTimeTv);
        BaseTextView baseTextView2 = c42060b0M92271a.f92493q;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(context.getString(R$string.kc_tb_grid_total_invest) + " (");
        sb2.append(C42180b.m92647l(strategyItemEntity.getQuote()));
        sb2.append(")");
        baseTextView2.setText(sb2.toString());
        BaseTextView baseTextView3 = c42060b0M92271a.f92494r;
        BigDecimal totalCost = strategyItemEntity.getTotalCost();
        baseTextView3.setText(totalCost != null ? C42180b.m92640e(totalCost, null, C40292f.m88779n(strategyItemEntity), false, false, false, 0, null, 125, null) : null);
        BaseTextView baseTextView4 = c42060b0M92271a.f92463C;
        StringBuilder sb3 = new StringBuilder();
        sb3.append(context.getString(R$string.kc_tb_grid_total_profit) + " (");
        sb3.append(C42180b.m92647l(strategyItemEntity.getQuote()));
        sb3.append(")");
        baseTextView4.setText(sb3.toString());
        BaseTextView baseTextView5 = c42060b0M92271a.f92464D;
        BigDecimal totalProfit = strategyItemEntity.getTotalProfit();
        baseTextView5.setText(C42180b.m92647l(totalProfit != null ? C42180b.m92640e(totalProfit, null, C40292f.m88779n(strategyItemEntity), false, false, false, 0, null, 125, null) : null));
        BaseTextView baseTextView6 = c42060b0M92271a.f92464D;
        Intrinsics.checkNotNull(context);
        BigDecimal totalProfit2 = strategyItemEntity.getTotalProfit();
        if (totalProfit2 == null) {
            totalProfit2 = BigDecimal.ZERO;
        }
        Intrinsics.checkNotNull(totalProfit2);
        baseTextView6.setTextColor(C22890g.m54282g(context, totalProfit2, 0, 2, null));
        BaseTextView baseTextView7 = c42060b0M92271a.f92462B;
        BigDecimal totalProfitRate = strategyItemEntity.getTotalProfitRate();
        baseTextView7.setText(C42180b.m92649n(totalProfitRate != null ? C42180b.m92642g(totalProfitRate, null, null, 0, true, false, false, 55, null) : null));
        BaseTextView baseTextView8 = c42060b0M92271a.f92462B;
        BigDecimal totalProfitRate2 = strategyItemEntity.getTotalProfitRate();
        if (totalProfitRate2 == null) {
            totalProfitRate2 = BigDecimal.ZERO;
        }
        Intrinsics.checkNotNull(totalProfitRate2);
        baseTextView8.setTextColor(C22890g.m54282g(context, totalProfitRate2, 0, 2, null));
        DashTextView realizedProfitTitleTv = c42060b0M92271a.f92466F;
        Intrinsics.checkNotNullExpressionValue(realizedProfitTitleTv, "realizedProfitTitleTv");
        C40285b1.m88757z(realizedProfitTitleTv);
        BaseTextView baseTextView9 = c42060b0M92271a.f92467G;
        BigDecimal strategyProfit = strategyItemEntity.getStrategyProfit();
        baseTextView9.setText(C42180b.m92647l(strategyProfit != null ? C42180b.m92640e(strategyProfit, null, C40292f.m88779n(strategyItemEntity), false, false, false, 0, null, 125, null) : null));
        BaseTextView baseTextView10 = c42060b0M92271a.f92467G;
        BigDecimal strategyProfit2 = strategyItemEntity.getStrategyProfit();
        if (strategyProfit2 == null) {
            strategyProfit2 = BigDecimal.ZERO;
        }
        Intrinsics.checkNotNull(strategyProfit2);
        baseTextView10.setTextColor(C22890g.m54282g(context, strategyProfit2, 0, 2, null));
        DashTextView unPnlTitleTv = c42060b0M92271a.f92475O;
        Intrinsics.checkNotNullExpressionValue(unPnlTitleTv, "unPnlTitleTv");
        C27046k.m66711z(unPnlTitleTv, 0L, new Function0() { // from class: j50.l
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C40308n.m88815d(c42060b0M92271a, context);
            }
        }, 1, null);
        BaseTextView baseTextView11 = c42060b0M92271a.f92476P;
        BigDecimal floatingAmount = strategyItemEntity.getFloatingAmount();
        baseTextView11.setText(C42180b.m92647l(floatingAmount != null ? C42180b.m92640e(floatingAmount, null, C40292f.m88779n(strategyItemEntity), false, false, false, 0, null, 125, null) : null));
        BaseTextView baseTextView12 = c42060b0M92271a.f92476P;
        BigDecimal floatingAmount2 = strategyItemEntity.getFloatingAmount();
        if (floatingAmount2 == null) {
            floatingAmount2 = BigDecimal.ZERO;
        }
        Intrinsics.checkNotNull(floatingAmount2);
        baseTextView12.setTextColor(C22890g.m54282g(context, floatingAmount2, 0, 2, null));
        BaseTextView baseTextView13 = c42060b0M92271a.f92480d;
        BigDecimal yearProfitRate = strategyItemEntity.getYearProfitRate();
        baseTextView13.setText(C42180b.m92649n(yearProfitRate != null ? C42180b.m92642g(yearProfitRate, null, null, 0, false, false, false, 63, null) : null));
        BaseTextView baseTextView14 = c42060b0M92271a.f92480d;
        BigDecimal yearProfitRate2 = strategyItemEntity.getYearProfitRate();
        if (yearProfitRate2 == null) {
            yearProfitRate2 = BigDecimal.ZERO;
        }
        Intrinsics.checkNotNull(yearProfitRate2);
        baseTextView14.setTextColor(C22890g.m54282g(context, yearProfitRate2, 0, 2, null));
        BaseTextView baseTextView15 = c42060b0M92271a.f92483g;
        StringBuilder sb4 = new StringBuilder();
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(C27039d.m66650j(strategyItemEntity.getDayArbitrageNum()));
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
        sb4.append(C42180b.m92647l(C42180b.m92640e(bigDecimalValueOf, null, 0, false, false, false, 0, null, 127, null)));
        sb4.append("/");
        BigDecimal bigDecimalValueOf2 = BigDecimal.valueOf(C27039d.m66650j(strategyItemEntity.getTotalArbitrageNum()));
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf2, "valueOf(...)");
        sb4.append(C42180b.m92647l(C42180b.m92640e(bigDecimalValueOf2, null, 0, false, false, false, 0, null, 127, null)));
        baseTextView15.setText(sb4.toString());
        BaseTextView baseTextView16 = c42060b0M92271a.f92498v;
        BigDecimal price = strategyItemEntity.getPrice();
        baseTextView16.setText(C42180b.m92647l(price != null ? C42180b.m92640e(price, null, C40292f.m88777l(strategyItemEntity), false, false, false, 0, null, 125, null) : null));
    }

    /* JADX INFO: renamed from: d */
    public static final Unit m88815d(C42060b0 c42060b0, Context context) {
        DashTextView unPnlTitleTv = c42060b0.f92475O;
        Intrinsics.checkNotNullExpressionValue(unPnlTitleTv, "unPnlTitleTv");
        FragmentManager childFragmentManager = ViewKt.findFragment(unPnlTitleTv).getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54168Y4(context.getString(R$string.kc_tb_grid_float_amount)).m54156M4(context.getString(R$string.kc_tb_grid_win_two_way_float_amount_tips)).m54162S4(R$string.i_already_know, new DialogInterface.OnClickListener() { // from class: j50.m
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                C40308n.m88816e(dialogInterface, i11);
            }
        }).m54172c5(childFragmentManager);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: e */
    public static final void m88816e(DialogInterface dialogInterface, int i11) {
    }
}
