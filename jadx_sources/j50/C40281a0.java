package j50;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.ViewKt;
import com.kubi.data.entity.SymbolInfoEntity;
import com.kubi.resources.C22890g;
import com.kubi.resources.HighlightTextHelper;
import com.kubi.resources.dialog.AlertDialogFragmentHelper;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.DashTextView;
import com.kubi.resources.widget.button.KcSecondaryButton;
import com.kubi.sdk.function.language.MultiLanguageManager;
import com.kubi.tradingbotkit.R$color;
import com.kubi.tradingbotkit.R$drawable;
import com.kubi.tradingbotkit.R$string;
import com.kubi.tradingbotkit.business.strategyList.entity.StrategyItemEntity;
import com.kubi.utils.C27017c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27040e;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import f00.C37304a;
import g00.InterfaceC37766r;
import gf.C37890n;
import io.chad.library.adapter.base.BaseViewHolder;
import java.math.BigDecimal;
import k50.C40911a;
import k50.C40917g;
import l50.C42068f0;
import o50.C42976j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p402kf.C41014a;
import p429lf.C42180b;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: j50.a0 */
/* JADX INFO: compiled from: SpotGridBinder.kt */
/* JADX INFO: loaded from: classes51.dex */
@Metadata(m90083d1 = {"\u0000H\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u001c\u0010\u0005\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0002\u001a \u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000eH\u0002\u001a\"\u0010\u000f\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\t\u001a\u001c\u0010\u0013\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0002\u001a\n\u0010\u0014\u001a\u00020\u0015*\u00020\u0002\u001a\n\u0010\u0016\u001a\u00020\u0015*\u00020\u0002\u001a\n\u0010\u0017\u001a\u00020\u0018*\u00020\u0002\u001a\n\u0010\u0019\u001a\u00020\u0018*\u00020\u0002\u001a\f\u0010\u001a\u001a\u0004\u0018\u00010\u0018*\u00020\u0002¨\u0006\u001b"}, m90084d2 = {"bindSpotGrid", "", "Lcom/kubi/tradingbotkit/business/strategyList/entity/StrategyItemEntity;", "helper", "Lio/chad/library/adapter/base/BaseViewHolder;", "bindOther", "viewBinding", "Lcom/kubi/tradingbotkit/databinding/BtradingBotKitStrategyItemSpotBinding;", "ctx", "Landroid/content/Context;", "showProfitReInvestDialog", "childFragmentManager", "Landroidx/fragment/app/FragmentManager;", "canReInvest", "", "switchYearProfitRate", "aarTitleTv", "Landroid/widget/TextView;", "aarValueTv", "bindNotTrigger", "getSpotPricePrecision", "", "getSpotQuotePrecision", "getQuoteCurrencyName", "", "getSpotBaseCurrencyName", "getRealSymbol", "TradingBotKitLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C40281a0 {

    /* JADX INFO: renamed from: j50.a0$a */
    /* JADX INFO: compiled from: SpotGridBinder.kt */
    @Metadata(m90083d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, m90084d2 = {"com/kubi/tradingbotkit/business/strategyList/view/SpotGridBinderKt$bindSpotGrid$1", "Landroid/text/style/ClickableSpan;", "onClick", "", "widget", "Landroid/view/View;", "updateDrawState", "ds", "Landroid/text/TextPaint;", "TradingBotKitLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class a extends ClickableSpan {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Context f89518b;

        public a(Context context) {
            this.f89518b = context;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View widget) {
            Intrinsics.checkNotNullParameter(widget, "widget");
            C40911a.m89599c("/tabpage/running", null, false, 6, null);
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint ds2) {
            Intrinsics.checkNotNullParameter(ds2, "ds");
            ds2.setColor(ContextCompat.getColor(this.f89518b, R$color.c_text));
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m88703f(StrategyItemEntity strategyItemEntity, C42068f0 c42068f0, Context context) {
        LinearLayoutCompat ll2 = c42068f0.f92690A;
        Intrinsics.checkNotNullExpressionValue(ll2, "ll2");
        C27046k.m66700o(ll2);
        BaseTextView baseTextView = c42068f0.f92700K;
        StringBuilder sb2 = new StringBuilder();
        BigDecimal down = strategyItemEntity.getDown();
        sb2.append(C42180b.m92647l(down != null ? C42180b.m92640e(down, null, m88713p(strategyItemEntity), false, false, false, 0, null, 125, null) : null));
        sb2.append(" - ");
        BigDecimal up2 = strategyItemEntity.getUp();
        sb2.append(C42180b.m92647l(up2 != null ? C42180b.m92640e(up2, null, m88713p(strategyItemEntity), false, false, false, 0, null, 125, null) : null));
        baseTextView.setText(sb2.toString());
        BaseTextView baseTextView2 = c42068f0.f92734y;
        BigDecimal price = strategyItemEntity.getPrice();
        baseTextView2.setText(C42180b.m92647l(price != null ? C42180b.m92640e(price, null, m88713p(strategyItemEntity), false, false, false, 0, null, 125, null) : null));
        c42068f0.f92715f.setText(context.getString(R$string.trigger_price_tips));
        BaseTextView baseTextView3 = c42068f0.f92716g;
        BigDecimal openUnitPrice = strategyItemEntity.getOpenUnitPrice();
        baseTextView3.setText(C42180b.m92647l(openUnitPrice != null ? C42180b.m92640e(openUnitPrice, null, m88713p(strategyItemEntity), false, false, false, 0, null, 125, null) : null));
    }

    /* JADX INFO: renamed from: g */
    public static final void m88704g(final StrategyItemEntity strategyItemEntity, final C42068f0 c42068f0, final Context context) {
        LinearLayoutCompat ll2 = c42068f0.f92690A;
        Intrinsics.checkNotNullExpressionValue(ll2, "ll2");
        C27046k.m66685H(ll2);
        BaseTextView aarTitleTv = c42068f0.f92712c;
        Intrinsics.checkNotNullExpressionValue(aarTitleTv, "aarTitleTv");
        C27046k.m66711z(aarTitleTv, 0L, new Function0() { // from class: j50.v
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C40281a0.m88705h(strategyItemEntity, c42068f0, context);
            }
        }, 1, null);
        BaseTextView aarTitleTv2 = c42068f0.f92712c;
        Intrinsics.checkNotNullExpressionValue(aarTitleTv2, "aarTitleTv");
        BaseTextView aarValueTv = c42068f0.f92713d;
        Intrinsics.checkNotNullExpressionValue(aarValueTv, "aarValueTv");
        m88717t(strategyItemEntity, aarTitleTv2, aarValueTv, context);
        DashTextView unPnlTitleTv = c42068f0.f92708S;
        Intrinsics.checkNotNullExpressionValue(unPnlTitleTv, "unPnlTitleTv");
        C27046k.m66711z(unPnlTitleTv, 0L, new Function0() { // from class: j50.w
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C40281a0.m88706i(c42068f0, context);
            }
        }, 1, null);
        BaseTextView baseTextView = c42068f0.f92709T;
        BigDecimal floatingAmount = strategyItemEntity.getFloatingAmount();
        baseTextView.setText(C42180b.m92647l(floatingAmount != null ? C42180b.m92640e(floatingAmount, null, m88714q(strategyItemEntity), false, false, false, 0, null, 125, null) : null));
        BaseTextView baseTextView2 = c42068f0.f92709T;
        BigDecimal floatingAmount2 = strategyItemEntity.getFloatingAmount();
        if (floatingAmount2 == null) {
            floatingAmount2 = BigDecimal.ZERO;
        }
        Intrinsics.checkNotNull(floatingAmount2);
        baseTextView2.setTextColor(C22890g.m54282g(context, floatingAmount2, 0, 2, null));
        DashTextView gridProfitTitleTv = c42068f0.f92726q;
        Intrinsics.checkNotNullExpressionValue(gridProfitTitleTv, "gridProfitTitleTv");
        C40285b1.m88754w(gridProfitTitleTv);
        BigDecimal strategyProfit = strategyItemEntity.getStrategyProfit();
        if (strategyProfit == null) {
            strategyProfit = BigDecimal.ZERO;
        }
        Intrinsics.checkNotNull(strategyProfit);
        int iM54282g = C22890g.m54282g(context, strategyProfit, 0, 2, null);
        BaseTextView baseTextView3 = c42068f0.f92727r;
        BigDecimal strategyProfit2 = strategyItemEntity.getStrategyProfit();
        baseTextView3.setText(C42180b.m92647l(strategyProfit2 != null ? C42180b.m92640e(strategyProfit2, null, m88714q(strategyItemEntity), false, false, false, 0, null, 125, null) : null));
        c42068f0.f92727r.setTextColor(iM54282g);
        Boolean canReInvestment = strategyItemEntity.getCanReInvestment();
        if (canReInvestment != null ? canReInvestment.booleanValue() : false) {
            Drawable drawableM66518h = C27017c.f54310a.m66518h(R$drawable.ic2_changemode_16, Integer.valueOf(iM54282g));
            drawableM66518h.setBounds(0, 0, C27040e.m66658b(16), C27040e.m66658b(16));
            c42068f0.f92727r.setCompoundDrawablesRelative(null, null, drawableM66518h, null);
        } else {
            c42068f0.f92727r.setCompoundDrawablesRelative(null, null, null, null);
        }
        BaseTextView gridProfitValueTv = c42068f0.f92727r;
        Intrinsics.checkNotNullExpressionValue(gridProfitValueTv, "gridProfitValueTv");
        C27046k.m66711z(gridProfitValueTv, 0L, new Function0() { // from class: j50.x
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C40281a0.m88708k(c42068f0, strategyItemEntity);
            }
        }, 1, null);
        BaseTextView baseTextView4 = c42068f0.f92700K;
        StringBuilder sb2 = new StringBuilder();
        BigDecimal down = strategyItemEntity.getDown();
        sb2.append(C42180b.m92647l(down != null ? C42180b.m92640e(down, null, m88713p(strategyItemEntity), false, false, false, 0, null, 125, null) : null));
        sb2.append(" - ");
        BigDecimal up2 = strategyItemEntity.getUp();
        sb2.append(C42180b.m92647l(up2 != null ? C42180b.m92640e(up2, null, m88713p(strategyItemEntity), false, false, false, 0, null, 125, null) : null));
        baseTextView4.setText(sb2.toString());
        BaseTextView baseTextView5 = c42068f0.f92734y;
        BigDecimal price = strategyItemEntity.getPrice();
        baseTextView5.setText(C42180b.m92647l(price != null ? C42180b.m92640e(price, null, m88713p(strategyItemEntity), false, false, false, 0, null, 125, null) : null));
        c42068f0.f92715f.setText(context.getString(R$string.kc_tb_grid_arbitrage_count_24h));
        BaseTextView baseTextView6 = c42068f0.f92716g;
        StringBuilder sb3 = new StringBuilder();
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(C27039d.m66650j(strategyItemEntity.getDayArbitrageNum()));
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
        sb3.append(C42180b.m92647l(C42180b.m92640e(bigDecimalValueOf, null, 0, false, false, false, 0, null, 127, null)));
        sb3.append("/");
        BigDecimal bigDecimalValueOf2 = BigDecimal.valueOf(C27039d.m66650j(strategyItemEntity.getTotalArbitrageNum()));
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf2, "valueOf(...)");
        sb3.append(C42180b.m92647l(C42180b.m92640e(bigDecimalValueOf2, null, 0, false, false, false, 0, null, 127, null)));
        baseTextView6.setText(sb3.toString());
        BaseTextView arbitrageCountValueTv = c42068f0.f92716g;
        Intrinsics.checkNotNullExpressionValue(arbitrageCountValueTv, "arbitrageCountValueTv");
        C40285b1.m88725H(arbitrageCountValueTv);
    }

    /* JADX INFO: renamed from: i */
    public static final Unit m88706i(C42068f0 c42068f0, Context context) {
        DashTextView unPnlTitleTv = c42068f0.f92708S;
        Intrinsics.checkNotNullExpressionValue(unPnlTitleTv, "unPnlTitleTv");
        FragmentManager childFragmentManager = ViewKt.findFragment(unPnlTitleTv).getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54168Y4(c42068f0.f92708S.getContext().getString(R$string.kc_tb_grid_float_amount)).m54156M4(context.getString(R$string.kc_tb_grid_alert_float_pnl)).m54159P4(R$string.i_already_know, null).m54161R4(0).m54162S4(R$string.passkey_list_more, new DialogInterface.OnClickListener() { // from class: j50.y
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                C40281a0.m88707j(dialogInterface, i11);
            }
        }).show(childFragmentManager, "FloatingAmount");
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: k */
    public static final Unit m88708k(C42068f0 c42068f0, StrategyItemEntity strategyItemEntity) {
        DashTextView gridProfitTitleTv = c42068f0.f92726q;
        Intrinsics.checkNotNullExpressionValue(gridProfitTitleTv, "gridProfitTitleTv");
        FragmentManager childFragmentManager = ViewKt.findFragment(gridProfitTitleTv).getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        Context context = c42068f0.f92726q.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Boolean canReInvestment = strategyItemEntity.getCanReInvestment();
        m88715r(childFragmentManager, context, canReInvestment != null ? canReInvestment.booleanValue() : false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: l */
    public static final void m88709l(@NotNull StrategyItemEntity strategyItemEntity, @NotNull BaseViewHolder helper) {
        Intrinsics.checkNotNullParameter(strategyItemEntity, "<this>");
        Intrinsics.checkNotNullParameter(helper, "helper");
        C42068f0 c42068f0M92287a = C42068f0.m92287a(helper.itemView);
        Intrinsics.checkNotNullExpressionValue(c42068f0M92287a, "bind(...)");
        Context context = helper.itemView.getContext();
        BaseTextView baseTextView = c42068f0M92287a.f92704O;
        SymbolInfoEntity symbolInfoEntityM85601B = C37890n.f85269a.m85601B(C27041f.m66668h(m88711n(strategyItemEntity)));
        baseTextView.setText(C27041f.m66668h(symbolInfoEntityM85601B != null ? symbolInfoEntityM85601B.getShowSymbol() : null));
        c42068f0M92287a.f92703N.setText(context.getString(R$string.kc_tb_spot_grid));
        c42068f0M92287a.f92724o.setText(C42976j.m94383b(C27039d.m66652l(strategyItemEntity.getStartTimeDifference())));
        BaseTextView outRangeTipsTv = c42068f0M92287a.f92693D;
        Intrinsics.checkNotNullExpressionValue(outRangeTipsTv, "outRangeTipsTv");
        C27046k.m66700o(outRangeTipsTv);
        AppCompatImageView loadingIv = c42068f0M92287a.f92692C;
        Intrinsics.checkNotNullExpressionValue(loadingIv, "loadingIv");
        C40292f.m88783r(loadingIv);
        c42068f0M92287a.f92692C.setVisibility(8);
        c42068f0M92287a.f92706Q.setText(context.getString(R$string.kc_tb_terminate_title));
        c42068f0M92287a.f92706Q.setEnabled(!Intrinsics.areEqual(strategyItemEntity.getStatus(), "STOPPING"));
        KcSecondaryButton terminalTv = c42068f0M92287a.f92706Q;
        Intrinsics.checkNotNullExpressionValue(terminalTv, "terminalTv");
        C40285b1.m88725H(terminalTv);
        c42068f0M92287a.f92702M.setTextColor(context.getColor(R$color.c_text));
        KcSecondaryButton detailTv = c42068f0M92287a.f92721l;
        Intrinsics.checkNotNullExpressionValue(detailTv, "detailTv");
        C40285b1.m88723F(detailTv, m88711n(strategyItemEntity), strategyItemEntity.getStatus(), strategyItemEntity.getType(), strategyItemEntity.getId());
        ConstraintLayout rootCl = c42068f0M92287a.f92701L;
        Intrinsics.checkNotNullExpressionValue(rootCl, "rootCl");
        C40285b1.m88723F(rootCl, m88711n(strategyItemEntity), strategyItemEntity.getStatus(), strategyItemEntity.getType(), strategyItemEntity.getId());
        if (Intrinsics.areEqual(strategyItemEntity.getStatus(), "STOPPING")) {
            BaseTextView baseTextView2 = c42068f0M92287a.f92702M;
            int i11 = R$string.kc_tb_grid_action_close;
            baseTextView2.setText(context.getString(i11));
            c42068f0M92287a.f92692C.setVisibility(0);
            AppCompatImageView loadingIv2 = c42068f0M92287a.f92692C;
            Intrinsics.checkNotNullExpressionValue(loadingIv2, "loadingIv");
            C40292f.m88782q(loadingIv2);
            c42068f0M92287a.f92706Q.setText(context.getString(i11));
        } else if (C40292f.m88781p(strategyItemEntity)) {
            c42068f0M92287a.f92702M.setText(context.getString(R$string.kc_tb_grid_status_out_range));
            BaseTextView outRangeTipsTv2 = c42068f0M92287a.f92693D;
            Intrinsics.checkNotNullExpressionValue(outRangeTipsTv2, "outRangeTipsTv");
            C27046k.m66685H(outRangeTipsTv2);
            if (C41014a.m89922G(strategyItemEntity.getPrice(), null, 1, null).compareTo(C41014a.m89922G(strategyItemEntity.getDown(), null, 1, null)) < 0) {
                c42068f0M92287a.f92693D.setText(context.getString(R$string.kc_tb_grid_status_range_low_deal_tips));
            } else if (C41014a.m89922G(strategyItemEntity.getPrice(), null, 1, null).compareTo(C41014a.m89922G(strategyItemEntity.getUp(), null, 1, null)) > 0) {
                c42068f0M92287a.f92693D.setText(context.getString(R$string.kc_tb_grid_status_range_high_deal_tips));
            }
            c42068f0M92287a.f92693D.setMovementMethod(LinkMovementMethod.getInstance());
            HighlightTextHelper highlightTextHelper = HighlightTextHelper.f43497a;
            BaseTextView outRangeTipsTv3 = c42068f0M92287a.f92693D;
            Intrinsics.checkNotNullExpressionValue(outRangeTipsTv3, "outRangeTipsTv");
            HighlightTextHelper.TextTagEnum textTagEnum = HighlightTextHelper.TextTagEnum.SPAN;
            highlightTextHelper.m54120f(outRangeTipsTv3, new Pair(textTagEnum, new UnderlineSpan()), new Pair(textTagEnum, new a(context)));
        } else if (C40292f.m88780o(strategyItemEntity)) {
            c42068f0M92287a.f92702M.setText(context.getString(R$string.kc_tb_grid_status_not_trigger));
        } else {
            c42068f0M92287a.f92702M.setText(context.getString(R$string.kc_tb_grid_status_running));
            c42068f0M92287a.f92702M.setTextColor(context.getColor(R$color.brandGreen));
        }
        LinearLayoutCompat couponLl = c42068f0M92287a.f92719j;
        Intrinsics.checkNotNullExpressionValue(couponLl, "couponLl");
        BaseTextView couponDescTv = c42068f0M92287a.f92718i;
        Intrinsics.checkNotNullExpressionValue(couponDescTv, "couponDescTv");
        BaseTextView couponTimeTv = c42068f0M92287a.f92720k;
        Intrinsics.checkNotNullExpressionValue(couponTimeTv, "couponTimeTv");
        C40292f.m88768c(strategyItemEntity, couponLl, couponDescTv, couponTimeTv);
        BaseTextView baseTextView3 = c42068f0M92287a.f92729t;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(context.getString(R$string.kc_tb_grid_total_invest) + " (");
        sb2.append(m88710m(strategyItemEntity));
        sb2.append(")");
        baseTextView3.setText(sb2.toString());
        BaseTextView baseTextView4 = c42068f0M92287a.f92730u;
        BigDecimal totalCost = strategyItemEntity.getTotalCost();
        baseTextView4.setText(totalCost != null ? C42180b.m92640e(totalCost, null, m88714q(strategyItemEntity), false, false, false, 0, null, 125, null) : null);
        BaseTextView baseTextView5 = c42068f0M92287a.f92696G;
        StringBuilder sb3 = new StringBuilder();
        sb3.append(context.getString(R$string.kc_tb_grid_total_profit) + " (");
        sb3.append(m88710m(strategyItemEntity));
        sb3.append(")");
        baseTextView5.setText(sb3.toString());
        BaseTextView baseTextView6 = c42068f0M92287a.f92697H;
        BigDecimal totalProfit = strategyItemEntity.getTotalProfit();
        baseTextView6.setText(C42180b.m92647l(totalProfit != null ? C42180b.m92640e(totalProfit, null, m88714q(strategyItemEntity), false, false, false, 0, null, 125, null) : null));
        BaseTextView baseTextView7 = c42068f0M92287a.f92697H;
        Intrinsics.checkNotNull(context);
        BigDecimal totalProfit2 = strategyItemEntity.getTotalProfit();
        if (totalProfit2 == null) {
            totalProfit2 = BigDecimal.ZERO;
        }
        Intrinsics.checkNotNull(totalProfit2);
        baseTextView7.setTextColor(C22890g.m54282g(context, totalProfit2, 0, 2, null));
        BaseTextView baseTextView8 = c42068f0M92287a.f92695F;
        BigDecimal totalProfitRate = strategyItemEntity.getTotalProfitRate();
        baseTextView8.setText(C42180b.m92649n(totalProfitRate != null ? C42180b.m92642g(totalProfitRate, null, null, 0, true, false, false, 55, null) : null));
        BaseTextView baseTextView9 = c42068f0M92287a.f92695F;
        BigDecimal totalProfitRate2 = strategyItemEntity.getTotalProfitRate();
        if (totalProfitRate2 == null) {
            totalProfitRate2 = BigDecimal.ZERO;
        }
        Intrinsics.checkNotNull(totalProfitRate2);
        baseTextView9.setTextColor(C22890g.m54282g(context, totalProfitRate2, 0, 2, null));
        if (C40292f.m88780o(strategyItemEntity)) {
            m88703f(strategyItemEntity, c42068f0M92287a, context);
        } else {
            m88704g(strategyItemEntity, c42068f0M92287a, context);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public static final String m88710m(@NotNull StrategyItemEntity strategyItemEntity) {
        Intrinsics.checkNotNullParameter(strategyItemEntity, "<this>");
        String strM88711n = m88711n(strategyItemEntity);
        if (strM88711n == null) {
            return "- -";
        }
        SymbolInfoEntity symbolInfoEntityM85601B = C37890n.f85269a.m85601B(strM88711n);
        return C27041f.m66668h(symbolInfoEntityM85601B != null ? symbolInfoEntityM85601B.getQuoteCurrencyName() : null);
    }

    @Nullable
    /* JADX INFO: renamed from: n */
    public static final String m88711n(@NotNull StrategyItemEntity strategyItemEntity) {
        Intrinsics.checkNotNullParameter(strategyItemEntity, "<this>");
        String symbolCode = strategyItemEntity.getSymbolCode();
        return symbolCode == null ? strategyItemEntity.getSymbol() : symbolCode;
    }

    @NotNull
    /* JADX INFO: renamed from: o */
    public static final String m88712o(@NotNull StrategyItemEntity strategyItemEntity) {
        Intrinsics.checkNotNullParameter(strategyItemEntity, "<this>");
        String strM88711n = m88711n(strategyItemEntity);
        if (strM88711n == null) {
            return "- -";
        }
        SymbolInfoEntity symbolInfoEntityM85601B = C37890n.f85269a.m85601B(strM88711n);
        return C27041f.m66668h(symbolInfoEntityM85601B != null ? symbolInfoEntityM85601B.getBaseCurrencyName() : null);
    }

    /* JADX INFO: renamed from: p */
    public static final int m88713p(@NotNull StrategyItemEntity strategyItemEntity) {
        Intrinsics.checkNotNullParameter(strategyItemEntity, "<this>");
        SymbolInfoEntity symbolInfoEntityM85601B = C37890n.f85269a.m85601B(C27041f.m66668h(m88711n(strategyItemEntity)));
        if (symbolInfoEntityM85601B != null) {
            return symbolInfoEntityM85601B.getPriceIncrementPrecision();
        }
        return 8;
    }

    /* JADX INFO: renamed from: q */
    public static final int m88714q(@NotNull StrategyItemEntity strategyItemEntity) {
        Intrinsics.checkNotNullParameter(strategyItemEntity, "<this>");
        SymbolInfoEntity symbolInfoEntityM85601B = C37890n.f85269a.m85601B(C27041f.m66668h(m88711n(strategyItemEntity)));
        if (symbolInfoEntityM85601B != null) {
            return symbolInfoEntityM85601B.getQuoteIncrementPrecision();
        }
        return 8;
    }

    /* JADX INFO: renamed from: r */
    public static final void m88715r(FragmentManager fragmentManager, Context context, boolean z11) {
        String string = context.getString(z11 ? R$string.kc_tb_grid_spot_profit_reinvest_title : R$string.kc_tb_grid_income);
        Intrinsics.checkNotNull(string);
        String string2 = context.getString(z11 ? R$string.kc_tb_grid_spot_profit_reinvest_tips : R$string.kc_tb_grid_alert_profit_tip);
        Intrinsics.checkNotNull(string2);
        AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54168Y4(string).m54156M4(string2).m54162S4(R$string.i_already_know, new DialogInterface.OnClickListener() { // from class: j50.z
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                C40281a0.m88716s(dialogInterface, i11);
            }
        }).show(fragmentManager, "GridProfit");
    }

    /* JADX INFO: renamed from: t */
    public static final void m88717t(@NotNull StrategyItemEntity strategyItemEntity, @NotNull TextView aarTitleTv, @NotNull TextView aarValueTv, @NotNull Context ctx) {
        Intrinsics.checkNotNullParameter(strategyItemEntity, "<this>");
        Intrinsics.checkNotNullParameter(aarTitleTv, "aarTitleTv");
        Intrinsics.checkNotNullParameter(aarValueTv, "aarValueTv");
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        BigDecimal yearProfitRate = strategyItemEntity.isShowYearProfitRate() ? strategyItemEntity.getYearProfitRate() : strategyItemEntity.getStrategyProfitYearRate();
        aarTitleTv.setText(strategyItemEntity.isShowYearProfitRate() ? ctx.getString(R$string.HoldingPage_Bot_SpotMartingale_APY) : ctx.getString(R$string.kc_futures_new_gridyear));
        aarValueTv.setText(C42180b.m92649n(yearProfitRate != null ? C42180b.m92642g(yearProfitRate, null, null, 0, false, false, false, 63, null) : null));
        if (yearProfitRate == null) {
            yearProfitRate = BigDecimal.ZERO;
        }
        Intrinsics.checkNotNull(yearProfitRate);
        aarValueTv.setTextColor(C22890g.m54282g(ctx, yearProfitRate, 0, 2, null));
    }

    /* JADX INFO: renamed from: h */
    public static final Unit m88705h(StrategyItemEntity strategyItemEntity, C42068f0 c42068f0, Context context) {
        strategyItemEntity.setShowYearProfitRate(!strategyItemEntity.isShowYearProfitRate());
        BaseTextView aarTitleTv = c42068f0.f92712c;
        Intrinsics.checkNotNullExpressionValue(aarTitleTv, "aarTitleTv");
        BaseTextView aarValueTv = c42068f0.f92713d;
        Intrinsics.checkNotNullExpressionValue(aarValueTv, "aarValueTv");
        m88717t(strategyItemEntity, aarTitleTv, aarValueTv, context);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: j */
    public static final void m88707j(DialogInterface dialogInterface, int i11) {
        if (MultiLanguageManager.m56979h()) {
            InterfaceC37766r.a.m85190a(C37304a.f82764a, C40917g.m89611l(), null, null, null, null, null, null, 126, null);
        } else {
            InterfaceC37766r.a.m85190a(C37304a.f82764a, C40917g.m89610k(), null, null, null, null, null, null, 126, null);
        }
    }

    /* JADX INFO: renamed from: s */
    public static final void m88716s(DialogInterface dialogInterface, int i11) {
    }
}
