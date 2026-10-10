package p401kd;

import android.content.Context;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.core.content.res.ResourcesCompat;
import com.blankj.utilcode.util.C5275i0;
import com.kubi.core.base.order.data.TradeSide;
import com.kubi.core.base.utils.C11677d;
import com.kubi.core.spot.helper.TradeManagerProxy;
import com.kubi.kucoin.utils.DayNightThemeManager;
import com.kubi.margin.api.IMarginService;
import com.kubi.resources.C22890g;
import com.kubi.spot.api.ISpotService;
import com.kubi.tradecorebiz.R$color;
import com.kubi.tradecorebiz.R$drawable;
import com.kubi.tradecorebiz.R$id;
import com.kubi.tradecorebiz.R$string;
import com.kubi.utils.C27017c;
import com.kubi.utils.C27096v0;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import io.chad.library.adapter.base.BaseViewHolder;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p429lf.C42179a;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: kd.i */
/* JADX INFO: compiled from: BottomOrderItemDataFilledExt.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000B\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001aL\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00010\rH\u0000\u001aL\u0010\u000f\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00102\b\b\u0002\u0010\u000b\u001a\u00020\b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00010\rH\u0000\u001aL\u0010\u0011\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00122\b\b\u0002\u0010\u000b\u001a\u00020\b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00010\rH\u0000\u001aL\u0010\u0013\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00142\b\b\u0002\u0010\u000b\u001a\u00020\b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00010\rH\u0000¨\u0006\u0015"}, m90084d2 = {"fillMarketDataToItemView", "", "Lio/chad/library/adapter/base/BaseViewHolder;", "context", "Landroid/content/Context;", "currentSymbol", "", "needJumpGuideIcon", "", "data", "Lcom/kubi/core/biz/bottomtab/order/child/item/OrderItemData$Market;", "isMargin", "cancelOrder", "Lkotlin/Function1;", "Lcom/kubi/core/biz/bottomtab/order/child/item/OrderItemData;", "fillConditionLimitDataToItemView", "Lcom/kubi/core/biz/bottomtab/order/child/item/OrderItemData$ConditionalLimit;", "fillConditionMarketDataToItemView", "Lcom/kubi/core/biz/bottomtab/order/child/item/OrderItemData$ConditionalMarket;", "fillLimitDataToItemView", "Lcom/kubi/core/biz/bottomtab/order/child/item/OrderItemData$Limit;", "TradeCoreBizLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C41005i {
    /* JADX INFO: renamed from: i */
    public static final void m89835i(@NotNull BaseViewHolder baseViewHolder, @NotNull Context context, @Nullable String str, boolean z11, @NotNull final InterfaceC41007k.ConditionalLimit data, final boolean z12, @NotNull final Function1<? super InterfaceC41007k, Unit> cancelOrder) {
        Intrinsics.checkNotNullParameter(baseViewHolder, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(cancelOrder, "cancelOrder");
        String strM66516f = C27017c.f54310a.m66516f(R$string.stub, new Object[0]);
        TradeSide side = data.getSide();
        TradeSide.BUY buy = TradeSide.BUY.INSTANCE;
        boolean zAreEqual = Intrinsics.areEqual(side, buy);
        boolean zM33189n = DayNightThemeManager.f28592a.m33189n();
        ((ProgressBar) baseViewHolder.getView(R$id.delegation_progressbar)).setProgressDrawable(ResourcesCompat.getDrawable(context.getResources(), (!(zM33189n && zAreEqual) && (zM33189n || zAreEqual)) ? R$drawable.shape_delegation_progressbar_red : R$drawable.shape_delegation_progressbar_green, context.getTheme()));
        int i11 = R$id.tv_trade_pair;
        baseViewHolder.setText(i11, C41008l.m89886j(data));
        TradeSide side2 = data.getSide();
        if (side2 != null) {
            int displayResStr = side2.getDisplayResStr();
            baseViewHolder.setText(R$id.tv_trade_type, context.getString(displayResStr) + " / " + C41008l.m89883g(data));
        }
        int i12 = R$id.tv_trade_type;
        Integer numValueOf = Integer.valueOf(C22890g.m54281f(context, Intrinsics.areEqual(data.getSide(), buy)));
        int i13 = R$color.c_text;
        baseViewHolder.setTextColor(i12, C27039d.m66651k(numValueOf, C27046k.m66699n(context, i13)));
        int i14 = R$id.tvDealPercent;
        int i15 = R$color.c_text40;
        baseViewHolder.setTextColor(i14, C27046k.m66699n(context, i15));
        baseViewHolder.setText(R$id.tv_time, C42179a.m92633f(C27039d.m66652l(data.getOrderTime()), null, false, false, null, 15, null));
        baseViewHolder.setText(R$id.tv_amount_type, context.getString(R$string.dealed) + '/' + context.getString(R$string.delegation_amount_stub, C27041f.m66669i(data.getAmountUnit(), strM66516f)));
        baseViewHolder.setGone(R$id.tv_hide, C27025c.m66566d(Boolean.valueOf(C41008l.m89885i(data))));
        int i16 = R$id.tv_cancel_delegation;
        TradeManagerProxy tradeManagerProxy = TradeManagerProxy.f21264a;
        baseViewHolder.setTextColor(i16, (!tradeManagerProxy.m23362b(data.getSymbol()) || tradeManagerProxy.m23361a(data.getSymbol())) ? C27046k.m66699n(context, i13) : C27046k.m66699n(context, R$color.complementary)).setBackgroundRes(i16, (!tradeManagerProxy.m23362b(data.getSymbol()) || tradeManagerProxy.m23361a(data.getSymbol())) ? R$drawable.shape_emphasis4_24r : R$drawable.shape_complementary8_24r);
        View view = baseViewHolder.getView(i16);
        Intrinsics.checkNotNullExpressionValue(view, "getView(...)");
        C11677d.m21216d(view, 0L, new Function1() { // from class: kd.a
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C41005i.m89836j(cancelOrder, data, (View) obj);
            }
        }, 1, null);
        baseViewHolder.setText(R$id.tvDealAndTotalAmount, new C27096v0().append(C41008l.m89877a(data, C41008l.m89879c(data))).m66905e(" / " + C41008l.m89877a(data, C41008l.m89887k(data)), C27046k.m66699n(context, i15)));
        baseViewHolder.setText(R$id.tv_delegation_price, C41008l.m89884h(data));
        baseViewHolder.setText(R$id.tv_trigger_price, C41008l.m89889m(data));
        baseViewHolder.setText(R$id.tv_trigger_price_label, context.getString(R$string.trigger_price));
        baseViewHolder.setText(R$id.tv_delegation_price_label, context.getString(R$string.delegation_price));
        baseViewHolder.setGone(R$id.tv_limit_price_label, false);
        baseViewHolder.setGone(R$id.tv_limit_price, false);
        baseViewHolder.setGone(R$id.view_dash, false);
        TextView textView = (TextView) baseViewHolder.getView(i11);
        if (textView != null) {
            if (Intrinsics.areEqual(str, data.getSymbol()) || !z11) {
                C27046k.m66694i(textView, 0, 0, 0, 6, null);
            } else {
                C27046k.m66694i(textView, R$drawable.icon_arrow_right_mirrored, C5275i0.m6236a(2.0f), 0, 4, null);
            }
            C11677d.m21216d(textView, 0L, new Function1() { // from class: kd.b
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C41005i.m89837k(z12, data, (View) obj);
                }
            }, 1, null);
        }
    }

    /* JADX INFO: renamed from: j */
    public static final Unit m89836j(Function1 function1, InterfaceC41007k.ConditionalLimit conditionalLimit, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        function1.invoke(conditionalLimit);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: k */
    public static final Unit m89837k(boolean z11, InterfaceC41007k.ConditionalLimit conditionalLimit, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (z11) {
            IMarginService.m37900d0(IMarginService.f32724a.get(), C27041f.m66668h(conditionalLimit.getSymbol()), false, false, null, 12, null);
        } else {
            ISpotService.m59984g(ISpotService.f49646a.get(), C27041f.m66668h(conditionalLimit.getSymbol()), false, 2, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: l */
    public static final void m89838l(@NotNull BaseViewHolder baseViewHolder, @NotNull Context context, @Nullable String str, boolean z11, @NotNull final InterfaceC41007k.ConditionalMarket data, final boolean z12, @NotNull final Function1<? super InterfaceC41007k, Unit> cancelOrder) {
        Intrinsics.checkNotNullParameter(baseViewHolder, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(cancelOrder, "cancelOrder");
        String strM66516f = C27017c.f54310a.m66516f(R$string.stub, new Object[0]);
        TradeSide side = data.getSide();
        TradeSide.BUY buy = TradeSide.BUY.INSTANCE;
        boolean zAreEqual = Intrinsics.areEqual(side, buy);
        boolean zM33189n = DayNightThemeManager.f28592a.m33189n();
        ((ProgressBar) baseViewHolder.getView(R$id.delegation_progressbar)).setProgressDrawable(ResourcesCompat.getDrawable(context.getResources(), (!(zM33189n && zAreEqual) && (zM33189n || zAreEqual)) ? R$drawable.shape_delegation_progressbar_red : R$drawable.shape_delegation_progressbar_green, context.getTheme()));
        int i11 = R$id.tv_trade_pair;
        baseViewHolder.setText(i11, C41008l.m89886j(data));
        TradeSide side2 = data.getSide();
        if (side2 != null) {
            int displayResStr = side2.getDisplayResStr();
            baseViewHolder.setText(R$id.tv_trade_type, context.getString(displayResStr) + " / " + C41008l.m89883g(data));
        }
        int i12 = R$id.tv_trade_type;
        Integer numValueOf = Integer.valueOf(C22890g.m54281f(context, Intrinsics.areEqual(data.getSide(), buy)));
        int i13 = R$color.c_text;
        baseViewHolder.setTextColor(i12, C27039d.m66651k(numValueOf, C27046k.m66699n(context, i13)));
        int i14 = R$id.tvDealPercent;
        int i15 = R$color.c_text40;
        baseViewHolder.setTextColor(i14, C27046k.m66699n(context, i15));
        baseViewHolder.setText(R$id.tv_time, C42179a.m92633f(C27039d.m66652l(data.getOrderTime()), null, false, false, null, 15, null));
        baseViewHolder.setText(R$id.tv_amount_type, context.getString(R$string.dealed) + '/' + context.getString(R$string.delegation_amount_stub, C27041f.m66669i(data.getAmountUnit(), strM66516f)));
        baseViewHolder.setGone(R$id.tv_hide, C27025c.m66566d(Boolean.valueOf(C41008l.m89885i(data))));
        int i16 = R$id.tv_cancel_delegation;
        TradeManagerProxy tradeManagerProxy = TradeManagerProxy.f21264a;
        baseViewHolder.setTextColor(i16, (!tradeManagerProxy.m23362b(data.getSymbol()) || tradeManagerProxy.m23361a(data.getSymbol())) ? C27046k.m66699n(context, i13) : C27046k.m66699n(context, R$color.complementary)).setBackgroundRes(i16, (!tradeManagerProxy.m23362b(data.getSymbol()) || tradeManagerProxy.m23361a(data.getSymbol())) ? R$drawable.shape_emphasis4_24r : R$drawable.shape_complementary8_24r);
        View view = baseViewHolder.getView(i16);
        Intrinsics.checkNotNullExpressionValue(view, "getView(...)");
        C11677d.m21216d(view, 0L, new Function1() { // from class: kd.g
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C41005i.m89840n(cancelOrder, data, (View) obj);
            }
        }, 1, null);
        baseViewHolder.setText(R$id.tvDealAndTotalAmount, new C27096v0().append(C41008l.m89877a(data, C41008l.m89879c(data))).m66905e(" / " + C41008l.m89877a(data, C41008l.m89887k(data)), C27046k.m66699n(context, i15)));
        baseViewHolder.setText(R$id.tv_delegation_price, C41008l.m89884h(data));
        baseViewHolder.setText(R$id.tv_trigger_price, C41008l.m89889m(data));
        baseViewHolder.setText(R$id.tv_trigger_price_label, context.getString(R$string.trigger_price));
        baseViewHolder.setText(R$id.tv_delegation_price_label, context.getString(R$string.delegation_price));
        baseViewHolder.setGone(R$id.tv_limit_price_label, false);
        baseViewHolder.setGone(R$id.tv_limit_price, false);
        baseViewHolder.setGone(R$id.view_dash, false);
        TextView textView = (TextView) baseViewHolder.getView(i11);
        if (textView != null) {
            if (Intrinsics.areEqual(str, data.getSymbol()) || !z11) {
                C27046k.m66694i(textView, 0, 0, 0, 6, null);
            } else {
                C27046k.m66694i(textView, R$drawable.icon_arrow_right_mirrored, C5275i0.m6236a(2.0f), 0, 4, null);
            }
            C11677d.m21216d(textView, 0L, new Function1() { // from class: kd.h
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C41005i.m89839m(z12, data, (View) obj);
                }
            }, 1, null);
        }
    }

    /* JADX INFO: renamed from: m */
    public static final Unit m89839m(boolean z11, InterfaceC41007k.ConditionalMarket conditionalMarket, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (z11) {
            IMarginService.m37900d0(IMarginService.f32724a.get(), C27041f.m66668h(conditionalMarket.getSymbol()), false, false, null, 12, null);
        } else {
            ISpotService.m59984g(ISpotService.f49646a.get(), C27041f.m66668h(conditionalMarket.getSymbol()), false, 2, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: n */
    public static final Unit m89840n(Function1 function1, InterfaceC41007k.ConditionalMarket conditionalMarket, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        function1.invoke(conditionalMarket);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o */
    public static final void m89841o(@NotNull BaseViewHolder baseViewHolder, @NotNull Context context, @Nullable String str, boolean z11, @NotNull final InterfaceC41007k.Limit data, final boolean z12, @NotNull final Function1<? super InterfaceC41007k, Unit> cancelOrder) {
        Intrinsics.checkNotNullParameter(baseViewHolder, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(cancelOrder, "cancelOrder");
        String strM66516f = C27017c.f54310a.m66516f(R$string.stub, new Object[0]);
        TradeSide side = data.getSide();
        TradeSide.BUY buy = TradeSide.BUY.INSTANCE;
        boolean zAreEqual = Intrinsics.areEqual(side, buy);
        boolean zM33189n = DayNightThemeManager.f28592a.m33189n();
        int i11 = R$id.delegation_progressbar;
        ((ProgressBar) baseViewHolder.getView(i11)).setProgressDrawable(ResourcesCompat.getDrawable(context.getResources(), (!(zM33189n && zAreEqual) && (zM33189n || zAreEqual)) ? R$drawable.shape_delegation_progressbar_red : R$drawable.shape_delegation_progressbar_green, context.getTheme()));
        int i12 = R$id.tv_trade_pair;
        baseViewHolder.setText(i12, C41008l.m89886j(data));
        TextView textView = (TextView) baseViewHolder.getView(i12);
        if (textView != null) {
            if (Intrinsics.areEqual(str, data.getSymbol()) || !z11) {
                C27046k.m66694i(textView, 0, 0, 0, 6, null);
            } else {
                C27046k.m66694i(textView, R$drawable.icon_arrow_right_mirrored, C5275i0.m6236a(2.0f), 0, 4, null);
            }
            C11677d.m21216d(textView, 0L, new Function1() { // from class: kd.e
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C41005i.m89842p(z12, data, (View) obj);
                }
            }, 1, null);
        }
        TradeSide side2 = data.getSide();
        if (side2 != null) {
            int displayResStr = side2.getDisplayResStr();
            baseViewHolder.setText(R$id.tv_trade_type, context.getString(displayResStr) + " / " + C41008l.m89883g(data));
        }
        baseViewHolder.setGone(R$id.tv_limit_price_label, false);
        baseViewHolder.setGone(R$id.tv_limit_price, false);
        int i13 = R$id.tv_trade_type;
        Integer numValueOf = Integer.valueOf(C22890g.m54281f(context, Intrinsics.areEqual(data.getSide(), buy)));
        int i14 = R$color.c_text;
        baseViewHolder.setTextColor(i13, C27039d.m66651k(numValueOf, C27046k.m66699n(context, i14)));
        baseViewHolder.setText(R$id.tv_time, C42179a.m92633f(C27039d.m66652l(data.getOrderTime()), null, false, false, null, 15, null));
        baseViewHolder.setText(R$id.tv_amount_type, context.getString(R$string.dealed) + '/' + context.getString(R$string.delegation_amount_stub, C27041f.m66669i(data.getAmountUnit(), strM66516f)));
        baseViewHolder.setGone(R$id.tv_hide, C27025c.m66566d(Boolean.valueOf(C41008l.m89885i(data))));
        int i15 = R$id.tv_cancel_delegation;
        TradeManagerProxy tradeManagerProxy = TradeManagerProxy.f21264a;
        baseViewHolder.setTextColor(i15, (!tradeManagerProxy.m23362b(data.getSymbol()) || tradeManagerProxy.m23361a(data.getSymbol())) ? C27046k.m66699n(context, i14) : C27046k.m66699n(context, R$color.complementary)).setBackgroundRes(i15, (!tradeManagerProxy.m23362b(data.getSymbol()) || tradeManagerProxy.m23361a(data.getSymbol())) ? R$drawable.shape_emphasis4_24r : R$drawable.shape_complementary8_24r);
        View view = baseViewHolder.getView(i15);
        Intrinsics.checkNotNullExpressionValue(view, "getView(...)");
        C11677d.m21216d(view, 0L, new Function1() { // from class: kd.f
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C41005i.m89843q(cancelOrder, data, (View) obj);
            }
        }, 1, null);
        int i16 = R$id.tvDealAndTotalAmount;
        C27096v0 c27096v0Append = new C27096v0().append(C41008l.m89877a(data, C41008l.m89879c(data)));
        String str2 = " / " + C41008l.m89877a(data, C41008l.m89887k(data));
        int i17 = R$color.c_text40;
        baseViewHolder.setText(i16, c27096v0Append.m66905e(str2, C27046k.m66699n(context, i17)));
        int i18 = R$id.tvDealPercent;
        baseViewHolder.setText(i18, C41008l.m89880d(data));
        baseViewHolder.setTextColor(i18, C27046k.m66699n(context, i17));
        baseViewHolder.setGone(i18, C41008l.m89881e(data).compareTo(BigDecimal.ZERO) != 0);
        baseViewHolder.setProgress(i11, C41008l.m89882f(data));
        baseViewHolder.setGone(R$id.tv_trigger_price_label, false);
        baseViewHolder.setGone(R$id.tv_trigger_price, false);
        baseViewHolder.setText(R$id.tv_delegation_price, C41008l.m89884h(data));
        baseViewHolder.setGone(R$id.view_dash, false);
    }

    /* JADX INFO: renamed from: p */
    public static final Unit m89842p(boolean z11, InterfaceC41007k.Limit limit, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (z11) {
            IMarginService.m37900d0(IMarginService.f32724a.get(), C27041f.m66668h(limit.getSymbol()), false, false, null, 12, null);
        } else {
            ISpotService.m59984g(ISpotService.f49646a.get(), C27041f.m66668h(limit.getSymbol()), false, 2, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: q */
    public static final Unit m89843q(Function1 function1, InterfaceC41007k.Limit limit, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        function1.invoke(limit);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: r */
    public static final void m89844r(@NotNull BaseViewHolder baseViewHolder, @NotNull Context context, @Nullable String str, boolean z11, @NotNull final InterfaceC41007k.Market data, final boolean z12, @NotNull final Function1<? super InterfaceC41007k, Unit> cancelOrder) {
        Intrinsics.checkNotNullParameter(baseViewHolder, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(cancelOrder, "cancelOrder");
        String strM66516f = C27017c.f54310a.m66516f(R$string.stub, new Object[0]);
        TradeSide side = data.getSide();
        TradeSide.BUY buy = TradeSide.BUY.INSTANCE;
        boolean zAreEqual = Intrinsics.areEqual(side, buy);
        boolean zM33189n = DayNightThemeManager.f28592a.m33189n();
        int i11 = R$id.delegation_progressbar;
        ((ProgressBar) baseViewHolder.getView(i11)).setProgressDrawable(ResourcesCompat.getDrawable(context.getResources(), (!(zM33189n && zAreEqual) && (zM33189n || zAreEqual)) ? R$drawable.shape_delegation_progressbar_red : R$drawable.shape_delegation_progressbar_green, context.getTheme()));
        int i12 = R$id.tv_trade_pair;
        baseViewHolder.setText(i12, C41008l.m89886j(data));
        TradeSide side2 = data.getSide();
        if (side2 != null) {
            int displayResStr = side2.getDisplayResStr();
            baseViewHolder.setText(R$id.tv_trade_type, context.getString(displayResStr) + " / " + C41008l.m89883g(data));
        }
        int i13 = R$id.tv_trade_type;
        Integer numValueOf = Integer.valueOf(C22890g.m54281f(context, Intrinsics.areEqual(data.getSide(), buy)));
        int i14 = R$color.c_text;
        baseViewHolder.setTextColor(i13, C27039d.m66651k(numValueOf, C27046k.m66699n(context, i14)));
        baseViewHolder.setText(R$id.tv_time, C42179a.m92633f(C27039d.m66652l(data.getOrderTime()), null, false, false, null, 15, null));
        baseViewHolder.setText(R$id.tv_amount_type, context.getString(R$string.dealed) + '/' + context.getString(R$string.delegation_amount_stub, C27041f.m66669i(data.getAmountUnit(), strM66516f)));
        baseViewHolder.setGone(R$id.tv_hide, C27025c.m66566d(Boolean.valueOf(C41008l.m89885i(data))));
        int i15 = R$id.tv_cancel_delegation;
        TradeManagerProxy tradeManagerProxy = TradeManagerProxy.f21264a;
        baseViewHolder.setTextColor(i15, (!tradeManagerProxy.m23362b(data.getSymbol()) || tradeManagerProxy.m23361a(data.getSymbol())) ? C27046k.m66699n(context, i14) : C27046k.m66699n(context, R$color.complementary)).setBackgroundRes(i15, (!tradeManagerProxy.m23362b(data.getSymbol()) || tradeManagerProxy.m23361a(data.getSymbol())) ? R$drawable.shape_emphasis4_24r : R$drawable.shape_complementary8_24r);
        View view = baseViewHolder.getView(i15);
        Intrinsics.checkNotNullExpressionValue(view, "getView(...)");
        C11677d.m21216d(view, 0L, new Function1() { // from class: kd.c
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C41005i.m89845s(cancelOrder, data, (View) obj);
            }
        }, 1, null);
        int i16 = R$id.tvDealAndTotalAmount;
        C27096v0 c27096v0Append = new C27096v0().append(C41008l.m89877a(data, C41008l.m89879c(data)));
        String str2 = " / " + C41008l.m89877a(data, C41008l.m89887k(data));
        int i17 = R$color.c_text40;
        baseViewHolder.setText(i16, c27096v0Append.m66905e(str2, C27046k.m66699n(context, i17)));
        int i18 = R$id.tvDealPercent;
        baseViewHolder.setText(i18, C41008l.m89880d(data));
        baseViewHolder.setTextColor(i18, C27046k.m66699n(context, i17));
        baseViewHolder.setGone(i18, C41008l.m89881e(data).compareTo(BigDecimal.ZERO) != 0);
        baseViewHolder.setProgress(i11, C41008l.m89882f(data));
        baseViewHolder.setText(R$id.tv_delegation_price, C41008l.m89884h(data));
        baseViewHolder.setGone(R$id.tv_trigger_price_label, false);
        baseViewHolder.setGone(R$id.tv_trigger_price, false);
        baseViewHolder.setGone(R$id.tv_limit_price_label, false);
        baseViewHolder.setGone(R$id.tv_limit_price, false);
        baseViewHolder.setGone(R$id.view_dash, false);
        TextView textView = (TextView) baseViewHolder.getView(i12);
        if (textView != null) {
            if (Intrinsics.areEqual(str, data.getSymbol()) || !z11) {
                C27046k.m66694i(textView, 0, 0, 0, 6, null);
            } else {
                C27046k.m66694i(textView, R$drawable.icon_arrow_right_mirrored, C5275i0.m6236a(2.0f), 0, 4, null);
            }
            C11677d.m21216d(textView, 0L, new Function1() { // from class: kd.d
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C41005i.m89846t(z12, data, (View) obj);
                }
            }, 1, null);
        }
    }

    /* JADX INFO: renamed from: s */
    public static final Unit m89845s(Function1 function1, InterfaceC41007k.Market market, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        function1.invoke(market);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: t */
    public static final Unit m89846t(boolean z11, InterfaceC41007k.Market market, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (z11) {
            IMarginService.m37900d0(IMarginService.f32724a.get(), C27041f.m66668h(market.getSymbol()), false, false, null, 12, null);
        } else {
            ISpotService.m59984g(ISpotService.f49646a.get(), C27041f.m66668h(market.getSymbol()), false, 2, null);
        }
        return Unit.INSTANCE;
    }
}
