package t20;

import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.core.view.SpotInputProgressView;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.DashTextView;
import com.kubi.resources.widget.TradeInputLayoutProxy;
import com.kubi.spot.R$id;

/* JADX INFO: renamed from: t20.r0 */
/* JADX INFO: compiled from: KucoinViewLimitHoderBinding.java */
/* JADX INFO: loaded from: classes47.dex */
public final class C44663r0 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f99298a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final TradeInputLayoutProxy f99299b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final TradeInputLayoutProxy f99300c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final TradeInputLayoutProxy f99301d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final TradeInputLayoutProxy f99302e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final LinearLayout f99303f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final AppCompatImageView f99304g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final LinearLayout f99305h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final LinearLayout f99306i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final SpotInputProgressView f99307j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final BaseTextView f99308k;

    /* JADX INFO: renamed from: l */
    @NonNull
    public final DashTextView f99309l;

    /* JADX INFO: renamed from: m */
    @NonNull
    public final BaseTextView f99310m;

    /* JADX INFO: renamed from: n */
    @NonNull
    public final BaseTextView f99311n;

    /* JADX INFO: renamed from: o */
    @NonNull
    public final BaseTextView f99312o;

    /* JADX INFO: renamed from: p */
    @NonNull
    public final BaseTextView f99313p;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44663r0 m98802a(@NonNull View view) {
        int i11 = R$id.et_deal_amount;
        TradeInputLayoutProxy tradeInputLayoutProxy = (TradeInputLayoutProxy) ViewBindings.findChildViewById(view, i11);
        if (tradeInputLayoutProxy != null) {
            i11 = R$id.et_limit_price;
            TradeInputLayoutProxy tradeInputLayoutProxy2 = (TradeInputLayoutProxy) ViewBindings.findChildViewById(view, i11);
            if (tradeInputLayoutProxy2 != null) {
                i11 = R$id.et_number;
                TradeInputLayoutProxy tradeInputLayoutProxy3 = (TradeInputLayoutProxy) ViewBindings.findChildViewById(view, i11);
                if (tradeInputLayoutProxy3 != null) {
                    i11 = R$id.et_trigger_price;
                    TradeInputLayoutProxy tradeInputLayoutProxy4 = (TradeInputLayoutProxy) ViewBindings.findChildViewById(view, i11);
                    if (tradeInputLayoutProxy4 != null) {
                        i11 = R$id.fl_limit_type;
                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                        if (linearLayout != null) {
                            i11 = R$id.ivTriangle;
                            AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i11);
                            if (appCompatImageView != null) {
                                i11 = R$id.ll_fee;
                                LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                                if (linearLayout2 != null) {
                                    LinearLayout linearLayout3 = (LinearLayout) view;
                                    i11 = R$id.progress_percent;
                                    SpotInputProgressView spotInputProgressView = (SpotInputProgressView) ViewBindings.findChildViewById(view, i11);
                                    if (spotInputProgressView != null) {
                                        i11 = R$id.tv_currency_total;
                                        BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                        if (baseTextView != null) {
                                            i11 = R$id.tv_fee;
                                            DashTextView dashTextView = (DashTextView) ViewBindings.findChildViewById(view, i11);
                                            if (dashTextView != null) {
                                                i11 = R$id.tv_fee_value;
                                                BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                if (baseTextView2 != null) {
                                                    i11 = R$id.tv_limit_price;
                                                    BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                    if (baseTextView3 != null) {
                                                        i11 = R$id.tv_limit_type;
                                                        BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                        if (baseTextView4 != null) {
                                                            i11 = R$id.tv_trigger_price;
                                                            BaseTextView baseTextView5 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                                            if (baseTextView5 != null) {
                                                                return new C44663r0(linearLayout3, tradeInputLayoutProxy, tradeInputLayoutProxy2, tradeInputLayoutProxy3, tradeInputLayoutProxy4, linearLayout, appCompatImageView, linearLayout2, linearLayout3, spotInputProgressView, baseTextView, dashTextView, baseTextView2, baseTextView3, baseTextView4, baseTextView5);
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
    public LinearLayout getRoot() {
        return this.f99298a;
    }

    public C44663r0(@NonNull LinearLayout linearLayout, @NonNull TradeInputLayoutProxy tradeInputLayoutProxy, @NonNull TradeInputLayoutProxy tradeInputLayoutProxy2, @NonNull TradeInputLayoutProxy tradeInputLayoutProxy3, @NonNull TradeInputLayoutProxy tradeInputLayoutProxy4, @NonNull LinearLayout linearLayout2, @NonNull AppCompatImageView appCompatImageView, @NonNull LinearLayout linearLayout3, @NonNull LinearLayout linearLayout4, @NonNull SpotInputProgressView spotInputProgressView, @NonNull BaseTextView baseTextView, @NonNull DashTextView dashTextView, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3, @NonNull BaseTextView baseTextView4, @NonNull BaseTextView baseTextView5) {
        this.f99298a = linearLayout;
        this.f99299b = tradeInputLayoutProxy;
        this.f99300c = tradeInputLayoutProxy2;
        this.f99301d = tradeInputLayoutProxy3;
        this.f99302e = tradeInputLayoutProxy4;
        this.f99303f = linearLayout2;
        this.f99304g = appCompatImageView;
        this.f99305h = linearLayout3;
        this.f99306i = linearLayout4;
        this.f99307j = spotInputProgressView;
        this.f99308k = baseTextView;
        this.f99309l = dashTextView;
        this.f99310m = baseTextView2;
        this.f99311n = baseTextView3;
        this.f99312o = baseTextView4;
        this.f99313p = baseTextView5;
    }
}
