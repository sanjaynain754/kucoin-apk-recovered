package com.kubi.market.monitor.lib.p100ui.floating.window;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.camera.core.processing.util.GLUtils;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.data.entity.SymbolInfoEntity;
import com.kubi.kucoin.market.monitor.lib.R$color;
import com.kubi.kucoin.market.monitor.lib.R$id;
import com.kubi.market.monitor.lib.entity.StateTradeItemBean;
import com.kubi.market.monitor.lib.p100ui.floating.window.util.FloatWindowBuild;
import com.kubi.sdk.BaseApplication;
import com.kubi.sdk.function.language.MultiLanguageManager;
import com.kubi.spot.api.ISpotService;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import gf.C37886j;
import java.math.BigDecimal;
import java.math.RoundingMode;
import nf.C42828b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p402kf.C41014a;
import p429lf.C42180b;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.market.monitor.lib.ui.floating.window.b2, reason: from Kotlin metadata */
/* JADX INFO: compiled from: FloatingViewHolder.kt */
/* JADX INFO: loaded from: classes27.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000f\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0002\u0010\u0013J\u0016\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u000eJ\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u000eH\u0002J\u0010\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u000eH\u0002J\u0010\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u000eH\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, m90084d2 = {"Lcom/kubi/market/monitor/lib/ui/floating/window/FloatingViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "<init>", "(Landroid/view/View;)V", "tvSymbol", "Landroid/widget/TextView;", "lastDealPrice", "tvPrice", "changeRate", "itemViewSpacing", "itemViewTopSpacing", "dataBean", "Lcom/kubi/market/monitor/lib/entity/StateTradeItemBean;", "textColor", "", "", "text40Color", "(Ljava/lang/Integer;Ljava/lang/Integer;)V", "bindData", ViewProps.POSITION, "info", "lastDealPriceText", "", "changeRateTextColor", "lastDealPriceTextColor", "MarketMonitorLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class FloatingViewHolder extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: g */
    @NotNull
    public final TextView f34463g;

    /* JADX INFO: renamed from: h */
    @NotNull
    public final TextView f34464h;

    /* JADX INFO: renamed from: i */
    @NotNull
    public final TextView f34465i;

    /* JADX INFO: renamed from: j */
    @NotNull
    public final TextView f34466j;

    /* JADX INFO: renamed from: k */
    @NotNull
    public final View f34467k;

    /* JADX INFO: renamed from: l */
    @NotNull
    public final View f34468l;

    /* JADX INFO: renamed from: m */
    @Nullable
    public StateTradeItemBean f34469m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FloatingViewHolder(@NotNull View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.tvSymbol);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f34463g = (TextView) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(R$id.lastDealPrice);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f34464h = (TextView) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(R$id.tvPrice);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f34465i = (TextView) viewFindViewById3;
        View viewFindViewById4 = itemView.findViewById(R$id.changeRate);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.f34466j = (TextView) viewFindViewById4;
        View viewFindViewById5 = itemView.findViewById(R$id.itemViewSpacing);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        this.f34467k = viewFindViewById5;
        View viewFindViewById6 = itemView.findViewById(R$id.itemViewTopSpacing);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        this.f34468l = viewFindViewById6;
    }

    /* JADX INFO: renamed from: d */
    public static final Unit m41100d(FloatingViewHolder floatingViewHolder) {
        if (floatingViewHolder.itemView.getVisibility() != 0) {
            return Unit.INSTANCE;
        }
        final StateTradeItemBean stateTradeItemBean = floatingViewHolder.f34469m;
        if (stateTradeItemBean != null) {
            ISpotService.m59982A(ISpotService.f49646a.get(), stateTradeItemBean.getSymbol(), null, null, null, 14, null);
            FloatingActionManager.f34540a.m41373m0("1", "pair", new Function1() { // from class: com.kubi.market.monitor.lib.ui.floating.window.a2
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return FloatingViewHolder.m41101e(stateTradeItemBean, (JSONObject) obj);
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: e */
    public static final Unit m41101e(StateTradeItemBean stateTradeItemBean, JSONObject floatingTrackClick) throws JSONException {
        Intrinsics.checkNotNullParameter(floatingTrackClick, "$this$floatingTrackClick");
        floatingTrackClick.put("clickPosition", C27041f.m66668h(stateTradeItemBean.getSymbol()));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: c */
    public final void m41102c(int i11, @NotNull StateTradeItemBean info) {
        Intrinsics.checkNotNullParameter(info, "info");
        FloatingActionManager floatingActionManager = FloatingActionManager.f34540a;
        if (floatingActionManager.m41356Z() || !(i11 == 0 || floatingActionManager.m41367h0())) {
            this.f34468l.setVisibility(8);
        } else {
            this.f34468l.setVisibility(0);
            ViewGroup.LayoutParams layoutParams = this.f34468l.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = floatingActionManager.m41392x0();
            }
            if (layoutParams != null) {
                layoutParams.width = floatingActionManager.m41392x0();
            }
            this.f34468l.setLayoutParams(layoutParams);
        }
        ViewGroup.LayoutParams layoutParams2 = this.f34467k.getLayoutParams();
        if (layoutParams2 != null) {
            layoutParams2.height = floatingActionManager.m41392x0();
        }
        if (layoutParams2 != null) {
            layoutParams2.width = floatingActionManager.m41392x0();
        }
        this.f34467k.setLayoutParams(layoutParams2);
        this.f34465i.setTextColor(floatingActionManager.m41381q1());
        this.f34463g.setTextColor(floatingActionManager.m41383r1());
        this.f34469m = info;
        FloatWindowBuild.Companion companion = FloatWindowBuild.f34525a;
        if (companion.currencyNameShow()) {
            this.f34463g.setTextSize(floatingActionManager.m41330F0());
            this.f34463g.setVisibility(0);
            this.f34463g.setText(info.getShowSymbol());
        } else {
            this.f34463g.setVisibility(8);
            this.f34463g.setText("");
        }
        String strM93915p = null;
        if (companion.priceShow()) {
            double lastDealPrice = info.getLastDealPrice();
            SymbolInfoEntity symbolInfoEntity = info.getSymbolInfoEntity();
            String strM89933g = C41014a.m89933g(new BigDecimal(String.valueOf(C41014a.m89939m(lastDealPrice, symbolInfoEntity != null ? symbolInfoEntity.getQuoteCurrency() : null))), null, null, 0, false, false, true, 31, null);
            this.f34465i.setTextSize(floatingActionManager.m41328D0());
            this.f34465i.setVisibility(0);
            this.f34465i.setText(strM89933g);
        } else {
            this.f34465i.setVisibility(8);
            this.f34465i.setText("");
        }
        if (companion.quoteChangeShow()) {
            Double changeRate = info.getChangeRate();
            if (changeRate != null) {
                BigDecimal bigDecimal = new BigDecimal(String.valueOf(changeRate.doubleValue()));
                strM93915p = C42828b.m93915p(C42828b.m93911l(C42180b.m92642g(bigDecimal, null, null, C41014a.m89951y(bigDecimal), true, false, false, 19, null)));
            }
            String strM92647l = C42180b.m92647l(strM93915p);
            this.f34466j.setTextSize(floatingActionManager.m41382r0());
            this.f34466j.setVisibility(0);
            this.f34466j.setText(strM92647l);
            this.f34466j.setTextColor(m41103f(info));
        } else {
            this.f34466j.setVisibility(8);
            this.f34466j.setText("");
        }
        this.f34464h.setTextColor(m41105h(info));
        this.f34464h.setTextSize(floatingActionManager.m41394y0());
        this.f34464h.setText(m41104g(info));
        View itemView = this.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        C27046k.m66711z(itemView, 0L, new Function0() { // from class: com.kubi.market.monitor.lib.ui.floating.window.z1
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FloatingViewHolder.m41100d(this.f34561b);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: f */
    public final int m41103f(StateTradeItemBean stateTradeItemBean) {
        int i11;
        BigDecimal bigDecimal = new BigDecimal("0");
        Double changeRate = stateTradeItemBean.getChangeRate();
        BigDecimal bigDecimalM89922G = C41014a.m89922G(changeRate != null ? new BigDecimal(String.valueOf(changeRate.doubleValue())) : null, null, 1, null);
        if (bigDecimalM89922G.compareTo(bigDecimal) > 0) {
            i11 = FloatingActionManager.f34540a.m41344P0() ? R$color.primary : R$color.secondary;
        } else if (bigDecimalM89922G.compareTo(bigDecimal) < 0) {
            i11 = FloatingActionManager.f34540a.m41344P0() ? R$color.secondary : R$color.primary;
        } else {
            i11 = R$color.floating_darkTheme_textcolor_text68;
        }
        return BaseApplication.INSTANCE.get().getResources().getColor(i11);
    }

    /* JADX INFO: renamed from: g */
    public final String m41104g(StateTradeItemBean stateTradeItemBean) {
        return C41014a.m89927a(new BigDecimal(GLUtils.VERSION_UNKNOWN), C41014a.m89922G(new BigDecimal(String.valueOf(stateTradeItemBean.getLastDealPrice())), null, 1, null)) ? "--" : C37886j.m85579c(new BigDecimal(String.valueOf(stateTradeItemBean.getLastDealPrice())), stateTradeItemBean.getSymbol(), (124 & 2) != 0 ? RoundingMode.DOWN : null, (124 & 4) != 0 ? false : false, (124 & 8) != 0 ? false : false, (124 & 16) != 0, (124 & 32) == 0 ? 0 : 0, (124 & 64) != 0 ? MultiLanguageManager.f46811g.getLocale() : null);
    }

    /* JADX INFO: renamed from: h */
    public final int m41105h(StateTradeItemBean stateTradeItemBean) {
        int i11;
        if (stateTradeItemBean.getLastDealPriceStateChange() == 1) {
            if (FloatingActionManager.f34540a.m41344P0()) {
                i11 = R$color.primary;
            } else {
                i11 = R$color.secondary;
            }
        } else if (stateTradeItemBean.getLastDealPriceStateChange() == -1) {
            if (FloatingActionManager.f34540a.m41344P0()) {
                i11 = R$color.secondary;
            } else {
                i11 = R$color.primary;
            }
        } else {
            i11 = R$color.floating_darkTheme_textcolor_text;
        }
        return BaseApplication.INSTANCE.get().getResources().getColor(i11);
    }
}
