package p206dp;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.margin.R$id;
import com.kubi.margin.view.TradeSettingOptionGroupView;
import com.kubi.resources.widget.BaseTextView;

/* JADX INFO: renamed from: dp.x0 */
/* JADX INFO: compiled from: FragmentTradeSettingBinding.java */
/* JADX INFO: loaded from: classes27.dex */
public final class C36948x0 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ScrollView f82044a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final FrameLayout f82045b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final BaseTextView f82046c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final TradeSettingOptionGroupView f82047d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final ConstraintLayout f82048e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final TradeSettingOptionGroupView f82049f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final ConstraintLayout f82050g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final BaseTextView f82051h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final BaseTextView f82052i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final BaseTextView f82053j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final BaseTextView f82054k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final BaseTextView f82055l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final BaseTextView f82056m;

    /* JADX INFO: renamed from: n */
    @NonNull
    public final FrameLayout f82057n;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36948x0 m82765a(@NonNull View view) {
        int i11 = R$id.flCurrency;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i11);
        if (frameLayout != null) {
            i11 = R$id.general;
            BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
            if (baseTextView != null) {
                i11 = R$id.k_line_position_group;
                TradeSettingOptionGroupView tradeSettingOptionGroupView = (TradeSettingOptionGroupView) ViewBindings.findChildViewById(view, i11);
                if (tradeSettingOptionGroupView != null) {
                    i11 = R$id.k_line_position_layout;
                    ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i11);
                    if (constraintLayout != null) {
                        i11 = R$id.trade_panel_position_group;
                        TradeSettingOptionGroupView tradeSettingOptionGroupView2 = (TradeSettingOptionGroupView) ViewBindings.findChildViewById(view, i11);
                        if (tradeSettingOptionGroupView2 != null) {
                            i11 = R$id.trade_panel_position_layout;
                            ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, i11);
                            if (constraintLayout2 != null) {
                                i11 = R$id.trading_title;
                                BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                if (baseTextView2 != null) {
                                    i11 = R$id.tv_chart_position;
                                    BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                    if (baseTextView3 != null) {
                                        i11 = R$id.tv_chart_position_desc;
                                        BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                        if (baseTextView4 != null) {
                                            i11 = R$id.tvCurrency;
                                            BaseTextView baseTextView5 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                            if (baseTextView5 != null) {
                                                i11 = R$id.tv_trade_panel;
                                                BaseTextView baseTextView6 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                if (baseTextView6 != null) {
                                                    i11 = R$id.tv_trade_panel_desc;
                                                    BaseTextView baseTextView7 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                    if (baseTextView7 != null) {
                                                        i11 = R$id.unifyDoubleCheckContainer;
                                                        FrameLayout frameLayout2 = (FrameLayout) ViewBindings.findChildViewById(view, i11);
                                                        if (frameLayout2 != null) {
                                                            return new C36948x0((ScrollView) view, frameLayout, baseTextView, tradeSettingOptionGroupView, constraintLayout, tradeSettingOptionGroupView2, constraintLayout2, baseTextView2, baseTextView3, baseTextView4, baseTextView5, baseTextView6, baseTextView7, frameLayout2);
                                                        }
                                                    }
                                                }
                                            }
                                        }
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

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ScrollView getRoot() {
        return this.f82044a;
    }

    public C36948x0(@NonNull ScrollView scrollView, @NonNull FrameLayout frameLayout, @NonNull BaseTextView baseTextView, @NonNull TradeSettingOptionGroupView tradeSettingOptionGroupView, @NonNull ConstraintLayout constraintLayout, @NonNull TradeSettingOptionGroupView tradeSettingOptionGroupView2, @NonNull ConstraintLayout constraintLayout2, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3, @NonNull BaseTextView baseTextView4, @NonNull BaseTextView baseTextView5, @NonNull BaseTextView baseTextView6, @NonNull BaseTextView baseTextView7, @NonNull FrameLayout frameLayout2) {
        this.f82044a = scrollView;
        this.f82045b = frameLayout;
        this.f82046c = baseTextView;
        this.f82047d = tradeSettingOptionGroupView;
        this.f82048e = constraintLayout;
        this.f82049f = tradeSettingOptionGroupView2;
        this.f82050g = constraintLayout2;
        this.f82051h = baseTextView2;
        this.f82052i = baseTextView3;
        this.f82053j = baseTextView4;
        this.f82054k = baseTextView5;
        this.f82055l = baseTextView6;
        this.f82056m = baseTextView7;
        this.f82057n = frameLayout2;
    }
}
