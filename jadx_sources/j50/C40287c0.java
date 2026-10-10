package j50;

import android.content.Context;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.UnderlineSpan;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import com.kubi.data.entity.SymbolInfoEntity;
import com.kubi.resources.C22890g;
import com.kubi.resources.HighlightTextHelper;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.DashTextView;
import com.kubi.resources.widget.button.KcSecondaryButton;
import com.kubi.tradingbotkit.R$color;
import com.kubi.tradingbotkit.R$string;
import com.kubi.tradingbotkit.business.strategyList.entity.StrategyItemEntity;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import gf.C37890n;
import io.chad.library.adapter.base.BaseViewHolder;
import java.math.BigDecimal;
import k50.C40911a;
import l50.C42072h0;
import o50.C42976j;
import org.jetbrains.annotations.NotNull;
import p402kf.C41014a;
import p429lf.C42180b;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: j50.c0 */
/* JADX INFO: compiled from: SpotInfinityBinder.kt */
/* JADX INFO: loaded from: classes51.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, m90084d2 = {"bindSpotInfinityBinder", "", "Lcom/kubi/tradingbotkit/business/strategyList/entity/StrategyItemEntity;", "helper", "Lio/chad/library/adapter/base/BaseViewHolder;", "TradingBotKitLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C40287c0 {

    /* JADX INFO: renamed from: j50.c0$a */
    /* JADX INFO: compiled from: SpotInfinityBinder.kt */
    @Metadata(m90083d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, m90084d2 = {"com/kubi/tradingbotkit/business/strategyList/view/SpotInfinityBinderKt$bindSpotInfinityBinder$1", "Landroid/text/style/ClickableSpan;", "onClick", "", "widget", "Landroid/view/View;", "updateDrawState", "ds", "Landroid/text/TextPaint;", "TradingBotKitLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class a extends ClickableSpan {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Context f89522b;

        public a(Context context) {
            this.f89522b = context;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View widget) {
            Intrinsics.checkNotNullParameter(widget, "widget");
            C40911a.m89599c("/tabpage/running", null, false, 6, null);
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint ds2) {
            Intrinsics.checkNotNullParameter(ds2, "ds");
            ds2.setColor(ContextCompat.getColor(this.f89522b, R$color.c_text));
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m88764b(@NotNull final StrategyItemEntity strategyItemEntity, @NotNull BaseViewHolder helper) {
        Intrinsics.checkNotNullParameter(strategyItemEntity, "<this>");
        Intrinsics.checkNotNullParameter(helper, "helper");
        final C42072h0 c42072h0M92295a = C42072h0.m92295a(helper.itemView);
        Intrinsics.checkNotNullExpressionValue(c42072h0M92295a, "bind(...)");
        final Context context = helper.itemView.getContext();
        BaseTextView baseTextView = c42072h0M92295a.f92836O;
        SymbolInfoEntity symbolInfoEntityM85601B = C37890n.f85269a.m85601B(C27041f.m66668h(C40281a0.m88711n(strategyItemEntity)));
        baseTextView.setText(C27041f.m66668h(symbolInfoEntityM85601B != null ? symbolInfoEntityM85601B.getShowSymbol() : null));
        c42072h0M92295a.f92835N.setText(context.getString(R$string.kc_tb_spot_infinity));
        c42072h0M92295a.f92856o.setText(C42976j.m94383b(C27039d.m66652l(strategyItemEntity.getStartTimeDifference())));
        BaseTextView outRangeTipsTv = c42072h0M92295a.f92828G;
        Intrinsics.checkNotNullExpressionValue(outRangeTipsTv, "outRangeTipsTv");
        C27046k.m66700o(outRangeTipsTv);
        AppCompatImageView loadingIv = c42072h0M92295a.f92824C;
        Intrinsics.checkNotNullExpressionValue(loadingIv, "loadingIv");
        C40292f.m88783r(loadingIv);
        c42072h0M92295a.f92824C.setVisibility(8);
        c42072h0M92295a.f92838Q.setText(context.getString(R$string.kc_tb_terminate_title));
        c42072h0M92295a.f92838Q.setEnabled(!Intrinsics.areEqual(strategyItemEntity.getStatus(), "STOPPING"));
        KcSecondaryButton terminalTv = c42072h0M92295a.f92838Q;
        Intrinsics.checkNotNullExpressionValue(terminalTv, "terminalTv");
        C40285b1.m88725H(terminalTv);
        c42072h0M92295a.f92834M.setTextColor(context.getColor(R$color.c_text));
        KcSecondaryButton detailTv = c42072h0M92295a.f92853l;
        Intrinsics.checkNotNullExpressionValue(detailTv, "detailTv");
        C40285b1.m88723F(detailTv, C40281a0.m88711n(strategyItemEntity), strategyItemEntity.getStatus(), strategyItemEntity.getType(), strategyItemEntity.getId());
        ConstraintLayout rootCl = c42072h0M92295a.f92833L;
        Intrinsics.checkNotNullExpressionValue(rootCl, "rootCl");
        C40285b1.m88723F(rootCl, C40281a0.m88711n(strategyItemEntity), strategyItemEntity.getStatus(), strategyItemEntity.getType(), strategyItemEntity.getId());
        if (Intrinsics.areEqual(strategyItemEntity.getStatus(), "STOPPING")) {
            BaseTextView baseTextView2 = c42072h0M92295a.f92834M;
            int i11 = R$string.kc_tb_grid_action_close;
            baseTextView2.setText(context.getString(i11));
            c42072h0M92295a.f92824C.setVisibility(0);
            AppCompatImageView loadingIv2 = c42072h0M92295a.f92824C;
            Intrinsics.checkNotNullExpressionValue(loadingIv2, "loadingIv");
            C40292f.m88782q(loadingIv2);
            c42072h0M92295a.f92838Q.setText(context.getString(i11));
        } else if (C41014a.m89922G(strategyItemEntity.getPrice(), null, 1, null).compareTo(C41014a.m89922G(strategyItemEntity.getDown(), null, 1, null)) < 0) {
            c42072h0M92295a.f92834M.setText(context.getString(R$string.kc_tb_grid_status_out_range));
            BaseTextView outRangeTipsTv2 = c42072h0M92295a.f92828G;
            Intrinsics.checkNotNullExpressionValue(outRangeTipsTv2, "outRangeTipsTv");
            C27046k.m66685H(outRangeTipsTv2);
            c42072h0M92295a.f92828G.setText(context.getString(R$string.kc_tb_grid_blow_min_price_deal_tips));
            c42072h0M92295a.f92828G.setMovementMethod(LinkMovementMethod.getInstance());
            HighlightTextHelper highlightTextHelper = HighlightTextHelper.f43497a;
            BaseTextView outRangeTipsTv3 = c42072h0M92295a.f92828G;
            Intrinsics.checkNotNullExpressionValue(outRangeTipsTv3, "outRangeTipsTv");
            HighlightTextHelper.TextTagEnum textTagEnum = HighlightTextHelper.TextTagEnum.SPAN;
            highlightTextHelper.m54120f(outRangeTipsTv3, new Pair(textTagEnum, new UnderlineSpan()), new Pair(textTagEnum, new a(context)));
        } else {
            c42072h0M92295a.f92834M.setText(context.getString(R$string.kc_tb_grid_status_running));
            c42072h0M92295a.f92834M.setTextColor(context.getColor(R$color.brandGreen));
        }
        LinearLayoutCompat couponLl = c42072h0M92295a.f92851j;
        Intrinsics.checkNotNullExpressionValue(couponLl, "couponLl");
        BaseTextView couponDescTv = c42072h0M92295a.f92850i;
        Intrinsics.checkNotNullExpressionValue(couponDescTv, "couponDescTv");
        BaseTextView couponTimeTv = c42072h0M92295a.f92852k;
        Intrinsics.checkNotNullExpressionValue(couponTimeTv, "couponTimeTv");
        C40292f.m88768c(strategyItemEntity, couponLl, couponDescTv, couponTimeTv);
        BaseTextView baseTextView3 = c42072h0M92295a.f92861t;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(context.getString(R$string.kc_tb_grid_total_invest) + " (");
        sb2.append(C40281a0.m88710m(strategyItemEntity));
        sb2.append(")");
        baseTextView3.setText(sb2.toString());
        BaseTextView baseTextView4 = c42072h0M92295a.f92862u;
        BigDecimal totalCost = strategyItemEntity.getTotalCost();
        baseTextView4.setText(totalCost != null ? C42180b.m92640e(totalCost, null, C40281a0.m88714q(strategyItemEntity), false, false, false, 0, null, 125, null) : null);
        BaseTextView baseTextView5 = c42072h0M92295a.f92831J;
        StringBuilder sb3 = new StringBuilder();
        sb3.append(context.getString(R$string.kc_tb_grid_total_profit) + " (");
        sb3.append(C40281a0.m88710m(strategyItemEntity));
        sb3.append(")");
        baseTextView5.setText(sb3.toString());
        BaseTextView baseTextView6 = c42072h0M92295a.f92832K;
        BigDecimal totalProfit = strategyItemEntity.getTotalProfit();
        baseTextView6.setText(C42180b.m92647l(totalProfit != null ? C42180b.m92640e(totalProfit, null, C40281a0.m88714q(strategyItemEntity), false, false, false, 0, null, 125, null) : null));
        BaseTextView baseTextView7 = c42072h0M92295a.f92832K;
        Intrinsics.checkNotNull(context);
        BigDecimal totalProfit2 = strategyItemEntity.getTotalProfit();
        if (totalProfit2 == null) {
            totalProfit2 = BigDecimal.ZERO;
        }
        Intrinsics.checkNotNull(totalProfit2);
        baseTextView7.setTextColor(C22890g.m54282g(context, totalProfit2, 0, 2, null));
        BaseTextView baseTextView8 = c42072h0M92295a.f92830I;
        BigDecimal totalProfitRate = strategyItemEntity.getTotalProfitRate();
        baseTextView8.setText(C42180b.m92649n(totalProfitRate != null ? C42180b.m92642g(totalProfitRate, null, null, 0, true, false, false, 55, null) : null));
        BaseTextView baseTextView9 = c42072h0M92295a.f92830I;
        BigDecimal totalProfitRate2 = strategyItemEntity.getTotalProfitRate();
        if (totalProfitRate2 == null) {
            totalProfitRate2 = BigDecimal.ZERO;
        }
        Intrinsics.checkNotNull(totalProfitRate2);
        baseTextView9.setTextColor(C22890g.m54282g(context, totalProfitRate2, 0, 2, null));
        BaseTextView aarTitleTv = c42072h0M92295a.f92844c;
        Intrinsics.checkNotNullExpressionValue(aarTitleTv, "aarTitleTv");
        C27046k.m66711z(aarTitleTv, 0L, new Function0() { // from class: j50.b0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C40287c0.m88765c(strategyItemEntity, c42072h0M92295a, context);
            }
        }, 1, null);
        BaseTextView aarTitleTv2 = c42072h0M92295a.f92844c;
        Intrinsics.checkNotNullExpressionValue(aarTitleTv2, "aarTitleTv");
        BaseTextView aarValueTv = c42072h0M92295a.f92845d;
        Intrinsics.checkNotNullExpressionValue(aarValueTv, "aarValueTv");
        C40281a0.m88717t(strategyItemEntity, aarTitleTv2, aarValueTv, context);
        DashTextView unPnlTitleTv = c42072h0M92295a.f92840S;
        Intrinsics.checkNotNullExpressionValue(unPnlTitleTv, "unPnlTitleTv");
        C40285b1.m88751t(unPnlTitleTv);
        BaseTextView baseTextView10 = c42072h0M92295a.f92841T;
        BigDecimal floatingAmount = strategyItemEntity.getFloatingAmount();
        baseTextView10.setText(C42180b.m92647l(floatingAmount != null ? C42180b.m92640e(floatingAmount, null, C40281a0.m88714q(strategyItemEntity), false, false, false, 0, null, 125, null) : null));
        BaseTextView baseTextView11 = c42072h0M92295a.f92841T;
        BigDecimal floatingAmount2 = strategyItemEntity.getFloatingAmount();
        if (floatingAmount2 == null) {
            floatingAmount2 = BigDecimal.ZERO;
        }
        Intrinsics.checkNotNull(floatingAmount2);
        baseTextView11.setTextColor(C22890g.m54282g(context, floatingAmount2, 0, 2, null));
        DashTextView gridProfitTitleTv = c42072h0M92295a.f92858q;
        Intrinsics.checkNotNullExpressionValue(gridProfitTitleTv, "gridProfitTitleTv");
        C40285b1.m88754w(gridProfitTitleTv);
        BaseTextView baseTextView12 = c42072h0M92295a.f92859r;
        BigDecimal strategyProfit = strategyItemEntity.getStrategyProfit();
        baseTextView12.setText(C42180b.m92647l(strategyProfit != null ? C42180b.m92640e(strategyProfit, null, C40281a0.m88714q(strategyItemEntity), false, false, false, 0, null, 125, null) : null));
        BaseTextView baseTextView13 = c42072h0M92295a.f92859r;
        BigDecimal strategyProfit2 = strategyItemEntity.getStrategyProfit();
        if (strategyProfit2 == null) {
            strategyProfit2 = BigDecimal.ZERO;
        }
        Intrinsics.checkNotNull(strategyProfit2);
        baseTextView13.setTextColor(C22890g.m54282g(context, strategyProfit2, 0, 2, null));
        BaseTextView minBuyPriceValueTv = c42072h0M92295a.f92827F;
        Intrinsics.checkNotNullExpressionValue(minBuyPriceValueTv, "minBuyPriceValueTv");
        C40285b1.m88725H(minBuyPriceValueTv);
        BaseTextView baseTextView14 = c42072h0M92295a.f92827F;
        BigDecimal down = strategyItemEntity.getDown();
        baseTextView14.setText(C42180b.m92647l(down != null ? C42180b.m92640e(down, null, C40281a0.m88713p(strategyItemEntity), false, false, false, 0, null, 125, null) : null));
        BaseTextView baseTextView15 = c42072h0M92295a.f92866y;
        BigDecimal price = strategyItemEntity.getPrice();
        baseTextView15.setText(C42180b.m92647l(price != null ? C42180b.m92640e(price, null, C40281a0.m88713p(strategyItemEntity), false, false, false, 0, null, 125, null) : null));
        BaseTextView baseTextView16 = c42072h0M92295a.f92848g;
        StringBuilder sb4 = new StringBuilder();
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(C27039d.m66650j(strategyItemEntity.getDayArbitrageNum()));
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
        sb4.append(C42180b.m92647l(C42180b.m92640e(bigDecimalValueOf, null, 0, false, false, false, 0, null, 127, null)));
        sb4.append("/");
        BigDecimal bigDecimalValueOf2 = BigDecimal.valueOf(C27039d.m66650j(strategyItemEntity.getTotalArbitrageNum()));
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf2, "valueOf(...)");
        sb4.append(C42180b.m92647l(C42180b.m92640e(bigDecimalValueOf2, null, 0, false, false, false, 0, null, 127, null)));
        baseTextView16.setText(sb4.toString());
    }

    /* JADX INFO: renamed from: c */
    public static final Unit m88765c(StrategyItemEntity strategyItemEntity, C42072h0 c42072h0, Context context) {
        strategyItemEntity.setShowYearProfitRate(!strategyItemEntity.isShowYearProfitRate());
        BaseTextView aarTitleTv = c42072h0.f92844c;
        Intrinsics.checkNotNullExpressionValue(aarTitleTv, "aarTitleTv");
        BaseTextView aarValueTv = c42072h0.f92845d;
        Intrinsics.checkNotNullExpressionValue(aarValueTv, "aarValueTv");
        Intrinsics.checkNotNull(context);
        C40281a0.m88717t(strategyItemEntity, aarTitleTv, aarValueTv, context);
        return Unit.INSTANCE;
    }
}
