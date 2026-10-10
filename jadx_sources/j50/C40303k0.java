package j50;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.UnderlineSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import com.kubi.resources.C22890g;
import com.kubi.resources.HighlightTextHelper;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.DashTextView;
import com.kubi.resources.widget.button.KcSecondaryButton;
import com.kubi.tradingbotkit.R$color;
import com.kubi.tradingbotkit.R$drawable;
import com.kubi.tradingbotkit.R$string;
import com.kubi.tradingbotkit.business.strategyList.entity.CurrencyInfo;
import com.kubi.tradingbotkit.business.strategyList.entity.Method;
import com.kubi.tradingbotkit.business.strategyList.entity.StrategyItemEntity;
import com.kubi.tradingbotkit.business.strategyList.entity.Target;
import com.kubi.utils.C27100x0;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27046k;
import io.chad.library.adapter.base.BaseViewHolder;
import java.math.BigDecimal;
import java.util.List;
import k50.C40911a;
import l50.C42076j0;
import l50.C42078k0;
import o50.C42976j;
import org.jetbrains.annotations.NotNull;
import p429lf.C42180b;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: j50.k0 */
/* JADX INFO: compiled from: SpotPositionsBinder.kt */
/* JADX INFO: loaded from: classes51.dex */
@Metadata(m90083d1 = {"\u0000B\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u001c\u0010\u0005\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0002\u001a\u001c\u0010\t\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002\u001a$\u0010\u000e\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0002\u001a\u000e\u0010\u0015\u001a\u0004\u0018\u00010\u0016*\u00020\u0014H\u0002¨\u0006\u0017"}, m90084d2 = {"bindSpotPositions", "", "Lcom/kubi/tradingbotkit/business/strategyList/entity/StrategyItemEntity;", "helper", "Lio/chad/library/adapter/base/BaseViewHolder;", "bindThresholdChangeDesc", "changeThresholdTv", "Landroid/widget/TextView;", "curThresholdTv", "bindPositions", "viewBinding", "Lcom/kubi/tradingbotkit/databinding/BtradingBotKitStrategyItemSpotPositionBinding;", "ctx", "Landroid/content/Context;", "addItem", "inflater", "Landroid/view/LayoutInflater;", "rootLl", "Landroidx/appcompat/widget/LinearLayoutCompat;", "currencyInfo", "Lcom/kubi/tradingbotkit/business/strategyList/entity/CurrencyInfo;", "calAsset", "Ljava/math/BigDecimal;", "TradingBotKitLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSpotPositionsBinder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpotPositionsBinder.kt\ncom/kubi/tradingbotkit/business/strategyList/view/SpotPositionsBinderKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,248:1\n1869#2,2:249\n1869#2,2:251\n*S KotlinDebug\n*F\n+ 1 SpotPositionsBinder.kt\ncom/kubi/tradingbotkit/business/strategyList/view/SpotPositionsBinderKt\n*L\n206#1:249,2\n212#1:251,2\n*E\n"})
public final class C40303k0 {

    /* JADX INFO: renamed from: j50.k0$a */
    /* JADX INFO: compiled from: SpotPositionsBinder.kt */
    @Metadata(m90083d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, m90084d2 = {"com/kubi/tradingbotkit/business/strategyList/view/SpotPositionsBinderKt$bindSpotPositions$1", "Landroid/text/style/ClickableSpan;", "onClick", "", "widget", "Landroid/view/View;", "updateDrawState", "ds", "Landroid/text/TextPaint;", "TradingBotKitLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class a extends ClickableSpan {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Context f89540b;

        public a(Context context) {
            this.f89540b = context;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View widget) {
            Intrinsics.checkNotNullParameter(widget, "widget");
            C40911a.m89599c("/tabpage/running", null, false, 6, null);
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint ds2) {
            Intrinsics.checkNotNullParameter(ds2, "ds");
            ds2.setColor(ContextCompat.getColor(this.f89540b, R$color.c_text));
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m88805c(final StrategyItemEntity strategyItemEntity, final LayoutInflater layoutInflater, final LinearLayoutCompat linearLayoutCompat, final CurrencyInfo currencyInfo) {
        C27100x0.m66924e(new Function0() { // from class: j50.j0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C40303k0.m88806d(layoutInflater, currencyInfo, strategyItemEntity, linearLayoutCompat);
            }
        });
    }

    /* JADX INFO: renamed from: f */
    public static final void m88808f(@NotNull final StrategyItemEntity strategyItemEntity, @NotNull BaseViewHolder helper) {
        Intrinsics.checkNotNullParameter(strategyItemEntity, "<this>");
        Intrinsics.checkNotNullParameter(helper, "helper");
        final C42076j0 c42076j0M92303a = C42076j0.m92303a(helper.itemView);
        Intrinsics.checkNotNullExpressionValue(c42076j0M92303a, "bind(...)");
        final Context context = helper.itemView.getContext();
        c42076j0M92303a.f92987m.setText(C42976j.m94383b(C27039d.m66652l(strategyItemEntity.getStartTimeDifference())));
        DashTextView changeThresholdTv = c42076j0M92303a.f92978d;
        Intrinsics.checkNotNullExpressionValue(changeThresholdTv, "changeThresholdTv");
        BaseTextView curThresholdTv = c42076j0M92303a.f92983i;
        Intrinsics.checkNotNullExpressionValue(curThresholdTv, "curThresholdTv");
        m88810h(strategyItemEntity, changeThresholdTv, curThresholdTv);
        DashTextView changeThresholdTv2 = c42076j0M92303a.f92978d;
        Intrinsics.checkNotNullExpressionValue(changeThresholdTv2, "changeThresholdTv");
        C40285b1.m88725H(changeThresholdTv2);
        AppCompatImageView loadingIv = c42076j0M92303a.f92991q;
        Intrinsics.checkNotNullExpressionValue(loadingIv, "loadingIv");
        C40292f.m88783r(loadingIv);
        c42076j0M92303a.f92991q.setVisibility(8);
        c42076j0M92303a.f92974H.setText(context.getString(R$string.kc_tb_terminate_title));
        c42076j0M92303a.f92974H.setEnabled(!Intrinsics.areEqual(strategyItemEntity.getStatus(), "STOPPING"));
        KcSecondaryButton terminalTv = c42076j0M92303a.f92974H;
        Intrinsics.checkNotNullExpressionValue(terminalTv, "terminalTv");
        C40285b1.m88725H(terminalTv);
        c42076j0M92303a.f92970D.setTextColor(context.getColor(R$color.c_text));
        KcSecondaryButton detailTv = c42076j0M92303a.f92984j;
        Intrinsics.checkNotNullExpressionValue(detailTv, "detailTv");
        C40285b1.m88723F(detailTv, C40281a0.m88711n(strategyItemEntity), strategyItemEntity.getStatus(), strategyItemEntity.getType(), strategyItemEntity.getId());
        ConstraintLayout rootCl = c42076j0M92303a.f92969C;
        Intrinsics.checkNotNullExpressionValue(rootCl, "rootCl");
        C40285b1.m88723F(rootCl, C40281a0.m88711n(strategyItemEntity), strategyItemEntity.getStatus(), strategyItemEntity.getType(), strategyItemEntity.getId());
        BaseTextView notTriggerTipsTv = c42076j0M92303a.f92995u;
        Intrinsics.checkNotNullExpressionValue(notTriggerTipsTv, "notTriggerTipsTv");
        C27046k.m66700o(notTriggerTipsTv);
        if (Intrinsics.areEqual(strategyItemEntity.getStatus(), "STOPPING")) {
            BaseTextView baseTextView = c42076j0M92303a.f92970D;
            int i11 = R$string.kc_tb_grid_action_close;
            baseTextView.setText(context.getString(i11));
            c42076j0M92303a.f92991q.setVisibility(0);
            AppCompatImageView loadingIv2 = c42076j0M92303a.f92991q;
            Intrinsics.checkNotNullExpressionValue(loadingIv2, "loadingIv");
            C40292f.m88782q(loadingIv2);
            c42076j0M92303a.f92974H.setText(context.getString(i11));
        } else if (C40292f.m88780o(strategyItemEntity)) {
            c42076j0M92303a.f92970D.setText(context.getString(R$string.kc_tb_grid_status_not_trigger));
            BaseTextView notTriggerTipsTv2 = c42076j0M92303a.f92995u;
            Intrinsics.checkNotNullExpressionValue(notTriggerTipsTv2, "notTriggerTipsTv");
            C27046k.m66685H(notTriggerTipsTv2);
            c42076j0M92303a.f92995u.setText(context.getString(R$string.kc_tb_spot_positions_not_trigger_tips));
            c42076j0M92303a.f92995u.setMovementMethod(LinkMovementMethod.getInstance());
            HighlightTextHelper highlightTextHelper = HighlightTextHelper.f43497a;
            BaseTextView notTriggerTipsTv3 = c42076j0M92303a.f92995u;
            Intrinsics.checkNotNullExpressionValue(notTriggerTipsTv3, "notTriggerTipsTv");
            HighlightTextHelper.TextTagEnum textTagEnum = HighlightTextHelper.TextTagEnum.SPAN;
            highlightTextHelper.m54120f(notTriggerTipsTv3, new Pair(textTagEnum, new UnderlineSpan()), new Pair(textTagEnum, new a(context)));
        } else {
            c42076j0M92303a.f92970D.setText(context.getString(R$string.kc_tb_grid_status_running));
            c42076j0M92303a.f92970D.setTextColor(context.getColor(R$color.brandGreen));
        }
        c42076j0M92303a.f92971E.setText(context.getString(R$string.kc_tb_currency) + ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE + context.getString(R$string.quote_chain_sort_change));
        c42076j0M92303a.f92977c.setText(context.getString(R$string.main_asset) + " (USDT)" + ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE + context.getString(R$string.kc_tb_profit));
        c42076j0M92303a.f92982h.setText(context.getString(R$string.p2pexpress_confrim_new_price) + ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE + context.getString(R$string.kc_tb_grid_enter_price));
        c42076j0M92303a.f92968B.setText(context.getString(R$string.kc_tb_preset) + ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE + context.getString(R$string.kc_tb_actual_percent));
        LinearLayoutCompat couponLl = c42076j0M92303a.f92980f;
        Intrinsics.checkNotNullExpressionValue(couponLl, "couponLl");
        BaseTextView couponDescTv = c42076j0M92303a.f92979e;
        Intrinsics.checkNotNullExpressionValue(couponDescTv, "couponDescTv");
        BaseTextView couponTimeTv = c42076j0M92303a.f92981g;
        Intrinsics.checkNotNullExpressionValue(couponTimeTv, "couponTimeTv");
        C40292f.m88768c(strategyItemEntity, couponLl, couponDescTv, couponTimeTv);
        BaseTextView baseTextView2 = c42076j0M92303a.f92993s;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(context.getString(R$string.kc_tb_grid_total_invest) + " (");
        sb2.append("USDT");
        sb2.append(")");
        baseTextView2.setText(sb2.toString());
        BaseTextView baseTextView3 = c42076j0M92303a.f92994t;
        BigDecimal totalCost = strategyItemEntity.getTotalCost();
        baseTextView3.setText(totalCost != null ? C42180b.m92640e(totalCost, null, C40281a0.m88714q(strategyItemEntity), false, false, false, 0, null, 125, null) : null);
        BaseTextView baseTextView4 = c42076j0M92303a.f92998x;
        StringBuilder sb3 = new StringBuilder();
        sb3.append(context.getString(R$string.kc_tb_grid_total_profit) + " (");
        sb3.append("USDT");
        sb3.append(")");
        baseTextView4.setText(sb3.toString());
        BaseTextView baseTextView5 = c42076j0M92303a.f92999y;
        BigDecimal totalProfit = strategyItemEntity.getTotalProfit();
        baseTextView5.setText(C42180b.m92647l(totalProfit != null ? C42180b.m92640e(totalProfit, null, C40281a0.m88714q(strategyItemEntity), false, false, false, 0, null, 125, null) : null));
        BaseTextView baseTextView6 = c42076j0M92303a.f92999y;
        Intrinsics.checkNotNull(context);
        BigDecimal totalProfit2 = strategyItemEntity.getTotalProfit();
        if (totalProfit2 == null) {
            totalProfit2 = BigDecimal.ZERO;
        }
        Intrinsics.checkNotNull(totalProfit2);
        baseTextView6.setTextColor(C22890g.m54282g(context, totalProfit2, 0, 2, null));
        BaseTextView baseTextView7 = c42076j0M92303a.f92997w;
        BigDecimal totalProfitRate = strategyItemEntity.getTotalProfitRate();
        baseTextView7.setText(C42180b.m92649n(totalProfitRate != null ? C42180b.m92642g(totalProfitRate, null, null, 0, true, false, false, 55, null) : null));
        BaseTextView baseTextView8 = c42076j0M92303a.f92997w;
        BigDecimal totalProfitRate2 = strategyItemEntity.getTotalProfitRate();
        if (totalProfitRate2 == null) {
            totalProfitRate2 = BigDecimal.ZERO;
        }
        Intrinsics.checkNotNull(totalProfitRate2);
        baseTextView8.setTextColor(C22890g.m54282g(context, totalProfitRate2, 0, 2, null));
        m88807e(strategyItemEntity, c42076j0M92303a, context);
        BaseTextView baseTextView9 = c42076j0M92303a.f92988n;
        List<CurrencyInfo> currencyInfo = strategyItemEntity.getCurrencyInfo();
        baseTextView9.setVisibility((currencyInfo != null ? currencyInfo.size() : 0) > 2 ? 0 : 8);
        BaseTextView expandTagTv = c42076j0M92303a.f92988n;
        Intrinsics.checkNotNullExpressionValue(expandTagTv, "expandTagTv");
        C27046k.m66711z(expandTagTv, 0L, new Function0() { // from class: j50.i0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C40303k0.m88809g(strategyItemEntity, c42076j0M92303a, context);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: d */
    public static final Unit m88806d(LayoutInflater layoutInflater, CurrencyInfo currencyInfo, StrategyItemEntity strategyItemEntity, LinearLayoutCompat linearLayoutCompat) {
        String strM92642g;
        String strM92640e;
        String strM92640e2;
        String strM92640e3;
        String strM92640e4;
        String strM92642g2;
        BigDecimal percent;
        C42078k0 c42078k0M92308c = C42078k0.m92308c(layoutInflater);
        Intrinsics.checkNotNullExpressionValue(c42078k0M92308c, "inflate(...)");
        c42078k0M92308c.f93021i.setText(currencyInfo.getCurrency());
        BaseTextView baseTextView = c42078k0M92308c.f93020h;
        BigDecimal changeRate = currencyInfo.getChangeRate();
        String strM92642g3 = null;
        if (changeRate != null) {
            strM92642g = C42180b.m92642g(changeRate, null, null, 0, false, false, false, 63, null);
        } else {
            strM92642g = null;
        }
        baseTextView.setText(C42180b.m92649n(strM92642g));
        BaseTextView baseTextView2 = c42078k0M92308c.f93015c;
        BigDecimal bigDecimalM88811i = m88811i(currencyInfo);
        if (bigDecimalM88811i != null) {
            strM92640e = C42180b.m92640e(bigDecimalM88811i, null, C40281a0.m88714q(strategyItemEntity), false, false, false, 0, null, 125, null);
        } else {
            strM92640e = null;
        }
        baseTextView2.setText(C42180b.m92647l(strM92640e));
        BaseTextView baseTextView3 = c42078k0M92308c.f93018f;
        BigDecimal currencyProfit = currencyInfo.getCurrencyProfit();
        if (currencyProfit != null) {
            strM92640e2 = C42180b.m92640e(currencyProfit, null, C40281a0.m88714q(strategyItemEntity), false, false, false, 0, null, 125, null);
        } else {
            strM92640e2 = null;
        }
        baseTextView3.setText(C42180b.m92647l(strM92640e2));
        BaseTextView baseTextView4 = c42078k0M92308c.f93017e;
        BigDecimal price = currencyInfo.getPrice();
        if (price != null) {
            strM92640e3 = C42180b.m92640e(price, null, C40281a0.m88713p(strategyItemEntity), false, false, false, 0, null, 125, null);
        } else {
            strM92640e3 = null;
        }
        baseTextView4.setText(C42180b.m92647l(strM92640e3));
        BaseTextView baseTextView5 = c42078k0M92308c.f93016d;
        BigDecimal avgPrice = currencyInfo.getAvgPrice();
        if (avgPrice != null) {
            strM92640e4 = C42180b.m92640e(avgPrice, null, C40281a0.m88713p(strategyItemEntity), false, false, false, 0, null, 125, null);
        } else {
            strM92640e4 = null;
        }
        baseTextView5.setText(C42180b.m92647l(strM92640e4));
        BaseTextView baseTextView6 = c42078k0M92308c.f93019g;
        Target target = currencyInfo.getTarget();
        if (target != null && (percent = target.getPercent()) != null) {
            strM92642g2 = C42180b.m92642g(percent, null, null, 0, false, false, false, 63, null);
        } else {
            strM92642g2 = null;
        }
        baseTextView6.setText(C42180b.m92649n(strM92642g2));
        BaseTextView baseTextView7 = c42078k0M92308c.f93014b;
        BigDecimal percent2 = currencyInfo.getPercent();
        if (percent2 != null) {
            strM92642g3 = C42180b.m92642g(percent2, null, null, 0, false, false, false, 63, null);
        }
        baseTextView7.setText(C42180b.m92649n(strM92642g3));
        linearLayoutCompat.addView(c42078k0M92308c.getRoot());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: e */
    public static final void m88807e(StrategyItemEntity strategyItemEntity, C42076j0 c42076j0, Context context) {
        List<CurrencyInfo> listTake;
        List<CurrencyInfo> listTake2;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        c42076j0.f92967A.removeAllViews();
        if (strategyItemEntity.isExpand()) {
            c42076j0.f92988n.setText(context.getString(R$string.kumex_tpsl_position_show_less));
            List<CurrencyInfo> currencyInfo = strategyItemEntity.getCurrencyInfo();
            if (currencyInfo != null && (listTake2 = CollectionsKt.take(currencyInfo, 6)) != null) {
                for (CurrencyInfo currencyInfo2 : listTake2) {
                    Intrinsics.checkNotNull(layoutInflaterFrom);
                    LinearLayoutCompat positionsLl = c42076j0.f92967A;
                    Intrinsics.checkNotNullExpressionValue(positionsLl, "positionsLl");
                    m88805c(strategyItemEntity, layoutInflaterFrom, positionsLl, currencyInfo2);
                }
                return;
            }
            return;
        }
        c42076j0.f92988n.setText(context.getString(R$string.kumex_tpsl_position_show_more));
        List<CurrencyInfo> currencyInfo3 = strategyItemEntity.getCurrencyInfo();
        if (currencyInfo3 != null && (listTake = CollectionsKt.take(currencyInfo3, 2)) != null) {
            for (CurrencyInfo currencyInfo4 : listTake) {
                Intrinsics.checkNotNull(layoutInflaterFrom);
                LinearLayoutCompat positionsLl2 = c42076j0.f92967A;
                Intrinsics.checkNotNullExpressionValue(positionsLl2, "positionsLl");
                m88805c(strategyItemEntity, layoutInflaterFrom, positionsLl2, currencyInfo4);
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public static final Unit m88809g(StrategyItemEntity strategyItemEntity, C42076j0 c42076j0, Context context) {
        strategyItemEntity.setExpand(!strategyItemEntity.isExpand());
        Intrinsics.checkNotNull(context);
        m88807e(strategyItemEntity, c42076j0, context);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: h */
    public static final void m88810h(StrategyItemEntity strategyItemEntity, TextView textView, TextView textView2) {
        boolean zAreEqual;
        Double threshold;
        Context context = textView.getContext();
        Method method = strategyItemEntity.getMethod();
        if (method != null) {
            zAreEqual = Intrinsics.areEqual(method.getAutoChange(), Boolean.FALSE);
        } else {
            zAreEqual = false;
        }
        if (zAreEqual) {
            textView.setText(context.getString(R$string.kc_tb_grid_spot_position_auto_change_closed));
            textView.setCompoundDrawablesRelative(null, null, null, null);
            C27046k.m66700o(textView2);
            return;
        }
        Method method2 = strategyItemEntity.getMethod();
        if (method2 != null) {
            threshold = method2.getThreshold();
        } else {
            threshold = null;
        }
        if (threshold != null) {
            Drawable drawable = ContextCompat.getDrawable(context, R$drawable.ic2_kline5_12);
            if (drawable != null) {
                drawable.setTint(ContextCompat.getColor(context, R$color.c_text40));
            }
            if (drawable != null) {
                drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
            }
            textView.setCompoundDrawablesRelative(null, null, drawable, null);
            textView.setText(context.getString(R$string.kc_tb_grid_spot_position_auto_change, C42180b.m92649n(C42180b.m92642g(new BigDecimal(String.valueOf(strategyItemEntity.getMethod().getThreshold().doubleValue())), null, null, 0, false, false, false, 31, null))));
            if (strategyItemEntity.getCurrentThreshold() == null) {
                C27046k.m66700o(textView2);
                return;
            }
            C27046k.m66685H(textView2);
            textView2.setText(context.getString(R$string.kc_tb_grid_spot_position_cur_threshold, ' ' + C42180b.m92649n(C42180b.m92642g(new BigDecimal(String.valueOf(strategyItemEntity.getCurrentThreshold().doubleValue())), null, null, 0, false, false, false, 63, null))));
            return;
        }
        if (strategyItemEntity.getInterval() != null) {
            int i11 = R$string.kc_tb_grid_spot_position_auto_change_countdown;
            Intrinsics.checkNotNull(context);
            textView.setText(context.getString(i11, C40320t.m88831d(strategyItemEntity, context)));
            textView.setCompoundDrawablesRelative(null, null, null, null);
            C27046k.m66700o(textView2);
            return;
        }
        C27046k.m66700o(textView);
        C27046k.m66700o(textView2);
    }

    /* JADX INFO: renamed from: i */
    public static final BigDecimal m88811i(CurrencyInfo currencyInfo) {
        BigDecimal balance = currencyInfo.getBalance();
        if (balance != null) {
            BigDecimal price = currencyInfo.getPrice();
            if (price == null) {
                price = BigDecimal.ZERO;
            }
            return balance.multiply(price);
        }
        return null;
    }
}
