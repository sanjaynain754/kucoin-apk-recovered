package p206dp;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.core.biz.leverbar.LeverageSettingBar;
import com.kubi.margin.R$id;
import com.kubi.resources.widget.AlignTopTextView;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.BuySellRatioView;
import com.kubi.resources.widget.DashTextView;
import com.kubi.resources.widget.FocusedRecyclerView;
import com.kubi.resources.widget.KcPrecisionTextView;
import com.kubi.resources.widget.OrderBookShowView;

/* JADX INFO: renamed from: dp.l0 */
/* JADX INFO: compiled from: BmarginFragmentTradeVerticalBinding.java */
/* JADX INFO: loaded from: classes27.dex */
public final class C36924l0 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f81785a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final BuySellRatioView f81786b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final KcPrecisionTextView f81787c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final LinearLayout f81788d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final FrameLayout f81789e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final AppCompatImageView f81790f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final OrderBookShowView f81791g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final AppCompatImageView f81792h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final AppCompatImageView f81793i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final LeverageSettingBar f81794j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final LinearLayout f81795k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final ConstraintLayout f81796l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final ConstraintLayout f81797m;

    /* JADX INFO: renamed from: n */
    @NonNull
    public final FocusedRecyclerView f81798n;

    /* JADX INFO: renamed from: o */
    @NonNull
    public final FocusedRecyclerView f81799o;

    /* JADX INFO: renamed from: p */
    @NonNull
    public final RadioGroup f81800p;

    /* JADX INFO: renamed from: q */
    @NonNull
    public final AlignTopTextView f81801q;

    /* JADX INFO: renamed from: r */
    @NonNull
    public final RadioButton f81802r;

    /* JADX INFO: renamed from: s */
    @NonNull
    public final DashTextView f81803s;

    /* JADX INFO: renamed from: t */
    @NonNull
    public final BaseTextView f81804t;

    /* JADX INFO: renamed from: u */
    @NonNull
    public final BaseTextView f81805u;

    /* JADX INFO: renamed from: v */
    @NonNull
    public final RadioButton f81806v;

    /* JADX INFO: renamed from: w */
    @NonNull
    public final BaseTextView f81807w;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C36924l0 m82716a(@NonNull View view) {
        int i11 = R$id.buy_sell_ratio_view;
        BuySellRatioView buySellRatioView = (BuySellRatioView) ViewBindings.findChildViewById(view, i11);
        if (buySellRatioView != null) {
            i11 = R$id.cb_orderbook_select_precision;
            KcPrecisionTextView kcPrecisionTextView = (KcPrecisionTextView) ViewBindings.findChildViewById(view, i11);
            if (kcPrecisionTextView != null) {
                i11 = R$id.fl_price_type;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                if (linearLayout != null) {
                    i11 = R$id.fl_trade_type_container;
                    FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i11);
                    if (frameLayout != null) {
                        i11 = R$id.iv_mark_price;
                        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
                        if (appCompatImageView != null) {
                            i11 = R$id.iv_order_type;
                            OrderBookShowView orderBookShowView = (OrderBookShowView) ViewBindings.findChildViewById(view, i11);
                            if (orderBookShowView != null) {
                                i11 = R$id.ivPriceTypeInfo;
                                AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
                                if (appCompatImageView2 != null) {
                                    i11 = R$id.ivTriangle;
                                    AppCompatImageView appCompatImageView3 = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
                                    if (appCompatImageView3 != null) {
                                        i11 = R$id.leverSettingBar;
                                        LeverageSettingBar leverageSettingBar = (LeverageSettingBar) ViewBindings.findChildViewById(view, i11);
                                        if (leverageSettingBar != null) {
                                            i11 = R$id.ll_bottom;
                                            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                                            if (linearLayout2 != null) {
                                                i11 = R$id.ll_center;
                                                ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i11);
                                                if (constraintLayout != null) {
                                                    ConstraintLayout constraintLayout2 = (ConstraintLayout) view;
                                                    i11 = R$id.rcv_buy;
                                                    FocusedRecyclerView focusedRecyclerView = (FocusedRecyclerView) ViewBindings.findChildViewById(view, i11);
                                                    if (focusedRecyclerView != null) {
                                                        i11 = R$id.rcv_sell;
                                                        FocusedRecyclerView focusedRecyclerView2 = (FocusedRecyclerView) ViewBindings.findChildViewById(view, i11);
                                                        if (focusedRecyclerView2 != null) {
                                                            i11 = R$id.rgToggle;
                                                            RadioGroup radioGroup = (RadioGroup) ViewBindings.findChildViewById(view, i11);
                                                            if (radioGroup != null) {
                                                                i11 = R$id.tv_base_unit_out;
                                                                AlignTopTextView alignTopTextView = (AlignTopTextView) ViewBindings.findChildViewById(view, i11);
                                                                if (alignTopTextView != null) {
                                                                    i11 = R$id.tv_buy;
                                                                    RadioButton radioButton = (RadioButton) ViewBindings.findChildViewById(view, i11);
                                                                    if (radioButton != null) {
                                                                        i11 = R$id.tv_etf_value;
                                                                        DashTextView dashTextView = (DashTextView) ViewBindings.findChildViewById(view, i11);
                                                                        if (dashTextView != null) {
                                                                            i11 = R$id.tv_price_type;
                                                                            BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                            if (baseTextView != null) {
                                                                                i11 = R$id.tv_quote_unit_out;
                                                                                BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                                if (baseTextView2 != null) {
                                                                                    i11 = R$id.tv_sell;
                                                                                    RadioButton radioButton2 = (RadioButton) ViewBindings.findChildViewById(view, i11);
                                                                                    if (radioButton2 != null) {
                                                                                        i11 = R$id.tv_trade_price;
                                                                                        BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                                        if (baseTextView3 != null) {
                                                                                            return new C36924l0(constraintLayout2, buySellRatioView, kcPrecisionTextView, linearLayout, frameLayout, appCompatImageView, orderBookShowView, appCompatImageView2, appCompatImageView3, leverageSettingBar, linearLayout2, constraintLayout, constraintLayout2, focusedRecyclerView, focusedRecyclerView2, radioGroup, alignTopTextView, radioButton, dashTextView, baseTextView, baseTextView2, radioButton2, baseTextView3);
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
    public ConstraintLayout getRoot() {
        return this.f81785a;
    }

    public C36924l0(@NonNull ConstraintLayout constraintLayout, @NonNull BuySellRatioView buySellRatioView, @NonNull KcPrecisionTextView kcPrecisionTextView, @NonNull LinearLayout linearLayout, @NonNull FrameLayout frameLayout, @NonNull AppCompatImageView appCompatImageView, @NonNull OrderBookShowView orderBookShowView, @NonNull AppCompatImageView appCompatImageView2, @NonNull AppCompatImageView appCompatImageView3, @NonNull LeverageSettingBar leverageSettingBar, @NonNull LinearLayout linearLayout2, @NonNull ConstraintLayout constraintLayout2, @NonNull ConstraintLayout constraintLayout3, @NonNull FocusedRecyclerView focusedRecyclerView, @NonNull FocusedRecyclerView focusedRecyclerView2, @NonNull RadioGroup radioGroup, @NonNull AlignTopTextView alignTopTextView, @NonNull RadioButton radioButton, @NonNull DashTextView dashTextView, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull RadioButton radioButton2, @NonNull BaseTextView baseTextView3) {
        this.f81785a = constraintLayout;
        this.f81786b = buySellRatioView;
        this.f81787c = kcPrecisionTextView;
        this.f81788d = linearLayout;
        this.f81789e = frameLayout;
        this.f81790f = appCompatImageView;
        this.f81791g = orderBookShowView;
        this.f81792h = appCompatImageView2;
        this.f81793i = appCompatImageView3;
        this.f81794j = leverageSettingBar;
        this.f81795k = linearLayout2;
        this.f81796l = constraintLayout2;
        this.f81797m = constraintLayout3;
        this.f81798n = focusedRecyclerView;
        this.f81799o = focusedRecyclerView2;
        this.f81800p = radioGroup;
        this.f81801q = alignTopTextView;
        this.f81802r = radioButton;
        this.f81803s = dashTextView;
        this.f81804t = baseTextView;
        this.f81805u = baseTextView2;
        this.f81806v = radioButton2;
        this.f81807w = baseTextView3;
    }
}
