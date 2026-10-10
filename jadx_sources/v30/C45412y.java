package v30;

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
import com.kubi.resources.widget.AlignTopTextView;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.BuySellRatioView;
import com.kubi.resources.widget.DashTextView;
import com.kubi.resources.widget.FocusedRecyclerView;
import com.kubi.resources.widget.OrderBookShowView;
import com.kubi.resources.widget.ShowHideTextView;
import com.kubi.sdk.widget.shape.view.ShapeTextView;
import com.kubi.tradecorebiz.R$id;

/* JADX INFO: renamed from: v30.y */
/* JADX INFO: compiled from: FragmentTradeVerticalBinding.java */
/* JADX INFO: loaded from: classes49.dex */
public final class C45412y implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final ConstraintLayout f102397a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final BuySellRatioView f102398b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final ShapeTextView f102399c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final ConstraintLayout f102400d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final FrameLayout f102401e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final AppCompatImageView f102402f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final OrderBookShowView f102403g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final AppCompatImageView f102404h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final AppCompatImageView f102405i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final LinearLayout f102406j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final ConstraintLayout f102407k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final ConstraintLayout f102408l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final FocusedRecyclerView f102409m;

    /* JADX INFO: renamed from: n */
    @NonNull
    public final FocusedRecyclerView f102410n;

    /* JADX INFO: renamed from: o */
    @NonNull
    public final RadioGroup f102411o;

    /* JADX INFO: renamed from: p */
    @NonNull
    public final AlignTopTextView f102412p;

    /* JADX INFO: renamed from: q */
    @NonNull
    public final RadioButton f102413q;

    /* JADX INFO: renamed from: r */
    @NonNull
    public final DashTextView f102414r;

    /* JADX INFO: renamed from: s */
    @NonNull
    public final BaseTextView f102415s;

    /* JADX INFO: renamed from: t */
    @NonNull
    public final BaseTextView f102416t;

    /* JADX INFO: renamed from: u */
    @NonNull
    public final RadioButton f102417u;

    /* JADX INFO: renamed from: v */
    @NonNull
    public final ShowHideTextView f102418v;

    /* JADX INFO: renamed from: w */
    @NonNull
    public final BaseTextView f102419w;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C45412y m100361a(@NonNull View view) {
        int i11 = R$id.buy_sell_ratio_view;
        BuySellRatioView buySellRatioView = (BuySellRatioView) ViewBindings.findChildViewById(view, i11);
        if (buySellRatioView != null) {
            i11 = R$id.cb_orderbook_select_precision;
            ShapeTextView shapeTextView = (ShapeTextView) ViewBindings.findChildViewById(view, i11);
            if (shapeTextView != null) {
                i11 = R$id.fl_price_type;
                ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i11);
                if (constraintLayout != null) {
                    i11 = R$id.fl_trade_type_container;
                    FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i11);
                    if (frameLayout != null) {
                        i11 = R$id.iv_etf_icon;
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
                                        i11 = R$id.ll_bottom;
                                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                                        if (linearLayout != null) {
                                            i11 = R$id.ll_center;
                                            ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, i11);
                                            if (constraintLayout2 != null) {
                                                ConstraintLayout constraintLayout3 = (ConstraintLayout) view;
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
                                                                                    i11 = R$id.tv_trade_currency;
                                                                                    ShowHideTextView showHideTextView = (ShowHideTextView) ViewBindings.findChildViewById(view, i11);
                                                                                    if (showHideTextView != null) {
                                                                                        i11 = R$id.tv_trade_price;
                                                                                        BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                                                        if (baseTextView3 != null) {
                                                                                            return new C45412y(constraintLayout3, buySellRatioView, shapeTextView, constraintLayout, frameLayout, appCompatImageView, orderBookShowView, appCompatImageView2, appCompatImageView3, linearLayout, constraintLayout2, constraintLayout3, focusedRecyclerView, focusedRecyclerView2, radioGroup, alignTopTextView, radioButton, dashTextView, baseTextView, baseTextView2, radioButton2, showHideTextView, baseTextView3);
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
        return this.f102397a;
    }

    public C45412y(@NonNull ConstraintLayout constraintLayout, @NonNull BuySellRatioView buySellRatioView, @NonNull ShapeTextView shapeTextView, @NonNull ConstraintLayout constraintLayout2, @NonNull FrameLayout frameLayout, @NonNull AppCompatImageView appCompatImageView, @NonNull OrderBookShowView orderBookShowView, @NonNull AppCompatImageView appCompatImageView2, @NonNull AppCompatImageView appCompatImageView3, @NonNull LinearLayout linearLayout, @NonNull ConstraintLayout constraintLayout3, @NonNull ConstraintLayout constraintLayout4, @NonNull FocusedRecyclerView focusedRecyclerView, @NonNull FocusedRecyclerView focusedRecyclerView2, @NonNull RadioGroup radioGroup, @NonNull AlignTopTextView alignTopTextView, @NonNull RadioButton radioButton, @NonNull DashTextView dashTextView, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull RadioButton radioButton2, @NonNull ShowHideTextView showHideTextView, @NonNull BaseTextView baseTextView3) {
        this.f102397a = constraintLayout;
        this.f102398b = buySellRatioView;
        this.f102399c = shapeTextView;
        this.f102400d = constraintLayout2;
        this.f102401e = frameLayout;
        this.f102402f = appCompatImageView;
        this.f102403g = orderBookShowView;
        this.f102404h = appCompatImageView2;
        this.f102405i = appCompatImageView3;
        this.f102406j = linearLayout;
        this.f102407k = constraintLayout3;
        this.f102408l = constraintLayout4;
        this.f102409m = focusedRecyclerView;
        this.f102410n = focusedRecyclerView2;
        this.f102411o = radioGroup;
        this.f102412p = alignTopTextView;
        this.f102413q = radioButton;
        this.f102414r = dashTextView;
        this.f102415s = baseTextView;
        this.f102416t = baseTextView2;
        this.f102417u = radioButton2;
        this.f102418v = showHideTextView;
        this.f102419w = baseTextView3;
    }
}
