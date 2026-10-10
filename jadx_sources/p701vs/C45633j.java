package p701vs;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.operation.lib.R$id;
import com.kubi.operation.lib.R$layout;
import com.kubi.resources.widget.AutoTextView;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.CoinAvatarView;
import com.kubi.resources.widget.chart.view.LineChartView;

/* JADX INFO: renamed from: vs.j */
/* JADX INFO: compiled from: OperationItemMaincoinBinding.java */
/* JADX INFO: loaded from: classes32.dex */
public final class C45633j implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f102850a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final CoinAvatarView f102851b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final LinearLayoutCompat f102852c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final ConstraintLayout f102853d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final LineChartView f102854e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final BaseTextView f102855f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final AutoTextView f102856g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final BaseTextView f102857h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final BaseTextView f102858i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final BaseTextView f102859j;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C45633j m100753a(@NonNull View view) {
        int i11 = R$id.ivCoinLogo;
        CoinAvatarView coinAvatarView = (CoinAvatarView) ViewBindings.findChildViewById(view, i11);
        if (coinAvatarView != null) {
            i11 = R$id.layoutInfo;
            LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i11);
            if (linearLayoutCompat != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) view;
                i11 = R$id.lineChart;
                LineChartView lineChartView = (LineChartView) ViewBindings.findChildViewById(view, i11);
                if (lineChartView != null) {
                    i11 = R$id.tvName;
                    BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                    if (baseTextView != null) {
                        i11 = R$id.tvPrice;
                        AutoTextView autoTextView = (AutoTextView) ViewBindings.findChildViewById(view, i11);
                        if (autoTextView != null) {
                            i11 = R$id.tvRateMsg;
                            BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                            if (baseTextView2 != null) {
                                i11 = R$id.tvRateOrVolume;
                                BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                if (baseTextView3 != null) {
                                    i11 = R$id.tvType;
                                    BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                    if (baseTextView4 != null) {
                                        return new C45633j(constraintLayout, coinAvatarView, linearLayoutCompat, constraintLayout, lineChartView, baseTextView, autoTextView, baseTextView2, baseTextView3, baseTextView4);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public static C45633j m100754c(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z11) {
        View viewInflate = layoutInflater.inflate(R$layout.operation_item_maincoin, viewGroup, false);
        if (z11) {
            viewGroup.addView(viewInflate);
        }
        return m100753a(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f102850a;
    }

    public C45633j(@NonNull ConstraintLayout constraintLayout, @NonNull CoinAvatarView coinAvatarView, @NonNull LinearLayoutCompat linearLayoutCompat, @NonNull ConstraintLayout constraintLayout2, @NonNull LineChartView lineChartView, @NonNull BaseTextView baseTextView, @NonNull AutoTextView autoTextView, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3, @NonNull BaseTextView baseTextView4) {
        this.f102850a = constraintLayout;
        this.f102851b = coinAvatarView;
        this.f102852c = linearLayoutCompat;
        this.f102853d = constraintLayout2;
        this.f102854e = lineChartView;
        this.f102855f = baseTextView;
        this.f102856g = autoTextView;
        this.f102857h = baseTextView2;
        this.f102858i = baseTextView3;
        this.f102859j = baseTextView4;
    }
}
