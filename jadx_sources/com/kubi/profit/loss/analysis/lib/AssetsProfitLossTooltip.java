package com.kubi.profit.loss.analysis.lib;

import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.chart.data.DataPoint;
import com.kubi.utils.C27017c;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.DowngradeExKt;
import com.kubi.utils.extensions.core.ViewExtKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p439lw.InterfaceC42321c;
import p439lw.InterfaceC42327i;
import p479nw.Frame;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.profit.loss.analysis.lib.y, reason: from Kotlin metadata */
/* JADX INFO: compiled from: AssetsProfitLossTooltip.kt */
/* JADX INFO: loaded from: classes35.dex */
@Metadata(m90083d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0018\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0018\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0010\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0011H\u0002J\u0010\u0010\u0019\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u0013H\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, m90084d2 = {"Lcom/kubi/profit/loss/analysis/lib/AssetsProfitLossTooltip;", "Lcom/kubi/resources/widget/chart/Tooltip;", "<init>", "()V", "contentView", "Landroid/view/View;", "message1", "Lcom/kubi/resources/widget/BaseTextView;", "message2", "selectIndex", "", "onCreate", "", "parentView", "Landroid/view/ViewGroup;", "onSelect", "selectPoint", "Lcom/kubi/resources/widget/chart/data/DataPoint;", "render", "Lcom/kubi/resources/widget/chart/ChartContract$Renderer;", "showPopView", "dataPoint", "inner", "Lcom/kubi/resources/widget/chart/data/Frame;", "handleDepositOrWithdrawText", "onTouchUp", "renderer", "ProfitLossAnalysisLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class AssetsProfitLossTooltip implements InterfaceC42327i {

    /* JADX INFO: renamed from: b */
    @Nullable
    public View f40746b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public BaseTextView f40747c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public BaseTextView f40748d;

    /* JADX INFO: renamed from: e */
    public int f40749e = -1;

    /* JADX INFO: renamed from: g */
    public static final void m50076g(AssetsProfitLossTooltip assetsProfitLossTooltip, DataPoint dataPoint, Frame frame) {
        View view = assetsProfitLossTooltip.f40746b;
        if (view != null) {
            view.measure(0, 0);
        }
        View view2 = assetsProfitLossTooltip.f40746b;
        int measuredWidth = view2 != null ? view2.getMeasuredWidth() : 0;
        float f11 = measuredWidth / 2;
        float screenPositionX = dataPoint.getScreenPositionX() + f11;
        float screenPositionX2 = dataPoint.getScreenPositionX() - f11;
        if (screenPositionX2 < frame.getLeft()) {
            screenPositionX2 = frame.getLeft();
        } else if (screenPositionX > frame.getRight()) {
            screenPositionX2 = frame.getRight() - measuredWidth;
        }
        View view3 = assetsProfitLossTooltip.f40746b;
        if (view3 != null) {
            view3.setX(screenPositionX2);
        }
    }

    @Override // p439lw.InterfaceC42327i
    /* JADX INFO: renamed from: a */
    public void mo50053a(@NotNull DataPoint selectPoint, @NotNull InterfaceC42321c render) {
        Intrinsics.checkNotNullParameter(selectPoint, "selectPoint");
        Intrinsics.checkNotNullParameter(render, "render");
        if (selectPoint.getIndex() != this.f40749e) {
            this.f40749e = selectPoint.getIndex();
            m50078f(selectPoint, render.mo92860d());
            render.mo92857a(selectPoint);
            render.postInvalidate();
            C21535v.m50071i(null, "chart", null, null, 13, null);
        }
    }

    @Override // p439lw.InterfaceC42327i
    /* JADX INFO: renamed from: b */
    public void mo50054b(@NotNull InterfaceC42321c renderer) {
        Intrinsics.checkNotNullParameter(renderer, "renderer");
        View view = this.f40746b;
        if (view != null) {
            C27046k.m66703r(view);
        }
        renderer.mo92863g();
        renderer.mo92858b();
        this.f40749e = -1;
        renderer.postInvalidate();
    }

    @Override // p439lw.InterfaceC42327i
    /* JADX INFO: renamed from: c */
    public void mo50055c(@NotNull ViewGroup parentView) {
        Intrinsics.checkNotNullParameter(parentView, "parentView");
        View viewInflate = LayoutInflater.from(parentView.getContext()).inflate(R$layout.chart_tooltip_layout, parentView, false);
        this.f40746b = viewInflate;
        if (viewInflate != null) {
            C27046k.m66703r(viewInflate);
        }
        View view = this.f40746b;
        if (view != null) {
            parentView.addView(view);
        }
        View view2 = this.f40746b;
        this.f40747c = view2 != null ? (BaseTextView) view2.findViewById(R$id.message1) : null;
        View view3 = this.f40746b;
        this.f40748d = view3 != null ? (BaseTextView) view3.findViewById(R$id.message2) : null;
    }

    /* JADX INFO: renamed from: f */
    public final void m50078f(final DataPoint dataPoint, final Frame frame) {
        View view = this.f40746b;
        if (view != null) {
            ViewExtKt.m66594y(view);
        }
        BaseTextView baseTextView = this.f40747c;
        if (baseTextView != null) {
            baseTextView.setText(dataPoint.getSelectText2());
        }
        m50077e(dataPoint);
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.kubi.profit.loss.analysis.lib.x
            @Override // java.lang.Runnable
            public final void run() {
                AssetsProfitLossTooltip.m50076g(this.f40743b, dataPoint, frame);
            }
        }, 20L);
        View view2 = this.f40746b;
        if (view2 != null) {
            view2.performHapticFeedback(0, 2);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m50077e(DataPoint dataPoint) {
        BaseTextView baseTextView;
        BaseTextView baseTextView2;
        int iIsDepositOrWithdraw = dataPoint.isDepositOrWithdraw();
        if (iIsDepositOrWithdraw != 0) {
            if (iIsDepositOrWithdraw != 1) {
                if (iIsDepositOrWithdraw == 2) {
                    BaseTextView baseTextView3 = this.f40748d;
                    if (baseTextView3 != null) {
                        baseTextView3.setVisibility(0);
                    }
                    if (dataPoint.getPeriodType() == 1) {
                        BaseTextView baseTextView4 = this.f40748d;
                        if (baseTextView4 != null) {
                            baseTextView4.setText(DowngradeExKt.m66552v(C27017c.f54310a.m66516f(R$string.kc_asset_chart_funds_out_hour, new Object[0]), Integer.valueOf(dataPoint.getPeriod()), C21535v.m50065c(dataPoint.getDepositOrWithdrawAmount())));
                            return;
                        }
                        return;
                    }
                    if (dataPoint.getPeriodType() == 2 && (baseTextView2 = this.f40748d) != null) {
                        baseTextView2.setText(DowngradeExKt.m66552v(C27017c.f54310a.m66516f(R$string.kc_asset_chart_funds_out_day, new Object[0]), Integer.valueOf(dataPoint.getPeriod()), C21535v.m50065c(dataPoint.getDepositOrWithdrawAmount())));
                        return;
                    }
                    return;
                }
                return;
            }
            BaseTextView baseTextView5 = this.f40748d;
            if (baseTextView5 != null) {
                baseTextView5.setVisibility(0);
            }
            if (dataPoint.getPeriodType() == 1) {
                BaseTextView baseTextView6 = this.f40748d;
                if (baseTextView6 != null) {
                    baseTextView6.setText(DowngradeExKt.m66552v(C27017c.f54310a.m66516f(R$string.kc_asset_chart_funds_in_hour, new Object[0]), Integer.valueOf(dataPoint.getPeriod()), C21535v.m50065c(dataPoint.getDepositOrWithdrawAmount())));
                    return;
                }
                return;
            }
            if (dataPoint.getPeriodType() == 2 && (baseTextView = this.f40748d) != null) {
                baseTextView.setText(DowngradeExKt.m66552v(C27017c.f54310a.m66516f(R$string.kc_asset_chart_funds_in_day, new Object[0]), Integer.valueOf(dataPoint.getPeriod()), C21535v.m50065c(dataPoint.getDepositOrWithdrawAmount())));
                return;
            }
            return;
        }
        BaseTextView baseTextView7 = this.f40748d;
        if (baseTextView7 != null) {
            baseTextView7.setVisibility(8);
        }
    }
}
