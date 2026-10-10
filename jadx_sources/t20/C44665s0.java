package t20;

import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.kubi.core.view.SpotInputProgressView;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.DashTextView;
import com.kubi.resources.widget.TradeInputLayoutProxy;
import com.kubi.spot.R$id;

/* JADX INFO: renamed from: t20.s0 */
/* JADX INFO: compiled from: KucoinViewMarketHoderBinding.java */
/* JADX INFO: loaded from: classes47.dex */
public final class C44665s0 implements ViewBinding {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final LinearLayout f99321a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final TradeInputLayoutProxy f99322b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final TradeInputLayoutProxy f99323c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final LinearLayout f99324d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final LinearLayout f99325e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final SpotInputProgressView f99326f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final BaseTextView f99327g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final DashTextView f99328h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final BaseTextView f99329i;

    /* JADX INFO: renamed from: j */
    @NonNull
    public final BaseTextView f99330j;

    /* JADX INFO: renamed from: k */
    @NonNull
    public final BaseTextView f99331k;

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C44665s0 m98806a(@NonNull View view) {
        int i11 = R$id.et_number;
        TradeInputLayoutProxy tradeInputLayoutProxy = (TradeInputLayoutProxy) ViewBindings.findChildViewById(view, i11);
        if (tradeInputLayoutProxy != null) {
            i11 = R$id.et_trigger_price;
            TradeInputLayoutProxy tradeInputLayoutProxy2 = (TradeInputLayoutProxy) ViewBindings.findChildViewById(view, i11);
            if (tradeInputLayoutProxy2 != null) {
                i11 = R$id.ll_fee;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i11);
                if (linearLayout != null) {
                    LinearLayout linearLayout2 = (LinearLayout) view;
                    i11 = R$id.progress_percent;
                    SpotInputProgressView spotInputProgressView = (SpotInputProgressView) ViewBindings.findChildViewById(view, i11);
                    if (spotInputProgressView != null) {
                        i11 = R$id.tvErrorTip;
                        BaseTextView baseTextView = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                        if (baseTextView != null) {
                            i11 = R$id.tv_fee;
                            DashTextView dashTextView = (DashTextView) ViewBindings.findChildViewById(view, i11);
                            if (dashTextView != null) {
                                i11 = R$id.tv_fee_value;
                                BaseTextView baseTextView2 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                if (baseTextView2 != null) {
                                    i11 = R$id.tv_market_tips;
                                    BaseTextView baseTextView3 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                    if (baseTextView3 != null) {
                                        i11 = R$id.tv_trigger_price;
                                        BaseTextView baseTextView4 = (BaseTextView) ViewBindings.findChildViewById(view, i11);
                                        if (baseTextView4 != null) {
                                            return new C44665s0(linearLayout2, tradeInputLayoutProxy, tradeInputLayoutProxy2, linearLayout, linearLayout2, spotInputProgressView, baseTextView, dashTextView, baseTextView2, baseTextView3, baseTextView4);
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
        return this.f99321a;
    }

    public C44665s0(@NonNull LinearLayout linearLayout, @NonNull TradeInputLayoutProxy tradeInputLayoutProxy, @NonNull TradeInputLayoutProxy tradeInputLayoutProxy2, @NonNull LinearLayout linearLayout2, @NonNull LinearLayout linearLayout3, @NonNull SpotInputProgressView spotInputProgressView, @NonNull BaseTextView baseTextView, @NonNull DashTextView dashTextView, @NonNull BaseTextView baseTextView2, @NonNull BaseTextView baseTextView3, @NonNull BaseTextView baseTextView4) {
        this.f99321a = linearLayout;
        this.f99322b = tradeInputLayoutProxy;
        this.f99323c = tradeInputLayoutProxy2;
        this.f99324d = linearLayout2;
        this.f99325e = linearLayout3;
        this.f99326f = spotInputProgressView;
        this.f99327g = baseTextView;
        this.f99328h = dashTextView;
        this.f99329i = baseTextView2;
        this.f99330j = baseTextView3;
        this.f99331k = baseTextView4;
    }
}
