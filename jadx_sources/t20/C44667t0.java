package t20;

import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.DashTextView;
import com.kubi.resources.widget.TradeInputLayoutProxy;
import com.kubi.spot.R$id;

/* JADX INFO: renamed from: t20.t0 */
/* JADX INFO: compiled from: KucoinViewOcoHolderBinding.java */
/* JADX INFO: loaded from: classes47.dex */
public final class C44667t0 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f99353a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final TradeInputLayoutProxy f99354b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final TradeInputLayoutProxy f99355c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final TradeInputLayoutProxy f99356d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final TradeInputLayoutProxy f99357e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final LinearLayout f99358f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final LinearLayout f99359g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final BaseTextView f99360h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final BaseTextView f99361i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final DashTextView f99362j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final BaseTextView f99363k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final BaseTextView f99364l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final BaseTextView f99365m;

    /* JADX INFO: renamed from: n */
    @NonNull
    public final BaseTextView f99366n;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44667t0 m98810a(@NonNull View view) {
        int i11 = R$id.et_limit_price;
        TradeInputLayoutProxy tradeInputLayoutProxy = (TradeInputLayoutProxy) ViewBindings.findChildViewById(view, i11);
        if (tradeInputLayoutProxy != null) {
            i11 = R$id.et_number;
            TradeInputLayoutProxy tradeInputLayoutProxy2 = (TradeInputLayoutProxy) ViewBindings.findChildViewById(view, i11);
            if (tradeInputLayoutProxy2 != null) {
                i11 = R$id.et_stop_limit_price;
                TradeInputLayoutProxy tradeInputLayoutProxy3 = (TradeInputLayoutProxy) ViewBindings.findChildViewById(view, i11);
                if (tradeInputLayoutProxy3 != null) {
                    i11 = R$id.et_stop_price;
                    TradeInputLayoutProxy tradeInputLayoutProxy4 = (TradeInputLayoutProxy) ViewBindings.findChildViewById(view, i11);
                    if (tradeInputLayoutProxy4 != null) {
                        i11 = R$id.ll_fee;
                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                        if (linearLayout != null) {
                            LinearLayout linearLayout2 = (LinearLayout) view;
                            i11 = R$id.tvBottomBuy;
                            BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                            if (baseTextView != null) {
                                i11 = R$id.tvChaseBuy;
                                BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                if (baseTextView2 != null) {
                                    i11 = R$id.tv_fee;
                                    DashTextView dashTextView = (DashTextView) ViewBindings.findChildViewById(view, i11);
                                    if (dashTextView != null) {
                                        i11 = R$id.tv_fee_value;
                                        BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                        if (baseTextView3 != null) {
                                            i11 = R$id.tv_limit_price;
                                            BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                            if (baseTextView4 != null) {
                                                i11 = R$id.tv_stop_limit_price;
                                                BaseTextView baseTextView5 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                if (baseTextView5 != null) {
                                                    i11 = R$id.tv_stop_price;
                                                    BaseTextView baseTextView6 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                    if (baseTextView6 != null) {
                                                        return new C44667t0(linearLayout2, tradeInputLayoutProxy, tradeInputLayoutProxy2, tradeInputLayoutProxy3, tradeInputLayoutProxy4, linearLayout, linearLayout2, baseTextView, baseTextView2, dashTextView, baseTextView3, baseTextView4, baseTextView5, baseTextView6);
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
    public LinearLayout getRoot() {
        return this.f99353a;
    }

    public C44667t0(@NonNull LinearLayout linearLayout, @NonNull TradeInputLayoutProxy tradeInputLayoutProxy, @NonNull TradeInputLayoutProxy tradeInputLayoutProxy2, @NonNull TradeInputLayoutProxy tradeInputLayoutProxy3, @NonNull TradeInputLayoutProxy tradeInputLayoutProxy4, @NonNull LinearLayout linearLayout2, @NonNull LinearLayout linearLayout3, @NonNull BaseTextView baseTextView, @NonNull BaseTextView baseTextView2, @NonNull DashTextView dashTextView, @NonNull BaseTextView baseTextView3, @NonNull BaseTextView baseTextView4, @NonNull BaseTextView baseTextView5, @NonNull BaseTextView baseTextView6) {
        this.f99353a = linearLayout;
        this.f99354b = tradeInputLayoutProxy;
        this.f99355c = tradeInputLayoutProxy2;
        this.f99356d = tradeInputLayoutProxy3;
        this.f99357e = tradeInputLayoutProxy4;
        this.f99358f = linearLayout2;
        this.f99359g = linearLayout3;
        this.f99360h = baseTextView;
        this.f99361i = baseTextView2;
        this.f99362j = dashTextView;
        this.f99363k = baseTextView3;
        this.f99364l = baseTextView4;
        this.f99365m = baseTextView5;
        this.f99366n = baseTextView6;
    }
}
